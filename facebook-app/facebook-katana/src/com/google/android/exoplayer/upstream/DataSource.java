// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;


// Referenced classes of package com.google.android.exoplayer.upstream:
//            DataSpec

public interface DataSource
{

    public abstract int a(byte abyte0[], int i, int j);

    public abstract long a(DataSpec dataspec);

    public abstract void a();
}
