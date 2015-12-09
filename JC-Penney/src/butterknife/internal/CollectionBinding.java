// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;


// Referenced classes of package butterknife.internal:
//            Binding

final class CollectionBinding
    implements Binding
{

    private final Kind kind;
    private final String name;
    private final boolean required;
    private final String type;

    CollectionBinding(String s, String s1, Kind kind1, boolean flag)
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
