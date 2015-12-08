// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

public final class dkw
{

    public static final dmm a = new dmm("client_id", "cdee0485c0b143de91bb71a853594f9a");
    public static final dmm b = new dmm("grant_type", "http://spotify.com/oauth2/device/1");
    public static final dmm c = new dmm("scope", "user-read-private user-read-email streaming");
    public static final String d;
    private static final gip e = gip.a("arsenal-environment");
    private static final gip f = gip.a("arsenal-linking-url");
    private static final gip g = gip.a("arsenal-spotify-username");
    private static final gip h = gip.a("arsenal-spotify-display-name");
    private static final gip i = gip.a("arsenal-sony-username");

    public static String a(Context context)
    {
        return ((giq)dmz.a(giq)).a(context).a(e, "");
    }

    public static String a(Context context, boolean flag)
    {
label0:
        {
            context = ((giq)dmz.a(giq)).a(context);
            Object obj = f;
            obj = (String)ctz.a(((gin) (context)).a.getString(((gip) (obj)).a, "https://sn.api.np.km.playstation.net/socialnetwork/api/v1/sp"));
            if (!((String) (obj)).endsWith("sessionlink"))
            {
                context = ((Context) (obj));
                if (!((String) (obj)).endsWith("accountlink"))
                {
                    break label0;
                }
            }
            context = ((String) (obj)).substring(0, ((String) (obj)).lastIndexOf('/'));
        }
        if (context.endsWith("/"))
        {
            context = context.substring(0, context.lastIndexOf('/'));
        }
        String s;
        if (flag)
        {
            s = "sessionlink";
        } else
        {
            s = "accountlink";
        }
        return Uri.parse(context).buildUpon().appendPath(s).build().toString();
    }

    public static void a(Context context, String s)
    {
        ((giq)dmz.a(giq)).a(context).b().a(i, s).b();
    }

    public static void a(Context context, String s, String s1)
    {
        context = ((giq)dmz.a(giq)).a(context).b().a(e, s);
        s = f;
        ctz.a(s);
        ctz.a(s1);
        ((gio) (context)).a.putString(((gip) (s)).a, s1);
        context.b();
    }

    public static String b(Context context)
    {
        return ((giq)dmz.a(giq)).a(context).a(h, "");
    }

    public static void b(Context context, String s, String s1)
    {
        ((giq)dmz.a(giq)).a(context).b().a(g, s).a(h, s1).b();
    }

    public static String c(Context context)
    {
        return ((giq)dmz.a(giq)).a(context).a(i, "");
    }

    static 
    {
        d = gej.a;
    }
}
