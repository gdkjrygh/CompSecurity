// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

public final class nnd
{

    public Uri a;
    public String b;
    public String c;
    public String d;
    public long e;
    public boolean f;
    public boolean g;
    public pkw h;

    public nnd()
    {
        f = true;
    }

    public final nnc a()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(d) || !TextUtils.isEmpty(null))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must specify an albumId or eventId");
        if (a != null && a != Uri.EMPTY)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.b(flag, "must specify a mediaUri");
        return new nnc(this);
    }
}
