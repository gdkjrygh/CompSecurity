// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a.a;

import com.google.android.apps.gsa.speech.audio.c;
import com.google.android.apps.gsa.speech.audio.d;
import com.google.common.base.s;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.apps.gsa.a.a:
//            a

final class b
    implements s
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    private InputStream a()
    {
        InputStream inputstream;
        try
        {
            inputstream = a.e.a(a.d).a;
        }
        catch (IOException ioexception)
        {
            a.e.a();
            throw new RuntimeException("Error creating input stream");
        }
        return inputstream;
    }

    public final Object get()
    {
        return a();
    }
}
