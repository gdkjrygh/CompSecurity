.class public final Lcom/roidapp/cloudlib/sns/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/baselib/b/b;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/p;->b:Ljava/lang/Object;

    return-void
.end method

.method private static a(Lcom/roidapp/baselib/b/d;Z)V
    .locals 1

    .prologue
    .line 35
    if-eqz p0, :cond_0

    .line 36
    if-eqz p1, :cond_1

    .line 38
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/b/d;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 48
    :cond_0
    :goto_0
    return-void

    .line 44
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/roidapp/baselib/b/d;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    .line 40
    :catch_1
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 93
    if-nez p1, :cond_0

    .line 117
    :goto_0
    return-object v0

    .line 97
    :cond_0
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/p;->b:Ljava/lang/Object;

    monitor-enter v3

    .line 98
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    invoke-virtual {v1}, Lcom/roidapp/baselib/b/b;->a()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_3

    .line 102
    :try_start_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    invoke-virtual {v1, p1}, Lcom/roidapp/baselib/b/b;->a(Ljava/lang/String;)Lcom/roidapp/baselib/b/g;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v2

    .line 103
    if-eqz v2, :cond_2

    .line 104
    :try_start_2
    invoke-virtual {v2}, Lcom/roidapp/baselib/b/g;->a()Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v1

    .line 105
    :try_start_3
    const-string v4, "utf-8"

    invoke-static {v1, v4}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-result-object v0

    .line 110
    :try_start_4
    invoke-static {v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    .line 111
    if-eqz v2, :cond_1

    .line 112
    invoke-virtual {v2}, Lcom/roidapp/baselib/b/g;->close()V

    :cond_1
    monitor-exit v3

    goto :goto_0

    .line 116
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    .line 110
    :cond_2
    const/4 v1, 0x0

    :try_start_5
    invoke-static {v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    .line 111
    if-eqz v2, :cond_3

    .line 112
    invoke-virtual {v2}, Lcom/roidapp/baselib/b/g;->close()V

    .line 116
    :cond_3
    :goto_1
    monitor-exit v3

    goto :goto_0

    .line 110
    :catch_0
    move-exception v1

    move-object v1, v0

    move-object v2, v0

    :goto_2
    invoke-static {v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    .line 111
    if-eqz v2, :cond_3

    .line 112
    invoke-virtual {v2}, Lcom/roidapp/baselib/b/g;->close()V

    goto :goto_1

    .line 110
    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    :goto_3
    invoke-static {v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    .line 111
    if-eqz v2, :cond_4

    .line 112
    invoke-virtual {v2}, Lcom/roidapp/baselib/b/g;->close()V

    :cond_4
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 110
    :catchall_2
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_3

    :catchall_3
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v1

    move-object v1, v0

    goto :goto_2

    :catch_2
    move-exception v4

    goto :goto_2
.end method

.method public final a()V
    .locals 3

    .prologue
    .line 23
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/p;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 24
    :try_start_0
    const-string v0, "cache init"

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/m;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :try_start_1
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v2, "sns_request"

    invoke-static {v0, v2}, Lcom/roidapp/baselib/d/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/b/b;->a(Ljava/io/File;)Lcom/roidapp/baselib/b/b;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :goto_0
    :try_start_2
    monitor-exit v1

    return-void

    .line 28
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 68
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 89
    :cond_0
    :goto_0
    return-void

    .line 72
    :cond_1
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/p;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 73
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    invoke-virtual {v1}, Lcom/roidapp/baselib/b/b;->a()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_3

    .line 77
    :try_start_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    invoke-virtual {v1, p1}, Lcom/roidapp/baselib/b/b;->b(Ljava/lang/String;)Lcom/roidapp/baselib/b/d;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    :try_start_2
    invoke-virtual {v1}, Lcom/roidapp/baselib/b/d;->a()Ljava/io/OutputStream;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v0

    .line 80
    :try_start_3
    const-string v3, "utf-8"

    invoke-virtual {p2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/OutputStream;->write([B)V

    .line 81
    const/4 v3, 0x1

    invoke-static {v1, v3}, Lcom/roidapp/cloudlib/sns/p;->a(Lcom/roidapp/baselib/b/d;Z)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 86
    :cond_2
    :try_start_4
    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    .line 89
    :cond_3
    :goto_1
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    .line 84
    :catch_0
    move-exception v1

    move-object v1, v0

    :goto_2
    const/4 v3, 0x0

    :try_start_5
    invoke-static {v1, v3}, Lcom/roidapp/cloudlib/sns/p;->a(Lcom/roidapp/baselib/b/d;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 86
    :try_start_6
    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catchall_1
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    :goto_3
    invoke-static {v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/Closeable;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_2
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_3

    .line 84
    :catch_1
    move-exception v3

    goto :goto_2
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 58
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/p;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 59
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    invoke-virtual {v0}, Lcom/roidapp/baselib/b/b;->a()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 61
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    invoke-virtual {v0}, Lcom/roidapp/baselib/b/b;->b()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 121
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/p;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 122
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    if-eqz v0, :cond_0

    .line 123
    const-string v0, "cache close"

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/m;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    invoke-virtual {v0}, Lcom/roidapp/baselib/b/b;->b()V

    .line 126
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;

    invoke-virtual {v0}, Lcom/roidapp/baselib/b/b;->close()V

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/p;->a:Lcom/roidapp/baselib/b/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
