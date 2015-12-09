.class public final Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
.super Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# instance fields
.field public final a:I

.field private final b:Ljava/util/ArrayList;

.field private c:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

.field private d:Lorg/apache/sanselan/formats/tiff/JpegImageData;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    iput-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->c:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    iput-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->d:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a:I

    return-void
.end method

.method private a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V
    .locals 4

    iget v2, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    const/4 v0, 0x0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    iget v3, v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    if-eq v3, v2, :cond_0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method protected final a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;)Ljava/util/List;
    .locals 7

    const/4 v2, 0x0

    const/4 v6, 0x1

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->aE_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->aF_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    const/4 v0, 0x0

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->d:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    if-eqz v1, :cond_3

    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->aE_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    sget-object v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    invoke-static {}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->b()[B

    move-result-object v4

    invoke-direct {v0, v1, v3, v6, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    sget-object v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    new-array v3, v6, [I

    iget-object v4, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->d:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    iget v4, v4, Lorg/apache/sanselan/formats/tiff/JpegImageData;->e:I

    aput v4, v3, v2

    iget v4, p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->a:I

    invoke-virtual {v1, v3, v4}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->a(Ljava/lang/Object;I)[B

    move-result-object v1

    new-instance v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->aF_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    sget-object v5, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    invoke-direct {v3, v4, v5, v6, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    invoke-virtual {p0, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    move-object v1, v0

    :goto_0
    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->K_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->O_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->ar_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->as_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory$1;

    invoke-direct {v0, p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory$1;-><init>(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V

    iget-object v4, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :goto_1
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v2, v0, :cond_1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->d:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    const-string v2, "JPEG image data"

    iget-object v4, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->d:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    iget-object v4, v4, Lorg/apache/sanselan/formats/tiff/JpegImageData;->a:[B

    invoke-direct {v0, v2, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;-><init>(Ljava/lang/String;[B)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    :cond_0
    return-object v3

    :cond_1
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->b()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a()Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_3
    move-object v1, v0

    goto :goto_0
.end method

.method public final a(Lorg/apache/sanselan/common/BinaryOutputStream;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->b(I)V

    move v1, v2

    :goto_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->c:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->c:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->d()I

    move-result v0

    :goto_1
    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1, v2}, Lorg/apache/sanselan/common/BinaryOutputStream;->a(I)V

    :goto_2
    return-void

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a(Lorg/apache/sanselan/common/BinaryOutputStream;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->a(I)V

    goto :goto_2

    :cond_2
    move v0, v2

    goto :goto_1
.end method

.method public final a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V
    .locals 0

    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->c:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    return-void
.end method

.method public final a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a:I

    invoke-static {v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0xc

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    return v0
.end method
