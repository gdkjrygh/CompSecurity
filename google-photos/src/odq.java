// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Debug;
import android.os.Process;

final class odq
    implements oeg
{

    odq()
    {
    }

    public final void a(mru mru, oxz oxz1, Bundle bundle)
    {
        bundle = (ocf)mru;
        android.os.Debug.MemoryInfo memoryinfo = new android.os.Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryinfo);
        mru = new rap();
        mru.c = new qzx();
        ((rap) (mru)).c.a = Integer.valueOf(memoryinfo.getTotalPss());
        ((rap) (mru)).c.c = Integer.valueOf(memoryinfo.nativePss);
        ((rap) (mru)).c.b = Integer.valueOf(memoryinfo.dalvikPss);
        ((rap) (mru)).c.d = Integer.valueOf(memoryinfo.getTotalPrivateDirty());
        ((rap) (mru)).c.f = Integer.valueOf(memoryinfo.nativePrivateDirty);
        ((rap) (mru)).c.e = Integer.valueOf(memoryinfo.dalvikPrivateDirty);
        ((rap) (mru)).c.g = Integer.valueOf(memoryinfo.getTotalSharedDirty());
        mru.a = ((ocf) (bundle)).a;
        mru.b = Long.valueOf(Process.getElapsedCpuTime());
        bundle = new rca();
        bundle.l = mru;
        oxz1.c = bundle;
    }
}
