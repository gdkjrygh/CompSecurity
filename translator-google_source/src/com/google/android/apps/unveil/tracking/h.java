// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.tracking;

import android.graphics.RectF;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.v;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Referenced classes of package com.google.android.apps.unveil.tracking:
//            f

final class h
{

    final int a;
    final int b;
    final ArrayList c;
    final f d;

    h(f f1, String s, int i, int j)
    {
        d = f1;
        super();
        a = i;
        c = new ArrayList();
        Object obj;
        Object obj1;
        boolean flag;
        flag = v.a(s);
        obj = v.b(s);
        obj1 = String.valueOf(obj);
        if (((String) (obj1)).length() == 0) goto _L2; else goto _L1
_L1:
        "Loading file from ".concat(((String) (obj1)));
_L8:
        obj1 = new BufferedReader(new InputStreamReader(v.a(f1.l, flag, ((String) (obj)))));
_L9:
        String s1 = ((BufferedReader) (obj1)).readLine();
        if (s1 == null) goto _L4; else goto _L3
_L3:
        obj = null;
        if (s1.startsWith("NaN,NaN,NaN,NaN")) goto _L6; else goto _L5
_L5:
        float f2;
        float f3;
        float f4;
        float f5;
        obj = new StringTokenizer(s1, ", ");
        f2 = Float.parseFloat(((StringTokenizer) (obj)).nextToken());
        f3 = Float.parseFloat(((StringTokenizer) (obj)).nextToken());
        f4 = Float.parseFloat(((StringTokenizer) (obj)).nextToken());
        f5 = Float.parseFloat(((StringTokenizer) (obj)).nextToken());
        if (f2 > f4 || f3 > f5)
        {
            try
            {
                throw new RuntimeException((new StringBuilder(String.valueOf(s1).length() + 21)).append("Invalid rectangle! '").append(s1).append("'").toString());
            }
            // Misplaced declaration of an exception variable
            catch (f f1)
            {
                f1 = String.valueOf(s);
                int k;
                if (f1.length() != 0)
                {
                    f1 = "Couldn't find file: ".concat(f1);
                } else
                {
                    f1 = new String("Couldn't find file: ");
                }
                throw new RuntimeException(f1);
            }
            // Misplaced declaration of an exception variable
            catch (f f1)
            {
                f1 = String.valueOf(s);
            }
            if (f1.length() != 0)
            {
                f1 = "Exception reading ".concat(f1);
            } else
            {
                f1 = new String("Exception reading ");
            }
            throw new RuntimeException(f1);
        }
          goto _L7
_L2:
        new String("Loading file from ");
          goto _L8
_L7:
        obj = new RectF(f2, f3, f4, f5);
_L6:
        c.add(obj);
          goto _L9
_L4:
        ((BufferedReader) (obj1)).close();
        if (j != -1)
        {
            b = j;
            k = (b - a) + 1;
            if (i > j || k != c.size())
            {
                f1.a.b("Track %s invalid! start:%d end:%d, read %d positions when expecting %d.", new Object[] {
                    s, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(c.size()), Integer.valueOf(k)
                });
                throw new RuntimeException("Invalid track!");
            }
        } else
        {
            b = (c.size() - 1) + a;
        }
        return;
          goto _L8
    }
}
