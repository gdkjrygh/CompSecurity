// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.e;

import com.kik.g.e;
import com.kik.g.p;
import kik.a.j.m;
import org.spongycastle.jce.interfaces.ECPrivateKey;
import org.spongycastle.jce.interfaces.ECPublicKey;

public interface o
{

    public abstract e a();

    public abstract p a(boolean flag);

    public abstract void a(m m);

    public abstract void a(byte abyte0[]);

    public abstract byte[] a(byte abyte0[], ECPublicKey ecpublickey, ECPrivateKey ecprivatekey);

    public abstract p b();

    public abstract void b(byte abyte0[]);

    public abstract byte[] b(byte abyte0[], ECPublicKey ecpublickey, ECPrivateKey ecprivatekey);
}
