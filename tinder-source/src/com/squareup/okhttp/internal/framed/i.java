// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            d, ErrorCode

public interface i
{

    public static final i a = new i() {

        public final void a(d d1)
            throws IOException
        {
            d1.a(ErrorCode.k);
        }

    };

    public abstract void a(d d)
        throws IOException;

}
