.class final Lb/a/co;
.super Lb/a/gw;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gw;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/co;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 3

    const/16 v2, 0xc

    check-cast p2, Lb/a/cn;

    invoke-virtual {p2}, Lb/a/cn;->i()V

    invoke-static {}, Lb/a/cn;->j()Lb/a/gs;

    invoke-virtual {p1}, Lb/a/gn;->a()V

    iget-object v0, p2, Lb/a/cn;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {}, Lb/a/cn;->k()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/cn;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p2, Lb/a/cn;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lb/a/cn;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lb/a/cn;->l()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    new-instance v0, Lb/a/gl;

    iget-object v1, p2, Lb/a/cn;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lb/a/gl;-><init>(BI)V

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gl;)V

    iget-object v0, p2, Lb/a/cn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/av;

    invoke-virtual {v0, p1}, Lb/a/av;->b(Lb/a/gn;)V

    goto :goto_0

    :cond_1
    iget-object v0, p2, Lb/a/cn;->c:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lb/a/cn;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lb/a/cn;->m()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    new-instance v0, Lb/a/gl;

    iget-object v1, p2, Lb/a/cn;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lb/a/gl;-><init>(BI)V

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gl;)V

    iget-object v0, p2, Lb/a/cn;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/bc;

    invoke-virtual {v0, p1}, Lb/a/bc;->b(Lb/a/gn;)V

    goto :goto_1

    :cond_2
    iget-object v0, p2, Lb/a/cn;->d:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lb/a/cn;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lb/a/cn;->n()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    new-instance v0, Lb/a/gl;

    iget-object v1, p2, Lb/a/cn;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lb/a/gl;-><init>(BI)V

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gl;)V

    iget-object v0, p2, Lb/a/cn;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/bc;

    invoke-virtual {v0, p1}, Lb/a/bc;->b(Lb/a/gn;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lb/a/gn;->c()V

    invoke-virtual {p1}, Lb/a/gn;->b()V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 6

    const/16 v5, 0xf

    const/4 v1, 0x0

    check-cast p2, Lb/a/cn;

    invoke-virtual {p1}, Lb/a/gn;->d()Lb/a/gs;

    :goto_0
    invoke-virtual {p1}, Lb/a/gn;->f()Lb/a/gk;

    move-result-object v0

    iget-byte v2, v0, Lb/a/gk;->b:B

    if-eqz v2, :cond_7

    iget-short v2, v0, Lb/a/gk;->c:S

    packed-switch v2, :pswitch_data_0

    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_0
    iget-byte v2, v0, Lb/a/gk;->b:B

    const/16 v3, 0xb

    if-ne v2, v3, :cond_0

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/cn;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/cn;->b()V

    goto :goto_0

    :cond_0
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_1
    iget-byte v2, v0, Lb/a/gk;->b:B

    if-ne v2, v5, :cond_2

    invoke-virtual {p1}, Lb/a/gn;->h()Lb/a/gl;

    move-result-object v2

    new-instance v0, Ljava/util/ArrayList;

    iget v3, v2, Lb/a/gl;->b:I

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Lb/a/cn;->b:Ljava/util/List;

    move v0, v1

    :goto_1
    iget v3, v2, Lb/a/gl;->b:I

    if-ge v0, v3, :cond_1

    new-instance v3, Lb/a/av;

    invoke-direct {v3}, Lb/a/av;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/av;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/cn;->b:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, Lb/a/cn;->d()V

    goto :goto_0

    :cond_2
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_2
    iget-byte v2, v0, Lb/a/gk;->b:B

    if-ne v2, v5, :cond_4

    invoke-virtual {p1}, Lb/a/gn;->h()Lb/a/gl;

    move-result-object v2

    new-instance v0, Ljava/util/ArrayList;

    iget v3, v2, Lb/a/gl;->b:I

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Lb/a/cn;->c:Ljava/util/List;

    move v0, v1

    :goto_2
    iget v3, v2, Lb/a/gl;->b:I

    if-ge v0, v3, :cond_3

    new-instance v3, Lb/a/bc;

    invoke-direct {v3}, Lb/a/bc;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/bc;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/cn;->c:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    invoke-static {}, Lb/a/cn;->f()V

    goto/16 :goto_0

    :cond_4
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_3
    iget-byte v2, v0, Lb/a/gk;->b:B

    if-ne v2, v5, :cond_6

    invoke-virtual {p1}, Lb/a/gn;->h()Lb/a/gl;

    move-result-object v2

    new-instance v0, Ljava/util/ArrayList;

    iget v3, v2, Lb/a/gl;->b:I

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Lb/a/cn;->d:Ljava/util/List;

    move v0, v1

    :goto_3
    iget v3, v2, Lb/a/gl;->b:I

    if-ge v0, v3, :cond_5

    new-instance v3, Lb/a/bc;

    invoke-direct {v3}, Lb/a/bc;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/bc;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/cn;->d:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    invoke-static {}, Lb/a/cn;->h()V

    goto/16 :goto_0

    :cond_6
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :cond_7
    invoke-virtual {p1}, Lb/a/gn;->e()V

    invoke-virtual {p2}, Lb/a/cn;->i()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
