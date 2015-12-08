// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.internal.b;
import com.google.android.gms.drive.metadata.internal.g;
import com.google.android.gms.drive.metadata.internal.i;
import com.google.android.gms.drive.metadata.internal.j;
import com.google.android.gms.drive.metadata.internal.k;
import com.google.android.gms.drive.metadata.internal.l;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.internal:
//            it, ir

public class iq
{
    public static class a extends ir
        implements SearchableMetadataField
    {

        public a(int i)
        {
            super(i);
        }
    }

    public static class b extends com.google.android.gms.drive.metadata.internal.b
        implements SearchableMetadataField
    {

        public b(String s, int i)
        {
            super(s, i);
        }
    }

    public static class c extends l
        implements SearchableMetadataField
    {

        public c(String s, int i)
        {
            super(s, i);
        }
    }

    public static class d extends i
        implements SearchableCollectionMetadataField
    {

        public d(String s, int j)
        {
            super(s, j);
        }
    }

    public static class e extends com.google.android.gms.drive.metadata.internal.g
        implements SortableMetadataField
    {

        public e(String s, int i)
        {
            super(s, i);
        }
    }

    public static class f extends com.google.android.gms.drive.metadata.internal.b
        implements SearchableMetadataField
    {

        public f(String s, int i)
        {
            super(s, i);
        }
    }

    public static class g extends l
        implements SearchableMetadataField, SortableMetadataField
    {

        public g(String s, int i)
        {
            super(s, i);
        }
    }

    public static class h extends com.google.android.gms.drive.metadata.internal.b
        implements SearchableMetadataField
    {

        protected Object b(DataHolder dataholder, int i, int j)
        {
            return d(dataholder, i, j);
        }

        protected Boolean d(DataHolder dataholder, int i, int j)
        {
            boolean flag;
            if (dataholder.b(getName(), i, j) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public h(String s, int i)
        {
            super(s, i);
        }
    }


    public static final MetadataField JT;
    public static final MetadataField JU = new l("alternateLink", 0x419ce0);
    public static final a JV = new a(0x4c4b40);
    public static final MetadataField JW = new l("description", 0x419ce0);
    public static final MetadataField JX = new l("embedLink", 0x419ce0);
    public static final MetadataField JY = new l("fileExtension", 0x419ce0);
    public static final MetadataField JZ = new com.google.android.gms.drive.metadata.internal.g("fileSize", 0x419ce0);
    public static final MetadataField Ka = new com.google.android.gms.drive.metadata.internal.b("hasThumbnail", 0x419ce0);
    public static final MetadataField Kb = new l("indexableText", 0x419ce0);
    public static final MetadataField Kc = new com.google.android.gms.drive.metadata.internal.b("isAppData", 0x419ce0);
    public static final MetadataField Kd = new com.google.android.gms.drive.metadata.internal.b("isCopyable", 0x419ce0);
    public static final MetadataField Ke = new com.google.android.gms.drive.metadata.internal.b("isEditable", 0x3e8fa0);
    public static final b Kf = new b("isPinned", 0x3e8fa0);
    public static final MetadataField Kg = new com.google.android.gms.drive.metadata.internal.b("isRestricted", 0x419ce0);
    public static final MetadataField Kh = new com.google.android.gms.drive.metadata.internal.b("isShared", 0x419ce0);
    public static final MetadataField Ki = new com.google.android.gms.drive.metadata.internal.b("isTrashable", 0x432380);
    public static final MetadataField Kj = new com.google.android.gms.drive.metadata.internal.b("isViewed", 0x419ce0);
    public static final c Kk = new c("mimeType", 0x3e8fa0);
    public static final MetadataField Kl = new l("originalFilename", 0x419ce0);
    public static final com.google.android.gms.drive.metadata.b Km = new k("ownerNames", 0x419ce0);
    public static final d Kn = new d("parents", 0x3e8fa0);
    public static final e Ko = new e("quotaBytesUsed", 0x419ce0);
    public static final f Kp = new f("starred", 0x3e8fa0);
    public static final MetadataField Kq = new j("thumbnail", Collections.emptySet(), Collections.emptySet(), 0x432380) {

        protected Object b(DataHolder dataholder, int i1, int j1)
        {
            return i(dataholder, i1, j1);
        }

        protected com.google.android.gms.common.data.a i(DataHolder dataholder, int i1, int j1)
        {
            throw new IllegalStateException("Thumbnail field is write only");
        }

    };
    public static final g Kr = new g("title", 0x3e8fa0);
    public static final h Ks = new h("trashed", 0x3e8fa0);
    public static final MetadataField Kt = new l("webContentLink", 0x419ce0);
    public static final MetadataField Ku = new l("webViewLink", 0x419ce0);
    public static final MetadataField Kv = new l("uniqueIdentifier", 0x4c4b40);

    static 
    {
        JT = it.KB;
    }
}
