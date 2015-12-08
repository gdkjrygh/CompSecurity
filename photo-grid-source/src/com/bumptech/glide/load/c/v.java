// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import android.util.Log;
import com.bumptech.glide.i.a;
import com.bumptech.glide.load.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class v
    implements b
{

    public v()
    {
    }

    private static boolean a(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = com.bumptech.glide.i.a.a().b();
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        inputstream;
        Log.isLoggable("StreamEncoder", 3);
        com.bumptech.glide.i.a.a().a(abyte0);
        return false;
        com.bumptech.glide.i.a.a().a(abyte0);
        return true;
        inputstream;
        com.bumptech.glide.i.a.a().a(abyte0);
        throw inputstream;
    }

    public final String a()
    {
        return "";
    }

    public final volatile boolean a(Object obj, OutputStream outputstream)
    {
        return a((InputStream)obj, outputstream);
    }
}
