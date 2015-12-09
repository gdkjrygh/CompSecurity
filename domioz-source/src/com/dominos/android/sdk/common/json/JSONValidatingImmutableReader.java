// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.json;


// Referenced classes of package com.dominos.android.sdk.common.json:
//            JSONReader, StdoutStreamErrorListener, JSONValidator, JSONErrorListener

public class JSONValidatingImmutableReader extends JSONReader
{

    public static final Object INVALID = new Object();
    private JSONValidator validator;

    public JSONValidatingImmutableReader()
    {
        this(((JSONErrorListener) (new StdoutStreamErrorListener())));
    }

    public JSONValidatingImmutableReader(JSONErrorListener jsonerrorlistener)
    {
        this(new JSONValidator(jsonerrorlistener));
    }

    public JSONValidatingImmutableReader(JSONValidator jsonvalidator)
    {
        validator = jsonvalidator;
    }

    public Object read(String s)
    {
        if (!validator.validate(s))
        {
            return INVALID;
        } else
        {
            return super.read(s);
        }
    }

}
