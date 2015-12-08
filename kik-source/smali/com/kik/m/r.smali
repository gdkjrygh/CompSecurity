.class public final Lcom/kik/m/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    .locals 6

    .prologue
    .line 46
    const/16 v0, 0x400

    new-array v1, v0, [B

    .line 47
    const-wide/16 v2, 0x0

    .line 48
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v0

    .line 49
    :goto_0
    if-lez v0, :cond_0

    .line 50
    const/4 v4, 0x0

    invoke-virtual {p1, v1, v4, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 51
    int-to-long v4, v0

    add-long/2addr v2, v4

    .line 52
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v0

    goto :goto_0

    .line 54
    :cond_0
    return-wide v2
.end method

.method public static a(Ljava/io/OutputStream;)V
    .locals 1

    .prologue
    .line 34
    if-eqz p0, :cond_0

    .line 36
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    :cond_0
    :goto_0
    return-void

    .line 38
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method
