// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.emojipicker;

import Id;
import Jo;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import cT;
import com.snapchat.android.analytics.ui.EmojiPickerAnalytics;

// Referenced classes of package com.snapchat.android.ui.emojipicker:
//            EmojiMovableImageView

public final class EmojiDeletionHandler
{
    public static final class SizeChangeType extends Enum
    {

        private static final SizeChangeType $VALUES[];
        public static final SizeChangeType ENLARGE;
        public static final SizeChangeType SHRINK;

        public static SizeChangeType valueOf(String s)
        {
            return (SizeChangeType)Enum.valueOf(com/snapchat/android/ui/emojipicker/EmojiDeletionHandler$SizeChangeType, s);
        }

        public static SizeChangeType[] values()
        {
            return (SizeChangeType[])$VALUES.clone();
        }

        static 
        {
            ENLARGE = new SizeChangeType("ENLARGE", 0);
            SHRINK = new SizeChangeType("SHRINK", 1);
            $VALUES = (new SizeChangeType[] {
                ENLARGE, SHRINK
            });
        }

        private SizeChangeType(String s, int i)
        {
            super(s, i);
        }
    }


    Id a;
    View b;
    View c;
    boolean d;
    EmojiPickerAnalytics e;
    private Id f;
    private Context g;
    private boolean h;

    public EmojiDeletionHandler(Context context, View view, Id id, View view1, EmojiPickerAnalytics emojipickeranalytics)
    {
        d = false;
        h = false;
        g = context;
        b = view;
        c = view1;
        a = id;
        f = new Id(c);
        e = emojipickeranalytics;
        c.setScaleX(0.5F);
        c.setScaleY(0.5F);
    }

    public final void a()
    {
        d = false;
        a.a(true);
        b.setClickable(true);
        c.animate().scaleX(0.5F).scaleY(0.5F).setDuration(200L).start();
        c.animate().alpha(0.0F).setDuration(200L).start();
        b.animate().scaleX(1.0F).scaleY(1.0F).setDuration(200L).start();
    }

    public final void a(MotionEvent motionevent, EmojiMovableImageView emojimovableimageview)
    {
        boolean flag = a(new float[] {
            motionevent.getRawX(), motionevent.getRawY()
        });
        if (flag)
        {
            emojimovableimageview.setAlpha(0.5F);
        } else
        {
            emojimovableimageview.setAlpha(1.0F);
        }
        if (flag && !h)
        {
            h = true;
            a(SizeChangeType.ENLARGE);
        } else
        if (!flag && h)
        {
            h = false;
            a(SizeChangeType.SHRINK);
            return;
        }
    }

    public final void a(SizeChangeType sizechangetype)
    {
        float f1;
        if (sizechangetype == SizeChangeType.ENLARGE)
        {
            f1 = 1.3F;
        } else
        {
            f1 = 1.0F;
        }
        sizechangetype = f;
        sizechangetype.mEndSize = f1;
        if (((Id) (sizechangetype)).mSpring != null)
        {
            ((Id) (sizechangetype)).mSpring.b(f1);
        }
    }

    public final boolean a(float af[])
    {
        float f2 = Jo.a(30F, g);
        int ai[] = new int[2];
        b.getLocationOnScreen(ai);
        float f1 = f2;
        if (h)
        {
            f1 = f2 + Jo.a(10F, g);
        }
        return (new RectF((float)ai[0] - f1, (float)ai[1] - f1, (float)(ai[0] + b.getWidth()) + f1, f1 + (float)(ai[1] + b.getHeight()))).contains(af[0], af[1]);
    }

    // Unreferenced inner class com/snapchat/android/ui/emojipicker/EmojiDeletionHandler$1

/* anonymous class */
    final class _cls1
        implements android.view.animation.Animation.AnimationListener
    {

        private EmojiMovableImageView a;

        public final void onAnimationEnd(Animation animation)
        {
            ((ViewGroup)a.getParent()).removeView(a);
        }

        public final void onAnimationRepeat(Animation animation)
        {
        }

        public final void onAnimationStart(Animation animation)
        {
        }

            
            {
                a = emojimovableimageview;
                super();
            }
    }

}
