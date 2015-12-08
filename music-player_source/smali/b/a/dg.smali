.class final Lb/a/dg;
.super Lb/a/gw;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gw;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/dg;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/df;

    invoke-static {}, Lb/a/df;->u()V

    invoke-static {}, Lb/a/df;->v()Lb/a/gs;

    invoke-virtual {p1}, Lb/a/gn;->a()V

    invoke-virtual {p2}, Lb/a/df;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lb/a/df;->w()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget v0, p2, Lb/a/df;->a:I

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    :cond_0
    iget-object v0, p2, Lb/a/df;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lb/a/df;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lb/a/df;->x()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/df;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p2, Lb/a/df;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lb/a/df;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lb/a/df;->y()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/df;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p2}, Lb/a/df;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lb/a/df;->z()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-wide v0, p2, Lb/a/df;->d:D

    invoke-virtual {p1, v0, v1}, Lb/a/gn;->a(D)V

    :cond_3
    invoke-virtual {p2}, Lb/a/df;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lb/a/df;->A()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-wide v0, p2, Lb/a/df;->e:D

    invoke-virtual {p1, v0, v1}, Lb/a/gn;->a(D)V

    :cond_4
    iget-object v0, p2, Lb/a/df;->f:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lb/a/df;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lb/a/df;->B()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/df;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p2}, Lb/a/df;->m()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lb/a/df;->C()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget v0, p2, Lb/a/df;->g:I

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    :cond_6
    iget-object v0, p2, Lb/a/df;->h:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lb/a/df;->o()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Lb/a/df;->D()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/df;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_7
    iget-object v0, p2, Lb/a/df;->i:Lb/a/k;

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lb/a/df;->q()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Lb/a/df;->E()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/df;->i:Lb/a/k;

    invoke-virtual {v0}, Lb/a/k;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    :cond_8
    iget-object v0, p2, Lb/a/df;->j:Ljava/lang/String;

    if-eqz v0, :cond_9

    invoke-virtual {p2}, Lb/a/df;->s()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Lb/a/df;->F()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/df;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_9
    invoke-virtual {p1}, Lb/a/gn;->c()V

    invoke-virtual {p1}, Lb/a/gn;->b()V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 5

    const/4 v4, 0x4

    const/16 v3, 0x8

    const/16 v2, 0xb

    check-cast p2, Lb/a/df;

    invoke-virtual {p1}, Lb/a/gn;->d()Lb/a/gs;

    :goto_0
    invoke-virtual {p1}, Lb/a/gn;->f()Lb/a/gk;

    move-result-object v0

    iget-byte v1, v0, Lb/a/gk;->b:B

    if-eqz v1, :cond_a

    iget-short v1, v0, Lb/a/gk;->c:S

    packed-switch v1, :pswitch_data_0

    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_0
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_0

    invoke-virtual {p1}, Lb/a/gn;->m()I

    move-result v0

    iput v0, p2, Lb/a/df;->a:I

    invoke-virtual {p2}, Lb/a/df;->b()V

    goto :goto_0

    :cond_0
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_1
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_1

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/df;->b:Ljava/lang/String;

    invoke-static {}, Lb/a/df;->d()V

    goto :goto_0

    :cond_1
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_2
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/df;->c:Ljava/lang/String;

    invoke-static {}, Lb/a/df;->f()V

    goto :goto_0

    :cond_2
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_3
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v4, :cond_3

    invoke-virtual {p1}, Lb/a/gn;->o()D

    move-result-wide v0

    iput-wide v0, p2, Lb/a/df;->d:D

    invoke-virtual {p2}, Lb/a/df;->h()V

    goto :goto_0

    :cond_3
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_4
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v4, :cond_4

    invoke-virtual {p1}, Lb/a/gn;->o()D

    move-result-wide v0

    iput-wide v0, p2, Lb/a/df;->e:D

    invoke-virtual {p2}, Lb/a/df;->j()V

    goto :goto_0

    :cond_4
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_5
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_5

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/df;->f:Ljava/lang/String;

    invoke-static {}, Lb/a/df;->l()V

    goto/16 :goto_0

    :cond_5
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_6
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_6

    invoke-virtual {p1}, Lb/a/gn;->m()I

    move-result v0

    iput v0, p2, Lb/a/df;->g:I

    invoke-virtual {p2}, Lb/a/df;->n()V

    goto/16 :goto_0

    :cond_6
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_7
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_7

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/df;->h:Ljava/lang/String;

    invoke-static {}, Lb/a/df;->p()V

    goto/16 :goto_0

    :cond_7
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_8
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_8

    invoke-virtual {p1}, Lb/a/gn;->m()I

    move-result v0

    invoke-static {v0}, Lb/a/k;->a(I)Lb/a/k;

    move-result-object v0

    iput-object v0, p2, Lb/a/df;->i:Lb/a/k;

    invoke-static {}, Lb/a/df;->r()V

    goto/16 :goto_0

    :cond_8
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_9
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_9

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/df;->j:Ljava/lang/String;

    invoke-static {}, Lb/a/df;->t()V

    goto/16 :goto_0

    :cond_9
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1}, Lb/a/gn;->e()V

    invoke-static {}, Lb/a/df;->u()V

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
    .end packed-switch
.end method
