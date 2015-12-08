.class final Lb/a/cq;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/cq;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/cn;

    check-cast p1, Lb/a/gt;

    iget-object v0, p2, Lb/a/cn;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p2}, Lb/a/cn;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    invoke-virtual {p2}, Lb/a/cn;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_1
    invoke-virtual {p2}, Lb/a/cn;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_2
    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(Ljava/util/BitSet;I)V

    invoke-virtual {p2}, Lb/a/cn;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p2, Lb/a/cn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/cn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/av;

    invoke-virtual {v0, p1}, Lb/a/av;->b(Lb/a/gn;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Lb/a/cn;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p2, Lb/a/cn;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/cn;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/bc;

    invoke-virtual {v0, p1}, Lb/a/bc;->b(Lb/a/gn;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Lb/a/cn;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p2, Lb/a/cn;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/cn;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/bc;

    invoke-virtual {v0, p1}, Lb/a/bc;->b(Lb/a/gn;)V

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 7

    const/16 v6, 0xc

    const/4 v1, 0x0

    check-cast p2, Lb/a/cn;

    check-cast p1, Lb/a/gt;

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/cn;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/cn;->b()V

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lb/a/gt;->b(I)Ljava/util/BitSet;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v3, Lb/a/gl;

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    invoke-direct {v3, v6, v0}, Lb/a/gl;-><init>(BI)V

    new-instance v0, Ljava/util/ArrayList;

    iget v4, v3, Lb/a/gl;->b:I

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Lb/a/cn;->b:Ljava/util/List;

    move v0, v1

    :goto_0
    iget v4, v3, Lb/a/gl;->b:I

    if-ge v0, v4, :cond_0

    new-instance v4, Lb/a/av;

    invoke-direct {v4}, Lb/a/av;-><init>()V

    invoke-virtual {v4, p1}, Lb/a/av;->a(Lb/a/gn;)V

    iget-object v5, p2, Lb/a/cn;->b:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Lb/a/cn;->d()V

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v3, Lb/a/gl;

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    invoke-direct {v3, v6, v0}, Lb/a/gl;-><init>(BI)V

    new-instance v0, Ljava/util/ArrayList;

    iget v4, v3, Lb/a/gl;->b:I

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Lb/a/cn;->c:Ljava/util/List;

    move v0, v1

    :goto_1
    iget v4, v3, Lb/a/gl;->b:I

    if-ge v0, v4, :cond_2

    new-instance v4, Lb/a/bc;

    invoke-direct {v4}, Lb/a/bc;-><init>()V

    invoke-virtual {v4, p1}, Lb/a/bc;->a(Lb/a/gn;)V

    iget-object v5, p2, Lb/a/cn;->c:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    invoke-static {}, Lb/a/cn;->f()V

    :cond_3
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lb/a/gl;

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v2

    invoke-direct {v0, v6, v2}, Lb/a/gl;-><init>(BI)V

    new-instance v2, Ljava/util/ArrayList;

    iget v3, v0, Lb/a/gl;->b:I

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p2, Lb/a/cn;->d:Ljava/util/List;

    :goto_2
    iget v2, v0, Lb/a/gl;->b:I

    if-ge v1, v2, :cond_4

    new-instance v2, Lb/a/bc;

    invoke-direct {v2}, Lb/a/bc;-><init>()V

    invoke-virtual {v2, p1}, Lb/a/bc;->a(Lb/a/gn;)V

    iget-object v3, p2, Lb/a/cn;->d:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    invoke-static {}, Lb/a/cn;->h()V

    :cond_5
    return-void
.end method
