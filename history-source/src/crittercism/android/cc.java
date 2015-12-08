// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            cg, cf, bt, bn, 
//            br, cr

public final class cc
    implements cg
{

    private JSONObject a;
    private JSONObject b;
    private JSONArray c;
    private JSONArray d;
    private File e;
    private String f;

    public cc(File file, br br1, br br2, br br3, br br4)
    {
        file.exists();
        f = cf.a.a();
        e = file;
        a = (new bt()).a(new bw.c()).a(new bw.b()).a(new bw.d()).a(new bw.f()).a(new bw.o()).a(new bw.p()).a(new bw.j()).a(new bw.h()).a(new bw.z()).a(new bw.aa()).a(new bw.k()).a(new bw.r()).a(new bw.m()).a(new bw.s()).a(new bw.w()).a(new bw.x()).a();
        file = new HashMap();
        file.put("crashed_session", (new bn(br1)).a);
        if (br2.b() > 0)
        {
            file.put("previous_session", (new bn(br2)).a);
        }
        b = new JSONObject(file);
        c = (new bn(br3)).a;
        d = (new bn(br4)).a;
    }

    public final void a(OutputStream outputstream)
    {
        HashMap hashmap1 = new HashMap();
        hashmap1.put("app_state", a);
        hashmap1.put("breadcrumbs", b);
        hashmap1.put("endpoints", c);
        hashmap1.put("systemBreadcrumbs", d);
        byte abyte0[] = new byte[0];
        byte abyte2[] = new byte[8192];
        FileInputStream fileinputstream = new FileInputStream(e);
        do
        {
            int i = fileinputstream.read(abyte2);
            if (i != -1)
            {
                byte abyte1[] = new byte[abyte0.length + i];
                System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
                System.arraycopy(abyte2, 0, abyte1, abyte0.length, i);
                abyte0 = abyte1;
            } else
            {
                fileinputstream.close();
                HashMap hashmap = new HashMap();
                hashmap.put("dmp_name", e.getName());
                hashmap.put("dmp_file", cr.a(abyte0));
                hashmap1.put("ndk_dmp_info", new JSONObject(hashmap));
                outputstream.write((new JSONObject(hashmap1)).toString().getBytes());
                return;
            }
        } while (true);
    }

    public final String e()
    {
        return f;
    }
}
