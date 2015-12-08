// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.pandora.android.util.af;
import p.ca.k;
import p.ca.x;
import p.ca.y;

public abstract class a extends k
    implements x
{

    protected y a;

    public a()
    {
        a = new y();
    }

    public void a(boolean flag, boolean flag1)
    {
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

    public boolean i()
    {
        return false;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        a.a(activity);
    }

    public void onDetach()
    {
        super.onDetach();
        a.a();
    }

    public void onResume()
    {
        super.onResume();
        af.a().a(v());
    }
}
