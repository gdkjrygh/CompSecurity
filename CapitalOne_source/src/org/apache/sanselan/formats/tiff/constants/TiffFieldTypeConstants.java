// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.constants;

import org.apache.sanselan.SanselanConstants;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeASCII;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeByte;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeDouble;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeFloat;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeLong;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeRational;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeShort;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeUnknown;

public interface TiffFieldTypeConstants
    extends SanselanConstants
{

    public static final FieldTypeByte fP = new FieldTypeByte(1, "Byte");
    public static final FieldTypeShort fR = new FieldTypeShort(3, "Short");
    public static final FieldTypeLong fS = new FieldTypeLong(4, "Long");
    public static final FieldType fU = new FieldTypeByte(6, "SByte");
    public static final FieldType fW = new FieldTypeShort(8, "SShort");
    public static final FieldTypeASCII g_ = new FieldTypeASCII("ASCII");
    public static final FieldType gh[] = {
        g_
    };
    public static final FieldType gi[] = {
        fR, fS
    };
    public static final FieldType gj[] = {
        h_
    };
    public static final FieldType gk[] = {
        fR, fP
    };
    public static final FieldType gl[] = {
        fP
    };
    public static final FieldType gm[] = p_;
    public static final FieldType gn[] = null;
    public static final FieldTypeRational h_ = new FieldTypeRational(5, "Rational");
    public static final FieldType i_ = new FieldTypeByte(7, "Undefined");
    public static final FieldType j_ = new FieldTypeLong(9, "SLong");
    public static final FieldType k_ = new FieldTypeRational(10, "SRational");
    public static final FieldType l_ = new FieldTypeFloat();
    public static final FieldType m_ = new FieldTypeDouble();
    public static final FieldType n_ = new FieldTypeUnknown();
    public static final FieldType o_[] = afieldtype;
    public static final FieldType p_[] = afieldtype;
    public static final FieldType q_[] = {
        fS
    };
    public static final FieldType r_[] = {
        fR
    };
    public static final FieldType s_[] = {
        fR, fS
    };

    
    {
        FieldType afieldtype[] = new FieldType[12];
        afieldtype[0] = fP;
        afieldtype[1] = g_;
        afieldtype[2] = fR;
        afieldtype[3] = fS;
        afieldtype[4] = h_;
        afieldtype[5] = fU;
        afieldtype[6] = i_;
        afieldtype[7] = fW;
        afieldtype[8] = j_;
        afieldtype[9] = k_;
        afieldtype[10] = l_;
        afieldtype[11] = m_;
    }
}
