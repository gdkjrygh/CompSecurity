// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.artist;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.pandora.android.artist:
//            e

class a
    implements android.view..OnClickListener
{

    final e a;

    public void onClick(View view)
    {
        a.getDialog().dismiss();
    }

    er(e e1)
    {
        a = e1;
        super();
    }
}
