// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.usermedia;

import android.content.Context;
import android.os.Environment;
import com.kik.cards.web.bf;
import com.kik.m.e;
import com.kik.m.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kik.a.f.e.a;
import kik.a.h.f;
import kik.android.widget.cr;
import org.json.JSONArray;

// Referenced classes of package com.kik.cards.web.usermedia:
//            PhotoPlugin

private final class d
    implements Callable
{

    File a;
    String b;
    String c;
    Context d;
    com.kik.cards.web.plugin.a e;
    final PhotoPlugin f;

    private JSONArray a()
    {
        File file = Environment.getExternalStorageDirectory();
        if (file != null && file.exists()) goto _L2; else goto _L1
_L1:
        File file1 = null;
_L4:
        if (file1 == null)
        {
            throw new IOException();
        }
        break; /* Loop/switch isn't completed */
_L2:
        file1 = new File(file, "Kik");
        if (!file1.exists())
        {
            file1.mkdirs();
        }
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            {
                if (!kik.a.f.e.a.a(b))
                {
                    break label0;
                }
                String s = UUID.randomUUID().toString();
                Object obj = b;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = Pattern.compile("^data:(.*?)base64,(.*)").matcher(((CharSequence) (obj)));
                    String s1;
                    int i;
                    if (((Matcher) (obj)).matches())
                    {
                        obj = ((Matcher) (obj)).group(1);
                    } else
                    {
                        obj = null;
                    }
                }
                obj = k.c(((String) (obj)));
                if (obj != null)
                {
                    obj = (new StringBuilder()).append(s).append(".").append(((String) (obj))).toString();
                } else
                {
                    obj = s;
                }
                a = new File(file1, ((String) (obj)));
                obj = new FileOutputStream(a);
                ((FileOutputStream) (obj)).write(com.kik.m.e.c(kik.a.h.f.a(b).getBytes()));
                try
                {
                    ((FileOutputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((IOException) (obj)).printStackTrace();
                }
            }
            if (a != null && a.exists())
            {
                cr.a(d, a);
            }
            return null;
        }
        if (b == null || b.length() <= 0) goto _L6; else goto _L5
_L5:
        s = UUID.randomUUID().toString();
        obj = b;
        i = ((String) (obj)).lastIndexOf('.');
        if (i == -1) goto _L8; else goto _L7
_L7:
        i++;
        if (((String) (obj)).length() - i > 4) goto _L8; else goto _L9
_L9:
        obj = ((String) (obj)).substring(i, ((String) (obj)).length());
_L10:
        s1 = bf.a(b, c);
        if (s1 != null)
        {
            a = k.a(s1, file1, s, ((String) (obj)));
            if (a == null)
            {
                throw new IOException();
            }
        } else
        {
            throw new IOException();
        }
_L6:
        if (false)
        {
            break MISSING_BLOCK_LABEL_342;
        } else
        {
            break MISSING_BLOCK_LABEL_162;
        }
_L8:
        obj = null;
          goto _L10
    }

    public final Object call()
    {
        return a();
    }

    public (PhotoPlugin photoplugin, Context context, com.kik.cards.web.plugin.a a1, String s, String s1)
    {
        f = photoplugin;
        super();
        b = s;
        c = s1;
        e = a1;
        d = context;
    }
}
