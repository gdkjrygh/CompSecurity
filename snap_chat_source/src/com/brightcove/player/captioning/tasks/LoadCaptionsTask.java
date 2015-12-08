// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.tasks;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.AsyncTask;
import com.brightcove.player.captioning.TTMLParser;
import com.brightcove.player.captioning.WebVTTParser;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.media.CaptionType;
import com.brightcove.player.model.TTMLDocument;
import com.brightcove.player.model.WebVTTDocument;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class LoadCaptionsTask extends AsyncTask
    implements Component
{
    public static interface ResponseStreamListener
    {

        public abstract void onStreamReady(InputStream inputstream);
    }


    private EventEmitter a;
    private String b;
    private Exception c;
    private TTMLDocument d;
    private WebVTTDocument e;
    private CaptionType f;
    private ContentResolver g;

    public LoadCaptionsTask(EventEmitter eventemitter, ContentResolver contentresolver, CaptionType captiontype)
    {
        if (eventemitter == null)
        {
            throw new IllegalArgumentException("must provide an EventEmitter");
        } else
        {
            a = RegisteringEventEmitter.build(eventemitter, com/brightcove/player/captioning/tasks/LoadCaptionsTask);
            g = contentresolver;
            f = captiontype;
            return;
        }
    }

    static TTMLDocument a(LoadCaptionsTask loadcaptionstask, TTMLDocument ttmldocument)
    {
        loadcaptionstask.d = ttmldocument;
        return ttmldocument;
    }

    static WebVTTDocument a(LoadCaptionsTask loadcaptionstask, WebVTTDocument webvttdocument)
    {
        loadcaptionstask.e = webvttdocument;
        return webvttdocument;
    }

    private transient Void a(Uri auri[])
    {
        if (auri.length != 1 || auri[0] == null)
        {
            throw new IllegalArgumentException("must provide a single URI argument");
        }
        b = null;
        static final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[CaptionType.values().length];
                try
                {
                    a[CaptionType.WEBVTT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CaptionType.TTML.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3.a[f.ordinal()])
        {
        default:
            (new StringBuilder("Unexpected captions type: ")).append(f);
            return null;

        case 1: // '\001'
            try
            {
                a(auri[0], new ResponseStreamListener() {

                    private LoadCaptionsTask a;

                    public final void onStreamReady(InputStream inputstream)
                    {
                        LoadCaptionsTask.a(a, WebVTTParser.parse(inputstream, "UTF-8"));
                    }

            
            {
                a = LoadCaptionsTask.this;
                super();
            }
                });
            }
            // Misplaced declaration of an exception variable
            catch (Uri auri[])
            {
                b = "exception while issuing HTTP request";
                c = auri;
                cancel(true);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Uri auri[])
            {
                b = "unexpected exception parsing WebVTT response";
                c = auri;
                cancel(true);
                return null;
            }
            return null;

        case 2: // '\002'
            break;
        }
        try
        {
            a(auri[0], new ResponseStreamListener() {

                private LoadCaptionsTask a;

                public final void onStreamReady(InputStream inputstream)
                {
                    LoadCaptionsTask.a(a, TTMLParser.parseXml(inputstream, null));
                }

            
            {
                a = LoadCaptionsTask.this;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Uri auri[])
        {
            b = "exception while issuing HTTP request";
            c = auri;
            cancel(true);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Uri auri[])
        {
            b = "exception parsing DFXP TTML response";
            c = auri;
            cancel(true);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Uri auri[])
        {
            b = "unexpected exception parsing DFXP TTML response";
            c = auri;
            cancel(true);
            return null;
        }
        return null;
    }

    private void a(Uri uri, ResponseStreamListener responsestreamlistener)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException("must provide a valid Uri");
        }
        responsestreamlistener.onStreamReady(g.openInputStream(uri));
_L2:
        return;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        Object obj;
        obj = (new URI(uri.toString())).toURL();
        uri = null;
        (new StringBuilder("issuing GET request: ")).append(((URL) (obj)).toString());
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

    protected Object doInBackground(Object aobj[])
    {
        return a((Uri[])aobj);
    }

    protected void onCancelled()
    {
        if (b != null)
        {
            String s = b;
            HashMap hashmap = new HashMap();
            hashmap.put("errorMessage", s);
            if (c != null)
            {
                hashmap.put("error", c);
            }
            a.emit("closedCaptioningError", hashmap);
        }
    }

    protected void onPostExecute(Object obj)
    {
        obj = new HashMap();
        if (f != CaptionType.TTML) goto _L2; else goto _L1
_L1:
        if (d != null)
        {
            ((Map) (obj)).put("ttmlDocument", d);
        }
_L4:
        a.emit("didLoadClosedCaptions", ((Map) (obj)));
        return;
_L2:
        if (f == CaptionType.WEBVTT && e != null)
        {
            ((Map) (obj)).put("webvttDocument", e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        com/brightcove/player/captioning/tasks/LoadCaptionsTask.getSimpleName();
    }
}
