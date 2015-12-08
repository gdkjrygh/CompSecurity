// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMMetadataCreatedCallback, DRMMetadata

class this._cls0
    implements DRMMetadataCreatedCallback
{

    final DRMMetadata this$0;

    public void MetadataCreated(long l)
    {
        peerObject = l;
    }

    atedCallback()
    {
        this$0 = DRMMetadata.this;
        super();
    }
}
