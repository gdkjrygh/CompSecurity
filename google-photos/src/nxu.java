// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class nxu extends IOException
{

    public final int a;

    public nxu(int i, String s)
    {
        super((new StringBuilder(String.valueOf(s).length() + 13)).append(i).append(": ").append(s).toString());
        a = i;
    }
}
