.class public final Lcom/android/volley/toolbox/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/volley/toolbox/d$b;,
        Lcom/android/volley/toolbox/d$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;

.field private b:J

.field private final c:Ljava/io/File;

.field private final d:I


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 86
    const/high16 v0, 0x500000

    invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/d;-><init>(Ljava/io/File;I)V

    .line 87
    return-void
.end method

.method public constructor <init>(Ljava/io/File;I)V
    .locals 4

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/LinkedHashMap;

    const/16 v1, 0x10

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Lcom/android/volley/toolbox/d;->a:Ljava/util/Map;

    .line 51
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/android/volley/toolbox/d;->b:J

    .line 75
    iput-object p1, p0, Lcom/android/volley/toolbox/d;->c:Ljava/io/File;

    .line 76
    iput p2, p0, Lcom/android/volley/toolbox/d;->d:I

    .line 77
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/android/volley/toolbox/d$a;)V
    .locals 6

    .prologue
    .line 325
    iget-object v0, p0, Lcom/android/volley/toolbox/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 326
    iget-wide v0, p0, Lcom/android/volley/toolbox/d;->b:J

    iget-wide v2, p2, Lcom/android/volley/toolbox/d$a;->a:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/android/volley/toolbox/d;->b:J

    .line 332
    :goto_0
    iget-object v0, p0, Lcom/android/volley/toolbox/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    return-void

    .line 329
    :cond_0
    iget-object v0, p0, Lcom/android/volley/toolbox/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/d$a;

    .line 330
    iget-wide v2, p0, Lcom/android/volley/toolbox/d;->b:J

    iget-wide v4, p2, Lcom/android/volley/toolbox/d$a;->a:J

    iget-wide v0, v0, Lcom/android/volley/toolbox/d$a;->a:J

    sub-long v0, v4, v0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/android/volley/toolbox/d;->b:J

    goto :goto_0
.end method

