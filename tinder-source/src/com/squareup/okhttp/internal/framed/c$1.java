// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.f;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            c, ErrorCode

final class c extends f
{

    final int a;
    final ErrorCode c;
    final c d;

    public final void b()
    {
        try
        {
            d.b(a, c);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient rCode(c c1, String s, Object aobj[], int i, ErrorCode errorcode)
    {
        d = c1;
        a = i;
        c = errorcode;
        super(s, aobj);
    }
}
