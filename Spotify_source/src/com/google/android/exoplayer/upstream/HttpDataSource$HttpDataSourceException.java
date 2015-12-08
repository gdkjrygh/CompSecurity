// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import bde;
import java.io.IOException;

public class dataSpec extends IOException
{

    public final bde dataSpec;

    public (IOException ioexception, bde bde)
    {
        super(ioexception);
        dataSpec = bde;
    }

    public dataSpec(String s, bde bde)
    {
        super(s);
        dataSpec = bde;
    }

    public dataSpec(String s, IOException ioexception, bde bde)
    {
        super(s, ioexception);
        dataSpec = bde;
    }
}
