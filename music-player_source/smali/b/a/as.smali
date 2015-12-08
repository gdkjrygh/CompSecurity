.class final Lb/a/as;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/as;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/ap;

    check-cast p1, Lb/a/gt;

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p2}, Lb/a/ap;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    invoke-virtual {p2}, Lb/a/ap;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_1
    invoke-virtual {p2}, Lb/a/ap;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_2
    invoke-virtual {p2}, Lb/a/ap;->g()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_3
    invoke-virtual {p2}, Lb/a/ap;->i()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_4
    invoke-virtual {p2}, Lb/a/ap;->k()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_5
    invoke-virtual {p2}, Lb/a/ap;->m()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_6
    invoke-virtual {p2}, Lb/a/ap;->o()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_7
    invoke-virtual {p2}, Lb/a/ap;->q()Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_8
    invoke-virtual {p2}, Lb/a/ap;->s()Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_9
    invoke-virtual {p2}, Lb/a/ap;->u()Z

    move-result v1

    if-eqz v1, :cond_a

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_a
    invoke-virtual {p2}, Lb/a/ap;->w()Z

    move-result v1

    if-eqz v1, :cond_b

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_b
    invoke-virtual {p2}, Lb/a/ap;->y()Z

    move-result v1

    if-eqz v1, :cond_c

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_c
    invoke-virtual {p2}, Lb/a/ap;->A()Z

    move-result v1

    if-eqz v1, :cond_d

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_d
    invoke-virtual {p2}, Lb/a/ap;->C()Z

    move-result v1

    if-eqz v1, :cond_e

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_e
    invoke-virtual {p2}, Lb/a/ap;->E()Z

    move-result v1

    if-eqz v1, :cond_f

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_f
    invoke-virtual {p2}, Lb/a/ap;->G()Z

    move-result v1

    if-eqz v1, :cond_10

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_10
    const/16 v1, 0x11

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(Ljava/util/BitSet;I)V

    invoke-virtual {p2}, Lb/a/ap;->a()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p2, Lb/a/ap;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_11
    invoke-virtual {p2}, Lb/a/ap;->c()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p2, Lb/a/ap;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_12
    invoke-virtual {p2}, Lb/a/ap;->e()Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p2, Lb/a/ap;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_13
    invoke-virtual {p2}, Lb/a/ap;->g()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p2, Lb/a/ap;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_14
    invoke-virtual {p2}, Lb/a/ap;->i()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p2, Lb/a/ap;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_15
    invoke-virtual {p2}, Lb/a/ap;->k()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p2, Lb/a/ap;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_16
    invoke-virtual {p2}, Lb/a/ap;->m()Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object v0, p2, Lb/a/ap;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_17
    invoke-virtual {p2}, Lb/a/ap;->o()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p2, Lb/a/ap;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_18
    invoke-virtual {p2}, Lb/a/ap;->q()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p2, Lb/a/ap;->i:Lb/a/du;

    invoke-virtual {v0, p1}, Lb/a/du;->b(Lb/a/gn;)V

    :cond_19
    invoke-virtual {p2}, Lb/a/ap;->s()Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-boolean v0, p2, Lb/a/ap;->j:Z

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Z)V

    :cond_1a
    invoke-virtual {p2}, Lb/a/ap;->u()Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-boolean v0, p2, Lb/a/ap;->k:Z

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Z)V

    :cond_1b
    invoke-virtual {p2}, Lb/a/ap;->w()Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p2, Lb/a/ap;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_1c
    invoke-virtual {p2}, Lb/a/ap;->y()Z

    move-result v0

    if-eqz v0, :cond_1d

    iget-object v0, p2, Lb/a/ap;->m:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_1d
    invoke-virtual {p2}, Lb/a/ap;->A()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-wide v0, p2, Lb/a/ap;->n:J

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(J)V

    :cond_1e
    invoke-virtual {p2}, Lb/a/ap;->C()Z

    move-result v0

    if-eqz v0, :cond_1f

    iget-object v0, p2, Lb/a/ap;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_1f
    invoke-virtual {p2}, Lb/a/ap;->E()Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, p2, Lb/a/ap;->p:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_20
    invoke-virtual {p2}, Lb/a/ap;->G()Z

    move-result v0

    if-eqz v0, :cond_21

    iget-object v0, p2, Lb/a/ap;->q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_21
    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 4

    check-cast p2, Lb/a/ap;

    check-cast p1, Lb/a/gt;

    const/16 v0, 0x11

    invoke-virtual {p1, v0}, Lb/a/gt;->b(I)Ljava/util/BitSet;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->b()V

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->b:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->d()V

    :cond_1
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->c:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->f()V

    :cond_2
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->d:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->h()V

    :cond_3
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->e:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->j()V

    :cond_4
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->f:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->l()V

    :cond_5
    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->g:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->n()V

    :cond_6
    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->h:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->p()V

    :cond_7
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v1, Lb/a/du;

    invoke-direct {v1}, Lb/a/du;-><init>()V

    iput-object v1, p2, Lb/a/ap;->i:Lb/a/du;

    iget-object v1, p2, Lb/a/ap;->i:Lb/a/du;

    invoke-virtual {v1, p1}, Lb/a/du;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/ap;->r()V

    :cond_8
    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Lb/a/gt;->j()Z

    move-result v1

    iput-boolean v1, p2, Lb/a/ap;->j:Z

    invoke-virtual {p2}, Lb/a/ap;->t()V

    :cond_9
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p1}, Lb/a/gt;->j()Z

    move-result v1

    iput-boolean v1, p2, Lb/a/ap;->k:Z

    invoke-virtual {p2}, Lb/a/ap;->v()V

    :cond_a
    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->l:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->x()V

    :cond_b
    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->m:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->z()V

    :cond_c
    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual {p1}, Lb/a/gt;->n()J

    move-result-wide v2

    iput-wide v2, p2, Lb/a/ap;->n:J

    invoke-virtual {p2}, Lb/a/ap;->B()V

    :cond_d
    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->o:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->D()V

    :cond_e
    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ap;->p:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->F()V

    :cond_f
    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->q:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->H()V

    :cond_10
    return-void
.end method
