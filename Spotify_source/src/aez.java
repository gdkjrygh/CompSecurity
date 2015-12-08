// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.bmwgroup.connected.car.internal.SdkManager;

public abstract class aez
    implements adl
{

    public final ahn a = ahn.a("connected.car.sdk");
    public final String b;
    private agm c;

    public aez(adl adl1, adm adm)
    {
        b = SdkManager.a.a();
        c = (agm)aia.a().a(agj);
        a.b("InternalScreen(mIdent=%s, this=%s, parent=%s, l=%s)", new Object[] {
            b, this, adl1, adm
        });
    }

    public final void a(String s)
    {
        a.b("setTitle(%s)", new Object[] {
            s
        });
        Object obj = c;
        String s1 = b;
        obj = new Intent((new StringBuilder()).append(((agm) (obj)).a).append("#setTitle(java.lang.String arg0, java.lang.String arg1)").toString());
        ((Intent) (obj)).putExtra("arg0", s1);
        ((Intent) (obj)).putExtra("arg1", s);
        agm.a(((Intent) (obj)));
    }

    public final void b(String s)
    {
        a.b("showError(%s)", new Object[] {
            s
        });
        Object obj = c;
        obj = new Intent((new StringBuilder()).append(((agm) (obj)).a).append("#showError(java.lang.String arg0)").toString());
        ((Intent) (obj)).putExtra("arg0", s);
        agm.a(((Intent) (obj)));
    }
}
