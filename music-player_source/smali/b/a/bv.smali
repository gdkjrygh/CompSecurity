.class final Lb/a/bv;
.super Lb/a/gw;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gw;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/bv;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 4

    const/16 v3, 0xc

    check-cast p2, Lb/a/bu;

    invoke-virtual {p2}, Lb/a/bu;->g()V

    invoke-static {}, Lb/a/bu;->h()Lb/a/gs;

    invoke-virtual {p1}, Lb/a/gn;->a()V

    iget-object v0, p2, Lb/a/bu;->a:Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-static {}, Lb/a/bu;->i()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    new-instance v0, Lb/a/gm;

    const/16 v1, 0xb

    iget-object v2, p2, Lb/a/bu;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v1, v3, v2}, Lb/a/gm;-><init>(BBI)V

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gm;)V

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

    invoke-virtual {p1, v1}, Lb/a/gn;->a(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/bo;

    invoke-virtual {v0, p1}, Lb/a/bo;->b(Lb/a/gn;)V

    goto :goto_0

    :cond_0
    iget-object v0, p2, Lb/a/bu;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lb/a/bu;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lb/a/bu;->j()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    new-instance v0, Lb/a/gl;

    iget-object v1, p2, Lb/a/bu;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v3, v1}, Lb/a/gl;-><init>(BI)V

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gl;)V

    iget-object v0, p2, Lb/a/bu;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/bi;

    invoke-virtual {v0, p1}, Lb/a/bi;->b(Lb/a/gn;)V

    goto :goto_1

    :cond_1
    iget-object v0, p2, Lb/a/bu;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lb/a/bu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lb/a/bu;->k()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/bu;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lb/a/gn;->c()V

    invoke-virtual {p1}, Lb/a/gn;->b()V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 6

    const/4 v1, 0x0

    check-cast p2, Lb/a/bu;

    invoke-virtual {p1}, Lb/a/gn;->d()Lb/a/gs;

    :goto_0
    invoke-virtual {p1}, Lb/a/gn;->f()Lb/a/gk;

    move-result-object v0

    iget-byte v2, v0, Lb/a/gk;->b:B

    if-eqz v2, :cond_5

    iget-short v2, v0, Lb/a/gk;->c:S

    packed-switch v2, :pswitch_data_0

    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_0
    iget-byte v2, v0, Lb/a/gk;->b:B

    const/16 v3, 0xd

    if-ne v2, v3, :cond_1

    invoke-virtual {p1}, Lb/a/gn;->g()Lb/a/gm;

    move-result-object v2

    new-instance v0, Ljava/util/HashMap;

    iget v3, v2, Lb/a/gm;->c:I

    mul-int/lit8 v3, v3, 0x2

    invoke-direct {v0, v3}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p2, Lb/a/bu;->a:Ljava/util/Map;

    move v0, v1

    :goto_1
    iget v3, v2, Lb/a/gm;->c:I

    if-ge v0, v3, :cond_0

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lb/a/bo;

    invoke-direct {v4}, Lb/a/bo;-><init>()V

    invoke-virtual {v4, p1}, Lb/a/bo;->a(Lb/a/gn;)V

    iget-object v5, p2, Lb/a/bu;->a:Ljava/util/Map;

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    invoke-static {}, Lb/a/bu;->b()V

    goto :goto_0

    :cond_1
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_1
    iget-byte v2, v0, Lb/a/gk;->b:B

    const/16 v3, 0xf

    if-ne v2, v3, :cond_3

    invoke-virtual {p1}, Lb/a/gn;->h()Lb/a/gl;

    move-result-object v2

    new-instance v0, Ljava/util/ArrayList;

    iget v3, v2, Lb/a/gl;->b:I

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Lb/a/bu;->b:Ljava/util/List;

    move v0, v1

    :goto_2
    iget v3, v2, Lb/a/gl;->b:I

    if-ge v0, v3, :cond_2

    new-instance v3, Lb/a/bi;

    invoke-direct {v3}, Lb/a/bi;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/bi;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/bu;->b:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lb/a/bu;->a(Z)V

    goto :goto_0

    :cond_3
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_2
    iget-byte v2, v0, Lb/a/gk;->b:B

    const/16 v3, 0xb

    if-ne v2, v3, :cond_4

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/bu;->c:Ljava/lang/String;

    invoke-static {}, Lb/a/bu;->f()V

    goto/16 :goto_0

    :cond_4
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :cond_5
    invoke-virtual {p1}, Lb/a/gn;->e()V

    invoke-virtual {p2}, Lb/a/bu;->g()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
