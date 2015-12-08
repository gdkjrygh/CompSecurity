// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.data.h;
import com.pandora.android.provider.b;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class ae extends d
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/cm/ae$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("AUTH_DISCONNECT", 0);
            b = new a("AUTH_SUCCESS", 1);
            c = new a("AUTH_FAILED", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private PandoraIntent a;

    public ae()
    {
    }

    public void a(Void void1)
    {
        if (a != null)
        {
            b.a.C().a(a);
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        Object obj;
        if (aobj.length == 0)
        {
            return null;
        }
        a = new PandoraIntent("cmd_send_facebook_user_data_result");
        aobj = (a)aobj[0];
        a.putExtra("intent_reason", ((a) (aobj)).toString());
        obj = b.a.b().e();
        Object obj1 = p.bx.d.a();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[p.cm.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cm.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cm.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.cm._cls1.a[((a) (aobj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 405
    //                   1 191
    //                   2 229
    //                   3 317;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_317;
_L5:
        a.putExtra("intent_success", true);
        return null;
_L2:
        try
        {
            p.df.a.a("SendFacebookUserCredentialsTask", (new StringBuilder()).append("SendFacebookUserCredentialsTask : ").append(p.cm.a.a).append(" --> PublicApi.sendDisconnectFacebook()").toString());
            ((x) (obj)).s();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            p.df.a.c("SendFacebookUserCredentialsTask", (new StringBuilder()).append("SendFacebookUserCredentialsTask : ").append(((Object) (aobj))).append(" ==> FAILED, PublicApiException : ").append(((y) (obj)).getLocalizedMessage()).append(", Error Code : ").append(((y) (obj)).a()).toString());
            a.putExtra("intent_success", false);
            a.putExtra("intent_message", ((y) (obj)).getLocalizedMessage());
            a.putExtra("intent_api_error_code", ((y) (obj)).a());
            return null;
        }
          goto _L5
_L3:
        obj1 = ((p.bx.b) (obj1)).b();
        p.df.a.a("SendFacebookUserCredentialsTask", (new StringBuilder()).append("SendFacebookUserCredentialsTask : ").append(p.cm.a.b).append(" --> PublicApi.sendAuthorizeFacebook(").append(((h) (obj1)).h()).append(", ").append(((h) (obj1)).f()).append(")").toString());
        ((x) (obj)).a(((h) (obj1)).h(), ((h) (obj1)).f(), ((h) (obj1)).c(), Long.valueOf(((h) (obj1)).e()));
          goto _L5
        obj1 = ((p.bx.b) (obj1)).b();
        p.df.a.a("SendFacebookUserCredentialsTask", (new StringBuilder()).append("SendFacebookUserCredentialsTask : ").append(p.cm.a.c).append(" --> PublicApi.sendFacebookAuthFailed(").append(((h) (obj1)).h()).append(", ").append(((h) (obj1)).f()).append(")").toString());
        ((x) (obj)).b(((h) (obj1)).h(), ((h) (obj1)).f(), ((h) (obj1)).c(), Long.valueOf(((h) (obj1)).e()));
          goto _L5
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
