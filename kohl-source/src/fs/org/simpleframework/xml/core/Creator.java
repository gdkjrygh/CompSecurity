// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Context, Criteria, Parameter

interface Creator
{

    public abstract List getInitializers();

    public abstract Object getInstance(Context context, Criteria criteria)
        throws Exception;

    public abstract Parameter getParameter(String s);

    public abstract List getParameters();

    public abstract boolean isDefault();
}
