// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import com.pandora.android.activity.n;
import com.pandora.radio.data.aa;

public class ae
    implements n
{

    private n a;

    public ae()
    {
    }

    public void a(int i, aa aa)
    {
        if (a != null)
        {
            a.a(i, aa);
        }
    }

    public void a(Activity activity)
    {
        if (activity instanceof n)
        {
            a = (n)activity;
            return;
        } else
        {
            a = null;
            return;
        }
    }

    public void b()
    {
        a = null;
    }

    public void p_()
    {
        if (a != null)
        {
            a.p_();
        }
    }
}
