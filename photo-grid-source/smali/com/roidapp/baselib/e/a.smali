.class public final Lcom/roidapp/baselib/e/a;
.super Lcom/roidapp/baselib/e/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/e/g",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private e:Lcom/roidapp/baselib/e/b;

.field private f:Ljava/lang/String;

.field private g:I


# direct methods
.method public constructor <init>(Lcom/roidapp/baselib/e/a;)V
    .locals 3

    .prologue
    .line 26
    iget-object v0, p1, Lcom/roidapp/baselib/e/a;->d:Ljava/lang/String;

    iget-object v1, p1, Lcom/roidapp/baselib/e/a;->f:Ljava/lang/String;

    iget-object v2, p1, Lcom/roidapp/baselib/e/a;->e:Lcom/roidapp/baselib/e/b;

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/baselib/e/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/e/b;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/e/b;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1, p3}, Lcom/roidapp/baselib/e/g;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/j;)V

    .line 21
    iput-object p2, p0, Lcom/roidapp/baselib/e/a;->f:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lcom/roidapp/baselib/e/a;->e:Lcom/roidapp/baselib/e/b;

    .line 23
    return-void
.end method

.method private a(JLjava/io/InputStream;)Ljava/lang/String;
    .locals 11

    .prologue
    .line 51
    if-nez p3, :cond_0

    .line 52
    new-instance v0, Ljava/io/IOException;

    const-string v1, "inputStream is null."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 54
    :cond_0
    const/4 v4, 0x0

    .line 56
    const/high16 v0, 0x42c60000    # 99.0f

    iget v1, p0, Lcom/roidapp/baselib/e/a;->g:I

    int-to-float v1, v1

    sub-float v5, v0, v1

    .line 57
    iget v0, p0, Lcom/roidapp/baselib/e/a;->g:I

    int-to-float v0, v0

    .line 58
    const/16 v1, 0x1000

    new-array v6, v1, [B

    .line 59
    const-wide/16 v2, 0x0

    .line 62
    new-instance v7, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/baselib/e/a;->f:Ljava/lang/String;

    invoke-direct {v7, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_1

    .line 65
    new-instance v0, Ljava/io/IOException;

    const-string v1, "mkdir failed."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_1
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 70
    :cond_2
    :goto_0
    :try_start_1
    invoke-virtual {p3, v6}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-ltz v4, :cond_7

    .line 71
    iget-object v7, p0, Lcom/roidapp/baselib/e/a;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v7

    if-eqz v7, :cond_4

    .line 85
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 88
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_3

    cmp-long v0, v2, p1

    if-eqz v0, :cond_3

    .line 89
    const-string v0, "Download"

    const-string v1, "file download incomplete.[size != length]"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/baselib/e/a;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_3
    const/4 v0, 0x0

    .line 94
    :goto_2
    return-object v0

    .line 73
    :cond_4
    const/4 v7, 0x0

    :try_start_3
    invoke-virtual {v1, v6, v7, v4}, Ljava/io/FileOutputStream;->write([BII)V

    .line 74
    const-wide/16 v8, 0x0

    cmp-long v7, p1, v8

    if-lez v7, :cond_2

    .line 76
    int-to-long v8, v4

    add-long/2addr v2, v8

    .line 77
    int-to-float v4, v4

    mul-float/2addr v4, v5

    long-to-float v7, p1

    div-float/2addr v4, v7

    add-float/2addr v0, v4

    .line 78
    float-to-int v4, v0

    invoke-direct {p0, v4}, Lcom/roidapp/baselib/e/a;->b(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 83
    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v1, :cond_5

    .line 85
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 88
    :cond_5
    :goto_4
    const-wide/16 v4, 0x0

    cmp-long v1, p1, v4

    if-lez v1, :cond_6

    cmp-long v1, v2, p1

    if-eqz v1, :cond_6

    .line 89
    const-string v1, "Download"

    const-string v2, "file download incomplete.[size != length]"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/baselib/e/a;->f:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_6
    throw v0

    .line 85
    :cond_7
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 88
    :goto_5
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_8

    cmp-long v0, v2, p1

    if-eqz v0, :cond_8

    .line 89
    const-string v0, "Download"

    const-string v1, "file download incomplete.[size != length]"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/baselib/e/a;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 94
    :cond_8
    iget-object v0, p0, Lcom/roidapp/baselib/e/a;->f:Ljava/lang/String;

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v1

    goto :goto_4

    .line 83
    :catchall_1
    move-exception v0

    move-object v1, v4

    goto :goto_3
.end method

.method private b(I)V
    .locals 1

    .prologue
    .line 98
    iget v0, p0, Lcom/roidapp/baselib/e/a;->g:I

    if-eq p1, v0, :cond_0

    .line 99
    iput p1, p0, Lcom/roidapp/baselib/e/a;->g:I

    .line 100
    iget-object v0, p0, Lcom/roidapp/baselib/e/a;->e:Lcom/roidapp/baselib/e/b;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/roidapp/baselib/e/a;->e:Lcom/roidapp/baselib/e/b;

    invoke-interface {v0, p1}, Lcom/roidapp/baselib/e/b;->a(I)V

    .line 103
    :cond_0
    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/net/HttpURLConnection;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 13
    .line 1043
    if-eqz p1, :cond_0

    .line 1044
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    int-to-long v0, v0

    .line 1045
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/baselib/e/a;->a(JLjava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 1047
    :cond_0
    const-wide/16 v0, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/baselib/e/a;->a(JLjava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected final a()V
    .locals 1

    .prologue
    .line 31
    invoke-super {p0}, Lcom/roidapp/baselib/e/g;->a()V

    .line 32
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/e/a;->b(I)V

    .line 33
    return-void
.end method

.method protected final b()V
    .locals 1

    .prologue
    .line 37
    invoke-super {p0}, Lcom/roidapp/baselib/e/g;->b()V

    .line 38
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/e/a;->b(I)V

    .line 39
    return-void
.end method
