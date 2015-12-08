// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.ContextThemeWrapper;

// Referenced classes of package android.support.v7.app:
//            m, f

public final class n
{

    public final f a;
    public int b;

    public n(Context context)
    {
        this(context, m.a(context, 0));
    }

    private n(Context context, int i)
    {
        a = new f(new ContextThemeWrapper(context, m.a(context, i)));
        b = i;
    }
}
