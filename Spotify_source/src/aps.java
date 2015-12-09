// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.FacebookException;
import com.facebook.widget.FacebookDialog;
import org.json.JSONException;
import org.json.JSONObject;

public class aps extends ash
{

    private static final String e = aps.getName();
    private boolean f;

    private aps(Context context, String s, String s1)
    {
        super(context, s);
        super.a = s1;
    }

    public static boolean a(Context context, String s, String s1, com.facebook.widget.FacebookDialog.PendingCall pendingcall, arx arx)
    {
        if (arp.a(s))
        {
            return false;
        } else
        {
            context = new aps(context, s, String.format("fb%s://bridge/", new Object[] {
                s1
            }));
            context.b = new asl(pendingcall, arx) {

                private com.facebook.widget.FacebookDialog.PendingCall a;
                private arx b;

                public final void a(Bundle bundle, FacebookException facebookexception)
                {
                    Intent intent = new Intent();
                    facebookexception = bundle;
                    if (bundle == null)
                    {
                        facebookexception = new Bundle();
                    }
                    intent.putExtras(facebookexception);
                    FacebookDialog.a(a, a.c, intent, b);
                }

            
            {
                a = pendingcall;
                b = arx;
                super();
            }
            };
            context.show();
            return true;
        }
    }

    static boolean a(aps aps1)
    {
        return ((ash) (aps1)).d;
    }

    static void b(aps aps1)
    {
        aps1.a();
    }

    protected final Bundle a(String s)
    {
        Bundle bundle = arp.c(Uri.parse(s).getQuery());
        s = bundle.getString("bridge_args");
        bundle.remove("bridge_args");
        String s1;
        if (!arp.a(s))
        {
            try
            {
                bundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", app.a(new JSONObject(s)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                arp.a(e, "Unable to parse bridge_args JSON", s);
            }
        }
        s1 = bundle.getString("method_results");
        bundle.remove("method_results");
        if (!arp.a(s1))
        {
            s = s1;
            if (arp.a(s1))
            {
                s = "{}";
            }
            try
            {
                bundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", app.a(new JSONObject(s)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                arp.a(e, "Unable to parse bridge_args JSON", s);
            }
        }
        bundle.remove("version");
        bundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", arc.a());
        return bundle;
    }

    public void dismiss()
    {
        WebView webview = super.c;
        if (super.d || webview == null || !webview.isShown())
        {
            super.dismiss();
        } else
        if (!f)
        {
            f = true;
            webview.loadUrl((new StringBuilder("javascript:")).append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();").toString());
            (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

                private aps a;

                public final void run()
                {
                    if (!aps.a(a))
                    {
                        aps.b(a);
                    }
                }

            
            {
                a = aps.this;
                super();
            }
            }, 1500L);
            return;
        }
    }

}
