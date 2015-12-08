.class final Lb/a/fa;
.super Lb/a/gw;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gw;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/fa;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 1

    check-cast p2, Lb/a/ez;

    invoke-virtual {p2}, Lb/a/ez;->o()V

    invoke-static {}, Lb/a/ez;->p()Lb/a/gs;

    invoke-virtual {p1}, Lb/a/gn;->a()V

    iget-object v0, p2, Lb/a/ez;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {}, Lb/a/ez;->q()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ez;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p2, Lb/a/ez;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {}, Lb/a/ez;->r()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ez;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p2, Lb/a/ez;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-static {}, Lb/a/ez;->s()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ez;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_2
    invoke-static {}, Lb/a/ez;->t()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget v0, p2, Lb/a/ez;->d:I

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    invoke-static {}, Lb/a/ez;->u()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget v0, p2, Lb/a/ez;->e:I

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    invoke-static {}, Lb/a/ez;->v()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget v0, p2, Lb/a/ez;->f:I

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    iget-object v0, p2, Lb/a/ez;->g:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_3

    invoke-static {}, Lb/a/ez;->w()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ez;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/nio/ByteBuffer;)V

    :cond_3
    iget-object v0, p2, Lb/a/ez;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-static {}, Lb/a/ez;->x()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ez;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p2, Lb/a/ez;->i:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-static {}, Lb/a/ez;->y()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/ez;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p2}, Lb/a/ez;->m()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lb/a/ez;->z()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget v0, p2, Lb/a/ez;->j:I

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    :cond_6
    invoke-virtual {p1}, Lb/a/gn;->c()V

    invoke-virtual {p1}, Lb/a/gn;->b()V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 4

    const/16 v3, 0x8

    const/16 v2, 0xb

    check-cast p2, Lb/a/ez;

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

    iput-object v0, p2, Lb/a/ez;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/ez;->a()V

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

    iput-object v0, p2, Lb/a/ez;->b:Ljava/lang/String;

    invoke-static {}, Lb/a/ez;->b()V

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

    iput-object v0, p2, Lb/a/ez;->c:Ljava/lang/String;

    invoke-static {}, Lb/a/ez;->c()V

    goto :goto_0

    :cond_2
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_3
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_3

    invoke-virtual {p1}, Lb/a/gn;->m()I

    move-result v0

    iput v0, p2, Lb/a/ez;->d:I

    invoke-virtual {p2}, Lb/a/ez;->e()V

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

    iput v0, p2, Lb/a/ez;->e:I

    invoke-virtual {p2}, Lb/a/ez;->g()V

    goto :goto_0

    :cond_4
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_5
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v3, :cond_5

    invoke-virtual {p1}, Lb/a/gn;->m()I

    move-result v0

    iput v0, p2, Lb/a/ez;->f:I

    invoke-virtual {p2}, Lb/a/ez;->i()V

    goto/16 :goto_0

    :cond_5
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_6
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_6

    invoke-virtual {p1}, Lb/a/gn;->q()Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p2, Lb/a/ez;->g:Ljava/nio/ByteBuffer;

    invoke-static {}, Lb/a/ez;->j()V

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

    iput-object v0, p2, Lb/a/ez;->h:Ljava/lang/String;

    invoke-static {}, Lb/a/ez;->k()V

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

    iput-object v0, p2, Lb/a/ez;->i:Ljava/lang/String;

    invoke-static {}, Lb/a/ez;->l()V

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

    iput v0, p2, Lb/a/ez;->j:I

    invoke-virtual {p2}, Lb/a/ez;->n()V

    goto/16 :goto_0

    :cond_9
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1}, Lb/a/gn;->e()V

    invoke-virtual {p2}, Lb/a/ez;->d()Z

    move-result v0

    if-nez v0, :cond_b

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'serial_num\' was not found in serialized data! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-virtual {p2}, Lb/a/ez;->f()Z

    move-result v0

    if-nez v0, :cond_c

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'ts_secs\' was not found in serialized data! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-virtual {p2}, Lb/a/ez;->h()Z

    move-result v0

    if-nez v0, :cond_d

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'length\' was not found in serialized data! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-virtual {p2}, Lb/a/ez;->o()V

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
