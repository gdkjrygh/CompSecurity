// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package org.apache.cordova:
//            LOG

public class Whitelist
{
    private static class URLPattern
    {

        public Pattern host;
        public Pattern path;
        public Integer port;
        public Pattern scheme;

        private String regexFromPattern(String s, boolean flag)
        {
            StringBuilder stringbuilder = new StringBuilder();
            int i = 0;
            while (i < s.length()) 
            {
                char c = s.charAt(i);
                if (c == '*' && flag)
                {
                    stringbuilder.append(".");
                } else
                if ("\\.[]{}()^$?+|".indexOf(c) > -1)
                {
                    stringbuilder.append('\\');
                }
                stringbuilder.append(c);
                i++;
            }
            return stringbuilder.toString();
        }

        public boolean matches(Uri uri)
        {
            boolean flag1 = false;
            boolean flag;
            boolean flag2;
            try
            {
                if (scheme == null)
                {
                    break MISSING_BLOCK_LABEL_28;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                LOG.d("Whitelist", uri.toString());
                return false;
            }
            flag = flag1;
            if (!scheme.matcher(uri.getScheme()).matches())
            {
                break MISSING_BLOCK_LABEL_112;
            }
            if (host == null)
            {
                break MISSING_BLOCK_LABEL_54;
            }
            flag = flag1;
            if (!host.matcher(uri.getHost()).matches())
            {
                break MISSING_BLOCK_LABEL_112;
            }
            if (port == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            flag = flag1;
            if (!port.equals(Integer.valueOf(uri.getPort())))
            {
                break MISSING_BLOCK_LABEL_112;
            }
            if (path == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            flag2 = path.matcher(uri.getPath()).matches();
            flag = flag1;
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            flag = true;
            return flag;
        }

        public URLPattern(String s, String s1, String s2, String s3)
            throws MalformedURLException
        {
            if (s == null) goto _L2; else goto _L1
_L1:
            if (!"*".equals(s)) goto _L3; else goto _L2
_L2:
            scheme = null;
_L9:
            if (!"*".equals(s1)) goto _L5; else goto _L4
_L4:
            host = null;
_L10:
            if (s2 == null) goto _L7; else goto _L6
_L6:
            if (!"*".equals(s2)) goto _L8; else goto _L7
_L7:
            port = null;
_L11:
            if (s3 == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            if (!"/*".equals(s3))
            {
                break MISSING_BLOCK_LABEL_184;
            }
            path = null;
            return;
_L3:
            try
            {
                scheme = Pattern.compile(regexFromPattern(s, false), 2);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new MalformedURLException("Port must be a number");
            }
              goto _L9
_L5:
label0:
            {
                if (!s1.startsWith("*."))
                {
                    break label0;
                }
                host = Pattern.compile((new StringBuilder()).append("([a-z0-9.-]*\\.)?").append(regexFromPattern(s1.substring(2), false)).toString(), 2);
            }
              goto _L10
            host = Pattern.compile(regexFromPattern(s1, false), 2);
              goto _L10
_L8:
            port = Integer.valueOf(Integer.parseInt(s2, 10));
              goto _L11
            path = Pattern.compile(regexFromPattern(s3, true));
            return;
              goto _L9
        }
    }


    public static final String TAG = "Whitelist";
    private ArrayList whiteList;

    public Whitelist()
    {
        whiteList = new ArrayList();
    }

    public void addWhiteListEntry(String s, boolean flag)
    {
        if (whiteList == null) goto _L2; else goto _L1
_L1:
        if (s.compareTo("*") == 0)
        {
            LOG.d("Whitelist", "Unlimited access to network resources");
            whiteList = null;
            return;
        }
        Object obj1 = Pattern.compile("^((\\*|[A-Za-z-]+):(//)?)?(\\*|((\\*\\.)?[^*/:]+))?(:(\\d+))?(/.*)?").matcher(s);
        if (!((Matcher) (obj1)).matches()) goto _L2; else goto _L3
_L3:
        String s1;
        String s2;
        s2 = ((Matcher) (obj1)).group(2);
        s1 = ((Matcher) (obj1)).group(4);
        if ("file".equals(s2)) goto _L5; else goto _L4
_L4:
        Object obj = s1;
        if (!"content".equals(s2)) goto _L6; else goto _L5
_L6:
        s1 = ((Matcher) (obj1)).group(8);
        obj1 = ((Matcher) (obj1)).group(9);
        if (s2 == null)
        {
            try
            {
                whiteList.add(new URLPattern("http", ((String) (obj)), s1, ((String) (obj1))));
                whiteList.add(new URLPattern("https", ((String) (obj)), s1, ((String) (obj1))));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                LOG.d("Whitelist", "Failed to add origin %s", new Object[] {
                    s
                });
            }
            return;
        }
        whiteList.add(new URLPattern(s2, ((String) (obj)), s1, ((String) (obj1))));
_L2:
        return;
_L5:
        obj = s1;
        if (s1 == null)
        {
            obj = "*";
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public boolean isUrlWhiteListed(String s)
    {
        if (whiteList == null)
        {
            return true;
        }
        s = Uri.parse(s);
        for (Iterator iterator = whiteList.iterator(); iterator.hasNext();)
        {
            if (((URLPattern)iterator.next()).matches(s))
            {
                return true;
            }
        }

        return false;
    }
}
