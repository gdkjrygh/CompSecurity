.class public final Lb/a/a/a/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/util/LinkedList;

.field private b:Lb/a/a/a/c;

.field private c:Lb/a/a/a/d;

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb/a/a/a/c;

    invoke-direct {v0}, Lb/a/a/a/c;-><init>()V

    iput-object v0, p0, Lb/a/a/a/a;->b:Lb/a/a/a/c;

    const/4 v0, 0x0

    iput-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    const/4 v0, 0x0

    iput v0, p0, Lb/a/a/a/a;->d:I

    return-void
.end method

.method private static a(Ljava/util/LinkedList;)I
    .locals 1

    invoke-virtual {p0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/io/Reader;)Ljava/lang/Object;
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v6, 0x1

    const/4 v5, -0x1

    .line 0
    .line 1000
    iget-object v0, p0, Lb/a/a/a/a;->b:Lb/a/a/a/c;

    invoke-virtual {v0, p1}, Lb/a/a/a/c;->a(Ljava/io/Reader;)V

    .line 2000
    iput-object v1, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    const/4 v0, 0x0

    iput v0, p0, Lb/a/a/a/a;->d:I

    iput-object v1, p0, Lb/a/a/a/a;->a:Ljava/util/LinkedList;

    .line 0
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 3000
    :cond_0
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a;->b:Lb/a/a/a/c;

    invoke-virtual {v0}, Lb/a/a/a/c;->b()Lb/a/a/a/d;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    if-nez v0, :cond_1

    new-instance v0, Lb/a/a/a/d;

    const/4 v1, -0x1

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4}, Lb/a/a/a/d;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    .line 0
    :cond_1
    iget v0, p0, Lb/a/a/a/a;->d:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    :pswitch_0
    iget v0, p0, Lb/a/a/a/a;->d:I

    if-ne v0, v5, :cond_6

    new-instance v0, Lb/a/a/a/b;

    .line 12000
    iget-object v1, p0, Lb/a/a/a/a;->b:Lb/a/a/a/c;

    invoke-virtual {v1}, Lb/a/a/a/c;->a()I

    move-result v1

    .line 0
    const/4 v2, 0x1

    iget-object v3, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    invoke-direct {v0, v1, v2, v3}, Lb/a/a/a/b;-><init>(IILjava/lang/Object;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    throw v0

    :pswitch_1
    :try_start_1
    iget-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget v0, v0, Lb/a/a/a/d;->a:I

    packed-switch v0, :pswitch_data_1

    :pswitch_2
    const/4 v0, -0x1

    iput v0, p0, Lb/a/a/a/a;->d:I

    goto :goto_0

    :pswitch_3
    const/4 v0, 0x1

    iput v0, p0, Lb/a/a/a/a;->d:I

    new-instance v0, Ljava/lang/Integer;

    iget v1, p0, Lb/a/a/a/a;->d:I

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    iget-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget-object v0, v0, Lb/a/a/a/d;->b:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x2

    iput v0, p0, Lb/a/a/a/a;->d:I

    new-instance v0, Ljava/lang/Integer;

    iget v1, p0, Lb/a/a/a/a;->d:I

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 4000
    new-instance v0, Lb/a/a/c;

    invoke-direct {v0}, Lb/a/a/c;-><init>()V

    .line 0
    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_5
    const/4 v0, 0x3

    iput v0, p0, Lb/a/a/a/a;->d:I

    new-instance v0, Ljava/lang/Integer;

    iget v1, p0, Lb/a/a/a/a;->d:I

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 5000
    new-instance v0, Lb/a/a/a;

    invoke-direct {v0}, Lb/a/a/a;-><init>()V

    .line 0
    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget v0, v0, Lb/a/a/a/d;->a:I

    if-ne v0, v5, :cond_2

    invoke-virtual {v3}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Lb/a/a/a/b;

    .line 6000
    iget-object v1, p0, Lb/a/a/a/a;->b:Lb/a/a/a/c;

    invoke-virtual {v1}, Lb/a/a/a/c;->a()I

    move-result v1

    .line 0
    const/4 v2, 0x1

    iget-object v3, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    invoke-direct {v0, v1, v2, v3}, Lb/a/a/a/b;-><init>(IILjava/lang/Object;)V

    throw v0

    :pswitch_7
    iget-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget v0, v0, Lb/a/a/a/d;->a:I

    packed-switch v0, :pswitch_data_2

    :pswitch_8
    const/4 v0, -0x1

    iput v0, p0, Lb/a/a/a/a;->d:I

    goto/16 :goto_0

    :pswitch_9
    iget-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget-object v0, v0, Lb/a/a/a/d;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget-object v0, v0, Lb/a/a/a/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    const/4 v0, 0x4

    iput v0, p0, Lb/a/a/a/a;->d:I

    new-instance v0, Ljava/lang/Integer;

    iget v1, p0, Lb/a/a/a/a;->d:I

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_3
    const/4 v0, -0x1

    iput v0, p0, Lb/a/a/a/a;->d:I

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-le v0, v6, :cond_4

    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    invoke-static {v2}, Lb/a/a/a/a;->a(Ljava/util/LinkedList;)I

    move-result v0

    iput v0, p0, Lb/a/a/a/a;->d:I

    goto/16 :goto_0

    :cond_4
    const/4 v0, 0x1

    iput v0, p0, Lb/a/a/a/a;->d:I

    goto/16 :goto_0

    :pswitch_b
    iget-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget v0, v0, Lb/a/a/a/d;->a:I

    packed-switch v0, :pswitch_data_3

    :pswitch_c
    const/4 v0, -0x1

    iput v0, p0, Lb/a/a/a/a;->d:I

    goto/16 :goto_0

    :pswitch_d
    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    iget-object v4, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget-object v4, v4, Lb/a/a/a/d;->b:Ljava/lang/Object;

    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Lb/a/a/a/a;->a(Ljava/util/LinkedList;)I

    move-result v0

    iput v0, p0, Lb/a/a/a/a;->d:I

    goto/16 :goto_0

    :pswitch_e
    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 7000
    new-instance v4, Lb/a/a/a;

    invoke-direct {v4}, Lb/a/a/a;-><init>()V

    .line 0
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, p0, Lb/a/a/a/a;->d:I

    new-instance v0, Ljava/lang/Integer;

    iget v1, p0, Lb/a/a/a/a;->d:I

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_f
    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 8000
    new-instance v4, Lb/a/a/c;

    invoke-direct {v4}, Lb/a/a/c;-><init>()V

    .line 0
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, p0, Lb/a/a/a/a;->d:I

    new-instance v0, Ljava/lang/Integer;

    iget v1, p0, Lb/a/a/a/a;->d:I

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_10
    iget-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget v0, v0, Lb/a/a/a/d;->a:I

    packed-switch v0, :pswitch_data_4

    :pswitch_11
    const/4 v0, -0x1

    iput v0, p0, Lb/a/a/a/a;->d:I

    goto/16 :goto_0

    :pswitch_12
    invoke-virtual {v3}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget-object v1, v1, Lb/a/a/a/d;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_13
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-le v0, v6, :cond_5

    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    invoke-static {v2}, Lb/a/a/a/a;->a(Ljava/util/LinkedList;)I

    move-result v0

    iput v0, p0, Lb/a/a/a/a;->d:I

    goto/16 :goto_0

    :cond_5
    const/4 v0, 0x1

    iput v0, p0, Lb/a/a/a/a;->d:I

    goto/16 :goto_0

    :pswitch_14
    invoke-virtual {v3}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 9000
    new-instance v1, Lb/a/a/c;

    invoke-direct {v1}, Lb/a/a/c;-><init>()V

    .line 0
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x2

    iput v0, p0, Lb/a/a/a/a;->d:I

    new-instance v0, Ljava/lang/Integer;

    iget v4, p0, Lb/a/a/a/a;->d:I

    invoke-direct {v0, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {v3, v1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_15
    invoke-virtual {v3}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 10000
    new-instance v1, Lb/a/a/a;

    invoke-direct {v1}, Lb/a/a/a;-><init>()V

    .line 0
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x3

    iput v0, p0, Lb/a/a/a/a;->d:I

    new-instance v0, Ljava/lang/Integer;

    iget v4, p0, Lb/a/a/a/a;->d:I

    invoke-direct {v0, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {v3, v1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_16
    new-instance v0, Lb/a/a/a/b;

    .line 11000
    iget-object v1, p0, Lb/a/a/a/a;->b:Lb/a/a/a/c;

    invoke-virtual {v1}, Lb/a/a/a/c;->a()I

    move-result v1

    .line 0
    const/4 v2, 0x1

    iget-object v3, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    invoke-direct {v0, v1, v2, v3}, Lb/a/a/a/b;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_6
    iget-object v0, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    iget v0, v0, Lb/a/a/a/d;->a:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v0, v5, :cond_0

    new-instance v0, Lb/a/a/a/b;

    .line 13000
    iget-object v1, p0, Lb/a/a/a/a;->b:Lb/a/a/a/c;

    invoke-virtual {v1}, Lb/a/a/a/c;->a()I

    move-result v1

    .line 0
    iget-object v2, p0, Lb/a/a/a/a;->c:Lb/a/a/a/d;

    invoke-direct {v0, v1, v6, v2}, Lb/a/a/a/b;-><init>(IILjava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_16
        :pswitch_1
        :pswitch_6
        :pswitch_7
        :pswitch_10
        :pswitch_b
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_5
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_8
        :pswitch_8
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_d
        :pswitch_f
        :pswitch_c
        :pswitch_e
        :pswitch_c
        :pswitch_c
        :pswitch_0
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_12
        :pswitch_14
        :pswitch_11
        :pswitch_15
        :pswitch_13
        :pswitch_0
    .end packed-switch
.end method
