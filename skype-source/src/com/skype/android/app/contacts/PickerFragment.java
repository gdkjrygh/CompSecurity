// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ScrollView;
import com.skype.Contact;
import com.skype.ObjectInterface;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypeListFragment;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.data.DataAdapter;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.SymbolDrawable;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.text.TypeFacedSpan;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ObjectInterfaceItem;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.ParticipantsDisplayText;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerActivity

public abstract class PickerFragment extends SkypeListFragment
    implements OnUserEventListener, AsyncCallback, com.skype.android.widget.ParticipantsDisplayText.ParticipantUpdateListener
{
    protected class DefaultFilterableListUiDelegate
        implements UiDelegate
    {

        final PickerFragment this$0;

        public void onItemClicked(boolean flag, ObjectInterface objectinterface)
        {
            updateParticipantsDisplayText(flag, objectinterface);
        }

        public void onViewCreated(View view, Bundle bundle)
        {
            setupFab();
            setupToolbar();
            setupFilter();
            setupParticipantDisplayText();
            setupScrollView(bundle);
        }

        public void saveInstanceState(Bundle bundle)
        {
            android.view.ViewGroup.LayoutParams layoutparams = participantsScrollView.getLayoutParams();
            layoutparams.height = -2;
            participantsScrollView.setLayoutParams(layoutparams);
            bundle.putInt("STATE_SCROLL_VIEW_HEIGHT", participantsScrollView.getHeight());
        }

        protected DefaultFilterableListUiDelegate()
        {
            this$0 = PickerFragment.this;
            super();
        }
    }

    protected static interface UiDelegate
    {

        public abstract void onItemClicked(boolean flag, ObjectInterface objectinterface);

        public abstract void onViewCreated(View view, Bundle bundle);

        public abstract void saveInstanceState(Bundle bundle);
    }


    public static final String EXTRA_CUSTOM_FAB_ACTION_SYMBOL = "CUSTOM_ACTION";
    public static final String EXTRA_CUSTOM_TITLE = "CUSTOM_TITLE";
    public static final String EXTRA_HINT_TEXT = "HINT_TEXT_ID";
    public static final String EXTRA_INTENT_ORIGIN = "INTENT_ORIGIN";
    public static final String EXTRA_MULTIPLE_CHOICE = "CHECKBOX_MODE";
    public static final String EXTRA_NEXT_GOES_HOME = "SKYPE_GOES_HOME";
    public static final String EXTRA_OBJECT_CLASS = "objectClass";
    public static final String EXTRA_SELECT_CONVERSATION = "SELECT_CONVERSATION";
    private static final String STATE_SCROLL_VIEW_HEIGHT = "STATE_SCROLL_VIEW_HEIGHT";
    AccessibilityUtil accessibility;
    AsyncService async;
    ContactUtil contactUtil;
    ConversationUtil conversationUtil;
    private DataAdapter dataAdapter;
    private com.skype.android.widget.SymbolElement.SymbolCode fabSymbolCode;
    EditText filterEditText;
    FloatingActionButton floatingActionButton;
    private int heightViewThreshold;
    private int hintTextId;
    private boolean isConversationEnabled;
    LayoutExperience layoutExperience;
    SkyLib lib;
    ObjectIdMap map;
    private int maxParticipantPickerHeight;
    MediaDocumentUploadUtil mediaDocumentUploadUtil;
    private SparseBooleanArray modifiedItems;
    private boolean multipleChoice;
    Navigation navigation;
    private Class objectClass;
    ScrollView participantViewContainer;
    ParticipantsDisplayText participantsDisplayText;
    ScrollView participantsScrollView;
    View shadowLine;
    private boolean skipGoesHome;
    Toolbar toolbar;
    TransferUtil transferUtil;
    TypeFaceFactory typeFaceFactory;
    private UiDelegate uiDelegate;
    UserPreferences userPrefs;

    public PickerFragment()
    {
        modifiedItems = null;
    }

    private void setupFab()
    {
        floatingActionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PickerFragment this$0;

            public final void onClick(View view)
            {
                view = dataAdapter.getCheckedState(0);
                onConfirm(getSelectedItems(view));
            }

            
            {
                this$0 = PickerFragment.this;
                super();
            }
        });
        SymbolDrawable symboldrawable = new SymbolDrawable(fabSymbolCode, SegoeTypeFaceFactory.getInstance((Application)getContext().getApplicationContext()), SymbolDrawable.a);
        symboldrawable.setSymbolColor(getResources().getColor(0x7f0f0135));
        symboldrawable.a(getResources().getDimensionPixelSize(0x7f0c01bf));
        symboldrawable.a();
        floatingActionButton.setImageDrawable(symboldrawable);
        floatingActionButton.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final PickerFragment this$0;

            public final void onGlobalLayout()
            {
                floatingActionButton.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)floatingActionButton.getLayoutParams();
                marginlayoutparams.topMargin = -floatingActionButton.getHeight() / 2;
                floatingActionButton.setLayoutParams(marginlayoutparams);
            }

            
            {
                this$0 = PickerFragment.this;
                super();
            }
        });
    }

    private void setupFilter()
    {
        filterEditText.addTextChangedListener(new TextWatcher() {

            final PickerFragment this$0;

            public final void afterTextChanged(Editable editable)
            {
                editable = editable.toString();
                filter(editable);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                this$0 = PickerFragment.this;
                super();
            }
        });
        filterEditText.setHint(hintTextId);
    }

    private void setupParticipantDisplayText()
    {
        participantsDisplayText.a(lib, contactUtil, conversationUtil);
        participantsDisplayText.setParticipantUpdateListener(this);
        participantsDisplayText.setExistingParticipants(new ArrayList());
    }

    private void setupScrollView(Bundle bundle)
    {
        if (bundle != null)
        {
            participantsScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final PickerFragment this$0;

                public final void onGlobalLayout()
                {
                    participantsScrollView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    if (!TextUtils.isEmpty(participantsDisplayText.getText()))
                    {
                        if (participantsScrollView.getHeight() > maxParticipantPickerHeight)
                        {
                            android.view.ViewGroup.LayoutParams layoutparams = participantsScrollView.getLayoutParams();
                            layoutparams.height = maxParticipantPickerHeight;
                            heightViewThreshold = maxParticipantPickerHeight;
                            participantsScrollView.setLayoutParams(layoutparams);
                        }
                        if (floatingActionButton != null)
                        {
                            floatingActionButton.setScaleX(1.0F);
                            floatingActionButton.setScaleY(1.0F);
                        }
                    }
                }

            
            {
                this$0 = PickerFragment.this;
                super();
            }
            });
        }
    }

    private void setupToolbar()
    {
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().b(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().a(0x7f02007b);
    }

    private void updateParticipantsDisplayText(boolean flag, ObjectInterface objectinterface)
    {
        if (!multipleChoice) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        participantsDisplayText.a(objectinterface);
        filterEditText.setText("");
_L6:
        return;
_L4:
        participantsDisplayText.b(objectinterface);
        return;
_L2:
        if (participantsDisplayText.a().size() == 1)
        {
            participantsDisplayText.b((ObjectInterface)participantsDisplayText.a().get(0));
        }
        if (flag)
        {
            participantsDisplayText.a(objectinterface);
            filterEditText.setText("");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void done(AsyncResult asyncresult)
    {
        if (asyncresult.e())
        {
            setListShown(true);
        }
        asyncresult = (List)asyncresult.a();
        if (asyncresult != null)
        {
            onDataLoaded(asyncresult);
        }
        if (multipleChoice)
        {
            updateSelectionCount(getSelectedCount(dataAdapter.getCheckedState(0)));
        }
    }

    protected void filter(String s)
    {
        dataAdapter.getFilter().filter(s);
    }

    protected ActionBarCustomizer getActionBarCustomizer()
    {
        return ((PickerActivity)getActivity()).getActionBarCustomizer();
    }

    protected DataAdapter getDataAdapter()
    {
        return dataAdapter;
    }

    protected abstract Callable getLoader();

    protected abstract int getObjectId(ObjectInterfaceItem objectinterfaceitem);

    protected abstract Class getObjectInterfaceType();

    public int getSelectedCount(SparseBooleanArray sparsebooleanarray)
    {
        int j = 0;
        for (int i = 0; i < sparsebooleanarray.size();)
        {
            int k = j;
            if (sparsebooleanarray.valueAt(i))
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    public List getSelectedItems(SparseBooleanArray sparsebooleanarray)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < sparsebooleanarray.size(); i++)
        {
            if (sparsebooleanarray.valueAt(i))
            {
                int j = sparsebooleanarray.keyAt(i);
                arraylist.add(map.a(j, objectClass));
            }
        }

        return arraylist;
    }

    protected abstract int getTitleId();

    protected boolean isConversationEnabled()
    {
        return isConversationEnabled;
    }

    protected abstract boolean isInteractive(Object obj);

    public boolean isMultipleChoice()
    {
        return multipleChoice;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setRetainInstance(true);
        setHasOptionsMenu(true);
        if (modifiedItems != null && modifiedItems.size() > 0)
        {
            refreshSelected(modifiedItems);
        }
    }

    protected void onBackPressed()
    {
        if (skipGoesHome)
        {
            navigation.home();
            getActivity().finish();
        }
    }

    public void onConfirm(List list)
    {
        Intent intent = new Intent();
        int ai[] = new int[list.size()];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = ((ObjectInterface)list.get(i)).getObjectID();
        }

        intent.putExtra("com.skype.objIds", ai);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        Object obj = getArguments();
        bundle = ((Bundle) (obj));
        if (obj == null)
        {
            bundle = new Bundle();
        }
        multipleChoice = bundle.getBoolean("CHECKBOX_MODE", false);
        fabSymbolCode = (com.skype.android.widget.SymbolElement.SymbolCode)bundle.getSerializable("CUSTOM_ACTION");
        hintTextId = bundle.getInt("HINT_TEXT_ID", 0x7f08017f);
        isConversationEnabled = bundle.getBoolean("SELECT_CONVERSATION", false);
        int i = bundle.getInt("CUSTOM_TITLE", -1);
        if (i != -1)
        {
            getActivity().setTitle(i);
        }
        obj = getActivity().getIntent();
        if (((Intent) (obj)).hasExtra("SKYPE_GOES_HOME"))
        {
            skipGoesHome = ((Intent) (obj)).getBooleanExtra("SKYPE_GOES_HOME", false);
        }
        if (bundle.containsKey("objectClass"))
        {
            objectClass = (Class)getArguments().getSerializable("objectClass");
        } else
        {
            objectClass = com/skype/Contact;
        }
        setUiDelegate(new DefaultFilterableListUiDelegate());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03006b, viewgroup, false);
    }

    protected abstract void onDataLoaded(List list);

    public volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
    }

    public void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
    {
        getListView().getAdapter().notifyDataSetChanged();
    }

    public volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        boolean flag = false;
        if (!isInteractive(obj) || !itemviewholder.itemView.isEnabled()) goto _L2; else goto _L1
