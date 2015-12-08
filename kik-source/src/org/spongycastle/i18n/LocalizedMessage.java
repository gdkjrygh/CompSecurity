// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.i18n;


public class LocalizedMessage
{
    protected class FilteredArguments
    {

        protected Object a[];

        public final Object[] a()
        {
            return a;
        }
    }


    protected final String a;
    protected final String b;
    protected String c;
    protected FilteredArguments d;
    protected FilteredArguments e;
    protected ClassLoader f;

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("Resource: \"").append(b);
        stringbuffer.append("\" Id: \"").append(a).append("\"");
        stringbuffer.append(" Arguments: ").append(d.a().length).append(" normal");
        if (e != null && e.a().length > 0)
        {
            stringbuffer.append(", ").append(e.a().length).append(" extra");
        }
        stringbuffer.append(" Encoding: ").append(c);
        stringbuffer.append(" ClassLoader: ").append(f);
        return stringbuffer.toString();
    }
}
