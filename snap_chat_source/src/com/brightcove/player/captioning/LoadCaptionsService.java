// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import android.content.ContentResolver;
import android.net.Uri;
import com.brightcove.player.captioning.tasks.LoadCaptionsTask;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.media.CaptionType;
import java.net.URI;

public class LoadCaptionsService extends AbstractComponent
{

    private ContentResolver a;

    public LoadCaptionsService(EventEmitter eventemitter, ContentResolver contentresolver)
    {
        super(eventemitter, com/brightcove/player/captioning/LoadCaptionsService);
        if (eventemitter == null)
        {
            throw new IllegalArgumentException("must provide an EventEmitter");
        } else
        {
            a = contentresolver;
            return;
        }
    }

    private static CaptionType a(Uri uri)
    {
        uri = uri.getPath();
        if (uri.endsWith(".ttml") || uri.endsWith(".dfxp") || uri.endsWith(".xml"))
        {
            return CaptionType.TTML;
        }
        if (uri.endsWith(".vtt"))
        {
            return CaptionType.WEBVTT;
        } else
        {
            return CaptionType.UNKNOWN;
        }
    }

    public void loadCaptions(Uri uri, String s)
    {
        if (uri != null)
        {
            CaptionType captiontype = CaptionType.fromString(s);
            s = captiontype;
            if (captiontype == null)
            {
                s = a(uri);
            }
            if (s != null)
            {
                (new LoadCaptionsTask(eventEmitter, a, s)).execute(new Uri[] {
                    uri
                });
                return;
            } else
            {
                throw new IllegalArgumentException("unknown caption type");
            }
        } else
        {
            throw new IllegalArgumentException("must provide a valid Uri");
        }
    }

    public void loadCaptions(URI uri)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException("must provide a valid URI");
        }
        if (uri != null)
        {
            (new LoadCaptionsTask(eventEmitter, a, a(Uri.parse(uri.toString())))).execute(new Uri[] {
                Uri.parse(uri.toString())
            });
        }
    }
}
