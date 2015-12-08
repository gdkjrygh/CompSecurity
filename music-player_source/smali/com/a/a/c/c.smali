.class public final Lcom/a/a/c/c;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/io/Closeable;)V
    .locals 1

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static a(Lcom/a/a/c/d;II)Z
    .locals 2

    if-eqz p0, :cond_0

    invoke-interface {p0, p1, p2}, Lcom/a/a/c/d;->a(II)Z

    move-result v0

    if-nez v0, :cond_0

    mul-int/lit8 v0, p1, 0x64

    div-int/2addr v0, p2

    const/16 v1, 0x4b

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/io/InputStream;Ljava/io/OutputStream;Lcom/a/a/c/d;)Z
    .locals 7

    const v6, 0x8000

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v2

    new-array v3, v6, [B

    invoke-static {p2, v1, v2}, Lcom/a/a/c/c;->a(Lcom/a/a/c/d;II)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return v1

    :cond_0
    move v0, v1

    :cond_1
    invoke-virtual {p0, v3, v1, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_2

    invoke-virtual {p1, v3, v1, v4}, Ljava/io/OutputStream;->write([BII)V

    add-int/2addr v0, v4

    invoke-static {p2, v0, v2}, Lcom/a/a/c/c;->a(Lcom/a/a/c/d;II)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0
.end method
