// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

// Referenced classes of package android.support.v7.internal.widget:
//            av, ax

public final class au extends ContextWrapper
{

    private Resources a;

    private au(Context context)
    {
        super(context);
    }

    public static Context a(Context context)
    {
        Object obj = context;
        if (!(context instanceof au))
        {
            obj = new au(context);
        }
        return ((Context) (obj));
    }

    public final Resources getResources()
    {
        if (a == null)
        {
            a = new av(super.getResources(), ax.a(this));
        }
        return a;
    }
}
