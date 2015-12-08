// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.DialogInterface;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            em

final class fk
    implements android.content.DialogInterface.OnClickListener
{

    final JSONObject a;
    final em b;

    fk(em em1, JSONObject jsonobject)
    {
        b = em1;
        a = jsonobject;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        em.c(b, a);
        dialoginterface.cancel();
        em.h(b);
    }
}
