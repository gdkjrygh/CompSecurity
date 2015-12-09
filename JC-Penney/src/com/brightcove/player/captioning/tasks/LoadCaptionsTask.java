// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.tasks;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.media.CaptionType;
import com.brightcove.player.model.TTMLDocument;
import com.brightcove.player.model.WebVTTDocument;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.brightcove.player.captioning.tasks:
//            c, a, b

public class LoadCaptionsTask extends AsyncTask
    implements Component
{

    private static final String a = com/brightcove/player/captioning/tasks/LoadCaptionsTask.getSimpleName();
    private EventEmitter b;
    private String c;
    private Exception d;
    private TTMLDocument e;
    private WebVTTDocument f;
    private CaptionType g;
    private ContentResolver h;

    public LoadCaptionsTask(EventEmitter eventemitter, ContentResolver contentresolver, CaptionType captiontype)
    {
        if (eventemitter == null)
        {
            throw new IllegalArgumentException("must provide an EventEmitter");
        } else
        {
            b = RegisteringEventEmitter.build(eventemitter, com/brightcove/player/captioning/tasks/LoadCaptionsTask);
            h = contentresolver;
            g = captiontype;
            return;
        }
    }

    static TTMLDocument a(LoadCaptionsTask loadcaptionstask, TTMLDocument ttmldocument)
    {
        loadcaptionstask.e = ttmldocument;
        return ttmldocument;
    }

    static WebVTTDocument a(LoadCaptionsTask loadcaptionstask, WebVTTDocument webvttdocument)
    {
        loadcaptionstask.f = webvttdocument;
        return webvttdocument;
    }

    private void a(Uri uri, ResponseStreamListener responsestreamlistener)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException("must provide a valid Uri");
        }
        if (responsestreamlistener == null)
        {
            throw new IllegalArgumentException("must provide a listener to process the InputStream");
        }
        responsestreamlistener.onStreamReady(h.openInputStream(uri));
_L2:
        return;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        Object obj;
        obj = (new URI(uri.toString())).toURL();
        uri = null;
        Log.d(a, (new StringBuilder()).append("issuing GET request: ").append(((URL) (obj)).toString()).toString());
        obj = (HttpURLConnection)((URL) (obj)).openConnection();
        responsestreamlistener.onStreamReady(((HttpURLConnection) (obj)).getInputStream());
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((HttpURLConnection) (obj)).disconnect();
        return;
        responsestreamlistener;
_L4:
        if (uri != null)
        {
            uri.disconnect();
        }
        throw responsestreamlistener;
        responsestreamlistener;
        uri = ((Uri) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(String s)
    {
        Log.e(a, s, d);
        HashMap hashmap = new HashMap();
        hashmap.put("errorMessage", s);
        if (d != null)
        {
            hashmap.put("error", d);
        }
        b.emit("closedCaptioningError", hashmap);
    }

    protected transient Void a(Uri auri[])
    {
        if (auri.length != 1 || auri[0] == null)
        {
            throw new IllegalArgumentException("must provide a single URI argument");
        }
        c = null;
        switch (c.a[g.ordinal()])
        {
        default:
            Log.e(a, (new StringBuilder()).append("Unexpected captions type: ").append(g).toString());
            return null;

        case 1: // '\001'
            try
            {
                a(auri[0], ((ResponseStreamListener) (new a(this))));
            }
            // Misplaced declaration of an exception variable
            catch (Uri auri[])
            {
                c = "exception while issuing HTTP request";
                d = auri;
                cancel(true);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Uri auri[])
            {
                c = "unexpected exception parsing WebVTT response";
                d = auri;
                cancel(true);
                return null;
            }
            return null;

        case 2: // '\002'
            break;
        }
        try
        {
            a(auri[0], ((ResponseStreamListener) (new b(this))));
        }
        // Misplaced declaration of an exception variable
        catch (Uri auri[])
        {
            c = "exception while issuing HTTP request";
            d = auri;
            cancel(true);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Uri auri[])
        {
            c = "exception parsing DFXP TTML response";
            d = auri;
            cancel(true);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Uri auri[])
        {
            c = "unexpected exception parsing DFXP TTML response";
            d = auri;
            cancel(true);
            return null;
        }
        return null;
    }

    protected void a(Void void1)
    {
        void1 = new HashMap();
        if (g != CaptionType.TTML) goto _L2; else goto _L1
_L1:
        if (e != null)
        {
            void1.put("ttmlDocument", e);
        }
_L4:
        b.emit("didLoadClosedCaptions", void1);
        return;
_L2:
        if (g == CaptionType.WEBVTT && f != null)
        {
            void1.put("webvttDocument", f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Uri[])aobj);
    }

    protected void onCancelled()
    {
        if (c != null)
        {
            a(c);
        }
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }


    private class ResponseStreamListener
    {

        public abstract void onStreamReady(InputStream inputstream);
    }

}
