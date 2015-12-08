// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.text.TextUtils;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PublicCollageActivity

class a
    implements 
{

    final PublicCollageActivity a;

    public void a(WebPhoto webphoto, String s, String s1)
    {
        b.al(s);
        webphoto = Collage.a(a, webphoto.getId(), s, s1);
        a.startActivityForResult(webphoto, 3);
    }

    public void a(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1 = null;
        String s2 = a.r();
        s1 = s2;
_L4:
        if (s1 == null)
        {
            f.a(new IllegalStateException((new StringBuilder()).append("Cannot get current collage to update view when callback from like ").append(s).toString()));
            return;
        }
        if (s.equals(s1))
        {
            PublicCollageActivity.e(a);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        IllegalStateException illegalstateexception;
        illegalstateexception;
          goto _L4
    }

    (PublicCollageActivity publiccollageactivity)
    {
        a = publiccollageactivity;
        super();
    }
}
