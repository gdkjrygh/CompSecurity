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
//            gh, gr

public class gn
{
    public static interface a
    {

        public abstract Object b(InputStream inputstream);

        public abstract Object cQ();
    }


    public static final a wN = new a() {

        public Object b(InputStream inputstream)
        {
            return c(inputstream);
        }

        public Void c(InputStream inputstream)
        {
            return null;
        }

        public Object cQ()
        {
            return dz();
        }

        public Void dz()
        {
            return null;
        }

    };

    public gn()
    {
    }

    public Future a(String s, a a1)
    {
        return gh.submit(new Callable(s, a1) {

            final String wO;
            final a wP;
            final gn wQ;

            public Object call()
            {
                Object obj;
                Object obj2;
                Object obj4;
                obj4 = null;
                obj = null;
                obj2 = null;
                Object obj1 = (HttpURLConnection)(new URL(wO)).openConnection();
                int i;
                ((HttpURLConnection) (obj1)).connect();
                i = ((HttpURLConnection) (obj1)).getResponseCode();
                if (i < 200 || i > 299)
                {
                    break MISSING_BLOCK_LABEL_75;
                }
                obj = wP.b(((HttpURLConnection) (obj1)).getInputStream());
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
                return wP.cQ();
                obj;
                obj1 = obj2;
                obj2 = obj;
_L5:
                obj = obj1;
                gr.d("Error making HTTP request.", ((Throwable) (obj2)));
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
                gr.d("Error making HTTP request.", ((Throwable) (obj3)));
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
                wQ = gn.this;
                wO = s;
                wP = a1;
                super();
            }
        });
    }

}
