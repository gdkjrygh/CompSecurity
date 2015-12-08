// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.skylib;

import android.content.Context;
import com.skype.Setup;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

// Referenced classes of package com.skype.android.skylib:
//            GISetup

public class PropertiesFileSetup
    implements GISetup
{

    public PropertiesFileSetup()
    {
    }

    private static Properties a(Context context)
        throws IOException
    {
        Properties properties;
        properties = new Properties();
        Object obj = null;
        File file = new File(context.getExternalFilesDir(null), "skylib.properties");
        context = obj;
        if (file.exists())
        {
            context = new FileInputStream(file);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        properties.load(context);
        context.close();
        return properties;
        Exception exception;
        exception;
        context.close();
        throw exception;
    }

    public final void a(Context context, Setup setup, GISetup.Scope scope)
    {
        Iterator iterator;
        context = a(context);
        iterator = context.keySet().iterator();
_L1:
        Object obj;
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_144;
            }
            obj = iterator.next();
        } while (scope == GISetup.Scope.a && !obj.toString().startsWith("*") || scope == GISetup.Scope.b && obj.toString().startsWith("*"));
        obj1 = context.get(obj);
        try
        {
            int i = Integer.parseInt(obj1.toString());
            setup.setInt(obj.toString(), i);
        }
        catch (NumberFormatException numberformatexception)
        {
            try
            {
                setup.setStr(obj.toString(), obj1.toString());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                throw new RuntimeException(context);
            }
        }
          goto _L1
    }
}
