// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.a;

import java.io.IOException;
import java.io.OutputStream;

public interface e
{

    public abstract int a(String s, OutputStream outputstream)
        throws IOException;

    public abstract int a(byte abyte0[], int i, int j, OutputStream outputstream)
        throws IOException;

    public abstract int b(byte abyte0[], int i, int j, OutputStream outputstream)
        throws IOException;
}
