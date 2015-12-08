// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONException;

public class lfn
{

    lfn()
    {
    }

    public Object a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new lfz("Cannot parse a null byte[]");
        }
        if (abyte0.length == 0)
        {
            throw new lfz("Cannot parse a 0 length byte[]");
        }
        try
        {
            abyte0 = b.u(new String(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new lfz("The resource data is corrupted. The container cannot be extracted from the binary data");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new lfz("The resource data is invalid. The container cannot be extracted from the binary data");
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        lqh.d("The container was successfully parsed from the resource");
        return abyte0;
    }
}
