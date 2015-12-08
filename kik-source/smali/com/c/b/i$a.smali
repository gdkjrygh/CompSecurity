.class public final Lcom/c/b/i$a;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$a$a;,
        Lcom/c/b/i$a$d;,
        Lcom/c/b/i$a$e;,
        Lcom/c/b/i$a$b;,
        Lcom/c/b/i$a$c;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final s:Lcom/c/b/i$a;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private h:Ljava/util/List;

.field private i:Ljava/util/List;

.field private j:Ljava/util/List;

.field private k:Ljava/util/List;

.field private l:Ljava/util/List;

.field private m:Ljava/util/List;

.field private n:Lcom/c/b/i$s;

.field private o:Ljava/util/List;

.field private p:Lcom/c/b/az;

.field private q:B

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 8934
    new-instance v0, Lcom/c/b/i$a;

    invoke-direct {v0}, Lcom/c/b/i$a;-><init>()V

    sput-object v0, Lcom/c/b/i$a;->s:Lcom/c/b/i$a;

    .line 8941
    new-instance v0, Lcom/c/b/k;

    invoke-direct {v0}, Lcom/c/b/k;-><init>()V

    sput-object v0, Lcom/c/b/i$a;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 4685
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 6241
    iput-byte v0, p0, Lcom/c/b/i$a;->q:B

    .line 6316
    iput v0, p0, Lcom/c/b/i$a;->r:I

    .line 4686
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$a;->g:Ljava/lang/Object;

    .line 4687
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    .line 4688
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    .line 4689
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    .line 4690
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    .line 4691
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    .line 4692
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    .line 4693
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    .line 4694
    sget-object v0, Lcom/c/b/ay;->a:Lcom/c/b/az;

    iput-object v0, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    .line 4695
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 4683
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 6241
    iput-byte v0, p0, Lcom/c/b/i$a;->q:B

    .line 6316
    iput v0, p0, Lcom/c/b/i$a;->r:I

    .line 4684
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 4677
    invoke-direct {p0, p1}, Lcom/c/b/i$a;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 12

    .prologue
    const/16 v10, 0x20

    const/16 v9, 0x10

    const/16 v8, 0x8

    const/4 v7, 0x4

    const/4 v6, 0x2

    .line 4705
    invoke-direct {p0}, Lcom/c/b/i$a;-><init>()V

    .line 4706
    const/4 v1, 0x0

    .line 4707
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v4

    .line 4710
    const/4 v0, 0x0

    move v3, v0

    .line 4711
    :goto_0
    if-nez v3, :cond_10

    .line 4712
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v0

    .line 4713
    sparse-switch v0, :sswitch_data_0

    .line 4718
    invoke-virtual {p0, p1, v4, p2, v0}, Lcom/c/b/i$a;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v0

    if-nez v0, :cond_1b

    .line 4720
    const/4 v0, 0x1

    move v3, v0

    goto :goto_0

    .line 4715
    :sswitch_0
    const/4 v0, 0x1

    move v3, v0

    .line 4716
    goto :goto_0

    .line 4725
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 4726
    iget v2, p0, Lcom/c/b/i$a;->f:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/c/b/i$a;->f:I

    .line 4727
    iput-object v0, p0, Lcom/c/b/i$a;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 4810
    :catch_0
    move-exception v0

    .line 4811
    :goto_1
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4817
    :catchall_0
    move-exception v0

    :goto_2
    and-int/lit8 v2, v1, 0x2

    if-ne v2, v6, :cond_0

    .line 4818
    iget-object v2, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    .line 4820
    :cond_0
    and-int/lit8 v2, v1, 0x8

    if-ne v2, v8, :cond_1

    .line 4821
    iget-object v2, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    .line 4823
    :cond_1
    and-int/lit8 v2, v1, 0x10

    if-ne v2, v9, :cond_2

    .line 4824
    iget-object v2, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    .line 4826
    :cond_2
    and-int/lit8 v2, v1, 0x20

    if-ne v2, v10, :cond_3

    .line 4827
    iget-object v2, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    .line 4829
    :cond_3
    and-int/lit8 v2, v1, 0x4

    if-ne v2, v7, :cond_4

    .line 4830
    iget-object v2, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    .line 4832
    :cond_4
    and-int/lit8 v2, v1, 0x40

    const/16 v3, 0x40

    if-ne v2, v3, :cond_5

    .line 4833
    iget-object v2, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    .line 4835
    :cond_5
    and-int/lit16 v2, v1, 0x100

    const/16 v3, 0x100

    if-ne v2, v3, :cond_6

    .line 4836
    iget-object v2, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    .line 4838
    :cond_6
    and-int/lit16 v1, v1, 0x200

    const/16 v2, 0x200

    if-ne v1, v2, :cond_7

    .line 4839
    iget-object v1, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    invoke-interface {v1}, Lcom/c/b/az;->e()Lcom/c/b/az;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    .line 4841
    :cond_7
    invoke-virtual {v4}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$a;->e:Lcom/c/b/by;

    .line 4842
    invoke-virtual {p0}, Lcom/c/b/i$a;->L()V

    .line 4817
    throw v0

    .line 4731
    :sswitch_2
    and-int/lit8 v0, v1, 0x2

    if-eq v0, v6, :cond_8

    .line 4732
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    .line 4733
    or-int/lit8 v1, v1, 0x2

    .line 4735
    :cond_8
    iget-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    sget-object v2, Lcom/c/b/i$k;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v2, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    .line 4812
    :catch_1
    move-exception v0

    .line 4813
    :goto_3
    :try_start_3
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 4739
    :sswitch_3
    and-int/lit8 v0, v1, 0x8

    if-eq v0, v8, :cond_9

    .line 4740
    :try_start_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    .line 4741
    or-int/lit8 v1, v1, 0x8

    .line 4743
    :cond_9
    iget-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    sget-object v2, Lcom/c/b/i$a;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v2, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 4747
    :sswitch_4
    and-int/lit8 v0, v1, 0x10

    if-eq v0, v9, :cond_a

    .line 4748
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    .line 4749
    or-int/lit8 v1, v1, 0x10

    .line 4751
    :cond_a
    iget-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    sget-object v2, Lcom/c/b/i$c;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v2, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 4755
    :sswitch_5
    and-int/lit8 v0, v1, 0x20

    if-eq v0, v10, :cond_b

    .line 4756
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    .line 4757
    or-int/lit8 v1, v1, 0x20

    .line 4759
    :cond_b
    iget-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    sget-object v2, Lcom/c/b/i$a$b;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v2, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 4763
    :sswitch_6
    and-int/lit8 v0, v1, 0x4

    if-eq v0, v7, :cond_c

    .line 4764
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    .line 4765
    or-int/lit8 v1, v1, 0x4

    .line 4767
    :cond_c
    iget-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    sget-object v2, Lcom/c/b/i$k;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v2, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 4771
    :sswitch_7
    const/4 v0, 0x0

    .line 4772
    iget v2, p0, Lcom/c/b/i$a;->f:I

    and-int/lit8 v2, v2, 0x2

    if-ne v2, v6, :cond_1a

    .line 4773
    iget-object v0, p0, Lcom/c/b/i$a;->n:Lcom/c/b/i$s;

    invoke-virtual {v0}, Lcom/c/b/i$s;->p()Lcom/c/b/i$s$a;

    move-result-object v0

    move-object v2, v0

    .line 4775
    :goto_4
    sget-object v0, Lcom/c/b/i$s;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v0, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$s;

    iput-object v0, p0, Lcom/c/b/i$a;->n:Lcom/c/b/i$s;

    .line 4776
    if-eqz v2, :cond_d

    .line 4777
    iget-object v0, p0, Lcom/c/b/i$a;->n:Lcom/c/b/i$s;

    invoke-virtual {v2, v0}, Lcom/c/b/i$s$a;->a(Lcom/c/b/i$s;)Lcom/c/b/i$s$a;

    .line 4778
    invoke-virtual {v2}, Lcom/c/b/i$s$a;->g()Lcom/c/b/i$s;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->n:Lcom/c/b/i$s;

    .line 4780
    :cond_d
    iget v0, p0, Lcom/c/b/i$a;->f:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$a;->f:I

    goto/16 :goto_0

    .line 4784
    :sswitch_8
    and-int/lit8 v0, v1, 0x40

    const/16 v2, 0x40

    if-eq v0, v2, :cond_e

    .line 4785
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    .line 4786
    or-int/lit8 v1, v1, 0x40

    .line 4788
    :cond_e
    iget-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    sget-object v2, Lcom/c/b/i$y;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v2, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 4792
    :sswitch_9
    and-int/lit16 v0, v1, 0x100

    const/16 v2, 0x100

    if-eq v0, v2, :cond_f

    .line 4793
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    .line 4794
    or-int/lit16 v1, v1, 0x100

    .line 4796
    :cond_f
    iget-object v0, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    sget-object v2, Lcom/c/b/i$a$d;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v2, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 4800
    :sswitch_a
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v2

    .line 4801
    and-int/lit16 v0, v1, 0x200

    const/16 v5, 0x200

    if-eq v0, v5, :cond_19

    .line 4802
    new-instance v0, Lcom/c/b/ay;

    invoke-direct {v0}, Lcom/c/b/ay;-><init>()V

    iput-object v0, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 4803
    or-int/lit16 v0, v1, 0x200

    .line 4805
    :goto_5
    :try_start_5
    iget-object v1, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    invoke-interface {v1, v2}, Lcom/c/b/az;->a(Lcom/c/b/f;)V
    :try_end_5
    .catch Lcom/c/b/av; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_6
    move v1, v0

    .line 4806
    goto/16 :goto_0

    .line 4817
    :cond_10
    and-int/lit8 v0, v1, 0x2

    if-ne v0, v6, :cond_11

    .line 4818
    iget-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    .line 4820
    :cond_11
    and-int/lit8 v0, v1, 0x8

    if-ne v0, v8, :cond_12

    .line 4821
    iget-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    .line 4823
    :cond_12
    and-int/lit8 v0, v1, 0x10

    if-ne v0, v9, :cond_13

    .line 4824
    iget-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    .line 4826
    :cond_13
    and-int/lit8 v0, v1, 0x20

    if-ne v0, v10, :cond_14

    .line 4827
    iget-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    .line 4829
    :cond_14
    and-int/lit8 v0, v1, 0x4

    if-ne v0, v7, :cond_15

    .line 4830
    iget-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    .line 4832
    :cond_15
    and-int/lit8 v0, v1, 0x40

    const/16 v2, 0x40

    if-ne v0, v2, :cond_16

    .line 4833
    iget-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    .line 4835
    :cond_16
    and-int/lit16 v0, v1, 0x100

    const/16 v2, 0x100

    if-ne v0, v2, :cond_17

    .line 4836
    iget-object v0, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    .line 4838
    :cond_17
    and-int/lit16 v0, v1, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_18

    .line 4839
    iget-object v0, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->e()Lcom/c/b/az;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    .line 4841
    :cond_18
    invoke-virtual {v4}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a;->e:Lcom/c/b/by;

    .line 4842
    invoke-virtual {p0}, Lcom/c/b/i$a;->L()V

    .line 4843
    return-void

    .line 4817
    :catchall_1
    move-exception v1

    move-object v11, v1

    move v1, v0

    move-object v0, v11

    goto/16 :goto_2

    .line 4812
    :catch_2
    move-exception v1

    move-object v11, v1

    move v1, v0

    move-object v0, v11

    goto/16 :goto_3

    .line 4810
    :catch_3
    move-exception v1

    move-object v11, v1

    move v1, v0

    move-object v0, v11

    goto/16 :goto_1

    :cond_19
    move v0, v1

    goto/16 :goto_5

    :cond_1a
    move-object v2, v0

    goto/16 :goto_4

    :cond_1b
    move v0, v1

    goto/16 :goto_6

    .line 4713
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
        0x32 -> :sswitch_6
        0x3a -> :sswitch_7
        0x42 -> :sswitch_8
        0x4a -> :sswitch_9
        0x52 -> :sswitch_a
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 4677
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$a;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$a;I)I
    .locals 0

    .prologue
    .line 4677
    iput p1, p0, Lcom/c/b/i$a;->f:I

    return p1
