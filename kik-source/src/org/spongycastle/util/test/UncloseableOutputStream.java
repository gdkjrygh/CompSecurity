// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.test;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class UncloseableOutputStream extends FilterOutputStream
{

    public void close()
    {
        throw new RuntimeException("close() called on UncloseableOutputStream");
    }

    public void write(byte abyte0[], int i, int j)
    {
        out.write(abyte0, i, j);
    }
}
