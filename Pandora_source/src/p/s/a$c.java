// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.s;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import p.q.b;

// Referenced classes of package p.s:
//            a

class c
    implements p.u.g.Object
{

    final a a;
    private final b b;
    private final Object c;

    public boolean a(File file)
    {
        File file1;
        File file2;
        boolean flag1;
        flag1 = false;
        file2 = null;
        file1 = null;
        file = p.s.a.a(a).a(file);
        file1 = file;
        file2 = file;
        boolean flag = b.a(c, file);
        flag1 = flag;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return flag;
            }
            flag1 = flag;
        }
        return flag1;
        file;
        file2 = file1;
        if (!Log.isLoggable("DecodeJob", 3))
        {
            continue; /* Loop/switch isn't completed */
        }
        file2 = file1;
        Log.d("DecodeJob", "Failed to find file to write to disk cache", file);
        if (file1 == null) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_85;
_L2:
        break MISSING_BLOCK_LABEL_55;
        try
        {
            file1.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        return false;
        file;
        if (file2 != null)
        {
            try
            {
                file2.close();
            }
            catch (IOException ioexception) { }
        }
        throw file;
    }

    public g.Object(a a1, b b1, Object obj)
    {
        a = a1;
        super();
        b = b1;
        c = obj;
    }
}
