// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.content.DialogInterface;
import com.arist.b.a;
import java.util.ArrayList;

// Referenced classes of package com.arist.model.equize:
//            a

final class b
    implements android.content.DialogInterface.OnClickListener
{

    final com.arist.model.equize.a a;
    private final ArrayList b;

    b(com.arist.model.equize.a a1, ArrayList arraylist)
    {
        a = a1;
        b = arraylist;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        dialoginterface = a;
        a a1 = (a)b.get(i);
        boolean flag;
        if (i >= 23)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dialoginterface.a(a1, flag);
    }
}
