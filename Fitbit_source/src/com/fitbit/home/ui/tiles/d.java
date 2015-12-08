// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Date;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            e

public abstract class d
{

    private Context a;

    public d()
    {
    }

    public abstract void O_();

    public abstract View a(ViewGroup viewgroup);

    public final void a(Context context)
    {
        a = context;
    }

    public abstract void a(Date date);

    public abstract void b(e e);

    public abstract CharSequence f();

    public final Context i()
    {
        return a;
    }
}
