// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.c;
import com.facebook.ads.internal.util.b;
import com.facebook.ads.internal.util.g;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            u, s, v

public class p extends u
{

    private Context a;
    private v b;
    private s c;

    public p()
    {
    }

    public void a(int i1)
    {
        if (c == null)
        {
            return;
        } else
        {
            c.a(i1);
            return;
        }
    }

    public void a(Context context, v v1, Map map)
    {
        c = s.a((JSONObject)map.get("data"));
        a = context;
        b = v1;
        if (c == null || com.facebook.ads.internal.util.g.a(context, c))
        {
            b.a(this, c.b);
            return;
        }
        if (b != null)
        {
            b.a(this);
        }
        b.a = c.o();
    }

    public void a(Map map)
    {
        if (c == null)
        {
            return;
        } else
        {
            c.a(map);
            return;
        }
    }

    public void b()
    {
    }

    public void b(Map map)
    {
        if (c == null)
        {
            return;
        } else
        {
            c.a(a, map);
            return;
        }
    }

    public boolean c()
    {
        if (!n())
        {
            return false;
        } else
        {
            return c.k();
        }
    }

    public com.facebook.ads.NativeAd.a d()
    {
        if (!n())
        {
            return null;
        } else
        {
            return c.d();
        }
    }

    public com.facebook.ads.NativeAd.a e()
    {
        if (!n())
        {
            return null;
        } else
        {
            return c.e();
        }
    }

    public String f()
    {
        if (!n())
        {
            return null;
        } else
        {
            return c.f();
        }
    }

    public String g()
    {
        if (!n())
        {
            return null;
        } else
        {
            return c.g();
        }
    }

    public String h()
    {
        if (!n())
        {
            return null;
        } else
        {
            return c.h();
        }
    }

    public String i()
    {
        if (!n())
        {
            return null;
        } else
        {
            return c.i();
        }
    }

    public com.facebook.ads.NativeAd.b j()
    {
        if (!n())
        {
            return null;
        } else
        {
            return c.j();
        }
    }

    public String k()
    {
        if (!n())
        {
            return null;
        } else
        {
            return c.l();
        }
    }

    public com.facebook.ads.NativeAd.a l()
    {
        if (!n())
        {
            return null;
        } else
        {
            return c.m();
        }
    }

    public String m()
    {
        if (!n())
        {
            return null;
        } else
        {
            return c.n();
        }
    }

    public boolean n()
    {
        return c != null;
    }
}
