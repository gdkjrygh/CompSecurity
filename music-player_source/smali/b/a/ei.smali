.class final Lb/a/ei;
.super Lb/a/gw;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gw;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/ei;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 3

    const/16 v2, 0xc

    check-cast p2, Lb/a/eh;

    invoke-virtual {p2}, Lb/a/eh;->o()V

    invoke-static {}, Lb/a/eh;->p()Lb/a/gs;

    invoke-virtual {p1}, Lb/a/gn;->a()V

    iget-object v0, p2, Lb/a/eh;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {}, Lb/a/eh;->q()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/eh;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lb/a/eh;->r()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-wide v0, p2, Lb/a/eh;->b:J

    invoke-virtual {p1, v0, v1}, Lb/a/gn;->a(J)V

    invoke-static {}, Lb/a/eh;->s()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-wide v0, p2, Lb/a/eh;->c:J

    invoke-virtual {p1, v0, v1}, Lb/a/gn;->a(J)V

    invoke-static {}, Lb/a/eh;->t()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-wide v0, p2, Lb/a/eh;->d:J

    invoke-virtual {p1, v0, v1}, Lb/a/gn;->a(J)V

    iget-object v0, p2, Lb/a/eh;->e:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lb/a/eh;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lb/a/eh;->u()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    new-instance v0, Lb/a/gl;

    iget-object v1, p2, Lb/a/eh;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lb/a/gl;-><init>(BI)V

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gl;)V

    iget-object v0, p2, Lb/a/eh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/dl;

    invoke-virtual {v0, p1}, Lb/a/dl;->b(Lb/a/gn;)V

    goto :goto_0

    :cond_1
    iget-object v0, p2, Lb/a/eh;->f:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lb/a/eh;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lb/a/eh;->v()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    new-instance v0, Lb/a/gl;

    iget-object v1, p2, Lb/a/eh;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lb/a/gl;-><init>(BI)V

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gl;)V

    iget-object v0, p2, Lb/a/eh;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/cz;

    invoke-virtual {v0, p1}, Lb/a/cz;->b(Lb/a/gn;)V

    goto :goto_1

    :cond_2
    iget-object v0, p2, Lb/a/eh;->g:Lb/a/en;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lb/a/eh;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lb/a/eh;->w()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/eh;->g:Lb/a/en;

    invoke-virtual {v0, p1}, Lb/a/en;->b(Lb/a/gn;)V

    :cond_3
    invoke-virtual {p1}, Lb/a/gn;->c()V

    invoke-virtual {p1}, Lb/a/gn;->b()V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 7

    const/16 v6, 0xf

    const/4 v1, 0x0

    const/16 v5, 0xa

    check-cast p2, Lb/a/eh;

    invoke-virtual {p1}, Lb/a/gn;->d()Lb/a/gs;

    :goto_0
    invoke-virtual {p1}, Lb/a/gn;->f()Lb/a/gk;

    move-result-object v0

    iget-byte v2, v0, Lb/a/gk;->b:B

    if-eqz v2, :cond_9

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

    iput-object v0, p2, Lb/a/eh;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/eh;->a()V

    goto :goto_0

    :cond_0
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_1
    iget-byte v2, v0, Lb/a/gk;->b:B

    if-ne v2, v5, :cond_1

    invoke-virtual {p1}, Lb/a/gn;->n()J

    move-result-wide v2

    iput-wide v2, p2, Lb/a/eh;->b:J

    invoke-virtual {p2}, Lb/a/eh;->c()V

    goto :goto_0

    :cond_1
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_2
    iget-byte v2, v0, Lb/a/gk;->b:B

    if-ne v2, v5, :cond_2

    invoke-virtual {p1}, Lb/a/gn;->n()J

    move-result-wide v2

    iput-wide v2, p2, Lb/a/eh;->c:J

    invoke-virtual {p2}, Lb/a/eh;->e()V

    goto :goto_0

    :cond_2
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_3
    iget-byte v2, v0, Lb/a/gk;->b:B

    if-ne v2, v5, :cond_3

    invoke-virtual {p1}, Lb/a/gn;->n()J

    move-result-wide v2

    iput-wide v2, p2, Lb/a/eh;->d:J

    invoke-virtual {p2}, Lb/a/eh;->g()V

    goto :goto_0

    :cond_3
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_4
    iget-byte v2, v0, Lb/a/gk;->b:B

    if-ne v2, v6, :cond_5

    invoke-virtual {p1}, Lb/a/gn;->h()Lb/a/gl;

    move-result-object v2

    new-instance v0, Ljava/util/ArrayList;

    iget v3, v2, Lb/a/gl;->b:I

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Lb/a/eh;->e:Ljava/util/List;

    move v0, v1

    :goto_1
    iget v3, v2, Lb/a/gl;->b:I

    if-ge v0, v3, :cond_4

    new-instance v3, Lb/a/dl;

    invoke-direct {v3}, Lb/a/dl;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/dl;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/eh;->e:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    invoke-static {}, Lb/a/eh;->j()V

    goto/16 :goto_0

    :cond_5
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_5
    iget-byte v2, v0, Lb/a/gk;->b:B

    if-ne v2, v6, :cond_7

    invoke-virtual {p1}, Lb/a/gn;->h()Lb/a/gl;

    move-result-object v2

    new-instance v0, Ljava/util/ArrayList;

    iget v3, v2, Lb/a/gl;->b:I

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Lb/a/eh;->f:Ljava/util/List;

    move v0, v1

    :goto_2
    iget v3, v2, Lb/a/gl;->b:I

    if-ge v0, v3, :cond_6

    new-instance v3, Lb/a/cz;

    invoke-direct {v3}, Lb/a/cz;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/cz;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/eh;->f:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    invoke-static {}, Lb/a/eh;->l()V

    goto/16 :goto_0

    :cond_7
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_6
    iget-byte v2, v0, Lb/a/gk;->b:B

    const/16 v3, 0xc

    if-ne v2, v3, :cond_8

    new-instance v0, Lb/a/en;

    invoke-direct {v0}, Lb/a/en;-><init>()V

    iput-object v0, p2, Lb/a/eh;->g:Lb/a/en;

    iget-object v0, p2, Lb/a/eh;->g:Lb/a/en;

    invoke-virtual {v0, p1}, Lb/a/en;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/eh;->n()V

    goto/16 :goto_0

    :cond_8
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :cond_9
    invoke-virtual {p1}, Lb/a/gn;->e()V

    invoke-virtual {p2}, Lb/a/eh;->b()Z

    move-result v0

    if-nez v0, :cond_a

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'start_time\' was not found in serialized data! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    invoke-virtual {p2}, Lb/a/eh;->d()Z

    move-result v0

    if-nez v0, :cond_b

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'end_time\' was not found in serialized data! Struct: "

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
    invoke-virtual {p2}, Lb/a/eh;->f()Z

    move-result v0

    if-nez v0, :cond_c

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'duration\' was not found in serialized data! Struct: "

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
    invoke-virtual {p2}, Lb/a/eh;->o()V

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
    .end packed-switch
.end method
