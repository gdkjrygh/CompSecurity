// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.os.Parcelable;
import com.netflix.mediaclient.servicemgr.Trackable;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            PlayContextImp

public interface PlayContext
    extends Trackable, Parcelable
{

    public static final int DEFAULT_MDX_TRACKID = 0xd2a38f;
    public static final PlayContext DFLT_MDX_CONTEXT = new PlayContextImp(null, 0xd2a38f, 0, 0);
    public static final PlayContext EMPTY_CONTEXT = new PlayContextImp();
    public static final int NFLX_MDX_3RD_PARTY_LAUNCHER_TRACKID = 0xd1c419;
    public static final PlayContext NFLX_MDX_CONTEXT = new PlayContextImp(null, 0xd1c419, 0, 0);

    public abstract int getVideoPos();

}
