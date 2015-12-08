// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.google:
//            i

public final class q
{

    public q()
    {
    }

    public static List a(String s, int j)
    {
        Object obj = URLEncoder.encode(s, "utf-8");
        int j1 = j / 8 + 1;
        (new StringBuilder("search by api, keyword=")).append(s).append(",start=").append(j1);
        s = new ArrayList();
        ArrayList arraylist = new ArrayList();
        for (j = 0; j < 5; j++)
        {
            arraylist.add(c("https://ajax.googleapis.com/ajax/services/search/images?v=1.0&rsz=8&" + "q=" + obj + "&start=" + (j * 8 + j1)));
        }

        obj = arraylist.iterator();
        int l;
        for (j = 0; ((Iterator) (obj)).hasNext(); j = l)
        {
            JSONObject jsonobject = (new JSONObject((String)((Iterator) (obj)).next())).getJSONObject("responseData");
            JSONArray jsonarray = jsonobject.getJSONArray("results");
            l = jsonobject.getJSONObject("cursor").getInt("estimatedResultCount");
            for (j = 0; j < jsonarray.length(); j++)
            {
                JSONObject jsonobject1 = jsonarray.getJSONObject(j);
                String s1 = jsonobject1.getString("url");
                if (a(s1))
                {
                    i k = new i();
                    k.b(s1);
                    k.a(jsonobject1.getString("tbUrl"));
                    k.a(l);
                    s.add(k);
                }
            }

        }

        int i1 = s.size();
        Log.i("SearchPhotoFromGoogle", (new StringBuilder("search by api end, get photos size=")).append(s.size()).append(",apiStart=").append(i1 + j1).append(", total count=").append(j).toString());
        return s;
    }

    private static boolean a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = s.trim();
            int j = s.lastIndexOf(".");
            if (j == -1 || !s.substring(j).equalsIgnoreCase(".svg"))
            {
                return true;
            }
        }
        return false;
    }

    private static String b(String s)
    {
        s = (new URL(s)).openConnection();
        s.setConnectTimeout(10000);
        s.setRequestProperty("User-agent", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; .NET CLR 2.0.50727; Maxthon 2.0)");
        s = s.getInputStream();
        Object obj = new InputStreamReader(s, "UTF-8");
        BufferedReader bufferedreader = new BufferedReader(((java.io.Reader) (obj)));
        StringBuffer stringbuffer = new StringBuffer();
        do
        {
            String s1 = bufferedreader.readLine();
            if (s1 == null)
            {
                break;
            }
            stringbuffer.append(s1);
        } while (true);
        bufferedreader.close();
        ((InputStreamReader) (obj)).close();
        s.close();
        obj = stringbuffer.toString();
        s = ((String) (obj));
        if (((String) (obj)).indexOf("<div id=\"search\">") != -1)
        {
            s = ((String) (obj)).split("<div id=\"search\">")[1];
        }
        return s;
    }

    public static List b(String s, int j)
    {
        Object obj;
        j++;
        try
        {
            (new StringBuilder("search from web, keyword=")).append(s).append(", start=").append(j);
            obj = (new StringBuilder("http://www.google.com/search?tbm=isch&start=")).append(j).append("&q=").toString();
            s = URLEncoder.encode(s, "utf-8");
            s = b((new StringBuilder()).append(((String) (obj))).append(s).toString());
            s = Pattern.compile("<a href=(.*?)><img(.*?)></a>").matcher(s);
            obj = new ArrayList();
            Pattern pattern = Pattern.compile("imgurl=http:.*?&");
            Pattern pattern1 = Pattern.compile("src=\"(.*?)\"");
            do
            {
                if (!s.find())
                {
                    break;
                }
                if (s.groupCount() >= 2)
                {
                    Object obj2 = s.group(1);
                    Object obj1 = s.group(2);
                    i k = new i();
                    obj2 = pattern.matcher(((CharSequence) (obj2)));
                    if (((Matcher) (obj2)).find())
                    {
                        obj2 = ((Matcher) (obj2)).group();
                        k.b(((String) (obj2)).substring(7, ((String) (obj2)).length() - 1));
                    }
                    obj1 = pattern1.matcher(((CharSequence) (obj1)));
                    if (((Matcher) (obj1)).find() && ((Matcher) (obj1)).groupCount() > 0)
                    {
                        k.a(((Matcher) (obj1)).group(1));
                    }
                    if (!TextUtils.isEmpty(k.c()) && !TextUtils.isEmpty(k.a()) && a(k.c()))
                    {
                        ((List) (obj)).add(k);
                    }
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("SearchPhotoFromGoogle", "search by web exception!");
            s.printStackTrace();
            return null;
        }
        int l = ((List) (obj)).size();
        Log.i("SearchPhotoFromGoogle", (new StringBuilder("get photo size=")).append(((List) (obj)).size()).append(",start=").append(j + l).toString());
        return ((List) (obj));
    }

    private static String c(String s)
    {
        s = (new URL(s)).openConnection();
        s.setConnectTimeout(10000);
        s.setReadTimeout(10000);
        s = s.getInputStream();
        InputStreamReader inputstreamreader = new InputStreamReader(s, "UTF-8");
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        StringBuffer stringbuffer = new StringBuffer();
        do
        {
            String s1 = bufferedreader.readLine();
            if (s1 != null)
            {
                stringbuffer.append(s1);
            } else
            {
                bufferedreader.close();
                inputstreamreader.close();
                s.close();
                return stringbuffer.toString();
            }
        } while (true);
    }
}
