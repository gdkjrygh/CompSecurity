// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.converter;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import retrofit.mime.MimeUtil;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

// Referenced classes of package retrofit.converter:
//            Converter, ConversionException

public class GsonConverter
    implements Converter
{

    private String charset;
    private final Gson gson;

    public GsonConverter(Gson gson1)
    {
        this(gson1, "UTF-8");
    }

    public GsonConverter(Gson gson1, String s)
    {
        gson = gson1;
        charset = s;
    }

    public Object fromBody(TypedInput typedinput, Type type)
    {
        Object obj;
        String s;
        Object obj1;
        obj = charset;
        s = ((String) (obj));
        if (typedinput.mimeType() != null)
        {
            s = MimeUtil.parseCharset(typedinput.mimeType(), ((String) (obj)));
        }
        obj = null;
        obj1 = null;
        typedinput = new InputStreamReader(typedinput.in(), s);
        obj = typedinput;
        type = ((Type) (gson.fromJson(typedinput, type)));
        try
        {
            typedinput.close();
        }
        // Misplaced declaration of an exception variable
        catch (TypedInput typedinput)
        {
            return type;
        }
        return type;
        type;
        typedinput = null;
_L4:
        obj = typedinput;
        throw new ConversionException(type);
        typedinput;
_L1:
        if (obj != null)
        {
            try
            {
                ((InputStreamReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Type type) { }
        }
        throw typedinput;
        typedinput;
        obj = obj1;
_L2:
        throw new ConversionException(typedinput);
        typedinput;
          goto _L1
        type;
        obj = typedinput;
        typedinput = type;
          goto _L2
        type;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public TypedOutput toBody(Object obj)
    {
        try
        {
            obj = new JsonTypedOutput(gson.toJson(obj).getBytes(charset), charset);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        return ((TypedOutput) (obj));
    }

    private class JsonTypedOutput
        implements TypedOutput
    {

        private final byte jsonBytes[];
        private final String mimeType;

        public String fileName()
        {
            return null;
        }

        public long length()
        {
            return (long)jsonBytes.length;
        }

        public String mimeType()
        {
            return mimeType;
        }

        public void writeTo(OutputStream outputstream)
        {
            outputstream.write(jsonBytes);
        }

        JsonTypedOutput(byte abyte0[], String s)
        {
            jsonBytes = abyte0;
            mimeType = (new StringBuilder("application/json; charset=")).append(s).toString();
        }
    }

}
