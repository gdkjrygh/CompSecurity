// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;

import java.io.FileDescriptor;

public interface OrbitProviderInterface
{

    public abstract String acquirePath(String s, String as[], String as1[]);

    public abstract void insert(String s, String as[], String as1[], String as2[], String as3[]);

    public abstract int numberOfRows(String s);

    public abstract String query(String s, String as[], int i, int j);

    public abstract void releasePath(String s, String s1);

    public abstract void remove(String s);

    public abstract void update(String s, String as[], String as1[], String as2[], String as3[]);

    public abstract boolean writeImageToPipe(String s, FileDescriptor filedescriptor);
}
