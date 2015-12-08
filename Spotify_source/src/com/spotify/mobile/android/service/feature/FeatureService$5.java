// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.feature;

import an;
import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import com.spotify.mobile.android.util.Assertion;
import cu;
import da;
import dtv;
import dxf;
import fyu;
import fzf;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.spotify.mobile.android.service.feature:
//            FeatureService

final class b
    implements an
{

    private final String a[] = {
        "key", "value"
    };
    private FeatureService b;

    public final da a(Bundle bundle)
    {
        return new cu(b, dtv.a, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        Object obj1 = (Cursor)obj;
        if (((Cursor) (obj1)).moveToFirst())
        {
            HashSet hashset = new HashSet();
            for (obj = FeatureService.h(b).b().iterator(); ((Iterator) (obj)).hasNext(); hashset.add(((fzf)((fyu)((Iterator) (obj)).next()).c).a)) { }
            obj = new HashMap(((Cursor) (obj1)).getCount());
            do
            {
                if (!((Cursor) (obj1)).moveToNext())
                {
                    break;
                }
                String s = ((Cursor) (obj1)).getString(0);
                if (hashset.contains(s))
                {
                    ((Map) (obj)).put(s, ((Cursor) (obj1)).getString(1));
                }
            } while (true);
            obj1 = FeatureService.h(b).b().iterator();
            boolean flag = false;
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                fyu fyu1 = (fyu)((Iterator) (obj1)).next();
                String s1 = (String)((Map) (obj)).get(((fzf)fyu1.c).a);
                if (s1 != null)
                {
                    boolean flag1;
                    try
                    {
                        java.io.Serializable serializable = FeatureService.a(fyu1, s1);
                        flag1 = b.a(fyu1, serializable);
                    }
                    catch (NumberFormatException numberformatexception)
                    {
                        flag |= FeatureService.a(b, fyu1);
                        Assertion.b((new StringBuilder("Use of non-integer product state ")).append(((fzf)fyu1.c).a).append("=").append(s1).toString());
                        continue;
                    }
                    flag = flag1 | flag;
                    continue;
                }
                flag = FeatureService.a(b, fyu1) | flag;
            } while (true);
            boolean flag2 = FeatureService.d(b).add(aderSource.b);
            if (FeatureService.e(b) && flag2 | flag)
            {
                FeatureService.f(b);
                FeatureService.g(b);
                MethodTraceScope.g.b();
            }
        }
    }

    aderSource(FeatureService featureservice)
    {
        b = featureservice;
        super();
    }
}
