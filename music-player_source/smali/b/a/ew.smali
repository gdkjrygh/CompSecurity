.class final Lb/a/ew;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/ew;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/et;

    check-cast p1, Lb/a/gt;

    iget-object v0, p2, Lb/a/et;->a:Lb/a/ad;

    invoke-virtual {v0, p1}, Lb/a/ad;->b(Lb/a/gn;)V

    iget-object v0, p2, Lb/a/et;->b:Lb/a/x;

    invoke-virtual {v0, p1}, Lb/a/x;->b(Lb/a/gn;)V

    iget-object v0, p2, Lb/a/et;->c:Lb/a/ap;

    invoke-virtual {v0, p1}, Lb/a/ap;->b(Lb/a/gn;)V

    iget-object v0, p2, Lb/a/et;->d:Lb/a/df;

    invoke-virtual {v0, p1}, Lb/a/df;->b(Lb/a/gn;)V

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p2}, Lb/a/et;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    invoke-virtual {p2}, Lb/a/et;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_1
    invoke-virtual {p2}, Lb/a/et;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_2
    invoke-virtual {p2}, Lb/a/et;->o()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_3
    invoke-virtual {p2}, Lb/a/et;->q()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_4
    invoke-virtual {p2}, Lb/a/et;->s()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_5
    invoke-virtual {p2}, Lb/a/et;->u()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_6
    const/4 v1, 0x7

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(Ljava/util/BitSet;I)V

    invoke-virtual {p2}, Lb/a/et;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p2, Lb/a/et;->e:Lb/a/l;

    invoke-virtual {v0, p1}, Lb/a/l;->b(Lb/a/gn;)V

    :cond_7
    invoke-virtual {p2}, Lb/a/et;->j()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p2, Lb/a/et;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/et;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/cn;

    invoke-virtual {v0, p1}, Lb/a/cn;->b(Lb/a/gn;)V

    goto :goto_0

    :cond_8
    invoke-virtual {p2}, Lb/a/et;->m()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p2, Lb/a/et;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/et;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/eh;

    invoke-virtual {v0, p1}, Lb/a/eh;->b(Lb/a/gn;)V

    goto :goto_1

    :cond_9
    invoke-virtual {p2}, Lb/a/et;->o()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p2, Lb/a/et;->h:Lb/a/cb;

    invoke-virtual {v0, p1}, Lb/a/cb;->b(Lb/a/gn;)V

    :cond_a
    invoke-virtual {p2}, Lb/a/et;->q()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p2, Lb/a/et;->i:Lb/a/bu;

    invoke-virtual {v0, p1}, Lb/a/bu;->b(Lb/a/gn;)V

    :cond_b
    invoke-virtual {p2}, Lb/a/et;->s()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p2, Lb/a/et;->j:Lb/a/r;

    invoke-virtual {v0, p1}, Lb/a/r;->b(Lb/a/gn;)V

    :cond_c
    invoke-virtual {p2}, Lb/a/et;->u()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p2, Lb/a/et;->k:Lb/a/aj;

    invoke-virtual {v0, p1}, Lb/a/aj;->b(Lb/a/gn;)V

    :cond_d
    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 7

    const/16 v6, 0xc

    const/4 v1, 0x0

    check-cast p2, Lb/a/et;

    check-cast p1, Lb/a/gt;

    new-instance v0, Lb/a/ad;

    invoke-direct {v0}, Lb/a/ad;-><init>()V

    iput-object v0, p2, Lb/a/et;->a:Lb/a/ad;

    iget-object v0, p2, Lb/a/et;->a:Lb/a/ad;

    invoke-virtual {v0, p1}, Lb/a/ad;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/et;->a()V

    new-instance v0, Lb/a/x;

    invoke-direct {v0}, Lb/a/x;-><init>()V

    iput-object v0, p2, Lb/a/et;->b:Lb/a/x;

    iget-object v0, p2, Lb/a/et;->b:Lb/a/x;

    invoke-virtual {v0, p1}, Lb/a/x;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/et;->b()V

    new-instance v0, Lb/a/ap;

    invoke-direct {v0}, Lb/a/ap;-><init>()V

    iput-object v0, p2, Lb/a/et;->c:Lb/a/ap;

    iget-object v0, p2, Lb/a/et;->c:Lb/a/ap;

    invoke-virtual {v0, p1}, Lb/a/ap;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/et;->c()V

    new-instance v0, Lb/a/df;

    invoke-direct {v0}, Lb/a/df;-><init>()V

    iput-object v0, p2, Lb/a/et;->d:Lb/a/df;

    iget-object v0, p2, Lb/a/et;->d:Lb/a/df;

    invoke-virtual {v0, p1}, Lb/a/df;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/et;->d()V

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Lb/a/gt;->b(I)Ljava/util/BitSet;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lb/a/l;

    invoke-direct {v0}, Lb/a/l;-><init>()V

    iput-object v0, p2, Lb/a/et;->e:Lb/a/l;

    iget-object v0, p2, Lb/a/et;->e:Lb/a/l;

    invoke-virtual {v0, p1}, Lb/a/l;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/et;->f()V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v3, Lb/a/gl;

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    invoke-direct {v3, v6, v0}, Lb/a/gl;-><init>(BI)V

    new-instance v0, Ljava/util/ArrayList;

    iget v4, v3, Lb/a/gl;->b:I

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Lb/a/et;->f:Ljava/util/List;

    move v0, v1

    :goto_0
    iget v4, v3, Lb/a/gl;->b:I

    if-ge v0, v4, :cond_1

    new-instance v4, Lb/a/cn;

    invoke-direct {v4}, Lb/a/cn;-><init>()V

    invoke-virtual {v4, p1}, Lb/a/cn;->a(Lb/a/gn;)V

    iget-object v5, p2, Lb/a/et;->f:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Lb/a/et;->k()V

    :cond_2
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lb/a/gl;

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v3

    invoke-direct {v0, v6, v3}, Lb/a/gl;-><init>(BI)V

    new-instance v3, Ljava/util/ArrayList;

    iget v4, v0, Lb/a/gl;->b:I

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, p2, Lb/a/et;->g:Ljava/util/List;

    :goto_1
    iget v3, v0, Lb/a/gl;->b:I

    if-ge v1, v3, :cond_3

    new-instance v3, Lb/a/eh;

    invoke-direct {v3}, Lb/a/eh;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/eh;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/et;->g:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    invoke-static {}, Lb/a/et;->n()V

    :cond_4
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lb/a/cb;

    invoke-direct {v0}, Lb/a/cb;-><init>()V

    iput-object v0, p2, Lb/a/et;->h:Lb/a/cb;

    iget-object v0, p2, Lb/a/et;->h:Lb/a/cb;

    invoke-virtual {v0, p1}, Lb/a/cb;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/et;->p()V

    :cond_5
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lb/a/bu;

    invoke-direct {v0}, Lb/a/bu;-><init>()V

    iput-object v0, p2, Lb/a/et;->i:Lb/a/bu;

    iget-object v0, p2, Lb/a/et;->i:Lb/a/bu;

    invoke-virtual {v0, p1}, Lb/a/bu;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/et;->r()V

    :cond_6
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lb/a/r;

    invoke-direct {v0}, Lb/a/r;-><init>()V

    iput-object v0, p2, Lb/a/et;->j:Lb/a/r;

    iget-object v0, p2, Lb/a/et;->j:Lb/a/r;

    invoke-virtual {v0, p1}, Lb/a/r;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/et;->t()V

    :cond_7
    const/4 v0, 0x6

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Lb/a/aj;

    invoke-direct {v0}, Lb/a/aj;-><init>()V

    iput-object v0, p2, Lb/a/et;->k:Lb/a/aj;

    iget-object v0, p2, Lb/a/et;->k:Lb/a/aj;

    invoke-virtual {v0, p1}, Lb/a/aj;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/et;->v()V

    :cond_8
    return-void
.end method
