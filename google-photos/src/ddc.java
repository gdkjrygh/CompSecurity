// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class ddc
{

    private static final String a = ddc.getSimpleName();
    private boolean b;
    private final String c;
    private final Class d;

    public ddc(Class class1, String s)
    {
        b = false;
        d = (Class)b.a(class1, "protoClass", null);
        c = (String)b.a(s, "filename", null);
    }

    public final void a(Context context)
    {
        if (!b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        File file;
        int i;
        b = true;
        file = new File(context.getFilesDir(), c);
        i = (int)file.length();
        if (i == 0) goto _L1; else goto _L3
_L3:
        Object obj;
        Object obj1;
        byte abyte0[];
        abyte0 = new byte[i];
        obj1 = null;
        obj = null;
        context = context.openFileInput(c);
        obj = context;
        obj1 = context;
        int j = context.read(abyte0);
        if (j != i)
        {
            b.a(context);
            return;
        }
        b.a(context);
        context = qlo.a(abyte0, 0, abyte0.length);
        IOException ioexception1;
        String s1;
        try
        {
            obj = (qlw)d.newInstance();
            context.a(((qlw) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        catch (IOException ioexception)
        {
            String s = a;
            context = String.valueOf(file.getAbsolutePath());
            if (context.length() != 0)
            {
                context = "failed to parse proto from ".concat(context);
            } else
            {
                context = new String("failed to parse proto from ");
            }
            Log.e(s, context, ioexception);
            return;
        }
        b(((qlw) (obj)));
        return;
        ioexception1;
        obj1 = obj;
        s1 = a;
        obj1 = obj;
        context = String.valueOf(file.getAbsolutePath());
        obj1 = obj;
        if (context.length() == 0) goto _L5; else goto _L4
_L4:
        obj1 = obj;
        context = "failed to load proto from ".concat(context);
_L7:
        obj1 = obj;
        Log.e(s1, context, ioexception1);
        b.a(((java.io.Closeable) (obj)));
        return;
_L5:
        obj1 = obj;
        context = new String("failed to load proto from ");
        if (true) goto _L7; else goto _L6
_L6:
        context;
        b.a(((java.io.Closeable) (obj1)));
        throw context;
    }

    public abstract void a(qlw qlw1);

    public final void b(Context context)
    {
        File file = new File(context.getFilesDir(), c);
        Context context1;
        Context context2;
        qlw qlw1;
        IOException ioexception;
        byte abyte0[];
        String s;
        qlp qlp1;
        try
        {
            qlw1 = (qlw)d.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        a(qlw1);
        abyte0 = new byte[qlp.b(qlw1)];
        qlp1 = qlp.a(abyte0, 0, abyte0.length);
        context2 = null;
        context1 = null;
        context = context.openFileOutput(c, 0);
        context1 = context;
        context2 = context;
        qlp1.a(qlw1);
        context1 = context;
        context2 = context;
        context.write(abyte0);
        b.a(context);
        return;
        ioexception;
        context2 = context1;
        s = a;
        context2 = context1;
        context = String.valueOf(file.getAbsolutePath());
        context2 = context1;
        if (context.length() == 0) goto _L2; else goto _L1
_L1:
        context2 = context1;
        context = "failed to save proto to ".concat(context);
_L4:
        context2 = context1;
        Log.e(s, context, ioexception);
        b.a(context1);
        return;
_L2:
        context2 = context1;
        context = new String("failed to save proto to ");
        if (true) goto _L4; else goto _L3
_L3:
        context;
        b.a(context2);
        throw context;
    }

    public abstract void b(qlw qlw1);

}
