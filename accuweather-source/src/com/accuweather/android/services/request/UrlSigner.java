// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.util.Base64;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class UrlSigner
{

    private static byte key[];
    private static String keyString = "aVa_FKKXGR0NdsV_tnusOxOCjy4";
    private static String urlString = "https://maps.google.com/maps/api/geocode/json?client=gme-accuweatherinternational&";

    private UrlSigner()
        throws IOException
    {
        keyString = keyString.replace('-', '+');
        keyString = keyString.replace('_', '/');
        System.out.println((new StringBuilder()).append("Key: ").append(keyString).toString());
        key = Base64.decode(keyString, 0);
    }

    public static String getSignedRequestUrlFromAddress(String s)
        throws IOException, InvalidKeyException, NoSuchAlgorithmException, URISyntaxException
    {
        s = new URL((new StringBuilder()).append(urlString).append("address=").append(s).toString());
        return (new UrlSigner()).signRequest(s.getPath(), s.getQuery());
    }

    public static String getSignedRequestUrlFromLatLon(String s, String s1)
        throws IOException, InvalidKeyException, NoSuchAlgorithmException, URISyntaxException
    {
        s = new URL((new StringBuilder()).append(urlString).append("latlng=").append(s).append(",").append(s1).append("&result_type=street_address&location_type=GEOMETRIC_CENTER").toString());
        return (new UrlSigner()).signRequest(s.getPath(), s.getQuery());
    }

    private String signRequest(String s, String s1)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, URISyntaxException
    {
        s = (new StringBuilder()).append(s).append('?').append(s1).toString();
        s1 = new SecretKeySpec(key, "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(s1);
        s1 = Base64.encodeToString(mac.doFinal(s.getBytes()), 0).replace('+', '-').replace('/', '_');
        return (new StringBuilder()).append(s).append("&signature=").append(s1).toString();
    }

}
