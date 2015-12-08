// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.support.v4.app.i;
import android.widget.Toast;
import com.tinder.e.ax;

// Referenced classes of package com.tinder.fragments:
//            FragmentJob

final class a
    implements Runnable
{

    final ctivity a;

    public final void run()
    {
        Toast.makeText(a.a.getActivity(), 0x7f060249, 0).show();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/FragmentJob$6

/* anonymous class */
    final class FragmentJob._cls6
        implements ax
    {

        final FragmentJob a;

        public final void a(int j)
        {
            if (j != 204 && a.getActivity() != null)
            {
                a.getActivity().runOnUiThread(new FragmentJob._cls6._cls1(this));
            }
        }

            
            {
                a = fragmentjob;
                super();
            }
    }

}
