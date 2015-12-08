// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package org.apache.cordova:
//            CordovaPreferences, Whitelist, LOG, PluginEntry

public class ConfigXmlParser
{

    private static String TAG = "ConfigXmlParser";
    private Whitelist externalWhitelist;
    private Whitelist internalWhitelist;
    private String launchUrl;
    private ArrayList pluginEntries;
    private CordovaPreferences prefs;

    public ConfigXmlParser()
    {
        launchUrl = "file:///android_asset/www/index.html";
        prefs = new CordovaPreferences();
        internalWhitelist = new Whitelist();
        externalWhitelist = new Whitelist();
        pluginEntries = new ArrayList(20);
    }

    private void setStartUrl(String s)
    {
        if (Pattern.compile("^[a-z-]+://").matcher(s).find())
        {
            launchUrl = s;
            return;
        }
        String s1 = s;
        if (s.charAt(0) == '/')
        {
            s1 = s.substring(1);
        }
        launchUrl = (new StringBuilder()).append("file:///android_asset/www/").append(s1).toString();
    }

    public Whitelist getExternalWhitelist()
    {
        return externalWhitelist;
    }

    public Whitelist getInternalWhitelist()
    {
        return internalWhitelist;
    }

    public String getLaunchUrl()
    {
        return launchUrl;
    }

    public ArrayList getPluginEntries()
    {
        return pluginEntries;
    }

    public CordovaPreferences getPreferences()
    {
        return prefs;
    }

    public void parse(Activity activity)
    {
        int j = activity.getResources().getIdentifier("config", "xml", activity.getClass().getPackage().getName());
        int i = j;
        if (j == 0)
        {
            int k = activity.getResources().getIdentifier("config", "xml", activity.getPackageName());
            i = k;
            if (k == 0)
            {
                LOG.e(TAG, "res/xml/config.xml is missing!");
                return;
            }
        }
        parse(activity.getResources().getXml(i));
    }

