// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.trashclear;


// Referenced classes of package com.qihoo360.mobilesafe.opti.i.trashclear:
//            TrashInfo

public interface ICallbackTrashScan
{

    public abstract void onFinished(int i);

    public abstract void onFoundItem(TrashInfo trashinfo);

    public abstract void onProgress(int i, int j, String s);

    public abstract void onStart();
}
