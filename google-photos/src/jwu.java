// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;

public interface jwu
    extends IInterface
{

    public abstract void a(int i);

    public abstract void a(long l);

    public abstract void a(long l, int i);

    public abstract void a(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag);

    public abstract void a(ApplicationStatus applicationstatus);

    public abstract void a(DeviceStatus devicestatus);

    public abstract void a(String s, String s1);

    public abstract void a(String s, byte abyte0[]);

    public abstract void b();

    public abstract void b(int i);

    public abstract void c(int i);

    public abstract void d(int i);

    public abstract void e(int i);
}
