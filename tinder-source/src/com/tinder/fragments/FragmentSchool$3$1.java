// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.support.v4.app.i;
import android.widget.Toast;
import com.tinder.d.a;
import com.tinder.e.ax;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.fragments:
//            FragmentSchool

final class a
    implements Runnable
{

    final tring a;

    public final void run()
    {
        Toast.makeText(a.a.getActivity(), a.a.getString(0x7f06024a), 0).show();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/FragmentSchool$3

/* anonymous class */
    final class FragmentSchool._cls3
        implements ax
    {

        final List a;
        final FragmentSchool b;

        public final void a(int j)
        {
            if (j == 204) goto _L2; else goto _L1
_L1:
            b.getActivity().runOnUiThread(new FragmentSchool._cls3._cls1(this));
_L4:
            return;
_L2:
label0:
            {
                Iterator iterator;
                String s;
                if (FragmentSchool.e(b).size() != a.size())
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (j != 0)
                {
                    break label0;
                }
                iterator = FragmentSchool.e(b).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    s = (String)iterator.next();
                } while (a.contains(s));
                j = 1;
            }
            if (FragmentSchool.e(b).isEmpty() && !a.isEmpty())
            {
                b.e.l();
                com.tinder.managers.a.a("School.Set");
                return;
            }
            if (j != 0)
            {
                com.tinder.managers.a.a("School.Change");
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

            
            {
                b = fragmentschool;
                a = list;
                super();
            }
    }

}
