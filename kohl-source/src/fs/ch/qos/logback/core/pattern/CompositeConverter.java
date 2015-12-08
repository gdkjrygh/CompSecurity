// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern;


// Referenced classes of package fs.ch.qos.logback.core.pattern:
//            DynamicConverter, Converter

public abstract class CompositeConverter extends DynamicConverter
{

    Converter childConverter;

    public CompositeConverter()
    {
    }

    public String convert(Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Converter converter = childConverter; converter != null; converter = converter.next)
        {
            converter.write(stringbuilder, obj);
        }

        return transform(obj, stringbuilder.toString());
    }

    public void setChildConverter(Converter converter)
    {
        childConverter = converter;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CompositeConverter<");
        if (formattingInfo != null)
        {
            stringbuilder.append(formattingInfo);
        }
        if (childConverter != null)
        {
            stringbuilder.append(", children: ").append(childConverter);
        }
        stringbuilder.append(">");
        return stringbuilder.toString();
    }

    protected abstract String transform(Object obj, String s);
}
