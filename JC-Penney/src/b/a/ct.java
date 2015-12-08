// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            cz, cy, bh, bo, 
//            bn, bp, br, ca, 
//            cb, bv, bt, cl, 
//            bm, bw, cd, by, 
//            ce, ci, cj, ba, 
//            be, dm

public final class ct
    implements cz
{

    private JSONObject a;
    private JSONObject b;
    private JSONArray c;
    private JSONArray d;
    private File e;
    private String f;

    public ct(File file, be be1, be be2, be be3, be be4)
    {
        file.exists();
        f = cy.a.a();
        e = file;
        a = (new bh()).a(new bo()).a(new bn()).a(new bp()).a(new br()).a(new ca()).a(new cb()).a(new bv()).a(new bt()).a(new cl()).a(new bm()).a(new bw()).a(new cd()).a(new by()).a(new ce()).a(new ci()).a(new cj()).a();
        file = new HashMap();
        file.put("crashed_session", (new ba(be1)).a);
        if (be2.b() > 0)
        {
            file.put("previous_session", (new ba(be2)).a);
        }
        b = new JSONObject(file);
        c = (new ba(be3)).a;
        d = (new ba(be4)).a;
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
                hashmap.put("dmp_file", dm.a(abyte0));
                hashmap1.put("ndk_dmp_info", new JSONObject(hashmap));
                outputstream.write((new JSONObject(hashmap1)).toString().getBytes());
                return;
            }
        } while (true);
    }

    public final String j()
    {
        return f;
    }
}
