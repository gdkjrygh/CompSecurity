.class abstract Lcom/google/common/a/q;
.super Lcom/google/common/a/aq;
.source "AbstractMapBasedMultiset.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/aq",
        "<TE;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private transient a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TE;",
            "Lcom/google/common/a/bi;",
            ">;"
        }
    .end annotation
.end field

.field private transient b:J


# direct methods
.method protected constructor <init>(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<TE;",
            "Lcom/google/common/a/bi;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/google/common/a/aq;-><init>()V

    .line 63
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    .line 64
    invoke-super {p0}, Lcom/google/common/a/aq;->size()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/google/common/a/q;->b:J

    .line 65
    return-void
.end method

.method static synthetic a(Lcom/google/common/a/q;Ljava/lang/Object;Ljava/util/Map;)I
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/q;->a(Ljava/lang/Object;Ljava/util/Map;)I

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/Object;Ljava/util/Map;)I
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/Map",
            "<TE;",
            "Lcom/google/common/a/bi;",
            ">;)I"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 307
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bi;

    .line 308
    if-nez v0, :cond_0

    move v0, v1

    .line 313
    :goto_0
    return v0

    .line 311
    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/common/a/bi;->d(I)I

    move-result v0

    .line 312
    iget-wide v1, p0, Lcom/google/common/a/q;->b:J

    int-to-long v3, v0

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lcom/google/common/a/q;->b:J

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/common/a/q;J)J
    .locals 2

    .prologue
    .line 49
    iget-wide v0, p0, Lcom/google/common/a/q;->b:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Lcom/google/common/a/q;->b:J

    return-wide v0
.end method

.method static synthetic a(Lcom/google/common/a/q;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic b(Lcom/google/common/a/q;)J
    .locals 4

    .prologue
    .line 49
    iget-wide v0, p0, Lcom/google/common/a/q;->b:J

    const-wide/16 v2, 0x1

    sub-long v2, v0, v2

    iput-wide v2, p0, Lcom/google/common/a/q;->b:J

    return-wide v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x0

    .line 209
    :try_start_0
    iget-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bi;

    .line 210
    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    move v1, v0

    .line 214
    :goto_1
    return v1

    .line 210
    :cond_0
    invoke-virtual {v0}, Lcom/google/common/a/bi;->a()I
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 213
    :catch_0
    move-exception v0

    goto :goto_1

    .line 211
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public a(Ljava/lang/Object;I)I
    .locals 9
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)I"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 228
    if-nez p2, :cond_0

    .line 229
    invoke-virtual {p0, p1}, Lcom/google/common/a/q;->a(Ljava/lang/Object;)I

    move-result v2

    .line 246
    :goto_0
    return v2

    .line 231
    :cond_0
    if-lez p2, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "occurrences cannot be negative: %s"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 233
    iget-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bi;

    .line 235
    if-nez v0, :cond_2

    .line 237
    iget-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    new-instance v1, Lcom/google/common/a/bi;

    invoke-direct {v1, p2}, Lcom/google/common/a/bi;-><init>(I)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    :goto_2
    iget-wide v0, p0, Lcom/google/common/a/q;->b:J

    int-to-long v3, p2

    add-long/2addr v0, v3

    iput-wide v0, p0, Lcom/google/common/a/q;->b:J

    goto :goto_0

    :cond_1
    move v0, v2

    .line 231
    goto :goto_1

    .line 239
    :cond_2
    invoke-virtual {v0}, Lcom/google/common/a/bi;->a()I

    move-result v4

    .line 240
    int-to-long v5, v4

    int-to-long v7, p2

    add-long/2addr v5, v7

    .line 241
    const-wide/32 v7, 0x7fffffff

    cmp-long v3, v5, v7

    if-gtz v3, :cond_3

    move v3, v1

    :goto_3
    const-string v7, "too many occurrences: %s"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v1, v2

    invoke-static {v3, v7, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 243
    invoke-virtual {v0, p2}, Lcom/google/common/a/bi;->a(I)I

    move v2, v4

    goto :goto_2

    :cond_3
    move v3, v2

    .line 241
    goto :goto_3
.end method

.method a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TE;",
            "Lcom/google/common/a/bi;",
            ">;"
        }
    .end annotation

    .prologue
    .line 68
    iget-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    return-object v0
.end method

.method public b(Ljava/lang/Object;I)I
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 250
    if-nez p2, :cond_1

    .line 251
    invoke-virtual {p0, p1}, Lcom/google/common/a/q;->a(Ljava/lang/Object;)I

    move-result v2

    .line 272
    :cond_0
    :goto_0
    return v2

    .line 253
    :cond_1
    if-lez p2, :cond_2

    move v0, v1

    :goto_1
    const-string v3, "occurrences cannot be negative: %s"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 255
    iget-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bi;

    .line 256
    if-eqz v0, :cond_0

    .line 260
    invoke-virtual {v0}, Lcom/google/common/a/bi;->a()I

    move-result v1

    .line 263
    if-le v1, p2, :cond_3

    .line 270
    :goto_2
    neg-int v2, p2

    invoke-virtual {v0, v2}, Lcom/google/common/a/bi;->b(I)I

    .line 271
    iget-wide v2, p0, Lcom/google/common/a/q;->b:J

    int-to-long v4, p2

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/common/a/q;->b:J

    move v2, v1

    .line 272
    goto :goto_0

    :cond_2
    move v0, v2

    .line 253
    goto :goto_1

    .line 267
    :cond_3
    iget-object v2, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move p2, v1

    goto :goto_2
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation

    .prologue
    .line 87
    invoke-super {p0}, Lcom/google/common/a/aq;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method c()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation

    .prologue
    .line 92
    iget-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 94
    new-instance v1, Lcom/google/common/a/r;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/r;-><init>(Lcom/google/common/a/q;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public clear()V
    .locals 3

    .prologue
    .line 138
    iget-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bi;

    .line 139
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/common/a/bi;->c(I)V

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 142
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/common/a/q;->b:J

    .line 143
    return-void
.end method

.method d()I
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method e()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 319
    new-instance v0, Lcom/google/common/a/t;

    iget-object v1, p0, Lcom/google/common/a/q;->a:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/t;-><init>(Lcom/google/common/a/q;Ljava/util/Map;)V

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 157
    new-instance v0, Lcom/google/common/a/v;

    invoke-direct {v0, p0}, Lcom/google/common/a/v;-><init>(Lcom/google/common/a/q;)V

    return-object v0
.end method

.method public size()I
    .locals 2

    .prologue
    .line 153
    iget-wide v0, p0, Lcom/google/common/a/q;->b:J

    invoke-static {v0, v1}, Lcom/google/common/c/a;->b(J)I

    move-result v0

    return v0
.end method
