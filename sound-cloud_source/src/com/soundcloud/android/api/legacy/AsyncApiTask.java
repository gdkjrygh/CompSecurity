// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import android.os.AsyncTask;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.utils.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            Endpoints, PublicApi

public abstract class AsyncApiTask extends AsyncTask
    implements Endpoints, HttpStatus
{

    public final PublicApi api;
    protected final List errors = new ArrayList();

    public AsyncApiTask(PublicApi publicapi)
    {
        api = publicapi;
    }

    public void extractErrors(HttpResponse httpresponse)
        throws IOException
    {
        errors.addAll(IOUtils.parseError(api.getMapper().reader(), httpresponse.getEntity().getContent()));
    }

    public String getFirstError()
    {
        if (errors.isEmpty())
        {
            return null;
        } else
        {
            return (String)errors.get(0);
        }
    }

    public void warn(String s)
    {
        s = SoundCloudApplication.TAG;
    }

    public void warn(String s, Throwable throwable)
    {
        s = SoundCloudApplication.TAG;
    }

    public void warn(String s, HttpResponse httpresponse)
    {
        String s1 = SoundCloudApplication.TAG;
        (new StringBuilder()).append(s).append(": ").append(httpresponse.getStatusLine().toString());
    }
}
