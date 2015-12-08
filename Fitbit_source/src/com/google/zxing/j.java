// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import java.util.Map;

// Referenced classes of package com.google.zxing:
//            NotFoundException, ChecksumException, FormatException, b, 
//            k

public interface j
{

    public abstract k a(b b)
        throws NotFoundException, ChecksumException, FormatException;

    public abstract k a(b b, Map map)
        throws NotFoundException, ChecksumException, FormatException;

    public abstract void a();
}
