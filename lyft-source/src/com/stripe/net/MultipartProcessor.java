// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Random;

public class MultipartProcessor
{

    private static final String LINE_BREAK = "\r\n";
    private final String boundary;
    private String charset;
    private HttpURLConnection conn;
    private OutputStream outputStream;
    private PrintWriter writer;

    public MultipartProcessor(HttpURLConnection httpurlconnection, String s, String s1)
    {
        boundary = s;
        charset = s1;
        conn = httpurlconnection;
        outputStream = httpurlconnection.getOutputStream();
        writer = new PrintWriter(new OutputStreamWriter(outputStream, s1), true);
    }

    public static String getBoundary()
    {
        return String.valueOf(Long.valueOf(Math.abs((new Random()).nextLong())));
    }

    public void addFileField(String s, File file)
    {
        String s1 = file.getName();
        writer.append((new StringBuilder()).append("--").append(boundary).toString()).append("\r\n");
        writer.append((new StringBuilder()).append("Content-Disposition: form-data; name=\"").append(s).append("\"; filename=\"").append(s1).append("\"").toString()).append("\r\n");
        s = URLConnection.guessContentTypeFromName(s1);
        writer.append((new StringBuilder()).append("Content-Type: ").append(s).toString()).append("\r\n");
        writer.append("Content-Transfer-Encoding: binary").append("\r\n");
        writer.append("\r\n");
        writer.flush();
        s = new FileInputStream(file);
        file = new byte[4096];
_L1:
        int i = s.read(file);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        outputStream.write(file, 0, i);
          goto _L1
        file;
        s.close();
        throw file;
        outputStream.flush();
        s.close();
        writer.append("\r\n");
        writer.flush();
        return;
    }

    public void addFormField(String s, String s1)
    {
        writer.append((new StringBuilder()).append("--").append(boundary).toString()).append("\r\n");
        writer.append((new StringBuilder()).append("Content-Disposition: form-data; name=\"").append(s).append("\"").toString()).append("\r\n");
        writer.append("\r\n");
        writer.append(s1).append("\r\n");
        writer.flush();
    }

    public void finish()
    {
        writer.append((new StringBuilder()).append("--").append(boundary).append("--").toString()).append("\r\n");
        writer.flush();
        writer.close();
        outputStream.flush();
        outputStream.close();
    }
}
