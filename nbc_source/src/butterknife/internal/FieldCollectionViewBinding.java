// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;


// Referenced classes of package butterknife.internal:
//            ViewBinding

final class FieldCollectionViewBinding
    implements ViewBinding
{
    static final class Kind extends Enum
    {

        private static final Kind $VALUES[];
        public static final Kind ARRAY;
        public static final Kind LIST;

        public static Kind valueOf(String s)
        {
            return (Kind)Enum.valueOf(butterknife/internal/FieldCollectionViewBinding$Kind, s);
        }

        public static Kind[] values()
        {
            return (Kind[])$VALUES.clone();
        }

        static 
        {
            ARRAY = new Kind("ARRAY", 0);
            LIST = new Kind("LIST", 1);
            $VALUES = (new Kind[] {
                ARRAY, LIST
            });
        }

        private Kind(String s, int i)
        {
            super(s, i);
        }
    }


    private final Kind kind;
    private final String name;
    private final boolean required;
    private final String type;

    FieldCollectionViewBinding(String s, String s1, Kind kind1, boolean flag)
    {
        name = s;
        type = s1;
        kind = kind1;
        required = flag;
    }

    public String getDescription()
    {
        return (new StringBuilder()).append("field '").append(name).append("'").toString();
    }

    public Kind getKind()
    {
        return kind;
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public boolean isRequired()
    {
        return required;
    }
}
