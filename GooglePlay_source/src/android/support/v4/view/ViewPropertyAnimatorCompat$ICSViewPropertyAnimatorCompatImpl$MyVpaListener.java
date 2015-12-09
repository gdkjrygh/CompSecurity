// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener, ViewPropertyAnimatorCompat, ViewCompat

static final class mVpa
    implements ViewPropertyAnimatorListener
{

    ViewPropertyAnimatorCompat mVpa;

    public final void onAnimationCancel(View view)
    {
        Object obj = view.getTag(0x7e000000);
        ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
        if (obj instanceof ViewPropertyAnimatorListener)
        {
            viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
        }
        if (viewpropertyanimatorlistener != null)
        {
            viewpropertyanimatorlistener.onAnimationCancel(view);
        }
    }

    public final void onAnimationEnd(View view)
    {
        if (ViewPropertyAnimatorCompat.access$400(mVpa) >= 0)
        {
            ViewCompat.setLayerType(view, ViewPropertyAnimatorCompat.access$400(mVpa), null);
            int _tmp = ViewPropertyAnimatorCompat.access$402$3efd0312(mVpa);
        }
        ViewPropertyAnimatorCompat.access$000$65bc5e74();
        Object obj = view.getTag(0x7e000000);
        ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
        if (obj instanceof ViewPropertyAnimatorListener)
        {
            viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
        }
        if (viewpropertyanimatorlistener != null)
        {
            viewpropertyanimatorlistener.onAnimationEnd(view);
        }
    }

    public final void onAnimationStart(View view)
    {
        if (ViewPropertyAnimatorCompat.access$400(mVpa) >= 0)
        {
            ViewCompat.setLayerType(view, 2, null);
        }
        ViewPropertyAnimatorCompat.access$100$65bc5e74();
        Object obj = view.getTag(0x7e000000);
        ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
        if (obj instanceof ViewPropertyAnimatorListener)
        {
            viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
        }
        if (viewpropertyanimatorlistener != null)
        {
            viewpropertyanimatorlistener.onAnimationStart(view);
        }
    }

    (ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        mVpa = viewpropertyanimatorcompat;
    }
}
