// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.view.CollapsibleActionView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat, SuggestionsAdapter, AppCompatAutoCompleteTextView

public class SearchView extends LinearLayoutCompat
    implements CollapsibleActionView
{
    private static class AutoCompleteTextViewReflector
    {

        private Method doAfterTextChanged;
        private Method doBeforeTextChanged;
        private Method ensureImeVisible;
        private Method showSoftInputUnchecked;

        void doAfterTextChanged(AutoCompleteTextView autocompletetextview)
        {
            if (doAfterTextChanged == null)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            doAfterTextChanged.invoke(autocompletetextview, new Object[0]);
            return;
            autocompletetextview;
        }

        void doBeforeTextChanged(AutoCompleteTextView autocompletetextview)
        {
            if (doBeforeTextChanged == null)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            doBeforeTextChanged.invoke(autocompletetextview, new Object[0]);
            return;
            autocompletetextview;
        }

        void ensureImeVisible(AutoCompleteTextView autocompletetextview, boolean flag)
        {
            if (ensureImeVisible == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            ensureImeVisible.invoke(autocompletetextview, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
            autocompletetextview;
        }

        AutoCompleteTextViewReflector()
        {
            try
            {
                doBeforeTextChanged = android/widget/AutoCompleteTextView.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                doBeforeTextChanged.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception3) { }
            try
            {
                doAfterTextChanged = android/widget/AutoCompleteTextView.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                doAfterTextChanged.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception2) { }
            try
            {
                ensureImeVisible = android/widget/AutoCompleteTextView.getMethod("ensureImeVisible", new Class[] {
                    Boolean.TYPE
                });
                ensureImeVisible.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception1) { }
            try
            {
                showSoftInputUnchecked = android/view/inputmethod/InputMethodManager.getMethod("showSoftInputUnchecked", new Class[] {
                    Integer.TYPE, android/os/ResultReceiver
                });
                showSoftInputUnchecked.setAccessible(true);
                return;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return;
            }
        }
    }

    public static interface OnCloseListener
    {

        public abstract boolean onClose();
    }

    public static interface OnQueryTextListener
    {

        public abstract boolean onQueryTextSubmit(String s);
    }

    public static interface OnSuggestionListener
    {
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView
    {

        private SearchView mSearchView;
        private int mThreshold;

        public boolean enoughToFilter()
        {
            return mThreshold <= 0 || super.enoughToFilter();
        }

        protected void onFocusChanged(boolean flag, int i, Rect rect)
        {
            super.onFocusChanged(flag, i, rect);
            mSearchView.onTextFocusChanged();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyevent)
        {
            if (i == 4)
            {
                if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
                    if (dispatcherstate != null)
                    {
                        dispatcherstate.startTracking(keyevent, this);
                    }
                    return true;
                }
                if (keyevent.getAction() == 1)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate1 = getKeyDispatcherState();
                    if (dispatcherstate1 != null)
                    {
                        dispatcherstate1.handleUpEvent(keyevent);
                    }
                    if (keyevent.isTracking() && !keyevent.isCanceled())
                    {
                        mSearchView.clearFocus();
                        mSearchView.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyevent);
        }

        public void onWindowFocusChanged(boolean flag)
        {
            super.onWindowFocusChanged(flag);
            if (flag && mSearchView.hasFocus() && getVisibility() == 0)
            {
                ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.isLandscapeMode(getContext()))
                {
                    SearchView.HIDDEN_METHOD_INVOKER.ensureImeVisible(this, true);
                }
            }
        }

        public void performCompletion()
        {
        }

        protected void replaceText(CharSequence charsequence)
        {
        }

        void setSearchView(SearchView searchview)
        {
            mSearchView = searchview;
        }

        public void setThreshold(int i)
        {
            super.setThreshold(i);
            mThreshold = i;
        }

        public SearchAutoComplete(Context context)
        {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
            this(context, attributeset, android.support.v7.appcompat.R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i)
        {
            super(context, attributeset, i);
            mThreshold = getThreshold();
        }
    }


    static final AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER = new AutoCompleteTextViewReflector();
    private static final boolean IS_AT_LEAST_FROYO;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    private final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private boolean mExpandedInActionView;
    private final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private OnCloseListener mOnCloseListener;
    private OnQueryTextListener mOnQueryChangeListener;
    private android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private android.view.View.OnClickListener mOnSearchClickListener;
    private OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    private final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final SearchAutoComplete mSearchSrcTextView;
    private SearchableInfo mSearchable;
    private Runnable mShowImeRunnable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    private CursorAdapter mSuggestionsAdapter;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    private final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    private Intent createIntent(String s, Uri uri, String s1, String s2, int i, String s3)
    {
        s = new Intent(s);
        s.addFlags(0x10000000);
        if (uri != null)
        {
            s.setData(uri);
        }
        s.putExtra("user_query", mUserQuery);
        if (s2 != null)
        {
            s.putExtra("query", s2);
        }
        if (s1 != null)
        {
            s.putExtra("intent_extra_data_key", s1);
        }
        if (mAppSearchData != null)
        {
            s.putExtra("app_data", mAppSearchData);
        }
        if (i != 0)
        {
            s.putExtra("action_key", i);
            s.putExtra("action_msg", s3);
        }
        if (IS_AT_LEAST_FROYO)
        {
            s.setComponent(mSearchable.getSearchActivity());
        }
        return s;
    }

    private void dismissSuggestions()
    {
        mSearchSrcTextView.dismissDropDown();
    }

    private void forceSuggestionQuery()
    {
        HIDDEN_METHOD_INVOKER.doBeforeTextChanged(mSearchSrcTextView);
        HIDDEN_METHOD_INVOKER.doAfterTextChanged(mSearchSrcTextView);
    }

    private CharSequence getDecoratedHint(CharSequence charsequence)
    {
        if (!mIconifiedByDefault || mSearchHintIcon == null)
        {
            return charsequence;
        } else
        {
            int i = (int)((double)mSearchSrcTextView.getTextSize() * 1.25D);
            mSearchHintIcon.setBounds(0, 0, i, i);
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
            spannablestringbuilder.setSpan(new ImageSpan(mSearchHintIcon), 1, 2, 33);
            spannablestringbuilder.append(charsequence);
            return spannablestringbuilder;
        }
    }

    private int getPreferredWidth()
    {
        return getContext().getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_search_view_preferred_width);
    }

    private boolean hasVoiceSearch()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (mSearchable == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!mSearchable.getVoiceSearchEnabled()) goto _L2; else goto _L3
_L3:
        Intent intent = null;
        if (!mSearchable.getVoiceSearchLaunchWebSearch()) goto _L5; else goto _L4
_L4:
        intent = mVoiceWebSearchIntent;
_L7:
        flag = flag1;
        if (intent != null)
        {
            flag = flag1;
            if (getContext().getPackageManager().resolveActivity(intent, 0x10000) != null)
            {
                flag = true;
            }
        }
_L2:
        return flag;
_L5:
        if (mSearchable.getVoiceSearchLaunchRecognizer())
        {
            intent = mVoiceAppSearchIntent;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean isLandscapeMode(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean isSubmitAreaEnabled()
    {
        return (mSubmitButtonEnabled || mVoiceButtonEnabled) && !isIconified();
    }

    private void launchQuerySearch(int i, String s, String s1)
    {
        s = createIntent("android.intent.action.SEARCH", null, null, s1, i, s);
        getContext().startActivity(s);
    }

    private void onCloseClicked()
    {
        if (TextUtils.isEmpty(mSearchSrcTextView.getText()))
        {
            if (mIconifiedByDefault && (mOnCloseListener == null || !mOnCloseListener.onClose()))
            {
                clearFocus();
                updateViewsVisibility(true);
            }
            return;
        } else
        {
            mSearchSrcTextView.setText("");
            mSearchSrcTextView.requestFocus();
            setImeVisibility(true);
            return;
        }
    }

    private void onSearchClicked()
    {
        updateViewsVisibility(false);
        mSearchSrcTextView.requestFocus();
        setImeVisibility(true);
        if (mOnSearchClickListener != null)
        {
            mOnSearchClickListener.onClick(this);
        }
    }

    private void onSubmitQuery()
    {
        android.text.Editable editable = mSearchSrcTextView.getText();
        if (editable != null && TextUtils.getTrimmedLength(editable) > 0 && (mOnQueryChangeListener == null || !mOnQueryChangeListener.onQueryTextSubmit(editable.toString())))
        {
            if (mSearchable != null)
            {
                launchQuerySearch(0, null, editable.toString());
            }
            setImeVisibility(false);
            dismissSuggestions();
        }
    }

    private void postUpdateFocusedState()
    {
        post(mUpdateDrawableStateRunnable);
    }

    private void setImeVisibility(boolean flag)
    {
        if (flag)
        {
            post(mShowImeRunnable);
        } else
        {
            removeCallbacks(mShowImeRunnable);
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
    }

    private void setQuery(CharSequence charsequence)
    {
        mSearchSrcTextView.setText(charsequence);
        SearchAutoComplete searchautocomplete = mSearchSrcTextView;
        int i;
        if (TextUtils.isEmpty(charsequence))
        {
            i = 0;
        } else
        {
            i = charsequence.length();
        }
        searchautocomplete.setSelection(i);
    }

    private void updateCloseButton()
    {
        boolean flag2 = true;
        boolean flag1 = false;
        ImageView imageview;
        Drawable drawable;
        boolean flag;
        int i;
        if (!TextUtils.isEmpty(mSearchSrcTextView.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = ((flag2) ? 1 : 0);
        if (!flag)
        {
            if (mIconifiedByDefault && !mExpandedInActionView)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
        }
        imageview = mCloseButton;
        if (i != 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
        drawable = mCloseButton.getDrawable();
        if (drawable != null)
        {
            int ai[];
            if (flag)
            {
                ai = ENABLED_STATE_SET;
            } else
            {
                ai = EMPTY_STATE_SET;
            }
            drawable.setState(ai);
        }
    }

    private void updateQueryHint()
    {
        CharSequence charsequence = getQueryHint();
        SearchAutoComplete searchautocomplete = mSearchSrcTextView;
        Object obj = charsequence;
        if (charsequence == null)
        {
            obj = "";
        }
        searchautocomplete.setHint(getDecoratedHint(((CharSequence) (obj))));
    }

    private void updateSearchAutoComplete()
    {
        boolean flag = true;
        mSearchSrcTextView.setThreshold(mSearchable.getSuggestThreshold());
        mSearchSrcTextView.setImeOptions(mSearchable.getImeOptions());
        int j = mSearchable.getInputType();
        int i = j;
        if ((j & 0xf) == 1)
        {
            j &= 0xfffeffff;
            i = j;
            if (mSearchable.getSuggestAuthority() != null)
            {
                i = j | 0x10000 | 0x80000;
            }
        }
        mSearchSrcTextView.setInputType(i);
        if (mSuggestionsAdapter != null)
        {
            mSuggestionsAdapter.changeCursor(null);
        }
        if (mSearchable.getSuggestAuthority() != null)
        {
            mSuggestionsAdapter = new SuggestionsAdapter(getContext(), this, mSearchable, mOutsideDrawablesCache);
            mSearchSrcTextView.setAdapter(mSuggestionsAdapter);
            SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
            byte byte0 = flag;
            if (mQueryRefinement)
            {
                byte0 = 2;
            }
            suggestionsadapter.setQueryRefinement(byte0);
        }
    }

    private void updateSubmitArea()
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!isSubmitAreaEnabled())
            {
                break label0;
            }
            if (mGoButton.getVisibility() != 0)
            {
                byte0 = byte1;
                if (mVoiceButton.getVisibility() != 0)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        mSubmitArea.setVisibility(byte0);
    }

    private void updateSubmitButton(boolean flag)
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!mSubmitButtonEnabled)
            {
                break label0;
            }
            byte0 = byte1;
            if (!isSubmitAreaEnabled())
            {
                break label0;
            }
            byte0 = byte1;
            if (!hasFocus())
            {
                break label0;
            }
            if (!flag)
            {
                byte0 = byte1;
                if (mVoiceButtonEnabled)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        mGoButton.setVisibility(byte0);
    }

    private void updateViewsVisibility(boolean flag)
    {
        boolean flag2 = true;
        byte byte0 = 8;
        mIconified = flag;
        Object obj;
        int i;
        boolean flag1;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        if (!TextUtils.isEmpty(mSearchSrcTextView.getText()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mSearchButton.setVisibility(i);
        updateSubmitButton(flag1);
        obj = mSearchEditFrame;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        obj = mCollapsedIcon;
        if (mIconifiedByDefault)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((ImageView) (obj)).setVisibility(i);
        updateCloseButton();
        if (!flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        updateVoiceButton(flag);
        updateSubmitArea();
    }

    private void updateVoiceButton(boolean flag)
    {
        byte byte1 = 8;
        byte byte0 = byte1;
        if (mVoiceButtonEnabled)
        {
            byte0 = byte1;
            if (!isIconified())
            {
                byte0 = byte1;
                if (flag)
                {
                    byte0 = 0;
                    mGoButton.setVisibility(8);
                }
            }
        }
        mVoiceButton.setVisibility(byte0);
    }

    public void clearFocus()
    {
        mClearingFocus = true;
        setImeVisibility(false);
        super.clearFocus();
        mSearchSrcTextView.clearFocus();
        mClearingFocus = false;
    }

    public int getImeOptions()
    {
        return mSearchSrcTextView.getImeOptions();
    }

    public int getInputType()
    {
        return mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth()
    {
        return mMaxWidth;
    }

    public CharSequence getQuery()
    {
        return mSearchSrcTextView.getText();
    }

    public CharSequence getQueryHint()
    {
        if (mQueryHint != null)
        {
            return mQueryHint;
        }
        if (IS_AT_LEAST_FROYO && mSearchable != null && mSearchable.getHintId() != 0)
        {
            return getContext().getText(mSearchable.getHintId());
        } else
        {
            return mDefaultQueryHint;
        }
    }

    int getSuggestionCommitIconResId()
    {
        return mSuggestionCommitIconResId;
    }

    int getSuggestionRowLayout()
    {
        return mSuggestionRowLayout;
    }

    public CursorAdapter getSuggestionsAdapter()
    {
        return mSuggestionsAdapter;
    }

    public boolean isIconified()
    {
        return mIconified;
    }

    public void onActionViewCollapsed()
    {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        mSearchSrcTextView.setImeOptions(mCollapsedImeOptions);
        mExpandedInActionView = false;
    }

    public void onActionViewExpanded()
    {
        if (mExpandedInActionView)
        {
            return;
        } else
        {
            mExpandedInActionView = true;
            mCollapsedImeOptions = mSearchSrcTextView.getImeOptions();
            mSearchSrcTextView.setImeOptions(mCollapsedImeOptions | 0x2000000);
            mSearchSrcTextView.setText("");
            setIconified(false);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(mUpdateDrawableStateRunnable);
        post(mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        if (isIconified())
        {
            super.onMeasure(i, j);
            return;
        }
        l = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        l;
        JVM INSTR lookupswitch 3: default 60
    //                   -2147483648: 75
    //                   0: 127
    //                   1073741824: 106;
           goto _L1 _L2 _L3 _L4
_L1:
        i = k;
_L6:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
        return;
_L2:
        if (mMaxWidth > 0)
        {
            i = Math.min(mMaxWidth, k);
        } else
        {
            i = Math.min(getPreferredWidth(), k);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = k;
        if (mMaxWidth > 0)
        {
            i = Math.min(mMaxWidth, k);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mMaxWidth > 0)
        {
            i = mMaxWidth;
        } else
        {
            i = getPreferredWidth();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    void onQueryRefine(CharSequence charsequence)
    {
        setQuery(charsequence);
    }

    void onTextFocusChanged()
    {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (mSearchSrcTextView.hasFocus())
        {
            forceSuggestionQuery();
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        postUpdateFocusedState();
    }

    public boolean requestFocus(int i, Rect rect)
    {
        boolean flag;
        if (mClearingFocus)
        {
            flag = false;
        } else
        {
            if (!isFocusable())
            {
                return false;
            }
            if (!isIconified())
            {
                boolean flag1 = mSearchSrcTextView.requestFocus(i, rect);
                flag = flag1;
                if (flag1)
                {
                    updateViewsVisibility(false);
                    return flag1;
                }
            } else
            {
                return super.requestFocus(i, rect);
            }
        }
        return flag;
    }

    public void setAppSearchData(Bundle bundle)
    {
        mAppSearchData = bundle;
    }

    public void setIconified(boolean flag)
    {
        if (flag)
        {
            onCloseClicked();
            return;
        } else
        {
            onSearchClicked();
            return;
        }
    }

    public void setIconifiedByDefault(boolean flag)
    {
        if (mIconifiedByDefault == flag)
        {
            return;
        } else
        {
            mIconifiedByDefault = flag;
            updateViewsVisibility(flag);
            updateQueryHint();
            return;
        }
    }

    public void setImeOptions(int i)
    {
        mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i)
    {
        mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i)
    {
        mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener oncloselistener)
    {
        mOnCloseListener = oncloselistener;
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        mOnQueryTextFocusChangeListener = onfocuschangelistener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onquerytextlistener)
    {
        mOnQueryChangeListener = onquerytextlistener;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
    {
        mOnSearchClickListener = onclicklistener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onsuggestionlistener)
    {
        mOnSuggestionListener = onsuggestionlistener;
    }

    public void setQuery(CharSequence charsequence, boolean flag)
    {
        mSearchSrcTextView.setText(charsequence);
        if (charsequence != null)
        {
            mSearchSrcTextView.setSelection(mSearchSrcTextView.length());
            mUserQuery = charsequence;
        }
        if (flag && !TextUtils.isEmpty(charsequence))
        {
            onSubmitQuery();
        }
    }

    public void setQueryHint(CharSequence charsequence)
    {
        mQueryHint = charsequence;
        updateQueryHint();
    }

    public void setQueryRefinementEnabled(boolean flag)
    {
        mQueryRefinement = flag;
        if (mSuggestionsAdapter instanceof SuggestionsAdapter)
        {
            SuggestionsAdapter suggestionsadapter = (SuggestionsAdapter)mSuggestionsAdapter;
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            suggestionsadapter.setQueryRefinement(byte0);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableinfo)
    {
        mSearchable = searchableinfo;
        if (mSearchable != null)
        {
            if (IS_AT_LEAST_FROYO)
            {
                updateSearchAutoComplete();
            }
            updateQueryHint();
        }
        boolean flag;
        if (IS_AT_LEAST_FROYO && hasVoiceSearch())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mVoiceButtonEnabled = flag;
        if (mVoiceButtonEnabled)
        {
            mSearchSrcTextView.setPrivateImeOptions("nm");
        }
        updateViewsVisibility(isIconified());
    }

    public void setSubmitButtonEnabled(boolean flag)
    {
        mSubmitButtonEnabled = flag;
        updateViewsVisibility(isIconified());
    }

    public void setSuggestionsAdapter(CursorAdapter cursoradapter)
    {
        mSuggestionsAdapter = cursoradapter;
        mSearchSrcTextView.setAdapter(mSuggestionsAdapter);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_AT_LEAST_FROYO = flag;
    }

}
