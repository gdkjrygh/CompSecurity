// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.view.View;
import com.pandora.android.activity.a;

// Referenced classes of package p.ca:
//            ak

class ject
    implements Runnable
{

    final View a;
    final .View b;

    public void run()
    {
        a.setEnabled(false);
    }

    .View(.View view, View view1)
    {
        b = view;
        a = view1;
        super();
    }

    // Unreferenced inner class p/ca/ak$1

/* anonymous class */
    class ak._cls1
        implements android.view.View.OnClickListener
    {

        final ak a;

        public void onClick(View view)
        {
            com.pandora.android.activity.a.a(a.getActivity(), new ak._cls1._cls1(this, view));
        }

            
            {
                a = ak1;
                super();
            }
    }

}
