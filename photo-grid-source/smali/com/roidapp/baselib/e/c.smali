.class public final Lcom/roidapp/baselib/e/c;
.super Lcom/roidapp/baselib/e/f;
.source "SourceFile"


# instance fields
.field private b:Ljava/io/File;

.field private c:Ljava/lang/String;

.field private d:Lcom/roidapp/baselib/e/d;

.field private e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/e/d;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/e/f;-><init>(Ljava/lang/String;)V

    .line 23
    iput-object p3, p0, Lcom/roidapp/baselib/e/c;->c:Ljava/lang/String;

    .line 24
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/baselib/e/c;->b:Ljava/io/File;

    .line 25
    iput-object p4, p0, Lcom/roidapp/baselib/e/c;->d:Lcom/roidapp/baselib/e/d;

    .line 26
    return-void
.end method

.method private a(Ljava/io/OutputStream;Ljava/io/File;)Z
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 49
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 79
    :cond_0
    :goto_0
    return v0

    .line 52
    :cond_1
    const/high16 v0, 0x42b40000    # 90.0f

    iget v1, p0, Lcom/roidapp/baselib/e/c;->e:I

    int-to-float v1, v1

    sub-float v3, v0, v1

    .line 53
    iget v0, p0, Lcom/roidapp/baselib/e/c;->e:I

    int-to-float v0, v0

    .line 54
    invoke-virtual {p2}, Ljava/io/File;->length()J

    move-result-wide v4

    .line 56
    const/4 v2, 0x0

    .line 58
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 59
    const/16 v2, 0x1000

    :try_start_1
    new-array v2, v2, [B

    .line 61
    :cond_2
    :goto_1
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v6

    if-ltz v6, :cond_4

    .line 62
    const/4 v7, 0x0

    invoke-virtual {p1, v2, v7, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 63
    int-to-float v6, v6

    mul-float/2addr v6, v3

    long-to-float v7, v4

    div-float/2addr v6, v7

    add-float/2addr v0, v6

    .line 64
    float-to-int v6, v0

    .line 2085
    iget v7, p0, Lcom/roidapp/baselib/e/c;->e:I

    if-eq v6, v7, :cond_2

    .line 2086
    iput v6, p0, Lcom/roidapp/baselib/e/c;->e:I

    .line 2087
    iget-object v7, p0, Lcom/roidapp/baselib/e/c;->d:Lcom/roidapp/baselib/e/d;

    if-eqz v7, :cond_2

    .line 2088
    iget-object v7, p0, Lcom/roidapp/baselib/e/c;->d:Lcom/roidapp/baselib/e/d;

    invoke-interface {v7, v6}, Lcom/roidapp/baselib/e/d;->a(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 68
    :catch_0
    move-exception v0

    .line 69
    :goto_2
    :try_start_2
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 71
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v1, :cond_3

    .line 76
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 79
    :cond_3
    :goto_4
    throw v0

    .line 76
    :cond_4
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 79
    :goto_5
    const/4 v0, 0x1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v1

    goto :goto_4

    .line 74
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_3

    .line 68
    :catch_3
    move-exception v0

    move-object v1, v2

    goto :goto_2
.end method


# virtual methods
.method final a(Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Content-Disposition: form-data; name=\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/baselib/e/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"; filename=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/e/c;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 1030
    iget-object v0, p0, Lcom/roidapp/baselib/e/c;->c:Ljava/lang/String;

    .line 41
    if-eqz v0, :cond_0

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Content-Type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2030
    iget-object v1, p0, Lcom/roidapp/baselib/e/c;->c:Ljava/lang/String;

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 43
    :cond_0
    const-string v0, "\r\n"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 45
    iget-object v0, p0, Lcom/roidapp/baselib/e/c;->b:Ljava/io/File;

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/e/c;->a(Ljava/io/OutputStream;Ljava/io/File;)Z

    .line 46
    return-void
.end method
