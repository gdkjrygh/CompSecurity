// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.mediacontent.MojiContent;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerItemInteractionManager

public static interface Y
{

    public abstract void onMojiPreviewDismissed();

    public abstract void onMojiSelected(MojiContent mojicontent);

    public abstract void requestThumbnail(int i);
}
