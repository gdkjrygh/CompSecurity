// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.tos;

import android.content.DialogInterface;

// Referenced classes of package com.spotify.music.spotlets.tos:
//            TermsOfServiceChangedActivity

final class a
    implements android.content.
{

    private TermsOfServiceChangedActivity a;

    public final void onCancel(DialogInterface dialoginterface)
    {
        TermsOfServiceChangedActivity.c(a);
    }

    (TermsOfServiceChangedActivity termsofservicechangedactivity)
    {
        a = termsofservicechangedactivity;
        super();
    }
}
