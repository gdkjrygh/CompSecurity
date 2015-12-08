// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Intents;
import com.mopub.common.util.Views;
import com.mopub.exceptions.IntentNotResolvableException;
import com.mopub.exceptions.UrlParseException;
import java.lang.ref.WeakReference;
import java.util.Iterator;

// Referenced classes of package com.mopub.nativeads:
//            az, aw, ay

final class d
    implements az
{

    private final Context a;
    private final Iterator b;
    private final WeakReference c;

    public d(Context context, Iterator iterator, aw aw1)
    {
        a = context.getApplicationContext();
        b = iterator;
        c = new WeakReference(aw1);
    }

    private void a()
    {
        aw aw1 = (aw)c.get();
        if (aw1 != null)
        {
            Views.removeFromParent(aw1);
            aw1.setVisibility(8);
        }
    }

    public final void onFailure()
    {
        MoPubLog.d("Failed to resolve URL for click.");
        a();
    }

    public final void onSuccess(String s)
    {
        Intent intent1;
        if (Intents.isAboutScheme(s))
        {
            MoPubLog.d("Link to about page ignored.");
            a();
            return;
        }
        if (Intents.isNativeBrowserScheme(s))
        {
            try
            {
                Intent intent = Intents.intentForNativeBrowserScheme(s);
                Intents.startActivity(a, intent);
                a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                MoPubLog.d(s.getMessage());
            }
            catch (IntentNotResolvableException intentnotresolvableexception)
            {
                MoPubLog.d((new StringBuilder("Could not handle intent for URI: ")).append(s).toString());
            }
            if (b.hasNext())
            {
                ay.getResolvedUrl((String)b.next(), this);
                return;
            } else
            {
                a();
                return;
            }
        }
        if (!Intents.isDeepLink(s))
        {
            break MISSING_BLOCK_LABEL_217;
        }
        intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
        if (!Intents.deviceCanHandleIntent(a, intent1))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        Intents.startActivity(a, intent1);
        a();
        return;
        IntentNotResolvableException intentnotresolvableexception1;
        intentnotresolvableexception1;
        MoPubLog.d((new StringBuilder("Could not handle intent with URI: ")).append(s).toString());
        a();
        if (b.hasNext())
        {
            ay.getResolvedUrl((String)b.next(), this);
            return;
        } else
        {
            a();
            return;
        }
        s;
        a();
        throw s;
        a();
        if (Intents.isHttpUrl(s))
        {
            MoPubBrowser.open(a, s);
            return;
        } else
        {
            MoPubLog.d((new StringBuilder("Link ignored. Unable to handle url: ")).append(s).toString());
            return;
        }
    }
}
