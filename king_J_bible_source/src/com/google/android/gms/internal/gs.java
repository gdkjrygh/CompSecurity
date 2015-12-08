// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.a;
import com.google.android.gms.drive.metadata.internal.e;
import com.google.android.gms.drive.metadata.internal.h;
import com.google.android.gms.drive.metadata.internal.i;
import com.google.android.gms.drive.metadata.internal.j;

// Referenced classes of package com.google.android.gms.internal:
//            gu

public class gs
{
    public static class a extends com.google.android.gms.drive.metadata.internal.a
        implements SearchableMetadataField
    {

        public a(String s, int k)
        {
            super(s, k);
        }
    }

    public static class b extends j
        implements SearchableMetadataField
    {

        public b(String s, int k)
        {
            super(s, k);
        }
    }

    public static class c extends com.google.android.gms.drive.metadata.internal.g
        implements SearchableCollectionMetadataField
    {

        public c(String s, int k)
        {
            super(s, k);
        }
    }

    public static class d extends com.google.android.gms.drive.metadata.internal.e
        implements SortableMetadataField
    {

        public d(String s, int k)
        {
            super(s, k);
        }
    }

    public static class e extends com.google.android.gms.drive.metadata.internal.a
        implements SearchableMetadataField
    {

        public e(String s, int k)
        {
            super(s, k);
        }
    }

    public static class f extends j
        implements SearchableMetadataField, SortableMetadataField
    {

        public f(String s, int k)
        {
            super(s, k);
        }
    }

    public static class g extends com.google.android.gms.drive.metadata.internal.a
        implements SearchableMetadataField
    {

        protected Object b(DataHolder dataholder, int k, int l)
        {
            return d(dataholder, k, l);
        }

        protected Boolean d(DataHolder dataholder, int k, int l)
        {
            boolean flag;
            if (dataholder.getInteger(getName(), k, l) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public g(String s, int k)
        {
            super(s, k);
        }
    }


    public static final MetadataField FR;
    public static final MetadataField FS = new j("alternateLink", 0x419ce0);
    public static final MetadataField FT = new j("description", 0x419ce0);
    public static final MetadataField FU = new j("embedLink", 0x419ce0);
    public static final MetadataField FV = new j("fileExtension", 0x419ce0);
    public static final MetadataField FW = new com.google.android.gms.drive.metadata.internal.e("fileSize", 0x419ce0);
    public static final MetadataField FX = new com.google.android.gms.drive.metadata.internal.a("hasThumbnail", 0x419ce0);
    public static final MetadataField FY = new j("indexableText", 0x419ce0);
    public static final MetadataField FZ = new com.google.android.gms.drive.metadata.internal.a("isAppData", 0x419ce0);
    public static final MetadataField Ga = new com.google.android.gms.drive.metadata.internal.a("isCopyable", 0x419ce0);
    public static final MetadataField Gb = new com.google.android.gms.drive.metadata.internal.a("isEditable", 0x3e8fa0);
    public static final a Gc = new a("isPinned", 0x3e8fa0);
    public static final MetadataField Gd = new com.google.android.gms.drive.metadata.internal.a("isRestricted", 0x419ce0);
    public static final MetadataField Ge = new com.google.android.gms.drive.metadata.internal.a("isShared", 0x419ce0);
    public static final MetadataField Gf = new com.google.android.gms.drive.metadata.internal.a("isTrashable", 0x432380);
    public static final MetadataField Gg = new com.google.android.gms.drive.metadata.internal.a("isViewed", 0x419ce0);
    public static final b Gh = new b("mimeType", 0x3e8fa0);
    public static final MetadataField Gi = new j("originalFilename", 0x419ce0);
    public static final com.google.android.gms.drive.metadata.b Gj = new i("ownerNames", 0x419ce0);
    public static final c Gk = new c("parents", 0x3e8fa0);
    public static final d Gl = new d("quotaBytesUsed", 0x419ce0);
    public static final e Gm = new e("starred", 0x3e8fa0);
    public static final MetadataField Gn = new h("thumbnail", 0x432380) {

        protected Object b(DataHolder dataholder, int k, int l)
        {
            return i(dataholder, k, l);
        }

        protected Bitmap i(DataHolder dataholder, int k, int l)
        {
            throw new IllegalStateException("Thumbnail field is write only");
        }

    };
    public static final f Go = new f("title", 0x3e8fa0);
    public static final g Gp = new g("trashed", 0x3e8fa0);
    public static final MetadataField Gq = new j("webContentLink", 0x419ce0);
    public static final MetadataField Gr = new j("webViewLink", 0x419ce0);

    static 
    {
        FR = gu.Gx;
    }
}
