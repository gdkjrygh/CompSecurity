// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.tos;

import android.content.DialogInterface;
import dfi;

// Referenced classes of package com.spotify.music.spotlets.tos:
//            TermsOfServiceChangedActivity

final class a
    implements android.content.ngedActivity._cls1
{

    private TermsOfServiceChangedActivity a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ((dfi)dialoginterface).setOnDismissListener(null);
        TermsOfServiceChangedActivity.a(a);
    }

    (TermsOfServiceChangedActivity termsofservicechangedactivity)
    {
        a = termsofservicechangedactivity;
        super();
    }
}
