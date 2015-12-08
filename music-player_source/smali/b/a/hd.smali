.class public final Lb/a/hd;
.super Ljava/lang/Object;


# static fields
.field private static final a:[B

.field private static d:Lb/a/hd;


# instance fields
.field private b:Lb/a/hx;

.field private c:Lb/a/cb;

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "pbl0"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Lb/a/hd;->a:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lb/a/hd;->c:Lb/a/cb;

    iput-object p1, p0, Lb/a/hd;->e:Landroid/content/Context;

    return-void
.end method

.method private a(Ljava/lang/String;)I
    .locals 3

    const/4 v1, -0x1

    iget-object v0, p0, Lb/a/hd;->c:Lb/a/cb;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb/a/cb;->b()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    invoke-virtual {v0}, Lb/a/cb;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/ch;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lb/a/ch;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    :try_start_0
    invoke-virtual {v0}, Lb/a/ch;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lb/a/hd;
    .locals 6

    const/4 v2, 0x0

    const-class v3, Lb/a/hd;

    monitor-enter v3

    :try_start_0
    sget-object v0, Lb/a/hd;->d:Lb/a/hd;

    if-nez v0, :cond_0

    new-instance v4, Lb/a/hd;

    invoke-direct {v4, p0}, Lb/a/hd;-><init>(Landroid/content/Context;)V

    sput-object v4, Lb/a/hd;->d:Lb/a/hd;

    new-instance v0, Ljava/io/File;

    iget-object v1, v4, Lb/a/hd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v5, ".imprint"

    invoke-direct {v0, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, v4, Lb/a/hd;->e:Landroid/content/Context;

    const-string v1, ".imprint"

    invoke-virtual {v0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v1

    :try_start_2
    invoke-static {v1}, Lb/a/fj;->b(Ljava/io/InputStream;)[B
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v2

    :try_start_3
    invoke-static {v1}, Lb/a/fj;->c(Ljava/io/InputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    if-eqz v2, :cond_0

    :try_start_4
    new-instance v0, Lb/a/cb;

    invoke-direct {v0}, Lb/a/cb;-><init>()V

    new-instance v1, Lb/a/fp;

    invoke-direct {v1}, Lb/a/fp;-><init>()V

    invoke-virtual {v1, v0, v2}, Lb/a/fp;->a(Lb/a/fm;[B)V

    iput-object v0, v4, Lb/a/hd;->c:Lb/a/cb;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_0
    :goto_1
    :try_start_5
    sget-object v0, Lb/a/hd;->d:Lb/a/hd;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v3

    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v2

    :goto_2
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    invoke-static {v1}, Lb/a/fj;->c(Ljava/io/InputStream;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0

    :catchall_1
    move-exception v0

    :goto_3
    :try_start_8
    invoke-static {v2}, Lb/a/fj;->c(Ljava/io/InputStream;)V

    throw v0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v2, v1

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_2
.end method

.method private static b(Lb/a/cb;)Ljava/lang/String;
    .locals 6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v0, Ljava/util/TreeMap;

    invoke-virtual {p0}, Lb/a/cb;->a()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/a/ch;

    invoke-virtual {v1}, Lb/a/ch;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/a/ch;

    invoke-virtual {v1}, Lb/a/ch;->d()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/ch;

    invoke-virtual {v0}, Lb/a/ch;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget v0, p0, Lb/a/cb;->b:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lb/a/fj;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a()Lb/a/cb;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/a/hd;->c:Lb/a/cb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lb/a/cb;)V
    .locals 12

    const/4 v3, 0x1

    const/4 v11, 0x4

    const/4 v10, -0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lb/a/cb;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lb/a/hd;->b(Lb/a/cb;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    move v0, v1

    :goto_1
    if-eqz v0, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lb/a/hd;->c:Lb/a/cb;

    if-nez v2, :cond_a

    :goto_2
    iput-object p1, p0, Lb/a/hd;->c:Lb/a/cb;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lb/a/hd;->c:Lb/a/cb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb/a/hd;->b:Lb/a/hx;

    if-eqz v0, :cond_0

    const-string v0, "defcon"

    invoke-direct {p0, v0}, Lb/a/hd;->a(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v10, :cond_2

    iget-object v1, p0, Lb/a/hd;->b:Lb/a/hx;

    invoke-interface {v1, v0}, Lb/a/hx;->a(I)V

    iget-object v1, p0, Lb/a/hd;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    invoke-static {v0}, Lcom/b/a/t;->a(I)V

    :cond_2
    const-string v0, "latent"

    invoke-direct {p0, v0}, Lb/a/hd;->a(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v10, :cond_3

    mul-int/lit16 v0, v0, 0x3e8

    iget-object v1, p0, Lb/a/hd;->b:Lb/a/hx;

    invoke-interface {v1, v0}, Lb/a/hx;->b(I)V

    iget-object v1, p0, Lb/a/hd;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    invoke-static {v0}, Lcom/b/a/t;->b(I)V

    :cond_3
    const-string v0, "codex"

    invoke-direct {p0, v0}, Lb/a/hd;->a(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_4

    if-eq v0, v3, :cond_4

    if-ne v0, v10, :cond_0

    :cond_4
    iget-object v1, p0, Lb/a/hd;->b:Lb/a/hx;

    invoke-interface {v1, v0}, Lb/a/hx;->c(I)V

    iget-object v1, p0, Lb/a/hd;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    invoke-static {v0}, Lcom/b/a/t;->c(I)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lb/a/cb;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/ch;

    invoke-virtual {v0}, Lb/a/ch;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/b/a/l;->a(Ljava/lang/String;)[B

    move-result-object v4

    const/16 v5, 0x8

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Lb/a/ch;->d()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    sget-object v6, Lb/a/hd;->a:[B

    new-array v7, v11, [B

    move v0, v1

    :goto_3
    if-ge v0, v11, :cond_7

    aget-byte v8, v5, v0

    aget-byte v9, v6, v0

    xor-int/2addr v8, v9

    int-to-byte v8, v8

    aput-byte v8, v7, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_7
    move v0, v1

    :goto_4
    if-ge v0, v11, :cond_6

    aget-byte v5, v4, v0

    aget-byte v6, v7, v0

    if-eq v5, v6, :cond_8

    move v0, v1

    goto/16 :goto_1

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_9
    move v0, v3

    goto/16 :goto_1

    :cond_a
    if-nez p1, :cond_b

    move-object p1, v2

    goto/16 :goto_2

    :cond_b
    :try_start_1
    invoke-virtual {v2}, Lb/a/cb;->a()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {p1}, Lb/a/cb;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/a/ch;

    invoke-virtual {v1}, Lb/a/ch;->b()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_c
    :try_start_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_d
    invoke-virtual {p1}, Lb/a/cb;->d()I

    move-result v0

    invoke-virtual {v2, v0}, Lb/a/cb;->a(I)Lb/a/cb;

    invoke-static {v2}, Lb/a/hd;->b(Lb/a/cb;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lb/a/cb;->a(Ljava/lang/String;)Lb/a/cb;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object p1, v2

    goto/16 :goto_2
.end method

.method public final a(Lb/a/hx;)V
    .locals 0

    iput-object p1, p0, Lb/a/hd;->b:Lb/a/hx;

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Lb/a/hd;->c:Lb/a/cb;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    new-instance v0, Lb/a/fs;

    invoke-direct {v0}, Lb/a/fs;-><init>()V

    iget-object v1, p0, Lb/a/hd;->c:Lb/a/cb;

    invoke-virtual {v0, v1}, Lb/a/fs;->a(Lb/a/fm;)[B

    move-result-object v0

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lb/a/hd;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string v3, ".imprint"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v1, v0}, Lb/a/fj;->a(Ljava/io/File;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
