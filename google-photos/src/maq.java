// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class maq
    implements maa
{

    public static final mau a = new mar();
    private final Status b;

    public maq(Status status)
    {
        b = status;
    }

    public final boolean a()
    {
        return b.b();
    }

    public final int b()
    {
        return b.g;
    }

    public final maa r()
    {
        return this;
    }

    public final String toString()
    {
        return b.toString();
    }

}
