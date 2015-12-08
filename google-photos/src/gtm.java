// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import java.util.Collections;
import java.util.List;

public final class gtm
    implements mti, omb, opl, ops, opv
{

    private final gtn a;
    private Context b;
    private mtj c;
    private gue d;
    private noz e;
    private noz f;

    public gtm(opd opd1, gtn gtn1)
    {
        p.b(gtn1, "listener cannot be null");
        a = gtn1;
        opd1.a(this);
    }

    private void a()
    {
        a.a(false, null);
        Toast.makeText(b, b.tZ, 1).show();
    }

    private void a(mue mue1, ekp ekp1, boolean flag)
    {
        a.a(false, null);
        int i;
        if (flag)
        {
            i = b.ud;
        } else
        {
            i = b.ua;
        }
        Toast.makeText(b, i, 1).show();
        if (e.a())
        {
            noy.a("result", mue1);
            noy.a("media", ekp1);
            noy.a("is video", Boolean.valueOf(flag));
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = context;
        c = (mtj)olm1.a(mtj);
        c.a(this);
        e = noz.a(context, "PhotoEditSaveMixin", new String[0]);
        f = noz.a(context, 2, "PhotoEditSaveMixin", new String[0]);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            d = (gue)bundle.getParcelable("PhotoEditSaveMin.save_edit_details");
        }
    }

    public final void a(gue gue1)
    {
        if (f.a())
        {
            noy.a("details", gue1);
        }
        d = gue1;
        c.a(new eld(Collections.singletonList(gue1.c), gto.a(b, gue1.c).a(), b.tX));
    }

    public final void a(String s, mue mue1, mua mua)
    {
        boolean flag = false;
        if (!eld.a(b.tX).equals(s)) goto _L2; else goto _L1
_L1:
        if (mue1 != null) goto _L4; else goto _L3
_L3:
        a();
_L6:
        return;
_L4:
        if (mue1.c())
        {
            s = d.c;
            if (s.c() == euv.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(mue1, ((ekp) (s)), flag);
            return;
        } else
        {
            s = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
            mue1 = (new gug()).a(d);
            mue1.c = (ekp)s.get(0);
            d = mue1.a();
            c.b(new gto(d));
            return;
        }
_L2:
        if ("SaveEditTask".equals(s))
        {
            if (mue1 == null)
            {
                a();
                return;
            }
            s = (ekp)mue1.a().getParcelable("com.google.android.apps.photos.core.media");
            if (s.c() == euv.c)
            {
                flag = true;
            }
            if (mue1.c())
            {
                a(mue1, ((ekp) (s)), flag);
                return;
            }
            a.a(true, s);
            int i;
            if (flag)
            {
                i = b.uc;
            } else
            {
                i = b.tY;
            }
            Toast.makeText(b, i, 1).show();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("PhotoEditSaveMin.save_edit_details", d);
    }
}
