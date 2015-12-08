// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.jr;
import com.google.android.gms.internal.kk;
import com.google.android.gms.internal.ky;
import java.util.List;

// Referenced classes of package com.google.android.gms.plus.internal:
//            b

public interface d
    extends IInterface
{

    public abstract jr a(b b1, int i, int j, int k, String s);

    public abstract void a(ky ky);

    public abstract void a(b b1);

    public abstract void a(b b1, int i, String s, Uri uri, String s1, String s2);

    public abstract void a(b b1, Uri uri, Bundle bundle);

    public abstract void a(b b1, ky ky);

    public abstract void a(b b1, String s);

    public abstract void a(b b1, String s, String s1);

    public abstract void a(b b1, List list);

    public abstract void a(String s, kk kk, kk kk1);

    public abstract void b(b b1);

    public abstract void b(b b1, String s);

    public abstract void c(b b1, String s);

    public abstract void clearDefaultAccount();

    public abstract void d(b b1, String s);

    public abstract void e(b b1, String s);

    public abstract String getAccountName();

    public abstract String ou();

    public abstract boolean ov();

    public abstract String ow();

    public abstract void removeMoment(String s);
}
