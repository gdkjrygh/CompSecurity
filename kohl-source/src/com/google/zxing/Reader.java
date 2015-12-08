// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import java.util.Map;

// Referenced classes of package com.google.zxing:
//            NotFoundException, ChecksumException, FormatException, BinaryBitmap, 
//            Result

public interface Reader
{

    public abstract Result decode(BinaryBitmap binarybitmap)
        throws NotFoundException, ChecksumException, FormatException;

    public abstract Result decode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException, ChecksumException, FormatException;

    public abstract void reset();
}
