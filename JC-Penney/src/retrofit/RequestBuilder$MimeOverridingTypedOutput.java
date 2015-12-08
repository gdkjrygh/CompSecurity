// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.OutputStream;
import retrofit.mime.TypedOutput;

class mimeType
    implements TypedOutput
{

    private final TypedOutput _flddelegate;
    private final String mimeType;

    public String fileName()
    {
        return _flddelegate.fileName();
    }

    public long length()
    {
        return _flddelegate.length();
    }

    public String mimeType()
    {
        return mimeType;
    }

    public void writeTo(OutputStream outputstream)
    {
        _flddelegate.writeTo(outputstream);
    }

    (TypedOutput typedoutput, String s)
    {
        _flddelegate = typedoutput;
        mimeType = s;
    }
}
