// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import android.graphics.Paint;
import android.text.TextUtils;
import com.arist.c.c;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.arist.model.lrc:
//            h, g

public final class f
{

    public boolean a;
    private String b;
    private String c;
    private String d;
    private String e;
    private List f;
    private Pattern g;
    private Pattern h;
    private Pattern i;
    private Pattern j;
    private String k;

    public f()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = new ArrayList();
        g = Pattern.compile("\\[ti:(.+?)\\]");
        h = Pattern.compile("\\[ar:(.+?)\\]");
        i = Pattern.compile("\\[al:(.+?)\\]");
        j = Pattern.compile("\\[by:(.+?)\\]");
        k = "GBK";
        a = false;
    }

    private static void a(BufferedReader bufferedreader)
    {
        if (bufferedreader == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        bufferedreader.close();
        return;
        bufferedreader;
        bufferedreader.printStackTrace();
        return;
    }

    private void b(String s)
    {
        int l;
        int i1;
        boolean flag;
        flag = false;
        s = s.split("\\]");
        i1 = 0;
        l = 0;
_L3:
        if (i1 < s.length) goto _L2; else goto _L1
_L1:
        i1 = ((flag) ? 1 : 0);
_L4:
        if (i1 >= l)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_83;
_L2:
        String as[] = s[i1].split("\\[");
        s[i1] = as[as.length - 1];
        int j1 = l;
        if (c(s[i1]))
        {
            j1 = l + 1;
        }
        i1++;
        l = j1;
          goto _L3
        h h1 = new h();
        h1.a(s[i1]);
        if (l < s.length)
        {
            h1.b(s[s.length - 1]);
        }
        f.add(h1);
        i1++;
          goto _L4
    }

    private static boolean c(String s)
    {
        int l;
        s = s.split(":|\\.");
        if (3 != s.length)
        {
            return false;
        }
        l = 0;
        do
        {
            if (l >= s.length)
            {
                return true;
            }
            try
            {
                Integer.parseInt(s[l]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            l++;
        } while (true);
    }

    public final int a(long l)
    {
        int j1 = -1;
        do
        {
            int i1;
            for (i1 = 0; i1 >= f.size() || ((h)f.get(i1)).a() > (double)l;)
            {
                return j1;
            }

            j1 = i1;
            i1++;
        } while (true);
    }

    public final String a(int l)
    {
        String s;
        try
        {
            s = ((h)f.get(l)).b();
        }
        catch (Exception exception)
        {
            return "";
        }
        return s;
    }

    public final void a(Paint paint, int l)
    {
        Iterator iterator = f.iterator();
_L2:
        h h1;
        String s2;
        do
        {
            if (!iterator.hasNext())
            {
                a = true;
                return;
            }
            h1 = (h)iterator.next();
            s2 = h1.b();
        } while (paint.measureText(s2) <= (float)l);
        int j1 = 0;
        String s = "";
        int i1 = 1;
        do
        {
label0:
            {
                if (i1 < s2.length())
                {
                    break label0;
                }
                h1.b((new StringBuilder(String.valueOf(s))).append(s2.substring(j1)).toString());
            }
            if (true)
            {
                continue;
            }
            String s1 = s;
            int k1 = j1;
            if (paint.measureText(s2.substring(j1, i1)) > (float)l)
            {
                s1 = (new StringBuilder(String.valueOf(s))).append(s2.substring(j1, i1 - 1)).append("\n").toString();
                k1 = i1 - 1;
            }
            i1++;
            s = s1;
            j1 = k1;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(String s)
    {
        b = null;
        c = null;
        d = null;
        e = null;
        a = false;
        f.clear();
        if (s == null)
        {
            return;
        }
        Object obj1 = new BufferedReader(new InputStreamReader(new FileInputStream(s), k));
_L6:
        Object obj = obj1;
        String s1 = ((BufferedReader) (obj1)).readLine();
        if (s1 != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (!a()) goto _L4; else goto _L3
_L3:
        obj = obj1;
        com.arist.c.c.c(s);
        a(((BufferedReader) (obj1)));
        return;
_L2:
        obj = obj1;
        if (TextUtils.isEmpty(s1)) goto _L6; else goto _L5
_L5:
        obj = obj1;
        if (b != null) goto _L8; else goto _L7
_L7:
        obj = obj1;
        Matcher matcher = g.matcher(s1);
        obj = obj1;
        if (!matcher.find()) goto _L10; else goto _L9
_L9:
        obj = obj1;
        b = matcher.group(1);
        boolean flag = true;
          goto _L11
_L8:
        obj = obj1;
        if (c != null) goto _L13; else goto _L12
_L12:
        obj = obj1;
        matcher = h.matcher(s1);
        obj = obj1;
        if (!matcher.find()) goto _L15; else goto _L14
_L14:
        obj = obj1;
        c = matcher.group(1);
        flag = true;
          goto _L16
_L13:
        obj = obj1;
        if (d != null) goto _L18; else goto _L17
_L17:
        obj = obj1;
        matcher = i.matcher(s1);
        obj = obj1;
        if (!matcher.find()) goto _L20; else goto _L19
_L19:
        obj = obj1;
        d = matcher.group(1);
        flag = true;
          goto _L21
_L18:
        obj = obj1;
        if (e != null) goto _L23; else goto _L22
_L22:
        obj = obj1;
        matcher = j.matcher(s1);
        obj = obj1;
        if (!matcher.find()) goto _L25; else goto _L24
_L24:
        obj = obj1;
        e = matcher.group(1);
        flag = true;
          goto _L26
_L23:
        obj = obj1;
        try
        {
            b(s1);
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s = ((String) (obj1));
            obj1 = obj;
        }
        finally { }
_L27:
        obj = s;
        ((Exception) (obj1)).printStackTrace();
        a(((BufferedReader) (s)));
        return;
_L10:
        flag = false;
        break; /* Loop/switch isn't completed */
_L15:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L20:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L25:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = obj1;
        Collections.sort(f, new g(this));
        a(((BufferedReader) (obj1)));
        return;
        s;
        obj = null;
        a(((BufferedReader) (obj)));
        throw s;
        obj1;
        s = null;
        if (true) goto _L27; else goto _L11
_L11:
        if (flag) goto _L28; else goto _L8
_L28:
        break; /* Loop/switch isn't completed */
_L16:
        if (flag) goto _L29; else goto _L13
_L29:
        break; /* Loop/switch isn't completed */
_L21:
        if (flag) goto _L30; else goto _L18
_L30:
        break; /* Loop/switch isn't completed */
_L26:
        if (flag) goto _L6; else goto _L23
    }

    public final boolean a()
    {
        return b() == 0;
    }

    public final int b()
    {
        return f.size();
    }
}
