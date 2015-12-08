.class public Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;
.super Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0xc

    const/16 v1, 0x8

    const-string v2, "Double"

    invoke-direct {p0, v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)[B
    .locals 13

    const/4 v12, 0x2

    const/4 v11, 0x1

    const/16 v10, 0x8

    const/4 v0, 0x0

    const-wide/16 v8, 0xff

    instance-of v1, p1, Ljava/lang/Double;

    if-eqz v1, :cond_1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    new-array v1, v10, [B

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v2

    const/16 v4, 0x4d

    if-ne p2, v4, :cond_0

    shr-long v4, v2, v0

    and-long/2addr v4, v8

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v1, v0

    shr-long v4, v2, v10

    and-long/2addr v4, v8

    long-to-int v0, v4

    int-to-byte v0, v0

    aput-byte v0, v1, v11

    const/16 v0, 0x10

    shr-long v4, v2, v0

    and-long/2addr v4, v8

    long-to-int v0, v4

    int-to-byte v0, v0

    aput-byte v0, v1, v12

    const/4 v0, 0x3

    const/16 v4, 0x18

    shr-long v4, v2, v4

    and-long/2addr v4, v8

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v1, v0

    const/4 v0, 0x4

    const/16 v4, 0x20

    shr-long v4, v2, v4

    and-long/2addr v4, v8

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v1, v0

    const/4 v0, 0x5

    const/16 v4, 0x28

    shr-long v4, v2, v4

    and-long/2addr v4, v8

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v1, v0

    const/4 v0, 0x6

    const/16 v4, 0x30

    shr-long v4, v2, v4

    and-long/2addr v4, v8

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v1, v0

    const/4 v0, 0x7

    const/16 v4, 0x38

    shr-long/2addr v2, v4

    and-long/2addr v2, v8

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    :goto_0
    move-object v0, v1

    :goto_1
    return-object v0

    :cond_0
    const/4 v4, 0x7

    shr-long v6, v2, v0

    and-long/2addr v6, v8

    long-to-int v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    const/4 v4, 0x6

    shr-long v6, v2, v10

    and-long/2addr v6, v8

    long-to-int v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    const/4 v4, 0x5

    const/16 v5, 0x10

    shr-long v6, v2, v5

    and-long/2addr v6, v8

    long-to-int v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    const/4 v4, 0x4

    const/16 v5, 0x18

    shr-long v6, v2, v5

    and-long/2addr v6, v8

    long-to-int v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    const/4 v4, 0x3

    const/16 v5, 0x20

    shr-long v6, v2, v5

    and-long/2addr v6, v8

    long-to-int v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    const/16 v4, 0x28

    shr-long v4, v2, v4

    and-long/2addr v4, v8

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v1, v12

    const/16 v4, 0x30

    shr-long v4, v2, v4

    and-long/2addr v4, v8

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v1, v11

    const/16 v4, 0x38

    shr-long/2addr v2, v4

    and-long/2addr v2, v8

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    goto :goto_0

    :cond_1
    instance-of v1, p1, [D

    if-eqz v1, :cond_2

    check-cast p1, [D

    invoke-static {p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;->a([DI)[B

    move-result-object v0

    goto :goto_1

    :cond_2
    instance-of v1, p1, [Ljava/lang/Double;

    if-eqz v1, :cond_4

    check-cast p1, [Ljava/lang/Double;

    array-length v1, p1

    new-array v1, v1, [D

    :goto_2
    array-length v2, v1

    if-lt v0, v2, :cond_3

    invoke-static {v1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;->a([DI)[B

    move-result-object v0

    goto :goto_1

    :cond_3
    aget-object v2, p1, v0

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    aput-wide v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
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
    .locals 1

    const-string v0, "?"

    return-object v0
.end method
