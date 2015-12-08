// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;

final class bzu
    implements cad
{

    private final int b;
    private String c;

    public bzu(int i)
    {
        b = i;
    }

    public final String a(Context context)
    {
        if (c == null)
        {
            c = (new File(new File(context.getCacheDir(), context.getString(c.af)), context.getString(b))).getAbsolutePath();
        }
        return c;
    }
}
