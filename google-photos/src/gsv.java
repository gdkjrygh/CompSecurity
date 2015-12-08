// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.permissions.runtime.NoPermissionsActivity;

public final class gsv
    implements android.view.View.OnClickListener
{

    private NoPermissionsActivity a;

    public gsv(NoPermissionsActivity nopermissionsactivity)
    {
        a = nopermissionsactivity;
        super();
    }

    public final void onClick(View view)
    {
        NoPermissionsActivity.a(a);
    }
}
