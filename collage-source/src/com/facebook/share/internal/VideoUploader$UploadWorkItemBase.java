// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import android.os.Handler;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            VideoUploader

private static abstract class completedRetries
    implements Runnable
{

    protected int completedRetries;
    protected endUploadWithFailure uploadContext;

    private boolean attemptRetry(int i)
    {
        if (completedRetries < 2 && getTransientErrorCodes().contains(Integer.valueOf(i)))
        {
            i = (int)Math.pow(3D, completedRetries);
            VideoUploader.access$800().postDelayed(new Runnable() {

                final VideoUploader.UploadWorkItemBase this$0;

                public void run()
                {
                    enqueueRetry(completedRetries + 1);
                }

            
            {
                this$0 = VideoUploader.UploadWorkItemBase.this;
                super();
            }
            }, i * 5000);
            return true;
        } else
        {
            return false;
        }
    }

    protected void endUploadWithFailure(FacebookException facebookexception)
    {
        issueResponseOnMainThread(facebookexception, null);
    }

    protected abstract void enqueueRetry(int i);

    protected void executeGraphRequestSynchronously(Bundle bundle)
    {
        bundle = (new GraphRequest(uploadContext.sToken, String.format(Locale.ROOT, "%s/videos", new Object[] {
            uploadContext.Node
        }), bundle, HttpMethod.POST, null)).executeAndWait();
        if (bundle != null)
        {
            FacebookRequestError facebookrequesterror = bundle.getError();
            JSONObject jsonobject = bundle.getJSONObject();
            if (facebookrequesterror != null)
            {
                if (!attemptRetry(facebookrequesterror.getSubErrorCode()))
                {
                    handleError(new FacebookGraphResponseException(bundle, "Video upload failed"));
                }
                return;
            }
            if (jsonobject != null)
            {
                try
                {
                    handleSuccess(jsonobject);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    endUploadWithFailure(new FacebookException("Unexpected error in server response", bundle));
                }
                return;
            } else
            {
                handleError(new FacebookException("Unexpected error in server response"));
                return;
            }
        } else
        {
            handleError(new FacebookException("Unexpected error in server response"));
            return;
        }
    }

    protected abstract Bundle getParameters()
        throws Exception;

    protected abstract Set getTransientErrorCodes();

    protected abstract void handleError(FacebookException facebookexception);

    protected abstract void handleSuccess(JSONObject jsonobject)
        throws JSONException;

    protected void issueResponseOnMainThread(final FacebookException error, final String videoId)
    {
        VideoUploader.access$800().post(new Runnable() {

            final VideoUploader.UploadWorkItemBase this$0;
            final FacebookException val$error;
            final String val$videoId;

            public void run()
            {
                VideoUploader.access$900(uploadContext, error, videoId);
            }

            
            {
                this$0 = VideoUploader.UploadWorkItemBase.this;
                error = facebookexception;
                videoId = s;
                super();
            }
        });
    }

    public void run()
    {
        if (!uploadContext.celed)
        {
            try
            {
                executeGraphRequestSynchronously(getParameters());
                return;
            }
            catch (FacebookException facebookexception)
            {
                endUploadWithFailure(facebookexception);
                return;
            }
            catch (Exception exception)
            {
                endUploadWithFailure(new FacebookException("Video upload failed", exception));
            }
            return;
        } else
        {
            endUploadWithFailure(null);
            return;
        }
    }

    protected _cls2.val.videoId(_cls2.val.videoId videoid, int i)
    {
        uploadContext = videoid;
        completedRetries = i;
    }
}