_L1:
        SparseBooleanArray sparsebooleanarray;
        sparsebooleanarray = dataAdapter.getCheckedState(0);
        i = getObjectId((ObjectInterfaceItem)obj);
        if (!sparsebooleanarray.get(i, false))
        {
            flag = true;
        }
        obj = map.a(i, getObjectInterfaceType());
        if (!multipleChoice) goto _L4; else goto _L3
_L3:
        sparsebooleanarray.put(i, flag);
_L6:
        uiDelegate.onItemClicked(flag, ((ObjectInterface) (obj)));
        dataAdapter.notifyDataSetChanged();
        setContentDescriptionForAccessibility(itemviewholder);
_L2:
        return;
_L4:
        sparsebooleanarray.clear();
        if (flag)
        {
            sparsebooleanarray.put(i, true);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756475: 
            onConfirm(getSelectedItems(dataAdapter.getCheckedState(0)));
            break;
        }
        return true;
    }

    public void onParticipantAdded(final ParticipantsDisplayText participantsDisplayText, ObjectInterface objectinterface)
    {
        participantsDisplayText.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final PickerFragment this$0;
            final ParticipantsDisplayText val$participantsDisplayText;

            public final void onGlobalLayout()
            {
                participantsDisplayText.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                int i = participantViewContainer.getHeight();
                int j = participantsDisplayText.getHeight();
                android.view.ViewGroup.LayoutParams layoutparams = participantViewContainer.getLayoutParams();
                ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                    i, j
                });
                valueanimator.setInterpolator(new OvershootInterpolator(3F));
                valueanimator.setDuration(333L);
                valueanimator.addUpdateListener(layoutparams. new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final _cls5 this$1;
                    final android.view.ViewGroup.LayoutParams val$layoutParams;

                    public final void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        layoutParams.height = ((Integer)valueanimator.getAnimatedValue()).intValue();
                        layoutParams.width = -1;
                        participantViewContainer.setLayoutParams(layoutParams);
                        participantsScrollView.fullScroll(130);
                        if (participantsScrollView.getHeight() > maxParticipantPickerHeight)
                        {
                            heightViewThreshold = participantsDisplayText.getHeight();
                            valueanimator = participantsScrollView.getLayoutParams();
                            valueanimator.height = maxParticipantPickerHeight;
                            participantsScrollView.setLayoutParams(valueanimator);
                        }
                    }

            
            {
                this$1 = final__pcls5;
                layoutParams = android.view.ViewGroup.LayoutParams.this;
                super();
            }
                });
                valueanimator.start();
            }

            
            {
                this$0 = PickerFragment.this;
                participantsDisplayText = participantsdisplaytext;
                super();
            }
        });
        if (participantsDisplayText.a().size() == 1)
        {
            floatingActionButton.setScaleX(0.0F);
            floatingActionButton.setScaleY(0.0F);
            floatingActionButton.animate().scaleX(1.0F).scaleY(1.0F).setInterpolator(new OvershootInterpolator()).setDuration(333L).start();
        }
    }

    public void onParticipantRemoved(final ParticipantsDisplayText participantsDisplayText, ObjectInterface objectinterface)
    {
        getDataAdapter().getCheckedState(0).put(objectinterface.getObjectID(), false);
        dataAdapter.notifyDataSetChanged();
        participantsDisplayText.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final PickerFragment this$0;
            final ParticipantsDisplayText val$participantsDisplayText;

            public final void onGlobalLayout()
            {
                participantsDisplayText.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                int j = participantViewContainer.getHeight();
                android.view.ViewGroup.LayoutParams layoutparams;
                ValueAnimator valueanimator;
                int i;
                if (participantsDisplayText.a().size() == 0)
                {
                    i = 0;
                } else
                {
                    i = participantsDisplayText.getHeight();
                }
                layoutparams = participantViewContainer.getLayoutParams();
                valueanimator = ValueAnimator.ofInt(new int[] {
                    j, i
                });
                valueanimator.setInterpolator(new AnticipateOvershootInterpolator(0.0F));
                valueanimator.setDuration(333L);
                valueanimator.addUpdateListener(layoutparams. new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final _cls6 this$1;
                    final android.view.ViewGroup.LayoutParams val$layoutParams;

                    public final void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        layoutParams.height = ((Integer)valueanimator.getAnimatedValue()).intValue();
                        layoutParams.width = -1;
                        participantViewContainer.setLayoutParams(layoutParams);
                        if (participantsDisplayText.getHeight() < heightViewThreshold)
                        {
                            valueanimator = participantsScrollView.getLayoutParams();
                            if (((android.view.ViewGroup.LayoutParams) (valueanimator)).height != -2)
                            {
                                valueanimator.height = -2;
                                participantsScrollView.setLayoutParams(valueanimator);
                            }
                        }
                    }

            
            {
                this$1 = final__pcls6;
                layoutParams = android.view.ViewGroup.LayoutParams.this;
                super();
            }
                });
                valueanimator.start();
            }

            
            {
                this$0 = PickerFragment.this;
                participantsDisplayText = participantsdisplaytext;
                super();
            }
        });
        if (participantsDisplayText.a().size() == 0)
        {
            floatingActionButton.animate().scaleX(0.0F).scaleY(0.0F).setInterpolator(new AnticipateInterpolator(3F)).setDuration(333L).start();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (dataAdapter.getCount() == 0)
        {
            async.a(getLoader(), this);
            return;
        } else
        {
            setListShown(true);
            dataAdapter.notifyDataSetChanged();
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        uiDelegate.saveInstanceState(bundle);
        modifiedItems = dataAdapter.getCheckedState(0);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        maxParticipantPickerHeight = getResources().getDimensionPixelSize(0x7f0c0019);
        uiDelegate.onViewCreated(view, bundle);
        dataAdapter.setOnUserEventListener(0, this);
        getListView().setAdapter(dataAdapter);
        if (android.os.Build.VERSION.SDK_INT < 21 && shadowLine != null)
        {
            shadowLine.setVisibility(0);
        }
    }

    protected void refreshSelected(SparseBooleanArray sparsebooleanarray)
    {
        dataAdapter.setCheckedState(0, sparsebooleanarray);
    }

    protected abstract void setContentDescriptionForAccessibility(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder);

    public void setDataAdapter(DataAdapter dataadapter)
    {
        dataAdapter = dataadapter;
    }

    protected void setTitleId(int i)
    {
        getActionBarCustomizer().setTitleWithRecents(i);
    }

    protected void setUiDelegate(UiDelegate uidelegate)
    {
        uiDelegate = uidelegate;
    }

    protected void updateCheckedItem(int i, boolean flag)
    {
        dataAdapter.setItemChecked(0, i, flag);
    }

    public void updateSelectionCount(int i)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(getString(0x7f08048f, new Object[] {
            Integer.valueOf(i)
        }));
        spannablestringbuilder.setSpan(new TypeFacedSpan(typeFaceFactory), 0, spannablestringbuilder.length(), 0);
    }





/*
    static int access$202(PickerFragment pickerfragment, int i)
    {
        pickerfragment.heightViewThreshold = i;
        return i;
    }

*/






}
