.class final Lb/a/y;
.super Lb/a/gw;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gw;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/y;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 1

    check-cast p2, Lb/a/x;

    invoke-virtual {p2}, Lb/a/x;->q()V

    invoke-static {}, Lb/a/x;->r()Lb/a/gs;

    invoke-virtual {p1}, Lb/a/gn;->a()V

    iget-object v0, p2, Lb/a/x;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {}, Lb/a/x;->s()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/x;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p2, Lb/a/x;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lb/a/x;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lb/a/x;->t()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/x;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p2}, Lb/a/x;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lb/a/x;->u()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget v0, p2, Lb/a/x;->c:I

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    :cond_2
    iget-object v0, p2, Lb/a/x;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lb/a/x;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lb/a/x;->v()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/x;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p2, Lb/a/x;->e:Lb/a/eg;

    if-eqz v0, :cond_4

    invoke-static {}, Lb/a/x;->w()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/x;->e:Lb/a/eg;

    invoke-virtual {v0}, Lb/a/eg;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    :cond_4
    iget-object v0, p2, Lb/a/x;->f:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-static {}, Lb/a/x;->x()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/x;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_5
    iget-object v0, p2, Lb/a/x;->g:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {}, Lb/a/x;->y()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/x;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_6
    iget-object v0, p2, Lb/a/x;->h:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lb/a/x;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Lb/a/x;->z()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/x;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_7
    iget-object v0, p2, Lb/a/x;->i:Ljava/lang/String;

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lb/a/x;->m()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Lb/a/x;->A()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/x;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_8
    invoke-virtual {p2}, Lb/a/x;->o()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Lb/a/x;->B()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget v0, p2, Lb/a/x;->j:I

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    :cond_9
    invoke-virtual {p1}, Lb/a/gn;->c()V

    invoke-virtual {p1}, Lb/a/gn;->b()V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 4

    const/16 v3, 0x8

    const/16 v2, 0xb

    check-cast p2, Lb/a/x;

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

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/x;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->a()V

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

    iput-object v0, p2, Lb/a/x;->b:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->c()V

    goto :goto_0

    :cond_1
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_2
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_2

    invoke-virtual {p1}, Lb/a/gn;->m()I

    move-result v0

    iput v0, p2, Lb/a/x;->c:I

    invoke-virtual {p2}, Lb/a/x;->e()V

    goto :goto_0

    :cond_2
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_3
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_3

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/x;->d:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->g()V

    goto :goto_0

    :cond_3
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_4
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_4

    invoke-virtual {p1}, Lb/a/gn;->m()I

    move-result v0

    invoke-static {v0}, Lb/a/eg;->a(I)Lb/a/eg;

    move-result-object v0

    iput-object v0, p2, Lb/a/x;->e:Lb/a/eg;

    invoke-static {}, Lb/a/x;->h()V

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

    iput-object v0, p2, Lb/a/x;->f:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->i()V

    goto/16 :goto_0

    :cond_5
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_6
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_6

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/x;->g:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->j()V

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

    iput-object v0, p2, Lb/a/x;->h:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->l()V

    goto/16 :goto_0

    :cond_7
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_8
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_8

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/x;->i:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->n()V

    goto/16 :goto_0

    :cond_8
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_9
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_9

    invoke-virtual {p1}, Lb/a/gn;->m()I

    move-result v0

    iput v0, p2, Lb/a/x;->j:I

    invoke-virtual {p2}, Lb/a/x;->p()V

    goto/16 :goto_0

    :cond_9
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1}, Lb/a/gn;->e()V

    invoke-virtual {p2}, Lb/a/x;->q()V

    return-void

    nop

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
