// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising.auditude;

import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.adobe.mediacore.timeline.advertising.auditude:
//            AuditudeResolver, AuditudeRequest

class this._cls0
    implements Runnable
{

    final AuditudeResolver this$0;

    public void run()
    {
        if (AuditudeResolver.access$500(AuditudeResolver.this).isEmpty())
        {
            return;
        }
        AuditudeResolver.access$602(AuditudeResolver.this, (AuditudeRequest)AuditudeResolver.access$500(AuditudeResolver.this).poll());
        try
        {
            AuditudeResolver.access$700(AuditudeResolver.this, AuditudeResolver.access$600(AuditudeResolver.this).getAuditudeSettings(), (PlacementOpportunity)AuditudeResolver.access$600(AuditudeResolver.this).getPlacementOpportunities().get(0), AuditudeResolver.access$600(AuditudeResolver.this).getAvailCustomParams(), AuditudeResolver.access$600(AuditudeResolver.this).getPlacementInformations());
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            AuditudeResolver.access$300(AuditudeResolver.this).w((new StringBuilder()).append(AuditudeResolver.access$200(AuditudeResolver.this)).append("#startConsumer").toString(), String.valueOf(illegalargumentexception.getMessage()));
            com.adobe.mediacore.tion.Error error = MediaPlayerNotification.createErrorNotification(com.adobe.mediacore.tion.ErrorCode.AD_RESOLVER_METADATA_INVALID, "Invalid ad metadata.");
            MetadataNode metadatanode = new MetadataNode();
            metadatanode.setValue("DESCRIPTION", illegalargumentexception.getMessage());
            error.setMetadata(metadatanode);
            AuditudeResolver.access$800(AuditudeResolver.this, error);
            return;
        }
    }

    ()
    {
        this$0 = AuditudeResolver.this;
        super();
    }
}
