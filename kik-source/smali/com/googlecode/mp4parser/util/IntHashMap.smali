.class public Lcom/googlecode/mp4parser/util/IntHashMap;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/util/IntHashMap$Entry;
    }
.end annotation


# instance fields
.field private transient count:I

.field private loadFactor:F

.field private transient table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

.field private threshold:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 94
    const/16 v0, 0x14

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-direct {p0, v0, v1}, Lcom/googlecode/mp4parser/util/IntHashMap;-><init>(IF)V

    .line 95
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 106
    const/high16 v0, 0x3f400000    # 0.75f

    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/util/IntHashMap;-><init>(IF)V

    .line 107
    return-void
.end method

.method public constructor <init>(IF)V
    .locals 3

    .prologue
    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    if-gez p1, :cond_0

    .line 121
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Illegal Capacity: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 123
    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_1

    .line 124
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Illegal Load: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_1
    if-nez p1, :cond_2

    .line 127
    const/4 p1, 0x1

    .line 130
    :cond_2
    iput p2, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->loadFactor:F

    .line 131
    new-array v0, p1, [Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    iput-object v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 132
    int-to-float v0, p1

    mul-float/2addr v0, p2

    float-to-int v0, v0

    iput v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->threshold:I

    .line 133
    return-void
.end method


# virtual methods
.method public declared-synchronized clear()V
    .locals 3

    .prologue
    .line 350
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 351
    array-length v0, v1

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_0

    .line 354
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 355
    monitor-exit p0

    return-void

    .line 352
    :cond_0
    const/4 v2, 0x0

    :try_start_1
    aput-object v2, v1, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 350
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    .line 172
    if-nez p1, :cond_0

    .line 173
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 176
    :cond_0
    iget-object v2, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 177
    array-length v0, v2

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-gtz v0, :cond_1

    .line 184
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 178
    :cond_1
    aget-object v0, v2, v1

    :goto_2
    if-nez v0, :cond_2

    move v0, v1

    goto :goto_0

    .line 179
    :cond_2
    iget-object v3, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->value:Ljava/lang/Object;

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 180
    const/4 v0, 0x1

    goto :goto_1

    .line 178
    :cond_3
    iget-object v0, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->next:Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    goto :goto_2
.end method

.method public containsKey(I)Z
    .locals 3

    .prologue
    .line 212
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 213
    const v1, 0x7fffffff

    and-int/2addr v1, p1

    array-length v2, v0

    rem-int/2addr v1, v2

    .line 215
    aget-object v0, v0, v1

    :goto_0
    if-nez v0, :cond_0

    .line 220
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 216
    :cond_0
    iget v1, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->hash:I

    if-ne v1, p1, :cond_1

    .line 217
    const/4 v0, 0x1

    goto :goto_1

    .line 215
    :cond_1
    iget-object v0, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->next:Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    goto :goto_0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 199
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/util/IntHashMap;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 233
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 234
    const v1, 0x7fffffff

    and-int/2addr v1, p1

    array-length v2, v0

    rem-int/2addr v1, v2

    .line 236
    aget-object v0, v0, v1

    :goto_0
    if-nez v0, :cond_0

    .line 241
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 237
    :cond_0
    iget v1, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->hash:I

    if-ne v1, p1, :cond_1

    .line 238
    iget-object v0, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->value:Ljava/lang/Object;

    goto :goto_1

    .line 236
    :cond_1
    iget-object v0, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->next:Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 151
    iget v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->count:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public put(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    const v4, 0x7fffffff

    .line 290
    iget-object v1, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 291
    and-int v0, p1, v4

    array-length v2, v1

    rem-int/2addr v0, v2

    .line 293
    aget-object v2, v1, v0

    :goto_0
    if-nez v2, :cond_1

    .line 301
    iget v2, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->count:I

    iget v3, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->threshold:I

    if-lt v2, v3, :cond_0

    .line 303
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/util/IntHashMap;->rehash()V

    .line 305
    iget-object v1, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 306
    and-int v0, p1, v4

    array-length v2, v1

    rem-int/2addr v0, v2

    .line 310
    :cond_0
    new-instance v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    aget-object v3, v1, v0

    invoke-direct {v2, p1, p1, p2, v3}, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;-><init>(IILjava/lang/Object;Lcom/googlecode/mp4parser/util/IntHashMap$Entry;)V

    .line 311
    aput-object v2, v1, v0

    .line 312
    iget v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->count:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->count:I

    .line 313
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 294
    :cond_1
    iget v3, v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->hash:I

    if-ne v3, p1, :cond_2

    .line 295
    iget-object v0, v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->value:Ljava/lang/Object;

    .line 296
    iput-object p2, v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->value:Ljava/lang/Object;

    goto :goto_1

    .line 293
    :cond_2
    iget-object v2, v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->next:Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    goto :goto_0
.end method

.method protected rehash()V
    .locals 8

    .prologue
    .line 253
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    array-length v0, v0

    .line 254
    iget-object v3, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 256
    mul-int/lit8 v1, v0, 0x2

    add-int/lit8 v4, v1, 0x1

    .line 257
    new-array v5, v4, [Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 259
    int-to-float v1, v4

    iget v2, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->loadFactor:F

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->threshold:I

    .line 260
    iput-object v5, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 262
    :goto_0
    add-int/lit8 v2, v0, -0x1

    if-gtz v0, :cond_0

    .line 272
    return-void

    .line 263
    :cond_0
    aget-object v0, v3, v2

    :goto_1
    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    .line 265
    :cond_1
    iget-object v1, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->next:Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 267
    iget v6, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->hash:I

    const v7, 0x7fffffff

    and-int/2addr v6, v7

    rem-int/2addr v6, v4

    .line 268
    aget-object v7, v5, v6

    iput-object v7, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->next:Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 269
    aput-object v0, v5, v6

    move-object v0, v1

    goto :goto_1
.end method

.method public remove(I)Ljava/lang/Object;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 327
    iget-object v3, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->table:[Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 328
    const v0, 0x7fffffff

    and-int/2addr v0, p1

    array-length v2, v3

    rem-int v4, v0, v2

    .line 330
    aget-object v2, v3, v4

    move-object v0, v1

    :goto_0
    if-nez v2, :cond_0

    move-object v0, v1

    .line 343
    :goto_1
    return-object v0

    .line 331
    :cond_0
    iget v5, v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->hash:I

    if-ne v5, p1, :cond_2

    .line 332
    if-eqz v0, :cond_1

    .line 333
    iget-object v3, v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->next:Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    iput-object v3, v0, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->next:Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    .line 337
    :goto_2
    iget v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->count:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->count:I

    .line 338
    iget-object v0, v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->value:Ljava/lang/Object;

    .line 339
    iput-object v1, v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->value:Ljava/lang/Object;

    goto :goto_1

    .line 335
    :cond_1
    iget-object v0, v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->next:Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    aput-object v0, v3, v4

    goto :goto_2

    .line 330
    :cond_2
    iget-object v0, v2, Lcom/googlecode/mp4parser/util/IntHashMap$Entry;->next:Lcom/googlecode/mp4parser/util/IntHashMap$Entry;

    move-object v6, v2

    move-object v2, v0

    move-object v0, v6

    goto :goto_0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 141
    iget v0, p0, Lcom/googlecode/mp4parser/util/IntHashMap;->count:I

    return v0
.end method
