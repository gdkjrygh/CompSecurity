// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.io;

import java.io.OutputStream;
import javax.crypto.Mac;

public class MacOutputStream extends OutputStream
{

    protected Mac a;

    public void write(int i)
    {
        a.update((byte)i);
    }

    public void write(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
    }
}
