.class final Lcom/google/a/b/a/ar;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/am",
        "<",
        "Lcom/google/a/x;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 633
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method

.method private a(Lcom/google/a/d/f;Lcom/google/a/x;)V
    .locals 3

    .prologue
    .line 672
    if-eqz p2, :cond_0

    .line 1068
    instance-of v0, p2, Lcom/google/a/z;

    .line 672
    if-eqz v0, :cond_1

    .line 673
    :cond_0
    invoke-virtual {p1}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    .line 697
    :goto_0
    return-void

    .line 2058
    :cond_1
    instance-of v0, p2, Lcom/google/a/ad;

    .line 674
    if-eqz v0, :cond_4

    .line 675
    invoke-virtual {p2}, Lcom/google/a/x;->k()Lcom/google/a/ad;

    move-result-object v0

    .line 676
    invoke-virtual {v0}, Lcom/google/a/ad;->l()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 677
    invoke-virtual {v0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->a(Ljava/lang/Number;)Lcom/google/a/d/f;

    goto :goto_0

    .line 678
    :cond_2
    invoke-virtual {v0}, Lcom/google/a/ad;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 679
    invoke-virtual {v0}, Lcom/google/a/ad;->h()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->a(Z)Lcom/google/a/d/f;

    goto :goto_0

    .line 681
    :cond_3
    invoke-virtual {v0}, Lcom/google/a/ad;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->b(Ljava/lang/String;)Lcom/google/a/d/f;

    goto :goto_0

    .line 3040
    :cond_4
    instance-of v0, p2, Lcom/google/a/u;

    .line 684
    if-eqz v0, :cond_6

    .line 685
    invoke-virtual {p1}, Lcom/google/a/d/f;->b()Lcom/google/a/d/f;

    .line 686
    invoke-virtual {p2}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/a/u;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/a/x;

    .line 687
    invoke-direct {p0, p1, v0}, Lcom/google/a/b/a/ar;->a(Lcom/google/a/d/f;Lcom/google/a/x;)V

    goto :goto_1

    .line 689
    :cond_5
    invoke-virtual {p1}, Lcom/google/a/d/f;->c()Lcom/google/a/d/f;

    goto :goto_0

    .line 3049
    :cond_6
    instance-of v0, p2, Lcom/google/a/aa;

    .line 691
    if-eqz v0, :cond_8

    .line 692
    invoke-virtual {p1}, Lcom/google/a/d/f;->d()Lcom/google/a/d/f;

    .line 693
    invoke-virtual {p2}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/a/aa;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 694
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/google/a/d/f;->a(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 695
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/a/x;

    invoke-direct {p0, p1, v0}, Lcom/google/a/b/a/ar;->a(Lcom/google/a/d/f;Lcom/google/a/x;)V

    goto :goto_2

    .line 697
    :cond_7
    invoke-virtual {p1}, Lcom/google/a/d/f;->e()Lcom/google/a/d/f;

    goto/16 :goto_0

    .line 700
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Couldn\'t write "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private b(Lcom/google/a/d/a;)Lcom/google/a/x;
    .locals 3

    .prologue
    .line 635
    sget-object v0, Lcom/google/a/b/a/az;->a:[I

    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/a/d/e;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 667
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 637
    :pswitch_0
    new-instance v0, Lcom/google/a/ad;

    invoke-virtual {p1}, Lcom/google/a/d/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/a/ad;-><init>(Ljava/lang/String;)V

    .line 661
    :goto_0
    return-object v0

    .line 639
    :pswitch_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->h()Ljava/lang/String;

    move-result-object v1

    .line 640
    new-instance v0, Lcom/google/a/ad;

    new-instance v2, Lcom/google/a/b/r;

    invoke-direct {v2, v1}, Lcom/google/a/b/r;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v2}, Lcom/google/a/ad;-><init>(Ljava/lang/Number;)V

    goto :goto_0

    .line 642
    :pswitch_2
    new-instance v0, Lcom/google/a/ad;

    invoke-virtual {p1}, Lcom/google/a/d/a;->i()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/a/ad;-><init>(Ljava/lang/Boolean;)V

    goto :goto_0

    .line 644
    :pswitch_3
    invoke-virtual {p1}, Lcom/google/a/d/a;->j()V

    .line 645
    sget-object v0, Lcom/google/a/z;->a:Lcom/google/a/z;

    goto :goto_0

    .line 647
    :pswitch_4
    new-instance v0, Lcom/google/a/u;

    invoke-direct {v0}, Lcom/google/a/u;-><init>()V

    .line 648
    invoke-virtual {p1}, Lcom/google/a/d/a;->a()V

    .line 649
    :goto_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 650
    invoke-direct {p0, p1}, Lcom/google/a/b/a/ar;->b(Lcom/google/a/d/a;)Lcom/google/a/x;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/a/u;->a(Lcom/google/a/x;)V

    goto :goto_1

    .line 652
    :cond_0
    invoke-virtual {p1}, Lcom/google/a/d/a;->b()V

    goto :goto_0

    .line 655
    :pswitch_5
    new-instance v0, Lcom/google/a/aa;

    invoke-direct {v0}, Lcom/google/a/aa;-><init>()V

    .line 656
    invoke-virtual {p1}, Lcom/google/a/d/a;->c()V

    .line 657
    :goto_2
    invoke-virtual {p1}, Lcom/google/a/d/a;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 658
    invoke-virtual {p1}, Lcom/google/a/d/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/google/a/b/a/ar;->b(Lcom/google/a/d/a;)Lcom/google/a/x;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/a/aa;->a(Ljava/lang/String;Lcom/google/a/x;)V

    goto :goto_2

    .line 660
    :cond_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->d()V

    goto :goto_0

    .line 635
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 633
    invoke-direct {p0, p1}, Lcom/google/a/b/a/ar;->b(Lcom/google/a/d/a;)Lcom/google/a/x;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 633
    check-cast p2, Lcom/google/a/x;

    invoke-direct {p0, p1, p2}, Lcom/google/a/b/a/ar;->a(Lcom/google/a/d/f;Lcom/google/a/x;)V

    return-void
.end method
