// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.profiles;

import android.widget.TextView;
import com.netflix.mediaclient.android.widget.AdvancedImageView;

// Referenced classes of package com.netflix.mediaclient.ui.profiles:
//            ProfileSelectionActivity

private static class tateHandlerEnabled
{

    private final AdvancedImageView img;
    private final TextView title;



    public I(AdvancedImageView advancedimageview, TextView textview)
    {
        img = advancedimageview;
        title = textview;
        advancedimageview.setPressedStateHandlerEnabled(false);
    }
}
