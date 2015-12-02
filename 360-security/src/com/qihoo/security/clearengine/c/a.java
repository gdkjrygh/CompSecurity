// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.c;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class a
{

    private static final String a = com/qihoo/security/clearengine/c/a.getSimpleName();
    private Context b;

    public a(Context context)
    {
        b = context;
    }

    public List a()
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj1 = null;
        obj = new File(b.getFilesDir().getAbsolutePath(), "o_c_y_u");
        if (!((File) (obj)).exists())
        {
            return null;
        }
        arraylist = new ArrayList();
        obj = new BufferedReader(new FileReader(((File) (obj))), 1024);
_L1:
        boolean flag;
        obj1 = ((BufferedReader) (obj)).readLine();
        flag = TextUtils.isEmpty(((CharSequence) (obj1)));
label0:
        {
            {
                if (!flag)
                {
                    break label0;
                }
                try
                {
                    ((BufferedReader) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            return arraylist;
        }
        arraylist.add(obj1);
          goto _L1
        obj1;
_L5:
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        break MISSING_BLOCK_LABEL_78;
        obj1;
        obj = null;
_L3:
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj1;
        obj1;
        if (true) goto _L3; else goto _L2
_L2:
        Exception exception;
        exception;
        exception = ((Exception) (obj1));
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void b()
    {
        File file = new File(b.getFilesDir().getAbsolutePath(), "o_c_y_u");
        if (file.exists())
        {
            file.delete();
        }
    }

}
