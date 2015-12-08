// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class fba
    implements nuc, opl, ops, opv
{

    public final nud a = new ntz(this);
    public faz b;
    public ekp c;
    private faz d;

    public fba(opd opd1)
    {
        b = faz.b;
        opd1.a(this);
    }

    public final nud a()
    {
        return a;
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            String s = bundle.getString("com.google.android.photos.drawermenu.current_destination");
            if (s != null)
            {
                d = faz.valueOf(s);
                c = (ekp)bundle.getParcelable("com.google.android.photos.drawermenu.media_to_scroll_to");
            }
        }
    }

    public final void a(faz faz1, ekp ekp1)
    {
        if (d == faz1)
        {
            return;
        } else
        {
            d = faz1;
            c = ekp1;
            a.b();
            return;
        }
    }

    public final faz b()
    {
        if (d == null)
        {
            return b;
        } else
        {
            return d;
        }
    }

    public final void e(Bundle bundle)
    {
        if (d != null)
        {
            bundle.putString("com.google.android.photos.drawermenu.current_destination", d.name());
        }
        bundle.putParcelable("com.google.android.photos.drawermenu.media_to_scroll_to", c);
    }
}
