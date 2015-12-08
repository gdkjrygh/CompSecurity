// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;
import com.facebook.share.ShareBuilder;

// Referenced classes of package com.facebook.share.model:
//            ShareModel

public interface ShareModelBuilder
    extends ShareBuilder
{

    public abstract ShareModelBuilder readFrom(Parcel parcel);

    public abstract ShareModelBuilder readFrom(ShareModel sharemodel);
}
