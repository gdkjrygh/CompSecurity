// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Environment;
import java.io.File;

public class izu
{

    public static final long a;
    public static final File b = Environment.getDataDirectory();
    public final izs c;
    public final noz d;

    izu(Context context, izs izs)
    {
        c = izs;
        d = noz.a(context, 3, "LocalTrashStatus", new String[0]);
    }

    public static long a()
    {
        return a;
    }

    static 
    {
        a = (oqm.b.f * 3L) / 2L;
    }
}
