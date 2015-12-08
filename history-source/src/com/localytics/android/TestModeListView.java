// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.localytics.android:
//            Constants, AmpConstants, AmpCallable

public class TestModeListView extends DialogFragment
{
    class CancelItemAdapter extends BaseAdapter
    {

        private final String MENU_ITEMS[] = {
            "Cancel"
        };
        private Context mContext;
        final TestModeListView this$0;

        public int getCount()
        {
            return MENU_ITEMS.length;
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public String getItem(int i)
        {
            return MENU_ITEMS[i];
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = view;
            view = viewgroup;
            if (viewgroup == null)
            {
                view = new LinearLayout(mContext);
                view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
                view.setOrientation(1);
                int j = (int)(mContext.getResources().getDisplayMetrics().density * 6F + 0.5F);
                view.setPadding(0, j, 0, j);
                viewgroup = new TextView(mContext);
                viewgroup.setId(1);
                viewgroup.setTextSize(26F);
                viewgroup.setTextColor(Color.argb(255, 0, 91, 255));
                viewgroup.setGravity(17);
                view.addView(viewgroup);
                float f = getResources().getDisplayMetrics().density * 8F;
                viewgroup = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TL_BR, new int[] {
                    -1, -1, -1
                });
                viewgroup.setGradientType(0);
                viewgroup.setCornerRadii(new float[] {
                    f, f, f, f, f, f, f, f
                });
                view.setBackground(viewgroup);
            }
            viewgroup = (TextView)view.findViewById(1);
            viewgroup.setText(MENU_ITEMS[i]);
            viewgroup.setTypeface(null, 1);
            return view;
        }

        public CancelItemAdapter(Context context)
        {
            this$0 = TestModeListView.this;
            super();
            mContext = context;
        }
    }

    class MenuDialog extends Dialog
    {

        private LinearLayout mDialogLayout;
        private DisplayMetrics mMetrics;
        final TestModeListView this$0;

        private void adjustLayout()
        {
            mMetrics = new DisplayMetrics();
            ((WindowManager)getActivity().getSystemService("window")).getDefaultDisplay().getMetrics(mMetrics);
            Window window = getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setAttributes(window.getAttributes());
            window.setFlags(1024, 1024);
        }

