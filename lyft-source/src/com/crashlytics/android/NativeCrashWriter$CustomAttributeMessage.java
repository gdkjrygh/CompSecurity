// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.models.CustomAttributeData;

// Referenced classes of package com.crashlytics.android:
//            ByteString, CodedOutputStream

final class b extends b
{

    private final String a;
    private final String b;

    public int a()
    {
        int i = CodedOutputStream.b(1, ByteString.a(a));
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        return CodedOutputStream.b(2, ByteString.a(s)) + i;
    }

    public void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, ByteString.a(a));
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        codedoutputstream.a(2, ByteString.a(s));
    }

    public (CustomAttributeData customattributedata)
    {
        super(2, new [0]);
        a = customattributedata.a;
        b = customattributedata.b;
    }
}
