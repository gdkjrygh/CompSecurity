// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.Container;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            CencMp4TrackImplImpl

private class container
{

    static final boolean $assertionsDisabled;
    private Container container;
    private SampleAuxiliaryInformationOffsetsBox saio;
    private SampleAuxiliaryInformationSizesBox saiz;
    final CencMp4TrackImplImpl this$0;

    public SampleAuxiliaryInformationOffsetsBox getSaio()
    {
        return saio;
    }

    public SampleAuxiliaryInformationSizesBox getSaiz()
    {
        return saiz;
    }

    public saiz invoke()
    {
        List list;
        List list1;
        int i;
        list = container.getBoxes(com/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox);
        list1 = container.getBoxes(com/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox);
        if (!$assertionsDisabled && list.size() != list1.size())
        {
            throw new AssertionError();
        }
        saiz = null;
        saio = null;
        i = 0;
_L6:
        if (i >= list.size())
        {
            return this;
        }
        if (saiz == null && ((SampleAuxiliaryInformationSizesBox)list.get(i)).getAuxInfoType() == null || "cenc".equals(((SampleAuxiliaryInformationSizesBox)list.get(i)).getAuxInfoType()))
        {
            saiz = (SampleAuxiliaryInformationSizesBox)list.get(i);
        } else
        if (saiz != null && saiz.getAuxInfoType() == null && "cenc".equals(((SampleAuxiliaryInformationSizesBox)list.get(i)).getAuxInfoType()))
        {
            saiz = (SampleAuxiliaryInformationSizesBox)list.get(i);
        } else
        {
            throw new RuntimeException("Are there two cenc labeled saiz?");
        }
        if ((saio != null || ((SampleAuxiliaryInformationOffsetsBox)list1.get(i)).getAuxInfoType() != null) && !"cenc".equals(((SampleAuxiliaryInformationOffsetsBox)list1.get(i)).getAuxInfoType())) goto _L2; else goto _L1
_L1:
        saio = (SampleAuxiliaryInformationOffsetsBox)list1.get(i);
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (saio == null || saio.getAuxInfoType() != null || !"cenc".equals(((SampleAuxiliaryInformationOffsetsBox)list1.get(i)).getAuxInfoType()))
        {
            break; /* Loop/switch isn't completed */
        }
        saio = (SampleAuxiliaryInformationOffsetsBox)list1.get(i);
        if (true) goto _L4; else goto _L3
_L3:
        throw new RuntimeException("Are there two cenc labeled saio?");
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/authoring/CencMp4TrackImplImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



    public (Container container1)
    {
        this$0 = CencMp4TrackImplImpl.this;
        super();
        container = container1;
    }
}
