// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.nearby.connection.AppMetadata;

public interface lcl
    extends IInterface
{

    public abstract String a();

    public abstract void a(long l);

    public abstract void a(String s, long l);

    public abstract void a(lci lci, int i, long l, long l1);

    public abstract void a(lci lci, String s, long l);

    public abstract void a(lci lci, String s, long l, long l1);

    public abstract void a(lci lci, String s, AppMetadata appmetadata, long l, long l1);

    public abstract void a(lci lci, String s, String s1, byte abyte0[], long l);

    public abstract void a(lci lci, String s, byte abyte0[], long l);

    public abstract void a(String as[], byte abyte0[], long l);

    public abstract void b(long l);

    public abstract void b(String s, long l);

    public abstract void b(String as[], byte abyte0[], long l);

    public abstract void c(long l);

    public abstract void d(long l);

    public abstract String e(long l);
}
