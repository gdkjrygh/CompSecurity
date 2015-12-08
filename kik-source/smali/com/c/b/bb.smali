.class public final Lcom/c/b/bb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/bb$a;,
        Lcom/c/b/bb$b;
    }
.end annotation


# instance fields
.field private volatile b:Z

.field private volatile c:I

.field private d:Lcom/c/b/bc$c;

.field private e:Ljava/util/List;

.field private final f:Lcom/c/b/bb$a;


# direct methods
.method private a(Lcom/c/b/bc$c;)Ljava/util/List;
    .locals 3

    .prologue
    .line 157
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 158
    invoke-virtual {p1}, Lcom/c/b/bc$c;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 159
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    iget-object v0, p0, Lcom/c/b/bb;->f:Lcom/c/b/bb$a;

    invoke-interface {v0}, Lcom/c/b/bb$a;->a()Lcom/c/b/bd;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 163
    :cond_0
    return-object v1
.end method

.method private e()Ljava/util/Map;
    .locals 3

    .prologue
    .line 176
    iget v0, p0, Lcom/c/b/bb;->c:I

    sget v1, Lcom/c/b/bb$b;->b:I

    if-ne v0, v1, :cond_2

    .line 177
    monitor-enter p0

    .line 178
    :try_start_0
    iget v0, p0, Lcom/c/b/bb;->c:I

    sget v1, Lcom/c/b/bb$b;->b:I

    if-ne v0, v1, :cond_1

    .line 179
    iget-object v0, p0, Lcom/c/b/bb;->e:Ljava/util/List;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    .line 182
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 179
    :cond_0
    :try_start_1
    new-instance v0, Lcom/c/b/bc$c;

    invoke-direct {v0, p0, v1}, Lcom/c/b/bc$c;-><init>(Lcom/c/b/bi;Ljava/util/Map;)V

    iput-object v0, p0, Lcom/c/b/bb;->d:Lcom/c/b/bc$c;

    .line 180
    sget v0, Lcom/c/b/bb$b;->c:I

    iput v0, p0, Lcom/c/b/bb;->c:I

    .line 182
    :cond_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 184
    :cond_2
    iget-object v0, p0, Lcom/c/b/bb;->d:Lcom/c/b/bc$c;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method final a()Ljava/util/List;
    .locals 2

    .prologue
    .line 231
    iget v0, p0, Lcom/c/b/bb;->c:I

    sget v1, Lcom/c/b/bb$b;->a:I

    if-ne v0, v1, :cond_1

    .line 232
    monitor-enter p0

    .line 233
    :try_start_0
    iget v0, p0, Lcom/c/b/bb;->c:I

    sget v1, Lcom/c/b/bb$b;->a:I

    if-ne v0, v1, :cond_0

    .line 234
    iget-object v0, p0, Lcom/c/b/bb;->d:Lcom/c/b/bc$c;

    invoke-direct {p0, v0}, Lcom/c/b/bb;->a(Lcom/c/b/bc$c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/bb;->e:Ljava/util/List;

    .line 235
    sget v0, Lcom/c/b/bb$b;->c:I

    iput v0, p0, Lcom/c/b/bb;->c:I

    .line 237
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    :cond_1
    iget-object v0, p0, Lcom/c/b/bb;->e:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 237
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method final b()Ljava/util/List;
    .locals 2

    .prologue
    .line 244
    iget v0, p0, Lcom/c/b/bb;->c:I

    sget v1, Lcom/c/b/bb$b;->b:I

    if-eq v0, v1, :cond_1

    .line 245
    iget v0, p0, Lcom/c/b/bb;->c:I

    sget v1, Lcom/c/b/bb$b;->a:I

    if-ne v0, v1, :cond_0

    .line 246
    iget-object v0, p0, Lcom/c/b/bb;->d:Lcom/c/b/bc$c;

    invoke-direct {p0, v0}, Lcom/c/b/bb;->a(Lcom/c/b/bc$c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/bb;->e:Ljava/util/List;

    .line 248
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/bb;->d:Lcom/c/b/bc$c;

    .line 249
    sget v0, Lcom/c/b/bb$b;->b:I

    iput v0, p0, Lcom/c/b/bb;->c:I

    .line 251
    :cond_1
    iget-object v0, p0, Lcom/c/b/bb;->e:Ljava/util/List;

    return-object v0
.end method

.method final c()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 259
    iget-object v0, p0, Lcom/c/b/bb;->f:Lcom/c/b/bb$a;

    invoke-interface {v0}, Lcom/c/b/bb$a;->b()Lcom/c/b/bd;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 282
    iget-boolean v0, p0, Lcom/c/b/bb;->b:Z

    if-nez v0, :cond_0

    .line 283
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 285
    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 211
    instance-of v0, p1, Lcom/c/b/bb;

    if-nez v0, :cond_0

    .line 212
    const/4 v0, 0x0

    .line 215
    :goto_0
    return v0

    .line 214
    :cond_0
    check-cast p1, Lcom/c/b/bb;

    .line 215
    invoke-direct {p0}, Lcom/c/b/bb;->e()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1}, Lcom/c/b/bb;->e()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/bc;->a(Ljava/util/Map;Ljava/util/Map;)Z

    move-result v0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 220
    invoke-direct {p0}, Lcom/c/b/bb;->e()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/bc;->a(Ljava/util/Map;)I

    move-result v0

    return v0
.end method
