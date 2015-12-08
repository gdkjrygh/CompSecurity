// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLContextSpi;

// Referenced classes of package crittercism.android:
//            z, dx, e, d

public final class y extends java.security.Provider.Service
{

    public static final String a[] = {
        "Default", "SSL", "TLSv1.1", "TLSv1.2", "SSLv3", "TLSv1", "TLS"
    };
    private e b;
    private d c;
    private java.security.Provider.Service d;

    private y(java.security.Provider.Service service, e e, d d1)
    {
        super(service.getProvider(), service.getType(), service.getAlgorithm(), service.getClassName(), null, null);
        b = e;
        c = d1;
        d = service;
    }

    private static y a(java.security.Provider.Service service, e e, d d1)
    {
        d1 = new y(service, e, d1);
        Field afield[] = java/security/Provider$Service.getFields();
        int i = 0;
_L2:
        e = d1;
        if (i >= afield.length)
        {
            break; /* Loop/switch isn't completed */
        }
        afield[i].setAccessible(true);
        afield[i].set(d1, afield[i].get(service));
        i++;
        if (true) goto _L2; else goto _L1
        service;
        e = null;
_L1:
        return e;
    }

    private static Provider a()
    {
        Provider provider = null;
        SSLContext sslcontext;
        try
        {
            sslcontext = SSLContext.getInstance("TLS");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            return null;
        }
        if (sslcontext != null)
        {
            provider = sslcontext.getProvider();
        }
        return provider;
    }

    public static boolean a(e e, d d1)
    {
        int i = 0;
        Provider provider;
        if (z.a())
        {
            if ((provider = a()) != null)
            {
                boolean flag;
                boolean flag1;
                for (flag = false; i < a.length; flag = flag1)
                {
                    Object obj = provider.getService("SSLContext", a[i]);
                    flag1 = flag;
                    if (obj != null)
                    {
                        flag1 = flag;
                        if (!(obj instanceof y))
                        {
                            obj = a(((java.security.Provider.Service) (obj)), e, d1);
                            flag1 = flag;
                            if (obj != null)
                            {
                                flag1 = flag | ((y) (obj)).b();
                            }
                        }
                    }
                    i++;
                }

                return flag;
            }
        }
        return false;
    }

    private boolean b()
    {
        Provider provider = getProvider();
        if (provider == null)
        {
            return false;
        }
        try
        {
            Method method = java/security/Provider.getDeclaredMethod("putService", new Class[] {
                java/security/Provider$Service
            });
            method.setAccessible(true);
            method.invoke(provider, new Object[] {
                this
            });
            provider.put("SSLContext.DummySSLAlgorithm", getClassName());
            provider.remove((new StringBuilder()).append(getType()).append(".").append(getAlgorithm()).toString());
            provider.remove("SSLContext.DummySSLAlgorithm");
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public final Object newInstance(Object obj)
    {
label0:
        {
            Object obj1 = super.newInstance(obj);
            obj = obj1;
            z z1;
            try
            {
                if (!(obj1 instanceof SSLContextSpi))
                {
                    break label0;
                }
                z1 = z.a((SSLContextSpi)obj1, b, c);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                dx.a(((Throwable) (obj)));
                return obj1;
            }
            obj = obj1;
            if (z1 != null)
            {
                obj = z1;
            }
        }
        return obj;
    }

}