    public void parse(XmlResourceParser xmlresourceparser)
    {
        ArrayList arraylist;
        String s1;
        Object obj2;
        int j;
        int k;
        boolean flag2;
        j = -1;
        obj2 = "";
        s1 = "";
        flag2 = false;
        k = 0;
        arraylist = null;
        internalWhitelist.addWhiteListEntry("file:///*", false);
        internalWhitelist.addWhiteListEntry("content:///*", false);
        internalWhitelist.addWhiteListEntry("data:*", false);
_L8:
        if (j == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j != 2) goto _L2; else goto _L1
_L1:
        String s2 = xmlresourceparser.getName();
        if (!s2.equals("url-filter")) goto _L4; else goto _L3
_L3:
        Object obj;
        String s;
        ArrayList arraylist1;
        int i;
        boolean flag1;
        Log.w(TAG, (new StringBuilder()).append("Plugin ").append(((String) (obj2))).append(" is using deprecated tag <url-filter>").toString());
        arraylist1 = arraylist;
        if (arraylist == null)
        {
            arraylist1 = new ArrayList(2);
        }
        arraylist1.add(xmlresourceparser.getAttributeValue(null, "value"));
        obj = obj2;
        s = s1;
        flag1 = flag2;
        i = k;
_L6:
        k = xmlresourceparser.next();
        j = k;
        k = i;
        flag2 = flag1;
        s1 = s;
        obj2 = obj;
        arraylist = arraylist1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (s2.equals("feature"))
        {
            i = 1;
            obj = xmlresourceparser.getAttributeValue(null, "name");
            flag1 = flag2;
            s = s1;
            arraylist1 = arraylist;
        } else
        if (k != 0 && s2.equals("param"))
        {
            s2 = xmlresourceparser.getAttributeValue(null, "name");
            if (s2.equals("service"))
            {
                obj = xmlresourceparser.getAttributeValue(null, "value");
                i = k;
                flag1 = flag2;
                s = s1;
                arraylist1 = arraylist;
            } else
            if (s2.equals("package") || s2.equals("android-package"))
            {
                s = xmlresourceparser.getAttributeValue(null, "value");
                i = k;
                flag1 = flag2;
                obj = obj2;
                arraylist1 = arraylist;
            } else
            {
                i = k;
                flag1 = flag2;
                s = s1;
                obj = obj2;
                arraylist1 = arraylist;
                if (s2.equals("onload"))
                {
                    flag1 = "true".equals(xmlresourceparser.getAttributeValue(null, "value"));
                    i = k;
                    s = s1;
                    obj = obj2;
                    arraylist1 = arraylist;
                }
            }
        } else
        if (s2.equals("access"))
        {
            s2 = xmlresourceparser.getAttributeValue(null, "origin");
            String s4 = xmlresourceparser.getAttributeValue(null, "subdomains");
            boolean flag;
            if (xmlresourceparser.getAttributeValue(null, "launch-external") != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = k;
            flag1 = flag2;
            s = s1;
            obj = obj2;
            arraylist1 = arraylist;
            if (s2 != null)
            {
                if (flag)
                {
                    obj = externalWhitelist;
                    if (s4 != null && s4.compareToIgnoreCase("true") == 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    ((Whitelist) (obj)).addWhiteListEntry(s2, flag1);
                    i = k;
                    flag1 = flag2;
                    s = s1;
                    obj = obj2;
                    arraylist1 = arraylist;
                } else
                if ("*".equals(s2))
                {
                    internalWhitelist.addWhiteListEntry("http://*/*", false);
                    internalWhitelist.addWhiteListEntry("https://*/*", false);
                    i = k;
                    flag1 = flag2;
                    s = s1;
                    obj = obj2;
                    arraylist1 = arraylist;
                } else
                {
                    obj = internalWhitelist;
                    if (s4 != null && s4.compareToIgnoreCase("true") == 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    ((Whitelist) (obj)).addWhiteListEntry(s2, flag1);
                    i = k;
                    flag1 = flag2;
                    s = s1;
                    obj = obj2;
                    arraylist1 = arraylist;
                }
            }
        } else
        if (s2.equals("preference"))
        {
            obj = xmlresourceparser.getAttributeValue(null, "name").toLowerCase(Locale.ENGLISH);
            s = xmlresourceparser.getAttributeValue(null, "value");
            prefs.set(((String) (obj)), s);
            i = k;
            flag1 = flag2;
            s = s1;
            obj = obj2;
            arraylist1 = arraylist;
        } else
        {
            i = k;
            flag1 = flag2;
            s = s1;
            obj = obj2;
            arraylist1 = arraylist;
            if (s2.equals("content"))
            {
                String s3 = xmlresourceparser.getAttributeValue(null, "src");
                i = k;
                flag1 = flag2;
                s = s1;
                obj = obj2;
                arraylist1 = arraylist;
                if (s3 != null)
                {
                    setStartUrl(s3);
                    i = k;
                    flag1 = flag2;
                    s = s1;
                    obj = obj2;
                    arraylist1 = arraylist;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i = k;
        flag1 = flag2;
        s = s1;
        obj = obj2;
        arraylist1 = arraylist;
        if (j == 3)
        {
            i = k;
            flag1 = flag2;
            s = s1;
            obj = obj2;
            arraylist1 = arraylist;
            if (xmlresourceparser.getName().equals("feature"))
            {
                pluginEntries.add(new PluginEntry(((String) (obj2)), s1, flag2, arraylist));
                obj = "";
                s = "";
                i = 0;
                flag1 = false;
                arraylist1 = null;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        Object obj1;
        obj1;
        ((XmlPullParserException) (obj1)).printStackTrace();
        k = i;
        flag2 = flag1;
        s1 = s;
        obj2 = obj;
        obj1 = arraylist1;
        continue; /* Loop/switch isn't completed */
        obj1;
        ((IOException) (obj1)).printStackTrace();
        k = i;
        flag2 = flag1;
        s1 = s;
        obj2 = obj;
        obj1 = arraylist1;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
