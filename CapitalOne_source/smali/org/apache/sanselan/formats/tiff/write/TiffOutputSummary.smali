.class Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# instance fields
.field public final a:I

.field public final b:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

.field public final c:Ljava/util/Map;

.field private d:Ljava/util/List;

.field private e:Ljava/util/List;


# direct methods
.method public constructor <init>(ILorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;Ljava/util/Map;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->e:Ljava/util/List;

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->a:I

    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->b:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    iput-object p3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 6

    const/4 v2, 0x0

    move v1, v2

    :goto_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    move v1, v2

    :goto_1
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    return-void

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;

    sget-object v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    const/4 v4, 0x1

    new-array v4, v4, [I

    iget-object v5, v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;->a:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->d()I

    move-result v5

    aput v5, v4, v2

    invoke-virtual {v3, v4, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->a(Ljava/lang/Object;I)[B

    move-result-object v3

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;->b:Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    invoke-virtual {v0, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a([B)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;

    move v3, v2

    :goto_2
    iget-object v4, v0, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->c:[Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    array-length v4, v4

    if-lt v3, v4, :cond_2

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->b:Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->a:[I

    invoke-virtual {v4, v0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->a(Ljava/lang/Object;I)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a([B)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    iget-object v4, v0, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->c:[Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    aget-object v4, v4, v3

    iget-object v5, v0, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->a:[I

    invoke-virtual {v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->d()I

    move-result v4

    aput v4, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2
.end method

.method public final a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V
    .locals 2

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->d:Ljava/util/List;

    new-instance v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;

    invoke-direct {v1, p1, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;-><init>(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
