.class public Lcom/facebook/breakpad/BreakpadManager;
.super Ljava/lang/Object;
.source "BreakpadManager.java"


# instance fields
.field private a:Ljava/lang/Boolean;

.field private b:Ljava/io/File;

.field private c:Lcom/facebook/analytics/av;

.field private d:Lcom/facebook/common/e/h;

.field private e:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/io/File;Lcom/facebook/analytics/av;Lcom/facebook/common/e/h;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/breakpad/BreakpadManager;->a:Ljava/lang/Boolean;

    .line 57
    iput-object p1, p0, Lcom/facebook/breakpad/BreakpadManager;->b:Ljava/io/File;

    .line 58
    iput-object p2, p0, Lcom/facebook/breakpad/BreakpadManager;->c:Lcom/facebook/analytics/av;

    .line 59
    iput-object p3, p0, Lcom/facebook/breakpad/BreakpadManager;->d:Lcom/facebook/common/e/h;

    .line 60
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/breakpad/BreakpadManager;->e:Ljava/lang/Boolean;

    .line 61
    return-void
.end method

.method private b()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 126
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v5

    .line 127
    new-instance v0, Lcom/facebook/breakpad/a;

    invoke-direct {v0, p0}, Lcom/facebook/breakpad/a;-><init>(Lcom/facebook/breakpad/BreakpadManager;)V

    .line 133
    iget-object v1, p0, Lcom/facebook/breakpad/BreakpadManager;->b:Ljava/io/File;

    invoke-virtual {v1, v0}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    move-result-object v6

    .line 134
    if-eqz v6, :cond_5

    .line 135
    array-length v7, v6

    move v4, v3

    :goto_0
    if-ge v4, v7, :cond_5

    aget-object v0, v6, v4

    .line 136
    new-instance v8, Ljava/io/File;

    iget-object v1, p0, Lcom/facebook/breakpad/BreakpadManager;->b:Ljava/io/File;

    invoke-direct {v8, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 137
    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v1

    long-to-int v1, v1

    .line 138
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "found dump file: "

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " bytes"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/log/f;->c(Ljava/lang/String;)V

    .line 139
    new-array v9, v1, [B

    .line 142
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move v0, v3

    .line 145
    :cond_0
    sub-int v10, v1, v0

    invoke-virtual {v2, v9, v0, v10}, Ljava/io/FileInputStream;->read([BII)I

    move-result v10

    .line 146
    const/4 v11, -0x1

    if-ne v10, v11, :cond_3

    .line 151
    :goto_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 154
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 155
    const/4 v2, 0x0

    .line 157
    :try_start_1
    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v1, v10}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    const/4 v0, 0x0

    :try_start_2
    array-length v2, v9

    invoke-virtual {v1, v9, v0, v2}, Ljava/util/zip/GZIPOutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 160
    if-eqz v1, :cond_1

    .line 162
    :try_start_3
    invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V

    .line 163
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    .line 176
    :cond_1
    :goto_2
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v0

    .line 177
    if-nez v0, :cond_2

    .line 178
    iget-object v0, p0, Lcom/facebook/breakpad/BreakpadManager;->d:Lcom/facebook/common/e/h;

    const-string v1, "BreakpadManager"

    const-string v2, "Could not delete dump file"

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    :cond_2
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    .line 149
    :cond_3
    add-int/2addr v0, v10

    .line 150
    sub-int v10, v1, v0

    if-gtz v10, :cond_0

    goto :goto_1

    .line 164
    :catch_0
    move-exception v0

    .line 165
    :try_start_4
    iget-object v1, p0, Lcom/facebook/breakpad/BreakpadManager;->d:Lcom/facebook/common/e/h;

    const-string v2, "BreakpadManager"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "gzip failed: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    .line 169
    :catch_1
    move-exception v0

    .line 170
    iget-object v1, p0, Lcom/facebook/breakpad/BreakpadManager;->d:Lcom/facebook/common/e/h;

    const-string v2, "BreakpadManager"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "FileNotFoundException: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 160
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_3
    if-eqz v1, :cond_4

    .line 162
    :try_start_5
    invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V

    .line 163
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_1

    .line 166
    :cond_4
    :goto_4
    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 171
    :catch_2
    move-exception v0

    .line 172
    iget-object v1, p0, Lcom/facebook/breakpad/BreakpadManager;->d:Lcom/facebook/common/e/h;

    const-string v2, "BreakpadManager"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Could not read native crash report: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 164
    :catch_3
    move-exception v1

    .line 165
    :try_start_7
    iget-object v2, p0, Lcom/facebook/breakpad/BreakpadManager;->d:Lcom/facebook/common/e/h;

    const-string v9, "BreakpadManager"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "gzip failed: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v9, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    goto :goto_4

    .line 182
    :cond_5
    return-object v5

    .line 160
    :catchall_1
    move-exception v0

    goto :goto_3
.end method

.method private native install(Ljava/lang/String;)V
.end method

.method public static nativeCrashed(Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Native crash reported: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/log/f;->a(Ljava/lang/String;)V

    .line 118
    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 68
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/breakpad/BreakpadManager;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/breakpad/BreakpadManager;->b:Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 91
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 74
    :cond_1
    :try_start_1
    const-string v0, "fb_stl_shared"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 75
    const-string v0, "fb_breakpad_client"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/facebook/breakpad/BreakpadManager;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/breakpad/BreakpadManager;->install(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    :goto_1
    :try_start_2
    invoke-direct {p0}, Lcom/facebook/breakpad/BreakpadManager;->b()Ljava/util/List;

    move-result-object v2

    .line 83
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 84
    new-instance v4, Lcom/facebook/analytics/cb;

    const-string v5, "NATIVE_CRASH"

    invoke-direct {v4, v5}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 85
    const-string v5, "app"

    invoke-virtual {v4, v5}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 86
    const-string v5, "MINIDUMP"

    invoke-virtual {v4, v5, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 87
    iget-object v0, p0, Lcom/facebook/breakpad/BreakpadManager;->c:Lcom/facebook/analytics/av;

    invoke-interface {v0, v4}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    .line 68
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    :try_start_3
    iget-object v2, p0, Lcom/facebook/breakpad/BreakpadManager;->d:Lcom/facebook/common/e/h;

    const-string v3, "fb_breakpad_client"

    invoke-virtual {v0}, Ljava/lang/UnsatisfiedLinkError;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 89
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/breakpad/BreakpadManager;->e:Ljava/lang/Boolean;

    .line 90
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/breakpad/BreakpadManager;->a:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 89
    :cond_3
    const/4 v0, 0x0

    goto :goto_3
.end method
