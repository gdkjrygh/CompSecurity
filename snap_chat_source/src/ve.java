// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.snapchat.android.Timber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class ve
{

    private final Gson a;

    public ve()
    {
        this(new Gson());
    }

    private ve(Gson gson)
    {
        a = gson;
    }

    public final Va a(byte abyte0[], int i)
    {
        ZipInputStream zipinputstream = new ZipInputStream(new ByteArrayInputStream(abyte0, 0, i));
_L2:
        abyte0 = zipinputstream.getNextEntry();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (!TextUtils.equals(abyte0.getName(), "metadata.json")) goto _L2; else goto _L1
_L1:
        abyte0 = (Va)a.fromJson(new InputStreamReader(zipinputstream), Va);
        Pf.a(zipinputstream);
        return abyte0;
        Pf.a(zipinputstream);
_L3:
        return null;
        abyte0;
_L4:
        Timber.a("DSnapMetadataExtractor", abyte0);
        Timber.e("DSnapMetadataExtractor", "Failed to load metadata from metadata file array", new Object[0]);
        Pf.a(zipinputstream);
          goto _L3
        abyte0;
        Pf.a(zipinputstream);
        throw abyte0;
        abyte0;
          goto _L4
        abyte0;
          goto _L4
        abyte0;
          goto _L4
    }
}
