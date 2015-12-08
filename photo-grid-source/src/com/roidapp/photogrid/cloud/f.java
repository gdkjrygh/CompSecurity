// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            cm, BaseShareActivity, br

final class f
    implements cm
{

    final BaseShareActivity a;

    f(BaseShareActivity baseshareactivity)
    {
        a = baseshareactivity;
        super();
    }

    public final ArrayList a()
    {
        if (BaseShareActivity.b(a) != null && (BaseShareActivity.b(a) instanceof br))
        {
            return ((br)BaseShareActivity.b(a)).k();
        } else
        {
            return null;
        }
    }

    public final void a(String s)
    {
        if (BaseShareActivity.b(a) != null && (BaseShareActivity.b(a) instanceof br))
        {
            ((br)BaseShareActivity.b(a)).b(s);
        }
    }

    public final void a(String s, boolean flag)
    {
        if (BaseShareActivity.b(a) != null && (BaseShareActivity.b(a) instanceof br))
        {
            ((br)BaseShareActivity.b(a)).a(s, flag);
        }
    }

    public final void b()
    {
        if (BaseShareActivity.b(a) != null && (BaseShareActivity.b(a) instanceof br))
        {
            ((br)BaseShareActivity.b(a)).j();
        }
    }
}
