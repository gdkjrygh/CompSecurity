.class final Lb/a/bd;
.super Lb/a/gw;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gw;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/bd;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 4

    check-cast p2, Lb/a/bc;

    invoke-virtual {p2}, Lb/a/bc;->i()V

    invoke-static {}, Lb/a/bc;->j()Lb/a/gs;

    invoke-virtual {p1}, Lb/a/gn;->a()V

    iget-object v0, p2, Lb/a/bc;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {}, Lb/a/bc;->k()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/bc;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p2, Lb/a/bc;->b:Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-static {}, Lb/a/bc;->l()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    new-instance v0, Lb/a/gm;

    const/16 v1, 0xb

    const/16 v2, 0xc

    iget-object v3, p2, Lb/a/bc;->b:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lb/a/gm;-><init>(BBI)V

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gm;)V

    iget-object v0, p2, Lb/a/bc;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lb/a/gn;->a(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/dr;

    invoke-virtual {v0, p1}, Lb/a/dr;->b(Lb/a/gn;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lb/a/bc;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lb/a/bc;->m()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-wide v0, p2, Lb/a/bc;->c:J

    invoke-virtual {p1, v0, v1}, Lb/a/gn;->a(J)V

    :cond_2
    invoke-virtual {p2}, Lb/a/bc;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lb/a/bc;->n()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget v0, p2, Lb/a/bc;->d:I

    invoke-virtual {p1, v0}, Lb/a/gn;->a(I)V

    :cond_3
    invoke-static {}, Lb/a/bc;->o()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-wide v0, p2, Lb/a/bc;->e:J

    invoke-virtual {p1, v0, v1}, Lb/a/gn;->a(J)V

    invoke-virtual {p1}, Lb/a/gn;->c()V

    invoke-virtual {p1}, Lb/a/gn;->b()V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 6

    const/16 v5, 0xa

    check-cast p2, Lb/a/bc;

    invoke-virtual {p1}, Lb/a/gn;->d()Lb/a/gs;

    :goto_0
    invoke-virtual {p1}, Lb/a/gn;->f()Lb/a/gk;

    move-result-object v0

    iget-byte v1, v0, Lb/a/gk;->b:B

    if-eqz v1, :cond_6

    iget-short v1, v0, Lb/a/gk;->c:S

    packed-switch v1, :pswitch_data_0

    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_0
    iget-byte v1, v0, Lb/a/gk;->b:B

    const/16 v2, 0xb

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/bc;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/bc;->a()V

    goto :goto_0

    :cond_0
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_1
    iget-byte v1, v0, Lb/a/gk;->b:B

    const/16 v2, 0xd

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Lb/a/gn;->g()Lb/a/gm;

    move-result-object v1

    new-instance v0, Ljava/util/HashMap;

    iget v2, v1, Lb/a/gm;->c:I

    mul-int/lit8 v2, v2, 0x2

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p2, Lb/a/bc;->b:Ljava/util/Map;

    const/4 v0, 0x0

    :goto_1
    iget v2, v1, Lb/a/gm;->c:I

    if-ge v0, v2, :cond_1

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lb/a/dr;

    invoke-direct {v3}, Lb/a/dr;-><init>()V

    invoke-virtual {v3, p1}, Lb/a/dr;->a(Lb/a/gn;)V

    iget-object v4, p2, Lb/a/bc;->b:Ljava/util/Map;

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, Lb/a/bc;->b()V

    goto :goto_0

    :cond_2
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_2
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v5, :cond_3

    invoke-virtual {p1}, Lb/a/gn;->n()J

    move-result-wide v0

    iput-wide v0, p2, Lb/a/bc;->c:J

    invoke-virtual {p2}, Lb/a/bc;->d()V

    goto :goto_0

    :cond_3
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_3
    iget-byte v1, v0, Lb/a/gk;->b:B

    const/16 v2, 0x8

    if-ne v1, v2, :cond_4

    invoke-virtual {p1}, Lb/a/gn;->m()I

    move-result v0

    iput v0, p2, Lb/a/bc;->d:I

    invoke-virtual {p2}, Lb/a/bc;->f()V

    goto/16 :goto_0

    :cond_4
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :pswitch_4
    iget-byte v1, v0, Lb/a/gk;->b:B

    if-ne v1, v5, :cond_5

    invoke-virtual {p1}, Lb/a/gn;->n()J

    move-result-wide v0

    iput-wide v0, p2, Lb/a/bc;->e:J

    invoke-virtual {p2}, Lb/a/bc;->h()V

    goto/16 :goto_0

    :cond_5
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto/16 :goto_0

    :cond_6
    invoke-virtual {p1}, Lb/a/gn;->e()V

    invoke-virtual {p2}, Lb/a/bc;->g()Z

    move-result v0

    if-nez v0, :cond_7

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'ts\' was not found in serialized data! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-virtual {p2}, Lb/a/bc;->i()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