.end method

.method static synthetic a(Lcom/c/b/i$a;Lcom/c/b/az;)Lcom/c/b/az;
    .locals 0

    .prologue
    .line 4677
    iput-object p1, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$a;Lcom/c/b/i$s;)Lcom/c/b/i$s;
    .locals 0

    .prologue
    .line 4677
    iput-object p1, p0, Lcom/c/b/i$a;->n:Lcom/c/b/i$s;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 4677
    iget-object v0, p0, Lcom/c/b/i$a;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 4677
    iput-object p1, p0, Lcom/c/b/i$a;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 4677
    iput-object p1, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 4677
    iget-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/i$a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 4677
    iput-object p1, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c(Lcom/c/b/i$a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 4677
    iget-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/c/b/i$a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 4677
    iput-object p1, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d(Lcom/c/b/i$a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 4677
    iget-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lcom/c/b/i$a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 4677
    iput-object p1, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    return-object p1
.end method

.method static synthetic e(Lcom/c/b/i$a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 4677
    iget-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/c/b/i$a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 4677
    iput-object p1, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    return-object p1
.end method

.method static synthetic f(Lcom/c/b/i$a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 4677
    iget-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f(Lcom/c/b/i$a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 4677
    iput-object p1, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    return-object p1
.end method

.method static synthetic g(Lcom/c/b/i$a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 4677
    iget-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic g(Lcom/c/b/i$a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 4677
    iput-object p1, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    return-object p1
.end method

.method static synthetic h(Lcom/c/b/i$a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 4677
    iget-object v0, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    return-object v0
.end method

.method static synthetic i(Lcom/c/b/i$a;)Lcom/c/b/az;
    .locals 1

    .prologue
    .line 4677
    iget-object v0, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    return-object v0
.end method

.method public static r()Lcom/c/b/i$a$a;
    .locals 1

    .prologue
    .line 6428
    sget-object v0, Lcom/c/b/i$a;->s:Lcom/c/b/i$a;

    invoke-direct {v0}, Lcom/c/b/i$a;->y()Lcom/c/b/i$a$a;

    move-result-object v0

    return-object v0
.end method

.method public static s()Lcom/c/b/i$a;
    .locals 1

    .prologue
    .line 8938
    sget-object v0, Lcom/c/b/i$a;->s:Lcom/c/b/i$a;

    return-object v0
.end method

.method private x()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 5914
    iget-object v0, p0, Lcom/c/b/i$a;->g:Ljava/lang/Object;

    .line 5915
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 5916
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 5919
    iput-object v0, p0, Lcom/c/b/i$a;->g:Ljava/lang/Object;

    .line 5922
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private y()Lcom/c/b/i$a$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 6434
    sget-object v0, Lcom/c/b/i$a;->s:Lcom/c/b/i$a;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$a$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$a$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$a$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$a$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$a$a;->a(Lcom/c/b/i$a;)Lcom/c/b/i$a$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 4677
    new-instance v0, Lcom/c/b/i$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$a$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(I)Lcom/c/b/i$k;
    .locals 1

    .prologue
    .line 5951
    iget-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$k;

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 6283
    iget v0, p0, Lcom/c/b/i$a;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 6284
    invoke-direct {p0}, Lcom/c/b/i$a;->x()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    :cond_0
    move v1, v2

    .line 6286
    :goto_0
    iget-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 6287
    iget-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v4, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 6286
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    move v1, v2

    .line 6289
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 6290
    const/4 v3, 0x3

    iget-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 6289
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    move v1, v2

    .line 6292
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 6293
    const/4 v3, 0x4

    iget-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 6292
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_3
    move v1, v2

    .line 6295
    :goto_3
    iget-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 6296
    const/4 v3, 0x5

    iget-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 6295
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :cond_4
    move v1, v2

    .line 6298
    :goto_4
    iget-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 6299
    const/4 v3, 0x6

    iget-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 6298
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    .line 6301
    :cond_5
    iget v0, p0, Lcom/c/b/i$a;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v4, :cond_6

    .line 6302
    const/4 v0, 0x7

    invoke-virtual {p0}, Lcom/c/b/i$a;->q()Lcom/c/b/i$s;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    :cond_6
    move v1, v2

    .line 6304
    :goto_5
    iget-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_7

    .line 6305
    const/16 v3, 0x8

    iget-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 6304
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_5

    :cond_7
    move v1, v2

    .line 6307
    :goto_6
    iget-object v0, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_8

    .line 6308
    const/16 v3, 0x9

    iget-object v0, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 6307
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    .line 6310
    :cond_8
    :goto_7
    iget-object v0, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->size()I

    move-result v0

    if-ge v2, v0, :cond_9

    .line 6311
    const/16 v0, 0xa

    iget-object v1, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    invoke-interface {v1, v2}, Lcom/c/b/az;->a(I)Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 6310
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 6313
    :cond_9
    iget-object v0, p0, Lcom/c/b/i$a;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 6314
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 6243
    iget-byte v0, p0, Lcom/c/b/i$a;->q:B

    .line 6244
    if-ne v0, v2, :cond_1

    move v1, v2

    .line 6278
    :cond_0
    :goto_0
    return v1

    .line 6245
    :cond_1
    if-eqz v0, :cond_0

    move v0, v1

    .line 6247
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$a;->j()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 6248
    invoke-virtual {p0, v0}, Lcom/c/b/i$a;->a(I)Lcom/c/b/i$k;

    move-result-object v3

    invoke-virtual {v3}, Lcom/c/b/i$k;->a()Z

    move-result v3

    if-nez v3, :cond_2

    .line 6249
    iput-byte v1, p0, Lcom/c/b/i$a;->q:B

    goto :goto_0

    .line 6247
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    move v0, v1

    .line 6253
    :goto_2
    invoke-virtual {p0}, Lcom/c/b/i$a;->k()I

    move-result v3

    if-ge v0, v3, :cond_5

    .line 6254
    invoke-virtual {p0, v0}, Lcom/c/b/i$a;->b(I)Lcom/c/b/i$k;

    move-result-object v3

    invoke-virtual {v3}, Lcom/c/b/i$k;->a()Z

    move-result v3

    if-nez v3, :cond_4

    .line 6255
    iput-byte v1, p0, Lcom/c/b/i$a;->q:B

    goto :goto_0

    .line 6253
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    move v0, v1

    .line 6259
    :goto_3
    invoke-virtual {p0}, Lcom/c/b/i$a;->l()I

    move-result v3

    if-ge v0, v3, :cond_7

    .line 6260
    invoke-virtual {p0, v0}, Lcom/c/b/i$a;->c(I)Lcom/c/b/i$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/c/b/i$a;->a()Z

    move-result v3

    if-nez v3, :cond_6

    .line 6261
    iput-byte v1, p0, Lcom/c/b/i$a;->q:B

    goto :goto_0

    .line 6259
    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_7
    move v0, v1

    .line 6265
    :goto_4
    invoke-virtual {p0}, Lcom/c/b/i$a;->m()I

    move-result v3

    if-ge v0, v3, :cond_9

    .line 6266
    invoke-virtual {p0, v0}, Lcom/c/b/i$a;->d(I)Lcom/c/b/i$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/c/b/i$c;->a()Z

    move-result v3

    if-nez v3, :cond_8

    .line 6267
    iput-byte v1, p0, Lcom/c/b/i$a;->q:B

    goto :goto_0

    .line 6265
    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 6271
    :cond_9
    invoke-virtual {p0}, Lcom/c/b/i$a;->p()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 6272
    invoke-virtual {p0}, Lcom/c/b/i$a;->q()Lcom/c/b/i$s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$s;->a()Z

    move-result v0

    if-nez v0, :cond_a

    .line 6273
    iput-byte v1, p0, Lcom/c/b/i$a;->q:B

    goto :goto_0

    .line 6277
    :cond_a
    iput-byte v2, p0, Lcom/c/b/i$a;->q:B

    move v1, v2

    .line 6278
    goto :goto_0
.end method

.method public final b()I
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 6318
    iget v0, p0, Lcom/c/b/i$a;->r:I

    .line 6319
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 6369
    :goto_0
    return v0

    .line 6322
    :cond_0
    iget v0, p0, Lcom/c/b/i$a;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_a

    .line 6323
    invoke-direct {p0}, Lcom/c/b/i$a;->x()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    :goto_1
    move v2, v1

    move v3, v0

    .line 6326
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 6327
    iget-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v5, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v3, v0

    .line 6326
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    :cond_1
    move v2, v1

    .line 6330
    :goto_3
    iget-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 6331
    const/4 v4, 0x3

    iget-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v4, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v3, v0

    .line 6330
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_3

    :cond_2
    move v2, v1

    .line 6334
    :goto_4
    iget-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 6335
    const/4 v4, 0x4

    iget-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v4, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v3, v0

    .line 6334
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    :cond_3
    move v2, v1

    .line 6338
    :goto_5
    iget-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 6339
    const/4 v4, 0x5

    iget-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v4, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v3, v0

    .line 6338
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_5

    :cond_4
    move v2, v1

    .line 6342
    :goto_6
    iget-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 6343
    const/4 v4, 0x6

    iget-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v4, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v3, v0

    .line 6342
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_6

    .line 6346
    :cond_5
    iget v0, p0, Lcom/c/b/i$a;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v5, :cond_6

    .line 6347
    const/4 v0, 0x7

    invoke-virtual {p0}, Lcom/c/b/i$a;->q()Lcom/c/b/i$s;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v3, v0

    :cond_6
    move v2, v1

    .line 6350
    :goto_7
    iget-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_7

    .line 6351
    const/16 v4, 0x8

    iget-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v4, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v3, v0

    .line 6350
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_7

    :cond_7
    move v2, v1

    .line 6354
    :goto_8
    iget-object v0, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_8

    .line 6355
    const/16 v4, 0x9

    iget-object v0, p0, Lcom/c/b/i$a;->o:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v4, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v3, v0

    .line 6354
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_8

    :cond_8
    move v0, v1

    .line 6360
    :goto_9
    iget-object v2, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    invoke-interface {v2}, Lcom/c/b/az;->size()I

    move-result v2

    if-ge v1, v2, :cond_9

    .line 6361
    iget-object v2, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    invoke-interface {v2, v1}, Lcom/c/b/az;->a(I)Lcom/c/b/f;

    move-result-object v2

    invoke-static {v2}, Lcom/c/b/h;->b(Lcom/c/b/f;)I

    move-result v2

    add-int/2addr v0, v2

    .line 6360
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    .line 6364
    :cond_9
    add-int/2addr v0, v3

    .line 6365
    iget-object v1, p0, Lcom/c/b/i$a;->p:Lcom/c/b/az;

    invoke-interface {v1}, Lcom/c/b/bm;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    .line 6367
    iget-object v1, p0, Lcom/c/b/i$a;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 6368
    iput v0, p0, Lcom/c/b/i$a;->r:I

    goto/16 :goto_0

    :cond_a
    move v0, v1

    goto/16 :goto_1
.end method

.method public final b(I)Lcom/c/b/i$k;
    .locals 1

    .prologue
    .line 5986
    iget-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$k;

    return-object v0
.end method

.method public final c(I)Lcom/c/b/i$a;
    .locals 1

    .prologue
    .line 6021
    iget-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$a;

    return-object v0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 4852
    invoke-static {}, Lcom/c/b/i;->e()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$a;

    const-class v2, Lcom/c/b/i$a$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final d(I)Lcom/c/b/i$c;
    .locals 1

    .prologue
    .line 6056
    iget-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$c;

    return-object v0
.end method

.method public final e(I)Lcom/c/b/i$y;
    .locals 1

    .prologue
    .line 6126
    iget-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$y;

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 4700
    iget-object v0, p0, Lcom/c/b/i$a;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 5890
    iget v1, p0, Lcom/c/b/i$a;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Ljava/lang/String;
    .locals 2

    .prologue
    .line 5896
    iget-object v0, p0, Lcom/c/b/i$a;->g:Ljava/lang/Object;

    .line 5897
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 5898
    check-cast v0, Ljava/lang/String;

    .line 5906
    :goto_0
    return-object v0

    .line 5900
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 5902
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 5903
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5904
    iput-object v1, p0, Lcom/c/b/i$a;->g:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 5906
    goto :goto_0
.end method

.method public final j()I
    .locals 1

    .prologue
    .line 5945
    iget-object v0, p0, Lcom/c/b/i$a;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final k()I
    .locals 1

    .prologue
    .line 5980
    iget-object v0, p0, Lcom/c/b/i$a;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final l()I
    .locals 1

    .prologue
    .line 6015
    iget-object v0, p0, Lcom/c/b/i$a;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final m()I
    .locals 1

    .prologue
    .line 6050
    iget-object v0, p0, Lcom/c/b/i$a;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final n()Ljava/util/List;
    .locals 1

    .prologue
    .line 6072
    iget-object v0, p0, Lcom/c/b/i$a;->l:Ljava/util/List;

    return-object v0
.end method

.method public final o()I
    .locals 1

    .prologue
    .line 6120
    iget-object v0, p0, Lcom/c/b/i$a;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final p()Z
    .locals 2

    .prologue
    .line 6142
    iget v0, p0, Lcom/c/b/i$a;->f:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final q()Lcom/c/b/i$s;
    .locals 1

    .prologue
    .line 6148
    iget-object v0, p0, Lcom/c/b/i$a;->n:Lcom/c/b/i$s;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$s;->q()Lcom/c/b/i$s;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/i$a;->n:Lcom/c/b/i$s;

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 8966
    sget-object v0, Lcom/c/b/i$a;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 4677
    sget-object v0, Lcom/c/b/i$a;->s:Lcom/c/b/i$a;

    invoke-direct {v0}, Lcom/c/b/i$a;->y()Lcom/c/b/i$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 4677
    invoke-direct {p0}, Lcom/c/b/i$a;->y()Lcom/c/b/i$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 4677
    sget-object v0, Lcom/c/b/i$a;->s:Lcom/c/b/i$a;

    return-object v0
.end method
