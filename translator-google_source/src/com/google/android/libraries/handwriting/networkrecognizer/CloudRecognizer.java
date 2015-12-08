// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.networkrecognizer;

import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.ScoredCandidate;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.handwriting.base.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.google.android.libraries.handwriting.networkrecognizer:
//            d, a, b, c

public final class CloudRecognizer extends HandwritingRecognizer
{

    public final a a;
    public final HttpClient b;
    public final List c;

    public CloudRecognizer()
    {
        c = new ArrayList();
        b = com.google.android.libraries.handwriting.networkrecognizer.d.a();
        a = new a();
    }

    public CloudRecognizer(HttpClient httpclient, a a1)
    {
        c = new ArrayList();
        b = httpclient;
        a = a1;
    }

    private String a(com.google.android.libraries.handwriting.networkrecognizer.b b1)
    {
        boolean flag;
        flag = false;
        c.add(b1);
        if (!a.m && c.size() < a.n)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        Object obj;
        JSONArray jsonarray;
        Iterator iterator;
        b1 = c;
        obj = e();
        jsonarray = new JSONArray();
        ((JSONObject) (obj)).put("requests", jsonarray);
        iterator = b1.iterator();
_L2:
        com.google.android.libraries.handwriting.networkrecognizer.b b2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_255;
        }
        b2 = (com.google.android.libraries.handwriting.networkrecognizer.b)iterator.next();
        if (b1.size() == 1 && b2.b != null)
        {
            a(((JSONObject) (obj)), b2.b.getInputType());
        }
        boolean flag1 = flag;
        if (b2.b == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        flag1 = flag;
        if (b2.b.getEnablePreSpace())
        {
            flag1 = true;
        }
        try
        {
            jsonarray.put(b2.a(a.a));
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.libraries.handwriting.networkrecognizer.b b1)
        {
            throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.SendingFeedbackFailedException("Sending feedback failed", b1);
        }
        flag = flag1;
        if (b2.b == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (b2.b.getUserId() == null) goto _L2; else goto _L3
_L3:
        flag = flag1;
        if (b2.b.getUserId().length() <= 0) goto _L2; else goto _L4
_L4:
        ((JSONObject) (obj)).put("user_id", b2.b.getUserId());
        flag = flag1;
          goto _L2
        a(((JSONObject) (obj)), flag, false);
        c.clear();
        b1 = a(((JSONObject) (obj)).toString(), System.currentTimeMillis());
        obj = String.valueOf(b1);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        "Sending feedback succeeded: ".concat(((String) (obj)));
_L5:
        b(b1);
        return b1;
        new String("Sending feedback succeeded: ");
          goto _L5
        return "";
    }

    private String a(String s, long l)
    {
        a(l, "before creating request");
        String s1 = com.google.android.libraries.handwriting.networkrecognizer.c.a(a.j, a.k, a.b);
        Object obj = String.valueOf(s1);
        int i;
        if (((String) (obj)).length() != 0)
        {
            "URL = ".concat(((String) (obj)));
        } else
        {
            new String("URL = ");
        }
        obj = new HttpPost(s1);
        if (a.l)
        {
            byte abyte0[] = a(s);
            a(l, "passed after building request string");
            ByteArrayEntity bytearrayentity = new ByteArrayEntity(abyte0);
            bytearrayentity.setContentType("application/octet-stream");
            ((HttpPost) (obj)).setEntity(bytearrayentity);
        } else
        {
            StringEntity stringentity = new StringEntity(s, "UTF-8");
            stringentity.setContentType("application/json");
            ((HttpPost) (obj)).setEntity(stringentity);
        }
        i = s.length();
        (new StringBuilder(String.valueOf(s1).length() + 41 + String.valueOf(s).length())).append("SENDING to ").append(s1).append(": request length: ").append(i).append(" ").append(s);
        a(l, "before sending request to server");
        s = b.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        a(l, "got response from server");
        i = s.getStatusLine().getStatusCode();
        if (200 == i)
        {
            String s2 = EntityUtils.toString(s.getEntity());
            s.getEntity().consumeContent();
            a(l, "network handling done entirely");
            return s2;
        } else
        {
            throw new HttpResponseException(i, s.getStatusLine().toString());
        }
    }

    private static ArrayList a(JSONArray jsonarray)
    {
        jsonarray = jsonarray.getJSONObject(3).getJSONArray("segmentation");
        int i1 = jsonarray.length();
        ArrayList arraylist = new ArrayList(i1);
        for (int i = 0; i < i1; i++)
        {
            JSONArray jsonarray1 = jsonarray.getJSONArray(i);
            int j1 = jsonarray1.length();
            String as[] = new String[j1];
            int ai[][][] = new int[j1][][];
            for (int j = 0; j < j1; j++)
            {
                as[j] = jsonarray1.getJSONArray(j).getString(0);
                JSONArray jsonarray2 = jsonarray1.getJSONArray(j).getJSONArray(1);
                int k1 = jsonarray2.length();
                ai[j] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
                    k1, 4
                });
                for (int k = 0; k < k1; k++)
                {
                    for (int l = 0; l < 4; l++)
                    {
                        ai[j][k][l] = jsonarray2.getJSONArray(k).getInt(l);
                    }

                }

            }

            arraylist.add(new com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo(as, ai));
        }

