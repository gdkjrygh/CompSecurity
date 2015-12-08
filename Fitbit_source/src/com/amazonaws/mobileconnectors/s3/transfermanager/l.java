// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.a.d;
import com.amazonaws.auth.x;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.c;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.g;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.h;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.i;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.k;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.m;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.n;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.p;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.r;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.s;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.t;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.u;
import com.amazonaws.mobileconnectors.s3.transfermanager.a.v;
import com.amazonaws.services.s3.a;
import com.amazonaws.services.s3.b;
import com.amazonaws.services.s3.internal.j;
import com.amazonaws.services.s3.model.ap;
import com.amazonaws.services.s3.model.aq;
import com.amazonaws.services.s3.model.az;
import com.amazonaws.services.s3.model.ba;
import com.amazonaws.services.s3.model.bf;
import com.amazonaws.services.s3.model.bg;
import com.amazonaws.services.s3.model.bh;
import com.amazonaws.services.s3.model.bi;
import com.amazonaws.services.s3.model.bo;
import com.amazonaws.services.s3.model.bx;
import com.amazonaws.util.y;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// Referenced classes of package com.amazonaws.mobileconnectors.s3.transfermanager:
//            m, n, k, i, 
//            d, e, g, b, 
//            o, a, f, c

public class l
{

    private static final Log e = LogFactory.getLog(com/amazonaws/mobileconnectors/s3/transfermanager/l);
    private static final String f = (new StringBuilder()).append(com/amazonaws/mobileconnectors/s3/transfermanager/l.getName()).append("/").append(y.a()).toString();
    private static final String g = (new StringBuilder()).append(com/amazonaws/mobileconnectors/s3/transfermanager/l.getName()).append("_multipart/").append(y.a()).toString();
    private static final String h = "/";
    private static final ThreadFactory i = new _cls3();
    private final a a;
    private com.amazonaws.mobileconnectors.s3.transfermanager.m b;
    private final ExecutorService c;
    private final ScheduledExecutorService d;

    public l()
    {
        this(((a) (new b(new x()))));
    }

    public l(com.amazonaws.auth.g g1)
    {
        this(((a) (new b(g1))));
    }

    public l(com.amazonaws.auth.h h1)
    {
        this(((a) (new b(h1))));
    }

    public l(a a1)
    {
        this(a1, ((ExecutorService) (p.a())));
    }

    public l(a a1, ExecutorService executorservice)
    {
        d = new ScheduledThreadPoolExecutor(1, i);
        a = a1;
        c = executorservice;
        b = new com.amazonaws.mobileconnectors.s3.transfermanager.m();
    }

    public static com.amazonaws.b a(com.amazonaws.b b1)
    {
        b1.d().b(f);
        return b1;
    }

