// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.card.a;

import android.content.Context;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.common.utils.IniProperties;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.support.NativeManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class a extends IniProperties
{

    public static a a = null;
    private Context b;

    public a()
    {
        b = null;
        b = SecurityApplication.a();
        b();
    }

    public static a a()
    {
        com/qihoo/security/ui/result/card/a/a;
        JVM INSTR monitorenter ;
        a a1;
        if (a == null)
        {
            a = new a();
        }
        a1 = a;
        com/qihoo/security/ui/result/card/a/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public String a(String s, String s1)
    {
label0:
        {
            Object obj = sections();
            String s2;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                s2 = (String)((Iterator) (obj)).next();
            } while (!TextUtils.equals(s2, s));
            s = properties(s);
            String s3;
            do
            {
                do
                {
                    if (!s.hasNext())
                    {
                        break label0;
                    }
                    obj = (String)s.next();
                } while (!TextUtils.equals(((CharSequence) (obj)), s1));
                s3 = getProperty(s2, ((String) (obj)));
            } while (TextUtils.isEmpty(((CharSequence) (obj))) || TextUtils.isEmpty(s3));
            return s3;
        }
        return null;
    }

    public void b()
    {
        Object obj;
        Exception exception2;
        InputStream inputstream = Utils.openLatestInputFile(b, "adv_p.dat");
        obj = inputstream;
        if (inputstream != null)
        {
            obj = Utils.getDESDecryptInputStream(inputstream, NativeManager.a);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_37;
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
        throw exception2;
        exception;
    }

}
