// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener, ViewPropertyAnimatorCompat, ViewCompat

class a
    implements ViewPropertyAnimatorListener
{

    ViewPropertyAnimatorCompat a;

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
        if (ViewPropertyAnimatorCompat.c(a) >= 0)
        {
            ViewCompat.a(view, ViewPropertyAnimatorCompat.c(a), null);
            ViewPropertyAnimatorCompat.a(a, -1);
        }
        if (ViewPropertyAnimatorCompat.b(a) != null)
        {
            ViewPropertyAnimatorCompat.b(a).run();
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
        if (ViewPropertyAnimatorCompat.c(a) >= 0)
        {
            ViewCompat.a(view, 2, null);
        }
        if (ViewPropertyAnimatorCompat.a(a) != null)
        {
            ViewPropertyAnimatorCompat.a(a).run();
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
        a = viewpropertyanimatorcompat;
    }
}
