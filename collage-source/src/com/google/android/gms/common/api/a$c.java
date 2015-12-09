// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            a

public static interface .r
{

    public abstract void disconnect();

    public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract boolean isConnected();

    public abstract void zza(.r r);

    public abstract void zza(r r);

    public abstract void zza(r r, Set set);

    public abstract boolean zzlm();
}
