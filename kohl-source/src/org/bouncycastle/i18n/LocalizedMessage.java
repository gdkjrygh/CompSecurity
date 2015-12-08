// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TimeZone;
import org.bouncycastle.i18n.filter.Filter;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;

// Referenced classes of package org.bouncycastle.i18n:
//            MissingEntryException, LocaleString

public class LocalizedMessage
{
    protected class FilteredArguments
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

        FilteredArguments()
        {
            this(new Object[0]);
        }

        FilteredArguments(Object aobj[])
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


    public static final String DEFAULT_ENCODING = "ISO-8859-1";
    protected FilteredArguments arguments;
    protected String encoding;
    protected FilteredArguments extraArgs;
    protected Filter filter;
    protected final String id;
    protected ClassLoader loader;
    protected final String resource;

    public LocalizedMessage(String s, String s1)
        throws NullPointerException
    {
        encoding = "ISO-8859-1";
        extraArgs = null;
        filter = null;
        loader = null;
        if (s == null || s1 == null)
        {
            throw new NullPointerException();
        } else
        {
            id = s1;
            resource = s;
            arguments = new FilteredArguments();
            return;
        }
    }

    public LocalizedMessage(String s, String s1, String s2)
        throws NullPointerException, UnsupportedEncodingException
    {
        encoding = "ISO-8859-1";
        extraArgs = null;
        filter = null;
        loader = null;
        if (s == null || s1 == null)
        {
            throw new NullPointerException();
        }
        id = s1;
        resource = s;
        arguments = new FilteredArguments();
        if (!Charset.isSupported(s2))
        {
            throw new UnsupportedEncodingException((new StringBuilder()).append("The encoding \"").append(s2).append("\" is not supported.").toString());
        } else
        {
            encoding = s2;
            return;
        }
    }

    public LocalizedMessage(String s, String s1, String s2, Object aobj[])
        throws NullPointerException, UnsupportedEncodingException
    {
        encoding = "ISO-8859-1";
        extraArgs = null;
        filter = null;
        loader = null;
        if (s == null || s1 == null || aobj == null)
        {
            throw new NullPointerException();
        }
        id = s1;
        resource = s;
        arguments = new FilteredArguments(aobj);
        if (!Charset.isSupported(s2))
        {
            throw new UnsupportedEncodingException((new StringBuilder()).append("The encoding \"").append(s2).append("\" is not supported.").toString());
        } else
        {
            encoding = s2;
            return;
        }
    }

    public LocalizedMessage(String s, String s1, Object aobj[])
        throws NullPointerException
    {
        encoding = "ISO-8859-1";
        extraArgs = null;
        filter = null;
        loader = null;
        if (s == null || s1 == null || aobj == null)
        {
            throw new NullPointerException();
        } else
        {
            id = s1;
            resource = s;
            arguments = new FilteredArguments(aobj);
            return;
        }
    }

    protected String addExtraArgs(String s, Locale locale)
    {
        String s1 = s;
        if (extraArgs != null)
        {
            s = new StringBuffer(s);
            locale = ((Locale) (extraArgs.getFilteredArgs(locale)));
            for (int i = 0; i < locale.length; i++)
            {
                s.append(locale[i]);
            }

            s1 = s.toString();
        }
        return s1;
    }

    protected String formatWithTimeZone(String s, Object aobj[], Locale locale, TimeZone timezone)
    {
        MessageFormat messageformat = new MessageFormat(" ");
        messageformat.setLocale(locale);
        messageformat.applyPattern(s);
        if (!timezone.equals(TimeZone.getDefault()))
        {
            s = messageformat.getFormats();
            for (int i = 0; i < s.length; i++)
            {
                if (s[i] instanceof DateFormat)
                {
                    locale = (DateFormat)s[i];
                    locale.setTimeZone(timezone);
                    messageformat.setFormat(i, locale);
                }
            }

        }
        return messageformat.format(((Object) (aobj)));
    }

    public Object[] getArguments()
    {
        return arguments.getArguments();
    }

    public ClassLoader getClassLoader()
    {
        return loader;
    }

    public String getEntry(String s, Locale locale, TimeZone timezone)
        throws MissingEntryException
    {
        String s1;
        String s2 = id;
        s1 = s2;
        if (s != null)
        {
            s1 = (new StringBuilder()).append(s2).append(".").append(s).toString();
        }
        if (loader != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        s = ResourceBundle.getBundle(resource, locale);
_L1:
        s = s.getString(s1);
        if (!encoding.equals("ISO-8859-1"))
        {
            s = new String(s.getBytes("ISO-8859-1"), encoding);
        }
        String s3 = s;
        if (!arguments.isEmpty())
        {
            s3 = formatWithTimeZone(s, arguments.getFilteredArgs(locale), locale, timezone);
        }
        return addExtraArgs(s3, locale);
        s = ResourceBundle.getBundle(resource, locale, loader);
          goto _L1
        s;
        timezone = (new StringBuilder()).append("Can't find entry ").append(s1).append(" in resource file ").append(resource).append(".").toString();
        String s4 = resource;
        if (loader != null)
        {
            s = loader;
        } else
        {
            s = getClassLoader();
        }
        throw new MissingEntryException(timezone, s4, s1, locale, s);
        s;
        throw new RuntimeException(s);
    }

    public Object[] getExtraArgs()
    {
        if (extraArgs == null)
        {
            return null;
        } else
        {
            return extraArgs.getArguments();
        }
    }

    public Filter getFilter()
    {
        return filter;
    }

    public String getId()
    {
        return id;
    }

    public String getResource()
    {
        return resource;
    }

    public void setClassLoader(ClassLoader classloader)
    {
        loader = classloader;
    }

    public void setExtraArgument(Object obj)
    {
        setExtraArguments(new Object[] {
            obj
        });
    }

    public void setExtraArguments(Object aobj[])
    {
        if (aobj != null)
        {
            extraArgs = new FilteredArguments(aobj);
            extraArgs.setFilter(filter);
            return;
        } else
        {
            extraArgs = null;
            return;
        }
    }

    public void setFilter(Filter filter1)
    {
        arguments.setFilter(filter1);
        if (extraArgs != null)
        {
            extraArgs.setFilter(filter1);
        }
        filter = filter1;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("Resource: \"").append(resource);
        stringbuffer.append("\" Id: \"").append(id).append("\"");
        stringbuffer.append(" Arguments: ").append(arguments.getArguments().length).append(" normal");
        if (extraArgs != null && extraArgs.getArguments().length > 0)
        {
            stringbuffer.append(", ").append(extraArgs.getArguments().length).append(" extra");
        }
        stringbuffer.append(" Encoding: ").append(encoding);
        stringbuffer.append(" ClassLoader: ").append(loader);
        return stringbuffer.toString();
    }
}
