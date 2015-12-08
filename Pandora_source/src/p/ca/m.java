// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.pandora.android.ads.b;
import com.pandora.android.util.a;
import com.pandora.android.util.af;

// Referenced classes of package p.ca:
//            n, x, y

public abstract class m extends n
    implements b, x
{

    protected y i;

    public m()
    {
        i = new y();
    }

    public void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            af.a().a(v());
        }
    }

    public boolean a()
    {
        return false;
    }

    public boolean a(Intent intent)
    {
        return false;
    }

    public void b(Bundle bundle)
    {
    }

    public void b(boolean flag)
    {
    }

    public boolean c()
    {
        return false;
    }

    public CharSequence d()
    {
        return null;
    }

    public boolean i()
    {
        return false;
    }

    public int l_()
    {
        return 1;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        i.a(activity);
    }

    public void onDetach()
    {
        super.onDetach();
        i.a();
    }

    public void onResume()
    {
        super.onResume();
        if (com.pandora.android.util.a.a(p.dj.b.a.i))
        {
            af.a().a(v());
        }
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.aa;
    }
}
