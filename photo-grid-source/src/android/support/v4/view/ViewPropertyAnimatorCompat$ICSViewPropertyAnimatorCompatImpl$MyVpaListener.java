// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener, ViewPropertyAnimatorCompat, ViewCompat

class mVpa
    implements ViewPropertyAnimatorListener
{

    ViewPropertyAnimatorCompat mVpa;

    public void onAnimationCancel(View view)
    {
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof ViewPropertyAnimatorListener)
        {
            obj = (ViewPropertyAnimatorListener)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((ViewPropertyAnimatorListener) (obj)).onAnimationCancel(view);
        }
    }

    public void onAnimationEnd(View view)
    {
        if (ViewPropertyAnimatorCompat.access$400(mVpa) >= 0)
        {
            ViewCompat.setLayerType(view, ViewPropertyAnimatorCompat.access$400(mVpa), null);
            ViewPropertyAnimatorCompat.access$402(mVpa, -1);
        }
        if (ViewPropertyAnimatorCompat.access$000(mVpa) != null)
        {
            ViewPropertyAnimatorCompat.access$000(mVpa).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof ViewPropertyAnimatorListener)
        {
            obj = (ViewPropertyAnimatorListener)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((ViewPropertyAnimatorListener) (obj)).onAnimationEnd(view);
        }
    }

    public void onAnimationStart(View view)
    {
        if (ViewPropertyAnimatorCompat.access$400(mVpa) >= 0)
        {
            ViewCompat.setLayerType(view, 2, null);
        }
        if (ViewPropertyAnimatorCompat.access$100(mVpa) != null)
        {
            ViewPropertyAnimatorCompat.access$100(mVpa).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof ViewPropertyAnimatorListener)
        {
            obj = (ViewPropertyAnimatorListener)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((ViewPropertyAnimatorListener) (obj)).onAnimationStart(view);
        }
    }

    (ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        mVpa = viewpropertyanimatorcompat;
    }
}
