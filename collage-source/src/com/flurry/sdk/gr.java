// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            hp, fp, gd, fw, 
//            gs, gq, ha, gw, 
//            gx

public class gr
{

    public static final Integer a = Integer.valueOf(50);
    private static final String d = com/flurry/sdk/gr.getSimpleName();
    String b;
    LinkedHashMap c;

    public gr(String s)
    {
        a(s);
    }

    private void a(String s, List list, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        hp.b();
        gd.a(5, d, (new StringBuilder()).append("Saving Index File for ").append(s).append(" file name:").append(fp.a().c().getFileStreamPath(g(s))).toString());
        s = new fw(fp.a().c().getFileStreamPath(g(s)), s1, 1, new ha() {

            final gr a;

            public gx a(int i1)
            {
                return new gw(new gs.a());
            }

            
            {
                a = gr.this;
                super();
            }
        });
        s1 = new ArrayList();
        for (list = list.iterator(); list.hasNext(); s1.add(new gs((String)list.next()))) { }
        break MISSING_BLOCK_LABEL_140;
        s;
        throw s;
        s.a(s1);
        this;
        JVM INSTR monitorexit ;
    }

    private void a(String s, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        hp.b();
        gd.a(5, d, (new StringBuilder()).append("Saving Block File for ").append(s).append(" file name:").append(fp.a().c().getFileStreamPath(gq.a(s))).toString());
        (new fw(fp.a().c().getFileStreamPath(gq.a(s)), ".yflurrydatasenderblock.", 1, new ha() {

            final gr a;

            public gx a(int i1)
            {
                return new gq.a();
            }

            
            {
                a = gr.this;
                super();
            }
        })).a(new gq(abyte0));
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        LinkedList linkedlist = new LinkedList(c.keySet());
        b();
        if (!linkedlist.isEmpty())
        {
            a(b, linkedlist, b);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void e(String s)
    {
        Object obj;
        c = new LinkedHashMap();
        obj = new ArrayList();
        if (!j(s)) goto _L2; else goto _L1
_L1:
        List list = k(s);
        if (list != null && list.size() > 0)
        {
            ((List) (obj)).addAll(list);
            for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); f((String)iterator.next())) { }
        }
        i(s);
_L7:
        s = ((List) (obj)).iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            obj = (String)s.next();
            List list1 = h(((String) (obj)));
            if (list1 != null)
            {
                c.put(obj, list1);
            }
        } while (true);
          goto _L3
_L2:
        s = (List)(new fw(fp.a().c().getFileStreamPath(g(b)), s, 1, new ha() {

            final gr a;

            public gx a(int i1)
            {
                return new gw(new gs.a());
            }

            
            {
                a = gr.this;
                super();
            }
        })).a();
        if (s != null) goto _L5; else goto _L4
_L4:
        gd.c(d, "New main file also not found. returning..");
_L3:
        return;
_L5:
        s = s.iterator();
        while (s.hasNext()) 
        {
            ((List) (obj)).add(((gs)s.next()).a());
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void f(String s)
    {
        List list = k(s);
        if (list == null)
        {
            gd.c(d, "No old file to replace");
        } else
        {
            for (Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                String s1 = (String)iterator.next();
                byte abyte0[] = m(s1);
                if (abyte0 == null)
                {
                    gd.a(6, d, "File does not exist");
                } else
                {
                    a(s1, abyte0);
                    l(s1);
                }
            }

            if (list != null)
            {
                a(s, list, ".YFlurrySenderIndex.info.");
                i(s);
                return;
            }
        }
    }

    private String g(String s)
    {
        return (new StringBuilder()).append(".YFlurrySenderIndex.info.").append(s).toString();
    }

    private List h(String s)
    {
        this;
        JVM INSTR monitorenter ;
        hp.b();
        gd.a(5, d, (new StringBuilder()).append("Reading Index File for ").append(s).append(" file name:").append(fp.a().c().getFileStreamPath(g(s))).toString());
        Object obj = (List)(new fw(fp.a().c().getFileStreamPath(g(s)), ".YFlurrySenderIndex.info.", 1, new ha() {

            final gr a;

            public gx a(int i1)
            {
                return new gw(new gs.a());
            }

            
            {
                a = gr.this;
                super();
            }
        })).a();
        s = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.add(((gs)((Iterator) (obj)).next()).a())) { }
        break MISSING_BLOCK_LABEL_143;
        s;
        throw s;
        this;
        JVM INSTR monitorexit ;
        return s;
    }

