// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.aviary.android.feather.common.utils.f;
import com.aviary.android.feather.common.utils.g;
import com.aviary.android.feather.common.utils.l;
import com.aviary.android.feather.headless.utils.a;
import com.aviary.android.feather.library.c.e;
import com.aviary.android.feather.library.d.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BaseContextService, IAviaryController

public final class LocalDataService extends BaseContextService
{

    private Uri d;
    private Uri e;
    private android.graphics.Bitmap.CompressFormat f;
    private e g;
    private final Intent h;
    private Boolean i;
    private final List j = new ArrayList(0);

    public LocalDataService(IAviaryController iaviarycontroller)
    {
        super(iaviarycontroller);
        iaviarycontroller = iaviarycontroller.b().getIntent();
        if (iaviarycontroller != null)
        {
            h = iaviarycontroller;
        } else
        {
            h = new Intent();
        }
    }

    private a m()
        throws com.aviary.android.feather.common.utils.g.a
    {
        Object obj = d();
        if (obj == null)
        {
            return null;
        }
        obj = ((IAviaryController) (obj)).a();
        if (obj == null)
        {
            return null;
        }
        if (com.aviary.android.feather.common.utils.f.c(((Context) (obj))))
        {
            obj = com.aviary.android.feather.common.utils.g.a("com.aviary.android.feather.utils.SettingsUtils", "getInstance", new Class[] {
                android/content/Context
            }, new Object[] {
                obj
            });
            if (obj != null)
            {
                obj = com.aviary.android.feather.common.utils.g.a(obj, "getOutputImageSize");
                if (obj != null && (obj instanceof a))
                {
                    return (a)obj;
                }
            }
        }
        return null;
    }

    public Object a(String s, Object obj)
    {
        Bundle bundle = h.getExtras();
        Object obj1 = obj;
        if (bundle != null)
        {
            obj1 = obj;
            if (bundle.containsKey(s))
            {
                try
                {
                    s = ((String) (bundle.get(s)));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return obj;
                }
                obj1 = obj;
                if (s != null)
                {
                    obj1 = s;
                }
            }
        }
        return obj1;
    }

    public void a()
    {
        j.clear();
    }

    public final void a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        d = uri;
        this;
        JVM INSTR monitorexit ;
        return;
        uri;
        throw uri;
    }

    public void a(e e1)
    {
        g = e1;
    }

    public void a(b b1)
    {
        j.add(b1);
    }

    public boolean a(String s)
    {
        return h.hasExtra(s);
    }

    public void b()
    {
    }

    public void b(Uri uri)
    {
        e = uri;
    }

    public e c()
    {
        return g;
    }

    public int g()
    {
        int j1 = ((Integer)a("output-hires-megapixels", Integer.valueOf(-1))).intValue();
        int i1 = j1;
        if (j1 < 0)
        {
            try
            {
                i1 = m().ordinal();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                i1 = j1;
            }
        }
        return Math.min(i1, a.E.ordinal());
    }

    public final Uri h()
    {
        this;
        JVM INSTR monitorenter ;
        Uri uri = d;
        this;
        JVM INSTR monitorexit ;
        return uri;
        Exception exception;
        exception;
        throw exception;
    }

    public final Uri i()
    {
        if (e == null && h.hasExtra("output"))
        {
            e = (Uri)h.getParcelableExtra("output");
        }
        return e;
    }

    public final android.graphics.Bitmap.CompressFormat j()
    {
        if (f == null)
        {
            String s = (String)a("output-format", android.graphics.Bitmap.CompressFormat.JPEG.name());
            if (s != null)
            {
                f = android.graphics.Bitmap.CompressFormat.valueOf(s);
            } else
            {
                f = android.graphics.Bitmap.CompressFormat.JPEG;
            }
        }
        return f;
    }

    public final int k()
    {
        return ((Integer)a("output-quality", Integer.valueOf(97))).intValue();
    }

    public boolean l()
    {
        boolean flag = true;
        if (i != null) goto _L2; else goto _L1
_L1:
        if (!a("effect-enable-fast-preview")) goto _L4; else goto _L3
_L3:
        flag = ((Boolean)a("effect-enable-fast-preview", Boolean.valueOf(false))).booleanValue();
_L6:
        i = Boolean.valueOf(flag);
_L2:
        return i.booleanValue();
_L4:
        int i1 = com.aviary.android.feather.common.utils.l.e();
        if (i1 > 0)
        {
            if (i1 < 1000)
            {
                flag = false;
            }
        } else
        if (com.aviary.android.feather.common.utils.l.a() < 1400F)
        {
            flag = false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
