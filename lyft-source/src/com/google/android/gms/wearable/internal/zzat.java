// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzar, AddListenerRequest, AncsNotificationParcelable, RemoveListenerRequest, 
//            zzaq

public interface zzat
    extends IInterface
{

    public abstract void a(zzar zzar);

    public abstract void a(zzar zzar, int i1);

    public abstract void a(zzar zzar, Uri uri);

    public abstract void a(zzar zzar, Uri uri, int i1);

    public abstract void a(zzar zzar, Asset asset);

    public abstract void a(zzar zzar, ConnectionConfiguration connectionconfiguration);

    public abstract void a(zzar zzar, PutDataRequest putdatarequest);

    public abstract void a(zzar zzar, AddListenerRequest addlistenerrequest);

    public abstract void a(zzar zzar, AncsNotificationParcelable ancsnotificationparcelable);

    public abstract void a(zzar zzar, RemoveListenerRequest removelistenerrequest);

    public abstract void a(zzar zzar, zzaq zzaq, String s);

    public abstract void a(zzar zzar, String s);

    public abstract void a(zzar zzar, String s, int i1);

    public abstract void a(zzar zzar, String s, ParcelFileDescriptor parcelfiledescriptor);

    public abstract void a(zzar zzar, String s, ParcelFileDescriptor parcelfiledescriptor, long l1, long l2);

    public abstract void a(zzar zzar, String s, String s1);

    public abstract void a(zzar zzar, String s, String s1, byte abyte0[]);

    public abstract void a(zzar zzar, boolean flag);

    public abstract void b(zzar zzar);

    public abstract void b(zzar zzar, int i1);

    public abstract void b(zzar zzar, Uri uri);

    public abstract void b(zzar zzar, Uri uri, int i1);

    public abstract void b(zzar zzar, ConnectionConfiguration connectionconfiguration);

    public abstract void b(zzar zzar, zzaq zzaq, String s);

    public abstract void b(zzar zzar, String s);

    public abstract void b(zzar zzar, String s, int i1);

    public abstract void b(zzar zzar, boolean flag);

    public abstract void c(zzar zzar);

    public abstract void c(zzar zzar, int i1);

    public abstract void c(zzar zzar, Uri uri);

    public abstract void c(zzar zzar, String s);

    public abstract void d(zzar zzar);

    public abstract void d(zzar zzar, String s);

    public abstract void e(zzar zzar);

    public abstract void e(zzar zzar, String s);

    public abstract void f(zzar zzar);

    public abstract void f(zzar zzar, String s);

    public abstract void g(zzar zzar);

    public abstract void h(zzar zzar);

    public abstract void i(zzar zzar);

    public abstract void j(zzar zzar);

    public abstract void k(zzar zzar);

    public abstract void l(zzar zzar);

    public abstract void m(zzar zzar);

    public abstract void n(zzar zzar);

    public abstract void o(zzar zzar);
}
