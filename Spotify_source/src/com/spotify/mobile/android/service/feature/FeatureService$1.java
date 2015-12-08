// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.feature;

import android.text.TextUtils;
import dmz;
import dxa;
import fop;
import fym;
import fyu;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.service.feature:
//            FeatureService

final class a
    implements dxa
{

    private Map a;
    private FeatureService b;

    public final void a(fyu fyu1, Serializable serializable)
    {
        while (serializable == null || (serializable instanceof String) && TextUtils.isEmpty((String)serializable) || serializable.equals(a.get(((fym)fyu1.c).a))) 
        {
            return;
        }
        dmz.a(fop);
        fop.a(b, ((fym)fyu1.c).a, serializable);
        a.put(((fym)fyu1.c).a, serializable);
    }

    A(FeatureService featureservice)
    {
        b = featureservice;
        super();
        a = new HashMap();
    }
}
