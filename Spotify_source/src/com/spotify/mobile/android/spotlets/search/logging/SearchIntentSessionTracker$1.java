// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.logging;

import android.text.TextUtils;
import fgo;
import fhb;

// Referenced classes of package com.spotify.mobile.android.spotlets.search.logging:
//            SearchIntentSessionTracker

public final class a
    implements fhb
{

    private SearchIntentSessionTracker a;

    public final void a(String s)
    {
        SearchIntentSessionTracker searchintentsessiontracker;
        String s1;
        boolean flag1;
        flag1 = true;
        searchintentsessiontracker = a;
        s1 = SearchIntentSessionTracker.a(a);
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        if (flag1)
        {
            a.a();
        }
        SearchIntentSessionTracker.a(a, s);
        s = a;
        int i;
        boolean flag;
        int j;
        if (((SearchIntentSessionTracker) (s)).d == null)
        {
            throw new IllegalStateException("Session is not started yet!");
        } else
        {
            s.e = ((SearchIntentSessionTracker) (s)).e + 1;
            return;
        }
_L4:
        i = s1.codePointAt(0);
        j = s.codePointAt(0);
        if (i != j && searchintentsessiontracker.b.a(i) != searchintentsessiontracker.b.a(j) || s1.trim().length() != 2 && s.trim().length() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L3; else goto _L2
_L2:
        flag1 = false;
          goto _L3
    }

    public final void a(boolean flag)
    {
    }

    public final void b(String s)
    {
    }

    (SearchIntentSessionTracker searchintentsessiontracker)
    {
        a = searchintentsessiontracker;
        super();
    }
}