.method private static a(Ljava/io/InputStream;I)[B
    .locals 4

    .prologue
    .line 352
    new-array v1, p1, [B

    .line 354
    const/4 v0, 0x0

    .line 355
    :goto_0
    if-ge v0, p1, :cond_0

    sub-int v2, p1, v0

    invoke-virtual {p0, v1, v0, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 356
    add-int/2addr v0, v2

    goto :goto_0

    .line 358
    :cond_0
    if-eq v0, p1, :cond_1

    .line 359
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " bytes, read "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " bytes"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 361
    :cond_1
    return-object v1
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 261
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 262
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 263
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 264
    return-object v0
.end method

.method private e(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .prologue
    .line 272
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/android/volley/toolbox/d;->c:Ljava/io/File;

    invoke-static {p1}, Lcom/android/volley/toolbox/d;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;)Lcom/android/volley/b$a;
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 112
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/volley/toolbox/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/d$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 114
    if-nez v0, :cond_0

    move-object v0, v1

    .line 137
    :goto_0
    monitor-exit p0

    return-object v0

    .line 118
    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/android/volley/toolbox/d;->e(Ljava/lang/String;)Ljava/io/File;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v4

    .line 121
    :try_start_2
    new-instance v3, Lcom/android/volley/toolbox/d$b;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/4 v5, 0x0

    invoke-direct {v3, v2, v5}, Lcom/android/volley/toolbox/d$b;-><init>(Ljava/io/InputStream;B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    :try_start_3
    invoke-static {v3}, Lcom/android/volley/toolbox/d$a;->a(Ljava/io/InputStream;)Lcom/android/volley/toolbox/d$a;

    .line 123
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v6

    invoke-static {v3}, Lcom/android/volley/toolbox/d$b;->a(Lcom/android/volley/toolbox/d$b;)I

    move-result v2

    int-to-long v8, v2

    sub-long/2addr v6, v8

    long-to-int v2, v6

    invoke-static {v3, v2}, Lcom/android/volley/toolbox/d;->a(Ljava/io/InputStream;I)[B

    move-result-object v5

    .line 124
    new-instance v2, Lcom/android/volley/b$a;

    invoke-direct {v2}, Lcom/android/volley/b$a;-><init>()V

    iput-object v5, v2, Lcom/android/volley/b$a;->a:[B

    iget-object v5, v0, Lcom/android/volley/toolbox/d$a;->c:Ljava/lang/String;

    iput-object v5, v2, Lcom/android/volley/b$a;->b:Ljava/lang/String;

    iget-wide v6, v0, Lcom/android/volley/toolbox/d$a;->d:J

    iput-wide v6, v2, Lcom/android/volley/b$a;->c:J

    iget-wide v6, v0, Lcom/android/volley/toolbox/d$a;->e:J

    iput-wide v6, v2, Lcom/android/volley/b$a;->d:J

    iget-wide v6, v0, Lcom/android/volley/toolbox/d$a;->f:J

    iput-wide v6, v2, Lcom/android/volley/b$a;->e:J

    iget-object v0, v0, Lcom/android/volley/toolbox/d$a;->g:Ljava/util/Map;

    iput-object v0, v2, Lcom/android/volley/b$a;->f:Ljava/util/Map;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 132
    :try_start_4
    invoke-virtual {v3}, Lcom/android/volley/toolbox/d$b;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object v0, v2

    .line 137
    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 126
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 127
    :goto_1
    :try_start_5
    const-string v3, "%s: %s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v5, v6

    const/4 v4, 0x1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v4

    invoke-static {v3, v5}, Lcom/android/volley/x;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/d;->b(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 129
    if-eqz v2, :cond_1

    .line 134
    :try_start_6
    invoke-virtual {v2}, Lcom/android/volley/toolbox/d$b;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_1
    move-object v0, v1

    .line 137
    goto :goto_0

    :catch_2
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 132
    :catchall_0
    move-exception v0

    move-object v3, v1

    :goto_2
    if-eqz v3, :cond_2

    .line 134
    :try_start_7
    invoke-virtual {v3}, Lcom/android/volley/toolbox/d$b;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 137
    :cond_2
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 112
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 137
    :catch_3
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 132
    :catchall_2
    move-exception v0

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v3, v2

    goto :goto_2

    .line 126
    :catch_4
    move-exception v0

    move-object v2, v3

    goto :goto_1
.end method

.method public final declared-synchronized a()V
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 150
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/android/volley/toolbox/d;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 151
    iget-object v0, p0, Lcom/android/volley/toolbox/d;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 152
    const-string v0, "Unable to create cache dir %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/android/volley/toolbox/d;->c:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/android/volley/x;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 184
    :cond_0
    monitor-exit p0

    return-void

    .line 157
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/android/volley/toolbox/d;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 158
    if-eqz v3, :cond_0

    .line 161
    array-length v4, v3

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_0

    aget-object v5, v3, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 162
    const/4 v1, 0x0

    .line 164
    :try_start_2
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    :try_start_3
    invoke-static {v0}, Lcom/android/volley/toolbox/d$a;->a(Ljava/io/InputStream;)Lcom/android/volley/toolbox/d$a;

    move-result-object v1

    .line 166
    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v6

    iput-wide v6, v1, Lcom/android/volley/toolbox/d$a;->a:J

    .line 167
    iget-object v6, v1, Lcom/android/volley/toolbox/d$a;->b:Ljava/lang/String;

    invoke-direct {p0, v6, v1}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Lcom/android/volley/toolbox/d$a;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 176
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 161
    :cond_2
    :goto_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 170
    :catch_0
    move-exception v0

    move-object v0, v1

    :goto_2
    if-eqz v5, :cond_3

    .line 171
    :try_start_5
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 176
    :cond_3
    if-eqz v0, :cond_2

    .line 177
    :try_start_6
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    .line 182
    :catch_1
    move-exception v0

    goto :goto_1

    .line 175
    :catchall_0
    move-exception v0

    .line 176
    :goto_3
    if-eqz v1, :cond_4

    .line 177
    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 181
    :cond_4
    :goto_4
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 150
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 182
    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v1

    goto :goto_4

    .line 175
    :catchall_2
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_3

    .line 170
    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method public final declared-synchronized a(Ljava/lang/String;Lcom/android/volley/b$a;)V
    .locals 12

    .prologue
    const/4 v1, 0x0

    .line 211
    monitor-enter p0

    :try_start_0
    iget-object v0, p2, Lcom/android/volley/b$a;->a:[B

    array-length v2, v0

    iget-wide v4, p0, Lcom/android/volley/toolbox/d;->b:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iget v0, p0, Lcom/android/volley/toolbox/d;->d:I

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_1

    sget-boolean v0, Lcom/android/volley/x;->b:Z

    if-eqz v0, :cond_0

    const-string v0, "Pruning old cache entries."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lcom/android/volley/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-wide v4, p0, Lcom/android/volley/toolbox/d;->b:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    iget-object v0, p0, Lcom/android/volley/toolbox/d;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/d$a;

    iget-object v8, v0, Lcom/android/volley/toolbox/d$a;->b:Ljava/lang/String;

    invoke-direct {p0, v8}, Lcom/android/volley/toolbox/d;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v8

    if-eqz v8, :cond_3

    iget-wide v8, p0, Lcom/android/volley/toolbox/d;->b:J

    iget-wide v10, v0, Lcom/android/volley/toolbox/d$a;->a:J

    sub-long/2addr v8, v10

    iput-wide v8, p0, Lcom/android/volley/toolbox/d;->b:J

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    add-int/lit8 v0, v1, 0x1

    iget-wide v8, p0, Lcom/android/volley/toolbox/d;->b:J

    int-to-long v10, v2

    add-long/2addr v8, v10

    long-to-float v1, v8

    iget v8, p0, Lcom/android/volley/toolbox/d;->d:I

    int-to-float v8, v8

    const v9, 0x3f666666    # 0.9f

    mul-float/2addr v8, v9

    cmpg-float v1, v1, v8

    if-gez v1, :cond_4

    :goto_2
    sget-boolean v1, Lcom/android/volley/x;->b:Z

    if-eqz v1, :cond_1

    const-string v1, "pruned %d files, %d bytes, %d ms"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    iget-wide v8, p0, Lcom/android/volley/toolbox/d;->b:J

    sub-long v4, v8, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Lcom/android/volley/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    :cond_1
    invoke-direct {p0, p1}, Lcom/android/volley/toolbox/d;->e(Ljava/lang/String;)Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 214
    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 215
    new-instance v2, Lcom/android/volley/toolbox/d$a;

    invoke-direct {v2, p1, p2}, Lcom/android/volley/toolbox/d$a;-><init>(Ljava/lang/String;Lcom/android/volley/b$a;)V

    .line 216
    invoke-virtual {v2, v1}, Lcom/android/volley/toolbox/d$a;->a(Ljava/io/OutputStream;)Z

    .line 217
    iget-object v3, p2, Lcom/android/volley/b$a;->a:[B

    invoke-virtual {v1, v3}, Ljava/io/FileOutputStream;->write([B)V

    .line 218
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 219
    invoke-direct {p0, p1, v2}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Lcom/android/volley/toolbox/d$a;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 228
    :cond_2
    :goto_3
    monitor-exit p0

    return-void

    .line 211
    :cond_3
    :try_start_2
    const-string v8, "Could not delete cache entry for key=%s, filename=%s"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    iget-object v11, v0, Lcom/android/volley/toolbox/d$a;->b:Ljava/lang/String;

    aput-object v11, v9, v10

    const/4 v10, 0x1

    iget-object v0, v0, Lcom/android/volley/toolbox/d$a;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/android/volley/toolbox/d;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    invoke-static {v8, v9}, Lcom/android/volley/x;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 224
    :catch_0
    move-exception v1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    .line 225
    if-nez v1, :cond_2

    .line 226
    const-string v1, "Could not clean up file %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/android/volley/x;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :cond_4
    move v1, v0

    goto/16 :goto_0

    :cond_5
    move v0, v1

    goto :goto_2
.end method

.method public final declared-synchronized a(Ljava/lang/String;Z)V
    .locals 4

    .prologue
    .line 194
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;)Lcom/android/volley/b$a;

    move-result-object v0

    .line 195
    if-eqz v0, :cond_1

    .line 196
    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/android/volley/b$a;->e:J

    .line 197
    if-eqz p2, :cond_0

    .line 198
    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/android/volley/b$a;->d:J

    .line 200
    :cond_0
    invoke-virtual {p0, p1, v0}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Lcom/android/volley/b$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    :cond_1
    monitor-exit p0

    return-void

    .line 194
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 95
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/android/volley/toolbox/d;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 96
    if-eqz v1, :cond_0

    .line 97
    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 98
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 97
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/android/volley/toolbox/d;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 102
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/android/volley/toolbox/d;->b:J

    .line 103
    const-string v0, "Cache cleared."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/android/volley/x;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    monitor-exit p0

    return-void

    .line 95
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 236
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/android/volley/toolbox/d;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    .line 237
    iget-object v0, p0, Lcom/android/volley/toolbox/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/d$a;

    if-eqz v0, :cond_0

    iget-wide v2, p0, Lcom/android/volley/toolbox/d;->b:J

    iget-wide v4, v0, Lcom/android/volley/toolbox/d$a;->a:J

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/android/volley/toolbox/d;->b:J

    iget-object v0, p0, Lcom/android/volley/toolbox/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    :cond_0
    if-nez v1, :cond_1

    .line 239
    const-string v0, "Could not delete cache entry for key=%s, filename=%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    .line 240
    invoke-static {p1}, Lcom/android/volley/toolbox/d;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    .line 239
    invoke-static {v0, v1}, Lcom/android/volley/x;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    :cond_1
    monitor-exit p0

    return-void

    .line 236
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 251
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/volley/toolbox/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
