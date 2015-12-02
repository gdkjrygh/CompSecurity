.class Lcom/google/common/a/lj;
.super Ljava/lang/Object;
.source "StandardTable.java"

# interfaces
.implements Lcom/google/common/a/lx;
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        "C:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/common/a/lx",
        "<TR;TC;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TR;",
            "Ljava/util/Map",
            "<TC;TV;>;>;"
        }
    .end annotation
.end field

.field final b:Lcom/google/common/base/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Supplier",
            "<+",
            "Ljava/util/Map",
            "<TC;TV;>;>;"
        }
    .end annotation
.end field

.field private transient c:Lcom/google/common/a/lm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/lj",
            "<TR;TC;TV;>.com/google/common/a/lm;"
        }
    .end annotation
.end field

.field private transient d:Lcom/google/common/a/ls;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/lj",
            "<TR;TC;TV;>.com/google/common/a/ls;"
        }
    .end annotation
.end field

.field private transient e:Lcom/google/common/a/lt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/lj",
            "<TR;TC;TV;>.com/google/common/a/lt;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/google/common/base/Supplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<TR;",
            "Ljava/util/Map",
            "<TC;TV;>;>;",
            "Lcom/google/common/base/Supplier",
            "<+",
            "Ljava/util/Map",
            "<TC;TV;>;>;)V"
        }
    .end annotation

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    .line 71
    iput-object p2, p0, Lcom/google/common/a/lj;->b:Lcom/google/common/base/Supplier;

    .line 72
    return-void
.end method

.method static a(Ljava/util/Map;)Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map",
            "<TK;TV;>;)",
            "Ljava/util/Iterator",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 1166
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 1167
    new-instance v1, Lcom/google/common/a/lk;

    invoke-direct {v1, v0}, Lcom/google/common/a/lk;-><init>(Ljava/util/Iterator;)V

    return-object v1
.end method

.method static synthetic a(Lcom/google/common/a/lj;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0, p1, p2, p3}, Lcom/google/common/a/lj;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/google/common/a/lj;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0, p1, p2, p3}, Lcom/google/common/a/lj;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 219
    if-eqz p3, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/lj;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Ljava/lang/Object;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)",
            "Ljava/util/Map",
            "<TC;TV;>;"
        }
    .end annotation

    .prologue
    .line 162
    iget-object v0, p0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 163
    if-nez v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/google/common/a/lj;->b:Lcom/google/common/base/Supplier;

    invoke-interface {v0}, Lcom/google/common/base/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 165
    iget-object v1, p0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    :cond_0
    return-object v0
.end method

.method private c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 224
    invoke-direct {p0, p1, p2, p3}, Lcom/google/common/a/lj;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/lj;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    const/4 v0, 0x1

    .line 228
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 114
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    move-object v0, v1

    .line 118
    :goto_0
    return-object v0

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/google/common/a/ik;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 118
    if-nez v0, :cond_2

    move-object v0, v1

    goto :goto_0

    :cond_2
    invoke-static {v0, p2}, Lcom/google/common/a/ik;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;TC;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 171
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    invoke-direct {p0, p1}, Lcom/google/common/a/lj;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 98
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/google/common/a/ik;->b(Ljava/util/Map;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 186
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    move-object v0, v1

    .line 197
    :goto_0
    return-object v0

    .line 189
    :cond_1
    iget-object v0, p0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/google/common/a/ik;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 190
    if-nez v0, :cond_2

    move-object v0, v1

    .line 191
    goto :goto_0

    .line 193
    :cond_2
    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 194
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 195
    iget-object v0, p0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    move-object v0, v1

    .line 197
    goto :goto_0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TR;",
            "Ljava/util/Map",
            "<TC;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 935
    iget-object v0, p0, Lcom/google/common/a/lj;->e:Lcom/google/common/a/lt;

    .line 936
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/a/lt;

    invoke-direct {v0, p0}, Lcom/google/common/a/lt;-><init>(Lcom/google/common/a/lj;)V

    iput-object v0, p0, Lcom/google/common/a/lj;->e:Lcom/google/common/a/lt;

    :cond_0
    return-object v0
.end method

.method public b(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)",
            "Ljava/util/Map",
            "<TC;TV;>;"
        }
    .end annotation

    .prologue
    .line 336
    new-instance v0, Lcom/google/common/a/ln;

    invoke-direct {v0, p0, p1}, Lcom/google/common/a/ln;-><init>(Lcom/google/common/a/lj;Ljava/lang/Object;)V

    return-object v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TR;>;"
        }
    .end annotation

    .prologue
    .line 753
    iget-object v0, p0, Lcom/google/common/a/lj;->d:Lcom/google/common/a/ls;

    .line 754
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/a/ls;

    invoke-direct {v0, p0}, Lcom/google/common/a/ls;-><init>(Lcom/google/common/a/lj;)V

    iput-object v0, p0, Lcom/google/common/a/lj;->d:Lcom/google/common/a/ls;

    :cond_0
    return-object v0
.end method

.method public d()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/common/a/ly",
            "<TR;TC;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 274
    iget-object v0, p0, Lcom/google/common/a/lj;->c:Lcom/google/common/a/lm;

    .line 275
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/a/lm;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/lm;-><init>(Lcom/google/common/a/lj;Lcom/google/common/a/lk;)V

    iput-object v0, p0, Lcom/google/common/a/lj;->c:Lcom/google/common/a/lm;

    :cond_0
    return-object v0
.end method

.method public e()I
    .locals 3

    .prologue
    .line 126
    const/4 v0, 0x0

    .line 127
    iget-object v1, p0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 128
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    .line 130
    :cond_0
    return v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 134
    if-ne p1, p0, :cond_0

    .line 135
    const/4 v0, 0x1

    .line 141
    :goto_0
    return v0

    .line 137
    :cond_0
    instance-of v0, p1, Lcom/google/common/a/lx;

    if-eqz v0, :cond_1

    .line 138
    check-cast p1, Lcom/google/common/a/lx;

    .line 139
    invoke-virtual {p0}, Lcom/google/common/a/lj;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/common/a/lx;->d()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 141
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 145
    invoke-virtual {p0}, Lcom/google/common/a/lj;->d()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 152
    invoke-virtual {p0}, Lcom/google/common/a/lj;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
