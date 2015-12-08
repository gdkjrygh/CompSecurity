.class public Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;
.super Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, p1, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)[B
    .locals 4

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/apache/sanselan/common/RationalNumber;

    if-eqz v1, :cond_0

    check-cast p1, Lorg/apache/sanselan/common/RationalNumber;

    invoke-static {p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->a(Lorg/apache/sanselan/common/RationalNumber;I)[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    instance-of v1, p1, [Lorg/apache/sanselan/common/RationalNumber;

    if-eqz v1, :cond_1

    check-cast p1, [Lorg/apache/sanselan/common/RationalNumber;

    invoke-static {p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->a([Lorg/apache/sanselan/common/RationalNumber;I)[B

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v1, p1, Ljava/lang/Number;

    if-eqz v1, :cond_2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/apache/sanselan/common/RationalNumberUtilities;->a(D)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v0

    invoke-static {v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->a(Lorg/apache/sanselan/common/RationalNumber;I)[B

    move-result-object v0

    goto :goto_0

    :cond_2
    instance-of v1, p1, [Ljava/lang/Number;

    if-eqz v1, :cond_4

    check-cast p1, [Ljava/lang/Number;

    array-length v1, p1

    new-array v1, v1, [Lorg/apache/sanselan/common/RationalNumber;

    :goto_1
    array-length v2, p1

    if-lt v0, v2, :cond_3

    invoke-static {v1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->a([Lorg/apache/sanselan/common/RationalNumber;I)[B

    move-result-object v0

    goto :goto_0

    :cond_3
    aget-object v2, p1, v0

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lorg/apache/sanselan/common/RationalNumberUtilities;->a(D)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    instance-of v1, p1, [D

    if-eqz v1, :cond_6

    check-cast p1, [D

    array-length v1, p1

    new-array v1, v1, [Lorg/apache/sanselan/common/RationalNumber;

    :goto_2
    array-length v2, p1

    if-lt v0, v2, :cond_5

    invoke-static {v1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->a([Lorg/apache/sanselan/common/RationalNumber;I)[B

    move-result-object v0

    goto :goto_0

    :cond_5
    aget-wide v2, p1, v0

    invoke-static {v2, v3}, Lorg/apache/sanselan/common/RationalNumberUtilities;->a(D)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
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

    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->d:Ljava/lang/String;

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

    iget-object v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->i:[B

    iget v2, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->j:I

    invoke-virtual {p0, v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->a(Ljava/lang/String;[BI)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->d:Ljava/lang/String;

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

    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->b(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object v1

    iget v2, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->f:I

    iget v3, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->j:I

    invoke-virtual {p0, v0, v1, v2, v3}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->a(Ljava/lang/String;[BII)[Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v0

    goto :goto_0
.end method
