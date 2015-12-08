.class public Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;
.super Lorg/apache/sanselan/formats/jpeg/segments/APPNSegment;

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final b:[B

.field public final c:I

.field public final d:I


# direct methods
.method private constructor <init>(IILjava/io/InputStream;)V
    .locals 7

    const/4 v6, -0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, p3}, Lorg/apache/sanselan/formats/jpeg/segments/APPNSegment;-><init>(IILjava/io/InputStream;)V

    iget-object v2, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->e:[B

    sget-object v3, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->h:[B

    if-nez v3, :cond_1

    :cond_0
    :goto_0
    if-eqz v1, :cond_3

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->e:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    sget-object v1, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->h:[B

    const-string v2, "Not a Valid App2 Segment: missing ICC Profile label"

    invoke-static {v0, v1, v2}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->a(Ljava/io/InputStream;[BLjava/lang/String;)V

    const-string v1, "cur_marker"

    const-string v2, "Not a valid App2 Marker"

    invoke-virtual {p0, v1, v0, v2}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v1

    iput v1, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->c:I

    const-string v1, "num_markers"

    const-string v2, "Not a valid App2 Marker"

    invoke-virtual {p0, v1, v0, v2}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v1

    iput v1, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->d:I

    sget-object v1, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->h:[B

    array-length v1, v1

    sub-int v1, p2, v1

    add-int/lit8 v1, v1, -0x2

    const-string v2, "App2 Data"

    const-string v3, "Invalid App2 Segment: insufficient data"

    invoke-virtual {p0, v2, v1, v0, v3}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->a(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->b:[B

    :goto_1
    return-void

    :cond_1
    if-eqz v2, :cond_0

    array-length v0, v3

    array-length v4, v2

    if-gt v0, v4, :cond_0

    move v0, v1

    :goto_2
    array-length v4, v3

    if-lt v0, v4, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    aget-byte v4, v3, v0

    aget-byte v5, v2, v0

    if-ne v4, v5, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    iput v6, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->c:I

    iput v6, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->d:I

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->b:[B

    goto :goto_1
.end method

.method public constructor <init>(I[B)V
    .locals 2

    array-length v0, p2

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p0, p1, v0, v1}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;-><init>(IILjava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;

    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->c:I

    iget v1, p1, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->c:I

    sub-int/2addr v0, v1

    return v0
.end method
