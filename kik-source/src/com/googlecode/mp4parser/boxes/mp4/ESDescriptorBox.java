// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import java.nio.ByteBuffer;
import org.b.b.b.b;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4:
//            AbstractDescriptorBox

public class ESDescriptorBox extends AbstractDescriptorBox
{

    public static final String TYPE = "esds";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;

    public ESDescriptorBox()
    {
        super("esds");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("ESDescriptorBox.java", com/googlecode/mp4parser/boxes/mp4/ESDescriptorBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"), 33);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "", "void"), 37);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "", "boolean"), 42);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "int"), 53);
    }

    public boolean equals(Object obj)
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(a);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ESDescriptorBox)obj;
            if (data == null ? ((ESDescriptorBox) (obj)).data != null : !data.equals(((ESDescriptorBox) (obj)).data))
            {
                return false;
            }
        }
        return true;
    }

    public ESDescriptor getEsDescriptor()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (ESDescriptor)super.getDescriptor();
    }

    public int hashCode()
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        if (data != null)
        {
            return data.hashCode();
        } else
        {
            return 0;
        }
    }

    public void setEsDescriptor(ESDescriptor esdescriptor)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, esdescriptor);
        RequiresParseDetailAspect.aspectOf().before(a);
        super.setDescriptor(esdescriptor);
    }

    static 
    {
        ajc$preClinit();
    }
}
