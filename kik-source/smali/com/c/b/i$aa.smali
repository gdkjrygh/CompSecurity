.class public final Lcom/c/b/i$aa;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$ab;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "aa"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$aa$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final l:Lcom/c/b/i$aa;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private h:Ljava/util/List;

.field private i:Lcom/c/b/i$ac;

.field private j:B

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14522
    new-instance v0, Lcom/c/b/i$aa;

    invoke-direct {v0}, Lcom/c/b/i$aa;-><init>()V

    sput-object v0, Lcom/c/b/i$aa;->l:Lcom/c/b/i$aa;

    .line 14529
    new-instance v0, Lcom/c/b/ae;

    invoke-direct {v0}, Lcom/c/b/ae;-><init>()V

    sput-object v0, Lcom/c/b/i$aa;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 13577
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 13763
    iput-byte v0, p0, Lcom/c/b/i$aa;->j:B

    .line 13799
    iput v0, p0, Lcom/c/b/i$aa;->k:I

    .line 13578
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$aa;->g:Ljava/lang/Object;

    .line 13579
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    .line 13580
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 13575
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 13763
    iput-byte v0, p0, Lcom/c/b/i$aa;->j:B

    .line 13799
    iput v0, p0, Lcom/c/b/i$aa;->k:I

    .line 13576
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 13569
    invoke-direct {p0, p1}, Lcom/c/b/i$aa;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/4 v0, 0x0

    const/4 v6, 0x2

    .line 13590
    invoke-direct {p0}, Lcom/c/b/i$aa;-><init>()V

    .line 13592
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v5

    move v3, v0

    move v1, v0

    .line 13596
    :cond_0
    :goto_0
    if-nez v3, :cond_4

    .line 13597
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v0

    .line 13598
    sparse-switch v0, :sswitch_data_0

    .line 13603
    invoke-virtual {p0, p1, v5, p2, v0}, Lcom/c/b/i$aa;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v0

    if-nez v0, :cond_0

    move v3, v4

    .line 13605
    goto :goto_0

    :sswitch_0
    move v3, v4

    .line 13601
    goto :goto_0

    .line 13610
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 13611
    iget v2, p0, Lcom/c/b/i$aa;->f:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/c/b/i$aa;->f:I

    .line 13612
    iput-object v0, p0, Lcom/c/b/i$aa;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 13638
    :catch_0
    move-exception v0

    .line 13639
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13645
    :catchall_0
    move-exception v0

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v6, :cond_1

    .line 13646
    iget-object v1, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    .line 13648
    :cond_1
    invoke-virtual {v5}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$aa;->e:Lcom/c/b/by;

    .line 13649
    invoke-virtual {p0}, Lcom/c/b/i$aa;->L()V

    .line 13645
    throw v0

    .line 13616
    :sswitch_2
    and-int/lit8 v0, v1, 0x2

    if-eq v0, v6, :cond_2

    .line 13617
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    .line 13618
    or-int/lit8 v1, v1, 0x2

    .line 13620
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    sget-object v2, Lcom/c/b/i$u;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v2, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 13640
    :catch_1
    move-exception v0

    .line 13641
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

    .line 13624
    :sswitch_3
    const/4 v0, 0x0

    .line 13625
    :try_start_4
    iget v2, p0, Lcom/c/b/i$aa;->f:I

    and-int/lit8 v2, v2, 0x2

    if-ne v2, v6, :cond_6

    .line 13626
    iget-object v0, p0, Lcom/c/b/i$aa;->i:Lcom/c/b/i$ac;

    invoke-virtual {v0}, Lcom/c/b/i$ac;->j()Lcom/c/b/i$ac$a;

    move-result-object v0

    move-object v2, v0

    .line 13628
    :goto_1
    sget-object v0, Lcom/c/b/i$ac;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v0, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ac;

    iput-object v0, p0, Lcom/c/b/i$aa;->i:Lcom/c/b/i$ac;

    .line 13629
    if-eqz v2, :cond_3

    .line 13630
    iget-object v0, p0, Lcom/c/b/i$aa;->i:Lcom/c/b/i$ac;

    invoke-virtual {v2, v0}, Lcom/c/b/i$ac$a;->a(Lcom/c/b/i$ac;)Lcom/c/b/i$ac$a;

    .line 13631
    invoke-virtual {v2}, Lcom/c/b/i$ac$a;->g()Lcom/c/b/i$ac;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$aa;->i:Lcom/c/b/i$ac;

    .line 13633
    :cond_3
    iget v0, p0, Lcom/c/b/i$aa;->f:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$aa;->f:I
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 13645
    :cond_4
    and-int/lit8 v0, v1, 0x2

    if-ne v0, v6, :cond_5

    .line 13646
    iget-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    .line 13648
    :cond_5
    invoke-virtual {v5}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$aa;->e:Lcom/c/b/by;

    .line 13649
    invoke-virtual {p0}, Lcom/c/b/i$aa;->L()V

    .line 13650
    return-void

    :cond_6
    move-object v2, v0

    goto :goto_1

    .line 13598
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 13569
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$aa;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$aa;I)I
    .locals 0

    .prologue
    .line 13569
    iput p1, p0, Lcom/c/b/i$aa;->f:I

    return p1
