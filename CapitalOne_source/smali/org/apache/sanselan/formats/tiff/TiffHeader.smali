.class public Lorg/apache/sanselan/formats/tiff/TiffHeader;
.super Lorg/apache/sanselan/formats/tiff/TiffElement;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(III)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-direct {p0, v0, v1}, Lorg/apache/sanselan/formats/tiff/TiffElement;-><init>(II)V

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/TiffHeader;->a:I

    iput p2, p0, Lorg/apache/sanselan/formats/tiff/TiffHeader;->b:I

    iput p3, p0, Lorg/apache/sanselan/formats/tiff/TiffHeader;->c:I

    return-void
.end method
