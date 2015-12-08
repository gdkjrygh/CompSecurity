// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.exo;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ManifestResponseException extends IOException
{

    private static final Map b;
    private static final long serialVersionUID = 43L;
    private final transient JSONObject a = b();
    private final int mHttpStatusCode;
    private final String mJsonResponse;

    public ManifestResponseException(int i, String s)
    {
        super((new StringBuilder("http status = ")).append(i).append("; jsonResponse").append(s).toString());
        mHttpStatusCode = i;
        if (i == 404 && TextUtils.isEmpty(s))
        {
            mJsonResponse = String.format("{reason='%s'}", new Object[] {
                "MANIFEST_DELETED"
            });
        } else
        {
            mJsonResponse = s;
        }
    }

    static String a(ManifestResponseException manifestresponseexception)
    {
        return manifestresponseexception.mJsonResponse;
    }

    static int b(ManifestResponseException manifestresponseexception)
    {
        return manifestresponseexception.mHttpStatusCode;
    }

    private JSONObject b()
    {
        if (mJsonResponse == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        JSONObject jsonobject = new JSONObject(mJsonResponse);
        return jsonobject;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Proxy required");
    }

    private Object writeReplace()
    {
        return new SerializationProxy();
    }

    public final String a()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        String s;
        s = a.getString("reason");
        s = (String)b.get(s);
        if (s != null)
        {
            return s;
        }
        break MISSING_BLOCK_LABEL_37;
        JSONException jsonexception;
        jsonexception;
        return "video_playback_error";
    }

    static 
    {
        HashMap hashmap = new HashMap();
        b = hashmap;
        hashmap.put("geoLocation", "video_georestricted");
        b.put("GEO_RESTRICTED", "video_georestricted");
        b.put("UNSUPPORTED_PLATFORM_VERSION", "video_unsopported_platform_version");
        b.put("UNSUPPORTED_CLIENT_VERSION", "video_unsupported_client_version");
        b.put("MANIFEST_DELETED", "video_manifest_deleted");
    }

    private class SerializationProxy
        implements Serializable
    {

        private static final long serialVersionUID = 0x21830df2ab75d01dL;
        private final int mHttpStatusCode;
        private final String mJsonResponse;

        private Object readResolve()
        {
            return new ManifestResponseException(mHttpStatusCode, mJsonResponse);
        }

        public SerializationProxy()
        {
            mJsonResponse = ManifestResponseException.a(ManifestResponseException.this);
            mHttpStatusCode = ManifestResponseException.b(ManifestResponseException.this);
        }
    }

}
