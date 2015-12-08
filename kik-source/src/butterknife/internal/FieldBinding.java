// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;


// Referenced classes of package butterknife.internal:
//            Binding

final class FieldBinding
    implements Binding
{

    private final String name;
    private final boolean required;
    private final String type;

    FieldBinding(String s, String s1, boolean flag)
    {
        name = s;
        type = s1;
        required = flag;
    }

    public final String getDescription()
    {
        return (new StringBuilder("field '")).append(name).append("'").toString();
    }

    public final String getName()
    {
        return name;
    }

    public final String getType()
    {
        return type;
    }

    public final boolean isRequired()
    {
        return required;
    }
}
