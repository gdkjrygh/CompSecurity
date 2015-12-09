.class Lorg/apache/sanselan/formats/jpeg/JpegImageParser$2;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;


# instance fields
.field private final synthetic a:[Z


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a(I[B[B[B)Z
    .locals 3

    const/4 v1, 0x1

    const/4 v0, 0x0

    const v2, 0xffd9

    if-ne p1, v2, :cond_0

    :goto_0
    return v0

    :cond_0
    const v2, 0xffe1

    if-ne p1, v2, :cond_1

    sget-object v2, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->c:[B

    invoke-static {p4, v2}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->b([B[B)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$2;->a:[Z

    aput-boolean v1, v2, v0

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public final a([BLjava/io/InputStream;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
