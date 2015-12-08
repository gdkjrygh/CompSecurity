// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;

public final class eph
{

    public String a;
    public String b;
    public String c;
    int d;
    int e;
    public epk f;
    private final String g;
    private final Resources h;

    public eph(Context context)
    {
        g = context.getPackageName();
        h = context.getResources();
    }

    public final epf a()
    {
        boolean flag1 = true;
        p.a(a, "must specify name");
        p.a(b, "must specify failureMessage");
        p.a(c, "must specify imageUrl");
        Uri uri;
        boolean flag;
        if (d != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e == 0)
        {
            flag1 = false;
        }
        p.b(flag ^ flag1, "must set a valid renderType or collectionType");
        uri = Uri.parse(c);
        p.a(epf.f().contains(uri.getScheme()), "imageUrl must have a scheme of http/https/android.resources");
        return new epf(this);
    }

    public final eph a(int i)
    {
        boolean flag;
        if (e == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "set only renderType or collectionType");
        d = i;
        return this;
    }

    public final eph b(int i)
    {
        boolean flag;
        if (d == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "set only renderType or collectionType");
        e = i;
        return this;
    }

    public final eph c(int i)
    {
        a = h.getString(i);
        return this;
    }

    public final eph d(int i)
    {
        b = h.getString(i);
        return this;
    }

    public final eph e(int i)
    {
        c = (new android.net.Uri.Builder()).scheme("android.resource").authority(g).appendPath(Integer.toString(i)).build().toString();
        return this;
    }
}
