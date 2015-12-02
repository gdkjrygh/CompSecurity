// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.e;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.engine.b.g;
import com.qihoo.security.env.QVSEnv;
import com.qihoo.security.services.ScanResult;
import com.qihoo.security.services.a;
import com.qihoo.security.services.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import net.jarlehansen.protobuf.javame.b;

// Referenced classes of package com.qihoo.security.engine.e:
//            a, b

public class com.qihoo.security.engine.e.c
{
    class a
        implements com.qihoo.security.engine.e.b
    {

        final com.qihoo.security.engine.e.c a;

        public boolean a(ScanResult scanresult)
        {
            if (!com.qihoo.security.engine.e.c.a(a)) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            switch (scanresult.state)
            {
            default:
                return false;

            case 1: // '\001'
                if (a.b.get(6, false) && scanresult.fileInfo.level < 50)
                {
                    return true;
                }
                break;

            case 7: // '\007'
                Object obj = scanresult.fileInfo.apkInfo;
                if (obj != null)
                {
                    if (((ApkInfo) (obj)).maliceRank > 0)
                    {
                        obj = a;
                        com.qihoo.security.engine.e.c.a(((com.qihoo.security.engine.e.c) (obj)), com.qihoo.security.engine.e.c.b(((com.qihoo.security.engine.e.c) (obj))) + 1);
                    } else
                    {
                        ((ApkInfo) (obj)).addUpExts("ac", (new StringBuilder(String.valueOf(System.currentTimeMillis()))).append(":").append(com.qihoo.security.engine.e.c.b(a)).toString());
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (scanresult.fileInfo.apkInfo.isMalware()) goto _L1; else goto _L4
_L4:
            return true;
        }

        public int b(ScanResult scanresult)
        {
            int i = 1;
            scanresult.state;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 44
        //                       1: 76
        //                       7: 59;
               goto _L1 _L2 _L3 _L4
_L1:
            i = 0;
_L5:
            return i;
_L2:
            if (a.b.get(1, false)) goto _L5; else goto _L4
_L4:
            if (a.b.get(2, false))
            {
                return 2;
            }
_L3:
            if (!a.b.get(6, false)) goto _L1; else goto _L6
_L6:
            return 6;
        }

        a()
        {
            a = com.qihoo.security.engine.e.c.this;
            super();
        }
    }

    class b
        implements com.qihoo.security.engine.e.b
    {

        final com.qihoo.security.engine.e.c a;

        public boolean a(ScanResult scanresult)
        {
            if (!com.qihoo.security.engine.e.c.a(a)) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            switch (scanresult.state)
            {
            default:
                return false;

            case 7: // '\007'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                if (!a.b.get(6, false))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (scanresult.fileInfo.level < 50)
                {
                    return true;
                }
                break;

            case 11: // '\013'
                if (scanresult.fileInfo.level >= 30 && scanresult.fileInfo.level < 50)
                {
                    break; /* Loop/switch isn't completed */
                }
                break;
            }
            continue; /* Loop/switch isn't completed */
            if (scanresult.fileInfo.level < 30 || scanresult.fileInfo.level >= 50) goto _L1; else goto _L3
_L3:
            return true;
            if (true) goto _L1; else goto _L4
_L4:
            return true;
            if (scanresult.fileInfo.level >= 60 || scanresult.fileInfo.apkInfo.isSystem()) goto _L1; else goto _L5
_L5:
            return true;
        }

        public int b(ScanResult scanresult)
        {
            byte byte0 = 2;
            scanresult.state;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 44
        //                       1: 59
        //                       11: 78;
               goto _L1 _L2 _L3 _L4
_L1:
            byte0 = 0;
_L5:
            return byte0;
_L2:
            if (a.b.get(2, false)) goto _L5; else goto _L3
_L3:
            if (a.b.get(6, false))
            {
                return 6;
            }
_L4:
            if (!a.b.get(1, false)) goto _L1; else goto _L6
_L6:
            return 1;
        }

        b()
        {
            a = com.qihoo.security.engine.e.c.this;
            super();
        }
    }

    class c
        implements com.qihoo.security.engine.e.b
    {

        final com.qihoo.security.engine.e.c a;

        public boolean a(ScanResult scanresult)
        {
            if (!com.qihoo.security.engine.e.c.a(a)) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            switch (scanresult.state)
            {
            default:
                return false;

            case 11: // '\013'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                if (!a.b.get(6, false))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (scanresult.fileInfo.level < 50)
                {
                    return true;
                }
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                return true;
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (scanresult.fileInfo.level < 30 || scanresult.fileInfo.level >= 50) goto _L1; else goto _L4
_L4:
            return true;
            if (scanresult.fileInfo.level < 30 || scanresult.fileInfo.level >= 50) goto _L1; else goto _L5
_L5:
            return true;
        }

        public int b(ScanResult scanresult)
        {
            int i = 1;
            scanresult.state;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 44
        //                       1: 76
        //                       7: 59;
               goto _L1 _L2 _L3 _L4
_L1:
            i = 0;
_L5:
            return i;
_L2:
            if (a.b.get(1, false)) goto _L5; else goto _L4
_L4:
            if (a.b.get(2, false))
            {
                return 2;
            }
_L3:
            if (!a.b.get(6, false)) goto _L1; else goto _L6
_L6:
            return 6;
        }

        c()
        {
            a = com.qihoo.security.engine.e.c.this;
            super();
        }
    }


    final com.qihoo.security.engine.b.c a;
    public final SparseBooleanArray b = new SparseBooleanArray();
    private boolean c;
    private com.qihoo.security.engine.e.b d;
    private int e;
    private final SparseArray f = new SparseArray();
    private volatile boolean g;
    private AtomicInteger h;

    public com.qihoo.security.engine.e.c(com.qihoo.security.engine.b.c c1)
    {
        c = false;
        d = null;
        g = false;
        h = new AtomicInteger(0);
        a = c1;
        f.append(2, new com.qihoo.security.engine.e.a(2, c1, 50));
    }

    private int a(int i, ScanResult scanresult)
    {
        Object obj = a.e.a(i);
        int j = 0x80004004;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (g)
        {
            return 4;
        }
        if (!QVSEnv.bEvalMode);
        h.incrementAndGet();
        int k = ((com.qihoo.security.services.a) (obj)).a(i, scanresult);
        j = k;
_L4:
        h.decrementAndGet();
        if (j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Exception exception;
        return !QVSEnv.bEvalMode ? 1 : 1;
        exception;
        a.a(i, scanresult.fileInfo.filePath, exception.toString());
        if (true) goto _L4; else goto _L3
_L3:
        if (g)
        {
            return 4;
        }
          goto _L5
_L13:
        if (scanresult == null) goto _L7; else goto _L6
_L6:
        a.a(scanresult);
        return 2;
_L9:
        try
        {
            exception = new ArrayList(1);
            exception.add(scanresult);
            scanresult = new com.qihoo.security.engine.a(1, a.e, exception, a);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (ScanResult scanresult) { }
          goto _L7
_L10:
        exception = ((com.qihoo.security.engine.e.a)f.get(2)).a(scanresult, false);
        scanresult = exception;
        if (exception == null)
        {
            return 2;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        ArrayList arraylist = new ArrayList();
        arraylist.add(scanresult);
        scanresult = new com.qihoo.security.engine.a(6, a.e, arraylist, a);
        continue; /* Loop/switch isn't completed */
_L7:
        return 4;
_L2:
        return 4;
_L5:
        i;
        JVM INSTR tableswitch 1 6: default 272
    //                   1 124
    //                   2 163
    //                   3 272
    //                   4 272
    //                   5 272
    //                   6 188;
           goto _L8 _L9 _L10 _L8 _L8 _L8 _L11
_L8:
        scanresult = null;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private void a(int i, List list)
    {
        if (!g && b.get(i, false))
        {
            com.qihoo.security.engine.a a1 = ((com.qihoo.security.engine.e.a)f.get(i)).a();
            if (a1 != null)
            {
                list.add(a1);
                return;
            }
        }
    }

    static void a(com.qihoo.security.engine.e.c c1, int i)
    {
        c1.e = i;
    }

    static boolean a(com.qihoo.security.engine.e.c c1)
    {
        return c1.g;
    }

    private boolean a(ScanResult scanresult)
    {
        com.qihoo.security.engine.e.b b1 = g();
        int i = b1.b(scanresult);
        if (i == 0)
        {
            scanresult.state = 127;
            return true;
        }
        if (a(i, scanresult) == 1)
        {
            if (b1.a(scanresult))
            {
                return a(scanresult);
            } else
            {
                scanresult.state = 127;
                return true;
            }
        } else
        {
            return false;
        }
    }

    static int b(com.qihoo.security.engine.e.c c1)
    {
        return c1.e;
    }

    public int a(int i, int j, List list)
    {
        if (i != 2 || !com.qihoo.security.engine.consts.a.a(j) || !b.get(7, false)) goto _L2; else goto _L1
_L1:
        Object obj;
        Iterator iterator;
        obj = new ArrayList();
        iterator = list.iterator();
_L8:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L2:
        list = list.iterator();
_L10:
        if (list.hasNext()) goto _L6; else goto _L5
_L5:
        ScanResult scanresult;
        return !g ? 0 : 0x80004004;
_L4:
        scanresult = (ScanResult)iterator.next();
        if (g) goto _L3; else goto _L7
_L7:
        if (scanresult.fileInfo.shouldUpload)
        {
            ((ArrayList) (obj)).add(scanresult);
        }
          goto _L8
_L3:
        if (!g && !((ArrayList) (obj)).isEmpty())
        {
            a.i.a(((List) (obj)));
        }
          goto _L2
_L6:
        obj = (ScanResult)list.next();
        if (g) goto _L5; else goto _L9
_L9:
        if (i == 2 && com.qihoo.security.engine.consts.a.a(j))
        {
            Object obj1 = ((ScanResult) (obj)).fileInfo;
            if (obj1 != null)
            {
                obj1 = ((FileInfo) (obj1)).getExIniValue("ec", "em").c();
                if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    if ("0".equals(obj1));
                }
            }
        }
        if (!QVSEnv.bEvalMode);
        if (com.qihoo.security.engine.consts.a.b(j) || g().a(((ScanResult) (obj))))
        {
            if (a(((ScanResult) (obj))))
            {
                a.h.a(((ScanResult) (obj)));
            }
        } else
        {
            obj.state = 127;
            a.h.a(((ScanResult) (obj)));
        }
          goto _L10
    }

    public int a(com.qihoo.security.engine.d.b b1)
    {
        ScanResult scanresult = new ScanResult(b1);
        if (b1.c.fileType == 0) goto _L2; else goto _L1
_L1:
        if (QVSEnv.bEvalMode || !b.get(2, false))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        b1 = a.e.a(2);
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (!g) goto _L4; else goto _L3
_L3:
        return 0x80004004;
_L4:
        int i;
        h.incrementAndGet();
        try
        {
            i = b1.a(2, scanresult);
        }
        // Misplaced declaration of an exception variable
        catch (com.qihoo.security.engine.d.b b1)
        {
            a.a(2, scanresult.fileInfo.filePath, b1.toString());
            i = 0x80004004;
        }
        h.decrementAndGet();
_L6:
        if (g) goto _L3; else goto _L5
_L5:
        if (i == 0 && !g().a(scanresult))
        {
            scanresult.state = 127;
        } else
        {
            scanresult.state = 0;
            if (a(scanresult))
            {
                scanresult.state = 127;
            }
        }
_L2:
        if (!g)
        {
            a.h.a(scanresult);
            return 0;
        }
          goto _L3
        i = 0x80004004;
          goto _L6
    }

    public void a()
    {
        g = true;
        h.set(0);
        com.qihoo.security.engine.e.a a1 = (com.qihoo.security.engine.e.a)f.get(2);
        if (a1 != null)
        {
            a1.c();
        }
    }

    public void a(int i, int j)
    {
        f.put(i, new com.qihoo.security.engine.e.a(i, a, j));
    }

    public void a(int i, boolean flag)
    {
        b.put(i, flag);
    }

    public void b()
    {
        Object obj;
        g = false;
        h.set(0);
        d = null;
        obj = (com.qihoo.security.engine.e.a)f.get(2);
        if (obj != null)
        {
            ((com.qihoo.security.engine.e.a) (obj)).d();
        }
        obj = a.e.e();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        if (b.get(1, false))
        {
            ((com.qihoo.security.services.a) (obj)).e(1);
        }
        if (b.get(2, false))
        {
            ((com.qihoo.security.services.a) (obj)).e(2);
        }
        if (b.get(6, false))
        {
            ((com.qihoo.security.services.a) (obj)).e(6);
        }
        return;
        Exception exception;
        exception;
    }

    public void c()
    {
        com.qihoo.security.services.a a1;
        a1 = a.e.e();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        if (b.get(1, false))
        {
            a1.g(1);
        }
        if (b.get(2, false))
        {
            a1.g(2);
        }
        if (b.get(6, false))
        {
            a1.g(6);
        }
        return;
        Exception exception;
        exception;
    }

    public boolean d()
    {
        return h.get() > 0;
    }

    public boolean e()
    {
        return ((com.qihoo.security.engine.e.a)f.get(2)).b();
    }

    public boolean f()
    {
        Object obj = new LinkedList();
        a(2, ((List) (obj)));
        if (((LinkedList) (obj)).isEmpty())
        {
            return false;
        }
        obj = ((LinkedList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                return true;
            }
            com.qihoo.security.engine.a a1 = (com.qihoo.security.engine.a)((Iterator) (obj)).next();
            a.a(a1);
        } while (true);
    }

    com.qihoo.security.engine.e.b g()
    {
        boolean flag = c;
        boolean flag1 = QVSEnv.bEvalMode;
        if (d == null || flag ^ flag1)
        {
            c = QVSEnv.bEvalMode;
            if (QVSEnv.bEvalMode)
            {
                e = 0;
                d = new a();
            } else
            if ("1".equals(a.a("scan.cloudfirst")))
            {
                d = new b();
            } else
            {
                d = new c();
            }
        }
        return d;
    }
}
