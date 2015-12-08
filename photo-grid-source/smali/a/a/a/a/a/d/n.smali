.class public La/a/a/a/a/d/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a/a/a/a/d/h;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/io/File;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/io/File;

.field private e:La/a/a/a/a/b/ab;

.field private f:Ljava/io/File;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, La/a/a/a/a/d/n;->a:Landroid/content/Context;

    .line 53
    iput-object p2, p0, La/a/a/a/a/d/n;->b:Ljava/io/File;

    .line 54
    iput-object p4, p0, La/a/a/a/a/d/n;->c:Ljava/lang/String;

    .line 56
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, La/a/a/a/a/d/n;->b:Ljava/io/File;

    invoke-direct {v0, v1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, La/a/a/a/a/d/n;->d:Ljava/io/File;

    .line 58
    new-instance v0, La/a/a/a/a/b/ab;

    iget-object v1, p0, La/a/a/a/a/d/n;->d:Ljava/io/File;

    invoke-direct {v0, v1}, La/a/a/a/a/b/ab;-><init>(Ljava/io/File;)V

    iput-object v0, p0, La/a/a/a/a/d/n;->e:La/a/a/a/a/b/ab;

    .line 1064
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, La/a/a/a/a/d/n;->b:Ljava/io/File;

    iget-object v2, p0, La/a/a/a/a/d/n;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, La/a/a/a/a/d/n;->f:Ljava/io/File;

    .line 1065
    iget-object v0, p0, La/a/a/a/a/d/n;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1066
    iget-object v0, p0, La/a/a/a/a/d/n;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 61
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, La/a/a/a/a/d/n;->e:La/a/a/a/a/b/ab;

    invoke-virtual {v0}, La/a/a/a/a/b/ab;->a()I

    move-result v0

    return v0
.end method

.method public a(Ljava/io/File;)Ljava/io/OutputStream;
    .locals 1

    .prologue
    .line 120
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 82
    iget-object v0, p0, La/a/a/a/a/d/n;->e:La/a/a/a/a/b/ab;

    invoke-virtual {v0}, La/a/a/a/a/b/ab;->close()V

    .line 84
    iget-object v3, p0, La/a/a/a/a/d/n;->d:Ljava/io/File;

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, La/a/a/a/a/d/n;->f:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 2104
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2105
    :try_start_1
    invoke-virtual {p0, v0}, La/a/a/a/a/d/n;->a(Ljava/io/File;)Ljava/io/OutputStream;

    move-result-object v2

    .line 2106
    const/16 v0, 0x400

    new-array v0, v0, [B

    invoke-static {v1, v2, v0}, La/a/a/a/a/b/l;->a(Ljava/io/InputStream;Ljava/io/OutputStream;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2108
    const-string v0, "Failed to close file input stream"

    invoke-static {v1, v0}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 2109
    const-string v0, "Failed to close output stream"

    invoke-static {v2, v0}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 2110
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 86
    new-instance v0, La/a/a/a/a/b/ab;

    iget-object v1, p0, La/a/a/a/a/d/n;->d:Ljava/io/File;

    invoke-direct {v0, v1}, La/a/a/a/a/b/ab;-><init>(Ljava/io/File;)V

    iput-object v0, p0, La/a/a/a/a/d/n;->e:La/a/a/a/a/b/ab;

    .line 87
    return-void

    .line 2108
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_0
    const-string v4, "Failed to close file input stream"

    invoke-static {v1, v4}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 2109
    const-string v1, "Failed to close output stream"

    invoke-static {v2, v1}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 2110
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    throw v0

    .line 2108
    :catchall_1
    move-exception v0

    goto :goto_0
.end method

.method public final a(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 150
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 151
    iget-object v2, p0, La/a/a/a/a/d/n;->a:Landroid/content/Context;

    const-string v3, "deleting sent analytics file %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v2}, La/a/a/a/a/b/l;->e(Landroid/content/Context;)V

    .line 153
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    .line 155
    :cond_0
    return-void
.end method

.method public final a([B)V
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, La/a/a/a/a/d/n;->e:La/a/a/a/a/b/ab;

    .line 1291
    array-length v1, p1

    invoke-virtual {v0, p1, v1}, La/a/a/a/a/b/ab;->a([BI)V

    .line 73
    return-void
.end method

.method public final a(II)Z
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, La/a/a/a/a/d/n;->e:La/a/a/a/a/b/ab;

    invoke-virtual {v0, p1, p2}, La/a/a/a/a/b/ab;->a(II)Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, La/a/a/a/a/d/n;->e:La/a/a/a/a/b/ab;

    invoke-virtual {v0}, La/a/a/a/a/b/ab;->b()Z

    move-result v0

    return v0
.end method

.method public final c()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .prologue
    .line 135
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 137
    iget-object v0, p0, La/a/a/a/a/d/n;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 138
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-gtz v4, :cond_0

    .line 137
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 145
    :cond_0
    return-object v1
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .prologue
    .line 159
    iget-object v0, p0, La/a/a/a/a/d/n;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 165
    :try_start_0
    iget-object v0, p0, La/a/a/a/a/d/n;->e:La/a/a/a/a/b/ab;

    invoke-virtual {v0}, La/a/a/a/a/b/ab;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    :goto_0
    iget-object v0, p0, La/a/a/a/a/d/n;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 169
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
