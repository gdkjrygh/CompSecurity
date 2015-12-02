.class abstract Lcom/google/common/a/a;
.super Lcom/google/common/a/dw;
.source "AbstractBiMap.java"

# interfaces
.implements Lcom/google/common/a/av;
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/dw",
        "<TK;TV;>;",
        "Lcom/google/common/a/av",
        "<TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private transient a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field private transient b:Lcom/google/common/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/a",
            "<TV;TK;>;"
        }
    .end annotation
.end field

.field private transient c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation
.end field

.field private transient d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TV;>;"
        }
    .end annotation
.end field

.field private transient e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/Map;Lcom/google/common/a/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<TK;TV;>;",
            "Lcom/google/common/a/a",
            "<TV;TK;>;)V"
        }
    .end annotation

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/google/common/a/dw;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    .line 62
    iput-object p2, p0, Lcom/google/common/a/a;->b:Lcom/google/common/a/a;

    .line 63
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Map;Lcom/google/common/a/a;Lcom/google/common/a/b;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/a;-><init>(Ljava/util/Map;Lcom/google/common/a/a;)V

    return-void
.end method

.method constructor <init>(Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<TK;TV;>;",
            "Ljava/util/Map",
            "<TV;TK;>;)V"
        }
    .end annotation

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/google/common/a/dw;-><init>()V

    .line 56
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/a;->a(Ljava/util/Map;Ljava/util/Map;)V

    .line 57
    return-void
.end method

.method static synthetic a(Lcom/google/common/a/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/google/common/a/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 132
    iget-object v0, p0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 133
    invoke-direct {p0, v0}, Lcom/google/common/a/a;->b(Ljava/lang/Object;)V

    .line 134
    return-object v0
.end method

.method private a(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 5
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
            "(TK;TV;Z)TV;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 105
    invoke-virtual {p0, p1}, Lcom/google/common/a/a;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    .line 106
    if-eqz v3, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/common/a/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    :goto_0
    return-object p2

    .line 109
    :cond_0
    if-eqz p3, :cond_1

    .line 110
    invoke-virtual {p0}, Lcom/google/common/a/a;->b()Lcom/google/common/a/av;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/common/a/av;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    :goto_1
    iget-object v0, p0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 115
    invoke-direct {p0, p1, v3, v0, p2}, Lcom/google/common/a/a;->a(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V

    move-object p2, v0

    .line 116
    goto :goto_0

    .line 112
    :cond_1
    invoke-virtual {p0, p2}, Lcom/google/common/a/a;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_2
    const-string v4, "value already present: %s"

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v2

    invoke-static {v0, v4, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2
.end method

.method static synthetic a(Lcom/google/common/a/a;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic a(Lcom/google/common/a/a;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/common/a/a;->a(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private a(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;ZTV;TV;)V"
        }
    .end annotation

    .prologue
    .line 121
    if-eqz p2, :cond_0

    .line 122
    invoke-direct {p0, p3}, Lcom/google/common/a/a;->b(Ljava/lang/Object;)V

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/a;->b:Lcom/google/common/a/a;

    iget-object v0, v0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    invoke-interface {v0, p4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    return-void
.end method

.method static synthetic b(Lcom/google/common/a/a;)Lcom/google/common/a/a;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/google/common/a/a;->b:Lcom/google/common/a/a;

    return-object v0
.end method

.method static synthetic b(Lcom/google/common/a/a;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/google/common/a/a;->b(Ljava/lang/Object;)V

    return-void
.end method

.method private b(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .prologue
    .line 138
    iget-object v0, p0, Lcom/google/common/a/a;->b:Lcom/google/common/a/a;

    iget-object v0, v0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    return-void
.end method


# virtual methods
.method protected a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 66
    iget-object v0, p0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    return-object v0
.end method

.method a(Ljava/util/Map;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<TK;TV;>;",
            "Ljava/util/Map",
            "<TV;TK;>;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 74
    iget-object v0, p0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 75
    iget-object v0, p0, Lcom/google/common/a/a;->b:Lcom/google/common/a/a;

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 76
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 77
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 78
    if-eq p1, p2, :cond_2

    :goto_2
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 79
    iput-object p1, p0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    .line 80
    new-instance v0, Lcom/google/common/a/f;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p0, v1}, Lcom/google/common/a/f;-><init>(Ljava/util/Map;Lcom/google/common/a/a;Lcom/google/common/a/b;)V

    iput-object v0, p0, Lcom/google/common/a/a;->b:Lcom/google/common/a/a;

    .line 81
    return-void

    :cond_0
    move v0, v2

    .line 74
    goto :goto_0

    :cond_1
    move v0, v2

    .line 75
    goto :goto_1

    :cond_2
    move v1, v2

    .line 78
    goto :goto_2
.end method

.method public b()Lcom/google/common/a/av;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/av",
            "<TV;TK;>;"
        }
    .end annotation

    .prologue
    .line 158
    iget-object v0, p0, Lcom/google/common/a/a;->b:Lcom/google/common/a/a;

    return-object v0
.end method

.method protected synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0}, Lcom/google/common/a/a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 151
    iget-object v0, p0, Lcom/google/common/a/a;->b:Lcom/google/common/a/a;

    iget-object v0, v0, Lcom/google/common/a/a;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 152
    return-void
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/google/common/a/a;->b:Lcom/google/common/a/a;

    invoke-virtual {v0, p1}, Lcom/google/common/a/a;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public d()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 225
    iget-object v0, p0, Lcom/google/common/a/a;->d:Ljava/util/Set;

    .line 226
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/a/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/i;-><init>(Lcom/google/common/a/a;Lcom/google/common/a/b;)V

    iput-object v0, p0, Lcom/google/common/a/a;->d:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 272
    iget-object v0, p0, Lcom/google/common/a/a;->e:Ljava/util/Set;

    .line 273
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/a/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/c;-><init>(Lcom/google/common/a/a;Lcom/google/common/a/b;)V

    iput-object v0, p0, Lcom/google/common/a/a;->e:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 164
    iget-object v0, p0, Lcom/google/common/a/a;->c:Ljava/util/Set;

    .line 165
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/a/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/g;-><init>(Lcom/google/common/a/a;Lcom/google/common/a/b;)V

    iput-object v0, p0, Lcom/google/common/a/a;->c:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 96
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/common/a/a;->a(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)V"
        }
    .end annotation

    .prologue
    .line 144
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 145
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/google/common/a/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 147
    :cond_0
    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 128
    invoke-virtual {p0, p1}, Lcom/google/common/a/a;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/google/common/a/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic values()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0}, Lcom/google/common/a/a;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
