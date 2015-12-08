// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewPropertyAnimatorUpdateListener

static class  extends 
{

    public final void setUpdateListener$587f161e(View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
    {
        view.animate().setUpdateListener(new (viewpropertyanimatorupdatelistener, view));
    }

    ()
    {
    }
}
