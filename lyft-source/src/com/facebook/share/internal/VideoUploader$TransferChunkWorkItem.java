// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            VideoUploader

class chunkEnd extends chunkEnd
{

    static final Set transientErrorCodes = new HashSet() {

            
            {
                add(Integer.valueOf(0x14cc4b));
                add(Integer.valueOf(0x14cc4d));
                add(Integer.valueOf(0x14cc56));
                add(Integer.valueOf(0x14cc59));
                add(Integer.valueOf(0x14cc61));
            }
    };
    private String chunkEnd;
    private String chunkStart;

    protected void enqueueRetry(int i)
    {
        VideoUploader.access$300(uploadContext, chunkStart, chunkEnd, i);
    }

    public Bundle getParameters()
    {
        Bundle bundle = new Bundle();
        bundle.putString("upload_phase", "transfer");
        bundle.putString("upload_session_id", uploadContext.d);
        bundle.putString("start_offset", chunkStart);
        byte abyte0[] = VideoUploader.access$600(uploadContext, chunkStart, chunkEnd);
        if (abyte0 != null)
        {
            bundle.putByteArray("video_file_chunk", abyte0);
            return bundle;
        } else
        {
            throw new FacebookException("Error reading video");
        }
    }

    protected Set getTransientErrorCodes()
    {
        return transientErrorCodes;
    }

    protected void handleError(FacebookException facebookexception)
    {
        VideoUploader.access$400(facebookexception, "Error uploading video '%s'", new Object[] {
            uploadContext.uploadContext
        });
        endUploadWithFailure(facebookexception);
    }

    protected void handleSuccess(JSONObject jsonobject)
    {
        String s = jsonobject.getString("start_offset");
        jsonobject = jsonobject.getString("end_offset");
        if (Utility.areObjectsEqual(s, jsonobject))
        {
            VideoUploader.access$700(uploadContext, 0);
            return;
        } else
        {
            VideoUploader.access$300(uploadContext, s, jsonobject, 0);
            return;
        }
    }


    public _cls1.add(_cls1.add add, String s, String s1, int i)
    {
        super(add, i);
        chunkStart = s;
        chunkEnd = s1;
    }
}
