.class public Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;
.super Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, p1, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)[B
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [I

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aput v2, v1, v0

    invoke-static {v1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->a([II)[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    instance-of v1, p1, [I

    if-eqz v1, :cond_1

    check-cast p1, [I

    invoke-static {p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->a([II)[B

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v1, p1, [Ljava/lang/Integer;

    if-eqz v1, :cond_3

    check-cast p1, [Ljava/lang/Integer;

    array-length v1, p1

    new-array v1, v1, [I

    :goto_1
    array-length v2, v1

    if-lt v0, v2, :cond_2

    invoke-static {v1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->a([II)[B

    move-result-object v0

    goto :goto_0

    :cond_2
    aget-object v2, p1, v0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid data: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .locals 4

    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/Integer;

    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->d:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->a:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->h:[B

    iget v3, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->j:I

    invoke-virtual {p0, v1, v2, v3}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->b(Ljava/lang/String;[BI)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->d:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->a:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->b(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object v1

    iget v2, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->f:I

    iget v3, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->j:I

    invoke-virtual {p0, v0, v1, v2, v3}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->b(Ljava/lang/String;[BII)[I

    move-result-object v0

    goto :goto_0
.end method