        private void setupViews()
        {
            mDialogLayout = new LinearLayout(getContext());
            mDialogLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            mDialogLayout.setGravity(16);
            mDialogLayout.setOrientation(1);
            Object obj = new MenuItemAdapter(getActivity());
            ListView listview = new ListView(getActivity());
            listview.setAdapter(((ListAdapter) (obj)));
            listview.setBackground(new ColorDrawable(0));
            listview.setDividerHeight(1);
            listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final MenuDialog this$1;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    if (i != 0) goto _L2; else goto _L1
_L1:
                    AmpConstants.setTestModeEnabled(false);
                    dismiss();
_L4:
                    dismiss();
                    return;
_L2:
                    if (i == 1)
                    {
                        if (mCallbacks != null)
                        {
                            adapterview = (AmpCallable)mCallbacks.get(Integer.valueOf(12));
                            if (adapterview != null)
                            {
                                adapterview.call(null);
                            }
                        }
                    } else
                    if (i == 2)
                    {
                        if (mCallbacks != null)
                        {
                            adapterview = (AmpCallable)mCallbacks.get(Integer.valueOf(13));
                            if (adapterview != null)
                            {
                                adapterview.call(null);
                            }
                        }
                    } else
                    if (i == 3 && mCallbacks != null)
                    {
                        adapterview = (AmpCallable)mCallbacks.get(Integer.valueOf(14));
                        if (adapterview != null)
                        {
                            adapterview.call(null);
                        }
                    }
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                this$1 = MenuDialog.this;
                super();
            }
            });
            mDialogLayout.addView(listview);
            obj = new View(getActivity());
            ((View) (obj)).setBackground(new ColorDrawable(0));
            ((View) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, (int)(getResources().getDisplayMetrics().density * 10F + 0.5F)));
            mDialogLayout.addView(((View) (obj)));
            obj = new CancelItemAdapter(getActivity());
            listview = new ListView(getActivity());
            listview.setAdapter(((ListAdapter) (obj)));
            listview.setBackground(new ColorDrawable(0));
            listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final MenuDialog this$1;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    dismiss();
                }

            
            {
                this$1 = MenuDialog.this;
                super();
            }
            });
            mDialogLayout.addView(listview);
            requestWindowFeature(1);
            setContentView(mDialogLayout);
        }

        public MenuDialog(Context context, int i)
        {
            this$0 = TestModeListView.this;
            super(context, i);
            setupViews();
            adjustLayout();
        }
    }

    class MenuItemAdapter extends BaseAdapter
    {

        private final String MENU_ITEMS[] = {
            "Disable Test Mode", "Refresh", "Copy Push Token", "Copy Install ID"
        };
        private Context mContext;
        final TestModeListView this$0;

        private Drawable getShape(int i)
        {
            float f = getResources().getDisplayMetrics().density * 8F;
            GradientDrawable gradientdrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TL_BR, new int[] {
                -1, -1, -1
            });
            gradientdrawable.setGradientType(0);
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            default:
                return gradientdrawable;

            case 0: // '\0'
                gradientdrawable.setCornerRadii(new float[] {
                    f, f, f, f, 0.0F, 0.0F, 0.0F, 0.0F
                });
                return gradientdrawable;

            case 3: // '\003'
                gradientdrawable.setCornerRadii(new float[] {
                    0.0F, 0.0F, 0.0F, 0.0F, f, f, f, f
                });
                break;
            }
            return gradientdrawable;
        }

        public int getCount()
        {
            return MENU_ITEMS.length;
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public String getItem(int i)
        {
            return MENU_ITEMS[i];
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = view;
            view = viewgroup;
            if (viewgroup == null)
            {
                view = new LinearLayout(mContext);
                view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
                view.setOrientation(1);
                int j = (int)(mContext.getResources().getDisplayMetrics().density * 6F + 0.5F);
                view.setPadding(0, j, 0, j);
                viewgroup = new TextView(mContext);
                viewgroup.setId(1);
                viewgroup.setTextSize(26F);
                viewgroup.setTextColor(Color.argb(255, 0, 91, 255));
                viewgroup.setGravity(17);
                view.addView(viewgroup);
                view.setBackground(getShape(i));
            }
            viewgroup = (TextView)view.findViewById(1);
            viewgroup.setText(MENU_ITEMS[i]);
            switch (i)
            {
            default:
                return view;

            case 0: // '\0'
                viewgroup.setTextColor(0xffff0000);
                break;
            }
            return view;
        }

        public MenuItemAdapter(Context context)
        {
            this$0 = TestModeListView.this;
            super();
            mContext = context;
        }
    }

    class TestModeDialog extends Dialog
    {

        private TranslateAnimation mAnimIn;
        private TranslateAnimation mAnimOut;
        private RelativeLayout mDialogLayout;
        private DisplayMetrics mMetrics;
        final TestModeListView this$0;

        private void adjustLayout()
        {
            mMetrics = new DisplayMetrics();
            ((WindowManager)getActivity().getSystemService("window")).getDefaultDisplay().getMetrics(mMetrics);
            Window window = getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(17);
            android.view.WindowManager.LayoutParams layoutparams = window.getAttributes();
            layoutparams.dimAmount = 0.0F;
            layoutparams.width = mMetrics.widthPixels;
            window.setAttributes(layoutparams);
            if (mEnterAnimatable.getAndSet(false))
            {
                mDialogLayout.startAnimation(mAnimIn);
            }
            window.setFlags(1024, 1024);
        }

        private void createAnimations()
        {
            mAnimIn = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 1.0F, 2, 0.0F);
            mAnimIn.setDuration(250L);
            mAnimOut = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 0.0F, 2, 1.0F);
            mAnimOut.setDuration(250L);
            mAnimOut.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final TestModeDialog this$1;

                public void onAnimationEnd(Animation animation)
                {
                    dismiss();
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$1 = TestModeDialog.this;
                super();
            }
            });
        }

        private void setupViews()
        {
            float f = getResources().getDisplayMetrics().density;
            mDialogLayout = new RelativeLayout(getContext());
            mDialogLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            mDialogLayout.setBackgroundColor(-1);
            RelativeLayout relativelayout = new RelativeLayout(getContext());
            Object obj = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
            relativelayout.setId(1);
            relativelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            relativelayout.setBackgroundColor(Color.argb(255, 73, 73, 73));
            relativelayout.setPadding((int)(8F * f + 0.5F), (int)(12F * f + 0.5F), (int)(8F * f + 0.5F), (int)(12F * f + 0.5F));
            mDialogLayout.addView(relativelayout);
            obj = new TextView(getContext());
            ((TextView) (obj)).setText("Close");
            ((TextView) (obj)).setTextSize(22F);
            int ai[] = {
                0x10100a7
            };
            int ai1[] = {
                0x101009c
            };
            int ai2[] = new int[0];
            int i = Color.argb(255, 255, 0, 0);
            int j = Color.argb(255, 0, 91, 255);
            int k = Color.argb(255, 0, 91, 255);
            ((TextView) (obj)).setTextColor(new ColorStateList(new int[][] {
                ai, ai1, ai2
            }, new int[] {
                i, j, k
            }));
            ((TextView) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final TestModeDialog this$1;

                public void onClick(View view)
                {
                    mDialogLayout.startAnimation(mAnimOut);
                    if (mCallbacks != null)
                    {
                        view = (AmpCallable)mCallbacks.get(Integer.valueOf(10));
                        if (view != null)
                        {
                            view.call(null);
                        }
                    }
                }

            
            {
                this$1 = TestModeDialog.this;
                super();
            }
            });
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(9);
            ((TextView) (obj)).setLayoutParams(layoutparams);
            relativelayout.addView(((View) (obj)));
            obj = new TextView(getContext());
            ((TextView) (obj)).setText("Localytics");
            ((TextView) (obj)).setTextSize(22F);
            ((TextView) (obj)).setTextColor(-1);
            layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(13);
            ((TextView) (obj)).setLayoutParams(layoutparams);
            relativelayout.addView(((View) (obj)));
            obj = new TextView(getContext());
            ((TextView) (obj)).setText("Menu");
            ((TextView) (obj)).setTextSize(22F);
            i = Color.argb(255, 255, 0, 0);
            j = Color.argb(255, 0, 91, 255);
            k = Color.argb(255, 0, 91, 255);
            ((TextView) (obj)).setTextColor(new ColorStateList(new int[][] {
                new int[] {
                    0x10100a7
                }, new int[] {
                    0x101009c
                }, new int[0]
            }, new int[] {
                i, j, k
            }));
            ((TextView) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final TestModeDialog this$1;

                public void onClick(View view)
                {
                    if (mCallbacks != null)
                    {
                        (new MenuDialog(getActivity(), 0x103000b)).show();
                    }
                }

            
            {
                this$1 = TestModeDialog.this;
                super();
            }
            });
            layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(11);
            ((TextView) (obj)).setLayoutParams(layoutparams);
            relativelayout.addView(((View) (obj)));
            relativelayout = new RelativeLayout(getContext());
            obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(3, 1);
            relativelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            mDialogLayout.addView(relativelayout);
            obj = new ListView(getContext());
            ((ListView) (obj)).setAdapter(mAdapter);
            ((ListView) (obj)).setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final TestModeDialog this$1;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    if (mCallbacks != null)
                    {
                        view = (AmpCallable)mCallbacks.get(Integer.valueOf(11));
                        if (view != null)
                        {
                            view.call(new Object[] {
                                adapterview.getItemAtPosition(i)
                            });
                        }
                    }
                }

            
            {
                this$1 = TestModeDialog.this;
                super();
            }
            });
            relativelayout.addView(((View) (obj)));
            requestWindowFeature(1);
            setContentView(mDialogLayout);
        }

        public boolean onKeyDown(int i, KeyEvent keyevent)
        {
            if (i == 4)
            {
                mDialogLayout.startAnimation(mAnimOut);
                if (mCallbacks != null)
                {
                    AmpCallable ampcallable = (AmpCallable)mCallbacks.get(Integer.valueOf(10));
                    if (ampcallable != null)
                    {
                        ampcallable.call(null);
                    }
                }
                return super.onKeyDown(i, keyevent);
            } else
            {
                return super.onKeyDown(i, keyevent);
            }
        }



        public TestModeDialog(Context context, int i)
        {
            this$0 = TestModeListView.this;
            super(context, i);
            setupViews();
            createAnimations();
            adjustLayout();
        }
    }


    public static final String TEST_MODE_LIST_TAG = "amp_test_mode_list";
    private ListAdapter mAdapter;
    private Map mCallbacks;
    private AtomicBoolean mEnterAnimatable;

    public TestModeListView()
    {
        mEnterAnimatable = new AtomicBoolean(true);
    }

    public static TestModeListView newInstance()
    {
        TestModeListView testmodelistview = new TestModeListView();
        testmodelistview.setRetainInstance(true);
        return testmodelistview;
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onActivityCreated");
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onAttach");
        }
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onCreate");
        }
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onCreateDialog");
        }
        return new TestModeDialog(getActivity(), 0x103000b);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onCreateView");
        }
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onDestroy");
        }
        super.onDestroy();
    }

    public void onDestroyView()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onDestroyView");
        }
        if (getDialog() != null && getRetainInstance())
        {
            getDialog().setOnDismissListener(null);
        }
        super.onDestroyView();
    }

    public void onDetach()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onDetach");
        }
        super.onDetach();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onDismiss");
        }
        super.onDismiss(dialoginterface);
    }

    public void onPause()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onPause");
        }
        super.onPause();
    }

    public void onResume()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onResume");
        }
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onSaveInstanceState");
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onStart");
        }
        super.onStart();
    }

    public void onStop()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onStop");
        }
        super.onStop();
    }

    public void onViewStateRestored(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeListView", "onViewStateRestored");
        }
        super.onViewStateRestored(bundle);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        mAdapter = listadapter;
    }

    public TestModeListView setCallbacks(Map map)
    {
        mCallbacks = map;
        return this;
    }

    public void show(FragmentManager fragmentmanager, String s)
    {
        mEnterAnimatable.set(true);
        super.show(fragmentmanager, s);
    }



}
