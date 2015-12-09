// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import com.appboy.d.a.c;
import com.appboy.f;
import com.appboy.f.a;
import com.appboy.ui.t;

// Referenced classes of package com.appboy.ui.widget:
//            c

public class j extends com.appboy.ui.widget.c
{

    private static final String d;

    public j(Context context)
    {
        this(context, (byte)0);
    }

    private j(Context context, byte byte0)
    {
        super(context);
    }

    protected final int a()
    {
        return t.d;
    }

    public final void a(c c1)
    {
        com.appboy.f.a.c(d, (new StringBuilder("onSetCard called for blank view with: ")).append(c1.toString()).toString());
    }

    static 
    {
        d = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/widget/j.getName()
        });
    }
}
