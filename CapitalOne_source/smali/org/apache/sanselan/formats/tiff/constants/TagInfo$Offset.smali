.class public Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Offset;
.super Lorg/apache/sanselan/formats/tiff/constants/TagInfo;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V
    .locals 6

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;ILorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    return-void
.end method
