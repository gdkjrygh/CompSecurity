// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.whitelist;

import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.whitelist:
//            UserBWRecord

public interface IUserBWList
{

    public abstract void clear();

    public abstract List getList();

    public abstract void insert(UserBWRecord userbwrecord);

    public abstract void remove(UserBWRecord userbwrecord);

    public abstract void save();
}
