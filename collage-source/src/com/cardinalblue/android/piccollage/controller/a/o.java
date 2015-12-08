// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.os.Bundle;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.BaseShareActivity;
import com.cardinalblue.android.piccollage.controller.network.f;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            a

public class o extends a
{

    protected BaseShareActivity a;

    public o(BaseShareActivity baseshareactivity)
    {
        super(baseshareactivity);
        a = baseshareactivity;
    }

    protected transient Throwable a(Bundle abundle[])
    {
        try
        {
            f.a(a.r(), abundle[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle abundle[])
        {
            return abundle;
        }
        return null;
    }

    protected void a(Throwable throwable)
    {
        super.onPostExecute(throwable);
        if (throwable == null)
        {
            k.a(a, 0x7f070276, 1);
            return;
        } else
        {
            a.a(throwable);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Bundle[])aobj);
    }

    protected void onCancelled()
    {
        k.a(a, 0x7f0700f8, 1);
        super.onCancelled();
    }

    protected void onPostExecute(Object obj)
    {
        a((Throwable)obj);
    }

    protected void onPreExecute()
    {
        super.a(a, 0x7f070277);
    }
}
