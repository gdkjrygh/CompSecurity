// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface gx
{

    public abstract void a(OutputStream outputstream, Object obj)
        throws IOException;

    public abstract Object b(InputStream inputstream)
        throws IOException;
}
