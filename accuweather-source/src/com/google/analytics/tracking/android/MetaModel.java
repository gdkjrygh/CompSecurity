// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            Log

class MetaModel
{
    public static interface Formatter
    {

        public abstract String format(String s);
    }

    public static class MetaInfo
    {

        private final String mDefaultValue;
        private final Formatter mFormatter;
        private final String mUrlParam;

        public String getDefaultValue()
        {
            return mDefaultValue;
        }

        public Formatter getFormatter()
        {
            return mFormatter;
        }

        String getUrlParam()
        {
            return mUrlParam;
        }

        public String getUrlParam(String s)
        {
            Object obj = null;
            if (s.contains("*"))
            {
                String s1 = mUrlParam;
                String as[] = s.split("\\*");
                s = obj;
                if (as.length > 1)
                {
                    int i;
                    try
                    {
                        i = Integer.parseInt(as[1]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        Log.w((new StringBuilder()).append("Unable to parse slot for url parameter ").append(s1).toString());
                        return null;
                    }
                    s = (new StringBuilder()).append(s1).append(i).toString();
                }
                return s;
            } else
            {
                return mUrlParam;
            }
        }

        public MetaInfo(String s, String s1, Formatter formatter)
        {
            mUrlParam = s;
            mDefaultValue = s1;
            mFormatter = formatter;
        }
    }


    private Map mMetaInfos;

    MetaModel()
    {
        mMetaInfos = new HashMap();
    }

    public void addField(String s, String s1, String s2, Formatter formatter)
    {
        mMetaInfos.put(s, new MetaInfo(s1, s2, formatter));
    }

    MetaInfo getMetaInfo(String s)
    {
        if (s.startsWith("&"))
        {
            return new MetaInfo(s.substring(1), null, null);
        }
        String s1 = s;
        if (s.contains("*"))
        {
            s1 = s.substring(0, s.indexOf("*"));
        }
        return (MetaInfo)mMetaInfos.get(s1);
    }
}
