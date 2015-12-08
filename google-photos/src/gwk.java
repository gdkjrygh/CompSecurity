// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;

public class gwk
{

    public final Context a;
    public final izo b;
    private final fkt c;
    private final ContentResolver d;
    private final gwl e;
    private Random f;

    gwk(Context context)
    {
        this(context, new gwl(), context.getContentResolver());
    }

    private gwk(Context context, gwl gwl1, ContentResolver contentresolver)
    {
        a = context;
        d = contentresolver;
        b = (izo)olm.a(context, izo);
        c = (fkt)olm.a(context, fkt);
        e = gwl1;
        f = new Random();
    }

    private File b(String s)
    {
        Object obj = new File(s);
        if (TextUtils.isEmpty(s))
        {
            throw new gwn("Failed to copy the image as local path is empty");
        }
        File file = new File(a.getFilesDir(), "shadowcopies");
        if (!file.exists() && !file.mkdirs())
        {
            s = String.valueOf(file.getPath());
            if (s.length() != 0)
            {
                s = "Failed to create ".concat(s);
            } else
            {
                s = new String("Failed to create ");
            }
            throw new gwn(s);
        }
        String s1 = String.valueOf("original_");
        String s2 = String.valueOf(UUID.randomUUID());
        obj = ((File) (obj)).getName();
        s = ((String) (obj));
        if (((String) (obj)).startsWith("original_"))
        {
            int i = ((String) (obj)).indexOf("_", 10);
            s = ((String) (obj));
            if (i >= 0)
            {
                s = ((String) (obj)).substring(i + 1, ((String) (obj)).length());
            }
        }
        s = String.valueOf(s);
        s = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s2).length() + String.valueOf(s).length())).append(s1).append(s2).append("_").append(s).toString();
        return new File(file.getPath(), s);
    }

    public Uri a(String s)
    {
        File file = b(s);
        boolean flag;
        try
        {
            flag = fkt.a(new File(s), file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Log.isLoggable("ShadowCopyManager", 6))
            {
                Log.e("ShadowCopyManager", "Failed to copy the image", s);
            }
            throw new gwn("Failed to copy the image", s);
        }
        if (!flag)
        {
            if (Log.isLoggable("ShadowCopyManager", 6))
            {
                Log.e("ShadowCopyManager", "Failed to copy the image");
            }
            throw new gwn("Failed to copy the image");
        } else
        {
            return Uri.fromFile(file);
        }
    }

    public final gwm a(Uri uri)
    {
        Object obj;
        Object obj2;
        Object obj1;
        Uri uri1;
        int i;
        if (oql.b(uri))
        {
            uri = b.a(uri);
        } else
        {
            uri = uri.getPath();
        }
        uri = new File(uri);
        uri1 = Uri.fromFile(b(uri.getPath()));
        obj = Uri.fromFile(uri);
        uri = String.valueOf(Long.valueOf(f.nextLong()).toString());
        if (uri.length() == 0) goto _L2; else goto _L1
_L1:
        uri = "clone tag: ".concat(uri);
_L5:
        obj1 = ((Uri) (obj)).getPath();
        obj2 = new mxm();
        ((mxm) (obj2)).a(((String) (obj1)));
        i = mxm.c;
        obj = ((mxm) (obj2)).a(i, ((mxm) (obj2)).f(i));
        if (obj != null) goto _L4; else goto _L3
_L3:
        ((mxm) (obj2)).a(((mxm) (obj2)).a(mxm.c, uri));
_L8:
        ((mxm) (obj2)).a(((String) (obj1)), uri1.getPath());
        obj = null;
        uri = null;
        obj1 = d.openInputStream(uri1);
        uri = ((Uri) (obj1));
        obj = obj1;
        obj2 = nkp.b(((java.io.InputStream) (obj1)));
        p.a(((java.io.Closeable) (obj1)));
        return new gwm(uri1, ((nkp) (obj2)).b());
_L2:
        int j;
        try
        {
            uri = new String("clone tag: ");
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new gwn("Failed to add noise to file", uri);
        }
          goto _L5
_L4:
        j = mxm.c;
        if (obj != null) goto _L7; else goto _L6
_L6:
        obj = "";
_L9:
        obj = String.valueOf(obj);
        uri = String.valueOf(uri);
        if (uri.length() == 0)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        uri = ((String) (obj)).concat(uri);
_L10:
        ((mxm) (obj2)).b(j, uri);
          goto _L8
_L7:
        obj = String.valueOf(((mxx) (obj)).f);
        obj = (new StringBuilder(String.valueOf(obj).length() + 1)).append(((String) (obj))).append("\n").toString();
          goto _L9
        uri = new String(((String) (obj)));
          goto _L10
        IOException ioexception;
        ioexception;
        obj = uri;
        throw new gwn("Failed to get media fingerprint", ioexception);
        uri;
        p.a(((java.io.Closeable) (obj)));
        throw uri;
          goto _L5
    }
}
