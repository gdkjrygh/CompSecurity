// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collections;

final class brm extends bsr
{

    private brl a;

    brm(brl brl1, String s)
    {
        a = brl1;
        super(s);
    }

    public final mtf a(String s)
    {
        while (!ddy.j.a() || a.c.c.k == null || TextUtils.isEmpty(a.c.c.k.e.c)) 
        {
            return null;
        }
        s = a.c.c.l.d;
        return new jdm(brl.a(a), "albumless", Collections.singletonList(s));
    }

    public final boolean a(String s, mue mue1)
    {
        if (mue1.c())
        {
            return false;
        }
        if (brl.b(a).a())
        {
            brl.b(a);
            noy.a("media keys", mue1.a().getStringArrayList("uploaded_media_keys"));
        }
        return true;
    }
}
