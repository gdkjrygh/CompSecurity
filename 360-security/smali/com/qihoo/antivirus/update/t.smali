.class public Lcom/qihoo/antivirus/update/t;
.super Lcom/qihoo/antivirus/update/l;
.source "360Security"

# interfaces
.implements Lcom/qihoo/antivirus/update/x$a;


# instance fields
.field private final c:Lcom/qihoo/antivirus/update/c;

.field private d:J

.field private final e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:J


# direct methods
.method public constructor <init>(Lcom/qihoo/antivirus/update/d;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo/antivirus/update/c;Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 23
    invoke-virtual {p1}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/qihoo/antivirus/update/l;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/antivirus/update/t;->d:J

    .line 25
    iput-object p3, p0, Lcom/qihoo/antivirus/update/t;->e:Ljava/lang/String;

    .line 26
    iput-object p5, p0, Lcom/qihoo/antivirus/update/t;->f:Ljava/lang/String;

    .line 27
    iput-wide p6, p0, Lcom/qihoo/antivirus/update/t;->g:J

    .line 31
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 33
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    :cond_0
    :goto_0
    iput-object p4, p0, Lcom/qihoo/antivirus/update/t;->c:Lcom/qihoo/antivirus/update/c;

    .line 42
    return-void

    .line 38
    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method protected a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;)I
    .locals 12

    .prologue
    const/16 v10, -0x9

    const/16 v11, -0x63

    .line 118
    const/4 v1, 0x0

    .line 120
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/t;->e:Ljava/lang/String;

    .line 125
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo/antivirus/update/t;->d:J

    .line 132
    new-instance v2, Ljava/io/FileOutputStream;

    const/4 v0, 0x1

    invoke-direct {v2, v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :try_start_1
    iget-wide v3, p0, Lcom/qihoo/antivirus/update/t;->d:J

    const-wide/16 v6, 0x0

    iget-wide v8, p0, Lcom/qihoo/antivirus/update/t;->g:J

    move-object v0, p1

    move-object v1, p2

    move-object v5, p0

    invoke-static/range {v0 .. v9}, Lcom/qihoo/antivirus/update/x;->a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;Ljava/io/OutputStream;JLcom/qihoo/antivirus/update/x$a;JJ)I

    move-result v0

    .line 134
    if-ltz v0, :cond_3

    iget-object v1, p0, Lcom/qihoo/antivirus/update/t;->f:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 135
    iget-object v1, p0, Lcom/qihoo/antivirus/update/t;->e:Ljava/lang/String;

    invoke-static {v1}, Lcom/qihoo/antivirus/update/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 136
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/qihoo/antivirus/update/t;->f:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 140
    :cond_0
    const/16 v0, -0x9

    const-string/jumbo v1, "invalidate data"

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/antivirus/update/t;->a(ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 156
    if-eqz v2, :cond_1

    .line 158
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    :cond_1
    :goto_0
    move v0, v10

    .line 163
    :cond_2
    :goto_1
    return v0

    .line 156
    :cond_3
    if-eqz v2, :cond_2

    .line 158
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 159
    :catch_0
    move-exception v1

    goto :goto_1

    .line 145
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 149
    :goto_2
    const/16 v1, -0x33

    :try_start_4
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/antivirus/update/t;->a(ILjava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 156
    if-eqz v2, :cond_4

    .line 158
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    :cond_4
    :goto_3
    move v0, v11

    .line 163
    goto :goto_1

    .line 150
    :catch_2
    move-exception v0

    move-object v2, v1

    .line 154
    :goto_4
    const/16 v1, -0x63

    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/antivirus/update/t;->a(ILjava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 156
    if-eqz v2, :cond_4

    .line 158
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_3

    .line 159
    :catch_3
    move-exception v0

    goto :goto_3

    .line 155
    :catchall_0
    move-exception v0

    move-object v2, v1

    .line 156
    :goto_5
    if-eqz v2, :cond_5

    .line 158
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 161
    :cond_5
    :goto_6
    throw v0

    .line 159
    :catch_4
    move-exception v0

    goto :goto_0

    :catch_5
    move-exception v0

    goto :goto_3

    :catch_6
    move-exception v1

    goto :goto_6

    .line 155
    :catchall_1
    move-exception v0

    goto :goto_5

    .line 150
    :catch_7
    move-exception v0

    goto :goto_4

    .line 145
    :catch_8
    move-exception v0

    goto :goto_2
.end method

.method public a(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 191
    iget v0, p0, Lcom/qihoo/antivirus/update/t;->a:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 192
    if-gez p1, :cond_0

    .line 193
    neg-int p1, p1

    .line 195
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/t;->b:[I

    iget v1, p0, Lcom/qihoo/antivirus/update/t;->a:I

    aput p1, v0, v1

    .line 197
    :cond_1
    return-void
.end method

.method public a(JJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 168
    iget-object v0, p0, Lcom/qihoo/antivirus/update/t;->c:Lcom/qihoo/antivirus/update/c;

    if-eqz v0, :cond_0

    .line 172
    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-gez v0, :cond_1

    .line 173
    iget-wide v0, p0, Lcom/qihoo/antivirus/update/t;->g:J

    .line 177
    :goto_0
    iget-object v2, p0, Lcom/qihoo/antivirus/update/t;->c:Lcom/qihoo/antivirus/update/c;

    iget-wide v4, p0, Lcom/qihoo/antivirus/update/t;->d:J

    add-long/2addr v4, p1

    invoke-virtual {v2, v4, v5, v0, v1}, Lcom/qihoo/antivirus/update/c;->a(JJ)V

    .line 179
    :cond_0
    return-void

    .line 175
    :cond_1
    iget-wide v0, p0, Lcom/qihoo/antivirus/update/t;->d:J

    add-long/2addr v0, p3

    goto :goto_0
.end method

.method public a(Lorg/apache/http/HttpResponse;)V
    .locals 0

    .prologue
    .line 187
    return-void
.end method

.method public a(Lorg/apache/http/client/HttpClient;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 52
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/t;->a()Ljava/lang/String;

    move-result-object v2

    .line 56
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v0, v1

    .line 114
    :cond_0
    :goto_0
    return v0

    .line 61
    :cond_1
    iput v1, p0, Lcom/qihoo/antivirus/update/t;->a:I

    .line 63
    :goto_1
    invoke-virtual {p0, p1, v2}, Lcom/qihoo/antivirus/update/t;->a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_3

    .line 111
    :cond_2
    if-gez v3, :cond_0

    move v0, v1

    goto :goto_0

    .line 68
    :cond_3
    const/4 v4, -0x4

    if-eq v3, v4, :cond_2

    const/16 v4, -0x63

    if-eq v3, v4, :cond_2

    .line 69
    const/16 v4, -0x62

    if-eq v3, v4, :cond_2

    const/16 v4, -0x61

    if-eq v3, v4, :cond_2

    .line 74
    sget-boolean v4, Lcom/qihoo/antivirus/update/UpdateService;->f:Z

    if-nez v4, :cond_0

    .line 81
    iget v4, p0, Lcom/qihoo/antivirus/update/t;->a:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/qihoo/antivirus/update/t;->a:I

    .line 82
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/t;->b()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/qihoo/antivirus/update/af;->b(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 88
    iget v4, p0, Lcom/qihoo/antivirus/update/t;->a:I

    const/4 v5, 0x2

    if-ge v4, v5, :cond_2

    .line 92
    const-wide/16 v4, 0x2710

    iget v3, p0, Lcom/qihoo/antivirus/update/t;->a:I

    int-to-long v6, v3

    mul-long/2addr v4, v6

    .line 97
    iget-object v3, p0, Lcom/qihoo/antivirus/update/t;->c:Lcom/qihoo/antivirus/update/c;

    iget-object v3, v3, Lcom/qihoo/antivirus/update/c;->a:Lcom/qihoo/antivirus/update/d;

    iget v6, p0, Lcom/qihoo/antivirus/update/t;->a:I

    invoke-virtual {v3, v6, v2}, Lcom/qihoo/antivirus/update/d;->b(ILjava/lang/String;)V

    .line 99
    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 100
    :catch_0
    move-exception v3

    goto :goto_1
.end method

.method public d()I
    .locals 1

    .prologue
    .line 201
    const/4 v0, 0x3

    return v0
.end method
