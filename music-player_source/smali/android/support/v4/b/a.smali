.class public Landroid/support/v4/b/a;
.super Landroid/support/v4/b/l;

# interfaces
.implements Ljava/util/Map;


# instance fields
.field a:Landroid/support/v4/b/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/b/l;-><init>()V

    return-void
.end method

.method private b()Landroid/support/v4/b/f;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/a;->a:Landroid/support/v4/b/f;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v4/b/b;

    invoke-direct {v0, p0}, Landroid/support/v4/b/b;-><init>(Landroid/support/v4/b/a;)V

    iput-object v0, p0, Landroid/support/v4/b/a;->a:Landroid/support/v4/b/f;

    :cond_0
    iget-object v0, p0, Landroid/support/v4/b/a;->a:Landroid/support/v4/b/f;

    return-object v0
.end method


# virtual methods
.method public entrySet()Ljava/util/Set;
    .locals 2

    invoke-direct {p0}, Landroid/support/v4/b/a;->b()Landroid/support/v4/b/f;

    move-result-object v0

    iget-object v1, v0, Landroid/support/v4/b/f;->b:Landroid/support/v4/b/h;

    if-nez v1, :cond_0

    new-instance v1, Landroid/support/v4/b/h;

    invoke-direct {v1, v0}, Landroid/support/v4/b/h;-><init>(Landroid/support/v4/b/f;)V

    iput-object v1, v0, Landroid/support/v4/b/f;->b:Landroid/support/v4/b/h;

    :cond_0
    iget-object v0, v0, Landroid/support/v4/b/f;->b:Landroid/support/v4/b/h;

    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 2

    invoke-direct {p0}, Landroid/support/v4/b/a;->b()Landroid/support/v4/b/f;

    move-result-object v0

    iget-object v1, v0, Landroid/support/v4/b/f;->c:Landroid/support/v4/b/i;

    if-nez v1, :cond_0

    new-instance v1, Landroid/support/v4/b/i;

    invoke-direct {v1, v0}, Landroid/support/v4/b/i;-><init>(Landroid/support/v4/b/f;)V

    iput-object v1, v0, Landroid/support/v4/b/f;->c:Landroid/support/v4/b/i;

    :cond_0
    iget-object v0, v0, Landroid/support/v4/b/f;->c:Landroid/support/v4/b/i;

    return-object v0
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 3

    iget v0, p0, Landroid/support/v4/b/a;->h:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/support/v4/b/a;->a(I)V

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

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/support/v4/b/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public values()Ljava/util/Collection;
    .locals 2

    invoke-direct {p0}, Landroid/support/v4/b/a;->b()Landroid/support/v4/b/f;

    move-result-object v0

    iget-object v1, v0, Landroid/support/v4/b/f;->d:Landroid/support/v4/b/k;

    if-nez v1, :cond_0

    new-instance v1, Landroid/support/v4/b/k;

    invoke-direct {v1, v0}, Landroid/support/v4/b/k;-><init>(Landroid/support/v4/b/f;)V

    iput-object v1, v0, Landroid/support/v4/b/f;->d:Landroid/support/v4/b/k;

    :cond_0
    iget-object v0, v0, Landroid/support/v4/b/f;->d:Landroid/support/v4/b/k;

    return-object v0
.end method
