// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.content.Intent;
import com.roidapp.photogrid.common.an;

// Referenced classes of package com.roidapp.photogrid.release:
//            Preference

final class qd
    implements android.content.DialogInterface.OnClickListener
{

    final Preference a;

    qd(Preference preference)
    {
        a = preference;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        an.b(a, i);
        dialoginterface = new Intent(a, a.getClass());
        a.finish();
        a.startActivity(dialoginterface);
    }
}
