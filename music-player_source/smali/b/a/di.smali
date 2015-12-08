.class final Lb/a/di;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/di;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/df;

    check-cast p1, Lb/a/gt;

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p2}, Lb/a/df;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    invoke-virtual {p2}, Lb/a/df;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_1
    invoke-virtual {p2}, Lb/a/df;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_2
    invoke-virtual {p2}, Lb/a/df;->g()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_3
    invoke-virtual {p2}, Lb/a/df;->i()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_4
    invoke-virtual {p2}, Lb/a/df;->k()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_5
    invoke-virtual {p2}, Lb/a/df;->m()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_6
    invoke-virtual {p2}, Lb/a/df;->o()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_7
    invoke-virtual {p2}, Lb/a/df;->q()Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_8
    invoke-virtual {p2}, Lb/a/df;->s()Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_9
    const/16 v1, 0xa

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(Ljava/util/BitSet;I)V

    invoke-virtual {p2}, Lb/a/df;->a()Z

    move-result v0

    if-eqz v0, :cond_a

    iget v0, p2, Lb/a/df;->a:I

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    :cond_a
    invoke-virtual {p2}, Lb/a/df;->c()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p2, Lb/a/df;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_b
    invoke-virtual {p2}, Lb/a/df;->e()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p2, Lb/a/df;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_c
    invoke-virtual {p2}, Lb/a/df;->g()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-wide v0, p2, Lb/a/df;->d:D

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(D)V

    :cond_d
    invoke-virtual {p2}, Lb/a/df;->i()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-wide v0, p2, Lb/a/df;->e:D

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(D)V

    :cond_e
    invoke-virtual {p2}, Lb/a/df;->k()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p2, Lb/a/df;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_f
    invoke-virtual {p2}, Lb/a/df;->m()Z

    move-result v0

    if-eqz v0, :cond_10

    iget v0, p2, Lb/a/df;->g:I

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    :cond_10
    invoke-virtual {p2}, Lb/a/df;->o()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p2, Lb/a/df;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_11
    invoke-virtual {p2}, Lb/a/df;->q()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p2, Lb/a/df;->i:Lb/a/k;

    invoke-virtual {v0}, Lb/a/k;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    :cond_12
    invoke-virtual {p2}, Lb/a/df;->s()Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p2, Lb/a/df;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_13
    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 4

    check-cast p2, Lb/a/df;

    check-cast p1, Lb/a/gt;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Lb/a/gt;->b(I)Ljava/util/BitSet;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v1

    iput v1, p2, Lb/a/df;->a:I

    invoke-virtual {p2}, Lb/a/df;->b()V

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/df;->b:Ljava/lang/String;

    invoke-static {}, Lb/a/df;->d()V

    :cond_1
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/df;->c:Ljava/lang/String;

    invoke-static {}, Lb/a/df;->f()V

    :cond_2
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lb/a/gt;->o()D

    move-result-wide v2

    iput-wide v2, p2, Lb/a/df;->d:D

    invoke-virtual {p2}, Lb/a/df;->h()V

    :cond_3
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lb/a/gt;->o()D

    move-result-wide v2

    iput-wide v2, p2, Lb/a/df;->e:D

    invoke-virtual {p2}, Lb/a/df;->j()V

    :cond_4
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/df;->f:Ljava/lang/String;

    invoke-static {}, Lb/a/df;->l()V

    :cond_5
    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v1

    iput v1, p2, Lb/a/df;->g:I

    invoke-virtual {p2}, Lb/a/df;->n()V

    :cond_6
    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/df;->h:Ljava/lang/String;

    invoke-static {}, Lb/a/df;->p()V

    :cond_7
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v1

    invoke-static {v1}, Lb/a/k;->a(I)Lb/a/k;

    move-result-object v1

    iput-object v1, p2, Lb/a/df;->i:Lb/a/k;

    invoke-static {}, Lb/a/df;->r()V

    :cond_8
    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/df;->j:Ljava/lang/String;

    invoke-static {}, Lb/a/df;->t()V

    :cond_9
    return-void
.end method
