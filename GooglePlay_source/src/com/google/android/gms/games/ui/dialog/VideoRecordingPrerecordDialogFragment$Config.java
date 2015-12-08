// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            VideoRecordingPrerecordDialogFragment

public static final class packageName
{

    public final String applicationId;
    public final String packageName;

    public static packageName load(Bundle bundle)
    {
        return new <init>(bundle.getString("APPLICATION_ID"), bundle.getString("PACKAGE_NAME"));
    }

    public final void save(Bundle bundle)
    {
        bundle.putString("APPLICATION_ID", applicationId);
        bundle.putString("PACKAGE_NAME", packageName);
    }

    public Y(String s, String s1)
    {
        applicationId = s;
        packageName = s1;
    }
}
