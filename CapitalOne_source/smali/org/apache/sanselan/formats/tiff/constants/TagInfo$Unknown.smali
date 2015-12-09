.class public final Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Unknown;
.super Lorg/apache/sanselan/formats/tiff/constants/TagInfo;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V
    .locals 6

    const/4 v2, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, v2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .locals 1

    invoke-super {p0, p1}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Ljava/lang/Object;I)[B
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a(Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Ljava/lang/Object;I)[B

    move-result-object v0

    return-object v0
.end method
