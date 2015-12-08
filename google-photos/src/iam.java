// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class iam
    implements dhf, mti, omb, opv
{

    private static int a;
    private static final ekk b = (new ekm()).a(elt).a(hpg).a();
    private final am c;
    private mtj d;
    private grg e;
    private ejn f;

    public iam(am am1)
    {
        c = am1;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (mtj)olm1.a(mtj);
        e = (grg)olm1.a(grg);
        d.a(this);
        e = (grg)olm1.a(grg);
        f = (ejn)olm1.a(ejn);
    }

    public final void a(MenuItem menuitem)
    {
        ekp ekp1 = e.h;
        boolean flag;
        if (ekp1 != null && ekp1.c() == euv.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!eld.a(a).equals(s))
        {
            return;
        }
        if (mue1 == null || mue1.c())
        {
            Toast.makeText(c.O_(), b.yy, 0).show();
            return;
        }
        s = (ekp)mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list").get(0);
        s = f.a(s, ejm.c);
        mue1 = ejv.a(e.h.c());
        mua = new Intent("android.intent.action.ATTACH_DATA");
        mua.setDataAndType(s, mue1);
        if (!TextUtils.isEmpty(mue1))
        {
            mua.putExtra("mimeType", mue1);
        }
        mua.addFlags(1);
        s = b.a(c.O_(), mua, new ian(this));
        mue1 = c.a(b.yx);
        mue1 = Intent.createChooser((Intent)s.remove(0), mue1);
        if (s.size() > 0)
        {
            mue1.putExtra("android.intent.extra.INITIAL_INTENTS", (android.os.Parcelable[])s.toArray(new Intent[0]));
        }
        c.a(mue1);
    }

    public final void b(MenuItem menuitem)
    {
        d.a(new eld(Collections.singletonList(e.h), b, a));
    }

    static 
    {
        a = b.yw;
    }
}
