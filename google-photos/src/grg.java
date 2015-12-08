// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class grg
    implements gri, nuc, omb, opl, opn, ops, opt, opu, opv
{

    public final nud a;
    public Context b;
    public gll c;
    public gaj d;
    public noz e;
    public ehr f;
    public grh g;
    public ekp h;
    public gro i;
    public int j;
    private final grj k;
    private boolean l;
    private gre m;

    public grg(opd opd1)
    {
        this(opd1, new grj());
    }

    private grg(opd opd1, grj grj1)
    {
        a = new ntz(this);
        k = grj1;
        opd1.a(this);
    }

    private void a(gre gre1)
    {
        if (e.a())
        {
            noy.a("request", gre1);
            noy.a("currentMediaModel", this);
        }
        if (l)
        {
            g.a(gre1);
            return;
        } else
        {
            m = gre1;
            return;
        }
    }

    public final void V_()
    {
        l = false;
    }

    public final void X_()
    {
        l = true;
        if (m != null)
        {
            gre gre1 = m;
            m = null;
            a(gre1);
        }
    }

    public final nud a()
    {
        return a;
    }

    public final void a(int i1)
    {
        boolean flag;
        if (e.a())
        {
            noy.a("index", Integer.valueOf(i1));
        }
        boolean flag1;
        if (f != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.b(flag1, "Must call initialize");
        if (i1 >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1, (new StringBuilder(26)).append("Invalid index: ").append(i1).toString());
        if (i != null)
        {
            gro gro1 = i;
            if (gro1.b != null && gro1.b.intValue() == i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_150;
            }
        }
        flag = true;
_L1:
        if (!flag)
        {
            if (e.a())
            {
                noy.a("pendingStartMediaModel", i);
            }
            return;
        } else
        {
            a(gre.a(i1));
            return;
        }
        flag = false;
          goto _L1
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = context;
        c = (gll)olm1.a(gll);
        d = (gaj)olm1.a(gaj);
        i = (gro)olm1.b(gro);
        e = noz.a(context, 2, "CurrentMediaModel", new String[0]);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle = (ekp)bundle.getParcelable("com.google.android.apps.photos.pager.model.current_media");
            if (bundle != null)
            {
                a(gre.a(bundle));
            }
        }
    }

    public final void a(ekp ekp1)
    {
        if (e.a())
        {
            b.a(ekp1);
        }
        String s;
        boolean flag;
        boolean flag1;
        if (f != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.b(flag1, "Must call initialize");
        s = String.valueOf(ekp1);
        p.b(ekp1, (new StringBuilder(String.valueOf(s).length() + 15)).append("Invalid media: ").append(s).toString());
        if (i == null || i.a(ekp1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if (e.a())
            {
                b.a(i.a);
            }
            return;
        } else
        {
            a(gre.a(ekp1));
            return;
        }
    }

    public final void a(ekp ekp1, int i1)
    {
        if (e.a())
        {
            b.a(ekp1);
            noy.a("index", Integer.valueOf(i1));
            noy.a("currentMediaModel", this);
        }
        if (i != null && i.a(ekp1))
        {
            if (e.a())
            {
                noy.a("pendingStartMediaModel", i);
            }
            i = null;
        }
        if (c.c(h, ekp1) && i1 == j)
        {
            return;
        } else
        {
            h = ekp1;
            j = i1;
            a.b();
            return;
        }
    }

    public final void c()
    {
        if (g != null)
        {
            g.a();
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("com.google.android.apps.photos.pager.model.current_media", h);
    }

    public String toString()
    {
        String s = String.valueOf("CurrentMediaModel {index: ");
        int i1 = j;
        Object obj;
        String s1;
        if (h != null)
        {
            obj = Long.valueOf(h.b());
        } else
        {
            obj = "";
        }
        s1 = String.valueOf(obj);
        if (f != null)
        {
            obj = f.a;
        } else
        {
            obj = "";
        }
        obj = String.valueOf(obj);
        return (new StringBuilder(String.valueOf(s).length() + 35 + String.valueOf(s1).length() + String.valueOf(obj).length())).append(s).append(i1).append(", media: ").append(s1).append(", collection: ").append(((String) (obj))).append("}").toString();
    }
}
