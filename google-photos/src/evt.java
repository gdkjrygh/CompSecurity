// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class evt extends Enum
    implements fab
{

    public static final evt a;
    public static final evt b;
    public static final evt c;
    public static final evt d;
    public static final evt e;
    private static final evt h[];
    private final String f;
    private final String g;

    private evt(String s, int i, String s1, String s2)
    {
        super(s, i);
        f = s1;
        g = s2;
    }

    public static evt valueOf(String s)
    {
        return (evt)Enum.valueOf(evt, s);
    }

    public static evt[] values()
    {
        return (evt[])h.clone();
    }

    public final String a()
    {
        return f;
    }

    public final String b()
    {
        return g;
    }

    static 
    {
        a = new evt("MONTH_TIMESTAMP_PROCESSOR", 0, "com.google.android.apps.photos.database.processor", "MonthTimestampProcessor");
        b = new evt("COLLECTION_AUDIENCE_PROCESSOR", 1, "com.google.android.apps.photos.database.processor", "CollectionAudienceProcessor");
        c = new evt("DIMENSIONS_PROCESSOR", 2, "com.google.android.apps.photos.database.processor", "DimensionsProcessor");
        d = new evt("ALBUM_ORDER_PROCESSOR", 3, "com.google.android.apps.photos.database.processor", "AlbumOrderProcessor");
        e = new evt("ASSOCIATED_ENVELOPE_PROCESSOR", 4, "com.google.android.apps.photos.database.processor", "AssociatedEnvelopeProcessor");
        h = (new evt[] {
            a, b, c, d, e
        });
    }
}
