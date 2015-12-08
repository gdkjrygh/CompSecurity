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
import com.google.android.gms.drive.metadata.internal.m;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.internal:
//            kg, ke

public class kd
{
    public static class a extends ke
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

        protected Object c(DataHolder dataholder, int i, int j)
        {
            return e(dataholder, i, j);
        }

        protected Boolean e(DataHolder dataholder, int i, int j)
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


    public static final MetadataField PM;
    public static final MetadataField PN = new l("alternateLink", 0x419ce0);
    public static final a PO = new a(0x4c4b40);
    public static final MetadataField PP = new l("description", 0x419ce0);
    public static final MetadataField PQ = new l("embedLink", 0x419ce0);
    public static final MetadataField PR = new l("fileExtension", 0x419ce0);
    public static final MetadataField PS = new com.google.android.gms.drive.metadata.internal.g("fileSize", 0x419ce0);
    public static final MetadataField PT = new com.google.android.gms.drive.metadata.internal.b("hasThumbnail", 0x419ce0);
    public static final MetadataField PU = new l("indexableText", 0x419ce0);
    public static final MetadataField PV = new com.google.android.gms.drive.metadata.internal.b("isAppData", 0x419ce0);
    public static final MetadataField PW = new com.google.android.gms.drive.metadata.internal.b("isCopyable", 0x419ce0);
    public static final MetadataField PX = new com.google.android.gms.drive.metadata.internal.b("isEditable", 0x3e8fa0);
    public static final b PY = new b("isPinned", 0x3e8fa0);
    public static final MetadataField PZ = new com.google.android.gms.drive.metadata.internal.b("isRestricted", 0x419ce0);
    public static final MetadataField Qa = new com.google.android.gms.drive.metadata.internal.b("isShared", 0x419ce0);
    public static final MetadataField Qb = new com.google.android.gms.drive.metadata.internal.b("isTrashable", 0x432380);
    public static final MetadataField Qc = new com.google.android.gms.drive.metadata.internal.b("isViewed", 0x419ce0);
    public static final c Qd = new c("mimeType", 0x3e8fa0);
    public static final MetadataField Qe = new l("originalFilename", 0x419ce0);
    public static final com.google.android.gms.drive.metadata.b Qf = new k("ownerNames", 0x419ce0);
    public static final m Qg = new m("lastModifyingUser", 0x5b8d80);
    public static final m Qh = new m("sharingUser", 0x5b8d80);
    public static final d Qi = new d("parents", 0x3e8fa0);
    public static final e Qj = new e("quotaBytesUsed", 0x419ce0);
    public static final f Qk = new f("starred", 0x3e8fa0);
    public static final MetadataField Ql = new j("thumbnail", Collections.emptySet(), Collections.emptySet(), 0x432380) {

        protected Object c(DataHolder dataholder, int i, int i1)
        {
            return k(dataholder, i, i1);
        }

        protected com.google.android.gms.common.data.a k(DataHolder dataholder, int i, int i1)
        {
            throw new IllegalStateException("Thumbnail field is write only");
        }

    };
    public static final g Qm = new g("title", 0x3e8fa0);
    public static final h Qn = new h("trashed", 0x3e8fa0);
    public static final MetadataField Qo = new l("webContentLink", 0x419ce0);
    public static final MetadataField Qp = new l("webViewLink", 0x419ce0);
    public static final MetadataField Qq = new l("uniqueIdentifier", 0x4c4b40);
    public static final com.google.android.gms.drive.metadata.internal.b Qr = new com.google.android.gms.drive.metadata.internal.b("writersCanShare", 0x5b8d80);
    public static final MetadataField Qs = new l("role", 0x5b8d80);

    static 
    {
        PM = kg.Qy;
    }
}
