.class public Lorg/apache/sanselan/formats/tiff/TiffImageParser;
.super Lorg/apache/sanselan/ImageParser;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# static fields
.field private static final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, ".tif"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, ".tiff"

    aput-object v2, v0, v1

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->b:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/apache/sanselan/ImageParser;-><init>()V

    return-void
.end method
