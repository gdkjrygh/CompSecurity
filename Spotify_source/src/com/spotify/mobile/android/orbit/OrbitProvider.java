// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;

import java.io.FileDescriptor;

// Referenced classes of package com.spotify.mobile.android.orbit:
//            OrbitProviderInterface

public final class OrbitProvider
    implements OrbitProviderInterface
{

    private long nOrbitProviderPtr;

    private OrbitProvider()
    {
    }

    public final native String acquirePath(String s, String as[], String as1[]);

    public final native void insert(String s, String as[], String as1[], String as2[], String as3[]);

    public final native int numberOfRows(String s);

    public final native String query(String s, String as[], int i, int j);

    public final native void releasePath(String s, String s1);

    public final native void remove(String s);

    public final native void update(String s, String as[], String as1[], String as2[], String as3[]);

    public final native boolean writeImageToPipe(String s, FileDescriptor filedescriptor);
}
