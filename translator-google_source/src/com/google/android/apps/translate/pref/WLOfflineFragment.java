// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.translate.offline.PackageType;

// Referenced classes of package com.google.android.apps.translate.pref:
//            OfflineFragment, i

public class WLOfflineFragment extends OfflineFragment
{

    public WLOfflineFragment()
    {
    }

    protected final i a(Context context, View view)
    {
        return new i(context, view, PackageType.WORD_LENS);
    }
}
