// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.net.Uri;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.quantcast.measurement.service:
//            QCOptOutUtility, QCReachability, QCLog, QCMeasurement, 
//            QCUtility

class QCPolicy
{

    private static final String BLACKLIST_KEY = "blacklist";
    private static final String BLACKOUT_KEY = "blackout";
    static long POLICY_CACHE_LENGTH = 0L;
    static final String POLICY_DIRECTORY = "com.quantcast";
    static final String POLICY_FILENAME = "qc-policy.json";
    private static final String POLICY_REQUEST_API_KEY_PARAMETER = "a";
    private static final String POLICY_REQUEST_API_VERSION_PARAMETER = "v";
    private static final String POLICY_REQUEST_BASE_WITHOUT_SCHEME = "m.quantcount.com/policy.json";
    private static final String POLICY_REQUEST_DEVICE_COUNTRY = "c";
    private static final String POLICY_REQUEST_DEVICE_TYPE = "ANDROID";
    private static final String POLICY_REQUEST_DEVICE_TYPE_PARAMETER = "t";
    private static final String POLICY_REQUEST_KID_DIRECTED_PARAMETER = "k";
    private static final String POLICY_REQUEST_NETWORK_CODE_PARAMETER = "n";
    private static final String POLICY_REQUEST_PACKAGE_PARAMETER = "p";
    public static final String QC_NOTIF_POLICY_UPDATE = "QC_PU";
    private static final String SALT_KEY = "salt";
    private static final String SESSION_TIMEOUT_KEY = "sessionTimeOutSeconds";
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCPolicy);
    private static final String USE_NO_SALT = "MSG";
    private Set m_blacklist;
    private long m_blackoutUntil;
    private boolean m_policyIsLoaded;
    private final String m_policyURL;
    private String m_salt;
    private Long m_sessionTimeout;

    private QCPolicy(Context context, String s)
    {
        m_policyURL = s;
        m_policyIsLoaded = false;
        if (QCOptOutUtility.isOptedOut(context))
        {
            m_policyIsLoaded = false;
            return;
        }
        if (QCReachability.isConnected(context))
        {
            getPolicy(context);
            return;
        } else
        {
            QCLog.i(TAG, "No connection.  Policy could not be downloaded. Using cache");
            m_policyIsLoaded = checkPolicy(context, true);
            return;
        }
    }

    private boolean checkPolicy(Context context, boolean flag)
    {
        Object obj;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag2 = false;
        flag3 = false;
        flag1 = false;
        obj = new File(context.getDir("com.quantcast", 0), "qc-policy.json");
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        Object obj1;
        long l;
        l = ((File) (obj)).lastModified();
        context = null;
        obj1 = null;
        obj = new FileInputStream(((File) (obj)));
        flag1 = flag3;
        flag2 = parsePolicy(readStreamToString(((InputStream) (obj))));
        if (!flag2) goto _L4; else goto _L3
_L3:
        if (flag) goto _L6; else goto _L5
_L5:
        flag1 = flag2;
        long l1 = System.currentTimeMillis();
        flag1 = flag2;
        long l2 = POLICY_CACHE_LENGTH;
        if (l1 - l >= l2) goto _L4; else goto _L6
_L6:
        flag = true;
_L7:
        flag1 = flag;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return flag;
            }
            flag1 = flag;
        }
_L2:
        return flag1;
_L4:
        flag = false;
          goto _L7
        context;
        flag = flag2;
        obj = obj1;
        obj1 = context;
_L11:
        context = ((Context) (obj));
        QCLog.e(TAG, "Could not read from policy cache", ((Throwable) (obj1)));
        flag1 = flag;
        if (obj == null) goto _L2; else goto _L8
_L8:
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return flag;
        }
        return flag;
        obj;
_L10:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw obj;
        obj1;
        context = ((Context) (obj));
        obj = obj1;
        if (true) goto _L10; else goto _L9
