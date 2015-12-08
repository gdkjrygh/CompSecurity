.class Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;


# instance fields
.field final synthetic a:Lorg/apache/sanselan/formats/jpeg/JpegImageParser;

.field private final synthetic b:[I

.field private final synthetic c:Ljava/util/ArrayList;

.field private final synthetic d:Z


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a(I[B[B[B)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v0, 0x0

    const v2, 0xffd9

    if-ne p1, v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->a:Lorg/apache/sanselan/formats/jpeg/JpegImageParser;

    iget-object v2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->b:[I

    invoke-static {p1, v2}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->a(I[I)Z

    move-result v2

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    const v2, 0xffed

    if-eq p1, v2, :cond_3

    const v2, 0xffe2

    if-ne p1, v2, :cond_4

    iget-object v2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->c:Ljava/util/ArrayList;

    new-instance v3, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;

    invoke-direct {v3, p1, p4}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;-><init>(I[B)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    iget-boolean v2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->d:Z

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_4
    const v2, 0xffe0

    if-ne p1, v2, :cond_5

    iget-object v2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->c:Ljava/util/ArrayList;

    new-instance v3, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;

    invoke-direct {v3, p1, p4}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;-><init>(I[B)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    const v2, 0xffc0

    if-lt p1, v2, :cond_6

    const v2, 0xffcf

    if-gt p1, v2, :cond_6

    iget-object v2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->c:Ljava/util/ArrayList;

    new-instance v3, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;

    invoke-direct {v3, p1, p4}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;-><init>(I[B)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    const v2, 0xffe1

    if-lt p1, v2, :cond_3

    const v2, 0xffef

    if-gt p1, v2, :cond_3

    iget-object v2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->c:Ljava/util/ArrayList;

    new-instance v3, Lorg/apache/sanselan/formats/jpeg/segments/UnknownSegment;

    invoke-direct {v3, p1, p4}, Lorg/apache/sanselan/formats/jpeg/segments/UnknownSegment;-><init>(I[B)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public final a([BLjava/io/InputStream;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
