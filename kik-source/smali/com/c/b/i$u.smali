.class public final Lcom/c/b/i$u;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "u"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$u$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final o:Lcom/c/b/i$u;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private volatile h:Ljava/lang/Object;

.field private volatile i:Ljava/lang/Object;

.field private j:Lcom/c/b/i$w;

.field private k:Z

.field private l:Z

.field private m:B

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15801
    new-instance v0, Lcom/c/b/i$u;

    invoke-direct {v0}, Lcom/c/b/i$u;-><init>()V

    sput-object v0, Lcom/c/b/i$u;->o:Lcom/c/b/i$u;

    .line 15808
    new-instance v0, Lcom/c/b/ab;

    invoke-direct {v0}, Lcom/c/b/ab;-><init>()V

    sput-object v0, Lcom/c/b/i$u;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 14686
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 14996
    iput-byte v0, p0, Lcom/c/b/i$u;->m:B

    .line 15035
    iput v0, p0, Lcom/c/b/i$u;->n:I

    .line 14687
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$u;->g:Ljava/lang/Object;

    .line 14688
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$u;->h:Ljava/lang/Object;

    .line 14689
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$u;->i:Ljava/lang/Object;

    .line 14690
    iput-boolean v1, p0, Lcom/c/b/i$u;->k:Z

    .line 14691
    iput-boolean v1, p0, Lcom/c/b/i$u;->l:Z

    .line 14692
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 14684
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 14996
    iput-byte v0, p0, Lcom/c/b/i$u;->m:B

    .line 15035
    iput v0, p0, Lcom/c/b/i$u;->n:I

    .line 14685
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 14678
    invoke-direct {p0, p1}, Lcom/c/b/i$u;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    .line 14702
    invoke-direct {p0}, Lcom/c/b/i$u;-><init>()V

    .line 14703
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v4

    .line 14707
    const/4 v0, 0x0

    move v2, v0

    .line 14708
    :cond_0
    :goto_0
    if-nez v2, :cond_2

    .line 14709
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v0

    .line 14710
    sparse-switch v0, :sswitch_data_0

    .line 14715
    invoke-virtual {p0, p1, v4, p2, v0}, Lcom/c/b/i$u;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v0

    if-nez v0, :cond_0

    move v2, v3

    .line 14717
    goto :goto_0

    :sswitch_0
    move v2, v3

    .line 14713
    goto :goto_0

    .line 14722
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 14723
    iget v1, p0, Lcom/c/b/i$u;->f:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/c/b/i$u;->f:I

    .line 14724
    iput-object v0, p0, Lcom/c/b/i$u;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 14764
    :catch_0
    move-exception v0

    .line 14765
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14771
    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$u;->e:Lcom/c/b/by;

    .line 14772
    invoke-virtual {p0}, Lcom/c/b/i$u;->L()V

    .line 14771
    throw v0

    .line 14728
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 14729
    iget v1, p0, Lcom/c/b/i$u;->f:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/c/b/i$u;->f:I

    .line 14730
    iput-object v0, p0, Lcom/c/b/i$u;->h:Ljava/lang/Object;
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 14766
    :catch_1
    move-exception v0

    .line 14767
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 14734
    :sswitch_3
    :try_start_4
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 14735
    iget v1, p0, Lcom/c/b/i$u;->f:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/c/b/i$u;->f:I

    .line 14736
    iput-object v0, p0, Lcom/c/b/i$u;->i:Ljava/lang/Object;

    goto :goto_0

    .line 14740
    :sswitch_4
    const/4 v0, 0x0

    .line 14741
    iget v1, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v1, v1, 0x8

    const/16 v5, 0x8

    if-ne v1, v5, :cond_3

    .line 14742
    iget-object v0, p0, Lcom/c/b/i$u;->j:Lcom/c/b/i$w;

    invoke-virtual {v0}, Lcom/c/b/i$w;->j()Lcom/c/b/i$w$a;

    move-result-object v0

    move-object v1, v0

    .line 14744
    :goto_1
    sget-object v0, Lcom/c/b/i$w;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v0, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$w;

    iput-object v0, p0, Lcom/c/b/i$u;->j:Lcom/c/b/i$w;

    .line 14745
    if-eqz v1, :cond_1

    .line 14746
    iget-object v0, p0, Lcom/c/b/i$u;->j:Lcom/c/b/i$w;

    invoke-virtual {v1, v0}, Lcom/c/b/i$w$a;->a(Lcom/c/b/i$w;)Lcom/c/b/i$w$a;

    .line 14747
    invoke-virtual {v1}, Lcom/c/b/i$w$a;->g()Lcom/c/b/i$w;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$u;->j:Lcom/c/b/i$w;

    .line 14749
    :cond_1
    iget v0, p0, Lcom/c/b/i$u;->f:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/c/b/i$u;->f:I

    goto/16 :goto_0

    .line 14753
    :sswitch_5
    iget v0, p0, Lcom/c/b/i$u;->f:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/c/b/i$u;->f:I

    .line 14754
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/c/b/i$u;->k:Z

    goto/16 :goto_0

    .line 14758
    :sswitch_6
    iget v0, p0, Lcom/c/b/i$u;->f:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/c/b/i$u;->f:I

    .line 14759
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/c/b/i$u;->l:Z
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 14771
    :cond_2
    invoke-virtual {v4}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$u;->e:Lcom/c/b/by;

    .line 14772
    invoke-virtual {p0}, Lcom/c/b/i$u;->L()V

    .line 14773
    return-void

    :cond_3
    move-object v1, v0

    goto :goto_1

    .line 14710
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x28 -> :sswitch_5
        0x30 -> :sswitch_6
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 14678
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$u;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method private A()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 14917
    iget-object v0, p0, Lcom/c/b/i$u;->i:Ljava/lang/Object;

    .line 14918
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 14919
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 14922
    iput-object v0, p0, Lcom/c/b/i$u;->i:Ljava/lang/Object;

    .line 14925
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private B()Lcom/c/b/i$u$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 15132
    sget-object v0, Lcom/c/b/i$u;->o:Lcom/c/b/i$u;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$u$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$u$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$u$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$u$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$u$a;->a(Lcom/c/b/i$u;)Lcom/c/b/i$u$a;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/c/b/i$u;I)I
    .locals 0

    .prologue
    .line 14678
    iput p1, p0, Lcom/c/b/i$u;->f:I

    return p1
