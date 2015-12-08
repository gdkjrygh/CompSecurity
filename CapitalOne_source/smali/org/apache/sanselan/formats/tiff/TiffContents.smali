.class public Lorg/apache/sanselan/formats/tiff/TiffContents;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lorg/apache/sanselan/formats/tiff/TiffHeader;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lorg/apache/sanselan/formats/tiff/TiffHeader;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffContents;->a:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/TiffContents;->b:Ljava/util/ArrayList;

    return-void
.end method
