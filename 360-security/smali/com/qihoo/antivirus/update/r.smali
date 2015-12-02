.class public Lcom/qihoo/antivirus/update/r;
.super Lcom/qihoo/antivirus/update/l;
.source "360Security"

# interfaces
.implements Lcom/qihoo/antivirus/update/x$a;


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:J

.field private final e:Ljava/lang/String;

.field private final f:Lcom/qihoo/antivirus/update/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo/antivirus/update/v;JLjava/lang/String;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Lcom/qihoo/antivirus/update/l;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 28
    iput-object p3, p0, Lcom/qihoo/antivirus/update/r;->c:Ljava/lang/String;

    .line 29
    iput-wide p5, p0, Lcom/qihoo/antivirus/update/r;->d:J

    .line 30
    iput-object p7, p0, Lcom/qihoo/antivirus/update/r;->e:Ljava/lang/String;

    .line 31
    iput-object p4, p0, Lcom/qihoo/antivirus/update/r;->f:Lcom/qihoo/antivirus/update/v;

    .line 32
    return-void
.end method


# virtual methods
.method protected a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;)I
    .locals 12

    .prologue
    const/16 v10, -0x9

    const/16 v11, -0x63

    .line 111
    const/4 v1, 0x0

    .line 113
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo/antivirus/update/r;->c:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 116
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 118
    :cond_0
    new-instance v2, Ljava/io/FileOutputStream;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    const-wide/16 v3, 0x0

    const-wide/16 v6, 0x0

    :try_start_1
    iget-wide v8, p0, Lcom/qihoo/antivirus/update/r;->d:J

    move-object v0, p1

    move-object v1, p2

    move-object v5, p0

    invoke-static/range {v0 .. v9}, Lcom/qihoo/antivirus/update/x;->a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;Ljava/io/OutputStream;JLcom/qihoo/antivirus/update/x$a;JJ)I

    move-result v0

    .line 121
    if-ltz v0, :cond_4

    iget-object v1, p0, Lcom/qihoo/antivirus/update/r;->e:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 122
    iget-object v1, p0, Lcom/qihoo/antivirus/update/r;->c:Ljava/lang/String;

    invoke-static {v1}, Lcom/qihoo/antivirus/update/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/qihoo/antivirus/update/r;->e:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 127
    :cond_1
    const/16 v0, -0x9

    const-string/jumbo v1, "invalidate data"

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/antivirus/update/r;->a(ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 143
    if-eqz v2, :cond_2

    .line 145
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    :cond_2
    :goto_0
    move v0, v10

    .line 151
    :cond_3
    :goto_1
    return v0

    .line 143
    :cond_4
    if-eqz v2, :cond_3

    .line 145
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 146
    :catch_0
    move-exception v1

    goto :goto_1

    .line 132
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 136
    :goto_2
    const/16 v1, -0x33

    :try_start_4
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/antivirus/update/r;->a(ILjava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 143
    if-eqz v2, :cond_5

    .line 145
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    :cond_5
    :goto_3
    move v0, v11

    .line 151
    goto :goto_1

    .line 137
    :catch_2
    move-exception v0

    move-object v2, v1

    .line 141
    :goto_4
    const/16 v1, -0x63

    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/antivirus/update/r;->a(ILjava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 143
    if-eqz v2, :cond_5

    .line 145
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_3

    .line 146
    :catch_3
    move-exception v0

    goto :goto_3

    .line 142
    :catchall_0
    move-exception v0

    move-object v2, v1

    .line 143
    :goto_5
    if-eqz v2, :cond_6

    .line 145
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 149
    :cond_6
    :goto_6
    throw v0

    .line 146
    :catch_4
    move-exception v0

    goto :goto_0

    :catch_5
    move-exception v0

    goto :goto_3

    :catch_6
    move-exception v1

    goto :goto_6

    .line 142
    :catchall_1
    move-exception v0

    goto :goto_5

    .line 137
    :catch_7
    move-exception v0

    goto :goto_4

    .line 132
    :catch_8
    move-exception v0

    goto :goto_2
.end method

.method public a(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 102
    iget v0, p0, Lcom/qihoo/antivirus/update/r;->a:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 103
    if-gez p1, :cond_0

    .line 104
    neg-int p1, p1

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/r;->b:[I

    iget v1, p0, Lcom/qihoo/antivirus/update/r;->a:I

    aput p1, v0, v1

    .line 108
    :cond_1
    return-void
.end method

.method public a(JJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/antivirus/update/r;->f:Lcom/qihoo/antivirus/update/v;

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/qihoo/antivirus/update/r;->f:Lcom/qihoo/antivirus/update/v;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/qihoo/antivirus/update/v;->a(JJ)V

    .line 99
    :cond_0
    return-void
.end method

.method public a(Lorg/apache/http/HttpResponse;)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/antivirus/update/r;->f:Lcom/qihoo/antivirus/update/v;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/qihoo/antivirus/update/r;->f:Lcom/qihoo/antivirus/update/v;

    invoke-virtual {v0, p1}, Lcom/qihoo/antivirus/update/v;->a(Lorg/apache/http/HttpResponse;)V

    .line 93
    :cond_0
    return-void
.end method

.method public a(Lorg/apache/http/client/HttpClient;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/r;->a()Ljava/lang/String;

    move-result-object v1

    .line 46
    iput v0, p0, Lcom/qihoo/antivirus/update/r;->a:I

    .line 48
    :goto_0
    invoke-virtual {p0, p1, v1}, Lcom/qihoo/antivirus/update/r;->a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_2

    .line 83
    :cond_0
    if-ltz v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    .line 52
    :cond_2
    const/4 v3, -0x4

    if-eq v2, v3, :cond_1

    const/16 v3, -0x63

    if-eq v2, v3, :cond_1

    .line 53
    const/16 v3, -0x62

    if-eq v2, v3, :cond_1

    const/16 v3, -0x61

    if-eq v2, v3, :cond_1

    .line 58
    iget v3, p0, Lcom/qihoo/antivirus/update/r;->a:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/qihoo/antivirus/update/r;->a:I

    .line 59
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/r;->b()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo/antivirus/update/af;->b(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 65
    iget v3, p0, Lcom/qihoo/antivirus/update/r;->a:I

    const/4 v4, 0x2

    if-ge v3, v4, :cond_0

    .line 68
    const-wide/16 v2, 0x2710

    iget v4, p0, Lcom/qihoo/antivirus/update/r;->a:I

    int-to-long v4, v4

    mul-long/2addr v2, v4

    .line 73
    iget-object v4, p0, Lcom/qihoo/antivirus/update/r;->f:Lcom/qihoo/antivirus/update/v;

    iget-object v4, v4, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    iget v5, p0, Lcom/qihoo/antivirus/update/r;->a:I

    invoke-virtual {v4, v5, v1}, Lcom/qihoo/antivirus/update/d;->a(ILjava/lang/String;)V

    .line 75
    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 76
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 156
    const/4 v0, 0x2

    return v0
.end method