.end method

.method static synthetic a(Lcom/c/b/i$u;Lcom/c/b/i$w;)Lcom/c/b/i$w;
    .locals 0

    .prologue
    .line 14678
    iput-object p1, p0, Lcom/c/b/i$u;->j:Lcom/c/b/i$w;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$u;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14678
    iget-object v0, p0, Lcom/c/b/i$u;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$u;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 14678
    iput-object p1, p0, Lcom/c/b/i$u;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$u;Z)Z
    .locals 0

    .prologue
    .line 14678
    iput-boolean p1, p0, Lcom/c/b/i$u;->k:Z

    return p1
.end method

.method static synthetic b(Lcom/c/b/i$u;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14678
    iget-object v0, p0, Lcom/c/b/i$u;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/i$u;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 14678
    iput-object p1, p0, Lcom/c/b/i$u;->h:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$u;Z)Z
    .locals 0

    .prologue
    .line 14678
    iput-boolean p1, p0, Lcom/c/b/i$u;->l:Z

    return p1
.end method

.method static synthetic c(Lcom/c/b/i$u;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14678
    iget-object v0, p0, Lcom/c/b/i$u;->i:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lcom/c/b/i$u;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 14678
    iput-object p1, p0, Lcom/c/b/i$u;->i:Ljava/lang/Object;

    return-object p1
.end method

.method public static x()Lcom/c/b/i$u;
    .locals 1

    .prologue
    .line 15805
    sget-object v0, Lcom/c/b/i$u;->o:Lcom/c/b/i$u;

    return-object v0
.end method

.method private y()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 14818
    iget-object v0, p0, Lcom/c/b/i$u;->g:Ljava/lang/Object;

    .line 14819
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 14820
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 14823
    iput-object v0, p0, Lcom/c/b/i$u;->g:Ljava/lang/Object;

    .line 14826
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private z()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 14875
    iget-object v0, p0, Lcom/c/b/i$u;->h:Ljava/lang/Object;

    .line 14876
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 14877
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 14880
    iput-object v0, p0, Lcom/c/b/i$u;->h:Ljava/lang/Object;

    .line 14883
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 14678
    new-instance v0, Lcom/c/b/i$u$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$u$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 15014
    iget v0, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 15015
    invoke-direct {p0}, Lcom/c/b/i$u;->y()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 15017
    :cond_0
    iget v0, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 15018
    invoke-direct {p0}, Lcom/c/b/i$u;->z()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 15020
    :cond_1
    iget v0, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v0, v0, 0x4

    if-ne v0, v3, :cond_2

    .line 15021
    const/4 v0, 0x3

    invoke-direct {p0}, Lcom/c/b/i$u;->A()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 15023
    :cond_2
    iget v0, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 15024
    invoke-virtual {p0}, Lcom/c/b/i$u;->o()Lcom/c/b/i$w;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 15026
    :cond_3
    iget v0, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 15027
    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/c/b/i$u;->k:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 15029
    :cond_4
    iget v0, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 15030
    const/4 v0, 0x6

    iget-boolean v1, p0, Lcom/c/b/i$u;->l:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 15032
    :cond_5
    iget-object v0, p0, Lcom/c/b/i$u;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 15033
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 14998
    iget-byte v2, p0, Lcom/c/b/i$u;->m:B

    .line 14999
    if-ne v2, v0, :cond_0

    .line 15009
    :goto_0
    return v0

    .line 15000
    :cond_0
    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 15002
    :cond_1
    invoke-virtual {p0}, Lcom/c/b/i$u;->n()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 15003
    invoke-virtual {p0}, Lcom/c/b/i$u;->o()Lcom/c/b/i$w;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/i$w;->a()Z

    move-result v2

    if-nez v2, :cond_2

    .line 15004
    iput-byte v1, p0, Lcom/c/b/i$u;->m:B

    move v0, v1

    .line 15005
    goto :goto_0

    .line 15008
    :cond_2
    iput-byte v0, p0, Lcom/c/b/i$u;->m:B

    goto :goto_0
.end method

.method public final b()I
    .locals 5

    .prologue
    const/4 v4, 0x4

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 15037
    iget v0, p0, Lcom/c/b/i$u;->n:I

    .line 15038
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 15067
    :goto_0
    return v0

    .line 15040
    :cond_0
    const/4 v0, 0x0

    .line 15041
    iget v1, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 15042
    invoke-direct {p0}, Lcom/c/b/i$u;->y()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 15045
    :cond_1
    iget v1, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_2

    .line 15046
    invoke-direct {p0}, Lcom/c/b/i$u;->z()Lcom/c/b/f;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 15049
    :cond_2
    iget v1, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v1, v1, 0x4

    if-ne v1, v4, :cond_3

    .line 15050
    const/4 v1, 0x3

    invoke-direct {p0}, Lcom/c/b/i$u;->A()Lcom/c/b/f;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 15053
    :cond_3
    iget v1, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v1, v1, 0x8

    const/16 v2, 0x8

    if-ne v1, v2, :cond_4

    .line 15054
    invoke-virtual {p0}, Lcom/c/b/i$u;->o()Lcom/c/b/i$w;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v1

    add-int/2addr v0, v1

    .line 15057
    :cond_4
    iget v1, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v1, v1, 0x10

    const/16 v2, 0x10

    if-ne v1, v2, :cond_5

    .line 15058
    const/4 v1, 0x5

    invoke-static {v1}, Lcom/c/b/h;->j(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    .line 15061
    :cond_5
    iget v1, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v1, v1, 0x20

    const/16 v2, 0x20

    if-ne v1, v2, :cond_6

    .line 15062
    const/4 v1, 0x6

    invoke-static {v1}, Lcom/c/b/h;->j(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    .line 15065
    :cond_6
    iget-object v1, p0, Lcom/c/b/i$u;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 15066
    iput v0, p0, Lcom/c/b/i$u;->n:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 14782
    invoke-static {}, Lcom/c/b/i;->u()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$u;

    const-class v2, Lcom/c/b/i$u$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 14697
    iget-object v0, p0, Lcom/c/b/i$u;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 14794
    iget v1, p0, Lcom/c/b/i$u;->f:I

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
    .line 14800
    iget-object v0, p0, Lcom/c/b/i$u;->g:Ljava/lang/Object;

    .line 14801
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 14802
    check-cast v0, Ljava/lang/String;

    .line 14810
    :goto_0
    return-object v0

    .line 14804
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 14806
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 14807
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14808
    iput-object v1, p0, Lcom/c/b/i$u;->g:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 14810
    goto :goto_0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 14841
    iget v0, p0, Lcom/c/b/i$u;->f:I

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

.method public final k()Ljava/lang/String;
    .locals 2

    .prologue
    .line 14852
    iget-object v0, p0, Lcom/c/b/i$u;->h:Ljava/lang/Object;

    .line 14853
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 14854
    check-cast v0, Ljava/lang/String;

    .line 14862
    :goto_0
    return-object v0

    .line 14856
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 14858
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 14859
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14860
    iput-object v1, p0, Lcom/c/b/i$u;->h:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 14862
    goto :goto_0
.end method

.method public final l()Z
    .locals 2

    .prologue
    .line 14893
    iget v0, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final m()Ljava/lang/String;
    .locals 2

    .prologue
    .line 14899
    iget-object v0, p0, Lcom/c/b/i$u;->i:Ljava/lang/Object;

    .line 14900
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 14901
    check-cast v0, Ljava/lang/String;

    .line 14909
    :goto_0
    return-object v0

    .line 14903
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 14905
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 14906
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14907
    iput-object v1, p0, Lcom/c/b/i$u;->i:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 14909
    goto :goto_0
.end method

.method public final n()Z
    .locals 2

    .prologue
    .line 14935
    iget v0, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()Lcom/c/b/i$w;
    .locals 1

    .prologue
    .line 14941
    iget-object v0, p0, Lcom/c/b/i$u;->j:Lcom/c/b/i$w;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$w;->k()Lcom/c/b/i$w;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/i$u;->j:Lcom/c/b/i$w;

    goto :goto_0
.end method

.method public final p()Z
    .locals 2

    .prologue
    .line 14960
    iget v0, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final q()Z
    .locals 1

    .prologue
    .line 14970
    iget-boolean v0, p0, Lcom/c/b/i$u;->k:Z

    return v0
.end method

.method public final r()Z
    .locals 2

    .prologue
    .line 14983
    iget v0, p0, Lcom/c/b/i$u;->f:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final s()Z
    .locals 1

    .prologue
    .line 14993
    iget-boolean v0, p0, Lcom/c/b/i$u;->l:Z

    return v0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 15833
    sget-object v0, Lcom/c/b/i$u;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 14678
    sget-object v0, Lcom/c/b/i$u;->o:Lcom/c/b/i$u;

    invoke-direct {v0}, Lcom/c/b/i$u;->B()Lcom/c/b/i$u$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 14678
    invoke-direct {p0}, Lcom/c/b/i$u;->B()Lcom/c/b/i$u$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 14678
    sget-object v0, Lcom/c/b/i$u;->o:Lcom/c/b/i$u;

    return-object v0
.end method
