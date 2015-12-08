// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.cookie;

import java.util.Date;

// Referenced classes of package org.apache.http.cookie:
//            Cookie

public interface SetCookie
    extends Cookie
{

    public abstract void setComment(String s);

    public abstract void setDomain(String s);

    public abstract void setExpiryDate(Date date);

    public abstract void setPath(String s);

    public abstract void setSecure(boolean flag);

    public abstract void setValue(String s);

    public abstract void setVersion(int i);
}
