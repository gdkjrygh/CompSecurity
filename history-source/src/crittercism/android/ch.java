// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.OutputStream;
import org.json.JSONArray;

// Referenced classes of package crittercism.android:
//            bo, dx

public abstract class ch extends bo
{

    public ch()
    {
    }

    public abstract JSONArray a();

    public final void a(OutputStream outputstream)
    {
        String s = a().toString();
        (new StringBuilder("BREADCRUMB WRITING ")).append(s);
        dx.b();
        outputstream.write(s.getBytes());
    }
}
