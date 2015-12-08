// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            gi, gs

public class go
{
    public static interface a
    {

        public abstract Object b(InputStream inputstream);

        public abstract Object cJ();
    }


    public static final a wy = new a() {

        public Object b(InputStream inputstream)
        {
            return c(inputstream);
        }

        public Void c(InputStream inputstream)
        {
            return null;
        }

        public Object cJ()
        {
            return dq();
        }

        public Void dq()
        {
            return null;
        }

    };

    public go()
    {
    }

    public Future a(String s, a a1)
    {
        return gi.submit(new Callable(s, a1) {

            final a wA;
            final go wB;
            final String wz;

            public Object call()
            {
                Object obj;
                Object obj2;
                Object obj4;
                obj4 = null;
                obj = null;
                obj2 = null;
                Object obj1 = (HttpURLConnection)(new URL(wz)).openConnection();
                int i;
                ((HttpURLConnection) (obj1)).connect();
                i = ((HttpURLConnection) (obj1)).getResponseCode();
                if (i < 200 || i > 299)
                {
                    break MISSING_BLOCK_LABEL_75;
                }
                obj = wA.b(((HttpURLConnection) (obj1)).getInputStream());
                if (obj1 != null)
                {
                    ((HttpURLConnection) (obj1)).disconnect();
                }
                return obj;
                if (obj1 != null)
                {
                    ((HttpURLConnection) (obj1)).disconnect();
                }
_L1:
                return wA.cJ();
                obj;
                obj1 = obj2;
                obj2 = obj;
_L5:
                obj = obj1;
                gs.d("Error making HTTP request.", ((Throwable) (obj2)));
                if (obj1 != null)
                {
                    ((HttpURLConnection) (obj1)).disconnect();
                }
                  goto _L1
                Object obj3;
                obj3;
                obj1 = obj4;
_L4:
                obj = obj1;
                gs.d("Error making HTTP request.", ((Throwable) (obj3)));
                if (obj1 != null)
                {
                    ((HttpURLConnection) (obj1)).disconnect();
                }
                  goto _L1
                obj3;
                obj1 = obj;
                obj = obj3;
_L3:
                if (obj1 != null)
                {
                    ((HttpURLConnection) (obj1)).disconnect();
                }
                throw obj;
                obj;
                if (true) goto _L3; else goto _L2
_L2:
                obj3;
                  goto _L4
                obj3;
                  goto _L5
            }

            
            {
                wB = go.this;
                wz = s;
                wA = a1;
                super();
            }
        });
    }

}
