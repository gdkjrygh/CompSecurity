// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.ads.internal.adapters.i;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;

// Referenced classes of package com.facebook.ads.internal.util:
//            e, t, p

public class g
{

    public static Collection a(JSONArray jsonarray)
    {
        if (jsonarray == null || jsonarray.length() == 0)
        {
            return null;
        }
        HashSet hashset = new HashSet();
        for (int j = 0; j < jsonarray.length(); j++)
        {
            hashset.add(jsonarray.optString(j));
        }

        return hashset;
    }

    public static boolean a(Context context, i j)
    {
        e e1 = j.a();
        if (e1 != null && e1 != e.a) goto _L2; else goto _L1
_L1:
        Object obj;
        return false;
_L2:
        boolean flag;
        if ((obj = j.c()) == null || ((Collection) (obj)).isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((Collection) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
        } while (!a(context, (String)((Iterator) (obj)).next()));
        flag = true;
_L4:
        boolean flag1;
        if (e1 == e.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag == flag1)
        {
            context = j.b();
            if (!t.a(context))
            {
                (new p()).execute(new String[] {
                    context
                });
                return false;
            } else
            {
                return true;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static boolean a(Context context, String s)
    {
        if (t.a(s))
        {
            return false;
        }
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }
}
