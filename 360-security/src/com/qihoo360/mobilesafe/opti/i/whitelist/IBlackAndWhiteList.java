// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.whitelist;

import android.content.Context;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.whitelist:
//            IUserBWList

public interface IBlackAndWhiteList
{

    public abstract List getSysProcessWhiteList();

    public abstract IUserBWList getUserBWList(int i);

    public abstract void init(Context context);
}
