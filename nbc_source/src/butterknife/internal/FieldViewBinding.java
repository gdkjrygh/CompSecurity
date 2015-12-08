// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;


// Referenced classes of package butterknife.internal:
//            ViewBinding

final class FieldViewBinding
    implements ViewBinding
{

    private final String name;
    private final boolean required;
    private final String type;

    FieldViewBinding(String s, String s1, boolean flag)
    {
        name = s;
        type = s1;
        required = flag;
    }

    public String getDescription()
    {
        return (new StringBuilder()).append("field '").append(name).append("'").toString();
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

    public boolean requiresCast()
    {
        return !"android.view.View".equals(type);
    }
}
