// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.os.Parcelable;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            BasicLoMo

public interface GenreList
    extends BasicLoMo, Parcelable
{

    public abstract int getNumVideos();

    public abstract boolean isKidsGenre();
}