    private void i(String s)
    {
        hp.b();
        gd.a(5, d, (new StringBuilder()).append("Deleting Index File for ").append(s).append(" file name:").append(fp.a().c().getFileStreamPath((new StringBuilder()).append(".FlurrySenderIndex.info.").append(s).toString())).toString());
        File file = fp.a().c().getFileStreamPath((new StringBuilder()).append(".FlurrySenderIndex.info.").append(s).toString());
        if (file.exists())
        {
            boolean flag = file.delete();
            gd.a(5, d, (new StringBuilder()).append("Found file for ").append(s).append(". Deleted - ").append(flag).toString());
        }
    }

    private boolean j(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        File file = fp.a().c().getFileStreamPath((new StringBuilder()).append(".FlurrySenderIndex.info.").append(s).toString());
        gd.a(5, d, (new StringBuilder()).append("isOldIndexFilePresent: for ").append(s).append(file.exists()).toString());
        flag = file.exists();
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    private List k(String s)
    {
        byte abyte0[] = null;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        hp.b();
        gd.a(5, d, (new StringBuilder()).append("Reading Index File for ").append(s).append(" file name:").append(fp.a().c().getFileStreamPath((new StringBuilder()).append(".FlurrySenderIndex.info.").append(s).toString())).toString());
        obj = fp.a().c().getFileStreamPath((new StringBuilder()).append(".FlurrySenderIndex.info.").append(s).toString());
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        gd.a(5, d, (new StringBuilder()).append("Reading Index File for ").append(s).append(" Found file.").toString());
        DataInputStream datainputstream = new DataInputStream(new FileInputStream(((File) (obj))));
        obj = datainputstream;
        int j1 = datainputstream.readUnsignedShort();
        if (j1 != 0) goto _L4; else goto _L3
_L3:
        hp.a(datainputstream);
        s = abyte0;
_L7:
        this;
        JVM INSTR monitorexit ;
        return s;
_L4:
        obj = datainputstream;
        s = new ArrayList(j1);
        int i1 = 0;
_L6:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = datainputstream;
        int k1 = datainputstream.readUnsignedShort();
        obj = datainputstream;
        gd.a(4, d, (new StringBuilder()).append("read iter ").append(i1).append(" dataLength = ").append(k1).toString());
        obj = datainputstream;
        abyte0 = new byte[k1];
        obj = datainputstream;
        datainputstream.readFully(abyte0);
        obj = datainputstream;
        s.add(new String(abyte0));
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        obj = datainputstream;
        i1 = datainputstream.readUnsignedShort();
        if (i1 != 0);
        hp.a(datainputstream);
          goto _L7
        Throwable throwable;
        throwable;
        datainputstream = null;
        s = null;
_L9:
        obj = datainputstream;
        gd.a(6, d, "Error when loading persistent file", throwable);
        hp.a(datainputstream);
          goto _L7
        s;
        throw s;
        s;
        obj = null;
_L8:
        hp.a(((java.io.Closeable) (obj)));
        throw s;
_L2:
        gd.a(5, d, "Agent cache file doesn't exist.");
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

    private void l(String s)
    {
        hp.b();
        gd.a(5, d, (new StringBuilder()).append("Deleting  block File for ").append(s).append(" file name:").append(fp.a().c().getFileStreamPath((new StringBuilder()).append(".flurrydatasenderblock.").append(s).toString())).toString());
        File file = fp.a().c().getFileStreamPath((new StringBuilder()).append(".flurrydatasenderblock.").append(s).toString());
        if (file.exists())
        {
            boolean flag = file.delete();
            gd.a(5, d, (new StringBuilder()).append("Found file for ").append(s).append(". Deleted - ").append(flag).toString());
        }
    }

    private byte[] m(String s)
    {
        Object obj;
        byte abyte0[];
        Object obj2;
        obj2 = null;
        abyte0 = null;
        hp.b();
        gd.a(5, d, (new StringBuilder()).append("Reading block File for ").append(s).append(" file name:").append(fp.a().c().getFileStreamPath((new StringBuilder()).append(".flurrydatasenderblock.").append(s).toString())).toString());
        obj = fp.a().c().getFileStreamPath((new StringBuilder()).append(".flurrydatasenderblock.").append(s).toString());
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        gd.a(5, d, (new StringBuilder()).append("Reading Index File for ").append(s).append(" Found file.").toString());
        Object obj1 = new DataInputStream(new FileInputStream(((File) (obj))));
        s = ((String) (obj1));
        obj = obj2;
        int i1 = ((DataInputStream) (obj1)).readUnsignedShort();
        if (i1 == 0)
        {
            hp.a(((java.io.Closeable) (obj1)));
            return null;
        }
        s = ((String) (obj1));
        obj = obj2;
        abyte0 = new byte[i1];
        s = ((String) (obj1));
        obj = abyte0;
        ((DataInputStream) (obj1)).readFully(abyte0);
        s = ((String) (obj1));
        obj = abyte0;
        i1 = ((DataInputStream) (obj1)).readUnsignedShort();
        if (i1 != 0);
        hp.a(((java.io.Closeable) (obj1)));
        return abyte0;
        Throwable throwable;
        throwable;
        obj = null;
_L6:
        s = ((String) (obj));
        gd.a(6, d, "Error when loading persistent file", throwable);
        hp.a(((java.io.Closeable) (obj)));
        return abyte0;
        s;
        obj1 = null;
        obj = s;
_L4:
        hp.a(((java.io.Closeable) (obj1)));
        throw obj;
_L2:
        gd.a(4, d, "Agent cache file doesn't exist.");
        return null;
        obj;
        obj1 = s;
        if (true) goto _L4; else goto _L3
_L3:
        throwable;
        abyte0 = ((byte []) (obj));
        obj = obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public List a()
    {
        return new ArrayList(c.keySet());
    }

    public void a(gq gq1, String s)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        String s1;
        gd.a(4, d, (new StringBuilder()).append("addBlockInfo").append(s).toString());
        s1 = gq1.a();
        gq1 = (List)c.get(s);
        if (gq1 != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        gd.a(4, d, "New Data Key");
        gq1 = new LinkedList();
        flag = true;
        gq1.add(s1);
        if (gq1.size() > a.intValue())
        {
            b((String)gq1.get(0));
            gq1.remove(0);
        }
        c.put(s, gq1);
        a(s, ((List) (gq1)), ".YFlurrySenderIndex.info.");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        gq1;
        throw gq1;
    }

    void a(String s)
    {
        b = (new StringBuilder()).append(s).append("Main").toString();
        e(b);
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
            a(s1, list, ".YFlurrySenderIndex.info.");
            return flag;
        } else
        {
            d(s1);
            return flag;
        }
    }

    void b()
    {
        (new fw(fp.a().c().getFileStreamPath(g(b)), ".YFlurrySenderIndex.info.", 1, new ha() {

            final gr a;

            public gx a(int i1)
            {
                return new gw(new gs.a());
            }

            
            {
                a = gr.this;
                super();
            }
        })).b();
    }

    boolean b(String s)
    {
        return (new fw(fp.a().c().getFileStreamPath(gq.a(s)), ".yflurrydatasenderblock.", 1, new ha() {

            final gr a;

            public gx a(int i1)
            {
                return new gq.a();
            }

            
            {
                a = gr.this;
                super();
            }
        })).b();
    }

    public List c(String s)
    {
        return (List)c.get(s);
    }

    public boolean d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        fw fw1;
        Object obj;
        hp.b();
        fw1 = new fw(fp.a().c().getFileStreamPath(g(s)), ".YFlurrySenderIndex.info.", 1, new ha() {

            final gr a;

            public gx a(int i1)
            {
                return new gw(new gs.a());
            }

            
            {
                a = gr.this;
                super();
            }
        });
        obj = c(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        gd.a(4, d, (new StringBuilder()).append("discardOutdatedBlocksForDataKey: notSentBlocks = ").append(((List) (obj)).size()).toString());
        String s1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); gd.a(4, d, (new StringBuilder()).append("discardOutdatedBlocksForDataKey: removed block = ").append(s1).toString()))
        {
            s1 = (String)((Iterator) (obj)).next();
            b(s1);
        }

        break MISSING_BLOCK_LABEL_150;
        s;
        throw s;
        boolean flag;
        c.remove(s);
        flag = fw1.b();
        c();
        this;
        JVM INSTR monitorexit ;
        return flag;
    }

}
