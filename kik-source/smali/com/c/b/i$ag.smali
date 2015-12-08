.class public final Lcom/c/b/i$ag;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$ah;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ag"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$ag$a;,
        Lcom/c/b/i$ag$b;,
        Lcom/c/b/i$ag$c;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final p:Lcom/c/b/i$ag;


# instance fields
.field private f:I

.field private g:Ljava/util/List;

.field private volatile h:Ljava/lang/Object;

.field private i:J

.field private j:J

.field private k:D

.field private l:Lcom/c/b/f;

.field private volatile m:Ljava/lang/Object;

.field private n:B

.field private o:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28561
    new-instance v0, Lcom/c/b/i$ag;

    invoke-direct {v0}, Lcom/c/b/i$ag;-><init>()V

    sput-object v0, Lcom/c/b/i$ag;->p:Lcom/c/b/i$ag;

    .line 28568
    new-instance v0, Lcom/c/b/ai;

    invoke-direct {v0}, Lcom/c/b/ai;-><init>()V

    sput-object v0, Lcom/c/b/i$ag;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    const/4 v0, -0x1

    .line 26748
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 27632
    iput-byte v0, p0, Lcom/c/b/i$ag;->n:B

    .line 27674
    iput v0, p0, Lcom/c/b/i$ag;->o:I

    .line 26749
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    .line 26750
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ag;->h:Ljava/lang/Object;

    .line 26751
    iput-wide v2, p0, Lcom/c/b/i$ag;->i:J

    .line 26752
    iput-wide v2, p0, Lcom/c/b/i$ag;->j:J

    .line 26753
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/c/b/i$ag;->k:D

    .line 26754
    sget-object v0, Lcom/c/b/f;->a:Lcom/c/b/f;

    iput-object v0, p0, Lcom/c/b/i$ag;->l:Lcom/c/b/f;

    .line 26755
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ag;->m:Ljava/lang/Object;

    .line 26756
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 26746
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 27632
    iput-byte v0, p0, Lcom/c/b/i$ag;->n:B

    .line 27674
    iput v0, p0, Lcom/c/b/i$ag;->o:I

    .line 26747
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 26740
    invoke-direct {p0, p1}, Lcom/c/b/i$ag;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 26766
    invoke-direct {p0}, Lcom/c/b/i$ag;-><init>()V

    .line 26768
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v3

    move v1, v0

    .line 26772
    :cond_0
    :goto_0
    if-nez v0, :cond_3

    .line 26773
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v4

    .line 26774
    sparse-switch v4, :sswitch_data_0

    .line 26779
    invoke-virtual {p0, p1, v3, p2, v4}, Lcom/c/b/i$ag;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v4

    if-nez v4, :cond_0

    move v0, v2

    .line 26781
    goto :goto_0

    :sswitch_0
    move v0, v2

    .line 26777
    goto :goto_0

    .line 26786
    :sswitch_1
    and-int/lit8 v4, v1, 0x1

    if-eq v4, v2, :cond_1

    .line 26787
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    .line 26788
    or-int/lit8 v1, v1, 0x1

    .line 26790
    :cond_1
    iget-object v4, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    sget-object v5, Lcom/c/b/i$ag$b;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v5, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 26827
    :catch_0
    move-exception v0

    .line 26828
    :try_start_1
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26834
    :catchall_0
    move-exception v0

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_2

    .line 26835
    iget-object v1, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    .line 26837
    :cond_2
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ag;->e:Lcom/c/b/by;

    .line 26838
    invoke-virtual {p0}, Lcom/c/b/i$ag;->L()V

    .line 26834
    throw v0

    .line 26794
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v4

    .line 26795
    iget v5, p0, Lcom/c/b/i$ag;->f:I

    or-int/lit8 v5, v5, 0x1

    iput v5, p0, Lcom/c/b/i$ag;->f:I

    .line 26796
    iput-object v4, p0, Lcom/c/b/i$ag;->h:Ljava/lang/Object;
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 26829
    :catch_1
    move-exception v0

    .line 26830
    :try_start_3
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 26800
    :sswitch_3
    :try_start_4
    iget v4, p0, Lcom/c/b/i$ag;->f:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lcom/c/b/i$ag;->f:I

    .line 26801
    invoke-virtual {p1}, Lcom/c/b/g;->d()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/c/b/i$ag;->i:J

    goto :goto_0

    .line 26805
    :sswitch_4
    iget v4, p0, Lcom/c/b/i$ag;->f:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Lcom/c/b/i$ag;->f:I

    .line 26806
    invoke-virtual {p1}, Lcom/c/b/g;->e()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/c/b/i$ag;->j:J

    goto/16 :goto_0

    .line 26810
    :sswitch_5
    iget v4, p0, Lcom/c/b/i$ag;->f:I

    or-int/lit8 v4, v4, 0x8

    iput v4, p0, Lcom/c/b/i$ag;->f:I

    .line 26811
    invoke-virtual {p1}, Lcom/c/b/g;->b()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/c/b/i$ag;->k:D

    goto/16 :goto_0

    .line 26815
    :sswitch_6
    iget v4, p0, Lcom/c/b/i$ag;->f:I

    or-int/lit8 v4, v4, 0x10

    iput v4, p0, Lcom/c/b/i$ag;->f:I

    .line 26816
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v4

    iput-object v4, p0, Lcom/c/b/i$ag;->l:Lcom/c/b/f;

    goto/16 :goto_0

    .line 26820
    :sswitch_7
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v4

    .line 26821
    iget v5, p0, Lcom/c/b/i$ag;->f:I

    or-int/lit8 v5, v5, 0x20

    iput v5, p0, Lcom/c/b/i$ag;->f:I

    .line 26822
    iput-object v4, p0, Lcom/c/b/i$ag;->m:Ljava/lang/Object;
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 26834
    :cond_3
    and-int/lit8 v0, v1, 0x1

    if-ne v0, v2, :cond_4

    .line 26835
    iget-object v0, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    .line 26837
    :cond_4
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ag;->e:Lcom/c/b/by;

    .line 26838
    invoke-virtual {p0}, Lcom/c/b/i$ag;->L()V

    .line 26839
    return-void

    .line 26774
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x12 -> :sswitch_1
        0x1a -> :sswitch_2
        0x20 -> :sswitch_3
        0x28 -> :sswitch_4
        0x31 -> :sswitch_5
        0x3a -> :sswitch_6
        0x42 -> :sswitch_7
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 26740
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ag;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$ag;D)D
    .locals 1

    .prologue
    .line 26740
    iput-wide p1, p0, Lcom/c/b/i$ag;->k:D

    return-wide p1