        return arraylist;
    }

    private static void a(long l, String s)
    {
        long l1 = System.currentTimeMillis();
        (new StringBuilder(String.valueOf(s).length() + 42)).append("Timing(0) ").append(s).append(": ").append(l1 - l);
    }

    private static void a(JSONObject jsonobject, int i)
    {
        jsonobject.put("input_type", i);
    }

    private static void a(JSONObject jsonobject, boolean flag, boolean flag1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (flag)
        {
            stringbuilder.append("enable_pre_space");
        }
        if (flag1)
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append("return_segmentation");
        }
        if (stringbuilder.length() > 0)
        {
            jsonobject.put("options", stringbuilder);
        }
    }

    private static byte[] a(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            OutputStreamWriter outputstreamwriter = new OutputStreamWriter(new GZIPOutputStream(bytearrayoutputstream), "UTF-8");
            outputstreamwriter.write(s);
            outputstreamwriter.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return bytearrayoutputstream.toByteArray();
    }

    private RecognitionResult b(String s)
    {
        Object obj4;
        JSONArray jsonarray;
        JSONArray jsonarray1;
        String s1;
        JSONArray jsonarray2;
        obj4 = null;
        if (s == null)
        {
            throw new InvalidResponseFromServerException("No answer.");
        }
        Object obj;
        try
        {
            obj = (JSONArray)(new JSONTokener(s)).nextValue();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new InvalidResponseFromServerException(s);
        }
        if (!((JSONArray) (obj)).getString(0).contentEquals("SUCCESS"))
        {
            throw new InvalidResponseFromServerException("Not SUCCESS.");
        }
        jsonarray2 = ((JSONArray) (obj)).getJSONArray(1).getJSONArray(0);
        if (jsonarray2.length() < 2)
        {
            throw new InvalidResponseFromServerException("Invalid response. Less than two entries in response.");
        }
        if (jsonarray2.length() > 4)
        {
            int i = jsonarray2.length();
            (new StringBuilder(38)).append("Strange response. ").append(i).append(" entries.");
        }
        s1 = jsonarray2.getString(0);
        jsonarray1 = jsonarray2.getJSONArray(1);
        s = "";
        if (jsonarray2.length() <= 3)
        {
            break MISSING_BLOCK_LABEL_460;
        }
        jsonarray = jsonarray2.getJSONArray(2);
        if (!a.o) goto _L2; else goto _L1
_L1:
        Object obj1 = a(jsonarray2);
_L4:
        Object obj2 = jsonarray2.getJSONObject(3).getString("debug_info");
        Object obj3;
        s = ((String) (obj2));
        obj2 = jsonarray;
        break MISSING_BLOCK_LABEL_216;
        obj1;
        obj3 = null;
_L3:
        obj1 = obj3;
        obj2 = jsonarray;
        if (obj3 == null)
        {
            s = jsonarray2.getString(3);
            obj1 = obj3;
            obj2 = jsonarray;
        }
_L5:
        if (jsonarray2.length() == 3)
        {
            try
            {
                obj2 = jsonarray2.getJSONArray(2);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = jsonarray2.getString(2);
                obj2 = obj4;
            }
        }
        obj3 = new RecognitionResult(s1);
        obj3.d = s;
        if (obj1 != null)
        {
            ((RecognitionResult) (obj3)).f.addAll(((java.util.Collection) (obj1)));
        }
        for (int j = 0; j < jsonarray1.length(); j++)
        {
            obj1 = new ArrayList(0);
            s = ((String) (obj1));
            if (obj2 != null)
            {
                s = ((String) (obj1));
                if (((JSONArray) (obj2)).length() > j)
                {
                    obj1 = ((JSONArray) (obj2)).getJSONArray(j);
                    s = new ArrayList(((JSONArray) (obj1)).length());
                    for (int k = 0; k < ((JSONArray) (obj1)).length(); k++)
                    {
                        s.add(((JSONArray) (obj1)).getString(k));
                    }

                }
            }
            s = new ScoredCandidate(jsonarray1.getString(j), j, s);
            ((RecognitionResult) (obj3)).e.add(s);
        }

        return ((RecognitionResult) (obj3));
        obj2;
        obj3 = obj1;
          goto _L3
_L2:
        obj1 = null;
          goto _L4
        obj1 = null;
        obj2 = null;
          goto _L5
    }

    private JSONObject e()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("app_version", a.d);
        jsonobject.put("api_level", a.e);
        jsonobject.put("device", a.c);
        return jsonobject;
    }

    public final RecognitionResult a(StrokeList strokelist)
    {
        long l = System.currentTimeMillis();
        Object obj;
        try
        {
            a(l, "before creating JSON");
            obj = e();
            a(((JSONObject) (obj)), strokelist.getInputType());
            a(((JSONObject) (obj)), strokelist.getEnablePreSpace(), a.o);
            JSONArray jsonarray = new JSONArray();
            strokelist = strokelist.asJsonObject();
            strokelist.put("language", a.a);
            jsonarray.put(strokelist);
            ((JSONObject) (obj)).put("requests", jsonarray);
            for (strokelist = c.iterator(); strokelist.hasNext(); jsonarray.put(((com.google.android.libraries.handwriting.networkrecognizer.b)strokelist.next()).a(a.a))) { }
        }
        // Misplaced declaration of an exception variable
        catch (StrokeList strokelist)
        {
            throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException("network problems", strokelist);
        }
        // Misplaced declaration of an exception variable
        catch (StrokeList strokelist)
        {
            throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException("encoding problem", strokelist);
        }
        // Misplaced declaration of an exception variable
        catch (StrokeList strokelist)
        {
            throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException("protocol problem", strokelist);
        }
        // Misplaced declaration of an exception variable
        catch (StrokeList strokelist)
        {
            throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException("network io problem", strokelist);
        }
        // Misplaced declaration of an exception variable
        catch (StrokeList strokelist)
        {
            throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException("json problem", strokelist);
        }
        catch (InvalidResponseFromServerException invalidresponsefromserverexception)
        {
            strokelist = String.valueOf(invalidresponsefromserverexception.errorMessage);
            if (strokelist.length() != 0)
            {
                strokelist = "invalid response: ".concat(strokelist);
            } else
            {
                strokelist = new String("invalid response: ");
            }
            throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException(strokelist, invalidresponsefromserverexception);
        }
        c.clear();
        strokelist = ((JSONObject) (obj)).toString();
        a(l, "JSON created");
        strokelist = a(((String) (strokelist)), l);
        obj = String.valueOf(strokelist);
        if (((String) (obj)).length() != 0)
        {
            "response = ".concat(((String) (obj)));
        } else
        {
            new String("response = ");
        }
        return b(strokelist);
    }

    public final b a()
    {
        return a;
    }

    public final String a(String s, StrokeList strokelist, String s1, String s2)
    {
        return a(new com.google.android.libraries.handwriting.networkrecognizer.b(s, strokelist, s1, s2));
    }

    public final String a(String s, String s1, String s2, String s3)
    {
        return a(new com.google.android.libraries.handwriting.networkrecognizer.b(s, s1, s2, s3));
    }

    public final boolean b()
    {
        return true;
    }

    public final boolean c()
    {
        return true;
    }

    public final boolean d()
    {
        return false;
    }

    private class InvalidResponseFromServerException extends Exception
    {

        final String errorMessage;
        final CloudRecognizer this$0;

        InvalidResponseFromServerException(String s)
        {
            this$0 = CloudRecognizer.this;
            super();
            errorMessage = s;
        }
    }

}
