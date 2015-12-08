// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;

final class ilg
    implements olt
{

    final ContentResolver a;
    final String b;
    final boolean c = false;

    public ilg(Context context, String s, boolean flag)
    {
        a = context.getContentResolver();
        context = String.valueOf("photos:");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            context = context.concat(s);
        } else
        {
            context = new String(context);
        }
        b = context;
    }

    public final Object a()
    {
        return b.substring(7);
    }
}
