// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.picksinit;

import java.util.List;

// Referenced classes of package com.picksinit:
//            ErrorInfo

public interface ICallBack
{

    public abstract void onLoadError(ErrorInfo errorinfo);

    public abstract void onLoadSuccess(List list);

    public abstract void onPreExecute();
}
