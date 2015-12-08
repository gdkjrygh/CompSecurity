// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLContextSpi;

// Referenced classes of package b.a:
//            py, eu, gt, fg, 
//            da

public final class px extends java.security.Provider.Service
{

    public static final String a[] = {
        "Default", "SSL", "TLSv1.1", "TLSv1.2", "SSLv3", "TLSv1", "TLS"
    };
    private gt b;
    private fg c;
    private da d;
    private java.security.Provider.Service e;

    private px(java.security.Provider.Service service, gt gt, fg fg, da da)
    {
        super(service.getProvider(), service.getType(), service.getAlgorithm(), service.getClassName(), null, null);
        b = gt;
        c = fg;
        d = da;
        e = service;
    }

    private static px a(java.security.Provider.Service service, gt gt, fg fg, da da)
    {
        fg = new px(service, gt, fg, da);
        da = java/security/Provider$Service.getFields();
        int i = 0;
_L2:
        gt = fg;
        if (i >= da.length)
        {
            break; /* Loop/switch isn't completed */
        }
        da[i].setAccessible(true);
        da[i].set(fg, da[i].get(service));
        i++;
        if (true) goto _L2; else goto _L1
        service;
        gt = null;
_L1:
        return gt;
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

    public static boolean a(gt gt, fg fg, da da)
    {
        int i = 0;
        Provider provider;
        if (py.a())
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
                        if (!(obj instanceof px))
                        {
                            obj = a(((java.security.Provider.Service) (obj)), gt, fg, da);
                            flag1 = flag;
                            if (obj != null)
                            {
                                flag1 = flag | ((px) (obj)).b();
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
            py py1;
            try
            {
                if (!(obj1 instanceof SSLContextSpi))
                {
                    break label0;
                }
                py1 = py.a((SSLContextSpi)obj1, b, c, d);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                eu.a(((Throwable) (obj)));
                return obj1;
            }
            obj = obj1;
            if (py1 != null)
            {
                obj = py1;
            }
        }
        return obj;
    }

}
