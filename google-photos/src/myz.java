// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.StatFs;

final class myz
    implements mza
{

    myz()
    {
    }

    public final long a()
    {
        return myy.d().getTotalBytes();
    }

    public final long b()
    {
        return myy.d().getFreeBytes();
    }
}