    private com.amazonaws.mobileconnectors.s3.transfermanager.b a(aq aq1, File file, s s, m m1, boolean flag)
    {
        a(((com.amazonaws.b) (aq1)));
        String s1 = (new StringBuilder()).append("Downloading from ").append(aq1.f()).append("/").append(aq1.g()).toString();
        com.amazonaws.mobileconnectors.s3.transfermanager.n n1 = new com.amazonaws.mobileconnectors.s3.transfermanager.n();
        m1 = new n(new com.amazonaws.a.b[] {
            new r(n1), aq1.p(), m1
        });
        aq1.a(new d(new _cls1(), new com.amazonaws.a.b[] {
            m1
        }));
        Object obj = new ap(aq1.f(), aq1.g());
        if (aq1.r() != null)
        {
            ((ap) (obj)).a(aq1.r());
        }
        obj = a.a(((ap) (obj)));
        s = new g(s1, n1, m1, null, s, aq1, file);
        long l3 = 0L;
        long l4 = ((bi) (obj)).i() - 1L;
        long l1 = l4;
        long l2 = l3;
        if (aq1.i() != null)
        {
            l1 = l4;
            l2 = l3;
            if (aq1.i().length == 2)
            {
                l2 = aq1.i()[0];
                l1 = aq1.i()[1];
            }
        }
        l3 = (l1 - l2) + 1L;
        n1.b(l3);
        if (flag && file.exists())
        {
            long l5 = file.length();
            l2 += l5;
            aq1.a(l2, l1);
            n1.a(Math.min(l5, l3));
            l1 = (l1 - l2) + 1L;
        } else
        {
            l1 = l3;
        }
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("Unable to determine the range for download operation.");
        } else
        {
            m1 = new CountDownLatch(1);
            s.a(new h(s, a(aq1, file, flag, ((CountDownLatch) (m1)), ((g) (s)))));
            m1.countDown();
            return s;
        }
    }

    private o a(bo bo1, s s, m m1, com.amazonaws.mobileconnectors.s3.transfermanager.k k1)
        throws AmazonServiceException, AmazonClientException
    {
        a(((com.amazonaws.b) (bo1)));
        Object obj;
        Object obj1;
        if (k1 != null)
        {
            k1 = k1.c();
        } else
        {
            k1 = null;
        }
        if (bo1.k() == null)
        {
            bo1.a(new bi());
        }
        obj = bo1.k();
        obj1 = p.b(bo1);
        if (obj1 != null)
        {
            ((bi) (obj)).a(((File) (obj1)).length());
            if (((bi) (obj)).k() == null)
            {
                ((bi) (obj)).f(j.a().a(((File) (obj1))));
            }
        } else
        if (k1 != null)
        {
            throw new IllegalArgumentException("Unable to resume the upload. No file specified.");
        }
        obj1 = (new StringBuilder()).append("Uploading to ").append(bo1.g()).append("/").append(bo1.h()).toString();
        obj = new com.amazonaws.mobileconnectors.s3.transfermanager.n();
        ((com.amazonaws.mobileconnectors.s3.transfermanager.n) (obj)).b(p.a(bo1));
        m1 = new n(new com.amazonaws.a.b[] {
            new r(((com.amazonaws.mobileconnectors.s3.transfermanager.n) (obj))), bo1.r(), m1
        });
        bo1.a(m1);
        s = new u(((String) (obj1)), ((com.amazonaws.mobileconnectors.s3.transfermanager.n) (obj)), m1, s);
        k1 = new t(this, c, s, bo1, m1, k1, ((com.amazonaws.mobileconnectors.s3.transfermanager.n) (obj)));
        bo1 = new v(this, s, c, k1, bo1, m1);
        bo1.a(d);
        s.a(bo1);
        return s;
    }

    static a a(l l1)
    {
        return l1.a;
    }

    private Future a(aq aq1, File file, boolean flag, CountDownLatch countdownlatch, g g1)
    {
        return c.submit(new _cls2(countdownlatch, g1, file, aq1, flag));
    }

    private void a(File file, List list, boolean flag)
    {
        file = file.listFiles();
        if (file != null)
        {
            int j1 = file.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                File file1 = file[i1];
                if (file1.isDirectory())
                {
                    if (flag)
                    {
                        a(file1, list, flag);
                    }
                } else
                {
                    list.add(file1);
                }
                i1++;
            }
        }
    }

    private void a(Object obj, String s)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public static com.amazonaws.b b(com.amazonaws.b b1)
    {
        b1.d().b(g);
        return b1;
    }

    private void d()
    {
        c.shutdown();
        d.shutdown();
    }

    public com.amazonaws.mobileconnectors.s3.transfermanager.a a(com.amazonaws.services.s3.model.n n1)
    {
        return a(n1, ((s) (null)));
    }

    public com.amazonaws.mobileconnectors.s3.transfermanager.a a(com.amazonaws.services.s3.model.n n1, s s)
        throws AmazonServiceException, AmazonClientException
    {
        a(((com.amazonaws.b) (n1)));
        a(n1.f(), "The source bucket name must be specified when a copy request is initiated.");
        a(n1.g(), "The source object key must be specified when a copy request is initiated.");
        a(n1.i(), "The destination bucket name must be specified when a copy request is initiated.");
        a(n1.j(), "The destination object key must be specified when a copy request is initiated.");
        Object obj1 = (new StringBuilder()).append("Copying object from ").append(n1.f()).append("/").append(n1.g()).append(" to ").append(n1.i()).append("/").append(n1.j()).toString();
        Object obj = (new ap(n1.f(), n1.g())).b(n1.t());
        bi bi1 = a.a(((ap) (obj)));
        com.amazonaws.mobileconnectors.s3.transfermanager.n n2 = new com.amazonaws.mobileconnectors.s3.transfermanager.n();
        n2.b(bi1.i());
        obj = new d(new com.amazonaws.a.b[] {
            new r(n2)
        });
        s = new c(((String) (obj1)), n2, ((d) (obj)), s);
        obj1 = new com.amazonaws.mobileconnectors.s3.transfermanager.a.b(this, c, s, n1, bi1, ((d) (obj)));
        n1 = new com.amazonaws.mobileconnectors.s3.transfermanager.a.d(this, s, c, ((com.amazonaws.mobileconnectors.s3.transfermanager.a.b) (obj1)), n1, ((d) (obj)));
        n1.a(d);
        s.a(n1);
        return s;
    }

    public com.amazonaws.mobileconnectors.s3.transfermanager.a a(String s, String s1, String s2, String s3)
        throws AmazonServiceException, AmazonClientException
    {
        return a(new com.amazonaws.services.s3.model.n(s, s1, s2, s3));
    }

    public com.amazonaws.mobileconnectors.s3.transfermanager.b a(com.amazonaws.mobileconnectors.s3.transfermanager.i i1)
    {
        a(i1, "PausedDownload is mandatory to resume a download.");
        aq aq1 = new aq(i1.a(), i1.b(), i1.c());
        if (i1.d() != null && i1.d().length == 2)
        {
            long al[] = i1.d();
            aq1.a(al[0], al[1]);
        }
        aq1.a(i1.f());
        aq1.a(i1.e());
        return a(aq1, new File(i1.g()), ((s) (null)), ((m) (null)), true);
    }

    public com.amazonaws.mobileconnectors.s3.transfermanager.b a(aq aq1, File file)
    {
        return a(aq1, file, ((s) (null)), ((m) (null)), false);
    }

    public com.amazonaws.mobileconnectors.s3.transfermanager.b a(aq aq1, File file, m m1)
    {
        return a(aq1, file, ((s) (null)), m1, false);
    }

    public f a(String s, String s1, File file, List list)
    {
        return a(s, s1, file, list, ((com.amazonaws.mobileconnectors.s3.transfermanager.g) (null)));
    }

    public f a(String s, String s1, File file, List list, com.amazonaws.mobileconnectors.s3.transfermanager.g g1)
    {
        if (file == null || !file.exists() || !file.isDirectory())
        {
            throw new IllegalArgumentException("Must provide a common base directory for uploaded files");
        }
        com.amazonaws.mobileconnectors.s3.transfermanager.n n1;
        com.amazonaws.mobileconnectors.s3.transfermanager.d d1;
        LinkedList linkedlist;
        Object obj;
        CountDownLatch countdownlatch;
        e e1;
        if (s1 == null || s1.length() == 0)
        {
            s1 = "";
        } else
        if (!s1.endsWith("/"))
        {
            s1 = (new StringBuilder()).append(s1).append("/").toString();
        }
        obj = new d(new com.amazonaws.a.b[0]);
        n1 = new com.amazonaws.mobileconnectors.s3.transfermanager.n();
        d1 = new com.amazonaws.mobileconnectors.s3.transfermanager.d(n1, ((d) (obj)));
        linkedlist = new LinkedList();
        obj = new com.amazonaws.mobileconnectors.s3.transfermanager.a.l("Uploading etc", n1, ((d) (obj)), s1, s, linkedlist);
        ((com.amazonaws.mobileconnectors.s3.transfermanager.a.l) (obj)).a(new k(((com.amazonaws.mobileconnectors.s3.transfermanager.a.a) (obj)), linkedlist));
        countdownlatch = new CountDownLatch(1);
        e1 = new e(countdownlatch, ((com.amazonaws.mobileconnectors.s3.transfermanager.a.j) (obj)));
        if (list == null || list.isEmpty())
        {
            ((com.amazonaws.mobileconnectors.s3.transfermanager.a.l) (obj)).a(com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState.c);
        } else
        {
            int i1 = file.getAbsolutePath().length();
            if (!file.getAbsolutePath().endsWith(File.separator))
            {
                i1++;
            }
            long l1 = 0L;
            file = list.iterator();
            do
            {
                if (!file.hasNext())
                {
                    break;
                }
                list = (File)file.next();
                if (list.isFile())
                {
                    l1 += list.length();
                    String s2 = list.getAbsolutePath().substring(i1).replaceAll("\\\\", "/");
                    bi bi1 = new bi();
                    if (g1 != null)
                    {
                        g1.a(list, bi1);
                    }
                    linkedlist.add((u)a((new bo(s, (new StringBuilder()).append(s1).append(s2).toString(), list)).b(bi1).b(d1), ((s) (e1)), ((m) (null)), ((com.amazonaws.mobileconnectors.s3.transfermanager.k) (null))));
                }
            } while (true);
            n1.b(l1);
        }
        countdownlatch.countDown();
        return ((f) (obj));
    }

    public f a(String s, String s1, File file, boolean flag)
    {
        return a(s, s1, file, flag, ((com.amazonaws.mobileconnectors.s3.transfermanager.g) (null)));
    }

    public f a(String s, String s1, File file, boolean flag, com.amazonaws.mobileconnectors.s3.transfermanager.g g1)
    {
        if (file == null || !file.exists() || !file.isDirectory())
        {
            throw new IllegalArgumentException("Must provide a directory to upload");
        } else
        {
            LinkedList linkedlist = new LinkedList();
            a(file, ((List) (linkedlist)), flag);
            return a(s, s1, file, ((List) (linkedlist)), g1);
        }
    }

    public com.amazonaws.mobileconnectors.s3.transfermanager.m a()
    {
        return b;
    }

    public o a(com.amazonaws.mobileconnectors.s3.transfermanager.k k1)
    {
        a(k1, "PauseUpload is mandatory to resume a upload.");
        b.a(k1.d());
        b.b(k1.e());
        return a(new bo(k1.a(), k1.b(), new File(k1.f())), ((s) (null)), ((m) (null)), k1);
    }

    public o a(bo bo1)
        throws AmazonServiceException, AmazonClientException
    {
        return a(bo1, ((s) (null)), ((m) (null)), ((com.amazonaws.mobileconnectors.s3.transfermanager.k) (null)));
    }

    public o a(bo bo1, m m1)
        throws AmazonServiceException, AmazonClientException
    {
        return a(bo1, ((s) (null)), m1, ((com.amazonaws.mobileconnectors.s3.transfermanager.k) (null)));
    }

    public o a(String s, String s1, File file)
        throws AmazonServiceException, AmazonClientException
    {
        return a(new bo(s, s1, file));
    }

    public o a(String s, String s1, InputStream inputstream, bi bi1)
        throws AmazonServiceException, AmazonClientException
    {
        return a(new bo(s, s1, inputstream, bi1));
    }

    public void a(com.amazonaws.mobileconnectors.s3.transfermanager.m m1)
    {
        b = m1;
    }

    public void a(String s, Date date)
        throws AmazonServiceException, AmazonClientException
    {
        Object obj = a.a((az)a(((com.amazonaws.b) (new az(s)))));
        do
        {
            Iterator iterator = ((bg) (obj)).i().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                bf bf1 = (bf)iterator.next();
                if (bf1.f().compareTo(date) < 0)
                {
                    a.a((com.amazonaws.services.s3.model.a)a(((com.amazonaws.b) (new com.amazonaws.services.s3.model.a(s, bf1.a(), bf1.b())))));
                }
            } while (true);
            obj = (new az(s)).g(((bg) (obj)).e()).e(((bg) (obj)).d());
            obj = a.a((az)a(((com.amazonaws.b) (obj))));
        } while (((bg) (obj)).h());
    }

    public void a(boolean flag)
    {
        c.shutdownNow();
        d.shutdownNow();
        if (flag && (a instanceof b))
        {
            ((b)a).b_();
        }
    }

    public com.amazonaws.mobileconnectors.s3.transfermanager.b b(String s, String s1, File file)
    {
        return a(new aq(s, s1), file);
    }

    public a b()
    {
        return a;
    }

    public com.amazonaws.mobileconnectors.s3.transfermanager.c c(String s, String s1, File file)
    {
        Object obj;
        ArrayList arraylist;
        Object obj2;
        Object obj3;
        com.amazonaws.mobileconnectors.s3.transfermanager.n n1;
        long l1;
        if (s1 == null)
        {
            obj = "";
        } else
        {
            obj = s1;
        }
        obj2 = new LinkedList();
        obj3 = new Stack();
        ((Stack) (obj3)).add(obj);
        l1 = 0L;
        do
        {
            String s2 = (String)((Stack) (obj3)).pop();
            Object obj1 = null;
            long l2 = l1;
            do
            {
                if (obj1 == null)
                {
                    s1 = (new ba()).c(s).i("/").e(s2);
                    s1 = a.a(s1);
                } else
                {
                    s1 = a.a(((bh) (obj1)));
                }
                obj1 = s1.a().iterator();
                l1 = l2;
                while (((Iterator) (obj1)).hasNext()) 
                {
                    bx bx2 = (bx)((Iterator) (obj1)).next();
                    if (!bx2.b().equals(s2) && !s1.b().contains((new StringBuilder()).append(bx2.b()).append("/").toString()))
                    {
                        ((List) (obj2)).add(bx2);
                        l1 += bx2.d();
                    } else
                    {
                        e.debug((new StringBuilder()).append("Skipping download for object ").append(bx2.b()).append(" since it is also a virtual directory").toString());
                    }
                }
                ((Stack) (obj3)).addAll(s1.b());
                obj1 = s1;
                l2 = l1;
            } while (s1.i());
        } while (!((Stack) (obj3)).isEmpty());
        obj3 = new d(new com.amazonaws.a.b[0]);
        n1 = new com.amazonaws.mobileconnectors.s3.transfermanager.n();
        n1.b(l1);
        s1 = new com.amazonaws.mobileconnectors.s3.transfermanager.d(n1, ((d) (obj3)));
        arraylist = new ArrayList();
        s = new i((new StringBuilder()).append("Downloading from ").append(s).append("/").append(((String) (obj))).toString(), n1, ((d) (obj3)), ((String) (obj)), s, arraylist);
        s.a(new k(s, arraylist));
        obj = new CountDownLatch(1);
        obj3 = new e(((CountDownLatch) (obj)), s);
        bx bx1;
        File file1;
        for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); arraylist.add((g)a((new aq(bx1.a(), bx1.b())).b(s1), file1, ((s) (obj3)), ((m) (null)), false)))
        {
            bx1 = (bx)((Iterator) (obj2)).next();
            file1 = new File(file, bx1.b());
            File file2 = file1.getParentFile();
            if (!file2.exists() && !file2.mkdirs())
            {
                throw new RuntimeException((new StringBuilder()).append("Couldn't create parent directories for ").append(file1.getAbsolutePath()).toString());
            }
        }

        if (arraylist.isEmpty())
        {
            s.a(com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState.c);
            return s;
        } else
        {
            ((CountDownLatch) (obj)).countDown();
            return s;
        }
    }

    public void c()
    {
        a(true);
    }

    protected void finalize()
        throws Throwable
    {
        d();
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
