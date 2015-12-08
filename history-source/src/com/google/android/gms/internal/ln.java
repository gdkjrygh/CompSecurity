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
//            lq, lo

public class ln
{
    public static class a extends lo
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


    public static final c RA = new c("mimeType", 0x3e8fa0);
    public static final MetadataField RB = new l("originalFilename", 0x419ce0);
    public static final com.google.android.gms.drive.metadata.b RC = new k("ownerNames", 0x419ce0);
    public static final m RD = new m("lastModifyingUser", 0x5b8d80);
    public static final m RE = new m("sharingUser", 0x5b8d80);
    public static final d RF = new d("parents", 0x3e8fa0);
    public static final e RG = new e("quotaBytesUsed", 0x419ce0);
    public static final f RH = new f("starred", 0x3e8fa0);
    public static final MetadataField RI = new j("thumbnail", Collections.emptySet(), Collections.emptySet(), 0x432380) {

        protected Object c(DataHolder dataholder, int i, int i1)
        {
            return k(dataholder, i, i1);
        }

        protected com.google.android.gms.common.data.a k(DataHolder dataholder, int i, int i1)
        {
            throw new IllegalStateException("Thumbnail field is write only");
        }

    };
    public static final g RJ = new g("title", 0x3e8fa0);
    public static final h RK = new h("trashed", 0x3e8fa0);
    public static final MetadataField RL = new l("webContentLink", 0x419ce0);
    public static final MetadataField RM = new l("webViewLink", 0x419ce0);
    public static final MetadataField RN = new l("uniqueIdentifier", 0x4c4b40);
    public static final com.google.android.gms.drive.metadata.internal.b RO = new com.google.android.gms.drive.metadata.internal.b("writersCanShare", 0x5b8d80);
    public static final MetadataField RP = new l("role", 0x5b8d80);
    public static final MetadataField Rj;
    public static final MetadataField Rk = new l("alternateLink", 0x419ce0);
    public static final a Rl = new a(0x4c4b40);
    public static final MetadataField Rm = new l("description", 0x419ce0);
    public static final MetadataField Rn = new l("embedLink", 0x419ce0);
    public static final MetadataField Ro = new l("fileExtension", 0x419ce0);
    public static final MetadataField Rp = new com.google.android.gms.drive.metadata.internal.g("fileSize", 0x419ce0);
    public static final MetadataField Rq = new com.google.android.gms.drive.metadata.internal.b("hasThumbnail", 0x419ce0);
    public static final MetadataField Rr = new l("indexableText", 0x419ce0);
    public static final MetadataField Rs = new com.google.android.gms.drive.metadata.internal.b("isAppData", 0x419ce0);
    public static final MetadataField Rt = new com.google.android.gms.drive.metadata.internal.b("isCopyable", 0x419ce0);
    public static final MetadataField Ru = new com.google.android.gms.drive.metadata.internal.b("isEditable", 0x3e8fa0);
    public static final b Rv = new b("isPinned", 0x3e8fa0);
    public static final MetadataField Rw = new com.google.android.gms.drive.metadata.internal.b("isRestricted", 0x419ce0);
    public static final MetadataField Rx = new com.google.android.gms.drive.metadata.internal.b("isShared", 0x419ce0);
    public static final MetadataField Ry = new com.google.android.gms.drive.metadata.internal.b("isTrashable", 0x432380);
    public static final MetadataField Rz = new com.google.android.gms.drive.metadata.internal.b("isViewed", 0x419ce0);

    static 
    {
        Rj = lq.RV;
    }
}
