// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import android.os.Handler;
import com.skype.android.event.EventBus;
import com.skype.android.util.Charsets;
import com.skype.android.util.HttpUtil;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.logging.Logger;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            ShortCircuitProfileWebClient

final class this._cls1
    implements Runnable
{

    final moveAlias this$1;

    public final void run()
    {
        sInfo.access._mth300(deleteItem, false);
        ShortCircuitProfileWebClient.access$200(_fld0).a(new moveAlias());
    }

    nit>()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/shortcircuit/ShortCircuitProfileWebClient$3

/* anonymous class */
    final class ShortCircuitProfileWebClient._cls3 extends ShortCircuitProfileWebClient.a
    {

        final ShortCircuitProfileWebClient this$0;
        final ShortCircuitProfileWebClient.AliasInfo val$deleteItem;
        final Handler val$handler;

        public final void run()
        {
            Object obj;
            Object obj1;
            HttpURLConnection httpurlconnection;
            Object obj3;
            obj1 = null;
            obj3 = null;
            httpurlconnection = ShortCircuitProfileWebClient.access$000(ShortCircuitProfileWebClient.this);
            obj = obj1;
            httpurlconnection.setRequestMethod("POST");
            obj = obj1;
            JSONObject jsonobject = ShortCircuitProfileWebClient.access$600(ShortCircuitProfileWebClient.this, deleteItem);
            obj = obj1;
            ShortCircuitProfileWebClient.access$500().info((new StringBuilder("Payload: ")).append(jsonobject.toString()).toString());
            obj = obj1;
            obj1 = new OutputStreamWriter(httpurlconnection.getOutputStream(), Charsets.a);
            ((OutputStreamWriter) (obj1)).write(jsonobject.toString());
            ((OutputStreamWriter) (obj1)).flush();
            obj = ShortCircuitProfileWebClient.access$100(ShortCircuitProfileWebClient.this).c(httpurlconnection);
            if (!ShortCircuitProfileWebClient.access$700(ShortCircuitProfileWebClient.this, ((String) (obj))))
            {
                handler.post(new ShortCircuitProfileWebClient._cls3._cls1());
            }
            ShortCircuitProfileWebClient.access$100(ShortCircuitProfileWebClient.this).a(((java.io.Closeable) (obj1)));
            return;
            Object obj2;
            obj2;
            obj1 = obj3;
_L4:
            obj = obj1;
            ((Exception) (obj2)).printStackTrace();
            ShortCircuitProfileWebClient.access$100(ShortCircuitProfileWebClient.this).a(((java.io.Closeable) (obj1)));
            return;
            obj1;
_L2:
            ShortCircuitProfileWebClient.access$100(ShortCircuitProfileWebClient.this).a(((java.io.Closeable) (obj)));
            throw obj1;
            obj2;
            obj = obj1;
            obj1 = obj2;
            if (true) goto _L2; else goto _L1
_L1:
            obj2;
            if (true) goto _L4; else goto _L3
_L3:
        }

            
            {
                this$0 = final_shortcircuitprofilewebclient;
                deleteItem = ShortCircuitProfileWebClient.AliasInfo.this;
                handler = handler1;
                super(final_shortcircuitprofilewebclient, final_s);
            }
    }

}
