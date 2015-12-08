// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Base64;
import android.webkit.WebView;
import com.spotify.mobile.android.ui.activity.upsell.PremiumSignupActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class fqv
{

    final Context a;
    final String b;
    adh c;
    boolean d;
    boolean e;
    fqw f;
    private Uri g;

    public fqv(Context context)
    {
        new ServiceConnection() {

            private fqv a;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                boolean flag1;
                flag1 = true;
                a.c = adi.a(ibinder);
                componentname = a;
                boolean flag;
                if (a.c.a(3, a.b, "subs") == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                componentname.d = flag;
                componentname = a;
                if (a.c.a(3, a.b, "inapp") == 0)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                try
                {
                    componentname.e = flag;
                    flag = a.d;
                    flag = a.e;
                }
                // Misplaced declaration of an exception variable
                catch (ComponentName componentname)
                {
                    Logger.b(componentname, "", new Object[0]);
                }
                if (a.f != null)
                {
                    a.f.b();
                }
                return;
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
                a.c = null;
            }

            
            {
                a = fqv.this;
                super();
            }
        };
        a = context;
        b = context.getPackageName();
    }

    static int a(Bundle bundle)
    {
        bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
        if (bundle != null)
        {
            if (bundle instanceof Integer)
            {
                return ((Integer)bundle).intValue();
            }
            if (bundle instanceof Long)
            {
                return ((Long)bundle).intValue();
            }
        }
        return 6;
    }

    private static String a(String s, String s1)
    {
        try
        {
            s = (new JSONObject(s)).optString(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.b(s, "", new Object[0]);
            return null;
        }
        return s;
    }

    public final void a()
    {
        e = false;
        d = false;
        f = null;
    }

    final void a(WebView webview, int i, String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(String.format(Locale.US, "%s=%d", new Object[] {
            "responseCode", Integer.valueOf(i)
        }));
        if (s != null)
        {
            try
            {
                stringbuilder.append(String.format(Locale.US, "&%s=%s", new Object[] {
                    "purchaseData", URLEncoder.encode(s, "UTF-8")
                }));
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                throw new AssertionError();
            }
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        stringbuilder.append(String.format(Locale.US, "&%s=%s", new Object[] {
            "dataSignature", URLEncoder.encode(s1, "UTF-8")
        }));
        s = g.buildUpon().appendQueryParameter("post", "true").build();
        s1 = Base64.encode(stringbuilder.toString().getBytes(), 0);
        webview.postUrl(s.toString(), s1);
        return;
    }

    public final boolean a(PremiumSignupActivity premiumsignupactivity, WebView webview, Uri uri)
    {
        String s;
        String s1;
        byte byte0;
        byte0 = 6;
        if (uri == null || uri.getPath() == null)
        {
            return false;
        }
        if (!uri.getPath().contains("/purchase/googleiap"))
        {
            return false;
        }
        if ("true".equals(uri.getQueryParameter("post")))
        {
            return false;
        }
        g = uri;
        s = uri.getQueryParameter("productId");
        s1 = uri.getQueryParameter("type");
        uri = uri.getQueryParameter("orderId");
        if (c != null) goto _L2; else goto _L1
_L1:
        int i;
        Logger.b("Disconnected from service", new Object[0]);
        uri = null;
        i = 6;
_L3:
        if (i == 0 && uri == null)
        {
            i = byte0;
        }
        if (i == 0)
        {
            webview.loadUrl("about:blank");
            try
            {
                premiumsignupactivity.startIntentSenderForResult(uri.getIntentSender(), 1, new Intent(), 0, 0, 0);
            }
            // Misplaced declaration of an exception variable
            catch (PremiumSignupActivity premiumsignupactivity)
            {
                Logger.b(premiumsignupactivity, "", new Object[0]);
            }
        } else
        {
            a(webview, i, null, null);
        }
        return true;
_L2:
        uri = c.a(3, b, s, s1, uri);
        i = a(((Bundle) (uri)));
        uri = (PendingIntent)uri.getParcelable("BUY_INTENT");
          goto _L3
        uri;
        i = 6;
_L4:
        Logger.b(uri, "", new Object[0]);
        uri = null;
          goto _L3
        uri;
          goto _L4
    }

    public final boolean a(fqx fqx1)
    {
        Assertion.a("inapp".equals(fqx1.a), "Only managed products can be consumed");
        String s = a(fqx1.c, "purchaseToken");
        if (s == null)
        {
            Logger.c("Could not get token from data (%s)", new Object[] {
                fqx1.c
            });
            return false;
        }
        int i;
        try
        {
            i = c.b(3, b, s);
        }
        // Misplaced declaration of an exception variable
        catch (fqx fqx1)
        {
            Logger.b(fqx1, "", new Object[0]);
            return false;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        Logger.c("Failed to consume purchase %d (%s)", new Object[] {
            Integer.valueOf(i), s
        });
        return false;
        fqx1 = fqx1.b;
        return true;
    }

    public final boolean a(String s, ArrayList arraylist, ArrayList arraylist1)
    {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", arraylist);
        try
        {
            s = c.a(3, b, s, bundle);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.b(s, "", new Object[0]);
            return false;
        }
        s = s.getStringArrayList("DETAILS_LIST");
        if (s == null)
        {
            return false;
        }
        s = s.iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            arraylist = (String)s.next();
            try
            {
                arraylist = new JSONObject(arraylist);
                String s1 = arraylist.optString("productId");
                arraylist.optString("type");
                String s2 = arraylist.optString("price");
                arraylist.optString("title");
                arraylist.optString("description");
                arraylist1.add(new fqy(s1, s2));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Logger.b(s, "", new Object[0]);
                return false;
            }
        } while (true);
        return true;
    }

    final boolean a(String s, List list)
    {
        if (c == null)
        {
            Logger.b("Disconnected from service", new Object[0]);
            return false;
        }
        Object obj = null;
        do
        {
            try
            {
                obj = c.a(3, b, s, ((String) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Logger.b(s, "", new Object[0]);
                return false;
            }
            if (obj == null)
            {
                Logger.b("getPurchases() returned null", new Object[0]);
                return false;
            }
            int i = a(((Bundle) (obj)));
            if (i != 0)
            {
                Logger.b("Response code %d when getting purchases", new Object[] {
                    Integer.valueOf(i)
                });
                return false;
            }
            ArrayList arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            obj = ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
            if (arraylist == null || arraylist1 == null)
            {
                return false;
            }
            int k = Math.min(arraylist.size(), arraylist1.size());
            for (int j = 0; j < k; j++)
            {
                String s1 = (String)arraylist.get(j);
                String s2 = (String)arraylist1.get(j);
                String s3 = a(s1, "orderId");
                if (s3 != null)
                {
                    list.add(new fqx(s, s3, s1, s2));
                }
            }

        } while (obj != null && ((String) (obj)).length() > 0);
        return true;
    }
}
