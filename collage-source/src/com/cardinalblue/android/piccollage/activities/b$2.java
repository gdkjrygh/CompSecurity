// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.cardinalblue.android.b.e;
import com.cardinalblue.android.piccollage.model.k;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            b

class a
    implements android.content.ogInterface.OnClickListener
{

    final b a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.media.action.IMAGE_CAPTURE");
        if (!e.a)
        {
            b.a(a, Uri.fromFile(k.a("Photo", "jpg")));
            dialoginterface.putExtra("output", b.f(a));
        }
        try
        {
            a.startActivityForResult(dialoginterface, 110);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            com.cardinalblue.android.b.k.a(a.getActivity(), 0x7f0701e1, 0);
        }
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
