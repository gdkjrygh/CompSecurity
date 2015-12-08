// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package ly.kite.instagramphotopicker:
//            InstagramPhoto

public class InstagramMediaRequest
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls2();
    private static final String GENERIC_NETWORK_EXCEPTION_MESSAGE = "Failed to reach Instagram. Please check your internet connectivity and try again";
    private static final String MEDIA_URL_ENDPOINT = "https://api.instagram.com/v1/users/self/media/recent";
    private final String baseURL;
    private AsyncTask requestTask;

    public InstagramMediaRequest()
    {
        baseURL = "https://api.instagram.com/v1/users/self/media/recent";
    }

    public InstagramMediaRequest(Parcel parcel)
    {
        baseURL = parcel.readString();
    }

    private InstagramMediaRequest(String s)
    {
        baseURL = s;
    }

    private static InstagramMediaRequest parseNextPageRequestFromResponseJSON(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = null;
        String s = jsonobject.getJSONObject("pagination").optString("next_url", null);
        jsonobject = obj;
        if (s != null)
        {
            jsonobject = new InstagramMediaRequest(s);
        }
        return jsonobject;
    }

    private static List parsePhotosFromResponseJSON(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist;
        JSONArray jsonarray;
        int i;
        arraylist = new ArrayList();
        jsonarray = jsonobject.getJSONArray("data");
        i = 0;
_L3:
        if (i >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj = jsonarray.getJSONObject(i).getJSONObject("images");
        jsonobject = ((JSONObject) (obj)).getJSONObject("thumbnail");
        obj1 = ((JSONObject) (obj)).getJSONObject("standard_resolution");
        obj = jsonobject.getString("url");
        obj1 = ((JSONObject) (obj1)).getString("url");
        jsonobject = ((JSONObject) (obj));
        if (((String) (obj)).startsWith("http://"))
        {
            jsonobject = ((String) (obj)).replace("http://", "https://");
        }
        String s = ((String) (obj1));
        try
        {
            if (((String) (obj1)).startsWith("http://"))
            {
                s = ((String) (obj1)).replace("http://", "https://");
            }
            arraylist.add(new InstagramPhoto(new URL(jsonobject), new URL(s)));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        return arraylist;
    }

    public void cancel()
    {
        if (requestTask != null)
        {
            requestTask.cancel(true);
            requestTask = null;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void getMedia(String s, InstagramMediaRequestListener instagrammediarequestlistener)
    {
        requestTask = new _cls1(s, instagrammediarequestlistener);
        requestTask.execute(new Void[0]);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(baseURL);
    }





    // Unreferenced inner class ly/kite/instagramphotopicker/InstagramMediaRequest$InstagramMediaRequestListener
    /* block-local class not found */
    class InstagramMediaRequestListener {}


    // Unreferenced inner class ly/kite/instagramphotopicker/InstagramMediaRequest$MediaResponse
    /* block-local class not found */
    class MediaResponse {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
