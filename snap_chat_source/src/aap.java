// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;

public final class aap extends aag
{
    public static final class a extends aaz
    {

        public final aag a(File file)
        {
            return new aap(file, (byte)0);
        }

        public a()
        {
        }
    }


    private aap(File file)
    {
        super(file);
    }

    aap(File file, byte byte0)
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
