// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.view.ViewPager;
import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.chat.ChatFragmentProvider;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.MojiContent;
import com.skype.android.mediacontent.OnPackInfoReady;
import com.skype.android.mediacontent.PackInfo;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SymbolView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerDialogFragment, AbstractPickerTab, MojiPreviewDialogFragment, MRUTab, 
//            PickerTab

public class ExtensiblePickerDialogFragment extends PickerDialogFragment
    implements android.support.v4.view.ViewPager.f, android.view.View.OnClickListener, AbstractPickerTab.TabCallback, PickerItemInteractionManager.MediaPreviewCallback
{
    public static interface Callback
    {

        public abstract int getPickerHeight();

        public abstract boolean getShowEmoticonsOnly();

        public abstract void onPickerDeleteKey();

        public abstract void onPickerDismiss();
    }

    public static interface SearchCallback
    {

        public abstract void onPickerSearchButtonClicked();
    }

    private static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a ANIMATING_DOWN;
        public static final a ANIMATING_UP;
        public static final a IDLE;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/skype/android/app/chat/picker/ExtensiblePickerDialogFragment$a, s1);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        static 
        {
            ANIMATING_UP = new a("ANIMATING_UP", 0);
            ANIMATING_DOWN = new a("ANIMATING_DOWN", 1);
            IDLE = new a("IDLE", 2);
            $VALUES = (new a[] {
                ANIMATING_UP, ANIMATING_DOWN, IDLE
            });
        }

        private a(String s1, int i)
        {
            super(s1, i);
        }
    }

    private final class b
    {

        private a animationState;
        private View bottomBar;
        private boolean enabled;
        final ExtensiblePickerDialogFragment this$0;

        private void show()
        {
            if (enabled && bottomBar.getTranslationY() != 0.0F && animationState != a.ANIMATING_UP)
            {
                animationState = a.ANIMATING_UP;
                bottomBar.animate().translationY(0.0F).setListener(new AnimatorListenerAdapter() {

                    final b this$1;

                    public final void onAnimationEnd(Animator animator)
                    {
                        animationState = a.IDLE;
                    }

            
            {
                this$1 = b.this;
                super();
            }
                });
            }
        }

        public final void hide()
        {
            if (enabled && bottomBar.getTranslationY() != (float)bottomBar.getMeasuredHeight() && animationState != a.ANIMATING_DOWN)
            {
                animationState = a.ANIMATING_DOWN;
                bottomBar.animate().translationY(bottomBar.getMeasuredHeight()).setListener(new AnimatorListenerAdapter() {

                    final b this$1;

                    public final void onAnimationEnd(Animator animator)
                    {
                        animationState = a.IDLE;
                    }

            
            {
                this$1 = b.this;
                super();
            }
                });
            }
        }

        protected final void setEnabled(boolean flag)
        {
            enabled = flag;
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)viewPager.getLayoutParams();
            int i;
            if (flag)
            {
                i = -1;
            } else
            {
                i = bottomBar.getId();
            }
            layoutparams.addRule(2, i);
        }



