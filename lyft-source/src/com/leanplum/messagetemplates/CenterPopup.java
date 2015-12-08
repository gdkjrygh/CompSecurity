// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.app.Activity;
import android.content.Context;
import com.leanplum.Leanplum;

// Referenced classes of package com.leanplum.messagetemplates:
//            BaseMessageDialog, CenterPopupOptions, j

public class CenterPopup extends BaseMessageDialog
{

    public CenterPopup(Activity activity, CenterPopupOptions centerpopupoptions)
    {
        super(activity, false, centerpopupoptions, null);
        options = centerpopupoptions;
    }

    public static void register(Context context)
    {
        Leanplum.defineAction("Center Popup", Leanplum.ACTION_KIND_MESSAGE | Leanplum.ACTION_KIND_ACTION, CenterPopupOptions.toArgs(context), new j());
    }
}
