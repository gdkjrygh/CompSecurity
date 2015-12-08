// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.propeller.PropellerDatabase;

// Referenced classes of package com.soundcloud.android.offline:
//            ClearTrackDownloadsCommand

class > extends com.soundcloud.propeller.
{

    final ClearTrackDownloadsCommand this$0;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.delete(com.soundcloud.android.storage.step));
        step(propellerdatabase.delete(com.soundcloud.android.storage.step));
    }

    A()
    {
        this$0 = ClearTrackDownloadsCommand.this;
        super();
    }
}
