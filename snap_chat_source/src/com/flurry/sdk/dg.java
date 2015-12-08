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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            el, do, fa, fb, 
//            df

public class dg
{

    static final Integer a = Integer.valueOf(50);
    private static final String d = com/flurry/sdk/dg.getSimpleName();
    String b;
    LinkedHashMap c;

    public dg(String s)
    {
        a(s);
    }

    private boolean a(File file)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (file == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!file.exists()) goto _L2; else goto _L3
_L3:
        el.a(4, d, (new StringBuilder("Trying to delete persistence file : ")).append(file.getAbsolutePath()).toString());
        flag = file.delete();
        if (!flag) goto _L5; else goto _L4
_L4:
        el.a(4, d, "Deleted persistence file");
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        el.a(6, d, "Cannot delete persistence file");
        if (true) goto _L2; else goto _L6
_L6:
        file;
        throw file;
    }

    private boolean a(String s, List list)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            el.a(6, d, "saveToFile(byte[], ID) running on the MAIN thread!");
        }
        s = com.flurry.sdk.do.a().b().getFileStreamPath((new StringBuilder(".FlurrySenderIndex.info.")).append(s).toString());
        boolean flag1 = fa.a(s);
        if (flag1) goto _L2; else goto _L1
_L1:
        fb.a(null);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(s));
        s = dataoutputstream;
        dataoutputstream.writeShort(list.size());
        int i = 0;
_L4:
        s = dataoutputstream;
        if (i >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        s = dataoutputstream;
        byte abyte0[] = ((String)list.get(i)).getBytes();
        s = dataoutputstream;
        int j = abyte0.length;
        s = dataoutputstream;
        el.a(4, d, (new StringBuilder("write iter ")).append(i).append(" dataLength = ").append(j).toString());
        s = dataoutputstream;
        dataoutputstream.writeShort(j);
        s = dataoutputstream;
        dataoutputstream.write(abyte0);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        s = dataoutputstream;
        dataoutputstream.writeShort(0);
        flag = true;
        fb.a(dataoutputstream);
          goto _L5
        Throwable throwable;
        throwable;
        list = null;
_L7:
        s = list;
        el.a(6, d, "", throwable);
        fb.a(list);
        flag = false;
          goto _L5
_L6:
        fb.a(s);
        throw list;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        list;
          goto _L6
        throwable;
        list = dataoutputstream;
          goto _L7
        list;
        s = null;
          goto _L6
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        LinkedList linkedlist = new LinkedList(c.keySet());
        b();
        if (!linkedlist.isEmpty())
        {
            a(b, linkedlist);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private List e(String s)
    {
        byte abyte0[] = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            el.a(6, d, "readFromFile(byte[], ID) running on the MAIN thread!");
        }
        s = com.flurry.sdk.do.a().b().getFileStreamPath((new StringBuilder(".FlurrySenderIndex.info.")).append(s).toString());
        flag = s.exists();
        if (!flag) goto _L2; else goto _L1
_L1:
        DataInputStream datainputstream1 = new DataInputStream(new FileInputStream(s));
        DataInputStream datainputstream = datainputstream1;
        int j = datainputstream1.readUnsignedShort();
        if (j != 0) goto _L4; else goto _L3
_L3:
        fb.a(datainputstream1);
        s = abyte0;
_L7:
        this;
        JVM INSTR monitorexit ;
        return s;
_L4:
        datainputstream = datainputstream1;
        s = new ArrayList(j);
        int i = 0;
_L6:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        datainputstream = datainputstream1;
        int k = datainputstream1.readUnsignedShort();
        datainputstream = datainputstream1;
        el.a(4, d, (new StringBuilder("read iter ")).append(i).append(" dataLength = ").append(k).toString());
        datainputstream = datainputstream1;
        abyte0 = new byte[k];
        datainputstream = datainputstream1;
        datainputstream1.readFully(abyte0);
        datainputstream = datainputstream1;
        s.add(new String(abyte0));
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        datainputstream = datainputstream1;
        datainputstream1.readUnsignedShort();
        fb.a(datainputstream1);
          goto _L7
        Throwable throwable;
        throwable;
        datainputstream1 = null;
        s = null;
_L9:
        datainputstream = datainputstream1;
        el.a(6, d, "Error when loading persistent file", throwable);
        fb.a(datainputstream1);
          goto _L7
        s;
        throw s;
        s;
        datainputstream = null;
_L8:
        fb.a(datainputstream);
        throw s;
_L2:
        el.a(5, d, "Agent cache file doesn't exist.");
        s = null;
          goto _L7
        s;
          goto _L8
        throwable;
        s = null;
          goto _L9
        throwable;
          goto _L9
    }

    public List a()
    {
        return new ArrayList(c.keySet());
    }

    public void a(df df1, String s)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        String s1;
        el.a(4, d, "addBlockInfo");
        s1 = df1.a();
        df1 = (List)c.get(s);
        if (df1 != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        el.a(4, d, "New Data Key");
        df1 = new LinkedList();
        flag = true;
        df1.add(s1);
        if (df1.size() > a.intValue())
        {
            b((String)df1.get(0));
            df1.remove(0);
        }
        c.put(s, df1);
        a(s, ((List) (df1)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        df1;
        throw df1;
    }

    void a(String s)
    {
        c = new LinkedHashMap();
        b = (new StringBuilder()).append(s).append("Main").toString();
        s = e(b);
        if (s != null)
        {
            s = s.iterator();
            while (s.hasNext()) 
            {
                String s1 = (String)s.next();
                List list = e(s1);
                if (list != null)
                {
                    c.put(s1, list);
                }
            }
        }
    }

    public boolean a(String s, String s1)
    {
        List list = (List)c.get(s1);
        boolean flag = false;
        if (list != null)
        {
            b(s);
            flag = list.remove(s);
        }
        if (list != null && !list.isEmpty())
        {
            c.put(s1, list);
            a(s1, list);
            return flag;
        } else
        {
            d(s1);
            return flag;
        }
    }

    void b()
    {
        a(com.flurry.sdk.do.a().b().getFileStreamPath((new StringBuilder(".FlurrySenderIndex.info.")).append(b).toString()));
    }

    boolean b(String s)
    {
        return (new df(s)).c();
    }

    public List c(String s)
    {
        return (List)c.get(s);
    }

    public boolean d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        File file;
        List list;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            el.a(6, d, "discardOutdatedBlocksForDataKey(ID) running on the MAIN thread!");
        }
        file = com.flurry.sdk.do.a().b().getFileStreamPath((new StringBuilder(".FlurrySenderIndex.info.")).append(s).toString());
        list = c(s);
        if (list == null) goto _L2; else goto _L1
_L1:
        el.a(4, d, (new StringBuilder("discardOutdatedBlocksForDataKey: notSentBlocks = ")).append(list.size()).toString());
        int i = 0;
_L3:
        if (i >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        String s1 = (String)list.get(i);
        b(s1);
        el.a(4, d, (new StringBuilder("discardOutdatedBlocksForDataKey: removed block = ")).append(s1).toString());
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        boolean flag;
        c.remove(s);
        flag = a(file);
        c();
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

}
