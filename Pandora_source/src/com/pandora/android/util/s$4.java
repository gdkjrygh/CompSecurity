// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.DialogInterface;
import com.pandora.android.provider.b;
import com.pandora.radio.util.k;
import com.pandora.radio.util.s;
import p.cw.c;

// Referenced classes of package com.pandora.android.util:
//            s

static final class ce
    implements android.content.ogInterface.OnClickListener
{

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = b.a;
        dialoginterface.b().G().c();
        dialoginterface.b().o().e("cancel");
    }

    ce()
    {
    }
}
