.class public Lorg/apache/sanselan/formats/jpeg/JpegImageParser;
.super Lorg/apache/sanselan/ImageParser;

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegConstants;
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffTagConstants;


# static fields
.field public static final k:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, ".jpg"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, ".jpeg"

    aput-object v2, v0, v1

    sput-object v0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->k:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/apache/sanselan/ImageParser;-><init>()V

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->b()V

    return-void
.end method

.method static synthetic a(I[I)Z
    .locals 4

    const/4 v2, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    move v1, v2

    :cond_0
    :goto_0
    return v1

    :cond_1
    move v0, v1

    :goto_1
    array-length v3, p1

    if-ge v0, v3, :cond_0

    aget v3, p1, v0

    if-ne v3, p0, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method
