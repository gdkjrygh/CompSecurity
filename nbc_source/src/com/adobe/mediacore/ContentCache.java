// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import java.util.Set;

// Referenced classes of package com.adobe.mediacore:
//            AdHandle

interface ContentCache
{

    public abstract boolean addContent(String s, AdHandle adhandle);

    public abstract void clearCache();

    public abstract Set getCachedUrls();

    public abstract AdHandle getHandle(String s);

    public abstract boolean isCached(String s);
}
