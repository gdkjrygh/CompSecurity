.class final Lb/a/ek;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/ek;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/eh;

    check-cast p1, Lb/a/gt;

    iget-object v0, p2, Lb/a/eh;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    iget-wide v0, p2, Lb/a/eh;->b:J

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(J)V

    iget-wide v0, p2, Lb/a/eh;->c:J

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(J)V

    iget-wide v0, p2, Lb/a/eh;->d:J

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(J)V

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p2}, Lb/a/eh;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    invoke-virtual {p2}, Lb/a/eh;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_1
    invoke-virtual {p2}, Lb/a/eh;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_2
    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(Ljava/util/BitSet;I)V

    invoke-virtual {p2}, Lb/a/eh;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p2, Lb/a/eh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/eh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/dl;

    invoke-virtual {v0, p1}, Lb/a/dl;->b(Lb/a/gn;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Lb/a/eh;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p2, Lb/a/eh;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/eh;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/cz;

    invoke-virtual {v0, p1}, Lb/a/cz;->b(Lb/a/gn;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Lb/a/eh;->m()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p2, Lb/a/eh;->g:Lb/a/en;

    invoke-virtual {v0, p1}, Lb/a/en;->b(Lb/a/gn;)V

    :cond_5
    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 7

    const/16 v6, 0xc

    const/4 v1, 0x0

    check-cast p2, Lb/a/eh;

    check-cast p1, Lb/a/gt;

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/eh;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/eh;->a()V

    invoke-virtual {p1}, Lb/a/gt;->n()J

    move-result-wide v2

    iput-wide v2, p2, Lb/a/eh;->b:J

    invoke-virtual {p2}, Lb/a/eh;->c()V

    invoke-virtual {p1}, Lb/a/gt;->n()J

    move-result-wide v2

    iput-wide v2, p2, Lb/a/eh;->c:J

    invoke-virtual {p2}, Lb/a/eh;->e()V

    invoke-virtual {p1}, Lb/a/gt;->n()J

    move-result-wide v2

    iput-wide v2, p2, Lb/a/eh;->d:J

    invoke-virtual {p2}, Lb/a/eh;->g()V

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

    iput-object v0, p2, Lb/a/eh;->e:Ljava/util/List;

    move v0, v1

    :goto_0
    iget v4, v3, Lb/a/gl;->b:I

    if-ge v0, v4, :cond_0

    new-instance v4, Lb/a/dl;

    invoke-direct {v4}, Lb/a/dl;-><init>()V

    invoke-virtual {v4, p1}, Lb/a/dl;->a(Lb/a/gn;)V

    iget-object v5, p2, Lb/a/eh;->e:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Lb/a/eh;->j()V

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lb/a/gl;

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v3

    invoke-direct {v0, v6, v3}, Lb/a/gl;-><init>(BI)V

    new-instance v3, Ljava/util/ArrayList;

    iget v4, v0, Lb/a/gl;->b:I

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, p2, Lb/a/eh;->f:Ljava/util/List;

    :goto_1
    iget v3, v0, Lb/a/gl;->b:I

    if-ge v1, v3, :cond_2

    new-instance v3, Lb/a/cz;

    invoke-direct {v3}, Lb/a/cz;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/cz;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/eh;->f:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-static {}, Lb/a/eh;->l()V

    :cond_3
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lb/a/en;

    invoke-direct {v0}, Lb/a/en;-><init>()V

    iput-object v0, p2, Lb/a/eh;->g:Lb/a/en;

    iget-object v0, p2, Lb/a/eh;->g:Lb/a/en;

    invoke-virtual {v0, p1}, Lb/a/en;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/eh;->n()V

    :cond_4
    return-void
.end method
