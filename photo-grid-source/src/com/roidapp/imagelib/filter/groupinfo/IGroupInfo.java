// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.groupinfo;

import android.content.Context;
import android.os.Parcelable;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import java.util.List;

public interface IGroupInfo
    extends Parcelable
{

    public abstract IFilterInfo a();

    public abstract IFilterInfo a(int i);

    public abstract String a(Context context);

    public abstract void a(IFilterInfo ifilterinfo);

    public abstract void a(IFilterInfo aifilterinfo[]);

    public abstract int b();

    public abstract int b(Context context);

    public abstract long c();

    public abstract List d();

    public abstract int e();

    public abstract String f();

    public abstract boolean g();

    public abstract Object h();
}
