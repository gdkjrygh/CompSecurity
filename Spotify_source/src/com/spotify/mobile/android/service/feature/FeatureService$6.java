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
import dtk;
import dxf;
import fyt;
import fyu;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.spotify.mobile.android.service.feature:
//            FeatureService

final class b
    implements an
{

    private final String a[];
    private FeatureService b;

    public final da a(Bundle bundle)
    {
        return new cu(b, dtk.a, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        Iterator iterator;
        boolean flag;
        obj = (Cursor)obj;
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_238;
        }
        iterator = FeatureService.h(b).a().iterator();
        flag = false;
_L2:
        fyu fyu1;
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        fyu1 = (fyu)iterator.next();
        s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow(((fyt)fyu1.c).a));
        boolean flag1;
        java.io.Serializable serializable = FeatureService.a(fyu1, s);
        flag1 = b.a(fyu1, serializable);
        flag = flag1 | flag;
        continue; /* Loop/switch isn't completed */
        NumberFormatException numberformatexception;
        numberformatexception;
        if ((new Random()).nextInt(5) == 0)
        {
            Assertion.b((new StringBuilder("Use of non-integer feature ")).append(((fyt)fyu1.c).a).append("=").append(s).append(" (note: only 20% of occurrences reported!)").toString());
        }
        flag = FeatureService.a(b, fyu1) | flag;
        if (true) goto _L2; else goto _L1
_L1:
        boolean flag2 = FeatureService.d(b).add(aderSource.a);
        if (FeatureService.e(b) && flag2 | flag)
        {
            FeatureService.f(b);
            FeatureService.g(b);
            MethodTraceScope.g.b();
        }
    }

    aderSource(FeatureService featureservice)
    {
        b = featureservice;
        super();
        a = new String[FeatureService.h(b).a().size()];
        for (int i = 0; i < FeatureService.h(b).a().size(); i++)
        {
            a[i] = ((fyt)((fyu)FeatureService.h(b).a().get(i)).c).a;
        }

    }
}
