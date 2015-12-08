// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;

public class edp
    implements dmx
{

    public edp()
    {
    }

    public static void a(Context context, Uri uri)
    {
        try
        {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Assertion.b((new StringBuilder("Could not open ad URI: ")).append(uri).toString());
        }
    }

    public static void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            s = ((dmj)dmz.a(dmj)).a(s);
            s.a("", null, new dmi(s) {

                private dme a;

                public final void a(int i, Object obj)
                {
                    obj = (String)obj;
                    if (!a.a(i))
                    {
                        Logger.c("Request failed: %s", new Object[] {
                            obj
                        });
                    }
                }

                public final void a(Throwable throwable, String s1)
                {
                    Logger.b(throwable, "request.failed: %s", new Object[] {
                        s1
                    });
                }

            
            {
                a = dme1;
                super();
            }
            });
            return;
        }
    }

    public static void b(Context context, Uri uri)
    {
        a(context, uri);
        dmz.a(fop);
        fop.b(context);
    }
}
