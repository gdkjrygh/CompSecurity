// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            Utility

public static class featureVersionSpec
{

    private String dialogName;
    private Uri fallbackUrl;
    private String featureName;
    private int featureVersionSpec[];

    private static featureVersionSpec parseDialogConfig(JSONObject jsonobject)
    {
        String s = jsonobject.optString("name");
        String as[];
        if (!Utility.isNullOrEmpty(s))
        {
            if ((as = s.split("\\|")).length == 2)
            {
                String s1 = as[0];
                String s2 = as[1];
                if (!Utility.isNullOrEmpty(s1) && !Utility.isNullOrEmpty(s2))
                {
                    String s3 = jsonobject.optString("url");
                    Uri uri = null;
                    if (!Utility.isNullOrEmpty(s3))
                    {
                        uri = Uri.parse(s3);
                    }
                    return new <init>(s1, s2, uri, parseVersionSpec(jsonobject.optJSONArray("versions")));
                }
            }
        }
        return null;
    }

    private static int[] parseVersionSpec(JSONArray jsonarray)
    {
        Object obj = null;
        if (jsonarray != null)
        {
            int l = jsonarray.length();
            int ai[] = new int[l];
            int j = 0;
            do
            {
                obj = ai;
                if (j >= l)
                {
                    break;
                }
                int k = jsonarray.optInt(j, -1);
                int i = k;
                if (k == -1)
                {
                    obj = jsonarray.optString(j);
                    i = k;
                    if (!Utility.isNullOrEmpty(((String) (obj))))
                    {
                        try
                        {
                            i = Integer.parseInt(((String) (obj)));
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            Utility.logd("FacebookSDK", ((Exception) (obj)));
                            i = -1;
                        }
                    }
                }
                ai[j] = i;
                j++;
            } while (true);
        }
        return ((int []) (obj));
    }

    public String getDialogName()
    {
        return dialogName;
    }

    public Uri getFallbackUrl()
    {
        return fallbackUrl;
    }

    public String getFeatureName()
    {
        return featureName;
    }

    public int[] getVersionSpec()
    {
        return featureVersionSpec;
    }


    private (String s, String s1, Uri uri, int ai[])
    {
        dialogName = s;
        featureName = s1;
        fallbackUrl = uri;
        featureVersionSpec = ai;
    }
}
