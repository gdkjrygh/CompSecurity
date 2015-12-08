// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.presentation;

import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package org.xwalk.core.internal.extension.api.presentation:
//            PresentationExtension, XWalkPresentationContent, PresentationView

class val.baseUrl
    implements Runnable
{

    final PresentationExtension this$0;
    final String val$baseUrl;
    final int val$instanceId;
    final int val$requestId;
    final String val$url;

    public void run()
    {
        String s;
        android.view.Display display;
        display = PresentationExtension.access$300(PresentationExtension.this);
        if (display == null)
        {
            PresentationExtension.access$400(PresentationExtension.this, val$instanceId, val$requestId, "NotFoundError");
            return;
        }
        if (PresentationExtension.access$500(PresentationExtension.this) != null)
        {
            PresentationExtension.access$400(PresentationExtension.this, val$instanceId, val$requestId, "InvalidAccessError");
            return;
        }
        s = val$url;
        URI uri = new URI(val$url);
        if (!uri.isAbsolute())
        {
            s = (new URI(val$baseUrl)).resolve(uri).toString();
        }
        PresentationExtension.access$502(PresentationExtension.this, new XWalkPresentationContent(PresentationExtension.access$600(PresentationExtension.this), PresentationExtension.access$700(PresentationExtension.this), new XWalkPresentationContent.PresentationDelegate() {

            final PresentationExtension._cls2 this$1;

            public void onContentClosed(XWalkPresentationContent xwalkpresentationcontent)
            {
                if (xwalkpresentationcontent == PresentationExtension.access$500(this$0))
                {
                    PresentationExtension.access$200(this$0);
                    if (PresentationExtension.access$900(this$0) != null)
                    {
                        PresentationExtension.access$900(this$0).cancel();
                    }
                }
            }

            public void onContentLoaded(XWalkPresentationContent xwalkpresentationcontent)
            {
                PresentationExtension.access$800(this$0, instanceId, requestId, xwalkpresentationcontent.getPresentationId());
            }

            
            {
                this$1 = PresentationExtension._cls2.this;
                super();
            }
        }));
        PresentationExtension.access$500(PresentationExtension.this).load(s);
        PresentationExtension.access$1000(PresentationExtension.this, display);
        return;
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
_L2:
        Log.e("PresentationExtension", "Invalid url passed to requestShow");
        PresentationExtension.access$400(PresentationExtension.this, val$instanceId, val$requestId, "InvalidParameterError");
        return;
        urisyntaxexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    _cls1.this._cls1()
    {
        this$0 = final_presentationextension;
        val$instanceId = i;
        val$requestId = j;
        val$url = s;
        val$baseUrl = String.this;
        super();
    }
}
