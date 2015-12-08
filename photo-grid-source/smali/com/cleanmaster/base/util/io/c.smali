.class public Lcom/cleanmaster/base/util/io/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lcom/cleanmaster/base/util/io/b;
    .locals 1

    .prologue
    .line 18
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/base/util/io/c;->a(Ljava/io/File;)Lcom/cleanmaster/base/util/io/b;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/io/File;)Lcom/cleanmaster/base/util/io/b;
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 73
    if-nez p0, :cond_1

    .line 98
    :cond_0
    :goto_0
    return-object v0

    .line 80
    :cond_1
    :try_start_0
    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    invoke-static {v1}, Lcom/cleanmaster/base/util/io/a;->a(Landroid/os/StatFs;)J

    move-result-wide v2

    .line 87
    invoke-static {v1}, Lcom/cleanmaster/base/util/io/a;->b(Landroid/os/StatFs;)J

    move-result-wide v4

    .line 88
    invoke-static {v1}, Lcom/cleanmaster/base/util/io/a;->c(Landroid/os/StatFs;)J

    move-result-wide v6

    .line 90
    new-instance v0, Lcom/cleanmaster/base/util/io/b;

    invoke-direct {v0}, Lcom/cleanmaster/base/util/io/b;-><init>()V

    .line 91
    mul-long/2addr v4, v6

    iput-wide v4, v0, Lcom/cleanmaster/base/util/io/b;->a:J

    .line 92
    mul-long/2addr v2, v6

    iput-wide v2, v0, Lcom/cleanmaster/base/util/io/b;->b:J

    .line 94
    iget-wide v2, v0, Lcom/cleanmaster/base/util/io/b;->a:J

    iget-wide v4, v0, Lcom/cleanmaster/base/util/io/b;->b:J

    cmp-long v1, v2, v4

    if-gez v1, :cond_0

    .line 95
    iget-wide v2, v0, Lcom/cleanmaster/base/util/io/b;->a:J

    iput-wide v2, v0, Lcom/cleanmaster/base/util/io/b;->b:J

    goto :goto_0

    .line 83
    :catch_0
    move-exception v1

    goto :goto_0
.end method
