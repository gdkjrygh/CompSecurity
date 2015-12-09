// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern;


// Referenced classes of package group.pals.android.lib.ui.lockpattern:
//            BaseLockPatternActivity

private static final class patternVal extends Enum
{

    private static final Inv_L_Pattern $VALUES[];
    public static final Inv_L_Pattern Inv_L_Pattern;
    public static final Inv_L_Pattern L_Pattern;
    public static final Inv_L_Pattern Z_Pattern;
    public String patternVal;

    public static patternVal valueOf(String s)
    {
        return (patternVal)Enum.valueOf(group/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern, s);
    }

    public static patternVal[] values()
    {
        return (patternVal[])$VALUES.clone();
    }

    public String getPatternReverseVal()
    {
        return (new StringBuffer(patternVal)).reverse().toString();
    }

    public String getPatternVal()
    {
        return patternVal;
    }

    static 
    {
        Z_Pattern = new <init>("Z_Pattern", 0, "1235789");
        L_Pattern = new <init>("L_Pattern", 1, "14789");
        Inv_L_Pattern = new <init>("Inv_L_Pattern", 2, "12369");
        $VALUES = (new .VALUES[] {
            Z_Pattern, L_Pattern, Inv_L_Pattern
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        patternVal = s1;
    }
}
