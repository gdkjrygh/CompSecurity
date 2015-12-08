// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;


// Referenced classes of package butterknife.internal:
//            FieldCollectionViewBinding

static final class  extends Enum
{

    private static final LIST $VALUES[];
    public static final LIST ARRAY;
    public static final LIST LIST;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(butterknife/internal/FieldCollectionViewBinding$Kind, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ARRAY = new <init>("ARRAY", 0);
        LIST = new <init>("LIST", 1);
        $VALUES = (new .VALUES[] {
            ARRAY, LIST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
