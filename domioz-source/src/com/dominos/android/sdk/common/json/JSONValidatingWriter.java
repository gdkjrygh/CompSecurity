// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.json;


// Referenced classes of package com.dominos.android.sdk.common.json:
//            JSONWriter, StdoutStreamErrorListener, JSONValidator, JSONErrorListener

public class JSONValidatingWriter extends JSONWriter
{

    private JSONValidator validator;

    public JSONValidatingWriter()
    {
        this(((JSONErrorListener) (new StdoutStreamErrorListener())));
    }

    public JSONValidatingWriter(JSONErrorListener jsonerrorlistener)
    {
        this(new JSONValidator(jsonerrorlistener));
    }

    public JSONValidatingWriter(JSONErrorListener jsonerrorlistener, boolean flag)
    {
        this(new JSONValidator(jsonerrorlistener), flag);
    }

    public JSONValidatingWriter(JSONValidator jsonvalidator)
    {
        validator = jsonvalidator;
    }

    public JSONValidatingWriter(JSONValidator jsonvalidator, boolean flag)
    {
        super(flag);
        validator = jsonvalidator;
    }

    public JSONValidatingWriter(boolean flag)
    {
        this(((JSONErrorListener) (new StdoutStreamErrorListener())), flag);
    }

    private String validate(String s)
    {
        validator.validate(s);
        return s;
    }

    public String write(char c)
    {
        return validate(super.write(c));
    }

    public String write(double d)
    {
        return validate(super.write(d));
    }

    public String write(long l)
    {
        return validate(super.write(l));
    }

    public String write(Object obj)
    {
        return validate(super.write(obj));
    }

    public String write(boolean flag)
    {
        return validate(super.write(flag));
    }
}
