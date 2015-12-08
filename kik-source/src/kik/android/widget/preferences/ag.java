// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.view.View;

// Referenced classes of package kik.android.widget.preferences:
//            KikProfilePicPreference

final class ag
    implements android.view.View.OnClickListener
{

    final KikProfilePicPreference a;

    ag(KikProfilePicPreference kikprofilepicpreference)
    {
        a = kikprofilepicpreference;
        super();
    }

    public final void onClick(View view)
    {
        if (KikProfilePicPreference.d(a) != null)
        {
            KikProfilePicPreference.d(a).a();
        }
    }
}