/*
        static a access$602(b b1, a a1)
        {
            b1.animationState = a1;
            return a1;
        }

*/

        public b(View view)
        {
            this$0 = ExtensiblePickerDialogFragment.this;
            super();
            animationState = a.IDLE;
            enabled = true;
            bottomBar = view;
        }
    }

    private final class c extends s
    {

        final ExtensiblePickerDialogFragment this$0;

        public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
        {
            viewgroup.removeView(((AbstractPickerTab)obj).getContentView());
        }

        public final int getCount()
        {
            return tabs.size();
        }

        public final int getItemPosition(Object obj)
        {
            if (tabs.contains(obj))
            {
                return tabs.indexOf(obj);
            } else
            {
                return -2;
            }
        }

        public final Object instantiateItem(ViewGroup viewgroup, int i)
        {
            AbstractPickerTab abstractpickertab = (AbstractPickerTab)tabs.get(i);
            viewgroup.addView(abstractpickertab.getContentView());
            return abstractpickertab;
        }

        public final boolean isViewFromObject(View view, Object obj)
        {
            return ((AbstractPickerTab)obj).getContentView() == view;
        }

        private c()
        {
            this$0 = ExtensiblePickerDialogFragment.this;
            super();
        }

    }


    public static final String FRAGMENT_TAG = "pickerDialog";
    public static final String KEY_EMOTICONS_ONLY = "emoticonsOnly";
    public static final String KEY_FRAGMENT = "contextFragment";
    private static final String PICKER_PREFERENCES = "picker_preferences";
    private static final String PICKER_PREFERENCES_LAST_TAB_KEY = "picker_preferences_tab";
    Analytics analytics;
    private b bottomBarAnimator;
    private Callback callback;
    EcsConfiguration configuration;
    private int defaultTabsCount;
    private SymbolView deleteButton;
    private boolean displayEmoticonsOnly;
    private PickerItemInteractionManager.MediaSendCallback mediaSendCallback;
    private SharedPreferences pickerPreferences;
    private SymbolView searchButton;
    private SearchCallback searchCallback;
    private ArrayList tabs;
    private LinearLayout tabsBar;
    private HorizontalScrollView tabsScroller;
    private ViewPager viewPager;

    public ExtensiblePickerDialogFragment()
    {
        tabs = new ArrayList();
    }

    private void addTab(AbstractPickerTab abstractpickertab)
    {
        AbstractPickerTab abstractpickertab1 = getTabById(abstractpickertab.getId());
        if (abstractpickertab1 != null)
        {
            tabs.remove(abstractpickertab1);
        }
        tabs.add(abstractpickertab);
        Collections.sort(tabs);
        tabsBar.removeAllViews();
        for (int i = 0; i < tabs.size(); i++)
        {
            AbstractPickerTab abstractpickertab2 = (AbstractPickerTab)tabs.get(i);
            Object obj = abstractpickertab2.getGlyphView();
            View view = ((View) (obj));
            if (obj == null)
            {
                abstractpickertab2.setGlyphAsset(0x7f0201cd);
                view = abstractpickertab2.getGlyphView();
            }
            int k = getResources().getDimensionPixelSize(0x7f0c00d3);
            obj = new android.widget.LinearLayout.LayoutParams(k, k);
            tabsBar.addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
            view.setTag(Integer.valueOf(i));
            view.setOnClickListener(this);
            abstractpickertab2.setPosition(i);
        }

        viewPager.a().notifyDataSetChanged();
        int j = getLastOpenTab();
        int i1 = tabs.indexOf(abstractpickertab);
        if (j == abstractpickertab.getId() || j == -1 && getDefaultTabsCount() > 0 && i1 == getDefaultTabsCount())
        {
            setCurrentPage(i1);
            tabsScroller.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

                final ExtensiblePickerDialogFragment this$0;

                public final void onLayoutChange(View view1, int j1, int k1, int l1, int i2, int j2, int k2, 
                        int l2, int i3)
                {
                    refreshTabButtonsSelectedState();
                    tabsScroller.removeOnLayoutChangeListener(this);
                }

            
            {
                this$0 = ExtensiblePickerDialogFragment.this;
                super();
            }
            });
        }
        refreshTabButtonsSelectedState();
    }

    private void clearMojiSelectedState()
    {
        for (Iterator iterator = tabs.iterator(); iterator.hasNext(); ((AbstractPickerTab)iterator.next()).removeCurrentMojiSelectedPosition()) { }
    }

    private void closePreview()
    {
        if (getActivity() != null && getActivity().getSupportFragmentManager() != null)
        {
            MojiPreviewDialogFragment.hide(getActivity().getSupportFragmentManager());
        }
    }

    private Callback getCallback(Callback callback1)
    {
        if (callback1 != null) goto _L2; else goto _L1
_L1:
        if (getActivity() instanceof Callback)
        {
            callback = (Callback)getActivity();
        }
        if (!(getActivity() instanceof ChatFragmentProvider)) goto _L4; else goto _L3
_L3:
        callback = ((ChatFragmentProvider)getActivity()).getChatFragment();
_L2:
        return callback;
_L4:
        if (getArguments() != null && getArguments().containsKey("contextFragment"))
        {
            callback1 = getActivity().getSupportFragmentManager().a(getArguments(), "contextFragment");
            if (callback1 instanceof Callback)
            {
                callback = (Callback)callback1;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private int getLastOpenTab()
    {
        return pickerPreferences.getInt("picker_preferences_tab", -1);
    }

    private PickerItemInteractionManager.MediaSendCallback getMediaSendCallback(PickerItemInteractionManager.MediaSendCallback mediasendcallback)
    {
        if (mediasendcallback != null) goto _L2; else goto _L1
_L1:
        if (getActivity() instanceof PickerItemInteractionManager.MediaSendCallback)
        {
            mediaSendCallback = (PickerItemInteractionManager.MediaSendCallback)getActivity();
        }
        if (!(getActivity() instanceof ChatFragmentProvider)) goto _L4; else goto _L3
_L3:
        mediaSendCallback = ((ChatFragmentProvider)getActivity()).getChatFragment();
_L2:
        return mediaSendCallback;
_L4:
        if (getArguments() != null && getArguments().containsKey("contextFragment"))
        {
            mediasendcallback = getActivity().getSupportFragmentManager().a(getArguments(), "contextFragment");
            if (mediasendcallback instanceof PickerItemInteractionManager.MediaSendCallback)
            {
                mediaSendCallback = (PickerItemInteractionManager.MediaSendCallback)mediasendcallback;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private SearchCallback getSearchCallback(SearchCallback searchcallback)
    {
        if (searchcallback != null) goto _L2; else goto _L1
_L1:
        if (getActivity() instanceof SearchCallback)
        {
            searchCallback = (SearchCallback)getActivity();
        }
        if (!(getActivity() instanceof ChatFragmentProvider)) goto _L4; else goto _L3
_L3:
        searchCallback = ((ChatFragmentProvider)getActivity()).getChatFragment();
_L2:
        return searchCallback;
_L4:
        if (getArguments() != null && getArguments().containsKey("contextFragment"))
        {
            searchcallback = getActivity().getSupportFragmentManager().a(getArguments(), "contextFragment");
            if (searchcallback instanceof SearchCallback)
            {
                searchCallback = (SearchCallback)searchcallback;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private AbstractPickerTab getTabById(int i)
    {
        for (Iterator iterator = tabs.iterator(); iterator.hasNext();)
        {
            AbstractPickerTab abstractpickertab = (AbstractPickerTab)iterator.next();
            if (i == abstractpickertab.getId())
            {
                return abstractpickertab;
            }
        }

        return null;
    }

    private void initDefaultTabs()
    {
        addTab(new MRUTab(getActivity(), callback, mediaSendCallback, this, this));
        defaultTabsCount = tabs.size();
    }

    private void refreshTabButtonsSelectedState()
    {
        Rect rect = new Rect();
        int i = 0;
        while (i < tabsBar.getChildCount()) 
        {
            View view;
            boolean flag;
            if (i == viewPager.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = tabsBar.getChildAt(i);
            view.setSelected(flag);
            if (flag)
            {
                int j = getResources().getDimensionPixelSize(0x7f0c00d5);
                rect.set((int)view.getX() - j, 0, (int)view.getX() + view.getWidth() + j, 0);
            }
            i++;
        }
        if (rect.left < tabsScroller.getScrollX() || rect.right > tabsScroller.getScrollX() + tabsScroller.getWidth())
        {
            tabsScroller.smoothScrollTo(rect.left, 0);
        }
    }

    private void saveLastOpenTab()
    {
        pickerPreferences.edit().putInt("picker_preferences_tab", ((AbstractPickerTab)tabs.get(viewPager.b())).getId()).apply();
    }

    private void setCurrentPage(int i)
    {
        if (i == 0)
        {
            onPageSelected(0);
            return;
        } else
        {
            viewPager.setCurrentItem(i, false);
            return;
        }
    }

    public static ExtensiblePickerDialogFragment show(l l1, Callback callback1, SearchCallback searchcallback, PickerItemInteractionManager.MediaSendCallback mediasendcallback)
    {
        Bundle bundle = new Bundle();
        if (callback1 instanceof Fragment)
        {
            l1.a(bundle, "contextFragment", (Fragment)callback1);
        }
        if (callback1 != null)
        {
            bundle.putBoolean("emoticonsOnly", callback1.getShowEmoticonsOnly());
        }
        ExtensiblePickerDialogFragment extensiblepickerdialogfragment = new ExtensiblePickerDialogFragment();
        extensiblepickerdialogfragment.callback = callback1;
        extensiblepickerdialogfragment.searchCallback = searchcallback;
        extensiblepickerdialogfragment.mediaSendCallback = mediasendcallback;
        extensiblepickerdialogfragment.setArguments(bundle);
        extensiblepickerdialogfragment.show(l1, "pickerDialog");
        return extensiblepickerdialogfragment;
    }

    protected int getAlignment()
    {
        return 80;
    }

    public int getDefaultTabsCount()
    {
        return defaultTabsCount;
    }

    protected int getLayoutId()
    {
        return 0x7f0300d3;
    }

    protected int getRootViewId()
    {
        return 0x7f100494;
    }

    protected int getWindowHeight()
    {
        Dialog dialog = getDialog();
        if (dialog != null && dialog.isShowing())
        {
            return dialog.getWindow().getAttributes().height;
        }
        if (callback == null)
        {
            return getDialog().getWindow().getDecorView().getHeight() / 2;
        } else
        {
            return callback.getPickerHeight();
        }
    }

    public void hideBottomBar()
    {
        bottomBarAnimator.hide();
    }

    public void onClick(View view)
    {
        if (view != deleteButton || callback == null) goto _L2; else goto _L1
_L1:
        if (!MojiPreviewDialogFragment.isShowing(getActivity().getSupportFragmentManager())) goto _L4; else goto _L3
_L3:
        closePreview();
_L6:
        return;
_L4:
        callback.onPickerDeleteKey();
        return;
_L2:
        if (view == searchButton && searchCallback != null)
        {
            searchCallback.onPickerSearchButtonClicked();
            return;
        }
        if (view.getTag() != null)
        {
            viewPager.setCurrentItem(((Integer)view.getTag()).intValue());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        boolean flag;
        if (getArguments() != null && getArguments().getBoolean("emoticonsOnly"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        displayEmoticonsOnly = flag;
        callback = getCallback(callback);
        searchCallback = getSearchCallback(searchCallback);
        mediaSendCallback = getMediaSendCallback(mediaSendCallback);
        pickerPreferences = getActivity().getSharedPreferences("picker_preferences", 0);
        return super.onCreateDialog(bundle);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (callback != null)
        {
            callback.onPickerDismiss();
        }
        for (dialoginterface = tabs.iterator(); dialoginterface.hasNext(); ((AbstractPickerTab)dialoginterface.next()).destroy()) { }
        closePreview();
    }

    public void onEvent(OnPackInfoReady onpackinfoready)
    {
        onpackinfoready = onpackinfoready.a();
        if (onpackinfoready.f())
        {
            analytics.a(AnalyticsEvent.bW, onpackinfoready.c());
        } else
        if ((onpackinfoready.e() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON || !displayEmoticonsOnly) && (onpackinfoready.e() != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK || configuration.isMojiSupported()))
        {
            addTab(new PickerTab(getActivity(), callback, mediaSendCallback, this, this, onpackinfoready));
            closePreview();
            return;
        }
    }

    public void onMojiPreviewDismissed()
    {
        clearMojiSelectedState();
    }

    public void onMojiSelected(MojiContent mojicontent)
    {
        if (getActivity() != null && getActivity().getSupportFragmentManager() != null)
        {
            Rect rect = new Rect();
            getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int j = getActivity().getResources().getIdentifier("status_bar_height", "dimen", "android");
            int i = 0;
            if (j > 0)
            {
                i = getActivity().getResources().getDimensionPixelSize(j);
            }
            MojiPreviewDialogFragment.show(getActivity().getSupportFragmentManager(), rect.height() + i, mojicontent, this);
        }
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        ((AbstractPickerTab)tabs.get(i)).consume();
        closePreview();
        refreshTabButtonsSelectedState();
        saveLastOpenTab();
        showBottomBar();
    }

    public void onViewCreated(View view)
    {
        deleteButton = (SymbolView)ViewUtil.a(view, 0x7f100497);
        ViewUtil.a(this, new View[] {
            deleteButton
        });
        deleteButton.setOnClickListener(this);
        searchButton = (SymbolView)ViewUtil.a(view, 0x7f100498);
        if (searchCallback != null)
        {
            ViewUtil.a(this, new View[] {
                searchButton
            });
        } else
        {
            searchButton.setVisibility(8);
        }
        if (!configuration.isMediaPickerSearchSupported())
        {
            searchButton.setVisibility(8);
        }
        tabsBar = (LinearLayout)ViewUtil.a(view, 0x7f10049a);
        tabsScroller = (HorizontalScrollView)ViewUtil.a(view, 0x7f100499);
        viewPager = (ViewPager)ViewUtil.a(view, 0x7f100495);
        viewPager.setAdapter(new c());
        viewPager.setOnPageChangeListener(this);
        viewPager.setOffscreenPageLimit(2);
        bottomBarAnimator = new b(view.findViewById(0x7f100496));
        bottomBarAnimator.setEnabled(false);
        initDefaultTabs();
        mediaContentRoster.d();
    }

    public void requestThumbnail(int i)
    {
        mediaContentRoster.b(i);
    }

    public void showBottomBar()
    {
        bottomBarAnimator.show();
    }




}
