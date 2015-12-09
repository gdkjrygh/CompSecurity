// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;

public final class gil
    implements gim
{

    public gil()
    {
    }

    public final transient void a(Activity activity, String as[])
    {
        activity.startActivityForResult(PermissionsRequestActivity.a(activity, as), 4660);
    }

    public final boolean a(Context context, String s)
    {
        return ct.a(context, s) == 0;
    }
}
