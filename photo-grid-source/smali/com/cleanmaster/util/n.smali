.class public Lcom/cleanmaster/util/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/LinkedHashMap;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I


# direct methods
.method public constructor <init>(I)V
    .locals 4

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    if-gtz p1, :cond_0

    .line 51
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxSize <= 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_0
    iput p1, p0, Lcom/cleanmaster/util/n;->c:I

    .line 54
    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x0

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Lcom/cleanmaster/util/n;->a:Ljava/util/LinkedHashMap;

    .line 55
    return-void
.end method

.method private a(I)V
    .locals 4

    .prologue
    .line 149
    :goto_0
    monitor-enter p0

    .line 150
    :try_start_0
    iget v0, p0, Lcom/cleanmaster/util/n;->b:I

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/util/n;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/cleanmaster/util/n;->b:I

    if-eqz v0, :cond_1

    .line 153
    :cond_0
    monitor-exit p0

    .line 157
    :goto_1
    return-void

    .line 156
    :cond_1
    iget v0, p0, Lcom/cleanmaster/util/n;->b:I

    if-le v0, p1, :cond_2

    iget-object v0, p0, Lcom/cleanmaster/util/n;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 157
    :cond_2
    monitor-exit p0

    goto :goto_1

    .line 167
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 160
    :cond_3
    :try_start_1
    iget-object v0, p0, Lcom/cleanmaster/util/n;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 161
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 162
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 163
    iget-object v2, p0, Lcom/cleanmaster/util/n;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    iget v2, p0, Lcom/cleanmaster/util/n;->b:I

    invoke-direct {p0, v1, v0}, Lcom/cleanmaster/util/n;->c(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, p0, Lcom/cleanmaster/util/n;->b:I

    .line 165
    iget v2, p0, Lcom/cleanmaster/util/n;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/cleanmaster/util/n;->f:I

    .line 167
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v1, v0, v3}, Lcom/cleanmaster/util/n;->a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private c(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 236
    invoke-virtual {p0, p1, p2}, Lcom/cleanmaster/util/n;->a(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    .line 237
    if-gez v0, :cond_0

    .line 238
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Negative size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 240
    :cond_0
    return v0
.end method


# virtual methods
.method protected a(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 251
    const/4 v0, 0x1

    return v0
.end method

.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 64
    if-nez p1, :cond_0

    .line 65
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "key == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_0
    monitor-enter p0

    .line 70
    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/util/n;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 71
    if-eqz v0, :cond_1

    .line 72
    iget v1, p0, Lcom/cleanmaster/util/n;->g:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/cleanmaster/util/n;->g:I

    .line 73
    monitor-exit p0

    .line 107
    :goto_0
    return-object v0

    .line 75
    :cond_1
    iget v0, p0, Lcom/cleanmaster/util/n;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/cleanmaster/util/n;->h:I

    .line 76
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    invoke-virtual {p0, p1}, Lcom/cleanmaster/util/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 86
    if-nez v1, :cond_2

    .line 87
    const/4 v0, 0x0

    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 90
    :cond_2
    monitor-enter p0

    .line 91
    :try_start_2
    iget v0, p0, Lcom/cleanmaster/util/n;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/cleanmaster/util/n;->e:I

    .line 92
    iget-object v0, p0, Lcom/cleanmaster/util/n;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 94
    if-eqz v0, :cond_3

    .line 96
    iget-object v2, p0, Lcom/cleanmaster/util/n;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 102
    if-eqz v0, :cond_4

    .line 103
    const/4 v2, 0x0

    invoke-virtual {p0, v2, p1, v1, v0}, Lcom/cleanmaster/util/n;->a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 98
    :cond_3
    :try_start_3
    iget v2, p0, Lcom/cleanmaster/util/n;->b:I

    invoke-direct {p0, p1, v1}, Lcom/cleanmaster/util/n;->c(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v2, v3

    iput v2, p0, Lcom/cleanmaster/util/n;->b:I

    goto :goto_1

    .line 100
    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 106
    :cond_4
    iget v0, p0, Lcom/cleanmaster/util/n;->c:I

    invoke-direct {p0, v0}, Lcom/cleanmaster/util/n;->a(I)V

    move-object v0, v1

    .line 107
    goto :goto_0
.end method

.method protected a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 214
    return-void
.end method

.method protected b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 232
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 118
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 119
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "key == null || value == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 123
    :cond_1
    monitor-enter p0

    .line 124
    :try_start_0
    iget v0, p0, Lcom/cleanmaster/util/n;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/cleanmaster/util/n;->d:I

    .line 125
    iget v0, p0, Lcom/cleanmaster/util/n;->b:I

    invoke-direct {p0, p1, p2}, Lcom/cleanmaster/util/n;->c(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/cleanmaster/util/n;->b:I

    .line 126
    iget-object v0, p0, Lcom/cleanmaster/util/n;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 127
    if-eqz v0, :cond_2

    .line 128
    iget v1, p0, Lcom/cleanmaster/util/n;->b:I

    invoke-direct {p0, p1, v0}, Lcom/cleanmaster/util/n;->c(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/cleanmaster/util/n;->b:I

    .line 131
    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    if-eqz v0, :cond_3

    .line 134
    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1, v0, p2}, Lcom/cleanmaster/util/n;->a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    :cond_3
    iget v1, p0, Lcom/cleanmaster/util/n;->c:I

    invoke-direct {p0, v1}, Lcom/cleanmaster/util/n;->a(I)V

    .line 138
    return-object v0

    .line 131
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 324
    monitor-enter p0

    :try_start_0
    iget v1, p0, Lcom/cleanmaster/util/n;->g:I

    iget v2, p0, Lcom/cleanmaster/util/n;->h:I

    add-int/2addr v1, v2

    .line 325
    if-eqz v1, :cond_0

    iget v0, p0, Lcom/cleanmaster/util/n;->g:I

    mul-int/lit8 v0, v0, 0x64

    div-int/2addr v0, v1

    .line 326
    :cond_0
    const-string v1, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/cleanmaster/util/n;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget v4, p0, Lcom/cleanmaster/util/n;->g:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget v4, p0, Lcom/cleanmaster/util/n;->h:I

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

    .line 324
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
