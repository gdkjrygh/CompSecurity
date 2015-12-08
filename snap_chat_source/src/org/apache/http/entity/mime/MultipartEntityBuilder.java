// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Referenced classes of package org.apache.http.entity.mime:
//            HttpMultipartMode, HttpStrictMultipart, MultipartFormEntity, AbstractMultipartForm, 
//            HttpBrowserCompatibleMultipart, HttpRFC6532Multipart, FormBodyPart

public class MultipartEntityBuilder
{

    private static final char MULTIPART_CHARS[] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private List bodyParts;
    private String boundary;
    private Charset charset;
    private HttpMultipartMode mode;
    private String subType;

    MultipartEntityBuilder()
    {
        subType = "form-data";
        mode = HttpMultipartMode.STRICT;
        boundary = null;
        charset = null;
        bodyParts = null;
    }

    private String generateBoundary()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Random random = new Random();
        int j = random.nextInt(11);
        for (int i = 0; i < j + 30; i++)
        {
            stringbuilder.append(MULTIPART_CHARS[random.nextInt(MULTIPART_CHARS.length)]);
        }

        return stringbuilder.toString();
    }

    private String generateContentType(String s, Charset charset1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("multipart/form-data; boundary=");
        stringbuilder.append(s);
        if (charset1 != null)
        {
            stringbuilder.append("; charset=");
            stringbuilder.append(charset1.name());
        }
        return stringbuilder.toString();
    }

    MultipartEntityBuilder addPart(FormBodyPart formbodypart)
    {
        if (formbodypart == null)
        {
            return this;
        }
        if (bodyParts == null)
        {
            bodyParts = new ArrayList();
        }
        bodyParts.add(formbodypart);
        return this;
    }

    MultipartFormEntity buildEntity()
    {
        Object obj;
        String s;
        Object obj1;
        Charset charset1;
        static class _cls1
        {

            static final int $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[];

            static 
            {
                $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode = new int[HttpMultipartMode.values().length];
                try
                {
                    $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[HttpMultipartMode.BROWSER_COMPATIBLE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[HttpMultipartMode.RFC6532.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        HttpMultipartMode httpmultipartmode;
        if (subType != null)
        {
            obj = subType;
        } else
        {
            obj = "form-data";
        }
        charset1 = charset;
        if (boundary != null)
        {
            s = boundary;
        } else
        {
            s = generateBoundary();
        }
        if (bodyParts != null)
        {
            obj1 = new ArrayList(bodyParts);
        } else
        {
            obj1 = Collections.emptyList();
        }
        if (mode != null)
        {
            httpmultipartmode = mode;
        } else
        {
            httpmultipartmode = HttpMultipartMode.STRICT;
        }
        _cls1..SwitchMap.org.apache.http.entity.mime.HttpMultipartMode[httpmultipartmode.ordinal()];
        JVM INSTR tableswitch 1 2: default 92
    //                   1 154
    //                   2 170;
           goto _L1 _L2 _L3
_L1:
        obj = new HttpStrictMultipart(((String) (obj)), charset1, s, ((List) (obj1)));
_L5:
        return new MultipartFormEntity(((AbstractMultipartForm) (obj)), generateContentType(s, charset1), ((AbstractMultipartForm) (obj)).getTotalLength());
_L2:
        obj = new HttpBrowserCompatibleMultipart(((String) (obj)), charset1, s, ((List) (obj1)));
        continue; /* Loop/switch isn't completed */
_L3:
        obj = new HttpRFC6532Multipart(((String) (obj)), charset1, s, ((List) (obj1)));
        if (true) goto _L5; else goto _L4
_L4:
    }

    public MultipartEntityBuilder setBoundary(String s)
    {
        boundary = s;
        return this;
    }

    public MultipartEntityBuilder setCharset(Charset charset1)
    {
        charset = charset1;
        return this;
    }

    public MultipartEntityBuilder setMode(HttpMultipartMode httpmultipartmode)
    {
        mode = httpmultipartmode;
        return this;
    }

}
