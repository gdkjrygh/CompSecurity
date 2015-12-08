// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

// Referenced classes of package com.skype.android.app.settings:
//            BinaryDialogPreference

public class AutoBuddyDialogPreference extends BinaryDialogPreference
{

    public AutoBuddyDialogPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = getContext().getResources().getTextArray(0x7f0a0008);
        attributeset = getContext().getResources().getTextArray(0x7f0a0009);
        setHeaders(context);
        setDetails(attributeset);
    }
}
