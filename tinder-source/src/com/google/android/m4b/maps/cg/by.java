// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.y.p;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            cb, aa

public final class by
{

    final Context a;
    final cb b;
    private final Resources c;
    private String d;
    private boolean e;
    private boolean f;

    public by(Context context, cb cb1, Resources resources)
    {
        boolean flag1 = true;
        super();
        e = false;
        f = false;
        a = context;
        b = cb1;
        c = resources;
        context = a.getPackageManager();
        int i;
        boolean flag;
        if (a("com.google.android.apps.gmm", context))
        {
            d = "com.google.android.apps.gmm";
        } else
        if (a("com.google.android.apps.maps", context))
        {
            d = "com.google.android.apps.maps";
        } else
        {
            d = null;
        }
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        try
        {
            i = context.getPackageInfo(d, 1).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (i > 0x29b92700)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if (i > 0x29e6edc0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    private static boolean a(String s, PackageManager packagemanager)
    {
        try
        {
            packagemanager.getPackageInfo(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public final void a(CameraPosition cameraposition, aa aa1, boolean flag)
    {
        if (g.e(a))
        {
            return;
        }
        double d1;
        double d3;
        String s;
        if (flag)
        {
            if (aa1 == null)
            {
                b.b(cb.a.cf);
            } else
            {
                b.b(cb.a.ce);
            }
        } else
        if (aa1 != null)
        {
            b.b(cb.a.cd);
        } else
        {
            b.b(cb.a.cc);
        }
        d1 = cameraposition.b.b;
        d3 = cameraposition.b.c;
        s = (new StringBuilder(56)).append("geo:").append(d1).append(",").append(d3).append("?z=").toString();
        if (e)
        {
            s = String.valueOf(s);
            float f1 = cameraposition.c;
            s = (new StringBuilder(String.valueOf(s).length() + 15)).append(s).append(f1).toString();
        } else
        {
            s = String.valueOf(s);
            int i = (int)Math.floor(cameraposition.c);
            s = (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
        }
        cameraposition = s;
        if (aa1 != null)
        {
            cameraposition = aa1.d();
            s = String.valueOf(s);
            double d2 = ((LatLng) (cameraposition)).b;
            double d4 = ((LatLng) (cameraposition)).c;
            s = (new StringBuilder(String.valueOf(s).length() + 52)).append(s).append("&q=").append(d2).append(",").append(d4).toString();
            aa1 = aa1.m();
            cameraposition = s;
            if (!p.b(aa1))
            {
                cameraposition = s;
                if (f)
                {
                    cameraposition = String.valueOf(s);
                    cameraposition = (new StringBuilder(String.valueOf(cameraposition).length() + 2 + String.valueOf(aa1).length())).append(cameraposition).append("(").append(aa1).append(")").toString();
                }
            }
        }
        a(((String) (cameraposition)));
    }

    final void a(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(s));
        intent.addFlags(0x10000000);
        if (d != null)
        {
            intent.setPackage(d);
            a.startActivity(intent);
            return;
        } else
        {
            s = c.getString(com.google.android.m4b.maps.h.h.maps_NO_GMM);
            Toast.makeText(a, s, 0).show();
            return;
        }
    }
}
