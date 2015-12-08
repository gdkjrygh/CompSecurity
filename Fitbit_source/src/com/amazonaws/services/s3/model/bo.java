// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3.model;

import com.amazonaws.b;
import java.io.File;
import java.io.InputStream;

// Referenced classes of package com.amazonaws.services.s3.model:
//            StorageClass, ax, bi, CannedAccessControlList, 
//            AccessControlList, bz, bn

public class bo extends b
    implements Cloneable
{

    private String a;
    private String b;
    private File c;
    private InputStream d;
    private bi e;
    private CannedAccessControlList f;
    private AccessControlList g;
    private String h;
    private com.amazonaws.a.b i;
    private String j;
    private bz k;

    public bo(String s1, String s2, File file)
    {
        a = s1;
        b = s2;
        c = file;
    }

    public bo(String s1, String s2, InputStream inputstream, bi bi1)
    {
        a = s1;
        b = s2;
        d = inputstream;
        e = bi1;
    }

    public bo(String s1, String s2, String s3)
    {
        a = s1;
        b = s2;
        j = s3;
    }

    public void a(com.amazonaws.a.b b1)
    {
        i = b1;
    }

    public void a(AccessControlList accesscontrollist)
    {
        g = accesscontrollist;
    }

    public void a(CannedAccessControlList cannedaccesscontrollist)
    {
        f = cannedaccesscontrollist;
    }

    public void a(StorageClass storageclass)
    {
        h = storageclass.toString();
    }

    public void a(bi bi1)
    {
        e = bi1;
    }

    public void a(bn bn)
    {
        i = new ax(bn);
    }

    public void a(bz bz)
    {
        k = bz;
    }

    public void a(File file)
    {
        c = file;
    }

    public void a(InputStream inputstream)
    {
        d = inputstream;
    }

    public bo b(com.amazonaws.a.b b1)
    {
        a(b1);
        return this;
    }

    public bo b(AccessControlList accesscontrollist)
    {
        a(accesscontrollist);
        return this;
    }

    public bo b(CannedAccessControlList cannedaccesscontrollist)
    {
        a(cannedaccesscontrollist);
        return this;
    }

    public bo b(StorageClass storageclass)
    {
        a(storageclass);
        return this;
    }

    public bo b(bi bi1)
    {
        a(bi1);
        return this;
    }

    public bo b(bn bn)
    {
        a(bn);
        return this;
    }

    public bo b(bz bz)
    {
        a(bz);
        return this;
    }

    public bo b(File file)
    {
        a(file);
        return this;
    }

    public bo b(InputStream inputstream)
    {
        a(inputstream);
        return this;
    }

    public void b(String s1)
    {
        a = s1;
    }

    public bo c(String s1)
    {
        b(s1);
        return this;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return s();
    }

    public void d(String s1)
    {
        b = s1;
    }

    public bo e(String s1)
    {
        d(s1);
        return this;
    }

    public void f(String s1)
    {
        h = s1;
    }

    public bo g(String s1)
    {
        f(s1);
        return this;
    }

    public String g()
    {
        return a;
    }

    public String h()
    {
        return b;
    }

    public void h(String s1)
    {
        j = s1;
    }

    public bo i(String s1)
    {
        j = s1;
        return this;
    }

    public String i()
    {
        return h;
    }

    public File j()
    {
        return c;
    }

    public bi k()
    {
        return e;
    }

    public CannedAccessControlList l()
    {
        return f;
    }

    public AccessControlList m()
    {
        return g;
    }

    public InputStream n()
    {
        return d;
    }

    public String o()
    {
        return j;
    }

    public bz p()
    {
        return k;
    }

    public bn q()
    {
        if (i instanceof ax)
        {
            return ((ax)i).a();
        } else
        {
            return null;
        }
    }

    public com.amazonaws.a.b r()
    {
        return i;
    }

    public bo s()
    {
        bo bo1 = (new bo(a, b, j)).b(g).b(f).b(c).b(i).b(d);
        bi bi1;
        if (e == null)
        {
            bi1 = null;
        } else
        {
            bi1 = e.t();
        }
        return (bo)bo1.b(bi1).g(h).b(e());
    }
}
