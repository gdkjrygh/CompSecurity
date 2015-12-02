// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.support.v7.internal.view.ActionModeWrapper;
import android.support.v7.internal.view.ActionModeWrapperJB;
import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//            e, k, ActionBarActivity, ActionBar

class f extends e
{

    f(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    public ActionBar a()
    {
        return new k(a, a);
    }

    ActionModeWrapper a(Context context, ActionMode actionmode)
    {
        return new ActionModeWrapperJB(context, actionmode);
    }
}
