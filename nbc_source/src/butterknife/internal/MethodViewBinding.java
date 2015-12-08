// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package butterknife.internal:
//            ViewBinding

final class MethodViewBinding
    implements ViewBinding
{

    private final String name;
    private final List parameters;
    private final boolean required;

    MethodViewBinding(String s, List list, boolean flag)
    {
        name = s;
        parameters = Collections.unmodifiableList(new ArrayList(list));
        required = flag;
    }

    public String getDescription()
    {
        return (new StringBuilder()).append("method '").append(name).append("'").toString();
    }

    public String getName()
    {
        return name;
    }

    public List getParameters()
    {
        return parameters;
    }

    public boolean isRequired()
    {
        return required;
    }
}
