// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompatJB, ViewPropertyAnimatorListener

static class  extends 
{

    public void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        ViewPropertyAnimatorCompatJB.setListener(view, viewpropertyanimatorlistener);
    }

    public void withEndAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
    {
        ViewPropertyAnimatorCompatJB.withEndAction(view, runnable);
    }

    public void withLayer(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        ViewPropertyAnimatorCompatJB.withLayer(view);
    }

    public void withStartAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
    {
        ViewPropertyAnimatorCompatJB.withStartAction(view, runnable);
    }

    ()
    {
    }
}
