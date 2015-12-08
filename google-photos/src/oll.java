// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class oll
    implements olv
{

    private static final int a = 7;
    private static final int b = 7;
    private final olv c[];

    public oll(Context context)
    {
        this(context, null);
    }

    public oll(Context context, Set set)
    {
        Object obj;
        Object obj1;
        HashSet hashset;
        obj1 = context.getPackageName();
        Iterator iterator;
        try
        {
            obj = context.getPackageManager().getApplicationInfo(((String) (obj1)), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf(String.format("Could not find application info for package: %s", new Object[] {
                obj1
            }), context);
            obj = null;
        }
        if (obj == null)
        {
            context = null;
        } else
        {
            context = ((ApplicationInfo) (obj)).metaData;
        }
        obj1 = new ArrayList();
        hashset = new HashSet();
        if (context == null) goto _L2; else goto _L1
_L1:
        iterator = ((ApplicationInfo) (obj)).metaData.keySet().iterator();
_L4:
        if (iterator.hasNext())
        {
            obj = (String)iterator.next();
            if (((String) (obj)).startsWith("MODULE."))
            {
                ((List) (obj1)).add(a(context.getString(((String) (obj)))));
            }
            if (((String) (obj)).startsWith("MODULE:"))
            {
                ((List) (obj1)).add(a(((String) (obj)).substring(a)));
            } else
            if (((String) (obj)).startsWith("module:"))
            {
                String s1 = ((String) (obj)).substring(b);
                hashset.add(s1);
                if (set == null || !set.contains(s1))
                {
                    String s = String.valueOf("gen_binder.");
                    String s2 = String.valueOf(s1.replace('.', '$'));
                    if (s2.length() != 0)
                    {
                        s = s.concat(s2);
                    } else
                    {
                        s = new String(s);
                    }
                    ((List) (obj1)).add(a(s));
                    if (set != null && Log.isLoggable("Binder", 5))
                    {
                        s = String.valueOf(s1);
                        if (s.length() != 0)
                        {
                            s = "***WARNING*** Root module does not include ".concat(s);
                        } else
                        {
                            s = new String("***WARNING*** Root module does not include ");
                        }
                        Log.w("Binder", s);
                    }
                }
            }
            continue; /* Loop/switch isn't completed */
        }
_L2:
        c = (olv[])((List) (obj1)).toArray(new olv[((List) (obj1)).size()]);
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static olv a(String s)
    {
        olv olv1;
        try
        {
            olv1 = (olv)Class.forName(s).newInstance();
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Failed to add stitch module ".concat(s);
            } else
            {
                s = new String("Failed to add stitch module ");
            }
            throw new RuntimeException(s, illegalaccessexception);
        }
        catch (InstantiationException instantiationexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Failed to add stitch module ".concat(s);
            } else
            {
                s = new String("Failed to add stitch module ");
            }
            throw new RuntimeException(s, instantiationexception);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Failed to add stitch module ".concat(s);
            } else
            {
                s = new String("Failed to add stitch module ");
            }
            throw new RuntimeException(s, classnotfoundexception);
        }
        return olv1;
    }

    public final void a(Context context, Class class1, olm olm)
    {
        for (int i = 0; i < c.length; i++)
        {
            c[i].a(context, class1, olm);
        }

    }

}
