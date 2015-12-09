// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            b

class a
    implements android.content.ogInterface.OnClickListener
{

    final b a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        k.a(a.getActivity(), new Callable() {

            final b._cls4 a;

            public Void a()
                throws Exception
            {
                if (!b.d(a.a).isBlocked())
                {
                    f.w(b.d(a.a).getId());
                }
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = b._cls4.this;
                super();
            }
        }, a.getString(0x7f070105)).c(new i() {

            final b._cls4 a;

            public Object then(j j1)
                throws Exception
            {
                j1 = b.d(a.a);
                boolean flag;
                if (!b.d(a.a).isBlocked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j1.setBlocked(flag);
                b.e(a.a);
                if (a.a.getActivity() != null)
                {
                    a.a.getActivity().invalidateOptionsMenu();
                }
                return null;
            }

            
            {
                a = b._cls4.this;
                super();
            }
        }, j.b);
    }

    _cls2.a(b b1)
    {
        a = b1;
        super();
    }
}
