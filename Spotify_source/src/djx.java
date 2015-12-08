// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.page.DebugFlag;
import java.util.ArrayList;

public class djx extends dxx
{

    private static djy Z = new djy() {

        public final void a()
        {
        }

        public final void a(Optional optional)
        {
        }

        public final void a(String s, String s1)
        {
        }

        public final void b()
        {
        }

    };
    private gim Y;
    private dkl a;
    private dkg b;

    public djx()
    {
        Y = (gim)dmz.a(gim);
    }

    private djy F()
    {
        if (k() == null)
        {
            return Z;
        } else
        {
            return (djy)H().a(this);
        }
    }

    public static djx a(Flags flags)
    {
        ctz.a(flags);
        djx djx1 = new djx();
        fyw.a(djx1, flags);
        return djx1;
    }

    static djy a(djx djx1)
    {
        return djx1.F();
    }

    private void a()
    {
        if (!a.a())
        {
            F().a(Optional.e());
            return;
        } else
        {
            DebugFlag debugflag = DebugFlag.d;
            a.a(new dkm() {

                private djx a;

                public final void a()
                {
                    djx.a(a).a(Optional.e());
                }

                public final void a(String s, String s1)
                {
                    djx.a(a, s, s1);
                }

            
            {
                a = djx.this;
                super();
            }
            });
            return;
        }
    }

    static void a(djx djx1, String s, String s1)
    {
        dkg dkg1 = djx1.b;
        djx1 = djx1. new dkh(s1) {

            private String a;
            private djx b;

            public final void a()
            {
                djx.a(b).a(Optional.b(a));
            }

            public final void a(String s2)
            {
                djx.a(b).a(a, s2);
            }

            
            {
                b = djx.this;
                a = s;
                super();
            }
        };
        geh.b();
        s1 = DebugFlag.d;
        dkg1.a();
        dkg1.b = (new dkg._cls1(dkg1, djx1)).execute(new String[] {
            s
        });
    }

    public final void B()
    {
        if (b != null)
        {
            b.a();
        }
        if (a != null)
        {
            a.b();
            a.hashCode();
        }
        super.B();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030084, viewgroup, false);
    }

    public final void a(int i, int j, Intent intent)
    {
label0:
        {
            super.a(i, j, intent);
            if (i == 4660)
            {
                intent = PermissionsRequestActivity.a(intent).a;
                int k = intent.length;
                i = 0;
                j = 1;
                while (i < k) 
                {
                    boolean flag;
                    if (intent[i] == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    j &= ((flag) ? 1 : 0);
                    i++;
                }
                if (j == 0)
                {
                    break label0;
                }
                if (a == null)
                {
                    a = dkl.a(k());
                    b = new dkg(k());
                }
                a();
            }
            return;
        }
        F().a();
    }

    public final void a(Bundle bundle)
    {
        super.d(bundle);
        ctz.a(H());
        Flags flags = fyw.a(this);
        dkb dkb1 = dkb.a(k());
        boolean flag = dkb1.a();
        boolean flag1 = dkb1.a(flags);
        if (flag && flag1)
        {
            boolean flag2 = Y.a(k(), "android.permission.GET_ACCOUNTS");
            boolean flag3 = Y.a(k(), "android.permission.READ_PHONE_STATE");
            if (!flag2 || !flag3)
            {
                bundle = new ArrayList(2);
                if (!flag2)
                {
                    bundle.add("android.permission.GET_ACCOUNTS");
                }
                if (!flag3)
                {
                    bundle.add("android.permission.READ_PHONE_STATE");
                }
                Y.a(k(), (String[])bundle.toArray(new String[bundle.size()]));
                return;
            }
        }
        a = dkl.a(k());
        b = new dkg(k());
        a.hashCode();
        if (bundle == null)
        {
            if (flag && flag1)
            {
                a();
                return;
            } else
            {
                F().a();
                return;
            }
        } else
        {
            bundle.setClassLoader(k().getClassLoader());
            F().b();
            return;
        }
    }

}