.end method

.method static synthetic a(Lcom/c/b/i$ag;I)I
    .locals 0

    .prologue
    .line 26740
    iput p1, p0, Lcom/c/b/i$ag;->f:I

    return p1
.end method

.method static synthetic a(Lcom/c/b/i$ag;J)J
    .locals 1

    .prologue
    .line 26740
    iput-wide p1, p0, Lcom/c/b/i$ag;->i:J

    return-wide p1
.end method

.method static synthetic a(Lcom/c/b/i$ag;Lcom/c/b/f;)Lcom/c/b/f;
    .locals 0

    .prologue
    .line 26740
    iput-object p1, p0, Lcom/c/b/i$ag;->l:Lcom/c/b/f;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$ag;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 26740
    iput-object p1, p0, Lcom/c/b/i$ag;->h:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$ag;)Ljava/util/List;
    .locals 1

    .prologue
    .line 26740
    iget-object v0, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$ag;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 26740
    iput-object p1, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$ag;J)J
    .locals 1

    .prologue
    .line 26740
    iput-wide p1, p0, Lcom/c/b/i$ag;->j:J

    return-wide p1
.end method

.method static synthetic b(Lcom/c/b/i$ag;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26740
    iget-object v0, p0, Lcom/c/b/i$ag;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/i$ag;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 26740
    iput-object p1, p0, Lcom/c/b/i$ag;->m:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic c(Lcom/c/b/i$ag;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26740
    iget-object v0, p0, Lcom/c/b/i$ag;->m:Ljava/lang/Object;

    return-object v0
.end method

.method public static r()Lcom/c/b/i$ag;
    .locals 1

    .prologue
    .line 28565
    sget-object v0, Lcom/c/b/i$ag;->p:Lcom/c/b/i$ag;

    return-object v0
.end method

.method private s()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 27518
    iget-object v0, p0, Lcom/c/b/i$ag;->h:Ljava/lang/Object;

    .line 27519
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 27520
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 27523
    iput-object v0, p0, Lcom/c/b/i$ag;->h:Ljava/lang/Object;

    .line 27526
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private x()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 27620
    iget-object v0, p0, Lcom/c/b/i$ag;->m:Ljava/lang/Object;

    .line 27621
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 27622
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 27625
    iput-object v0, p0, Lcom/c/b/i$ag;->m:Ljava/lang/Object;

    .line 27628
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private y()Lcom/c/b/i$ag$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 27775
    sget-object v0, Lcom/c/b/i$ag;->p:Lcom/c/b/i$ag;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$ag$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$ag$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$ag$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$ag$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$ag$a;->a(Lcom/c/b/i$ag;)Lcom/c/b/i$ag$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 26740
    new-instance v0, Lcom/c/b/i$ag$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$ag$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v3, 0x4

    const/4 v2, 0x2

    const/4 v4, 0x1

    .line 27650
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 27651
    iget-object v0, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 27650
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 27653
    :cond_0
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v4, :cond_1

    .line 27654
    const/4 v0, 0x3

    invoke-direct {p0}, Lcom/c/b/i$ag;->s()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 27656
    :cond_1
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_2

    .line 27657
    iget-wide v0, p0, Lcom/c/b/i$ag;->i:J

    invoke-virtual {p1, v3, v0, v1}, Lcom/c/b/h;->a(IJ)V

    .line 27659
    :cond_2
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x4

    if-ne v0, v3, :cond_3

    .line 27660
    const/4 v0, 0x5

    iget-wide v2, p0, Lcom/c/b/i$ag;->j:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/c/b/h;->b(IJ)V

    .line 27662
    :cond_3
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x8

    if-ne v0, v5, :cond_4

    .line 27663
    iget-wide v0, p0, Lcom/c/b/i$ag;->k:D

    const/4 v2, 0x6

    invoke-virtual {p1, v2, v4}, Lcom/c/b/h;->g(II)V

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(D)V

    .line 27665
    :cond_4
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 27666
    const/4 v0, 0x7

    iget-object v1, p0, Lcom/c/b/i$ag;->l:Lcom/c/b/f;

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 27668
    :cond_5
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 27669
    invoke-direct {p0}, Lcom/c/b/i$ag;->x()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v5, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 27671
    :cond_6
    iget-object v0, p0, Lcom/c/b/i$ag;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 27672
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 27634
    iget-byte v0, p0, Lcom/c/b/i$ag;->n:B

    .line 27635
    if-ne v0, v3, :cond_1

    move v2, v3

    .line 27645
    :cond_0
    :goto_0
    return v2

    .line 27636
    :cond_1
    if-eqz v0, :cond_0

    move v1, v2

    .line 27638
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 27639
    iget-object v0, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag$b;

    invoke-virtual {v0}, Lcom/c/b/i$ag$b;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 27640
    iput-byte v2, p0, Lcom/c/b/i$ag;->n:B

    goto :goto_0

    .line 27638
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 27644
    :cond_3
    iput-byte v3, p0, Lcom/c/b/i$ag;->n:B

    move v2, v3

    .line 27645
    goto :goto_0
.end method

.method public final b()I
    .locals 7

    .prologue
    const/16 v6, 0x8

    const/4 v4, 0x4

    const/4 v3, 0x2

    const/4 v0, 0x0

    .line 27676
    iget v1, p0, Lcom/c/b/i$ag;->o:I

    .line 27677
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    move v0, v1

    .line 27710
    :goto_0
    return v0

    :cond_0
    move v1, v0

    move v2, v0

    .line 27680
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 27681
    iget-object v0, p0, Lcom/c/b/i$ag;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v3, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v2, v0

    .line 27680
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 27684
    :cond_1
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 27685
    const/4 v0, 0x3

    invoke-direct {p0}, Lcom/c/b/i$ag;->s()Lcom/c/b/f;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/2addr v2, v0

    .line 27688
    :cond_2
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v3, :cond_3

    .line 27689
    iget-wide v0, p0, Lcom/c/b/i$ag;->i:J

    invoke-static {v4, v0, v1}, Lcom/c/b/h;->d(IJ)I

    move-result v0

    add-int/2addr v2, v0

    .line 27692
    :cond_3
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x4

    if-ne v0, v4, :cond_4

    .line 27693
    const/4 v0, 0x5

    iget-wide v4, p0, Lcom/c/b/i$ag;->j:J

    invoke-static {v0, v4, v5}, Lcom/c/b/h;->e(IJ)I

    move-result v0

    add-int/2addr v2, v0

    .line 27696
    :cond_4
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x8

    if-ne v0, v6, :cond_5

    .line 27697
    const/4 v0, 0x6

    invoke-static {v0}, Lcom/c/b/h;->j(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    add-int/2addr v2, v0

    .line 27700
    :cond_5
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_6

    .line 27701
    const/4 v0, 0x7

    iget-object v1, p0, Lcom/c/b/i$ag;->l:Lcom/c/b/f;

    invoke-static {v0, v1}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/2addr v2, v0

    .line 27704
    :cond_6
    iget v0, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_7

    .line 27705
    invoke-direct {p0}, Lcom/c/b/i$ag;->x()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/2addr v2, v0

    .line 27708
    :cond_7
    iget-object v0, p0, Lcom/c/b/i$ag;->e:Lcom/c/b/by;

    invoke-virtual {v0}, Lcom/c/b/by;->b()I

    move-result v0

    add-int/2addr v0, v2

    .line 27709
    iput v0, p0, Lcom/c/b/i$ag;->o:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 26848
    invoke-static {}, Lcom/c/b/i;->K()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$ag;

    const-class v2, Lcom/c/b/i$ag$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 26761
    iget-object v0, p0, Lcom/c/b/i$ag;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 27484
    iget v1, p0, Lcom/c/b/i$ag;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Z
    .locals 2

    .prologue
    .line 27536
    iget v0, p0, Lcom/c/b/i$ag;->f:I

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

.method public final j()J
    .locals 2

    .prologue
    .line 27542
    iget-wide v0, p0, Lcom/c/b/i$ag;->i:J

    return-wide v0
.end method

.method public final k()Z
    .locals 2

    .prologue
    .line 27551
    iget v0, p0, Lcom/c/b/i$ag;->f:I

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

.method public final l()J
    .locals 2

    .prologue
    .line 27557
    iget-wide v0, p0, Lcom/c/b/i$ag;->j:J

    return-wide v0
.end method

.method public final m()Z
    .locals 2

    .prologue
    .line 27566
    iget v0, p0, Lcom/c/b/i$ag;->f:I

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

.method public final n()D
    .locals 2

    .prologue
    .line 27572
    iget-wide v0, p0, Lcom/c/b/i$ag;->k:D

    return-wide v0
.end method

.method public final o()Z
    .locals 2

    .prologue
    .line 27581
    iget v0, p0, Lcom/c/b/i$ag;->f:I

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

.method public final p()Lcom/c/b/f;
    .locals 1

    .prologue
    .line 27587
    iget-object v0, p0, Lcom/c/b/i$ag;->l:Lcom/c/b/f;

    return-object v0
.end method

.method public final q()Z
    .locals 2

    .prologue
    .line 27596
    iget v0, p0, Lcom/c/b/i$ag;->f:I

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

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 28593
    sget-object v0, Lcom/c/b/i$ag;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 26740
    sget-object v0, Lcom/c/b/i$ag;->p:Lcom/c/b/i$ag;

    invoke-direct {v0}, Lcom/c/b/i$ag;->y()Lcom/c/b/i$ag$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 26740
    invoke-direct {p0}, Lcom/c/b/i$ag;->y()Lcom/c/b/i$ag$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 26740
    sget-object v0, Lcom/c/b/i$ag;->p:Lcom/c/b/i$ag;

    return-object v0
.end method
