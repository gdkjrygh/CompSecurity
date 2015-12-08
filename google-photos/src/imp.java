// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class imp
{

    public long a;
    public long b;
    public long c;

    public imp()
    {
        a = -1L;
        b = -1L;
        c = -1L;
    }

    public static imp a(mue mue1)
    {
        imp imp1 = new imp();
        if (mue1 != null)
        {
            mue1 = mue1.a();
            imp1.a = mue1.getLong("file_size");
            imp1.b = mue1.getLong("available_data");
            imp1.c = mue1.getLong("trash_size");
        }
        return imp1;
    }
}
