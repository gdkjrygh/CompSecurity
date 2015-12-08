.class public Lorg/apache/sanselan/formats/tiff/TiffDirectory;
.super Lorg/apache/sanselan/formats/tiff/TiffElement;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# instance fields
.field public final a:I

.field public final b:Ljava/util/ArrayList;

.field public final c:I

.field private g:Lorg/apache/sanselan/formats/tiff/JpegImageData;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;II)V
    .locals 1

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0xc

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    invoke-direct {p0, p3, v0}, Lorg/apache/sanselan/formats/tiff/TiffElement;-><init>(II)V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->g:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->a:I

    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->b:Ljava/util/ArrayList;

    iput p4, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->c:I

    return-void
.end method

.method public static final a(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    const-string v0, "Bad Type"

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "Unknown"

    goto :goto_0

    :pswitch_1
    const-string v0, "Root"

    goto :goto_0

    :pswitch_2
    const-string v0, "Sub"

    goto :goto_0

    :pswitch_3
    const-string v0, "Thumbnail"

    goto :goto_0

    :pswitch_4
    const-string v0, "Exif"

    goto :goto_0

    :pswitch_5
    const-string v0, "Gps"

    goto :goto_0

    :pswitch_6
    const-string v0, "Interoperability"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;
    .locals 5

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    move-object v0, v2

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    move-object v0, v2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/TiffField;

    iget v3, v0, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    iget v4, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    if-eq v3, v4, :cond_0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->a:I

    invoke-static {v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lorg/apache/sanselan/formats/tiff/JpegImageData;)V
    .locals 0

    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->g:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    return-void
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final c()Z
    .locals 1

    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->aE_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;
    .locals 3

    const/4 v2, 0x0

    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->aE_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->aF_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->d()[I

    move-result-object v0

    aget v0, v0, v2

    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/TiffField;->d()[I

    move-result-object v1

    aget v1, v1, v2

    new-instance v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;

    invoke-direct {v2, p0, v0, v1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;-><init>(Lorg/apache/sanselan/formats/tiff/TiffDirectory;II)V

    return-object v2

    :cond_0
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Couldn\'t find image data."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Lorg/apache/sanselan/formats/tiff/JpegImageData;
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->g:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    return-object v0
.end method
