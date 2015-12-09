// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            DecideChecker

static class d
{

    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public JSONArray c;
    public JSONArray d;

    public ()
    {
        c = DecideChecker.a();
        d = DecideChecker.a();
    }
}
