.class final Lb/a/ce;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/ce;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 3

    check-cast p2, Lb/a/cb;

    check-cast p1, Lb/a/gt;

    iget-object v0, p2, Lb/a/cb;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/cb;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

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

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lb/a/gt;->a(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/ch;

    invoke-virtual {v0, p1}, Lb/a/ch;->b(Lb/a/gn;)V

    goto :goto_0

    :cond_0
    iget v0, p2, Lb/a/cb;->b:I

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/cb;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 5

    check-cast p2, Lb/a/cb;

    check-cast p1, Lb/a/gt;

    new-instance v1, Lb/a/gm;

    const/16 v0, 0xb

    const/16 v2, 0xc

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Lb/a/gm;-><init>(BBI)V

    new-instance v0, Ljava/util/HashMap;

    iget v2, v1, Lb/a/gm;->c:I

    mul-int/lit8 v2, v2, 0x2

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p2, Lb/a/cb;->a:Ljava/util/Map;

    const/4 v0, 0x0

    :goto_0
    iget v2, v1, Lb/a/gm;->c:I

    if-ge v0, v2, :cond_0

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lb/a/ch;

    invoke-direct {v3}, Lb/a/ch;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/ch;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/cb;->a:Ljava/util/Map;

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Lb/a/cb;->c()V

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    iput v0, p2, Lb/a/cb;->b:I

    invoke-virtual {p2}, Lb/a/cb;->f()V

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/cb;->c:Ljava/lang/String;

    invoke-static {}, Lb/a/cb;->h()V

    return-void
.end method
