// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            FileUploadCollection

public class FileUpload extends APIResource
{

    Long created;
    String id;
    String purpose;
    Long size;
    String type;
    String url;

    public FileUpload()
    {
    }

    public static FileUploadCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static FileUploadCollection all(Map map, RequestOptions requestoptions)
    {
        return (FileUploadCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/FileUpload, "https://uploads.stripe.com"), map, com/stripe/model/FileUploadCollection, requestoptions);
    }

    public static FileUploadCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static FileUpload create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static FileUpload create(Map map, RequestOptions requestoptions)
    {
        return (FileUpload)multipartRequest(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/FileUpload, "https://uploads.stripe.com"), map, com/stripe/model/FileUpload, requestoptions);
    }

    public static FileUpload create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static FileUpload retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static FileUpload retrieve(String s, RequestOptions requestoptions)
    {
        return (FileUpload)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/FileUpload, s, "https://uploads.stripe.com"), null, com/stripe/model/FileUpload, requestoptions);
    }

    public static FileUpload retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public Long getCreated()
    {
        return created;
    }

    public String getId()
    {
        return id;
    }

    public String getPurpose()
    {
        return purpose;
    }

    public Long getSize()
    {
        return size;
    }

    public String getType()
    {
        return type;
    }

    public String getURL()
    {
        return url;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setPurpose(String s)
    {
        purpose = s;
    }

    public void setSize(Long long1)
    {
        size = long1;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setURL(String s)
    {
        url = s;
    }
}
