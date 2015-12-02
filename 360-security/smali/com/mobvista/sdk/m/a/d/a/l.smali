.class public Lcom/mobvista/sdk/m/a/d/a/l;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private final a:Ljava/util/LinkedHashMap;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(I)V
    .locals 4

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    if-gtz p1, :cond_0

    .line 98
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "maxSize <= 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_0
    iput p1, p0, Lcom/mobvista/sdk/m/a/d/a/l;->c:I

    .line 101
    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x0

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->a:Ljava/util/LinkedHashMap;

    .line 102
    return-void
.end method

.method private a(I)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 215
    :goto_0
    monitor-enter p0

    .line 216
    :try_start_0
    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->b:I

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->b:I

    if-eqz v0, :cond_1

    .line 217
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ".sizeOf() is reporting inconsistent results!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 236
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 221
    :cond_1
    :try_start_1
    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->b:I

    if-gt v0, p1, :cond_2

    .line 222
    monitor-exit p0

    .line 228
    :goto_1
    return-void

    .line 225
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 227
    :goto_2
    if-nez v0, :cond_4

    .line 228
    monitor-exit p0

    goto :goto_1

    :cond_3
    move-object v0, v1

    .line 225
    goto :goto_2

    .line 231
    :cond_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 232
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 233
    iget-object v3, p0, Lcom/mobvista/sdk/m/a/d/a/l;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    iget v3, p0, Lcom/mobvista/sdk/m/a/d/a/l;->b:I

    invoke-direct {p0, v2, v0}, Lcom/mobvista/sdk/m/a/d/a/l;->c(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    sub-int/2addr v3, v4

    iput v3, p0, Lcom/mobvista/sdk/m/a/d/a/l;->b:I

    .line 235
    iget v3, p0, Lcom/mobvista/sdk/m/a/d/a/l;->e:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/mobvista/sdk/m/a/d/a/l;->e:I

    .line 236
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 238
    const/4 v3, 0x1

    invoke-virtual {p0, v3, v2, v0, v1}, Lcom/mobvista/sdk/m/a/d/a/l;->a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private c(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 309
    invoke-virtual {p0, p1, p2}, Lcom/mobvista/sdk/m/a/d/a/l;->a(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    .line 310
    if-gez v0, :cond_0

    .line 311
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Negative size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 314
    :cond_0
    return v0
.end method


# virtual methods
.method protected a(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 326
    const/4 v0, 0x1

    return v0
.end method

.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 130
    if-nez p1, :cond_0

    .line 131
    new-instance v0, Ljava/lang/NullPointerException;

    const-string/jumbo v1, "key == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_0
    monitor-enter p0

    .line 136
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 137
    if-eqz v0, :cond_1

    .line 138
    iget v1, p0, Lcom/mobvista/sdk/m/a/d/a/l;->f:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/mobvista/sdk/m/a/d/a/l;->f:I

    .line 139
    monitor-exit p0

    .line 151
    :goto_0
    return-object v0

    .line 141
    :cond_1
    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->g:I

    .line 142
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    const/4 v0, 0x0

    goto :goto_0

    .line 142
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 333
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/a/d/a/l;->a(I)V

    .line 334
    return-void
.end method

.method protected a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 286
    return-void
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 184
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 185
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string/jumbo v1, "key == null || value == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 189
    :cond_1
    monitor-enter p0

    .line 190
    :try_start_0
    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->d:I

    .line 191
    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->b:I

    invoke-direct {p0, p1, p2}, Lcom/mobvista/sdk/m/a/d/a/l;->c(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->b:I

    .line 192
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 193
    if-eqz v0, :cond_2

    .line 194
    iget v1, p0, Lcom/mobvista/sdk/m/a/d/a/l;->b:I

    invoke-direct {p0, p1, v0}, Lcom/mobvista/sdk/m/a/d/a/l;->c(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/mobvista/sdk/m/a/d/a/l;->b:I

    .line 196
    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    if-eqz v0, :cond_3

    .line 199
    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1, v0, p2}, Lcom/mobvista/sdk/m/a/d/a/l;->a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 202
    :cond_3
    iget v1, p0, Lcom/mobvista/sdk/m/a/d/a/l;->c:I

    invoke-direct {p0, v1}, Lcom/mobvista/sdk/m/a/d/a/l;->a(I)V

    .line 203
    return-object v0

    .line 196
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 401
    monitor-enter p0

    :try_start_0
    iget v1, p0, Lcom/mobvista/sdk/m/a/d/a/l;->f:I

    iget v2, p0, Lcom/mobvista/sdk/m/a/d/a/l;->g:I

    add-int/2addr v1, v2

    .line 402
    if-eqz v1, :cond_0

    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/l;->f:I

    mul-int/lit8 v0, v0, 0x64

    div-int/2addr v0, v1

    .line 403
    :cond_0
    const-string/jumbo v1, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/mobvista/sdk/m/a/d/a/l;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget v4, p0, Lcom/mobvista/sdk/m/a/d/a/l;->f:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget v4, p0, Lcom/mobvista/sdk/m/a/d/a/l;->g:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 401
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
