// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.aviary.android.feather.common.utils.l;
import com.aviary.android.feather.headless.filters.INativeRangeFilter;
import com.aviary.android.feather.headless.moa.Moa;
import com.aviary.android.feather.headless.moa.MoaResult;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.f;
import com.aviary.android.feather.library.c.b;
import com.aviary.android.feather.library.d.c;
import com.aviary.android.feather.library.filters.a;
import com.aviary.android.feather.library.services.IAviaryController;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            p

public class n extends p
{
    class a extends com.aviary.android.feather.common.utils.os.a
    {

        MoaResult a;
        boolean b;
        final n c;

        protected transient Bitmap a(Bitmap abitmap[])
        {
            if (isCancelled() || c.k == null)
            {
                return null;
            }
            try
            {
                a.execute();
                c.s.a(((INativeRangeFilter)c.k).b().b());
                c.t = ((INativeRangeFilter)c.k).a();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap abitmap[])
            {
                abitmap.printStackTrace();
                return null;
            }
            if (isCancelled())
            {
                return null;
            } else
            {
                return c.f;
            }
        }

        protected void a()
        {
            c.q.b("PreExecute");
            if (c.k != null)
            {
                try
                {
                    a = ((INativeRangeFilter)c.k).a(c.g, c.f, 1, 1);
                }
                catch (JSONException jsonexception)
                {
                    jsonexception.printStackTrace();
                }
                if (b)
                {
                    c.i();
                }
            }
        }

        protected void a(Bitmap bitmap)
        {
            if (!c.n())
            {
                return;
            }
            c.q.b("PostExecute");
            if (b)
            {
                c.j();
            }
            if (bitmap != null)
            {
                if (l.b())
                {
                    Moa.a(c.f);
                }
                c.E();
            } else
            {
                com.aviary.android.feather.library.c.b.a(c.g, c.f);
                c.a(c.f, false, true);
                c.c(false);
            }
            c.b = false;
            c.a = null;
        }

        protected volatile void a(Object obj)
        {
            a((Bitmap)obj);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Bitmap[])aobj);
        }

        protected void onCancelled()
        {
            super.onCancelled();
            c.q.b("onCancelled");
            if (a != null)
            {
                a.cancel();
            }
        }

        public a(float f1, boolean flag)
        {
            c = n.this;
            super();
            b = flag;
            if (k != null)
            {
                ((INativeRangeFilter)k).a(Float.valueOf(f1));
            }
        }
    }

    class b extends com.aviary.android.feather.common.utils.os.a
    {

        ProgressDialog a;
        final n b;

        protected transient Void a(Void avoid[])
        {
            b.q.c("GenerateResultTask::doInBackground", new Object[] {
                Boolean.valueOf(b.b)
            });
            while (b.b) ;
            return null;
        }

        protected void a()
        {
            a.setTitle(b.B().a().getString(com.aviary.android.feather.sdk.R.string.feather_loading_title));
            a.setMessage(b.B().a().getString(com.aviary.android.feather.sdk.R.string.feather_effect_loading_message));
            a.setIndeterminate(true);
            a.setCancelable(false);
            a.show();
        }

        protected volatile void a(Object obj)
        {
            a((Void)obj);
        }

        protected void a(Void void1)
        {
            b.q.b("GenerateResultTask::PostExecute");
            if (b.B().b().isFinishing())
            {
                return;
            }
            if (a.isShowing())
            {
                a.dismiss();
            }
            b.b(b.f);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        b()
        {
            b = n.this;
            super();
            a = new ProgressDialog(b.B().a());
        }
    }


    a a;
    volatile boolean b;
    boolean c;
    final c s = new c();
    d t;

    public n(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1, com.aviary.android.feather.library.filters.a.a a2, String s1)
    {
        super(iaviarycontroller, a1, a2, s1);
        b = false;
        k = com.aviary.android.feather.library.filters.a.d(a2);
    }

    public void A()
    {
        j();
        super.A();
    }

    protected void F()
    {
        q.b((new StringBuilder()).append("onGenerateResult: ").append(b).toString());
        if (b)
        {
            (new b()).execute(new Void[0]);
            return;
        } else
        {
            b(f);
            return;
        }
    }

    protected void a(float f, boolean flag)
    {
        q.b((new StringBuilder()).append("applyFilter: ").append(f).toString());
        a();
        if (f == 0.0F)
        {
            com.aviary.android.feather.library.c.b.a(g, this.f);
            a(this.f, false, true);
            b = false;
            c(false);
            return;
        } else
        {
            b = true;
            a = new a(f, flag);
            a.execute(new Bitmap[] {
                g
            });
            c(true);
            return;
        }
    }

    protected void a(int i)
    {
        if (c)
        {
            i();
        }
    }

    protected void a(int i, boolean flag)
    {
        q.b((new StringBuilder()).append("onProgressChanged: ").append(i).append(", fromUser: ").append(flag).toString());
        if (c || !flag)
        {
            float f = (i - 50) * 2;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(f, flag);
        }
    }

    public void a(Bitmap bitmap)
    {
        super.a(bitmap);
        if (n())
        {
            a(0.0F, false);
            c(50);
        }
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
    }

    protected void a(Bitmap bitmap, com.aviary.android.feather.library.d.a a1)
    {
        a1.a(s);
        a1.a(t);
        super.a(bitmap, a1);
    }

    boolean a()
    {
        if (a != null && a.cancel(true))
        {
            b = false;
            j();
            return true;
        } else
        {
            return false;
        }
    }

    protected void b(int i)
    {
        q.b((new StringBuilder()).append("onProgressEnd: ").append(i).toString());
        float f = (i - 50) * 2;
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(f, flag);
        if (c)
        {
            j();
        }
    }

    public boolean e()
    {
        return b;
    }

    public boolean t()
    {
        q.b("onBackPressed");
        a();
        return super.t();
    }

    public void w()
    {
        a();
        b = false;
        super.w();
    }

    public void z()
    {
        super.z();
        f = com.aviary.android.feather.library.c.b.a(g, android.graphics.Bitmap.Config.ARGB_8888);
        a(f, true, true);
        c(false);
        if (q())
        {
            Bundle bundle = p();
            if (bundle.containsKey("quick-numericValue"))
            {
                c(bundle.getInt("quick-numericValue", 0));
            }
        }
    }
}
