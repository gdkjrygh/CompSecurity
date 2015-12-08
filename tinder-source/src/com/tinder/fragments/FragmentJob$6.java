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
    implements ax
{

    final FragmentJob a;

    public final void a(int j)
    {
        if (j != 204 && a.getActivity() != null)
        {
            a.getActivity().runOnUiThread(new Runnable() {

                final FragmentJob._cls6 a;

                public final void run()
                {
                    Toast.makeText(a.a.getActivity(), 0x7f060249, 0).show();
                }

            
            {
                a = FragmentJob._cls6.this;
                super();
            }
            });
        }
    }

    _cls1.a(FragmentJob fragmentjob)
    {
        a = fragmentjob;
        super();
    }
}