.end method

.method static synthetic a(Lcom/c/b/i$aa;Lcom/c/b/i$ac;)Lcom/c/b/i$ac;
    .locals 0

    .prologue
    .line 13569
    iput-object p1, p0, Lcom/c/b/i$aa;->i:Lcom/c/b/i$ac;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$aa;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 13569
    iget-object v0, p0, Lcom/c/b/i$aa;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$aa;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 13569
    iput-object p1, p0, Lcom/c/b/i$aa;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$aa;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 13569
    iput-object p1, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$aa;)Ljava/util/List;
    .locals 1

    .prologue
    .line 13569
    iget-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    return-object v0
.end method

.method public static m()Lcom/c/b/i$aa;
    .locals 1

    .prologue
    .line 14526
    sget-object v0, Lcom/c/b/i$aa;->l:Lcom/c/b/i$aa;

    return-object v0
.end method

.method private n()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 13695
    iget-object v0, p0, Lcom/c/b/i$aa;->g:Ljava/lang/Object;

    .line 13696
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 13697
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 13700
    iput-object v0, p0, Lcom/c/b/i$aa;->g:Ljava/lang/Object;

    .line 13703
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private o()Lcom/c/b/i$aa$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 13884
    sget-object v0, Lcom/c/b/i$aa;->l:Lcom/c/b/i$aa;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$aa$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$aa$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$aa$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$aa$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$aa$a;->a(Lcom/c/b/i$aa;)Lcom/c/b/i$aa$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 13569
    new-instance v0, Lcom/c/b/i$aa$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$aa$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(I)Lcom/c/b/i$u;
    .locals 1

    .prologue
    .line 13732
    iget-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$u;

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 13787
    iget v0, p0, Lcom/c/b/i$aa;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 13788
    invoke-direct {p0}, Lcom/c/b/i$aa;->n()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 13790
    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 13791
    iget-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 13790
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 13793
    :cond_1
    iget v0, p0, Lcom/c/b/i$aa;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_2

    .line 13794
    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/c/b/i$aa;->l()Lcom/c/b/i$ac;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 13796
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$aa;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 13797
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 13765
    iget-byte v0, p0, Lcom/c/b/i$aa;->j:B

    .line 13766
    if-ne v0, v2, :cond_1

    move v1, v2

    .line 13782
    :cond_0
    :goto_0
    return v1

    .line 13767
    :cond_1
    if-eqz v0, :cond_0

    move v0, v1

    .line 13769
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$aa;->j()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 13770
    invoke-virtual {p0, v0}, Lcom/c/b/i$aa;->a(I)Lcom/c/b/i$u;

    move-result-object v3

    invoke-virtual {v3}, Lcom/c/b/i$u;->a()Z

    move-result v3

    if-nez v3, :cond_2

    .line 13771
    iput-byte v1, p0, Lcom/c/b/i$aa;->j:B

    goto :goto_0

    .line 13769
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 13775
    :cond_3
    invoke-virtual {p0}, Lcom/c/b/i$aa;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 13776
    invoke-virtual {p0}, Lcom/c/b/i$aa;->l()Lcom/c/b/i$ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$ac;->a()Z

    move-result v0

    if-nez v0, :cond_4

    .line 13777
    iput-byte v1, p0, Lcom/c/b/i$aa;->j:B

    goto :goto_0

    .line 13781
    :cond_4
    iput-byte v2, p0, Lcom/c/b/i$aa;->j:B

    move v1, v2

    .line 13782
    goto :goto_0
