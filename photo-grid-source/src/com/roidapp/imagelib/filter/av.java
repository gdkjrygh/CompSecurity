// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.net.Uri;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;

public interface av
{

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(int i, String s, b b1, IGroupInfo igroupinfo, int j);

    public abstract void a(Uri uri, String s, b b1, IGroupInfo igroupinfo, int i);

    public abstract void a(Throwable throwable, String s);

    public abstract void b();
}
