// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import okio.e;

public interface l
{

    public static final l a = new l() {

        public final boolean a()
        {
            return true;
        }

        public final boolean a(e e1, int i)
            throws IOException
        {
            e1.f(i);
            return true;
        }

        public final boolean b()
        {
            return true;
        }

        public final void c()
        {
        }

    };

    public abstract boolean a();

    public abstract boolean a(e e, int i)
        throws IOException;

    public abstract boolean b();

    public abstract void c();

}
