// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bv;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pandora.android.activity.NowPlaying;
import com.pandora.android.coachmark.b;
import com.pandora.android.coachmark.d;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.ThumbImageButton;
import java.util.ArrayList;

public class c
{

    private static View a(Activity activity, int i)
    {
        try
        {
            activity = (new b(d.a(activity).b())).a(i);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return null;
        }
        return activity;
    }

    public static void a(Activity activity, ThumbImageButton thumbimagebutton)
    {
        boolean flag = false;
        if (!thumbimagebutton.isChecked()) goto _L2; else goto _L1
_L1:
        View view;
        return;
_L2:
        if ((view = a(activity, 0x7f100024)) == null) goto _L1; else goto _L3
_L3:
        float f;
        ImageView imageview;
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        com.pandora.android.personalization.view.c c1;
        int ai[];
        AnimatorSet animatorset;
        int ai1[];
        ArrayList arraylist;
        if (activity instanceof NowPlaying)
        {
            c1 = ((NowPlaying)activity).af();
        } else
        if (activity instanceof TabletHome)
        {
            c1 = ((TabletHome)activity).ao();
        } else
        {
            throw new IllegalArgumentException("Unknown activity that might not contain the ThumbAnimatedDrawable");
        }
        imageview = new ImageView(activity);
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        if (thumbimagebutton.getId() != 0x7f1001ac)
        {
            continue; /* Loop/switch isn't completed */
        }
        imageview.setImageResource(0x7f0201ea);
_L5:
        ai1 = new int[2];
        thumbimagebutton.getLocationInWindow(ai1);
        ai = new int[2];
        view.getLocationInWindow(ai);
        f1 = ai1[0];
        f2 = ai1[1];
        f = thumbimagebutton.getHeight();
        f4 = thumbimagebutton.getWidth();
        f8 = view.getHeight();
        f5 = view.getWidth();
        imageview.setX(ai1[0]);
        imageview.setY(ai1[1]);
        thumbimagebutton = new RelativeLayout(activity);
        thumbimagebutton.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        thumbimagebutton.addView(imageview, new android.widget.RelativeLayout.LayoutParams((int)f4, (int)f));
        activity = (ViewGroup)activity.getWindow().getDecorView();
        activity.addView(thumbimagebutton);
        f3 = ai[0];
        f5 /= 2.0F;
        f6 = f4 / 2.0F;
        f7 = ai[1];
        f8 /= 2.0F;
        f9 = f / 2.0F;
        if ((float)activity.getWidth() / f4 < (float)activity.getHeight() / f)
        {
            f = (float)activity.getWidth() / f4;
        } else
        {
            f = (float)activity.getHeight() / f;
        }
        f4 = (float)c1.a() / f4;
        arraylist = new ArrayList();
        animatorset = new AnimatorSet();
        arraylist.add(ObjectAnimator.ofFloat(imageview, "X", new float[] {
            f1, (f5 + f3) - f6
        }));
        arraylist.add(ObjectAnimator.ofFloat(imageview, "Y", new float[] {
            f2, (f7 + f8) - f9
        }));
        arraylist.add(ObjectAnimator.ofFloat(imageview, "alpha", new float[] {
            1.0F, 0.5F, 1.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(imageview, "scaleX", new float[] {
            1.0F, f, f4
        }));
        arraylist.add(ObjectAnimator.ofFloat(imageview, "scaleY", new float[] {
            1.0F, f, f4
        }));
        if (flag)
        {
            arraylist.add(ObjectAnimator.ofFloat(view, "rotation", new float[] {
                180F
            }));
        }
        animatorset.playTogether(arraylist);
        animatorset.addListener(new AnimatorListenerAdapter(activity, thumbimagebutton) {

            final ViewGroup a;
            final RelativeLayout b;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                a.removeView(b);
            }

            
            {
                a = viewgroup;
                b = relativelayout;
                super();
            }
        });
        activity = new AnimatorSet();
        activity.play(animatorset);
        if (flag)
        {
            activity.play(ObjectAnimator.ofFloat(view, "rotation", new float[] {
                0.0F
            })).after(animatorset);
        }
        activity.addListener(new AnimatorListenerAdapter(c1) {

            final com.pandora.android.personalization.view.c a;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                a.start();
            }

            
            {
                a = c1;
                super();
            }
        });
        activity.setDuration(500L);
        activity.start();
        return;
        if (thumbimagebutton.getId() != 0x7f1001ab) goto _L1; else goto _L4
_L4:
        imageview.setImageResource(0x7f0201e3);
        flag = true;
          goto _L5
    }
}
