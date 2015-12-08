// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.net.Uri;
import android.util.Log;
import android.util.LruCache;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public final class csv extends LruCache
{

    public final csp a;
    private cst b;

    public csv(cst cst1, csp csp1)
    {
        b = cst1;
        super(100);
        a = csp1;
    }

    private cnx a(cqa cqa1)
    {
        Object obj;
        Object obj1;
        cqa cqa2;
        if (!ddy.j.a() || cqa1.a())
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj = b.d();
        obj1 = cqa1.e;
        cqa2 = ((cse) (obj)).a(((cqc) (obj1)));
        if (cqa2 != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        long l;
        try
        {
            obj = cse.a;
            obj1 = String.valueOf(obj1);
            Log.w(((String) (obj)), (new StringBuilder(String.valueOf(obj1).length() + 34)).append("Failed to get soundtrack for id = ").append(((String) (obj1))).toString());
        }
        catch (IOException ioexception)
        {
            String s = cst.e();
            cqa1 = String.valueOf(cqa1);
            Log.w(s, (new StringBuilder(String.valueOf(cqa1).length() + 36)).append("Could not fetch beat info for track ").append(cqa1).toString(), ioexception);
            return null;
        }
        catch (csy csy1)
        {
            String s1 = cst.e();
            cqa1 = String.valueOf(cqa1);
            Log.e(s1, (new StringBuilder(String.valueOf(cqa1).length() + 23)).append("Bad protobuf for track ").append(cqa1).toString(), csy1);
            return null;
        }
        obj = null;
        c.a(obj, "localDetailTrack", null);
        return ((cnx) (obj));
        obj1 = ContentUris.withAppendedId(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, cqa2.f);
        obj = ((cse) (obj)).c.a(cqa2, ((Uri) (obj1)));
        break MISSING_BLOCK_LABEL_86;
        obj = a;
        obj1 = cst.a(b);
        l = cqa1.e.b;
        obj = ((csp) (obj)).a(cqa1, Uri.withAppendedPath(Uri.fromFile(((csj) (obj1)).a), Long.toHexString(l)));
        return ((cnx) (obj));
    }

    protected final Object create(Object obj)
    {
        return a((cqa)obj);
    }

    protected final void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        boolean flag1;
        obj1 = (cqa)obj;
        if (Log.isLoggable(cst.e(), 3))
        {
            cvn cvn1;
            File file;
            boolean flag2;
            if (flag)
            {
                obj = "evicting";
            } else
            {
                obj = "removing";
            }
            cst.e();
            obj2 = String.valueOf(((cqa) (obj1)).e);
            (new StringBuilder(String.valueOf(obj).length() + 13 + String.valueOf(obj2).length())).append(((String) (obj))).append(" cache item: ").append(((String) (obj2)));
        }
        obj2 = a;
        obj = ((csp) (obj2)).d;
        obj;
        JVM INSTR monitorenter ;
        cvn1 = (cvn)((csp) (obj2)).c.remove(((cqa) (obj1)).e);
        file = new File(((csp) (obj2)).b, ((cqa) (obj1)).e.a());
        flag2 = file.exists();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        flag = file.delete();
_L3:
        if (!((csp) (obj2)).a.a()) goto _L2; else goto _L1
_L1:
        if (cvn1 != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        noy.a("removedFromCache", Boolean.valueOf(flag1));
        noy.a("onDisk", Boolean.valueOf(flag2));
        noy.a("deleted", Boolean.valueOf(flag));
        noy.a("track", ((cqa) (obj1)).b);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        flag = false;
          goto _L3
    }
}
