// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n;

import java.util.Locale;
import org.bouncycastle.i18n.filter.Filter;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;

// Referenced classes of package org.bouncycastle.i18n:
//            LocalizedMessage, LocaleString

protected class unpackedArgs
{

    protected static final int FILTER = 1;
    protected static final int FILTER_URL = 2;
    protected static final int NO_FILTER = 0;
    protected int argFilterType[];
    protected Object arguments[];
    protected Filter filter;
    protected Object filteredArgs[];
    protected boolean isLocaleSpecific[];
    final LocalizedMessage this$0;
    protected Object unpackedArgs[];

    private Object filter(int i, Object obj)
    {
        Object obj1;
label0:
        {
label1:
            {
                Object obj2 = obj;
                if (filter != null)
                {
                    obj1 = obj;
                    if (obj == null)
                    {
                        obj1 = "null";
                    }
                    obj2 = obj1;
                    switch (i)
                    {
                    default:
                        obj2 = null;
                        break;

                    case 0: // '\0'
                        break;

                    case 1: // '\001'
                        break label1;

                    case 2: // '\002'
                        break label0;
                    }
                }
                return obj2;
            }
            return filter.doFilter(obj1.toString());
        }
        return filter.doFilterUrl(obj1.toString());
    }

    public Object[] getArguments()
    {
        return arguments;
    }

    public Filter getFilter()
    {
        return filter;
    }

    public Object[] getFilteredArgs(Locale locale)
    {
        Object aobj[] = new Object[unpackedArgs.length];
        int i = 0;
        while (i < unpackedArgs.length) 
        {
            Object obj;
            if (filteredArgs[i] != null)
            {
                obj = filteredArgs[i];
            } else
            {
                obj = unpackedArgs[i];
                if (isLocaleSpecific[i])
                {
                    obj = ((LocaleString)obj).getLocaleString(locale);
                    obj = filter(argFilterType[i], obj);
                } else
                {
                    obj = filter(argFilterType[i], obj);
                    filteredArgs[i] = obj;
                }
            }
            aobj[i] = obj;
            i++;
        }
        return aobj;
    }

    public boolean isEmpty()
    {
        return unpackedArgs.length == 0;
    }

    public void setFilter(Filter filter1)
    {
        if (filter1 != filter)
        {
            for (int i = 0; i < unpackedArgs.length; i++)
            {
                filteredArgs[i] = null;
            }

        }
        filter = filter1;
    }

    ()
    {
        this(new Object[0]);
    }

    <init>(Object aobj[])
    {
        this$0 = LocalizedMessage.this;
        super();
        filter = null;
        arguments = aobj;
        unpackedArgs = new Object[aobj.length];
        filteredArgs = new Object[aobj.length];
        isLocaleSpecific = new boolean[aobj.length];
        argFilterType = new int[aobj.length];
        int i = 0;
        while (i < aobj.length) 
        {
            if (aobj[i] instanceof TrustedInput)
            {
                unpackedArgs[i] = ((TrustedInput)aobj[i]).getInput();
                argFilterType[i] = 0;
            } else
            if (aobj[i] instanceof UntrustedInput)
            {
                unpackedArgs[i] = ((UntrustedInput)aobj[i]).getInput();
                if (aobj[i] instanceof UntrustedUrlInput)
                {
                    argFilterType[i] = 2;
                } else
                {
                    argFilterType[i] = 1;
                }
            } else
            {
                unpackedArgs[i] = aobj[i];
                argFilterType[i] = 1;
            }
            isLocaleSpecific[i] = unpackedArgs[i] instanceof LocaleString;
            i++;
        }
    }
}
