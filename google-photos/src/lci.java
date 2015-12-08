// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.nearby.connection.AppMetadata;

public interface lci
    extends IInterface
{

    public abstract void a(int i);

    public abstract void a(int i, String s);

    public abstract void a(String s);

    public abstract void a(String s, int i, byte abyte0[]);

    public abstract void a(String s, String s1, String s2, String s3);

    public abstract void a(String s, String s1, String s2, String s3, AppMetadata appmetadata);

    public abstract void a(String s, String s1, String s2, byte abyte0[]);

    public abstract void a(String s, byte abyte0[], boolean flag);

    public abstract void b(int i);

    public abstract void b(String s);

    public abstract void c(int i);

    public abstract void c(String s);

    public abstract void d(int i);

    public abstract void e(int i);
}
