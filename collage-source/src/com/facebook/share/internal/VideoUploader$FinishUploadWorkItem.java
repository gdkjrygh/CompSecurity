// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            VideoUploader

private static class nit> extends nit>
{

    static final Set transientErrorCodes = new HashSet() {

            
            {
                add(Integer.valueOf(0x14cc43));
            }
    };

    protected void enqueueRetry(int i)
    {
        VideoUploader.access$700(uploadContext, i);
    }

    public Bundle getParameters()
    {
        Bundle bundle = new Bundle();
        if (uploadContext.uploadContext != null)
        {
            bundle.putAll(uploadContext.uploadContext);
        }
        bundle.putString("upload_phase", "finish");
        bundle.putString("upload_session_id", uploadContext.Id);
        Utility.putNonEmptyString(bundle, "title", uploadContext.uploadContext);
        Utility.putNonEmptyString(bundle, "description", uploadContext.tion);
        Utility.putNonEmptyString(bundle, "ref", uploadContext.uploadContext);
        return bundle;
    }

    protected Set getTransientErrorCodes()
    {
        return transientErrorCodes;
    }

    protected void handleError(FacebookException facebookexception)
    {
        VideoUploader.access$400(facebookexception, "Video '%s' failed to finish uploading", new Object[] {
            uploadContext.
        });
        endUploadWithFailure(facebookexception);
    }

    protected void handleSuccess(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject.getBoolean("success"))
        {
            issueResponseOnMainThread(null, uploadContext.);
            return;
        } else
        {
            handleError(new FacebookException("Unexpected error in server response"));
            return;
        }
    }


    public _cls1.add(_cls1.add add, int i)
    {
        super(add, i);
    }
}
