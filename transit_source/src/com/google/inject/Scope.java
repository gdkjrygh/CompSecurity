// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;


// Referenced classes of package com.google.inject:
//            Key, Provider

public interface Scope
{

    public abstract Provider scope(Key key, Provider provider);

    public abstract String toString();
}
