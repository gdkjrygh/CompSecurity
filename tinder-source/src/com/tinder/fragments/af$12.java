// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.support.v4.app.i;
import com.tinder.c.ah;
import java.util.TimerTask;

// Referenced classes of package com.tinder.fragments:
//            af

final class a extends TimerTask
{

    final af a;

    public final void run()
    {
        a.getActivity().runOnUiThread(new Runnable() {

            final af._cls12 a;

            public final void run()
            {
                af.k(a.a).l();
            }

            
            {
                a = af._cls12.this;
                super();
            }
        });
    }

    _cls1.a(af af1)
    {
        a = af1;
        super();
    }
}
