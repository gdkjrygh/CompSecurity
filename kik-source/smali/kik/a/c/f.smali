.class public final Lkik/a/c/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Ljava/io/File;

.field private final c:I

.field private final d:Ljava/util/HashMap;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-string v0, "LinkResultCache"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/c/f;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lkik/a/c/f;->e:I

    .line 45
    iput-object p1, p0, Lkik/a/c/f;->b:Ljava/io/File;

    .line 46
    const/16 v0, 0x64

    iput v0, p0, Lkik/a/c/f;->c:I

    .line 47
    new-instance v0, Lkik/a/h/a;

    invoke-direct {v0}, Lkik/a/h/a;-><init>()V

    iput-object v0, p0, Lkik/a/c/f;->d:Ljava/util/HashMap;

    .line 49
    invoke-direct {p0}, Lkik/a/c/f;->c()V

    .line 50
    return-void
.end method

.method private static a(Lcom/kik/g/p;)Z
    .locals 1

    .prologue
    .line 135
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/kik/g/p;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/r;

    invoke-static {v0}, Lkik/a/c/f;->a(Lkik/a/d/r;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Lkik/a/d/r;)Z
    .locals 4

    .prologue
    .line 150
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkik/a/d/r;->b()J

    move-result-wide v0

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 208
    iget-object v1, p0, Lkik/a/c/f;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/a/c/f;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 240
    :cond_0
    :goto_0
    return-void

    .line 216
    :cond_1
    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    iget-object v1, p0, Lkik/a/c/f;->b:Ljava/io/File;

    invoke-direct {v4, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    :try_start_1
    new-instance v2, Ljava/io/ObjectInputStream;

    invoke-direct {v2, v4}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 218
    :try_start_2
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 221
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V

    .line 224
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V

    .line 229
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/util/Map$Entry;

    move-object v2, v0

    .line 230
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/r;

    invoke-static {v1}, Lkik/a/c/f;->a(Lkik/a/d/r;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 231
    iget-object v1, p0, Lkik/a/c/f;->d:Ljava/util/HashMap;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 236
    :catch_0
    move-exception v1

    sget-object v1, Lkik/a/c/f;->a:Lorg/c/b;

    const-string v2, "Failed to read cache"

    invoke-interface {v1, v2}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 238
    iget-object v1, p0, Lkik/a/c/f;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0

    .line 221
    :catchall_0
    move-exception v1

    move-object v2, v3

    :goto_2
    if-eqz v3, :cond_3

    .line 222
    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V

    .line 224
    :cond_3
    if-eqz v2, :cond_4

    .line 225
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V

    :cond_4
    throw v1
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    .line 221
    :catchall_1
    move-exception v1

    move-object v2, v3

    move-object v3, v4

    goto :goto_2

    :catchall_2
    move-exception v1

    move-object v3, v4

    goto :goto_2
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lkik/a/c/f;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    .line 61
    invoke-static {v0}, Lkik/a/c/f;->a(Lcom/kik/g/p;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 62
    iget-object v1, p0, Lkik/a/c/f;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    :cond_0
    return-object v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lkik/a/c/f;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 112
    iget-object v0, p0, Lkik/a/c/f;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/c/f;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lkik/a/c/f;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 115
    :cond_0
    return-void
.end method

.method public final a(Ljava/util/Map;)V
    .locals 2

    .prologue
    .line 90
    iget v0, p0, Lkik/a/c/f;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/a/c/f;->e:I

    const/16 v1, 0x64

    if-lt v0, v1, :cond_1

    const/4 v0, 0x0

    iput v0, p0, Lkik/a/c/f;->e:I

    iget-object v0, p0, Lkik/a/c/f;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    invoke-static {v0}, Lkik/a/c/f;->a(Lcom/kik/g/p;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 91
    :cond_1
    iget-object v0, p0, Lkik/a/c/f;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 92
    return-void
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lkik/a/c/f;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    return-object v0
.end method

.method public final b()V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 122
    :try_start_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lkik/a/c/f;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/g/p;

    invoke-virtual {v1}, Lcom/kik/g/p;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/g/p;

    invoke-virtual {v1}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/r;

    invoke-static {v1}, Lkik/a/c/f;->a(Lkik/a/d/r;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v0

    iget v1, p0, Lkik/a/c/f;->c:I

    if-ne v0, v1, :cond_0

    :cond_1
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_2

    .line 123
    :goto_0
    return-void

    .line 122
    :cond_2
    :try_start_1
    new-instance v3, Ljava/io/FileOutputStream;

    iget-object v0, p0, Lkik/a/c/f;->b:Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v1, Ljava/io/ObjectOutputStream;

    invoke-direct {v1, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v1, v4}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v0, Lkik/a/c/f;->a:Lorg/c/b;

    const-string v1, "Failed to write cache"

    invoke-interface {v0, v1}, Lorg/c/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_1
    if-eqz v2, :cond_3

    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V

    :cond_4
    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    :catchall_1
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v2, v3

    goto :goto_1
.end method
