// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;

public class DESExample
{

    private boolean a;
    private PaddedBufferedBlockCipher b;
    private BufferedInputStream c;
    private BufferedOutputStream d;
    private byte e[];

    public DESExample()
    {
        a = true;
        b = null;
        c = null;
        d = null;
        e = null;
    }
}
