// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso23001.part7;


// Referenced classes of package com.mp4parser.iso23001.part7:
//            CencSampleAuxiliaryDataFormat

private abstract class <init>
    implements <init>
{

    final CencSampleAuxiliaryDataFormat this$0;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (<init>)obj;
            if (clear() != ((clear) (obj)).clear())
            {
                return false;
            }
            if (encrypted() != ((encrypted) (obj)).d())
            {
                return false;
            }
        }
        return true;
    }

    public String toString()
    {
        return (new StringBuilder("P(")).append(clear()).append("|").append(encrypted()).append(")").toString();
    }

    private ()
    {
        this$0 = CencSampleAuxiliaryDataFormat.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
