// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            r, k, q

final class s
    implements android.content.DialogInterface.OnClickListener
{

    final r a;

    s(r r1)
    {
        a = r1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.b.d();
        a.a.a(null);
    }
}
