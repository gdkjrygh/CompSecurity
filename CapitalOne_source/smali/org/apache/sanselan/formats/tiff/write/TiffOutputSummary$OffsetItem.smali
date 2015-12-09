.class Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

.field public final b:Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;


# direct methods
.method public constructor <init>(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;->b:Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;->a:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    return-void
.end method
