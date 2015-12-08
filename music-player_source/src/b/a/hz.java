// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import com.b.a.w;
import java.io.File;
import java.io.FileInputStream;

// Referenced classes of package b.a:
//            hy, b, fj, hv

final class hz
    implements w
{

    final hy a;

    hz(hy hy1)
    {
        a = hy1;
        super();
    }

    public final void a()
    {
        hy.b(a).b();
    }

    public final boolean a(File file)
    {
        FileInputStream fileinputstream = new FileInputStream(file);
        file = fj.b(fileinputstream);
        int i;
        try
        {
            fj.c(fileinputstream);
            file = hy.a(a).a(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        if (file != null) goto _L2; else goto _L1
_L1:
        i = 1;
_L3:
        if (i != 2)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (hy.b(a).d())
        {
            hy.b(a).c();
        }
        break MISSING_BLOCK_LABEL_64;
_L4:
        fj.c(fileinputstream);
        throw file;
_L2:
        i = hy.a(a, file);
          goto _L3
        if (hy.c(a))
        {
            return true;
        }
        return i != 1;
        file;
          goto _L4
        file;
        fileinputstream = null;
          goto _L4
    }
}
