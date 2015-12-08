// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            bp, ci

public final class bz extends bp
{
    public static final class a extends ci
    {

        public final bp a(File file)
        {
            return new bz(file, (byte)0);
        }

        public a()
        {
        }
    }


    private bz(File file)
    {
        super(file);
    }

    bz(File file, byte byte0)
    {
        this(file);
    }

    public final Object a()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject((String)super.a());
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return jsonobject;
    }
}
