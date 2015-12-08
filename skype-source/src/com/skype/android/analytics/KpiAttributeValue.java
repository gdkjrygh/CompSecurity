// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;


// Referenced classes of package com.skype.android.analytics:
//            EventAttribute

public final class KpiAttributeValue extends Enum
    implements EventAttribute
{

    public static final KpiAttributeValue a;
    public static final KpiAttributeValue b;
    public static final KpiAttributeValue c;
    public static final KpiAttributeValue d;
    public static final KpiAttributeValue e;
    public static final KpiAttributeValue f;
    public static final KpiAttributeValue g;
    public static final KpiAttributeValue h;
    public static final KpiAttributeValue i;
    public static final KpiAttributeValue j;
    private static final KpiAttributeValue k[];

    private KpiAttributeValue(String s, int l)
    {
        super(s, l);
    }

    public static KpiAttributeValue valueOf(String s)
    {
        return (KpiAttributeValue)Enum.valueOf(com/skype/android/analytics/KpiAttributeValue, s);
    }

    public static KpiAttributeValue[] values()
    {
        return (KpiAttributeValue[])k.clone();
    }

    static 
    {
        a = new KpiAttributeValue("Async", 0);
        b = new KpiAttributeValue("Camera_Picture", 1);
        c = new KpiAttributeValue("File_Sharing", 2);
        d = new KpiAttributeValue("Location_Sharing", 3);
        e = new KpiAttributeValue("Moji", 4);
        f = new KpiAttributeValue("P2P", 5);
        g = new KpiAttributeValue("Photo_Sharing", 6);
        h = new KpiAttributeValue("Text", 7);
        i = new KpiAttributeValue("Video_Message", 8);
        j = new KpiAttributeValue("Wear", 9);
        k = (new KpiAttributeValue[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
