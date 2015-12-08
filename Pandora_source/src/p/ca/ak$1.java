// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.view.View;
import com.pandora.android.activity.a;

// Referenced classes of package p.ca:
//            ak

class Object
    implements android.view.OnClickListener
{

    final ak a;

    public void onClick(View view)
    {
        com.pandora.android.activity.a.a(a.getActivity(), new Runnable(view) {

            final View a;
            final ak._cls1 b;

            public void run()
            {
                a.setEnabled(false);
            }

            
            {
                b = ak._cls1.this;
                a = view;
                super();
            }
        });
    }

    Object(ak ak1)
    {
        a = ak1;
        super();
    }
}
