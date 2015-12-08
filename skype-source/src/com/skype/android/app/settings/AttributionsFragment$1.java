// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.res.Resources;
import com.google.android.gms.common.e;
import com.skype.android.config.FileUtil;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.settings:
//            AttributionsFragment

final class val.isLocationSharingEnabled
    implements Callable
{

    final AttributionsFragment this$0;
    final boolean val$isLocationSharingEnabled;

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public final String call()
        throws android.content.res.tion
    {
        StringBuilder stringbuilder = new StringBuilder(FileUtil.inputStreamToString(getResources().openRawResource(0x7f070020)));
        if (val$isLocationSharingEnabled)
        {
            stringbuilder.append("\n----------------------------------------------\n\nGoogle Play Services attribution\n\n\n").append(e.d(getActivity()));
        }
        return stringbuilder.toString();
    }

    ()
    {
        this$0 = final_attributionsfragment;
        val$isLocationSharingEnabled = Z.this;
        super();
    }
}
