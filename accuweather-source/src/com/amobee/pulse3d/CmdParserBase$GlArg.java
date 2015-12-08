// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            CmdParserBase, BufferView

public class floatVal
{

    byte buffer[];
    float floatVal[];
    int handle;
    int intVal[];
    boolean isHandle;
    String stringVal;
    final CmdParserBase this$0;
    int type_;
    BufferView view;

    public ()
    {
        this$0 = CmdParserBase.this;
        super();
        intVal = new int[16];
        floatVal = new float[16];
    }
}
