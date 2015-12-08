// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import kik.a.a.c;

// Referenced classes of package kik.android.chat.fragment:
//            a, AbTestsFragment

final class b
    implements android.content.DialogInterface.OnClickListener
{

    final kik.a.a.b a;
    final a b;

    b(a a1, kik.a.a.b b1)
    {
        b = a1;
        a = b1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.a(a.b()[i]);
        b.a.a.a(dialoginterface);
        b.a.a(null);
    }
}
