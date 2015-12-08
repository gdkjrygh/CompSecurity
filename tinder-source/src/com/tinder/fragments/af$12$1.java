// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.support.v4.app.i;
import com.tinder.c.ah;
import java.util.TimerTask;

// Referenced classes of package com.tinder.fragments:
//            af

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        af.k(a.a).l();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/af$12

/* anonymous class */
    final class af._cls12 extends TimerTask
    {

        final af a;

        public final void run()
        {
            a.getActivity().runOnUiThread(new af._cls12._cls1(this));
        }

            
            {
                a = af1;
                super();
            }
    }

}
