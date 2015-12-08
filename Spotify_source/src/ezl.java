// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

public final class ezl
    implements faj
{

    private final faj a;
    private final ArrayList b;

    public transient ezl(faj faj1, Object aobj[])
    {
        a = faj1;
        b = new ArrayList(Arrays.asList(aobj));
    }

    public final String a(Context context)
    {
        b.add(0, a.a(context));
        return context.getString(0x7f0803f8, b.toArray());
    }
}
