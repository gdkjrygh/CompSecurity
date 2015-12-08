// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.photos.settings.AssistantSettingsActivity;

public final class icg
    implements android.view.View.OnClickListener
{

    private icf a;

    public icg(icf icf1)
    {
        a = icf1;
        super();
    }

    public final void onClick(View view)
    {
        mry.a(icf.a(a), 4, (new msn()).a(new msm(pws.c)).a(icf.a(a)));
        view = new Intent(icf.a(a), com/google/android/apps/photos/settings/AssistantSettingsActivity);
        view.putExtra("account_id", icf.b(a));
        icf.a(a).startActivity(view);
    }
}
