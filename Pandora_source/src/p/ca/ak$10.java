// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.Context;
import android.view.View;
import com.pandora.android.util.s;

// Referenced classes of package p.ca:
//            ak

class bject
    implements android.view.nClickListener
{

    final ak a;

    public void onClick(View view)
    {
        view = a.getActivity();
        view.startActivity(s.c(view));
    }

    w.View(ak ak1)
    {
        a = ak1;
        super();
    }
}
