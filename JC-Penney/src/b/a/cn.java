// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package b.a:
//            bc

public final class cn extends bc
{

    private cn(File file)
    {
        super(file);
    }

    cn(File file, byte byte0)
    {
        this(file);
    }

    public final Object a()
    {
        JSONArray jsonarray;
        try
        {
            jsonarray = new JSONArray((String)super.a());
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return jsonarray;
    }
}
