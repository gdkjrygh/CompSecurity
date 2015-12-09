// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.fragments:
//            gw

class ha
    implements android.content.DialogInterface.OnClickListener
{

    final gw a;

    ha(gw gw1)
    {
        a = gw1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        gw.a(a);
    }
}
