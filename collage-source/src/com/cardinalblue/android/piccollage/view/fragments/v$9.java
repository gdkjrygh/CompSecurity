// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.DialogInterface;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.Collage;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            v

class a
    implements android.content.ogInterface.OnClickListener
{

    final Collage a;
    final v b;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (v.a(b, a))
        {
            v.b(b);
        } else
        {
            k.a(b.getActivity(), 0x7f0700f8, 1);
        }
        dialoginterface.dismiss();
    }

    (v v1, Collage collage)
    {
        b = v1;
        a = collage;
        super();
    }
}
