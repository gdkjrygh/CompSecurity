// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.HandlerThread;
import android.os.Message;
import com.adjust.sdk.ActivityPackage;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;

public final class adb extends HandlerThread
    implements acv
{

    private adc a;
    private acu b;
    private act c;

    public adb(acu acu1)
    {
        super("Adjust", 1);
        setDaemon(true);
        start();
        c = acl.a();
        a = new adc(getLooper(), this);
        b = acu1;
    }

    private static String a(String s, Throwable throwable)
    {
        if (throwable != null)
        {
            return String.format(Locale.US, "%s: %s", new Object[] {
                s, throwable
            });
        } else
        {
            return String.format(Locale.US, "%s", new Object[] {
                s
            });
        }
    }

    static void a(adb adb1, ActivityPackage activitypackage)
    {
        Object obj2 = (new StringBuilder("https://app.adjust.com")).append(activitypackage.path).toString();
        Object obj;
        Object obj1 = activitypackage.clientSdk;
        obj = activitypackage.parameters;
        obj2 = acl.a(new URL(((String) (obj2))));
        ((HttpsURLConnection) (obj2)).setRequestProperty("Client-SDK", ((String) (obj1)));
        ((HttpsURLConnection) (obj2)).setConnectTimeout(60000);
        ((HttpsURLConnection) (obj2)).setReadTimeout(60000);
        ((HttpsURLConnection) (obj2)).setRequestMethod("POST");
        ((HttpsURLConnection) (obj2)).setUseCaches(false);
        ((HttpsURLConnection) (obj2)).setDoInput(true);
        ((HttpsURLConnection) (obj2)).setDoOutput(true);
        obj1 = new DataOutputStream(((HttpsURLConnection) (obj2)).getOutputStream());
        ((DataOutputStream) (obj1)).writeBytes(adf.a(((java.util.Map) (obj))));
        ((DataOutputStream) (obj1)).flush();
        ((DataOutputStream) (obj1)).close();
        obj = adf.a(((HttpsURLConnection) (obj2)));
        if (obj == null)
        {
            try
            {
                adb1.b.c();
                return;
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                adb1.b(activitypackage, "Failed to encode parameters", unsupportedencodingexception);
                return;
            }
            catch (SocketTimeoutException sockettimeoutexception)
            {
                adb1.a(activitypackage, "Request timed out", ((Throwable) (sockettimeoutexception)));
                return;
            }
            catch (IOException ioexception)
            {
                adb1.a(activitypackage, "Request failed", ((Throwable) (ioexception)));
                return;
            }
            catch (Throwable throwable)
            {
                adb1.b(activitypackage, "Runtime exception", throwable);
            }
            break MISSING_BLOCK_LABEL_200;
        }
        adb1.b.a(((org.json.JSONObject) (obj)));
        adb1.b.b();
        return;
    }

    private void a(ActivityPackage activitypackage, String s, Throwable throwable)
    {
        activitypackage = activitypackage.a();
        s = a(s, throwable);
        c.e("%s. (%s) Will retry later", new Object[] {
            activitypackage, s
        });
        b.c();
    }

    private void b(ActivityPackage activitypackage, String s, Throwable throwable)
    {
        activitypackage = activitypackage.a();
        s = a(s, throwable);
        c.e("%s. (%s)", new Object[] {
            activitypackage, s
        });
        b.b();
    }

    public final void a(ActivityPackage activitypackage)
    {
        Message message = Message.obtain();
        message.arg1 = 0x11ad0;
        message.obj = activitypackage;
        a.sendMessage(message);
    }
}
