// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.loader;

import android.os.Handler;
import android.os.Message;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.network.vast.model.VASTAd;
import com.auditude.ads.network.vast.model.VASTDocument;
import com.auditude.ads.network.vast.repackaging.VastAssetRepackagerInfo;
import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.event.Event;
import com.auditude.ads.util.event.EventDispatcher;
import com.auditude.ads.util.event.IEventListener;
import com.auditude.ads.util.http.AsyncHttpConnection;
import java.util.ArrayList;

// Referenced classes of package com.auditude.ads.network.vast.loader:
//            VASTDocumentProcessor

public class VASTXMLLoader extends EventDispatcher
    implements IEventListener
{

    public static final String COMPLETE = "complete";
    public static final String FAILED = "failed";
    public Object State;
    private VASTDocument document;
    private Throwable error;
    private Boolean fallbackOnInvalidCreative;
    private AsyncHttpConnection httpClient;
    private int maxNumWrapperRedirects;
    private ArrayList mimeTypes;
    private VASTDocumentProcessor processor;
    private VastAssetRepackagerInfo vastAssetRepackagerInfo;

    public VASTXMLLoader(int i, ArrayList arraylist, VastAssetRepackagerInfo vastassetrepackagerinfo, Boolean boolean1)
    {
        maxNumWrapperRedirects = 6;
        mimeTypes = null;
        vastAssetRepackagerInfo = null;
        fallbackOnInvalidCreative = Boolean.valueOf(false);
        maxNumWrapperRedirects = i;
        mimeTypes = arraylist;
        vastAssetRepackagerInfo = vastassetrepackagerinfo;
        fallbackOnInvalidCreative = boolean1;
    }

    private void notifyRequestFailed()
    {
        dispatchEvent("failed", new Event(this));
    }

    private void onDocumentProcessComplete(Object obj)
    {
        if (!(obj instanceof VASTDocumentProcessor))
        {
            obj = null;
        }
        obj = (VASTDocumentProcessor)obj;
        if (obj != null)
        {
            ((VASTDocumentProcessor) (obj)).removeEventListener("processComplete", this);
            ((VASTDocumentProcessor) (obj)).removeEventListener("processFailed", this);
            document = ((VASTDocumentProcessor) (obj)).getDocument();
        }
        dispatchEvent("complete", new Event(this));
    }

    private void onDocumentProcessFailed(Object obj)
    {
        if (!(obj instanceof VASTDocumentProcessor))
        {
            obj = null;
        }
        obj = (VASTDocumentProcessor)obj;
        ((VASTDocumentProcessor) (obj)).removeEventListener("processComplete", this);
        ((VASTDocumentProcessor) (obj)).removeEventListener("processFailed", this);
        dispatchEvent("complete", new Event(this));
    }

    public final VASTDocument getDocument()
    {
        return document;
    }

    public final Throwable getError()
    {
        return error;
    }

    public final void init(Object obj)
    {
        if ((obj instanceof String) && !StringUtil.isNullOrEmpty((String)obj))
        {
            httpClient = new AsyncHttpConnection(new Handler() {

                final VASTXMLLoader this$0;
                private final IEventListener val$that;

                public void handleMessage(Message message)
                {
                    switch (message.what)
                    {
                    case 0: // '\0'
                    default:
                        return;

                    case 2: // '\002'
                        String s = (String)message.obj;
                        processor = new VASTDocumentProcessor(maxNumWrapperRedirects, mimeTypes, vastAssetRepackagerInfo, fallbackOnInvalidCreative);
                        processor.addEventListener("processComplete", that);
                        processor.addEventListener("processFailed", that);
                        message = null;
                        if (((VASTXMLLoader)that).State instanceof VASTAd)
                        {
                            message = (VASTAd)((VASTXMLLoader)that).State;
                        }
                        processor.process(s, message);
                        return;

                    case 1: // '\001'
                        error = (Exception)message.obj;
                        notifyRequestFailed();
                        return;
                    }
                }

            
            {
                this$0 = VASTXMLLoader.this;
                that = ieventlistener;
                super();
            }
            });
            httpClient.get(AuditudeUtil.substituteCustomPublisherTags(AuditudeUtil.substituteTags((String)obj), AuditudeEnv.getInstance().getAdSettings().getPassThroughParams()));
            return;
        }
        if ((obj instanceof VASTDocument) && obj != null)
        {
            if (State instanceof VASTAd)
            {
                ((VASTDocument)obj).parentAd = (VASTAd)State;
            }
            processor = new VASTDocumentProcessor(maxNumWrapperRedirects, mimeTypes, vastAssetRepackagerInfo, fallbackOnInvalidCreative);
            processor.addEventListener("processComplete", this);
            processor.addEventListener("processFailed", this);
            processor.process((VASTDocument)obj);
            return;
        } else
        {
            onDocumentProcessComplete(null);
            return;
        }
    }

    public void onEvent(String s, Object obj)
    {
        if (obj instanceof Event)
        {
            if (s.equalsIgnoreCase("processComplete"))
            {
                onDocumentProcessComplete(((Event)obj).getOwner());
                return;
            }
            if (s.equalsIgnoreCase("processFailed"))
            {
                onDocumentProcessFailed(((Event)obj).getOwner());
                return;
            } else
            {
                notifyRequestFailed();
                return;
            }
        } else
        {
            notifyRequestFailed();
            return;
        }
    }








}
