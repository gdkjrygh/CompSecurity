.class public Lb/a/a/a/a/d/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/d/l;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/io/File;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/io/File;

.field private e:Lb/a/a/a/a/b/w;

.field private f:Ljava/io/File;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lb/a/a/a/a/d/r;->a:Landroid/content/Context;

    .line 53
    iput-object p2, p0, Lb/a/a/a/a/d/r;->b:Ljava/io/File;

    .line 54
    iput-object p4, p0, Lb/a/a/a/a/d/r;->c:Ljava/lang/String;

    .line 56
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lb/a/a/a/a/d/r;->b:Ljava/io/File;

    invoke-direct {v0, v1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lb/a/a/a/a/d/r;->d:Ljava/io/File;

    .line 58
    new-instance v0, Lb/a/a/a/a/b/w;

    iget-object v1, p0, Lb/a/a/a/a/d/r;->d:Ljava/io/File;

    invoke-direct {v0, v1}, Lb/a/a/a/a/b/w;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lb/a/a/a/a/d/r;->e:Lb/a/a/a/a/b/w;

    .line 60
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lb/a/a/a/a/d/r;->b:Ljava/io/File;

    iget-object v2, p0, Lb/a/a/a/a/d/r;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lb/a/a/a/a/d/r;->f:Ljava/io/File;

    iget-object v0, p0, Lb/a/a/a/a/d/r;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb/a/a/a/a/d/r;->f:Ljava/io/File;

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
    iget-object v0, p0, Lb/a/a/a/a/d/r;->e:Lb/a/a/a/a/b/w;

    invoke-virtual {v0}, Lb/a/a/a/a/b/w;->a()I

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
    iget-object v0, p0, Lb/a/a/a/a/d/r;->e:Lb/a/a/a/a/b/w;

    invoke-virtual {v0}, Lb/a/a/a/a/b/w;->close()V

    .line 84
    iget-object v3, p0, Lb/a/a/a/a/d/r;->d:Ljava/io/File;

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lb/a/a/a/a/d/r;->f:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0, v0}, Lb/a/a/a/a/d/r;->a(Ljava/io/File;)Ljava/io/OutputStream;

    move-result-object v2

    const/16 v0, 0x400

    new-array v0, v0, [B

    invoke-static {v1, v2, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/InputStream;Ljava/io/OutputStream;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v0, "Failed to close file input stream"

    invoke-static {v1, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    const-string v0, "Failed to close output stream"

    invoke-static {v2, v0}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 86
    new-instance v0, Lb/a/a/a/a/b/w;

    iget-object v1, p0, Lb/a/a/a/a/d/r;->d:Ljava/io/File;

    invoke-direct {v0, v1}, Lb/a/a/a/a/b/w;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lb/a/a/a/a/d/r;->e:Lb/a/a/a/a/b/w;

    .line 87
    return-void

    .line 84
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_0
    const-string v4, "Failed to close file input stream"

    invoke-static {v1, v4}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    const-string v1, "Failed to close output stream"

    invoke-static {v2, v1}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_0
.end method

.method public final a(Ljava/util/List;)V
    .locals 7

    .prologue
    .line 148
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 149
    iget-object v2, p0, Lb/a/a/a/a/d/r;->a:Landroid/content/Context;

    const-string v3, "deleting sent analytics file %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v2}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    .line 151
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    .line 153
    :cond_0
    return-void
.end method

.method public final a([B)V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lb/a/a/a/a/d/r;->e:Lb/a/a/a/a/b/w;

    invoke-virtual {v0, p1}, Lb/a/a/a/a/b/w;->a([B)V

    .line 73
    return-void
.end method

.method public final a(II)Z
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lb/a/a/a/a/d/r;->e:Lb/a/a/a/a/b/w;

    invoke-virtual {v0, p1, p2}, Lb/a/a/a/a/b/w;->a(II)Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lb/a/a/a/a/d/r;->e:Lb/a/a/a/a/b/w;

    invoke-virtual {v0}, Lb/a/a/a/a/b/w;->b()Z

    move-result v0

    return v0
.end method

.method public final c()Ljava/util/List;
    .locals 5

    .prologue
    .line 135
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 137
    iget-object v0, p0, Lb/a/a/a/a/d/r;->f:Ljava/io/File;

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

    .line 143
    :cond_0
    return-object v1
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lb/a/a/a/a/d/r;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 163
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/d/r;->e:Lb/a/a/a/a/b/w;

    invoke-virtual {v0}, Lb/a/a/a/a/b/w;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    :goto_0
    iget-object v0, p0, Lb/a/a/a/a/d/r;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 167
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
