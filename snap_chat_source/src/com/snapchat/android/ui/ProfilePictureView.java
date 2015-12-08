// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Id;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn;
import com.caverock.androidsvg.SVGImageView;
import com.snapchat.android.ui.camera.TakeSnapButton;

public class ProfilePictureView extends RelativeLayout
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void p();

        public abstract void q();

        public abstract void s();

        public abstract void t();

        public abstract void u();
    }


    public SVGImageView a;
    public ImageView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public AnimatorSet f;
    public boolean g;
    public boolean h;
    private Context i;
    private ImageButton j;
    private ImageButton k;
    private ProgressBar l;
    private ImageButton m;
    private TakeSnapButton n;
    private ViewGroup o;
    private ViewGroup p;
    private a q;
    private boolean r;
    private int s;

    public ProfilePictureView(Context context)
    {
        super(context);
        g = false;
        h = false;
        r = false;
        s = 0;
        i = context;
    }

    public ProfilePictureView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = false;
        h = false;
        r = false;
        s = 0;
        i = context;
    }

    public ProfilePictureView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = false;
        h = false;
        r = false;
        s = 0;
        i = context;
    }

    static TextView a(ProfilePictureView profilepictureview)
    {
        return profilepictureview.c;
    }

    static TextView b(ProfilePictureView profilepictureview)
    {
        return profilepictureview.d;
    }

    static TextView c(ProfilePictureView profilepictureview)
    {
        return profilepictureview.e;
    }

    static a d(ProfilePictureView profilepictureview)
    {
        return profilepictureview.q;
    }

    static ImageView e(ProfilePictureView profilepictureview)
    {
        return profilepictureview.b;
    }

    public final void a(boolean flag)
    {
        if (r != flag)
        {
            r = flag;
            ImageButton imagebutton = j;
            float f1;
            if (flag)
            {
                f1 = 0.8F;
            } else
            {
                f1 = 0.14F;
            }
            imagebutton.setAlpha(f1);
        }
    }

    public final void b(boolean flag)
    {
        if (flag)
        {
            k.setVisibility(8);
            l.setVisibility(0);
            return;
        }
        if (s == 0)
        {
            k.setVisibility(0);
        }
        l.setVisibility(8);
    }

    public void onClick(View view)
    {
        if (q != null && !g && h)
        {
            boolean flag;
            if (l != null && l.getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                int i1 = view.getId();
                if (i1 == 0x7f0d03da)
                {
                    if (r)
                    {
                        view = new android.app.AlertDialog.Builder(getContext());
                        view.setMessage(0x7f080202).setPositiveButton(0x7f080201, new android.content.DialogInterface.OnClickListener() {

                            private ProfilePictureView a;

                            public final void onClick(DialogInterface dialoginterface, int j1)
                            {
                                ProfilePictureView.d(a).t();
                            }

            
            {
                a = ProfilePictureView.this;
                super();
            }
                        }).setNegativeButton(0x7f08007f, new android.content.DialogInterface.OnClickListener() {

                            public final void onClick(DialogInterface dialoginterface, int j1)
                            {
                                dialoginterface.dismiss();
                            }

                        });
                        view.create().show();
                        return;
                    }
                } else
                {
                    if (i1 == 0x7f0d03dc)
                    {
                        q.u();
                        return;
                    }
                    if (i1 == 0x7f0d03df)
                    {
                        q.q();
                        return;
                    } else
                    {
                        q.p();
                        return;
                    }
                }
            }
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        j = (ImageButton)findViewById(0x7f0d03da);
        k = (ImageButton)findViewById(0x7f0d03dc);
        l = (ProgressBar)findViewById(0x7f0d03dd);
        m = (ImageButton)findViewById(0x7f0d03e0);
        n = (TakeSnapButton)findViewById(0x7f0d03df);
        c = (TextView)findViewById(0x7f0d03d7);
        d = (TextView)findViewById(0x7f0d03d8);
        e = (TextView)findViewById(0x7f0d03d9);
        p = (ViewGroup)findViewById(0x7f0d03de);
        o = (ViewGroup)findViewById(0x7f0d03d6);
        o.setLayerType(1, null);
        j.setOnTouchListener(new Id(j));
        k.setOnTouchListener(new Id(k));
        m.setOnTouchListener(new Id(m));
        setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
    }

    public void setCallback(a a1)
    {
        q = a1;
    }

    public void setProfilePicturesControlButtonsVisibility(int i1)
    {
        if (s != i1)
        {
            j.setVisibility(i1);
            k.setVisibility(i1);
            m.setVisibility(i1);
            n.setVisibility(i1);
            p.setVisibility(i1);
            s = i1;
        }
    }

    public void setSnapcodeSvg(cn cn)
    {
        if (a == null)
        {
            Object obj = getResources().getDisplayMetrics();
            b = new ImageView(i);
            b.setBackgroundColor(-1);
            b.setVisibility(4);
            int i1 = (int)((double)((DisplayMetrics) (obj)).widthPixels * 0.73599999999999999D);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(i1, i1);
            layoutparams.addRule(13, -1);
            o.addView(b, layoutparams);
            a = new SVGImageView(i);
            i1 = (int)((float)((DisplayMetrics) (obj)).widthPixels * 0.89F);
            obj = new android.widget.RelativeLayout.LayoutParams(i1, i1);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13, -1);
            o.addView(a, ((android.view.ViewGroup.LayoutParams) (obj)));
            a.setVisibility(4);
        }
        a.setSVG(cn);
    }

    static 
    {
        com/snapchat/android/ui/ProfilePictureView.getSimpleName();
    }

    // Unreferenced inner class com/snapchat/android/ui/ProfilePictureView$1

/* anonymous class */
    public final class _cls1
        implements android.animation.Animator.AnimatorListener
    {

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

    }


    // Unreferenced inner class com/snapchat/android/ui/ProfilePictureView$2

/* anonymous class */
    public final class _cls2
        implements android.animation.Animator.AnimatorListener
    {

        private ProfilePictureView a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            ProfilePictureView.a(a).setScaleX(1.0F);
            ProfilePictureView.a(a).setScaleY(1.0F);
            ProfilePictureView.a(a).setAlpha(0.0F);
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

            public 
            {
                a = ProfilePictureView.this;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/ui/ProfilePictureView$3

/* anonymous class */
    public final class _cls3
        implements android.animation.Animator.AnimatorListener
    {

        private ProfilePictureView a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            ProfilePictureView.b(a).setScaleX(1.0F);
            ProfilePictureView.b(a).setScaleY(1.0F);
            ProfilePictureView.b(a).setAlpha(0.0F);
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

            public 
            {
                a = ProfilePictureView.this;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/ui/ProfilePictureView$4

/* anonymous class */
    public final class _cls4
        implements android.animation.Animator.AnimatorListener
    {

        private ProfilePictureView a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            ProfilePictureView.c(a).setScaleX(1.0F);
            ProfilePictureView.c(a).setScaleY(1.0F);
            ProfilePictureView.c(a).setAlpha(0.0F);
            ProfilePictureView.d(a).s();
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

            public 
            {
                a = ProfilePictureView.this;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/ui/ProfilePictureView$5

/* anonymous class */
    public final class _cls5
        implements android.animation.Animator.AnimatorListener
    {

        private ProfilePictureView a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            ProfilePictureView.e(a).setVisibility(4);
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
            ProfilePictureView.e(a).setVisibility(0);
        }

            public 
            {
                a = ProfilePictureView.this;
                super();
            }
    }

}
