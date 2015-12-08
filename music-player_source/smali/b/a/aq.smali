.class final Lb/a/aq;
.super Lb/a/gw;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gw;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/aq;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/ap;

    invoke-virtual {p2}, Lb/a/ap;->I()V

    invoke-static {}, Lb/a/ap;->J()Lb/a/gs;

    invoke-virtual {p1}, Lb/a/gn;->a()V

    iget-object v0, p2, Lb/a/ap;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lb/a/ap;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lb/a/ap;->K()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p2, Lb/a/ap;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lb/a/ap;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lb/a/ap;->L()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p2, Lb/a/ap;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lb/a/ap;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lb/a/ap;->M()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p2, Lb/a/ap;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lb/a/ap;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lb/a/ap;->N()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p2, Lb/a/ap;->e:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lb/a/ap;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lb/a/ap;->O()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p2, Lb/a/ap;->f:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lb/a/ap;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lb/a/ap;->P()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_5
    iget-object v0, p2, Lb/a/ap;->g:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lb/a/ap;->m()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lb/a/ap;->Q()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_6
    iget-object v0, p2, Lb/a/ap;->h:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lb/a/ap;->o()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Lb/a/ap;->R()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_7
    iget-object v0, p2, Lb/a/ap;->i:Lb/a/du;

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lb/a/ap;->q()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Lb/a/ap;->S()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->i:Lb/a/du;

    invoke-virtual {v0, p1}, Lb/a/du;->b(Lb/a/gn;)V

    :cond_8
    invoke-virtual {p2}, Lb/a/ap;->s()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Lb/a/ap;->T()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-boolean v0, p2, Lb/a/ap;->j:Z

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Z)V

    :cond_9
    invoke-virtual {p2}, Lb/a/ap;->u()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Lb/a/ap;->U()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-boolean v0, p2, Lb/a/ap;->k:Z

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Z)V

    :cond_a
    iget-object v0, p2, Lb/a/ap;->l:Ljava/lang/String;

    if-eqz v0, :cond_b

    invoke-virtual {p2}, Lb/a/ap;->w()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, Lb/a/ap;->V()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_b
    iget-object v0, p2, Lb/a/ap;->m:Ljava/lang/String;

    if-eqz v0, :cond_c

    invoke-virtual {p2}, Lb/a/ap;->y()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, Lb/a/ap;->W()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->m:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_c
    invoke-virtual {p2}, Lb/a/ap;->A()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Lb/a/ap;->X()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-wide v0, p2, Lb/a/ap;->n:J

    invoke-virtual {p1, v0, v1}, Lb/a/gn;->a(J)V

    :cond_d
    iget-object v0, p2, Lb/a/ap;->o:Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-virtual {p2}, Lb/a/ap;->C()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, Lb/a/ap;->Y()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_e
    iget-object v0, p2, Lb/a/ap;->p:Ljava/lang/String;

    if-eqz v0, :cond_f

    invoke-virtual {p2}, Lb/a/ap;->E()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, Lb/a/ap;->Z()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->p:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_f
    iget-object v0, p2, Lb/a/ap;->q:Ljava/lang/String;

    if-eqz v0, :cond_10

    invoke-virtual {p2}, Lb/a/ap;->G()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, Lb/a/ap;->aa()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ap;->q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_10
    invoke-virtual {p1}, Lb/a/gn;->c()V

    invoke-virtual {p1}, Lb/a/gn;->b()V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 5

    const/4 v4, 0x2

    const/16 v3, 0xb

    check-cast p2, Lb/a/ap;

    invoke-virtual {p1}, Lb/a/gn;->d()Lb/a/gs;

    :goto_0
    invoke-virtual {p1}, Lb/a/gn;->f()Lb/a/gk;

    move-result-object v0

    iget-byte v1, v0, Lb/a/gk;->b:B

    if-eqz v1, :cond_11

    iget-short v1, v0, Lb/a/gk;->c:S

    packed-switch v1, :pswitch_data_0

    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_0
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_0

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->b()V

    goto :goto_0

    :cond_0
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_1
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_1

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->b:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->d()V

    goto :goto_0

    :cond_1
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_2
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_2

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->c:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->f()V

    goto :goto_0

    :cond_2
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_3
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_3

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->d:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->h()V

    goto :goto_0

    :cond_3
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_4
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_4

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->e:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->j()V

    goto :goto_0

    :cond_4
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_5
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_5

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->f:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->l()V

    goto/16 :goto_0

    :cond_5
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_6
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_6

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->g:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->n()V

    goto/16 :goto_0

    :cond_6
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_7
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_7

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->h:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->p()V

    goto/16 :goto_0

    :cond_7
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_8
    iget-byte v1, v0, Lb/a/gk;->b:B

    const/16 v2, 0xc

    if-ne v1, v2, :cond_8

    new-instance v0, Lb/a/du;

    invoke-direct {v0}, Lb/a/du;-><init>()V

    iput-object v0, p2, Lb/a/ap;->i:Lb/a/du;

    iget-object v0, p2, Lb/a/ap;->i:Lb/a/du;

    invoke-virtual {v0, p1}, Lb/a/du;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/ap;->r()V

    goto/16 :goto_0

    :cond_8
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_9
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v4, :cond_9

    invoke-virtual {p1}, Lb/a/gn;->j()Z

    move-result v0

    iput-boolean v0, p2, Lb/a/ap;->j:Z

    invoke-virtual {p2}, Lb/a/ap;->t()V

    goto/16 :goto_0

    :cond_9
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_a
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v4, :cond_a

    invoke-virtual {p1}, Lb/a/gn;->j()Z

    move-result v0

    iput-boolean v0, p2, Lb/a/ap;->k:Z

    invoke-virtual {p2}, Lb/a/ap;->v()V

    goto/16 :goto_0

    :cond_a
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_b
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_b

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->l:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->x()V

    goto/16 :goto_0

    :cond_b
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_c
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_c

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->m:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->z()V

    goto/16 :goto_0

    :cond_c
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_d
    iget-byte v1, v0, Lb/a/gk;->b:B

    const/16 v2, 0xa

    if-ne v1, v2, :cond_d

    invoke-virtual {p1}, Lb/a/gn;->n()J

    move-result-wide v0

    iput-wide v0, p2, Lb/a/ap;->n:J

    invoke-virtual {p2}, Lb/a/ap;->B()V

    goto/16 :goto_0

    :cond_d
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_e
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_e

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->o:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->D()V

    goto/16 :goto_0

    :cond_e
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_f
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_f

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->p:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->F()V

    goto/16 :goto_0

    :cond_f
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_10
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_10

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/ap;->q:Ljava/lang/String;

    invoke-static {}, Lb/a/ap;->H()V

    goto/16 :goto_0

    :cond_10
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :cond_11
    invoke-virtual {p1}, Lb/a/gn;->e()V

    invoke-virtual {p2}, Lb/a/ap;->I()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
    .end packed-switch
.end method
