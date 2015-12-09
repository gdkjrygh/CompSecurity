// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.ViewUtils;
import android.support.v7.view.CollapsibleActionView;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat, SuggestionsAdapter, AppCompatAutoCompleteTextView

public class SearchView extends LinearLayoutCompat
    implements CollapsibleActionView
{
    private class SearchAutoComplete extends AppCompatAutoCompleteTextView
    {

        SearchView mSearchView;
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
                        mSearchView.setImeVisibility();
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
                    SearchView.HIDDEN_METHOD_INVOKER._mth3d4581ed(this);
                }
            }
        }

        public void performCompletion()
        {
        }

        protected void replaceText(CharSequence charsequence)
        {
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
            this(context, attributeset, 0x7f01014c);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i)
        {
            super(context, attributeset, i);
            mThreshold = getThreshold();
        }
    }

    private class OnSuggestionListener
    {

        public abstract boolean onSuggestionClick$134632();

        public abstract boolean onSuggestionSelect$134632();
    }

    private class OnQueryTextListener
    {

        public abstract boolean onQueryTextChange(String s);

        public abstract boolean onQueryTextSubmit(String s);
    }

    private static final class AutoCompleteTextViewReflector
    {

        Method doAfterTextChanged;
        Method doBeforeTextChanged;
        private Method ensureImeVisible;
        Method showSoftInputUnchecked;

        final void ensureImeVisible$3d4581ed(AutoCompleteTextView autocompletetextview)
        {
            if (ensureImeVisible == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            ensureImeVisible.invoke(autocompletetextview, new Object[] {
                Boolean.valueOf(true)
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


    static final AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER = new AutoCompleteTextViewReflector();
    private static final boolean IS_AT_LEAST_FROYO;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    private final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    private final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final android.view.View.OnClickListener mOnClickListener;
    private OnCloseListener mOnCloseListener;
    private final android.widget.TextView.OnEditorActionListener mOnEditorActionListener;
    private final android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    private final android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private OnQueryTextListener mOnQueryChangeListener;
    private android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private android.view.View.OnClickListener mOnSearchClickListener;
    private OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable = new Runnable() {

        final SearchView this$0;

        public final void run()
        {
            if (mSuggestionsAdapter != null && (mSuggestionsAdapter instanceof SuggestionsAdapter))
            {
                mSuggestionsAdapter.changeCursor(null);
            }
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    private final SearchAutoComplete mSearchSrcTextView;
    private SearchableInfo mSearchable;
    private Runnable mShowImeRunnable = new Runnable() {

        final SearchView this$0;

        public final void run()
        {
            InputMethodManager inputmethodmanager;
            SearchView searchview;
            AutoCompleteTextViewReflector autocompletetextviewreflector;
            inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager == null)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            autocompletetextviewreflector = SearchView.HIDDEN_METHOD_INVOKER;
            searchview = SearchView.this;
            if (autocompletetextviewreflector.showSoftInputUnchecked == null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            autocompletetextviewreflector.showSoftInputUnchecked.invoke(inputmethodmanager, new Object[] {
                Integer.valueOf(0), null
            });
            return;
            Exception exception;
            exception;
            inputmethodmanager.showSoftInput(searchview, 0);
            return;
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    final int mSuggestionCommitIconResId;
    final int mSuggestionRowLayout;
    private CursorAdapter mSuggestionsAdapter;
    android.view.View.OnKeyListener mTextKeyListener = new android.view.View.OnKeyListener() {

        final SearchView this$0;

        public final boolean onKey(View view, int j, KeyEvent keyevent)
        {
            if (mSearchable != null)
            {
                if (mSearchSrcTextView.isPopupShowing() && mSearchSrcTextView.getListSelection() != -1)
                {
                    return onSuggestionsKey$33ade166(j, keyevent);
                }
                if (!TextUtils.getTrimmedLength(this.getText()) == 0 && KeyEventCompat.hasNoModifiers(keyevent) && keyevent.getAction() == 1 && j == 66)
                {
                    view.cancelLongPress();
                    launchQuerySearch(mSearchSrcTextView.getText().toString());
                    return true;
                }
            }
            return false;
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private TextWatcher mTextWatcher = new TextWatcher() {

        final SearchView this$0;

        public final void afterTextChanged(Editable editable)
        {
        }

        public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
        {
        }

        public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
        {
            boolean flag1 = true;
        }

            
            {
                this$0 = SearchView.this;
                super();
            }
    };
    private final TintManager mTintManager;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    private final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    public SearchView(Context context)
    {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f01012e);
    }

    public SearchView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mUpdateDrawableStateRunnable = new Runnable() {

            final SearchView this$0;

            public final void run()
            {
                SearchView.access$000(SearchView.this);
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOutsideDrawablesCache = new WeakHashMap();
        mOnClickListener = new android.view.View.OnClickListener() {

            final SearchView this$0;

            public final void onClick(View view)
            {
                if (view == mSearchButton)
                {
                    onSearchClicked();
                } else
                {
                    if (view == mCloseButton)
                    {
                        onCloseClicked();
                        return;
                    }
                    if (view == mGoButton)
                    {
                        onSubmitQuery();
                        return;
                    }
                    if (view == mVoiceButton)
                    {
                        SearchView.access$1100(SearchView.this);
                        return;
                    }
                    if (view == mSearchSrcTextView)
                    {
                        forceSuggestionQuery();
                        return;
                    }
                }
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOnEditorActionListener = new android.widget.TextView.OnEditorActionListener() {

            final SearchView this$0;

            public final boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
            {
                onSubmitQuery();
                return true;
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOnItemClickListener = new android.widget.AdapterView.OnItemClickListener() {

            final SearchView this$0;

            public final void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                onItemClicked$3e6d8123(j);
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        mOnItemSelectedListener = new android.widget.AdapterView.OnItemSelectedListener() {

            final SearchView this$0;

            public final void onItemSelected(AdapterView adapterview, View view, int j, long l)
            {
                SearchView.access$1900(SearchView.this, j);
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        };
        attributeset = TintTypedArray.obtainStyledAttributes$1a6c1917(context, attributeset, android.support.v7.appcompat.R.styleable.SearchView, i);
        mTintManager = attributeset.getTintManager();
        LayoutInflater.from(context).inflate(attributeset.getResourceId(4, 0x7f040016), this, true);
        mSearchSrcTextView = (SearchAutoComplete)findViewById(0x7f0d00d4);
        mSearchSrcTextView.mSearchView = this;
        mSearchEditFrame = findViewById(0x7f0d00d1);
        mSearchPlate = findViewById(0x7f0d00d3);
        mSubmitArea = findViewById(0x7f0d00d6);
        mSearchButton = (ImageView)findViewById(0x7f0d00d0);
        mGoButton = (ImageView)findViewById(0x7f0d00d7);
        mCloseButton = (ImageView)findViewById(0x7f0d00d5);
        mVoiceButton = (ImageView)findViewById(0x7f0d00d8);
        mCollapsedIcon = (ImageView)findViewById(0x7f0d00d2);
        mSearchPlate.setBackgroundDrawable(attributeset.getDrawable(15));
        mSubmitArea.setBackgroundDrawable(attributeset.getDrawable(16));
        mSearchButton.setImageDrawable(attributeset.getDrawable(10));
        mGoButton.setImageDrawable(attributeset.getDrawable(9));
        mCloseButton.setImageDrawable(attributeset.getDrawable(8));
        mVoiceButton.setImageDrawable(attributeset.getDrawable(12));
        mCollapsedIcon.setImageDrawable(attributeset.getDrawable(10));
        mSearchHintIcon = attributeset.getDrawable(11);
        mSuggestionRowLayout = attributeset.getResourceId(14, 0x7f040015);
        mSuggestionCommitIconResId = attributeset.getResourceId(13, 0);
        mSearchButton.setOnClickListener(mOnClickListener);
        mCloseButton.setOnClickListener(mOnClickListener);
        mGoButton.setOnClickListener(mOnClickListener);
        mVoiceButton.setOnClickListener(mOnClickListener);
        mSearchSrcTextView.setOnClickListener(mOnClickListener);
        mSearchSrcTextView.addTextChangedListener(mTextWatcher);
        mSearchSrcTextView.setOnEditorActionListener(mOnEditorActionListener);
        mSearchSrcTextView.setOnItemClickListener(mOnItemClickListener);
        mSearchSrcTextView.setOnItemSelectedListener(mOnItemSelectedListener);
        mSearchSrcTextView.setOnKeyListener(mTextKeyListener);
        mSearchSrcTextView.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final SearchView this$0;

            public final void onFocusChange(View view, boolean flag)
            {
                if (mOnQueryTextFocusChangeListener != null)
                {
                    mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, flag);
                }
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        });
        setIconifiedByDefault(attributeset.getBoolean(5, true));
        i = attributeset.getDimensionPixelSize(1, -1);
        if (i != -1)
        {
            setMaxWidth(i);
        }
        mDefaultQueryHint = attributeset.getText(7);
        mQueryHint = attributeset.getText(6);
        i = attributeset.getInt(3, -1);
        if (i != -1)
        {
            setImeOptions(i);
        }
        i = attributeset.getInt(2, -1);
        if (i != -1)
        {
            setInputType(i);
        }
        setFocusable(attributeset.getBoolean(0, true));
        ((TintTypedArray) (attributeset)).mWrapped.recycle();
        mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
        mVoiceWebSearchIntent.addFlags(0x10000000);
        mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        mVoiceAppSearchIntent.addFlags(0x10000000);
        mDropDownAnchor = findViewById(mSearchSrcTextView.getDropDownAnchor());
        if (mDropDownAnchor != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                mDropDownAnchor.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

                    final SearchView this$0;

                    public final void onLayoutChange(View view, int j, int k, int l, int i1, int j1, int k1, 
                            int l1, int i2)
                    {
                        SearchView.access$300(SearchView.this);
                    }

            
            {
                this$0 = SearchView.this;
                super();
            }
                });
            } else
            {
                mDropDownAnchor.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                    final SearchView this$0;

                    public final void onGlobalLayout()
                    {
                        SearchView.access$300(SearchView.this);
                    }

            
            {
                this$0 = SearchView.this;
                super();
            }
                });
            }
        }
        updateViewsVisibility(mIconifiedByDefault);
        updateQueryHint();
    }

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

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String s)
    {
        String s1;
        String s2;
        String s3;
        try
        {
            s1 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_action");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                i = cursor.getPosition();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                i = -1;
            }
            Log.w("SearchView", (new StringBuilder("Search suggestions cursor at row ")).append(i).append(" returned exception.").toString(), s);
            return null;
        }
        s = s1;
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s = s1;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            s = mSearchable.getSuggestIntentAction();
        }
          goto _L2
_L7:
        s2 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_data");
        s = s2;
        if (!IS_AT_LEAST_FROYO)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        s = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        s = mSearchable.getSuggestIntentData();
        s2 = s;
        if (s == null) goto _L4; else goto _L3
_L3:
        s3 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_data_id");
        s2 = s;
        if (s3 == null) goto _L4; else goto _L5
_L5:
        s2 = (new StringBuilder()).append(s).append("/").append(Uri.encode(s3)).toString();
          goto _L4
_L6:
        s2 = SuggestionsAdapter.getColumnString(cursor, "suggest_intent_query");
        return createIntent(s1, s, SuggestionsAdapter.getColumnString(cursor, "suggest_intent_extra_data"), s2, 0, null);
_L9:
        s = Uri.parse(s2);
          goto _L6
_L2:
        s1 = s;
        if (s == null)
        {
            s1 = "android.intent.action.SEARCH";
        }
          goto _L7
_L4:
        if (s2 != null) goto _L9; else goto _L8
_L8:
        s = null;
          goto _L6
    }

    private void forceSuggestionQuery()
    {
        AutoCompleteTextViewReflector autocompletetextviewreflector = HIDDEN_METHOD_INVOKER;
        SearchAutoComplete searchautocomplete = mSearchSrcTextView;
        Exception exception;
        if (autocompletetextviewreflector.doBeforeTextChanged != null)
        {
            try
            {
                autocompletetextviewreflector.doBeforeTextChanged.invoke(searchautocomplete, new Object[0]);
            }
            catch (Exception exception1) { }
        }
        autocompletetextviewreflector = HIDDEN_METHOD_INVOKER;
        searchautocomplete = mSearchSrcTextView;
        if (autocompletetextviewreflector.doAfterTextChanged == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        autocompletetextviewreflector.doAfterTextChanged.invoke(searchautocomplete, new Object[0]);
        return;
        exception;
    }

    private int getPreferredWidth()
    {
        return getContext().getResources().getDimensionPixelSize(0x7f0c0028);
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
        s = createIntent("android.intent.action.SEARCH", null, null, s1, 0, null);
        getContext().startActivity(s);
    }

    private void onCloseClicked()
    {
label0:
        {
label1:
            {
                if (!TextUtils.isEmpty(mSearchSrcTextView.getText()))
                {
                    break label0;
                }
                if (mIconifiedByDefault)
                {
                    if (mOnCloseListener == null)
                    {
                        break label1;
                    }
                    mOnCloseListener.onClose();
                }
                return;
            }
            clearFocus();
            updateViewsVisibility(true);
            return;
        }
        mSearchSrcTextView.setText("");
        mSearchSrcTextView.requestFocus();
        setImeVisibility(true);
    }

    private boolean onItemClicked$3e6d8123(int i)
    {
        boolean flag = false;
        if (mOnSuggestionListener == null || !mOnSuggestionListener._mth134632())
        {
            Object obj = mSuggestionsAdapter.mCursor;
            if (obj != null && ((Cursor) (obj)).moveToPosition(i))
            {
                obj = createIntentFromSuggestion(((Cursor) (obj)), 0, null);
                if (obj != null)
                {
                    try
                    {
                        getContext().startActivity(((Intent) (obj)));
                    }
                    catch (RuntimeException runtimeexception)
                    {
                        Log.e("SearchView", (new StringBuilder("Failed launch activity: ")).append(obj).toString(), runtimeexception);
                    }
                }
            }
            setImeVisibility(false);
            mSearchSrcTextView.dismissDropDown();
            flag = true;
        }
        return flag;
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
        Editable editable = mSearchSrcTextView.getText();
        if (editable != null && TextUtils.getTrimmedLength(editable) > 0 && (mOnQueryChangeListener == null || !mOnQueryChangeListener.onQueryTextSubmit(editable.toString())))
        {
            if (mSearchable != null)
            {
                launchQuerySearch(0, null, editable.toString());
            }
            setImeVisibility(false);
            mSearchSrcTextView.dismissDropDown();
        }
    }

    private boolean onSuggestionsKey$33ade166(int i, KeyEvent keyevent)
    {
        if (mSearchable != null && mSuggestionsAdapter != null && keyevent.getAction() == 0 && KeyEventCompat.hasNoModifiers(keyevent))
        {
            if (i == 66 || i == 84 || i == 61)
            {
                return onItemClicked$3e6d8123(mSearchSrcTextView.getListSelection());
            }
            if (i == 21 || i == 22)
            {
                if (i == 21)
                {
                    i = 0;
                } else
                {
                    i = mSearchSrcTextView.length();
                }
                mSearchSrcTextView.setSelection(i);
                mSearchSrcTextView.setListSelection(0);
                mSearchSrcTextView.clearListSelection();
                HIDDEN_METHOD_INVOKER._mth3d4581ed(mSearchSrcTextView);
                return true;
            }
            if (i == 19 && mSearchSrcTextView.getListSelection() == 0)
            {
                return false;
            }
        }
        return false;
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
        Object obj1 = getQueryHint();
        SearchAutoComplete searchautocomplete = mSearchSrcTextView;
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        obj1 = obj;
        if (mIconifiedByDefault)
        {
            if (mSearchHintIcon == null)
            {
                obj1 = obj;
            } else
            {
                int i = (int)((double)mSearchSrcTextView.getTextSize() * 1.25D);
                mSearchHintIcon.setBounds(0, 0, i, i);
                obj1 = new SpannableStringBuilder("   ");
                ((SpannableStringBuilder) (obj1)).setSpan(new ImageSpan(mSearchHintIcon), 1, 2, 33);
                ((SpannableStringBuilder) (obj1)).append(((CharSequence) (obj)));
            }
        }
        searchautocomplete.setHint(((CharSequence) (obj1)));
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

    public CursorAdapter getSuggestionsAdapter()
    {
        return mSuggestionsAdapter;
    }

    public boolean isIconfiedByDefault()
    {
        return mIconifiedByDefault;
    }

    public boolean isIconified()
    {
        return mIconified;
    }

    public boolean isQueryRefinementEnabled()
    {
        return mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled()
    {
        return mSubmitButtonEnabled;
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

    final void onTextFocusChanged()
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

    final void setQuery(CharSequence charsequence)
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
            int i;
            if (flag)
            {
                i = 2;
            } else
            {
                i = 1;
            }
            suggestionsadapter.mQueryRefinement = i;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableinfo)
    {
        int i;
        boolean flag;
        flag = true;
        mSearchable = searchableinfo;
        if (mSearchable != null)
        {
            if (IS_AT_LEAST_FROYO)
            {
                mSearchSrcTextView.setThreshold(mSearchable.getSuggestThreshold());
                mSearchSrcTextView.setImeOptions(mSearchable.getImeOptions());
                int j = mSearchable.getInputType();
                i = j;
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
                    searchableinfo = (SuggestionsAdapter)mSuggestionsAdapter;
                    if (mQueryRefinement)
                    {
                        i = 2;
                    } else
                    {
                        i = 1;
                    }
                    searchableinfo.mQueryRefinement = i;
                }
            }
            updateQueryHint();
        }
        if (!IS_AT_LEAST_FROYO)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        if (mSearchable == null || !mSearchable.getVoiceSearchEnabled()) goto _L2; else goto _L1
_L1:
        if (mSearchable.getVoiceSearchLaunchWebSearch())
        {
            searchableinfo = mVoiceWebSearchIntent;
        } else
        if (mSearchable.getVoiceSearchLaunchRecognizer())
        {
            searchableinfo = mVoiceAppSearchIntent;
        } else
        {
            searchableinfo = null;
        }
        if (searchableinfo == null) goto _L2; else goto _L3
_L3:
        if (getContext().getPackageManager().resolveActivity(searchableinfo, 0x10000) != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
_L4:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_319;
        }
_L5:
        mVoiceButtonEnabled = flag;
        if (mVoiceButtonEnabled)
        {
            mSearchSrcTextView.setPrivateImeOptions("nm");
        }
        updateViewsVisibility(isIconified());
        return;
_L2:
        i = 0;
          goto _L4
        flag = false;
          goto _L5
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


/*
    static void access$000(SearchView searchview)
    {
        int ai[];
        Drawable drawable;
        if (searchview.mSearchSrcTextView.hasFocus())
        {
            ai = FOCUSED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable = searchview.mSearchPlate.getBackground();
        if (drawable != null)
        {
            drawable.setState(ai);
        }
        drawable = searchview.mSubmitArea.getBackground();
        if (drawable != null)
        {
            drawable.setState(ai);
        }
        searchview.invalidate();
        return;
    }

*/




/*
    static void access$1100(SearchView searchview)
    {
        Object obj;
        Object obj3;
        SearchableInfo searchableinfo;
        obj3 = null;
        obj = null;
        if (searchview.mSearchable == null)
        {
            break MISSING_BLOCK_LABEL_413;
        }
        searchableinfo = searchview.mSearchable;
        Object obj1;
        Object obj2;
        if (!searchableinfo.getVoiceSearchLaunchWebSearch())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj1 = new Intent(searchview.mVoiceWebSearchIntent);
        obj2 = searchableinfo.getSearchActivity();
        if (obj2 != null) goto _L2; else goto _L1
_L2:
        obj = ((ComponentName) (obj2)).flattenToShortString();
          goto _L1
        ComponentName componentname;
        if (!searchableinfo.getVoiceSearchLaunchRecognizer())
        {
            break MISSING_BLOCK_LABEL_413;
        }
        obj = searchview.mVoiceAppSearchIntent;
        componentname = searchableinfo.getSearchActivity();
        obj1 = new Intent("android.intent.action.SEARCH");
        ((Intent) (obj1)).setComponent(componentname);
        pendingintent = PendingIntent.getActivity(searchview.getContext(), 0, ((Intent) (obj1)), 0x40000000);
        bundle = new Bundle();
        if (searchview.mAppSearchData != null)
        {
            bundle.putParcelable("app_data", searchview.mAppSearchData);
        }
        intent = new Intent(((Intent) (obj)));
        i = 1;
        if (android.os.Build.VERSION.SDK_INT < 8) goto _L4; else goto _L3
_L3:
        obj2 = searchview.getResources();
        if (searchableinfo.getVoiceLanguageModeId() == 0) goto _L6; else goto _L5
_L5:
        obj = ((Resources) (obj2)).getString(searchableinfo.getVoiceLanguageModeId());
_L16:
        if (searchableinfo.getVoicePromptTextId() == 0) goto _L8; else goto _L7
_L7:
        obj1 = ((Resources) (obj2)).getString(searchableinfo.getVoicePromptTextId());
_L15:
        if (searchableinfo.getVoiceLanguageId() == 0) goto _L10; else goto _L9
_L9:
        obj2 = ((Resources) (obj2)).getString(searchableinfo.getVoiceLanguageId());
_L14:
        String s;
        String s1;
        String s2;
        s = ((String) (obj2));
        s1 = ((String) (obj1));
        s2 = ((String) (obj));
        if (searchableinfo.getVoiceMaxResults() == 0)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        i = searchableinfo.getVoiceMaxResults();
        s2 = ((String) (obj));
        s1 = ((String) (obj1));
        s = ((String) (obj2));
_L17:
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", s2);
        intent.putExtra("android.speech.extra.PROMPT", s1);
        intent.putExtra("android.speech.extra.LANGUAGE", s);
        intent.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (componentname != null) goto _L12; else goto _L11
_L11:
        obj = obj3;
_L13:
        intent.putExtra("calling_package", ((String) (obj)));
        intent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pendingintent);
        intent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        searchview.getContext().startActivity(intent);
        return;
_L1:
        PendingIntent pendingintent;
        Bundle bundle;
        Intent intent;
        int i;
        try
        {
            ((Intent) (obj1)).putExtra("calling_package", ((String) (obj)));
            searchview.getContext().startActivity(((Intent) (obj1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SearchView searchview)
        {
            Log.w("SearchView", "Could not find voice search activity");
        }
        return;
_L12:
        obj = componentname.flattenToShortString();
        if (true) goto _L13; else goto _L10
_L10:
        obj2 = null;
          goto _L14
_L8:
        obj1 = null;
          goto _L15
_L6:
        obj = "free_form";
          goto _L16
_L4:
        s1 = null;
        s2 = "free_form";
        s = null;
          goto _L17
        return;
          goto _L14
    }

*/








/*
    static boolean access$1900(SearchView searchview, int i)
    {
        if (searchview.mOnSuggestionListener == null || !searchview.mOnSuggestionListener._mth134632())
        {
            android.text.Editable editable = searchview.mSearchSrcTextView.getText();
            Object obj = searchview.mSuggestionsAdapter.mCursor;
            if (obj != null)
            {
                if (((Cursor) (obj)).moveToPosition(i))
                {
                    obj = searchview.mSuggestionsAdapter.convertToString(((Cursor) (obj)));
                    if (obj != null)
                    {
                        searchview.setQuery(((CharSequence) (obj)));
                    } else
                    {
                        searchview.setQuery(editable);
                    }
                } else
                {
                    searchview.setQuery(editable);
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

*/



/*
    static void access$2000(SearchView searchview, CharSequence charsequence)
    {
        boolean flag1 = true;
        android.text.Editable editable = searchview.mSearchSrcTextView.getText();
        searchview.mUserQuery = editable;
        boolean flag;
        if (!TextUtils.isEmpty(editable))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        searchview.updateSubmitButton(flag);
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        searchview.updateVoiceButton(flag);
        searchview.updateCloseButton();
        searchview.updateSubmitArea();
        if (searchview.mOnQueryChangeListener != null && !TextUtils.equals(charsequence, searchview.mOldQueryText))
        {
            searchview.mOnQueryChangeListener.onQueryTextChange(charsequence.toString());
        }
        searchview.mOldQueryText = charsequence.toString();
        return;
    }

*/



/*
    static void access$300(SearchView searchview)
    {
        if (searchview.mDropDownAnchor.getWidth() > 1)
        {
            Resources resources = searchview.getContext().getResources();
            int k = searchview.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean flag = ViewUtils.isLayoutRtl(searchview);
            int i;
            int j;
            int l;
            int i1;
            if (searchview.mIconifiedByDefault)
            {
                i = resources.getDimensionPixelSize(0x7f0c001f);
                i = resources.getDimensionPixelSize(0x7f0c0020) + i;
            } else
            {
                i = 0;
            }
            searchview.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            if (flag)
            {
                j = -rect.left;
            } else
            {
                j = k - (rect.left + i);
            }
            searchview.mSearchSrcTextView.setDropDownHorizontalOffset(j);
            j = searchview.mDropDownAnchor.getWidth();
            l = rect.left;
            i1 = rect.right;
            searchview.mSearchSrcTextView.setDropDownWidth((i + (j + l + i1)) - k);
        }
        return;
    }

*/






}