_L9:
        obj1;
        flag = flag1;
          goto _L11
    }

    private void getPolicy(Context context)
    {
        boolean flag;
        boolean flag1;
        if (isBlackedOut())
        {
            return;
        }
        flag1 = checkPolicy(context, false);
        flag = flag1;
        if (flag1) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        obj3 = null;
        obj2 = new DefaultHttpClient();
        ((DefaultHttpClient) (obj2)).getParams().setParameter("http.useragent", System.getProperty("http.agent"));
        obj1 = null;
        obj = null;
        obj2 = ((DefaultHttpClient) (obj2)).execute(new HttpGet(m_policyURL)).getEntity().getContent();
        obj = obj2;
        obj1 = obj2;
        String s = readStreamToString(((InputStream) (obj2)));
        obj = s;
        obj1 = obj;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        ((InputStream) (obj2)).close();
        obj1 = obj;
_L4:
        flag = flag1;
        if (obj1 != null)
        {
            savePolicy(context, ((String) (obj1)));
            flag = parsePolicy(((String) (obj1)));
        }
_L2:
        m_policyIsLoaded = flag;
        return;
        Exception exception;
        exception;
        obj1 = obj;
        QCLog.e(TAG, "Could not download policy", exception);
        obj1 = obj;
        QCMeasurement.INSTANCE.logSDKError("policy-download-failure", exception.getMessage(), null);
        obj1 = obj3;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj3;
        continue; /* Loop/switch isn't completed */
        context;
        IOException ioexception1;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            catch (IOException ioexception) { }
        }
        throw context;
        ioexception1;
        ioexception1 = ((IOException) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static QCPolicy getQuantcastPolicy(Context context, String s, String s1, String s2, boolean flag)
    {
        String s3;
        String s4;
        Object obj;
        android.net.Uri.Builder builder;
        builder = Uri.parse(QCUtility.addScheme("m.quantcount.com/policy.json")).buildUpon();
        builder.appendQueryParameter("v", "1_2_1");
        builder.appendQueryParameter("t", "ANDROID");
        s4 = null;
        obj = null;
        s3 = s4;
        TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
        s3 = obj;
        if (telephonymanager == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        s3 = s4;
        s4 = telephonymanager.getNetworkCountryIso();
        s3 = s4;
        if (s4 != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        s3 = s4;
        s4 = telephonymanager.getSimCountryIso();
        s3 = s4;
_L2:
        String s5 = s3;
        if (s3 == null)
        {
            s5 = Locale.getDefault().getCountry();
        }
        if (s5 != null)
        {
            builder.appendQueryParameter("c", s5);
        }
        if (s != null)
        {
            builder.appendQueryParameter("a", s);
        } else
        {
            builder.appendQueryParameter("n", s1);
            builder.appendQueryParameter("p", s2);
        }
        if (flag)
        {
            builder.appendQueryParameter("k", "YES");
        }
        s = builder.build();
        if (s != null)
        {
            return new QCPolicy(context, s.toString());
        } else
        {
            QCLog.e(TAG, "Policy URL was not built correctly for some reason.  Should not happen");
            return null;
        }
        SecurityException securityexception;
        securityexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean parsePolicy(String s)
    {
        m_blacklist = null;
        m_salt = null;
        m_blackoutUntil = 0L;
        m_sessionTimeout = null;
        if ("".equals(s)) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject;
        JSONArray jsonarray;
        JSONException jsonexception2;
        int i;
        boolean flag;
        try
        {
            jsonobject = new JSONObject(s);
            flag = jsonobject.has("blacklist");
        }
        catch (JSONException jsonexception)
        {
            QCLog.w(TAG, (new StringBuilder()).append("Failed to parse JSON from string: ").append(s).toString());
            return false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        jsonarray = jsonobject.getJSONArray("blacklist");
        if (jsonarray.length() <= 0) goto _L4; else goto _L5
_L5:
        if (m_blacklist == null)
        {
            m_blacklist = new HashSet(jsonarray.length());
        }
          goto _L6
_L12:
        if (i >= jsonarray.length()) goto _L4; else goto _L7
_L7:
        m_blacklist.add(jsonarray.getString(i));
        i++;
        continue; /* Loop/switch isn't completed */
        jsonexception2;
        QCLog.w(TAG, "Failed to parse blacklist from JSON.", jsonexception2);
_L4:
        flag = jsonobject.has("salt");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        m_salt = jsonobject.getString("salt");
        if ("MSG".equals(m_salt))
        {
            m_salt = null;
        }
_L9:
        flag = jsonobject.has("blackout");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        m_blackoutUntil = jsonobject.getLong("blackout");
_L10:
        flag = jsonobject.has("sessionTimeOutSeconds");
        if (!flag) goto _L2; else goto _L8
_L8:
        m_sessionTimeout = Long.valueOf(jsonobject.getLong("sessionTimeOutSeconds"));
        if (m_sessionTimeout.longValue() <= 0L)
        {
            m_sessionTimeout = null;
        }
_L2:
        return true;
        jsonexception2;
        QCLog.w(TAG, "Failed to parse salt from JSON.", jsonexception2);
          goto _L9
        jsonexception2;
        QCLog.w(TAG, "Failed to parse blackout from JSON.", jsonexception2);
          goto _L10
        JSONException jsonexception1;
        jsonexception1;
        QCLog.w(TAG, "Failed to parse session timeout from JSON.", jsonexception1);
        return true;
_L6:
        i = 0;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private String readStreamToString(InputStream inputstream)
        throws IOException
    {
        Object obj;
        Object obj1;
        obj1 = new StringBuilder();
        obj = null;
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
_L3:
        obj = inputstream.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj1)).append(((String) (obj)));
          goto _L3
        obj1;
        obj = inputstream;
        inputstream = ((InputStream) (obj1));
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            catch (IOException ioexception) { }
        }
        throw inputstream;
_L2:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        return ((StringBuilder) (obj1)).toString();
        inputstream;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void savePolicy(Context context, String s)
    {
        Object obj;
        Object obj1;
        obj = new File(context.getDir("com.quantcast", 0), "qc-policy.json");
        context = null;
        obj1 = null;
        obj = new FileOutputStream(((File) (obj)));
        ((FileOutputStream) (obj)).write(s.getBytes());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        ((FileOutputStream) (obj)).close();
_L2:
        return;
        context;
        return;
        obj;
        s = obj1;
_L5:
        context = s;
        QCLog.e(TAG, "Could not write policy", ((Throwable) (obj)));
        if (s == null) goto _L2; else goto _L1
_L1:
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        s;
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw s;
        s;
        context = ((Context) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        context;
        s = ((String) (obj));
        obj = context;
          goto _L5
    }

    String getSalt()
    {
        return m_salt;
    }

    Long getSessionTimeout()
    {
        return m_sessionTimeout;
    }

    boolean hasSessionTimeout()
    {
        return m_sessionTimeout != null;
    }

    boolean isBlackedOut()
    {
        return policyIsLoaded() && System.currentTimeMillis() <= m_blackoutUntil;
    }

    boolean isBlacklisted(String s)
    {
        boolean flag;
        if (s == null)
        {
            flag = true;
        } else
        {
            flag = false;
            if (m_blacklist != null)
            {
                return m_blacklist.contains(s);
            }
        }
        return flag;
    }

    public boolean policyIsLoaded()
    {
        return m_policyIsLoaded;
    }

    public void updatePolicy(Context context)
    {
        if (QCReachability.isConnected(context))
        {
            getPolicy(context);
            return;
        } else
        {
            QCLog.i(TAG, "No connection.  Policy could not be updated. Using cache.");
            m_policyIsLoaded = checkPolicy(context, true);
            return;
        }
    }

    static 
    {
        POLICY_CACHE_LENGTH = 0x1b7740L;
    }
}
