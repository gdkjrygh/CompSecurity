// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            i, ae

class j
    implements android.content.DialogInterface.OnClickListener
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int k)
    {
        dialoginterface.dismiss();
        i.a(a).a(false);
    }
}
