// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package crittercism.android:
//            bp, ci

public final class by extends bp
{
    public static final class a extends ci
    {

        public final bp a(File file)
        {
            return new by(file, (byte)0);
        }

        public a()
        {
        }
    }


    private by(File file)
    {
        super(file);
    }

    by(File file, byte byte0)
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
