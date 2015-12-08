// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            BasicLoMo

public interface LoMo
    extends BasicLoMo, Parcelable
{

    public abstract List getFacebookFriends();

    public abstract List getMoreImages();

    public abstract int getNumVideos();

    public abstract boolean isBillboard();
}
