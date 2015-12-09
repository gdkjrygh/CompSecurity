// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import dtt;
import eoj;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.concurrent.Semaphore;

public final class AnnotateServiceHelperImpl
    implements eoj
{

    private ObjectMapper a;
    private Resolver b;
    private Context c;
    private Handler d;

    public AnnotateServiceHelperImpl(Context context, ObjectMapper objectmapper)
    {
        c = context;
        a = objectmapper;
        d = new Handler(context.getMainLooper());
        a.setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL);
        b = Cosmos.getResolver(context);
        b.connect();
    }

    public final String a(String s, String s1, String s2)
    {
        Semaphore semaphore = new Semaphore(0);
        Playlist playlist = new Playlist();
        if (TextUtils.isEmpty(s1))
        {
            s1 = "sp://playlist/v1/rootlist";
        } else
        {
            s1 = (new StringBuilder("sp://playlist/v1/")).append(Uri.encode(s1)).toString();
        }
        try
        {
            s = new Request("POST", s1, null, a.writeValueAsBytes(new CreatePlaylist(s, s2)));
            b.resolve(s, new JsonCallbackReceiver(d, com/spotify/mobile/android/spotlets/collection/service/AnnotateServiceHelperImpl$Playlist, playlist, semaphore) {

                private Playlist a;
                private Semaphore b;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    Logger.b(throwable, "createPlaylist().onError()", new Object[0]);
                    b.release();
                }

                protected final void onResolved(Response response, Object obj)
                {
                    response = (Playlist)obj;
                    a.uri = ((Playlist) (response)).uri;
                    response = a.uri;
                    b.release();
                }

            
            {
                a = playlist;
                b = semaphore;
                super(handler, class1);
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.b(s, "createPlaylist().JsonProcessingException", new Object[0]);
            semaphore.release();
        }
        try
        {
            semaphore.acquire();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Assertion.a("createPlaylist() was interrupted.");
        }
        return playlist.uri;
    }

    public final void a()
    {
        b.destroy();
    }

    public final void a(String s)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("annotate_subscribe", Boolean.valueOf(true));
        c.getContentResolver().update(dtt.a(s), contentvalues, null, null);
    }

    public final void a(String s, String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("name", s1);
        c.getContentResolver().update(dtt.a(s), contentvalues, null, null);
    }

    public final boolean a(String s, String s1, String s2, String s3)
    {
        Semaphore semaphore = new Semaphore(0);
        boolean aflag[] = new boolean[1];
        aflag[0] = false;
        try
        {
            s2 = a.writeValueAsBytes(new Annotation(s3, s2));
            new String(s2);
            s = new Request("PATCH", String.format("hm://playlist-annotate/v1/annotation/user/%s/playlist/%s?format=json", new Object[] {
                Uri.encode(s), s1
            }), null, s2);
            b.resolve(s, new HttpCallbackReceiver(d, aflag, semaphore) {

                private boolean a[];
                private Semaphore b;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    Logger.b(throwable, "setImageIdAndDescription().onError", new Object[0]);
                    b.release();
                }

                protected final void onResolved(Response response, Object obj)
                {
                    a[0] = true;
                    b.release();
                }

                protected final Object parseResponse(Response response)
                {
                    return response;
                }

            
            {
                a = aflag;
                b = semaphore;
                super(handler);
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.b(s, "setImageIdAndDescription().JsonProcessingException", new Object[0]);
            semaphore.release();
        }
        try
        {
            semaphore.acquire();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Assertion.a("setImageIdAndDescription() was interrupted.");
        }
        return aflag[0];
    }

    public final String b()
    {
        Semaphore semaphore = new Semaphore(0);
        Keymaster keymaster = new Keymaster();
        b.get("hm://keymaster/token/authenticated?client_id=6893edb8c3d943428d0c45920a05d60b&scope=ugc-image-upload&alt=json", new JsonHttpCallbackReceiver(d, com/spotify/mobile/android/spotlets/collection/service/AnnotateServiceHelperImpl$Keymaster, keymaster, semaphore) {

            private Keymaster a;
            private Semaphore b;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.b(throwable, "getIdentityToken.onError()", new Object[0]);
                b.release();
            }

            protected final void onResolved(Response response, Object obj)
            {
                response = (Keymaster)obj;
                a.accessToken = ((Keymaster) (response)).accessToken;
                a.expiresIn = ((Keymaster) (response)).expiresIn;
                b.release();
            }

            
            {
                a = keymaster;
                b = semaphore;
                super(handler, class1);
            }
        });
        try
        {
            semaphore.acquire();
        }
        catch (InterruptedException interruptedexception)
        {
            Assertion.a("getIdentityToken() was interrupted.");
        }
        return keymaster.accessToken;
    }

    public final String b(String s, String s1)
    {
        Object obj2 = null;
        Object obj;
        byte abyte0[];
        abyte0 = new byte[4096];
        obj = new FileInputStream(Uri.parse(s).getPath());
        Object obj1 = new ByteArrayOutputStream();
_L3:
        int i = ((FileInputStream) (obj)).read(abyte0);
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((ByteArrayOutputStream) (obj1)).write(abyte0, 0, i);
          goto _L3
        Object obj3;
        obj3;
        Object obj4 = null;
        s1 = ((String) (obj1));
        s = null;
        obj2 = null;
        obj1 = obj;
        obj = s1;
        s1 = obj4;
_L15:
        Logger.b(((Throwable) (obj3)), "uploadImage().MalformedURLException", new Object[0]);
        Object obj5;
        String s5;
        Object obj12;
        Object obj13;
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
        }
        int j;
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (s1 == null) goto _L5; else goto _L4
_L4:
        s1.close();
        s1 = s;
_L7:
        if (s1 != null)
        {
            return (new StringBuilder("spotify:userimage:")).append(((ImageUploadResponse) (s1)).id).toString();
        } else
        {
            return null;
        }
_L2:
        j = ((ByteArrayOutputStream) (obj1)).size();
        if (j == 0)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                ((ByteArrayOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            return null;
        }
        obj3 = new URL("https://image-upload.spotify.com/v3/playlist");
        s = (HttpURLConnection)((URL) (obj3)).openConnection();
        s.setDoOutput(true);
        s.setRequestMethod("POST");
        s.setRequestProperty("Host", ((URL) (obj3)).getHost());
        s.setRequestProperty("Content-Type", "image/jpeg");
        s.setRequestProperty("Authorization", String.format("Bearer %s", new Object[] {
            s1
        }));
        s.setConnectTimeout(5000);
        s.setRequestProperty("Connection", "close");
        s.setFixedLengthStreamingMode(((ByteArrayOutputStream) (obj1)).size());
        s1 = s.getOutputStream();
        ((ByteArrayOutputStream) (obj1)).size();
        s1.write(((ByteArrayOutputStream) (obj1)).toByteArray());
        s1.flush();
        if (s.getResponseCode() == 200 || s.getResponseCode() == 202)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        Logger.c("uploadImage(): Response code not HTTP_OK or HTTP_ACCEPTED, was: %d", new Object[] {
            Integer.valueOf(s.getResponseCode())
        });
        s.disconnect();
        if (s != null)
        {
            s.disconnect();
        }
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((ByteArrayOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return null;
        obj3 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        s1 = new StringBuilder();
_L6:
        obj2 = ((BufferedReader) (obj3)).readLine();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        s1.append(((String) (obj2))).append('\n');
          goto _L6
        ((BufferedReader) (obj3)).close();
        s1 = (ImageUploadResponse)a.readValue(s1.toString(), com/spotify/mobile/android/spotlets/collection/service/AnnotateServiceHelperImpl$ImageUploadResponse);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_463;
        }
        if ("ok".equals(((ImageUploadResponse) (s1)).status))
        {
            break MISSING_BLOCK_LABEL_501;
        }
        Logger.c("uploadImage(): Failed to parse image reponse, or an error occurred.", new Object[0]);
        s.disconnect();
        if (s != null)
        {
            s.disconnect();
        }
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((ByteArrayOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((BufferedReader) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return null;
        if (s != null)
        {
            s.disconnect();
        }
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((ByteArrayOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((BufferedReader) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L7
        s1;
        s1 = s;
          goto _L7
        obj2;
        obj3 = null;
        obj1 = null;
        obj13 = null;
        s = null;
        s1 = null;
_L13:
        s5 = s1;
        obj12 = obj3;
        obj5 = obj1;
        obj = obj13;
        Logger.b(((Throwable) (obj2)), "uploadImage().ProtocolException", new Object[0]);
        if (s1 != null)
        {
            s1.disconnect();
        }
        if (obj13 != null)
        {
            try
            {
                ((FileInputStream) (obj13)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        s1 = s;
        if (obj3 == null) goto _L7; else goto _L8
_L8:
        ((BufferedReader) (obj3)).close();
        s1 = s;
          goto _L7
        s1;
        s1 = s;
          goto _L7
        obj2;
        obj3 = null;
        obj1 = null;
        obj13 = null;
        s = null;
        s1 = null;
_L12:
        s5 = s1;
        obj12 = obj3;
        obj5 = obj1;
        obj = obj13;
        Logger.b(((Throwable) (obj2)), "uploadImage().IOException", new Object[0]);
        if (s1 != null)
        {
            s1.disconnect();
        }
        if (obj13 != null)
        {
            try
            {
                ((FileInputStream) (obj13)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        s1 = s;
        if (obj3 == null) goto _L7; else goto _L9
_L9:
        ((BufferedReader) (obj3)).close();
        s1 = s;
          goto _L7
        s1;
        s1 = s;
          goto _L7
        s;
        obj1 = null;
        obj = null;
        s1 = null;
_L11:
        if (s1 != null)
        {
            s1.disconnect();
        }
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s;
        obj1 = null;
        s1 = null;
        continue; /* Loop/switch isn't completed */
        s;
        s1 = null;
        continue; /* Loop/switch isn't completed */
        obj3;
        s1 = s;
        s = ((String) (obj3));
        continue; /* Loop/switch isn't completed */
        obj5;
        obj2 = obj3;
        s1 = s;
        s = ((String) (obj5));
        continue; /* Loop/switch isn't completed */
        s;
        obj5 = obj2;
        obj3 = obj1;
        obj2 = s1;
        s1 = ((String) (obj5));
        obj1 = obj;
        obj = obj3;
        continue; /* Loop/switch isn't completed */
        s;
        obj2 = obj12;
        s1 = s5;
        obj1 = obj5;
        if (true) goto _L11; else goto _L10
_L10:
        obj2;
        obj3 = null;
        obj1 = null;
        s = null;
        s1 = null;
        obj13 = obj;
          goto _L12
        obj2;
        obj3 = null;
        s = null;
        s1 = null;
        obj13 = obj;
          goto _L12
        obj2;
        obj3 = null;
        s1 = s;
        s = null;
        obj13 = obj;
          goto _L12
        obj2;
        s1 = s;
        s = null;
        obj13 = obj;
          goto _L12
        obj2;
        String s2 = s;
        s = s1;
        s1 = s2;
        obj13 = obj;
          goto _L12
        obj2;
        obj3 = null;
        obj1 = null;
        s = null;
        s1 = null;
        obj13 = obj;
          goto _L13
        obj2;
        obj3 = null;
        s = null;
        s1 = null;
        obj13 = obj;
          goto _L13
        obj2;
        obj3 = null;
        s1 = s;
        s = null;
        obj13 = obj;
          goto _L13
        obj2;
        s1 = s;
        s = null;
        obj13 = obj;
          goto _L13
        obj2;
        String s3 = s;
        s = s1;
        s1 = s3;
        obj13 = obj;
          goto _L13
        obj3;
        s1 = null;
        obj = null;
        obj1 = null;
        s = null;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj3;
        s1 = null;
        Object obj6 = null;
        obj1 = obj;
        s = null;
        obj2 = null;
        obj = obj6;
        continue; /* Loop/switch isn't completed */
        obj3;
        Object obj7 = obj;
        Object obj9 = null;
        obj2 = s;
        s1 = null;
        obj = obj1;
        obj1 = obj7;
        s = obj9;
        continue; /* Loop/switch isn't completed */
        MalformedURLException malformedurlexception;
        malformedurlexception;
        obj2 = s1;
        s1 = ((String) (obj3));
        Object obj10 = obj;
        String s4 = s;
        obj3 = malformedurlexception;
        obj = obj1;
        obj1 = obj10;
        s = ((String) (obj2));
        obj2 = s4;
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = s;
          goto _L7
        malformedurlexception;
        Object obj11 = null;
        s1 = ((String) (obj3));
        Object obj8 = obj;
        obj2 = s;
        obj3 = malformedurlexception;
        obj = obj1;
        obj1 = obj8;
        s = obj11;
        if (true) goto _L15; else goto _L14
_L14:
    }

    private class Playlist
        implements JacksonModel
    {

        public String uri;

        public Playlist()
        {
        }

        public Playlist(String s)
        {
            uri = s;
        }
    }


    private class CreatePlaylist
        implements JacksonModel
    {

        public String itemUri;
        public String name;

        public CreatePlaylist(String s, String s1)
        {
            name = s;
            itemUri = s1;
        }
    }


    private class Annotation
        implements JacksonModel
    {

        public String description;
        public String imageUri;

        public Annotation(String s, String s1)
        {
            description = s;
            imageUri = s1;
        }
    }


    private class Keymaster
        implements JacksonModel
    {

        public String accessToken;
        public int expiresIn;

        public Keymaster()
        {
        }

        public Keymaster(String s, int i)
        {
            accessToken = s;
            expiresIn = i;
        }
    }


    private class ImageUploadResponse
        implements JacksonModel
    {

        public String id;
        public String status;

        ImageUploadResponse()
        {
        }
    }

}
