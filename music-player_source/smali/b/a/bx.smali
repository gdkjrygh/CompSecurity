.class final Lb/a/bx;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/bx;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 3

    check-cast p2, Lb/a/bu;

    check-cast p1, Lb/a/gt;

    iget-object v0, p2, Lb/a/bu;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/bu;->a:Ljava/util/Map;

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

    check-cast v0, Lb/a/bo;

    invoke-virtual {v0, p1}, Lb/a/bo;->b(Lb/a/gn;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p2}, Lb/a/bu;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_1
    invoke-virtual {p2}, Lb/a/bu;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_2
    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(Ljava/util/BitSet;I)V

    invoke-virtual {p2}, Lb/a/bu;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p2, Lb/a/bu;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/bu;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/bi;

    invoke-virtual {v0, p1}, Lb/a/bi;->b(Lb/a/gn;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lb/a/bu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p2, Lb/a/bu;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 8

    const/16 v7, 0xc

    const/4 v6, 0x1

    const/4 v1, 0x0

    check-cast p2, Lb/a/bu;

    check-cast p1, Lb/a/gt;

    new-instance v2, Lb/a/gm;

    const/16 v0, 0xb

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v3

    invoke-direct {v2, v0, v7, v3}, Lb/a/gm;-><init>(BBI)V

    new-instance v0, Ljava/util/HashMap;

    iget v3, v2, Lb/a/gm;->c:I

    mul-int/lit8 v3, v3, 0x2

    invoke-direct {v0, v3}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p2, Lb/a/bu;->a:Ljava/util/Map;

    move v0, v1

    :goto_0
    iget v3, v2, Lb/a/gm;->c:I

    if-ge v0, v3, :cond_0

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lb/a/bo;

    invoke-direct {v4}, Lb/a/bo;-><init>()V

    invoke-virtual {v4, p1}, Lb/a/bo;->a(Lb/a/gn;)V

    iget-object v5, p2, Lb/a/bu;->a:Ljava/util/Map;

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Lb/a/bu;->b()V

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lb/a/gt;->b(I)Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lb/a/gl;

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v3

    invoke-direct {v2, v7, v3}, Lb/a/gl;-><init>(BI)V

    new-instance v3, Ljava/util/ArrayList;

    iget v4, v2, Lb/a/gl;->b:I

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, p2, Lb/a/bu;->b:Ljava/util/List;

    :goto_1
    iget v3, v2, Lb/a/gl;->b:I

    if-ge v1, v3, :cond_1

    new-instance v3, Lb/a/bi;

    invoke-direct {v3}, Lb/a/bi;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/bi;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/bu;->b:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p2, v6}, Lb/a/bu;->a(Z)V

    :cond_2
    invoke-virtual {v0, v6}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/bu;->c:Ljava/lang/String;

    invoke-static {}, Lb/a/bu;->f()V

    :cond_3
    return-void
.end method
