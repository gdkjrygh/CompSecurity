// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.presentation;

import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package org.xwalk.core.internal.extension.api.presentation:
//            PresentationExtension, PresentationView, XWalkPresentationContent

class this._cls1
    implements resentationDelegate
{

    final etPresentationId this$1;

    public void onContentClosed(XWalkPresentationContent xwalkpresentationcontent)
    {
        if (xwalkpresentationcontent == PresentationExtension.access$500(_fld0))
        {
            PresentationExtension.access$200(_fld0);
            if (PresentationExtension.access$900(_fld0) != null)
            {
                PresentationExtension.access$900(_fld0).cancel();
            }
        }
    }

    public void onContentLoaded(XWalkPresentationContent xwalkpresentationcontent)
    {
        PresentationExtension.access$800(_fld0, instanceId, requestId, xwalkpresentationcontent.getPresentationId());
    }

    l.baseUrl()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/xwalk/core/internal/extension/api/presentation/PresentationExtension$2

/* anonymous class */
    class PresentationExtension._cls2
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
                PresentationExtension.access$400(PresentationExtension.this, instanceId, requestId, "NotFoundError");
                return;
            }
            if (PresentationExtension.access$500(PresentationExtension.this) != null)
            {
                PresentationExtension.access$400(PresentationExtension.this, instanceId, requestId, "InvalidAccessError");
                return;
            }
            s = url;
            URI uri = new URI(url);
            if (!uri.isAbsolute())
            {
                s = (new URI(baseUrl)).resolve(uri).toString();
            }
            PresentationExtension.access$502(PresentationExtension.this, new XWalkPresentationContent(PresentationExtension.access$600(PresentationExtension.this), PresentationExtension.access$700(PresentationExtension.this), new PresentationExtension._cls2._cls1()));
            PresentationExtension.access$500(PresentationExtension.this).load(s);
            PresentationExtension.access$1000(PresentationExtension.this, display);
            return;
            URISyntaxException urisyntaxexception;
            urisyntaxexception;
_L2:
            Log.e("PresentationExtension", "Invalid url passed to requestShow");
            PresentationExtension.access$400(PresentationExtension.this, instanceId, requestId, "InvalidParameterError");
            return;
            urisyntaxexception;
            if (true) goto _L2; else goto _L1
_L1:
        }

            
            {
                this$0 = final_presentationextension;
                instanceId = i;
                requestId = j;
                url = s;
                baseUrl = String.this;
                super();
            }
    }

}
