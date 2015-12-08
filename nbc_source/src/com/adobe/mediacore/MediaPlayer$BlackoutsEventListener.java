// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.TimedMetadata;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayer

public static interface 
    extends 
{

    public abstract void onBackgroundManifestFailed();

    public abstract void onTimedMetadataInBackgroundItem(TimedMetadata timedmetadata);
}
