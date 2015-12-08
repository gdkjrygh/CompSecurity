// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern;


// Referenced classes of package group.pals.android.lib.ui.lockpattern:
//            BaseLockPatternActivity

public static class <init> extends Enum
{

    private static final ComparePattern $VALUES[];
    public static final ComparePattern ComparePattern;
    public static final ComparePattern CreatePattern;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(group/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        CreatePattern = new BaseLockPatternActivity.LPMode("CreatePattern", 0) {

            public String toString()
            {
                return "create";
            }

        };
        ComparePattern = new BaseLockPatternActivity.LPMode("ComparePattern", 1) {

            public String toString()
            {
                return "compare";
            }

        };
        $VALUES = (new .VALUES[] {
            CreatePattern, ComparePattern
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, _cls2 _pcls2)
    {
        this(s, i);
    }
}
