// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.mediacontent.MediaContent;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerItemInteractionManager

public static interface a
{

    public abstract MediaContent getItem(int i);

    public abstract void refreshItem(int i);

    public abstract void setTelemetrydata(MediaContent mediacontent);
}
