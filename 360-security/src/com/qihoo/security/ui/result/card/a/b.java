// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.card.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.common.utils.IniProperties;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

public class b extends IniProperties
{

    public static b a = null;
    private String b;
    private Context c;

    public b()
    {
        Object obj;
        obj = null;
        super();
        b = null;
        c = null;
        c = SecurityApplication.a();
        InputStream inputstream = c.getAssets().open("card_cfg.ini");
        obj = inputstream;
_L2:
        Object obj1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        try
        {
            load(((InputStream) (obj)));
        }
        catch (IOException ioexception)
        {
            try
            {
                ((InputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        }
        finally { }
        ((InputStream) (obj)).close();
        return;
        Exception exception;
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (Exception exception1) { }
        throw obj1;
        exception;
        return;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static b a()
    {
        com/qihoo/security/ui/result/card/a/b;
        JVM INSTR monitorenter ;
        b b1;
        if (a == null)
        {
            a = new b();
        }
        b1 = a;
        com/qihoo/security/ui/result/card/a/b;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    public HashMap a(String s)
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = sections();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (!TextUtils.equals(s1, s))
            {
                continue;
            }
            s = properties(s);
            do
            {
                if (!s.hasNext())
                {
                    break;
                }
                String s2 = (String)s.next();
                String s3 = getProperty(s1, s2);
                if (!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3))
                {
                    hashmap.put(s2, s3);
                }
            } while (true);
            break;
        } while (true);
        return hashmap;
    }

}
