// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.surface;

import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.clearengine.sdk.b;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import java.util.Map;

public interface a
{

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(int i, int j, TrashType trashtype, TrashInfo trashinfo, Map map);

    public abstract void a(int i, String s, Map map);

    public abstract void a(int i, Map map, b b1);

    public abstract void a(Map map);

    public abstract void a(boolean flag);

    public abstract void b();

    public abstract void b(int i);
}
