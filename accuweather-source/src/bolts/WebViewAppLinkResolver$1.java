// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.net.Uri;
import org.json.JSONArray;

// Referenced classes of package bolts:
//            Continuation, WebViewAppLinkResolver, Task, AppLink

class val.url
    implements Continuation
{

    final WebViewAppLinkResolver this$0;
    final Uri val$url;

    public AppLink then(Task task)
        throws Exception
    {
        return WebViewAppLinkResolver.access$100(WebViewAppLinkResolver.access$000((JSONArray)task.getResult()), val$url);
    }

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    ()
    {
        this$0 = final_webviewapplinkresolver;
        val$url = Uri.this;
        super();
    }
}
