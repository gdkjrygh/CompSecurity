// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;


// Referenced classes of package com.google.zxing.oned:
//            OneDReader

public final class MultiFormatUPCEANReader extends OneDReader
{

    private native boolean nativeDecodeRow(boolean aflag[], int i, boolean flag, int ai[]);
}
