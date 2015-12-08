// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common.byteSources;

import java.io.InputStream;
import org.apache.sanselan.common.BinaryFileFunctions;

public abstract class ByteSource extends BinaryFileFunctions
{

    protected final String b = null;

    public ByteSource()
    {
    }

    public abstract InputStream b();

    public abstract byte[] b(int i, int j);

    public abstract long c();
}
