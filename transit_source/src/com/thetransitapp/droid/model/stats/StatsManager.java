// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.stats;

import android.app.Activity;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.http.AndroidHttpClient;
import android.util.Base64;
import android.util.Log;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.maps.model.LatLng;
import com.thetransitapp.droid.data.BaseOnlineSource;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.service.BaseServiceTask;
import com.thetransitapp.droid.util.ServiceUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.OpenUDID.OpenUDID_manager;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;

// Referenced classes of package com.thetransitapp.droid.model.stats:
//            Session

public class StatsManager extends BaseServiceTask
{

    private final Activity activity;
    private final ConnectivityManager connectivityManager;
    private Session currentSession;
    private JSONArray sessionsToSend;
    private String statURL;

    public StatsManager(Activity activity1, ConnectivityManager connectivitymanager)
    {
        super(activity1);
        activity = activity1;
        connectivityManager = connectivitymanager;
    }

    private byte[] decrypt(byte abyte0[], byte abyte1[])
        throws Exception
    {
        abyte0 = new SecretKeySpec(abyte0, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, abyte0, new IvParameterSpec(new byte[16]));
        return cipher.doFinal(abyte1);
    }

    private JSONArray decryptSessions(String s)
        throws Exception
    {
        return new JSONArray(new String(decrypt(getRawKey(OpenUDID_manager.getOpenUDID().substring(0, 10)), Base64.decode(s, 2))));
    }

    private byte[] encrypt(byte abyte0[], byte abyte1[])
        throws Exception
    {
        abyte0 = new SecretKeySpec(abyte0, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, abyte0, new IvParameterSpec(new byte[16]));
        return cipher.doFinal(abyte1);
    }

    private String getEncryptedSessions(JSONArray jsonarray)
        throws Exception
    {
        jsonarray = jsonarray.toString();
        return Base64.encodeToString(encrypt(getRawKey(OpenUDID_manager.getOpenUDID().substring(0, 10)), jsonarray.getBytes("UTF-8")), 2);
    }

    private static byte[] getRawKey(String s)
        throws Exception
    {
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
        messagedigest.reset();
        return messagedigest.digest(s.getBytes("UTF-8"));
    }

    private JSONArray readSessionsFromDisk()
    {
        JSONArray jsonarray;
        JSONArray jsonarray1;
        Object obj;
        jsonarray1 = new JSONArray();
        obj = jsonarray1;
        jsonarray = jsonarray1;
        if (!(new File(statsFilePath())).exists())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        jsonarray = jsonarray1;
        try
        {
            obj = new FileInputStream(statsFilePath());
        }
        catch (Exception exception)
        {
            Log.e(com/thetransitapp/droid/model/stats/StatsManager.getSimpleName(), exception.getMessage(), exception);
            Crashlytics.logException(exception);
            return jsonarray;
        }
        jsonarray = jsonarray1;
        jsonarray1 = decryptSessions(ServiceUtility.convertStreamToString(((java.io.InputStream) (obj))));
        jsonarray = jsonarray1;
        ((FileInputStream) (obj)).close();
        obj = jsonarray1;
        return ((JSONArray) (obj));
    }

