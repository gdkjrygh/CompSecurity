.class final Lcom/c/b/bu$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field a:Z

.field b:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 280
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 275
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/bu$d;->a:Z

    .line 278
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/bu$d;->b:Z

    .line 280
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 273
    invoke-direct {p0}, Lcom/c/b/bu$d;-><init>()V

    return-void
.end method

.method private a(IILjava/util/List;Lcom/c/b/bu$e;)V
    .locals 3

    .prologue
    .line 479
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 480
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 481
    const-string v2, ": "

    invoke-virtual {p4, v2}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 482
    invoke-static {p2, v0, p4}, Lcom/c/b/bu;->a(ILjava/lang/Object;Lcom/c/b/bu$e;)V

    .line 483
    iget-boolean v0, p0, Lcom/c/b/bu$d;->a:Z

    if-eqz v0, :cond_0

    const-string v0, " "

    :goto_1
    invoke-virtual {p4, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const-string v0, "\n"

    goto :goto_1

    .line 485
    :cond_1
    return-void
.end method

.method private a(Lcom/c/b/ak$f;Ljava/lang/Object;Lcom/c/b/bu$e;)V
    .locals 3

    .prologue
    .line 320
    invoke-virtual {p1}, Lcom/c/b/ak$f;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    const-string v0, "["

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 323
    invoke-virtual {p1}, Lcom/c/b/ak$f;->t()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$a;->e()Lcom/c/b/i$s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$s;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/c/b/ak$f;->h()Lcom/c/b/ak$f$b;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$b;->k:Lcom/c/b/ak$f$b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/c/b/ak$f;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/c/b/ak$f;->v()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/c/b/ak$f;->w()Lcom/c/b/ak$a;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 328
    invoke-virtual {p1}, Lcom/c/b/ak$f;->w()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 332
    :goto_0
    const-string v0, "]"

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 342
    :goto_1
    invoke-virtual {p1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v0, v1, :cond_4

    .line 343
    iget-boolean v0, p0, Lcom/c/b/bu$d;->a:Z

    if-eqz v0, :cond_3

    .line 344
    const-string v0, " { "

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 353
    :goto_2
    sget-object v0, Lcom/c/b/bu$1;->a:[I

    invoke-virtual {p1}, Lcom/c/b/ak$f;->h()Lcom/c/b/ak$f$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/ak$f$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 355
    :goto_3
    invoke-virtual {p1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v0, v1, :cond_8

    .line 356
    iget-boolean v0, p0, Lcom/c/b/bu$d;->a:Z

    if-eqz v0, :cond_7

    .line 357
    const-string v0, "} "

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 369
    :goto_4
    return-void

    .line 330
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/ak$f;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 334
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/ak$f;->h()Lcom/c/b/ak$f$b;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$b;->j:Lcom/c/b/ak$f$b;

    if-ne v0, v1, :cond_2

    .line 336
    invoke-virtual {p1}, Lcom/c/b/ak$f;->w()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 338
    :cond_2
    invoke-virtual {p1}, Lcom/c/b/ak$f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 346
    :cond_3
    const-string v0, " {\n"

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 347
    invoke-virtual {p3}, Lcom/c/b/bu$e;->a()V

    goto :goto_2

    .line 350
    :cond_4
    const-string v0, ": "

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 353
    :pswitch_0
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_3

    :pswitch_1
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_3

    :pswitch_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_3

    :pswitch_3
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_3

    :pswitch_4
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_3

    :pswitch_5
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/bu;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    :pswitch_6
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/c/b/bu;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    :pswitch_7
    const-string v0, "\""

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    iget-boolean v0, p0, Lcom/c/b/bu$d;->b:Z

    if-eqz v0, :cond_5

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lcom/c/b/bu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    const-string v0, "\""

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    :cond_5
    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lcom/c/b/bu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    const-string v2, "\\n"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :pswitch_8
    const-string v0, "\""

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    instance-of v0, p2, Lcom/c/b/f;

    if-eqz v0, :cond_6

    check-cast p2, Lcom/c/b/f;

    invoke-static {p2}, Lcom/c/b/bu;->a(Lcom/c/b/f;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    :goto_6
    const-string v0, "\""

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    :cond_6
    check-cast p2, [B

    invoke-static {p2}, Lcom/c/b/bu;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_6

    :pswitch_9
    check-cast p2, Lcom/c/b/ak$e;

    invoke-virtual {p2}, Lcom/c/b/ak$e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    :pswitch_a
    check-cast p2, Lcom/c/b/bd;

    invoke-direct {p0, p2, p3}, Lcom/c/b/bu$d;->a(Lcom/c/b/bg;Lcom/c/b/bu$e;)V

    goto/16 :goto_3

    .line 359
    :cond_7
    invoke-virtual {p3}, Lcom/c/b/bu$e;->b()V

    .line 360
    const-string v0, "}\n"

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 363
    :cond_8
    iget-boolean v0, p0, Lcom/c/b/bu$d;->a:Z

    if-eqz v0, :cond_9

    .line 364
    const-string v0, " "

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 366
    :cond_9
    const-string v0, "\n"

    invoke-virtual {p3, v0}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 353
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_a
    .end packed-switch
.end method

.method private a(Lcom/c/b/bg;Lcom/c/b/bu$e;)V
    .locals 4

    .prologue
    .line 298
    invoke-interface {p1}, Lcom/c/b/bg;->d_()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 299
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ak$f;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1}, Lcom/c/b/ak$f;->o()Z

    move-result v3

    if-eqz v3, :cond_1

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v1, v3, p2}, Lcom/c/b/bu$d;->a(Lcom/c/b/ak$f;Ljava/lang/Object;Lcom/c/b/bu$e;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0, v1, v0, p2}, Lcom/c/b/bu$d;->a(Lcom/c/b/ak$f;Ljava/lang/Object;Lcom/c/b/bu$e;)V

    goto :goto_0

    .line 301
    :cond_2
    invoke-interface {p1}, Lcom/c/b/bg;->f()Lcom/c/b/by;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/c/b/bu$d;->a(Lcom/c/b/by;Lcom/c/b/bu$e;)V

    .line 302
    return-void
.end method

.method static synthetic a(Lcom/c/b/bu$d;Lcom/c/b/bg;Lcom/c/b/bu$e;)V
    .locals 0

    .prologue
    .line 273
    invoke-direct {p0, p1, p2}, Lcom/c/b/bu$d;->a(Lcom/c/b/bg;Lcom/c/b/bu$e;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/bu$d;Lcom/c/b/by;Lcom/c/b/bu$e;)V
    .locals 0

    .prologue
    .line 273
    invoke-direct {p0, p1, p2}, Lcom/c/b/bu$d;->a(Lcom/c/b/by;Lcom/c/b/bu$e;)V

    return-void
.end method

.method private a(Lcom/c/b/by;Lcom/c/b/bu$e;)V
    .locals 6

    .prologue
    .line 444
    invoke-virtual {p1}, Lcom/c/b/by;->f()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 445
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 446
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/by$b;

    .line 447
    const/4 v4, 0x0

    invoke-virtual {v1}, Lcom/c/b/by$b;->b()Ljava/util/List;

    move-result-object v5

    invoke-direct {p0, v2, v4, v5, p2}, Lcom/c/b/bu$d;->a(IILjava/util/List;Lcom/c/b/bu$e;)V

    .line 449
    const/4 v4, 0x5

    invoke-virtual {v1}, Lcom/c/b/by$b;->c()Ljava/util/List;

    move-result-object v5

    invoke-direct {p0, v2, v4, v5, p2}, Lcom/c/b/bu$d;->a(IILjava/util/List;Lcom/c/b/bu$e;)V

    .line 451
    const/4 v4, 0x1

    invoke-virtual {v1}, Lcom/c/b/by$b;->d()Ljava/util/List;

    move-result-object v5

    invoke-direct {p0, v2, v4, v5, p2}, Lcom/c/b/bu$d;->a(IILjava/util/List;Lcom/c/b/bu$e;)V

    .line 453
    const/4 v4, 0x2

    invoke-virtual {v1}, Lcom/c/b/by$b;->e()Ljava/util/List;

    move-result-object v5

    invoke-direct {p0, v2, v4, v5, p2}, Lcom/c/b/bu$d;->a(IILjava/util/List;Lcom/c/b/bu$e;)V

    .line 455
    invoke-virtual {v1}, Lcom/c/b/by$b;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/c/b/by;

    .line 456
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 457
    iget-boolean v1, p0, Lcom/c/b/bu$d;->a:Z

    if-eqz v1, :cond_1

    .line 458
    const-string v1, " { "

    invoke-virtual {p2, v1}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 463
    :goto_1
    invoke-direct {p0, v2, p2}, Lcom/c/b/bu$d;->a(Lcom/c/b/by;Lcom/c/b/bu$e;)V

    .line 464
    iget-boolean v1, p0, Lcom/c/b/bu$d;->a:Z

    if-eqz v1, :cond_2

    .line 465
    const-string v1, "} "

    invoke-virtual {p2, v1}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 460
    :cond_1
    const-string v1, " {\n"

    invoke-virtual {p2, v1}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    .line 461
    invoke-virtual {p2}, Lcom/c/b/bu$e;->a()V

    goto :goto_1

    .line 467
    :cond_2
    invoke-virtual {p2}, Lcom/c/b/bu$e;->b()V

    .line 468
    const-string v1, "}\n"

    invoke-virtual {p2, v1}, Lcom/c/b/bu$e;->a(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 472
    :cond_3
    return-void
.end method
