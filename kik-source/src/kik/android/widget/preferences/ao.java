// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.DialogInterface;
import android.widget.Toast;
import kik.a.e.b;

// Referenced classes of package kik.android.widget.preferences:
//            MatchingPreference

final class ao
    implements android.content.DialogInterface.OnClickListener
{

    final MatchingPreference a;

    ao(MatchingPreference matchingpreference)
    {
        a = matchingpreference;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.b.e();
        dialoginterface.dismiss();
        Toast.makeText(a.getContext(), 0x7f090027, 0).show();
    }
}