    private String statsFilePath()
    {
        return (new StringBuilder(String.valueOf(activity.getCacheDir().getAbsolutePath()))).append("/Sessions_Stats.txt").toString();
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public String call()
        throws Exception
    {
        if (sessionsToSend == null || sessionsToSend.length() <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        AndroidHttpClient androidhttpclient;
        Object obj3;
        obj2 = sessionsToSend;
        clearSessions();
        androidhttpclient = AndroidHttpClient.newInstance(super.getOnlineSource().getUserAgent());
        obj3 = new HttpPost(statURL);
        ((HttpPost) (obj3)).setHeader("Authorization", (new StringBuilder("Basic ")).append(super.getOnlineSource().getAuth()).toString());
        obj1 = obj2;
        obj = obj2;
        String s = getEncryptedSessions(((JSONArray) (obj2)));
        obj1 = obj2;
        obj = obj2;
        ArrayList arraylist = new ArrayList(1);
        obj1 = obj2;
        obj = obj2;
        arraylist.add(new BasicNameValuePair("encrypted_string", s));
        obj1 = obj2;
        obj = obj2;
        ((HttpPost) (obj3)).setEntity(new UrlEncodedFormEntity(arraylist));
        obj1 = obj2;
        obj = obj2;
        ((HttpPost) (obj3)).setHeader("Content-Type", "application/x-www-form-urlencoded");
        obj1 = obj2;
        obj = obj2;
        AndroidHttpClient.modifyRequestToAcceptGzipResponse(((org.apache.http.HttpRequest) (obj3)));
        obj1 = obj2;
        obj = obj2;
        obj3 = androidhttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj3)));
        obj1 = obj2;
        obj = obj2;
        if (((HttpResponse) (obj3)).getStatusLine().getStatusCode() < 300) goto _L4; else goto _L3
_L3:
        Exception exception;
        obj1 = obj2;
        obj = obj2;
        try
        {
            throw new HttpException(((HttpResponse) (obj3)).getStatusLine().getReasonPhrase());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        finally
        {
            if (obj == null || ((JSONArray) (obj)).length() <= 0) goto _L0; else goto _L0
        }
        if (androidhttpclient == null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        obj = obj1;
        androidhttpclient.close();
        obj = obj1;
        if (obj2 instanceof HttpException)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        obj = obj1;
        if (obj2 instanceof UnknownHostException)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        obj = obj1;
        Log.e(com/thetransitapp/droid/model/stats/StatsManager.getSimpleName(), ((Exception) (obj2)).getMessage(), ((Throwable) (obj2)));
        obj = obj1;
        Crashlytics.logException(((Throwable) (obj2)));
        if (obj1 != null && ((JSONArray) (obj1)).length() > 0)
        {
            writeSessionsToDisk(((JSONArray) (obj1)));
        }
_L2:
        return null;
_L4:
        obj1 = obj2;
        obj = obj2;
        androidhttpclient.close();
        obj = null;
        obj1 = null;
        Log.d("Stats", "Session sent to server");
        if (true) goto _L2; else goto _L5
_L5:
        throw new NullPointerException();
        writeSessionsToDisk(((JSONArray) (obj)));
        throw exception;
    }

    public void clearSessions()
    {
        sessionsToSend = new JSONArray();
        (new File(statsFilePath())).delete();
    }

    public void endSession()
    {
label0:
        {
            if (currentSession != null)
            {
                currentSession.endSession();
                sessionsToSend.put(currentSession.getJSONRepresentation());
                currentSession = null;
                NetworkInfo networkinfo = connectivityManager.getActiveNetworkInfo();
                if (networkinfo == null || !networkinfo.isConnectedOrConnecting())
                {
                    break label0;
                }
                sendSessionsToServer();
            }
            return;
        }
        writeSessionsToDisk(sessionsToSend);
    }

    public void recordLocationUpdate(Location location)
    {
        if (currentSession != null && location != null)
        {
            currentSession.addLocation(location, false);
        }
    }

    public void recordPlanRequest(LatLng latlng, LatLng latlng1, Date date, Date date1)
    {
        if (currentSession != null)
        {
            currentSession.addPlanRequest(latlng, latlng1, date, date1);
        }
    }

    public void recordRouteHit(MergedItinerary mergeditinerary)
    {
        if (currentSession != null)
        {
            currentSession.hitRoute(mergeditinerary);
        }
    }

    public void sendSessionsToServer()
    {
        super.execute();
    }

    public void startSessionWithLocation(Location location, boolean flag)
    {
        if (sessionsToSend == null)
        {
            sessionsToSend = readSessionsFromDisk();
        }
        Session session = new Session();
        if (location != null)
        {
            session.addLocation(location, flag);
        }
        currentSession = session;
    }

    public void writeSessionsToDisk(JSONArray jsonarray)
    {
        if (jsonarray == null || jsonarray.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        FileOutputStream fileoutputstream = new FileOutputStream(statsFilePath());
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(fileoutputstream, "UTF-8");
        outputstreamwriter.write(getEncryptedSessions(jsonarray));
        outputstreamwriter.flush();
        outputstreamwriter.close();
        fileoutputstream.close();
        Log.d("Stats", "Saved session on disk");
        return;
        jsonarray;
        Log.e(com/thetransitapp/droid/model/stats/StatsManager.getSimpleName(), jsonarray.getMessage(), jsonarray);
        Crashlytics.logException(jsonarray);
        return;
    }
}
