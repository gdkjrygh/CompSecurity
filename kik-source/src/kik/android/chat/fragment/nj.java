// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import android.os.Bundle;

// Referenced classes of package kik.android.chat.fragment:
//            KikPickContactFragment

final class nj
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final KikPickContactFragment b;

    nj(KikPickContactFragment kikpickcontactfragment, String s)
    {
        b = kikpickcontactfragment;
        a = s;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Bundle();
        dialoginterface.putString("kikpickcontactfrag.groupExtraJidReturn", a);
        b.a(dialoginterface);
        b.J();
    }
}
