// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.IBinder;
import com.google.android.gms.common.internal.as;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            o

public interface c
{

    public abstract void disconnect();

    public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract boolean isConnected();

    public abstract void zza(o o);

    public abstract void zza(as as);

    public abstract void zza(as as, Set set);

    public abstract boolean zzlN();

    public abstract IBinder zznz();
}
