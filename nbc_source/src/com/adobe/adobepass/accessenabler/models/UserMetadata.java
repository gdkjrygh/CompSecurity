// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;

import android.util.Log;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserMetadata
{

    private static final String LOG_TAG = "UserMetadata";
    private Map data;
    private List encrypted;
    private String state;
    private Long updated;

    private UserMetadata()
    {
    }

    public static String parseJsonObject(Object obj)
    {
        try
        {
            obj = (new Gson()).toJson(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.d("UserMetadata", ((Exception) (obj)).toString());
            Log.d("UserMetadata", "Error converting JSON object to string.");
            return null;
        }
        return ((String) (obj));
    }

    public static UserMetadata parseJsonString(String s)
    {
        try
        {
            s = (UserMetadata)(new Gson()).fromJson(s, com/adobe/adobepass/accessenabler/models/UserMetadata);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d("UserMetadata", s.toString());
            Log.d("UserMetadata", "Error deserializing user metadata token.");
            return null;
        }
        return s;
    }

    public static UserMetadata parseXMLResponse(String s)
    {
        int i = s.indexOf("<userMeta>");
        int j = s.indexOf("</userMeta>");
        if (i < 0 || j < 0 || i >= j)
        {
            return null;
        } else
        {
            return parseJsonString(s.substring("<userMeta>".length() + i, j));
        }
    }

    public Object getMetadata(String s)
    {
        if (data != null)
        {
            return data.get(s);
        } else
        {
            return null;
        }
    }

    public long getUpdated()
    {
        if (updated != null)
        {
            return updated.longValue();
        } else
        {
            return 0L;
        }
    }

    public boolean isKeyEncrypted(String s)
    {
        return encrypted != null && encrypted.contains(s);
    }

    public boolean isValid()
    {
        return updated != null && data != null;
    }

    public void merge(UserMetadata usermetadata)
    {
        if (usermetadata == null || !usermetadata.isValid())
        {
            Log.d("UserMetadata", "Could not merge user metadata. Reason: user metadata is invalid.");
        } else
        if (updated.longValue() < usermetadata.updated.longValue())
        {
            updated = usermetadata.updated;
            String s;
            for (Iterator iterator = usermetadata.data.keySet().iterator(); iterator.hasNext(); data.put(s, usermetadata.data.get(s)))
            {
                s = (String)iterator.next();
            }

            if (usermetadata.encrypted != null)
            {
                if (encrypted == null)
                {
                    encrypted = usermetadata.encrypted;
                    return;
                }
                usermetadata = usermetadata.encrypted.iterator();
                while (usermetadata.hasNext()) 
                {
                    Object obj = usermetadata.next();
                    if (!encrypted.contains(obj))
                    {
                        encrypted.add(obj);
                    }
                }
            }
        } else
        {
            Log.d("UserMetadata", "Could not merge user metadata. Reason: new update time is older than previous time.");
            return;
        }
    }

    public String toJsonString()
    {
        String s;
        try
        {
            s = (new Gson()).toJson(this);
        }
        catch (Exception exception)
        {
            Log.d("UserMetadata", exception.toString());
            Log.d("UserMetadata", "Error serializing user metadata token.");
            return null;
        }
        return s;
    }
}
