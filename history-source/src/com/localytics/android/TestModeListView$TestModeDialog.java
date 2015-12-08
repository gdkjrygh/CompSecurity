// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.localytics.android:
//            TestModeListView, AmpCallable

class adjustLayout extends Dialog
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
        android.view.odeDialog odedialog = window.getAttributes();
        odedialog.ount = 0.0F;
        odedialog. = mMetrics.widthPixels;
        window.setAttributes(odedialog);
        if (TestModeListView.access$400(TestModeListView.this).getAndSet(false))
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

            final TestModeListView.TestModeDialog this$1;

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
                this$1 = TestModeListView.TestModeDialog.this;
                super();
            }
        });
    }

    private void setupViews()
    {
        float f = getResources().getDisplayMetrics().density;
        mDialogLayout = new RelativeLayout(getContext());
        mDialogLayout.setLayoutParams(new android.widget.t>(-1, -1));
        mDialogLayout.setBackgroundColor(-1);
        RelativeLayout relativelayout = new RelativeLayout(getContext());
        Object obj = new android.widget.t>(-1, -2);
        ((android.widget.t>) (obj)).ule(10);
        relativelayout.setId(1);
        relativelayout.setLayoutParams(((android.view.) (obj)));
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

            final TestModeListView.TestModeDialog this$1;

            public void onClick(View view)
            {
                mDialogLayout.startAnimation(mAnimOut);
                if (TestModeListView.access$200(this$0) != null)
                {
                    view = (AmpCallable)TestModeListView.access$200(this$0).get(Integer.valueOf(10));
                    if (view != null)
                    {
                        view.call(null);
                    }
                }
            }

            
            {
                this$1 = TestModeListView.TestModeDialog.this;
                super();
            }
        });
        android.widget.eDialog edialog = new android.widget.t>(-2, -2);
        edialog.ule(9);
        ((TextView) (obj)).setLayoutParams(edialog);
        relativelayout.addView(((View) (obj)));
        obj = new TextView(getContext());
        ((TextView) (obj)).setText("Localytics");
        ((TextView) (obj)).setTextSize(22F);
        ((TextView) (obj)).setTextColor(-1);
        edialog = new android.widget.t>(-2, -2);
        edialog.ule(13);
        ((TextView) (obj)).setLayoutParams(edialog);
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

            final TestModeListView.TestModeDialog this$1;

            public void onClick(View view)
            {
                if (TestModeListView.access$200(this$0) != null)
                {
                    (new TestModeListView.MenuDialog(this$0, getActivity(), 0x103000b)).show();
                }
            }

            
            {
                this$1 = TestModeListView.TestModeDialog.this;
                super();
            }
        });
        edialog = new android.widget.t>(-2, -2);
        edialog.ule(11);
        ((TextView) (obj)).setLayoutParams(edialog);
        relativelayout.addView(((View) (obj)));
        relativelayout = new RelativeLayout(getContext());
        obj = new android.widget.t>(-1, -1);
        ((android.widget.t>) (obj)).ule(3, 1);
        relativelayout.setLayoutParams(((android.view.) (obj)));
        mDialogLayout.addView(relativelayout);
        obj = new ListView(getContext());
        ((ListView) (obj)).setAdapter(TestModeListView.access$300(TestModeListView.this));
        ((ListView) (obj)).setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final TestModeListView.TestModeDialog this$1;

            public void onItemClick(AdapterView adapterview, View view, int l, long l1)
            {
                if (TestModeListView.access$200(this$0) != null)
                {
                    view = (AmpCallable)TestModeListView.access$200(this$0).get(Integer.valueOf(11));
                    if (view != null)
                    {
                        view.call(new Object[] {
                            adapterview.getItemAtPosition(l)
                        });
                    }
                }
            }

            
            {
                this$1 = TestModeListView.TestModeDialog.this;
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
            if (TestModeListView.access$200(TestModeListView.this) != null)
            {
                AmpCallable ampcallable = (AmpCallable)TestModeListView.access$200(TestModeListView.this).get(Integer.valueOf(10));
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



    public _cls4.this._cls1(Context context, int i)
    {
        this$0 = TestModeListView.this;
        super(context, i);
        setupViews();
        createAnimations();
        adjustLayout();
    }
}
