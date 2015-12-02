// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.qihoo.antivirus.update:
//            h, aa, aj, u, 
//            s, q

public class j
{

    public j()
    {
    }

    private boolean a(h h1, q q1)
    {
        if (h1 == null || q1 == null)
        {
            return false;
        }
        ArrayList arraylist1 = h1.c();
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            arraylist = new ArrayList();
            h1.c(arraylist);
        }
        return arraylist.add(q1);
    }

    private boolean a(h h1, s s1)
    {
        if (h1 == null || s1 == null)
        {
            return false;
        }
        ArrayList arraylist1 = h1.b();
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            arraylist = new ArrayList();
            h1.b(arraylist);
        }
        return arraylist.add(s1);
    }

    private boolean a(h h1, u u1)
    {
        if (h1 == null || u1 == null)
        {
            return false;
        }
        ArrayList arraylist1 = h1.a();
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            arraylist = new ArrayList();
            h1.a(arraylist);
        }
        return arraylist.add(u1);
    }

    public h a(Context context, String s1)
    {
        aa aa1;
        h h1;
        Iterator iterator;
        aa1 = new aa(s1, Charset.forName("UTF-8"), true);
        h1 = new h();
        iterator = aa1.a();
_L3:
        int k;
        if (!iterator.hasNext())
        {
            return h1;
        }
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        String s10;
        String s11;
        String s12;
        String s13;
        String s14;
        String s15;
        String s16;
        String s17;
        String s18;
        int i;
        boolean flag;
        int l;
        long l1;
        long l2;
        try
        {
            s10 = (String)iterator.next();
            s3 = aa1.a(s10, "patch_url");
            s4 = aa1.a(s10, "patch_size");
            s5 = aa1.a(s10, "patch_md5");
            s6 = aa1.a(s10, "diff_method");
            s7 = aa1.a(s10, "url");
            s8 = aa1.a(s10, "size");
            s9 = aa1.a(s10, "md5");
            s2 = aa1.a(s10, "ver");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        s1 = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        s1 = aa1.a(s10, "version");
        s2 = aa1.a(s10, "code");
        s11 = aa1.a(s10, "path");
        s12 = aa1.a(s10, "description");
        s13 = aa1.a(s10, "flag");
        s14 = aa1.a(s10, "file_exists");
        s15 = aa1.a(s10, "package_exists");
        s16 = aa1.a(s10, "package_ver");
        s17 = aa1.a(s10, "file_exists_rule");
        s18 = aa1.a(s10, "package_exists_rule");
        s10 = aa1.a(s10, "package_ver_rule");
        if (s13 == null)
        {
            break MISSING_BLOCK_LABEL_507;
        }
        l = Integer.parseInt(s13);
        l1 = 0L;
        if (s8 == null)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        l1 = Long.parseLong(s8);
        l2 = 0L;
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        l2 = Long.parseLong(s4);
        i = -1;
        if (s6 == null)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        i = Integer.valueOf(s6).intValue();
        if ((l & 1) > 0)
        {
            k = 0;
        } else
        {
            k = 1;
        }
        if ((l & 4) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k == 0) goto _L2; else goto _L1
_L1:
        k = aj.a(context, s14, s15, s16, s17, s18, s10);
        if (k < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_429;
        }
        if ((l & 2) != 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        a(h1, new u(s3, s5, l2, i, s7, s9, l1, s1, s2, s12, k));
          goto _L3
        a(h1, new s(s11, s3, s5, l2, i, s7, s9, l1, l, s1));
          goto _L3
_L2:
        if (s11 == null) goto _L3; else goto _L4
_L4:
        a(h1, new q(s11));
          goto _L3
        context;
        return null;
        return null;
        context;
        return null;
        context;
        return null;
        context;
        return null;
        if (k == -3) goto _L3; else goto _L5
_L5:
        return null;
    }
}
