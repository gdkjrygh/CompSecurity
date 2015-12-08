// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.util.b;
import com.facebook.ads.internal.util.f;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            p, n, q

public class k extends p
{

    private Context a;
    private q b;
    private n c;

    public k()
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

    public void a(Context context, q q1, Map map)
    {
        c = com.facebook.ads.internal.adapters.n.a((JSONObject)map.get("data"));
        a = context;
        b = q1;
        if (c == null || com.facebook.ads.internal.util.f.a(context, c))
        {
            b.a(this, AdError.NO_FILL);
            return;
        }
        if (b != null)
        {
            b.a(this);
        }
        b.a = c.v();
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

    public boolean a()
    {
        if (!w())
        {
            return false;
        } else
        {
            return c.o();
        }
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

    public boolean b()
    {
        return c.p();
    }

    public boolean c()
    {
        return c.x();
    }

    public boolean d()
    {
        return c.q();
    }

    public int e()
    {
        return c.r();
    }

    public int f()
    {
        return c.y();
    }

    public int g()
    {
        return c.z();
    }

    public com.facebook.ads.NativeAd.Image h()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.d();
        }
    }

    public com.facebook.ads.NativeAd.Image i()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.e();
        }
    }

    public NativeAdViewAttributes j()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.w();
        }
    }

    public String k()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.f();
        }
    }

    public String l()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.g();
        }
    }

    public String m()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.h();
        }
    }

    public String n()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.i();
        }
    }

    public String o()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.j();
        }
    }

    public void onDestroy()
    {
    }

    public com.facebook.ads.NativeAd.Rating p()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.k();
        }
    }

    public String q()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.s();
        }
    }

    public com.facebook.ads.NativeAd.Image r()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.t();
        }
    }

    public String s()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.u();
        }
    }

    public String t()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.l();
        }
    }

    public String u()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.m();
        }
    }

    public String v()
    {
        if (!w())
        {
            return null;
        } else
        {
            return c.n();
        }
    }

    public boolean w()
    {
        return c != null;
    }
}