.end method

.method public final b()I
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 13801
    iget v0, p0, Lcom/c/b/i$aa;->k:I

    .line 13802
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 13819
    :goto_0
    return v0

    .line 13805
    :cond_0
    iget v0, p0, Lcom/c/b/i$aa;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_3

    .line 13806
    invoke-direct {p0}, Lcom/c/b/i$aa;->n()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    :goto_1
    move v2, v0

    .line 13809
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 13810
    iget-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v4, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v0, v2

    .line 13809
    add-int/lit8 v1, v1, 0x1

    move v2, v0

    goto :goto_2

    .line 13813
    :cond_1
    iget v0, p0, Lcom/c/b/i$aa;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v4, :cond_2

    .line 13814
    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/c/b/i$aa;->l()Lcom/c/b/i$ac;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v2, v0

    .line 13817
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$aa;->e:Lcom/c/b/by;

    invoke-virtual {v0}, Lcom/c/b/by;->b()I

    move-result v0

    add-int/2addr v0, v2

    .line 13818
    iput v0, p0, Lcom/c/b/i$aa;->k:I

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 13659
    invoke-static {}, Lcom/c/b/i;->s()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$aa;

    const-class v2, Lcom/c/b/i$aa$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 13585
    iget-object v0, p0, Lcom/c/b/i$aa;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 13671
    iget v1, p0, Lcom/c/b/i$aa;->f:I

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
    .line 13677
    iget-object v0, p0, Lcom/c/b/i$aa;->g:Ljava/lang/Object;

    .line 13678
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 13679
    check-cast v0, Ljava/lang/String;

    .line 13687
    :goto_0
    return-object v0

    .line 13681
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 13683
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 13684
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13685
    iput-object v1, p0, Lcom/c/b/i$aa;->g:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 13687
    goto :goto_0
.end method

.method public final j()I
    .locals 1

    .prologue
    .line 13726
    iget-object v0, p0, Lcom/c/b/i$aa;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 2

    .prologue
    .line 13748
    iget v0, p0, Lcom/c/b/i$aa;->f:I

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

.method public final l()Lcom/c/b/i$ac;
    .locals 1

    .prologue
    .line 13754
    iget-object v0, p0, Lcom/c/b/i$aa;->i:Lcom/c/b/i$ac;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$ac;->k()Lcom/c/b/i$ac;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/i$aa;->i:Lcom/c/b/i$ac;

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 14554
    sget-object v0, Lcom/c/b/i$aa;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 13569
    sget-object v0, Lcom/c/b/i$aa;->l:Lcom/c/b/i$aa;

    invoke-direct {v0}, Lcom/c/b/i$aa;->o()Lcom/c/b/i$aa$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 13569
    invoke-direct {p0}, Lcom/c/b/i$aa;->o()Lcom/c/b/i$aa$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 13569
    sget-object v0, Lcom/c/b/i$aa;->l:Lcom/c/b/i$aa;

    return-object v0
.end method
