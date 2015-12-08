// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.async;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import com.skype.android.util.Conditional;

final class a
    implements Conditional
{

    private Object a;

    public a(Object obj)
    {
        a = obj;
    }

    public final boolean a()
    {
        if (a instanceof Activity)
        {
            return !((Activity)a).isFinishing();
        }
        if (a instanceof Fragment)
        {
            Fragment fragment = (Fragment)a;
            return fragment.isResumed() || fragment.isVisible();
        }
        if (a instanceof View)
        {
            return ((View)a).isShown();
        } else
        {
            return true;
        }
    }
}
