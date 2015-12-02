// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.trashclear;

import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.trashclear:
//            ICallbackTrashScan, ICallbackTrashClear

public interface ITrashClear
{

    public abstract void cancelClear();

    public abstract void cancelScan(ICallbackTrashScan icallbacktrashscan);

    public abstract int clearByTrashInfo(List list, ICallbackTrashClear icallbacktrashclear);

    public abstract void destroy();

    public abstract int scan(int i, int ai[], List list, ICallbackTrashScan icallbacktrashscan);

    public abstract void setOption(String s, String s1);
}
