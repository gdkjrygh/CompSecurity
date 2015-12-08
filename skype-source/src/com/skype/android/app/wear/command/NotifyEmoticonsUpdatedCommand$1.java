// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.skype.android.mediacontent.PackInfo;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.wear.command:
//            NotifyEmoticonsUpdatedCommand

final class this._cls0
    implements Comparator
{

    final NotifyEmoticonsUpdatedCommand this$0;

    public final int compare(PackInfo packinfo, PackInfo packinfo1)
    {
        return packinfo.c() - packinfo1.c();
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((PackInfo)obj, (PackInfo)obj1);
    }

    ()
    {
        this$0 = NotifyEmoticonsUpdatedCommand.this;
        super();
    }
}
