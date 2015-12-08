// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.emojipicker;

import Gh;
import Id;
import Jo;
import LB;
import aP;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.ScaleAnimation;
import cn;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.ui.EmojiPickerAnalytics;
import com.snapchat.android.ui.MovableImageView;
import java.io.IOException;
import lC;

// Referenced classes of package com.snapchat.android.ui.emojipicker:
//            EmojiDeletionHandler

public class EmojiMovableImageView extends MovableImageView
{

    public EmojiDeletionHandler g;
    public String h;
    private double i;
    private Gh j;
    private LB k;

    public EmojiMovableImageView(Context context, String s, EmojiDeletionHandler emojideletionhandler, int l)
    {
        this(context, s, emojideletionhandler, Gh.a(), new LB(), l);
    }

    private EmojiMovableImageView(Context context, String s, EmojiDeletionHandler emojideletionhandler, Gh gh, LB lb, int l)
    {
        super(context, l);
        g = emojideletionhandler;
        i = b();
        h = s;
        j = gh;
        k = lb;
        context = j.b(s);
        if (context != null)
        {
            try
            {
                emojideletionhandler = Bitmap.createBitmap(200, 200, android.graphics.Bitmap.Config.ARGB_8888);
                context.a(new Canvas(emojideletionhandler));
                setImageBitmap(emojideletionhandler);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                k.a(new lC(s, context.toString()));
            }
            break MISSING_BLOCK_LABEL_134;
        }
        Timber.e(a, (new StringBuilder("Emoji ")).append(s).append(" rendered SVG is null").toString(), new Object[0]);
        return;
    }

    private double b()
    {
        switch (Jo.e(getContext()))
        {
        default:
            return 0.0D;

        case 1: // '\001'
            return 1.5707963267948966D;

        case 2: // '\002'
            return 3.1415926535897931D;

        case 3: // '\003'
            return -1.5707963267948966D;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        configuration = new int[2];
        float f = getScaleX();
        float f1 = getRotation();
        setPivotX(getWidth() / 2);
        setPivotY(getHeight() / 2);
        getLocationInWindow(configuration);
        setRotation(0.0F);
        setScaleX(1.0F);
        setScaleY(1.0F);
        getLocationInWindow(configuration);
        double d = i - b();
        i = b();
        ViewGroup viewgroup = (ViewGroup)getParent();
        float f2 = ((float)getWidth() * getScaleX()) / 2.0F;
        float f3 = configuration[0];
        float f4 = ((float)getHeight() * getScaleY()) / 2.0F;
        configuration = Jo.a(d, f2 + f3, (float)configuration[1] + f4, getWidth(), getHeight(), viewgroup.getHeight(), viewgroup.getWidth());
        a(configuration[0], configuration[1]);
        double d1 = f1;
        setRotation((float)(Math.toDegrees(d) + d1));
        setScaleX(f);
        setScaleY(f);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = super.onTouchEvent(motionevent);
        aP.a(motionevent);
        JVM INSTR tableswitch 0 6: default 56
    //                   0 74
    //                   1 245
    //                   2 175
    //                   3 56
    //                   4 56
    //                   5 59
    //                   6 225;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5 _L6
_L1:
        return flag1;
_L5:
        g.a(EmojiDeletionHandler.SizeChangeType.SHRINK);
        setAlpha(1.0F);
_L2:
        EmojiDeletionHandler emojideletionhandler = g;
        if (!emojideletionhandler.d)
        {
            emojideletionhandler.d = true;
            emojideletionhandler.a.a(false);
            emojideletionhandler.b.setClickable(false);
            emojideletionhandler.c.animate().scaleX(1.0F).scaleY(1.0F).setDuration(200L).start();
            emojideletionhandler.c.animate().alpha(1.0F).setDuration(200L).start();
            emojideletionhandler.b.animate().scaleX(0.0F).scaleY(0.0F).setDuration(200L).start();
        }
_L4:
        if (super.c >= super.b || super.d >= super.b)
        {
            flag = true;
        }
        if (flag && motionevent.getPointerCount() == 1)
        {
            g.a(motionevent, this);
            return flag1;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (motionevent.getPointerCount() == 2)
        {
            g.a(motionevent, this);
            return flag1;
        }
        if (true) goto _L1; else goto _L3
_L3:
        EmojiDeletionHandler emojideletionhandler1 = g;
        if (emojideletionhandler1.a(new float[] {
    motionevent.getRawX(), motionevent.getRawY()
}))
        {
            motionevent = new Point((int)motionevent.getX(), (int)motionevent.getY());
            motionevent = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 0, ((Point) (motionevent)).x, 0, ((Point) (motionevent)).y);
            motionevent.setAnimationListener(new EmojiDeletionHandler._cls1(this));
            motionevent.setDuration(200L);
            startAnimation(motionevent);
            emojideletionhandler1.a(EmojiDeletionHandler.SizeChangeType.SHRINK);
            motionevent = emojideletionhandler1.e;
            motionevent.e = ((EmojiPickerAnalytics) (motionevent)).e + 1;
        }
        emojideletionhandler1.a();
        return flag1;
    }
}
