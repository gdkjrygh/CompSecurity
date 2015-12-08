// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.os.Looper;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;

// Referenced classes of package com.flurry.sdk:
//            do, el, fa, fb

public class df
{

    private static final String d = com/flurry/sdk/df.getSimpleName();
    String a;
    long b;
    int c;
    private File e;

    public df()
    {
        a = null;
        b = -1L;
        c = -1;
        e = null;
        a = UUID.randomUUID().toString();
        e = com.flurry.sdk.do.a().b().getFileStreamPath((new StringBuilder(".flurrydatasenderblock.")).append(a).toString());
    }

    public df(String s)
    {
        a = null;
        b = -1L;
        c = -1;
        e = null;
        a = s;
        e = com.flurry.sdk.do.a().b().getFileStreamPath((new StringBuilder(".flurrydatasenderblock.")).append(a).toString());
    }

    public String a()
    {
        return a;
    }

    public boolean a(byte abyte0[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            el.a(6, d, "setData(byte[]) running on the MAIN thread!");
        }
        el.a(4, d, (new StringBuilder("Writing FlurryDataSenderBlockInfo: ")).append(e.getAbsolutePath()).toString());
        boolean flag2 = fa.a(e);
        if (!flag2)
        {
            fb.a(null);
            return false;
        }
        DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(e));
        Object obj;
        obj = dataoutputstream;
        flag = flag1;
        int i = abyte0.length;
        obj = dataoutputstream;
        flag = flag1;
        dataoutputstream.writeShort(i);
        obj = dataoutputstream;
        flag = flag1;
        dataoutputstream.write(abyte0);
        obj = dataoutputstream;
        flag = flag1;
        dataoutputstream.writeShort(0);
        flag1 = true;
        obj = dataoutputstream;
        flag = flag1;
        c = i;
        obj = dataoutputstream;
        flag = flag1;
        b = System.currentTimeMillis();
        fb.a(dataoutputstream);
        return true;
        Throwable throwable;
        throwable;
        abyte0 = null;
_L4:
        obj = abyte0;
        el.a(6, d, "", throwable);
        fb.a(abyte0);
        return flag;
        abyte0;
        obj = null;
_L2:
        fb.a(((java.io.Closeable) (obj)));
        throw abyte0;
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        abyte0 = dataoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public byte[] b()
    {
        byte abyte0[];
        Object obj3;
        obj3 = null;
        abyte0 = null;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            el.a(6, d, "getData() running on the MAIN thread!");
        }
        if (!e.exists()) goto _L2; else goto _L1
_L1:
        el.a(4, d, (new StringBuilder("Reading FlurryDataSenderBlockInfo: ")).append(e.getAbsolutePath()).toString());
        Object obj2 = new DataInputStream(new FileInputStream(e));
        Object obj;
        Object obj1;
        obj = obj2;
        obj1 = obj3;
        int i = ((DataInputStream) (obj2)).readUnsignedShort();
        if (i == 0)
        {
            fb.a(((java.io.Closeable) (obj2)));
            return null;
        }
        obj = obj2;
        obj1 = obj3;
        abyte0 = new byte[i];
        obj = obj2;
        obj1 = abyte0;
        ((DataInputStream) (obj2)).readFully(abyte0);
        obj = obj2;
        obj1 = abyte0;
        ((DataInputStream) (obj2)).readUnsignedShort();
        fb.a(((java.io.Closeable) (obj2)));
        return abyte0;
        Throwable throwable;
        throwable;
        obj1 = null;
_L6:
        obj = obj1;
        el.a(6, d, "Error when loading persistent file", throwable);
        fb.a(((java.io.Closeable) (obj1)));
        return abyte0;
        obj;
        obj2 = null;
        obj1 = obj;
_L4:
        fb.a(((java.io.Closeable) (obj2)));
        throw obj1;
_L2:
        el.a(4, d, "Agent cache file doesn't exist.");
        return null;
        obj1;
        obj2 = obj;
        if (true) goto _L4; else goto _L3
_L3:
        throwable;
        abyte0 = ((byte []) (obj1));
        obj1 = obj2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean c()
    {
        if (e.exists())
        {
            if (e.delete())
            {
                el.a(4, d, "Deleted persistence file");
                b = -1L;
                c = -1;
                return true;
            }
            el.a(6, d, "Cannot delete persistence file");
        }
        return false;
    }

}
