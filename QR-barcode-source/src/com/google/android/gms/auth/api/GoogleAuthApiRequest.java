// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.auth.api:
//            GoogleAuthApiRequestCreator

public class GoogleAuthApiRequest
    implements SafeParcelable
{

    public static final GoogleAuthApiRequestCreator CREATOR = new GoogleAuthApiRequestCreator();
    public static final String DEFAULT_SCOPE_PREFIX = "oauth2:";
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int VERSION_CODE = 1;
    byte DA[];
    long DB;
    String Dt;
    Bundle Du;
    String Dv;
    List Dw;
    String Dx;
    int Dy;
    Bundle Dz;
    String name;
    String version;
    final int versionCode;
    String yR;

    GoogleAuthApiRequest(int i, String s, String s1, String s2, String s3, Bundle bundle, String s4, 
            List list, String s5, int j, Bundle bundle1, byte abyte0[], long l)
    {
        versionCode = i;
        name = s;
        version = s1;
        Dt = s2;
        yR = s3;
        Du = bundle;
        Dv = s4;
        Dw = list;
        Dx = s5;
        Dy = j;
        Dz = bundle1;
        DA = abyte0;
        DB = l;
    }

    public GoogleAuthApiRequest(String s, String s1, String s2)
    {
        versionCode = 1;
        name = s;
        ay(s1);
        Dt = s2;
        Du = new Bundle();
        Dw = new ArrayList();
        Dx = "oauth2:";
        Dz = new Bundle();
        DA = new byte[0];
    }

    public GoogleAuthApiRequest(String s, String s1, String s2, int i)
    {
        versionCode = 1;
        name = s;
        ay(s1);
        setPath(s2);
        T(i);
        Du = new Bundle();
        Dw = new ArrayList();
        Dx = "oauth2:";
        Dz = new Bundle();
        DA = new byte[0];
    }

    private void T(int i)
    {
        if (i < 0 || i > 7)
        {
            throw new IllegalArgumentException("Invalid HTTP method.");
        } else
        {
            Dy = i;
            return;
        }
    }

    private void ay(String s)
    {
        String s1 = s;
        if (s.charAt(0) >= '0')
        {
            s1 = s;
            if (s.charAt(0) <= '9')
            {
                s1 = (new StringBuilder()).append("v").append(s).toString();
            }
        }
        version = s1;
    }

    private void setPath(String s)
    {
        String s1 = s;
        if (s.charAt(0) == '/')
        {
            s1 = s.substring(1);
        }
        s = s1;
        if (s1.charAt(s1.length() - 1) == '/')
        {
            s = s1.substring(0, s1.length() - 1);
        }
        yR = s;
    }

    public void addParameter(String s, String s1)
    {
        if (!Du.containsKey(s))
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(s1);
            Du.putStringArrayList(s, arraylist);
            return;
        } else
        {
            Du.getStringArrayList(s).add(s1);
            return;
        }
    }

    public void addScope(String s)
    {
        Dw.add(s);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return Dv;
    }

    public String getApiId()
    {
        return Dt;
    }

    public String getFullScope()
    {
        String s = getScope();
        if (s == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(Dx).append(s).toString();
        }
    }

    public String getHeader(String s)
    {
        return Dz.getString(s);
    }

    public Bundle getHeaders()
    {
        return Dz;
    }

    public Map getHeadersAsMap()
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = Dz.keySet().iterator(); iterator.hasNext(); hashmap.put(s, Dz.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public byte[] getHttpBody()
    {
        return DA;
    }

    public JSONObject getHttpBodyAsJson()
        throws JSONException
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject(new String(DA, "UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.e("GoogleAuthApiRequest", "Unsupported encoding error.");
            return null;
        }
        return jsonobject;
    }

    public int getHttpMethod()
    {
        return Dy;
    }

    public String getName()
    {
        return name;
    }

    public Bundle getParameters()
    {
        return Du;
    }

    public Map getParametersAsMap()
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = Du.keySet().iterator(); iterator.hasNext(); hashmap.put(s, Du.getStringArrayList(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public String getPath()
    {
        return yR;
    }

    public String getScope()
    {
        if (Dw.size() == 0)
        {
            return null;
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < Dw.size(); i++)
        {
            stringbuffer.append((String)Dw.get(i));
            if (i != Dw.size() - 1)
            {
                stringbuffer.append(" ");
            }
        }

        return stringbuffer.toString();
    }

    public long getTimeout()
    {
        return DB;
    }

    public String getVersion()
    {
        return version;
    }

    public void putHeader(String s, String s1)
    {
        Dz.putString(s, s1);
    }

    public void setAccountName(String s)
    {
        Dv = s;
    }

    public void setHttpBody(String s)
    {
        try
        {
            DA = s.getBytes("UTF-8");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("GoogleAuthApiRequest", "Unsupported encoding error.");
        }
    }

    public void setTimeout(long l)
    {
        DB = l;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{ API: ").append(name).append("/").append(version).append(", Scope: ").append(getFullScope()).append(", Account: ").append(getAccountName()).append(" }").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GoogleAuthApiRequestCreator.a(this, parcel, i);
    }

}
