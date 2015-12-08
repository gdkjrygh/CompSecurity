// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.translate.e;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.o;
import com.google.protobuf.nano.g;
import java.io.IOException;

public final class a
{

    public final Context a;
    public final com.google.g.a.a.e b = b();

    public a(Context context)
    {
        a = context;
    }

    private com.google.g.a.a.e b()
    {
        com.google.g.a.a.e e1;
        try
        {
            byte abyte0[] = d.b(a.getResources().openRawResource(e.speech_config));
            e1 = (com.google.g.a.a.e)g.mergeFrom(new com.google.g.a.a.e(), abyte0);
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return e1;
    }

    public final boolean a()
    {
        return b != null && o.b(a);
    }
}
