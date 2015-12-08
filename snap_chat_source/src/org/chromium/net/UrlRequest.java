// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

// Referenced classes of package org.chromium.net:
//            UploadDataProvider, CronetEngine, UrlRequestListener

public interface UrlRequest
{
    public static final class Builder
    {

        public String a;
        public final ArrayList b = new ArrayList();
        public UploadDataProvider c;
        public Executor d;
        private CronetEngine e;
        private String f;
        private UrlRequestListener g;
        private Executor h;
        private int i;

        public final UrlRequest a()
        {
            UrlRequest urlrequest = e.a(f, g, h, i);
            if (a != null)
            {
                urlrequest.a(a);
            }
            Pair pair;
            for (Iterator iterator = b.iterator(); iterator.hasNext(); urlrequest.a((String)pair.first, (String)pair.second))
            {
                pair = (Pair)iterator.next();
            }

            if (c != null)
            {
                urlrequest.a(c, d);
            }
            return urlrequest;
        }

        public Builder(String s, UrlRequestListener urlrequestlistener, Executor executor, CronetEngine cronetengine)
        {
            i = 3;
            if (s == null)
            {
                throw new NullPointerException("URL is required.");
            }
            if (executor == null)
            {
                throw new NullPointerException("Executor is required.");
            }
            if (cronetengine == null)
            {
                throw new NullPointerException("CronetEngine is required.");
            } else
            {
                f = s;
                g = urlrequestlistener;
                h = executor;
                e = cronetengine;
                return;
            }
        }
    }

    public static class Status
    {

        private static boolean a;

        static int a(int i)
        {
            if (!a && (i < 0 || i > 15))
            {
                throw new AssertionError();
            }
            switch (i)
            {
            case 5: // '\005'
            default:
                throw new IllegalArgumentException("No request status found.");

            case 0: // '\0'
                return 0;

            case 1: // '\001'
                return 1;

            case 2: // '\002'
                return 2;

            case 3: // '\003'
                return 3;

            case 4: // '\004'
                return 4;

            case 6: // '\006'
                return 5;

            case 7: // '\007'
                return 6;

            case 8: // '\b'
                return 7;

            case 9: // '\t'
                return 8;

            case 10: // '\n'
                return 9;

            case 11: // '\013'
                return 10;

            case 12: // '\f'
                return 11;

            case 13: // '\r'
                return 12;

            case 14: // '\016'
                return 13;

            case 15: // '\017'
                return 14;
            }
        }

        static 
        {
            boolean flag;
            if (!org/chromium/net/UrlRequest.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

        private Status()
        {
        }
    }

    public static abstract class StatusListener
    {

        public StatusListener()
        {
        }
    }


    public abstract void a();

    public abstract void a(String s);

    public abstract void a(String s, String s1);

    public abstract void a(ByteBuffer bytebuffer);

    public abstract void a(UploadDataProvider uploaddataprovider, Executor executor);

    public abstract void b();

    public abstract void c();
}
