// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.g;

import android.util.Log;
import java.io.Writer;

public final class d extends Writer
{

    private final String a;
    private StringBuilder b;

    public d(String s)
    {
        b = new StringBuilder(128);
        a = s;
    }

    private void a()
    {
        if (b.length() > 0)
        {
            Log.d(a, b.toString());
            b.delete(0, b.length());
        }
    }

    public final void close()
    {
        a();
    }

    public final void flush()
    {
        a();
    }

    public final void write(char ac[], int i, int j)
    {
        int k = 0;
        while (k < j) 
        {
            char c = ac[i + k];
            if (c == '\n')
            {
                a();
            } else
            {
                b.append(c);
            }
            k++;
        }
    }
}
