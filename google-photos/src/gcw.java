// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class gcw
{

    public final boolean a;
    public final gct b;
    public final gcs c;
    public final geu d;
    public final noz e;
    public String f;
    public String g;
    public int h;
    public hfk i;
    public boolean j;

    public gcw(Context context, geu geu1, gct gct1, String s, gcs gcs)
    {
        j = true;
        d = geu1;
        f = s;
        b = gct1;
        c = gcs;
        i = (hfk)olm.a(context, hfk);
        a = TextUtils.isEmpty(f);
        e = noz.a(context, 3, "SyncPager", new String[0]);
    }

    public final gcu a()
    {
        if (!c())
        {
            return gcu.a;
        }
        if (d.b())
        {
            return gcu.b;
        }
        if (b() || !j)
        {
            return gcu.c;
        } else
        {
            String s = String.valueOf("Unknown stop reason, valid resume token: ");
            boolean flag = c();
            throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 5)).append(s).append(flag).toString());
        }
    }

    public boolean b()
    {
        return b != null && b.b();
    }

    public boolean c()
    {
        return TextUtils.isEmpty(f) && h == 0 || !TextUtils.isEmpty(f) && !f.equals(g);
    }
}
