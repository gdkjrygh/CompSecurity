.class public abstract Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;
.super Lorg/apache/sanselan/common/BinaryFileFunctions;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# instance fields
.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileFunctions;-><init>()V

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->b:I

    iput p2, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->c:I

    iput-object p3, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->d:Ljava/lang/String;

    return-void
.end method

.method public static final b()[B
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    return-object v0
.end method


# virtual methods
.method public final a(Lorg/apache/sanselan/formats/tiff/TiffField;)Z
    .locals 2

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->c:I

    if-lez v0, :cond_0

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->c:I

    iget v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->f:I

    mul-int/2addr v0, v1

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public abstract a(Ljava/lang/Object;I)[B
.end method

.method public final b(Lorg/apache/sanselan/formats/tiff/TiffField;)[B
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->a(Lorg/apache/sanselan/formats/tiff/TiffField;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->c:I

    iget v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->f:I

    mul-int/2addr v1, v0

    new-array v0, v1, [B

    iget-object v2, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->h:[B

    invoke-static {v2, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->i:[B

    goto :goto_0
.end method

.method public abstract c(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
