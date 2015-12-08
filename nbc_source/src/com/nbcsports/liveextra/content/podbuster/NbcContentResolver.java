// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.podbuster;

import android.content.Context;
import android.text.TextUtils;
import com.adobe.mediacore.metadata.AuditudeSettings;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import com.adobe.mediacore.timeline.advertising.auditude.AuditudeResolver;
import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.Midroll;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.List;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.content.podbuster:
//            AffiliateResolver

public class NbcContentResolver extends AuditudeResolver
{

    private final String NBC_MIDROLL_URL = "http://stream.nbcsports.com/data/midrolls/{{id}}_{{pid}}.json";
    private AffiliateResolver affiliateResolver;
    private AuditudeSettings auditudeMetadata;
    private String id;
    private final boolean isLive;
    private MetadataNode metadata;
    private String originalSiteSection;
    private final String pid;
    private PlacementOpportunity placementOpportunity;

    public NbcContentResolver(Context context, String s, boolean flag)
    {
        super(context);
        pid = s;
        isLive = flag;
        if (s != null && flag)
        {
            affiliateResolver = new AffiliateResolver(s);
        }
    }

    private void setParams(String s)
    {
        auditudeMetadata.getCustomParameters().setValue("FW_PARAMS", s);
        Timber.d((new StringBuilder()).append("Midroll param: ").append(s).toString(), new Object[0]);
        resolve(metadata, placementOpportunity);
    }

    protected void doResolveAds(Metadata metadata1, PlacementOpportunity placementopportunity)
    {
        this;
        JVM INSTR monitorenter ;
        placementOpportunity = placementopportunity;
        id = placementopportunity.getId();
        if (isLive && !TextUtils.isEmpty(pid) && !TextUtils.isEmpty(id)) goto _L2; else goto _L1
_L1:
        Timber.d((new StringBuilder()).append("Bailing on alternate ad call...isLive=").append(Boolean.toString(isLive)).append(", pid=").append(pid).append(", id=").append(id).toString(), new Object[0]);
        super.doResolveAds(metadata1, placementopportunity);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        metadata = (MetadataNode)metadata1;
        auditudeMetadata = (AuditudeSettings)metadata.getNode(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue());
        Timber.d((new StringBuilder()).append("Placement Id: ").append(placementopportunity.getId()).toString(), new Object[0]);
        Timber.d((new StringBuilder()).append("Placement Info: ").append(placementopportunity.getPlacementInformation().toString()).toString(), new Object[0]);
        if (originalSiteSection == null)
        {
            originalSiteSection = auditudeMetadata.getCustomParameters().getValue("SITE_SECTION_ID");
        }
        metadata1 = getMidrollUrl();
        Timber.d((new StringBuilder()).append("MidrollURL: ").append(metadata1).toString(), new Object[0]);
        metadata1 = (new com.squareup.okhttp.Request.Builder()).get().url(metadata1).build();
        (new OkHttpClient()).newCall(metadata1).enqueue(new Callback() {

            final NbcContentResolver this$0;

            public void onFailure(Request request, IOException ioexception)
            {
                auditudeMetadata.getCustomParameters().setValue("SITE_SECTION_ID", originalSiteSection);
                setParams("");
            }

            public void onResponse(Response response)
                throws IOException
            {
                Gson gson;
                Response response1;
                String s2;
                String s3;
                s3 = "";
                s2 = originalSiteSection;
                if (!response.isSuccessful())
                {
                    auditudeMetadata.getCustomParameters().setValue("SITE_SECTION_ID", s2);
                    setParams("");
                    return;
                }
                gson = new Gson();
                response1 = null;
                response = (List)gson.fromJson(response.body().string(), com/nbcsports/liveextra/content/models/Midroll$Collection);
                response1 = response;
_L2:
                response = s3;
                String s = s2;
                if (response1 != null)
                {
                    response = s3;
                    s = s2;
                    if (response1.size() > 0)
                    {
                        Midroll midroll = (Midroll)response1.get(0);
                        response = s3;
                        s = s2;
                        if (midroll != null)
                        {
                            String s1 = midroll.getFreewheelParam();
                            response = s1;
                            s = s2;
                            if (affiliateResolver != null)
                            {
                                response = s1;
                                s = s2;
                                if (affiliateResolver.isAffiliateMidroll(midroll))
                                {
                                    s = affiliateResolver.getAffiliateParams(originalSiteSection);
                                    response = s1;
                                }
                            }
                        }
                    }
                }
                auditudeMetadata.getCustomParameters().setValue("SITE_SECTION_ID", s);
                setParams(response);
                return;
                response;
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$0 = NbcContentResolver.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        metadata1;
        throw metadata1;
    }

    public String getMidrollUrl()
    {
        return "http://stream.nbcsports.com/data/midrolls/{{id}}_{{pid}}.json".replace("{{id}}", id).replace("{{pid}}", pid);
    }

    public void resolve(Metadata metadata1, PlacementOpportunity placementopportunity)
    {
        super.doResolveAds(metadata1, placementopportunity);
    }




}
