// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.text.TextUtils;
import com.skype.android.config.ecs.EcsConfiguration;

public final class TransferType extends Enum
{
    public static class Appinfo
    {

        public String appPackage;
        public String appProtocol;
        public int color;
        public int description;
        public int title;

        public Appinfo(String s, String s1, int i, int j)
        {
            appProtocol = s;
            appPackage = s1;
            title = i;
            color = j;
        }
    }


    private static final TransferType $VALUES[];
    public static final TransferType AUDIO;
    public static final TransferType DOC;
    public static final TransferType DOCX;
    public static final TransferType IMAGE;
    public static final TransferType ONE;
    public static final TransferType PDF;
    public static final TransferType PPT;
    public static final TransferType PPTX;
    public static final TransferType UNKNOWN;
    public static final TransferType VCARD;
    public static final TransferType VIDEO;
    public static final TransferType VSD;
    public static final TransferType VSDX;
    public static final TransferType XLS;
    public static final TransferType XLSX;
    private Appinfo appinfo;
    private int backgroundLevelResId;
    private String extensions[];
    private com.skype.android.widget.SymbolElement.SymbolCode symbolCode;

    private transient TransferType(String s, int i, com.skype.android.widget.SymbolElement.SymbolCode symbolcode, int j, Appinfo appinfo1, String as[])
    {
        super(s, i);
        symbolCode = symbolcode;
        backgroundLevelResId = j;
        extensions = as;
        appinfo = appinfo1;
    }

    private transient TransferType(String s, int i, String as[])
    {
        this(s, i, com.skype.android.widget.SymbolElement.SymbolCode.aQ, 0x7f0e0011, null, as);
    }

    public static final TransferType getDocType(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_13;
        }
        s = UNKNOWN;
        return s;
        TransferType transfertype;
        String s1;
        TransferType atransfertype[];
        String as[];
        int i;
        int j;
        int k;
        int l;
        s1 = s.substring(s.lastIndexOf(".") + 1, s.length());
        atransfertype = values();
        k = atransfertype.length;
        i = 0;
          goto _L1
        continue; /* Loop/switch isn't completed */
        i++;
    }

    public static final void setExtensionsFromEcs(EcsConfiguration ecsconfiguration)
    {
        DOCX.setExtensions(ecsconfiguration.getOpenWithOfficeExtensionsWord().split(","));
        XLSX.setExtensions(ecsconfiguration.getOpenWithOfficeExtensionsExcel().split(","));
        PPTX.setExtensions(ecsconfiguration.getOpenWithOfficeExtensionsPowerPoint().split(","));
    }

    public static TransferType valueOf(String s)
    {
        return (TransferType)Enum.valueOf(com/skype/android/app/transfer/TransferType, s);
    }

    public static TransferType[] values()
    {
        return (TransferType[])$VALUES.clone();
    }

    public final Appinfo getAppinfo()
    {
        return appinfo;
    }

    public final int getBackgroundLevelResId()
    {
        return backgroundLevelResId;
    }

    public final com.skype.android.widget.SymbolElement.SymbolCode getSymbolCode()
    {
        return symbolCode;
    }

    public final void setExtensions(String as[])
    {
        extensions = as;
    }

    static 
    {
        UNKNOWN = new TransferType("UNKNOWN", 0, new String[0]);
        IMAGE = new TransferType("IMAGE", 1, new String[] {
            "jpg", "jpeg", "gif", "bmp", "png"
        });
        AUDIO = new TransferType("AUDIO", 2, new String[] {
            "mp3", "m4a", "wav"
        });
        VIDEO = new TransferType("VIDEO", 3, new String[] {
            "3gp", "avi"
        });
        PDF = new TransferType("PDF", 4, new String[] {
            "pdf"
        });
        VCARD = new TransferType("VCARD", 5, new String[] {
            "vcf"
        });
        PPT = new TransferType("PPT", 6, com.skype.android.widget.SymbolElement.SymbolCode.bg, 0x7f0e0015, new Appinfo("ms-powerpoint:", "com.microsoft.office.powerpoint", 0x7f080466, 0x7f0f0015), new String[] {
            "ppt"
        });
        PPTX = new TransferType("PPTX", 7, com.skype.android.widget.SymbolElement.SymbolCode.bg, 0x7f0e0016, new Appinfo("ms-powerpoint:", "com.microsoft.office.powerpoint", 0x7f080466, 0x7f0f0015), new String[0]);
        XLS = new TransferType("XLS", 8, com.skype.android.widget.SymbolElement.SymbolCode.bf, 0x7f0e0019, new Appinfo("ms-excel:", "com.microsoft.office.excel", 0x7f080465, 0x7f0f0014), new String[] {
            "xls"
        });
        XLSX = new TransferType("XLSX", 9, com.skype.android.widget.SymbolElement.SymbolCode.bf, 0x7f0e001a, new Appinfo("ms-excel:", "com.microsoft.office.excel", 0x7f080465, 0x7f0f0014), new String[0]);
        DOC = new TransferType("DOC", 10, com.skype.android.widget.SymbolElement.SymbolCode.be, 0x7f0e0012, new Appinfo("ms-word:", "com.microsoft.office.word", 0x7f080467, 0x7f0f0016), new String[] {
            "doc"
        });
        DOCX = new TransferType("DOCX", 11, com.skype.android.widget.SymbolElement.SymbolCode.be, 0x7f0e0013, new Appinfo("ms-word:", "com.microsoft.office.word", 0x7f080467, 0x7f0f0031), new String[0]);
        ONE = new TransferType("ONE", 12, com.skype.android.widget.SymbolElement.SymbolCode.bi, 0x7f0e0014, null, new String[] {
            null, "one"
        });
        VSD = new TransferType("VSD", 13, com.skype.android.widget.SymbolElement.SymbolCode.bh, 0x7f0e0017, null, new String[] {
            null, "vsd"
        });
        VSDX = new TransferType("VSDX", 14, com.skype.android.widget.SymbolElement.SymbolCode.bh, 0x7f0e0018, null, new String[] {
            null, "vsdx"
        });
        $VALUES = (new TransferType[] {
            UNKNOWN, IMAGE, AUDIO, VIDEO, PDF, VCARD, PPT, PPTX, XLS, XLSX, 
            DOC, DOCX, ONE, VSD, VSDX
        });
    }
}
