// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.ActionMode;
import p.g.b;
import p.g.c;

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

    b a(Context context, ActionMode actionmode)
    {
        return new c(context, actionmode);
    }
}
