.class abstract Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/AllTagConstants;


# instance fields
.field private a:I


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->a:I

    return-void
.end method


# virtual methods
.method protected final a(I)V
    .locals 0

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->a:I

    return-void
.end method

.method public abstract a(Lorg/apache/sanselan/common/BinaryOutputStream;)V
.end method

.method public abstract c()I
.end method

.method protected final d()I
    .locals 1

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->a:I

    return v0
.end method
