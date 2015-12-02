// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.net.channel;

import java.util.Map;

public interface IPullHandler
{

    public abstract void onResponse(String s, int i, Map map, byte abyte0[]);
}
