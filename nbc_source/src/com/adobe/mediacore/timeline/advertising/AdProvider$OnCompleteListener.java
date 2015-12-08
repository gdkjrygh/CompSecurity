// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import java.util.List;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            AdProvider

public static interface 
{

    public abstract void onComplete(AdProvider adprovider, List list);

    public abstract void onError(AdProvider adprovider, com.adobe.mediacore.r r);

    public abstract void onWarning(AdProvider adprovider, com.adobe.mediacore.g g);
}
