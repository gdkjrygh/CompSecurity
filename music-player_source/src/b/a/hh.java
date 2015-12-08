// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package b.a:
//            a, fj, ff

public final class hh extends a
{

    private static final Pattern a = Pattern.compile("UTDID\">([^<]+)");
    private Context b;

    public hh(Context context)
    {
        super("utdid");
        b = context;
    }

    private String h()
    {
        Object obj;
        obj = i();
        if (obj == null || !((File) (obj)).exists())
        {
            return null;
        }
        FileInputStream fileinputstream = new FileInputStream(((File) (obj)));
        obj = fj.a(fileinputstream);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = a.matcher(((CharSequence) (obj)));
        if (!((Matcher) (obj)).find()) goto _L2; else goto _L3
_L3:
        obj = ((Matcher) (obj)).group(1);
_L5:
        fj.c(fileinputstream);
        return ((String) (obj));
        obj;
        try
        {
            fj.c(fileinputstream);
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
        }
        return null;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private File i()
    {
        while (!ff.a(b, "android.permission.WRITE_EXTERNAL_STORAGE") || !Environment.getExternalStorageState().equals("mounted")) 
        {
            return null;
        }
        File file = Environment.getExternalStorageDirectory();
        try
        {
            file = new File(file.getCanonicalPath(), ".UTSystemConfig/Global/Alvin2.xml");
        }
        catch (Exception exception)
        {
            return null;
        }
        return file;
    }

    public final String g()
    {
        return h();
    }

}
