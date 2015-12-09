// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.o;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.validators.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.message.BasicHeader;

// Referenced classes of package com.fitbit.serverinteraction:
//            ServerGateway, j, k

public final class l
{

    private static final String a = "Last-Modified";
    private static final String b = "If-Modified-Since";
    private static final long c = 0xf731400L;

    public l()
    {
    }

    private k a(String s, String s1, List list)
        throws ServerCommunicationException, IOException
    {
        RequestParametersBuilder.a a1 = new RequestParametersBuilder.a();
        a1.f(false);
        a1.a(e(s));
        a1.a(com.fitbit.serverinteraction.ServerGateway.HttpMethods.a);
        a1.a(f.c());
        a1.a(com.fitbit.serverinteraction.b.f.d());
        if (list == null)
        {
            list = new ArrayList();
        } else
        {
            list = new ArrayList(list);
        }
        if (s1 != null && o.a().c(s))
        {
            list.add(new BasicHeader("If-Modified-Since", s1));
        }
        a1.a(list);
        return com.fitbit.serverinteraction.ServerGateway.a().b(a1.a());
    }

    private static boolean b(String s)
    {
        long l1 = com.fitbit.data.repo.l.a().d(s);
        if (l1 > 0L && System.currentTimeMillis() - l1 < 0xf731400L)
        {
            com.fitbit.e.a.a("FitbitPicasso", "(NETWORK): Skip network request. Image is recently modified: %s", new Object[] {
                s
            });
            return true;
        } else
        {
            return false;
        }
    }

    private static void c(String s)
    {
        com.fitbit.data.repo.l.a().e(s);
    }

    private static List d(String s)
    {
        s = s.split("###");
        if (s.length >= 2)
        {
            return Collections.singletonList(new BasicHeader("Authorization", s[1]));
        } else
        {
            return Collections.emptyList();
        }
    }

    private static String e(String s)
    {
        String as[] = s.split("###");
        if (as.length >= 2)
        {
            s = as[0];
        }
        return s;
    }

    public Bitmap a(String s)
        throws ServerCommunicationException, IOException
    {
        return a(s, d(s));
    }

    public Bitmap a(String s, List list)
        throws ServerCommunicationException, IOException
    {
        if (b(s))
        {
            return null;
        }
        list = (j)a(s, com.fitbit.savedstate.o.a(s), list);
        if (list.a() == 304)
        {
            com.fitbit.e.a.a("FitbitPicasso", "(NETWORK): Image NOT modified on server: %s", new Object[] {
                s
            });
            c(s);
            return null;
        }
        byte abyte0[] = (byte[])list.f();
        if (abyte0 != null)
        {
            Bitmap bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
            if (bitmap != null)
            {
                com.fitbit.data.repo.l.a().a(s, abyte0);
                com.fitbit.savedstate.o.a(s, list.b("Last-Modified"));
                return bitmap;
            }
        }
        return null;
    }
}
