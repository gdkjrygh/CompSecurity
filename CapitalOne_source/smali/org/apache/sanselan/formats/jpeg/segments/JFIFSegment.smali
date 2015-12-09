.class public Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;
.super Lorg/apache/sanselan/formats/jpeg/segments/Segment;

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegConstants;


# instance fields
.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:I


# direct methods
.method private constructor <init>(IILjava/io/InputStream;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;-><init>(II)V

    sget-object v0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a:[B

    array-length v1, v0

    new-array v2, v1, [B

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v1, :cond_0

    sget-object v0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a:[B

    invoke-static {v2, v0}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a([B[B)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->b:[B

    invoke-static {v2, v0}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a([B[B)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Not a Valid JPEG File: missing JFIF string"

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p3}, Ljava/io/InputStream;->read()I

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const-string v0, "JFIF_major_version"

    const-string v1, "Not a Valid JPEG File"

    invoke-virtual {p0, v0, p3, v1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v0

    iput v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->k:I

    const-string v0, "JFIF_minor_version"

    const-string v1, "Not a Valid JPEG File"

    invoke-virtual {p0, v0, p3, v1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v0

    iput v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->l:I

    const-string v0, "density_units"

    const-string v1, "Not a Valid JPEG File"

    invoke-virtual {p0, v0, p3, v1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v0

    iput v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->m:I

    const-string v0, "x_density"

    const-string v1, "Not a Valid JPEG File"

    invoke-virtual {p0, v0, p3, v1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->c(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->n:I

    const-string v0, "y_density"

    const-string v1, "Not a Valid JPEG File"

    invoke-virtual {p0, v0, p3, v1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->c(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->o:I

    const-string v0, "x_thumbnail"

    const-string v1, "Not a Valid JPEG File"

    invoke-virtual {p0, v0, p3, v1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v0

    iput v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->p:I

    const-string v0, "y_thumbnail"

    const-string v1, "Not a Valid JPEG File"

    invoke-virtual {p0, v0, p3, v1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v0

    iput v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->q:I

    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->p:I

    iget v1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->q:I

    mul-int/2addr v0, v1

    iput v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->r:I

    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->r:I

    if-lez v0, :cond_2

    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->r:I

    const-string v1, "Not a Valid JPEG File: missing thumbnail"

    invoke-static {p3, v0, v1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a(Ljava/io/InputStream;ILjava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 2

    array-length v0, p2

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p0, p1, v0, v1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;-><init>(IILjava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JFIF ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
