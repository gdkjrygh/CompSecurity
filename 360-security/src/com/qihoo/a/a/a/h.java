// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.a.a.a;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

// Referenced classes of package com.qihoo.a.a.a:
//            e, f

public class h
{

    private static final String a = com/qihoo/a/a/a/e.getSimpleName();
    private static final char b[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static final String a(Context context, String s)
    {
        context = context.getAssets().open(s);
        s = a(((InputStream) (context)));
        f.a(context);
        return s;
        context;
        context = null;
_L4:
        f.a(context);
        return null;
        context;
        Object obj;
        obj = null;
        s = context;
_L2:
        f.a(((InputStream) (obj)));
        throw s;
        s;
        obj = context;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static final String a(InputStream inputstream)
    {
        inputstream = f.b(inputstream);
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        if (inputstream.length <= 0)
        {
            return null;
        }
        inputstream = a(((byte []) (inputstream)));
        return inputstream;
        inputstream;
        return null;
    }

    public static final String a(String s, String s1)
    {
        s = new FileInputStream((new StringBuilder(String.valueOf(s))).append(File.separator).append(s1).toString());
        s1 = a(((InputStream) (s)));
        f.a(s);
        return s1;
        s;
        s = null;
_L4:
        f.a(s);
        return null;
        s;
        Object obj;
        obj = null;
        s1 = s;
_L2:
        f.a(((InputStream) (obj)));
        throw s1;
        s1;
        obj = s;
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static final String a(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int j = abyte0.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return stringbuilder.toString();
            }
            byte byte0 = abyte0[i];
            stringbuilder.append(b[(byte0 & 0xf0) >> 4]);
            stringbuilder.append(b[byte0 & 0xf]);
            i++;
        } while (true);
    }

}
