// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

public interface crt
    extends IInterface
{

    public abstract void a(crn crn);

    public abstract void a(crn crn, byte byte0);

    public abstract void a(crn crn, int i1);

    public abstract void a(crn crn, Uri uri);

    public abstract void a(crn crn, Uri uri, int i1);

    public abstract void a(crn crn, Asset asset);

    public abstract void a(crn crn, ConnectionConfiguration connectionconfiguration);

    public abstract void a(crn crn, PutDataRequest putdatarequest);

    public abstract void a(crn crn, AddListenerRequest addlistenerrequest);

    public abstract void a(crn crn, AncsNotificationParcelable ancsnotificationparcelable);

    public abstract void a(crn crn, RemoveListenerRequest removelistenerrequest);

    public abstract void a(crn crn, crk crk, String s);

    public abstract void a(crn crn, String s);

    public abstract void a(crn crn, String s, int i1);

    public abstract void a(crn crn, String s, ParcelFileDescriptor parcelfiledescriptor);

    public abstract void a(crn crn, String s, ParcelFileDescriptor parcelfiledescriptor, long l1, long l2);

    public abstract void a(crn crn, String s, String s1);

    public abstract void a(crn crn, String s, String s1, byte abyte0[]);

    public abstract void a(crn crn, boolean flag);

    public abstract void b(crn crn);

    public abstract void b(crn crn, int i1);

    public abstract void b(crn crn, Uri uri);

    public abstract void b(crn crn, Uri uri, int i1);

    public abstract void b(crn crn, ConnectionConfiguration connectionconfiguration);

    public abstract void b(crn crn, crk crk, String s);

    public abstract void b(crn crn, String s);

    public abstract void b(crn crn, String s, int i1);

    public abstract void b(crn crn, boolean flag);

    public abstract void c(crn crn);

    public abstract void c(crn crn, int i1);

    public abstract void c(crn crn, Uri uri);

    public abstract void c(crn crn, String s);

    public abstract void d(crn crn);

    public abstract void d(crn crn, String s);

    public abstract void e(crn crn);

    public abstract void e(crn crn, String s);

    public abstract void f(crn crn);

    public abstract void f(crn crn, String s);

    public abstract void g(crn crn);

    public abstract void h(crn crn);

    public abstract void i(crn crn);

    public abstract void j(crn crn);

    public abstract void k(crn crn);

    public abstract void l(crn crn);

    public abstract void m(crn crn);

    public abstract void n(crn crn);

    public abstract void o(crn crn);

    public abstract void p(crn crn);
}
