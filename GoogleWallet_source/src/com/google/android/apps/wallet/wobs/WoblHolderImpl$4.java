// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.wallet.logging.WLog;
import com.google.wallet.wobl.renderer.android.AndroidRenderUtils;
import com.google.wallet.wobl.renderer.android.OnActionHandler;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WoblHolderImpl

final class this._cls0
    implements OnActionHandler
{

    final WoblHolderImpl this$0;

    private void onAction(URI uri, View view)
    {
        uri = Uri.parse(uri.toString()).getQueryParameter("uri");
        try
        {
            AndroidRenderUtils.intentToUri(view.getContext(), WoblHolderImpl.access$500(WoblHolderImpl.this), new URI(uri));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            WLog.efmt(WoblHolderImpl.access$600(), view, "Invalid native uri: %s", new Object[] {
                uri
            });
        }
    }

    public final volatile void onAction(Object obj, View view)
    {
        onAction((URI)obj, view);
    }

    Utils()
    {
        this$0 = WoblHolderImpl.this;
        super();
    }
}
