// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.aviary.android.feather.headless.moa.Moa;
import com.aviary.android.feather.library.c.b;
import com.aviary.android.feather.library.d.a;
import com.aviary.android.feather.library.d.c;
import com.aviary.android.feather.library.filters.EnhanceFilter;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.library.services.LocalDataService;
import com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton;
import java.util.HashMap;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            b

public class l extends com.aviary.android.feather.sdk.panels.b
    implements com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton.a
{
    class a extends com.aviary.android.feather.common.utils.os.a
    {

        ProgressDialog a;
        final l b;

        protected transient Void a(Void avoid[])
        {
            b.q.c("GenerateResultTask::doInBackground", new Object[] {
                Boolean.valueOf(b.a)
            });
            while (b.a) ;
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

        a()
        {
            b = l.this;
            super();
            a = new ProgressDialog(b.B().a());
        }
    }

    class b extends com.aviary.android.feather.common.utils.os.a
    {

        String a;
        volatile EnhanceFilter b;
        final l c;

        protected transient Bitmap a(com.aviary.android.feather.library.filters.EnhanceFilter.a aa[])
        {
            if (!isCancelled())
            {
                aa = aa[0];
                b.a(aa);
                Bitmap bitmap;
                try
                {
                    bitmap = b.b(c.g, c.f, 1, 1);
                    c.e.a(b.a());
                    c.e.a(new c(aa.name()));
                }
                // Misplaced declaration of an exception variable
                catch (com.aviary.android.feather.library.filters.EnhanceFilter.a aa[])
                {
                    aa.printStackTrace();
                    a = aa.getMessage();
                    return null;
                }
                if (!isCancelled())
                {
                    return bitmap;
                }
            }
            return null;
        }

        protected void a()
        {
            c.i();
        }

        protected void a(Bitmap bitmap)
        {
            if (c.n()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            c.j();
            if (isCancelled()) goto _L1; else goto _L3
_L3:
            if (bitmap == null) goto _L5; else goto _L4
_L4:
            if (com.aviary.android.feather.common.utils.l.b())
            {
                Moa.a(c.f);
            }
            c.a(c.f, false, true);
_L7:
            c.a = false;
            com.aviary.android.feather.sdk.panels.l.a(c, null);
            return;
_L5:
            if (a != null)
            {
                c.a(a, 0x104000a, null);
            }
            if (true) goto _L7; else goto _L6
_L6:
        }

        protected volatile void a(Object obj)
        {
            a((Bitmap)obj);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((com.aviary.android.feather.library.filters.EnhanceFilter.a[])aobj);
        }

        protected void onCancelled()
        {
            b.c();
            super.onCancelled();
        }

        public b()
        {
            c = l.this;
            super();
            b = (EnhanceFilter)com.aviary.android.feather.library.filters.a.d(com.aviary.android.feather.sdk.panels.l.a(l.this));
            a = null;
        }
    }


    volatile boolean a;
    boolean b;
    private b c;
    private com.aviary.android.feather.library.filters.a.a s;
    private AviaryHighlightImageButton t;
    private AviaryHighlightImageButton u;
    private AviaryHighlightImageButton v;
    private AviaryHighlightImageButton w;

    public l(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1, com.aviary.android.feather.library.filters.a.a a2)
    {
        super(iaviarycontroller, a1);
        a = false;
        b = false;
        s = a2;
    }

    static com.aviary.android.feather.library.filters.a.a a(l l1)
    {
        return l1.s;
    }

    static b a(l l1, b b1)
    {
        l1.c = b1;
        return b1;
    }

    private void a()
    {
        if (c != null)
        {
            synchronized (c)
            {
                c.cancel(true);
                c.b.c();
                j();
            }
            a = false;
            c = null;
        }
        return;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(String s1, boolean flag)
    {
        com.aviary.android.feather.library.filters.EnhanceFilter.a a1;
        q.c("buttonClick: %s, %b", new Object[] {
            s1, Boolean.valueOf(flag)
        });
        a1 = com.aviary.android.feather.library.filters.EnhanceFilter.a.a;
        a();
        if (!"enhance_hi_def".equals(s1)) goto _L2; else goto _L1
_L1:
        a1 = com.aviary.android.feather.library.filters.EnhanceFilter.a.a;
_L8:
        if (flag) goto _L4; else goto _L3
_L3:
        com.aviary.android.feather.library.c.b.a(g, f);
        a(f, false, true);
        e.a(null);
        e.a(null);
        l.clear();
        c(false);
_L6:
        return;
_L2:
        if ("enhance_illuminate".equals(s1))
        {
            a1 = com.aviary.android.feather.library.filters.EnhanceFilter.a.b;
        } else
        if ("enhance_color_fix".equals(s1))
        {
            a1 = com.aviary.android.feather.library.filters.EnhanceFilter.a.c;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c(true);
        if (a1 == null) goto _L6; else goto _L5
_L5:
        a = true;
        c = new b();
        c.execute(new com.aviary.android.feather.library.filters.EnhanceFilter.a[] {
            a1
        });
        l.put("name", a1.name());
        B().h().a("enhance: option_selected", new String[] {
            "name", a1.name()
        });
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void A()
    {
        super.A();
        t.setOnCheckedChangeListener(null);
        u.setOnCheckedChangeListener(null);
        v.setOnCheckedChangeListener(null);
    }

    protected void F()
    {
        if (a)
        {
            (new a()).execute(new Void[0]);
            return;
        } else
        {
            b(f);
            return;
        }
    }

    public void a(Bitmap bitmap)
    {
        super.a(bitmap);
        if (n())
        {
            t.setChecked(false);
            u.setChecked(false);
            v.setChecked(false);
        }
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        bitmap = f();
        t = (AviaryHighlightImageButton)bitmap.findViewById(com.aviary.android.feather.sdk.R.id.button1);
        t.setOnCheckedChangeListener(this);
        if (t.a())
        {
            w = t;
        }
        u = (AviaryHighlightImageButton)bitmap.findViewById(com.aviary.android.feather.sdk.R.id.button2);
        u.setOnCheckedChangeListener(this);
        if (u.a())
        {
            w = u;
        }
        v = (AviaryHighlightImageButton)bitmap.findViewById(com.aviary.android.feather.sdk.R.id.button3);
        v.setOnCheckedChangeListener(this);
        if (v.a())
        {
            w = v;
        }
    }

    public void a(AviaryHighlightImageButton aviaryhighlightimagebutton, boolean flag, boolean flag1)
    {
        q.c("onCheckedChanged: %b, fromUser: %b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        if (w != null && !aviaryhighlightimagebutton.equals(w))
        {
            w.setChecked(false);
        }
        w = aviaryhighlightimagebutton;
        if (!n() || !m() || !flag1)
        {
            return;
        } else
        {
            a((String)aviaryhighlightimagebutton.getTag(), flag);
            return;
        }
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_enhance, viewgroup, false);
    }

    public boolean e()
    {
        return a;
    }

    protected void i()
    {
        if (!b)
        {
            k();
            return;
        } else
        {
            super.i();
            return;
        }
    }

    protected void j()
    {
        if (!b)
        {
            l();
            return;
        } else
        {
            super.j();
            return;
        }
    }

    public boolean t()
    {
        a();
        return super.t();
    }

    public boolean v()
    {
        a();
        return super.v();
    }

    public void w()
    {
        a();
        a = false;
        super.w();
    }

    public void z()
    {
        super.z();
        f = com.aviary.android.feather.library.c.b.a(g, android.graphics.Bitmap.Config.ARGB_8888);
        b = ((LocalDataService)B().a(com/aviary/android/feather/library/services/LocalDataService)).l();
        if (q())
        {
            String s1 = p().getString("quick-stringValue");
            q.b("stringValue: %s", new Object[] {
                s1
            });
            if (s1 != null)
            {
                AviaryHighlightImageButton aviaryhighlightimagebutton = (AviaryHighlightImageButton)f().findViewWithTag(s1);
                if (aviaryhighlightimagebutton != null)
                {
                    q.b("button found: %s", new Object[] {
                        aviaryhighlightimagebutton
                    });
                    aviaryhighlightimagebutton.setChecked(true);
                    a(s1, true);
                }
            }
        }
    }
}
