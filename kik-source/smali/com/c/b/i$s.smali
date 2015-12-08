.class public final Lcom/c/b/i$s;
.super Lcom/c/b/as$d;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "s"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$s$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final n:Lcom/c/b/i$s;


# instance fields
.field private f:I

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Ljava/util/List;

.field private l:B

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20608
    new-instance v0, Lcom/c/b/i$s;

    invoke-direct {v0}, Lcom/c/b/i$s;-><init>()V

    sput-object v0, Lcom/c/b/i$s;->n:Lcom/c/b/i$s;

    .line 20615
    new-instance v0, Lcom/c/b/aa;

    invoke-direct {v0}, Lcom/c/b/aa;-><init>()V

    sput-object v0, Lcom/c/b/i$s;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    const/4 v0, 0x0

    .line 19304
    invoke-direct {p0}, Lcom/c/b/as$d;-><init>()V

    .line 19615
    iput-byte v1, p0, Lcom/c/b/i$s;->l:B

    .line 19659
    iput v1, p0, Lcom/c/b/i$s;->m:I

    .line 19305
    iput-boolean v0, p0, Lcom/c/b/i$s;->g:Z

    .line 19306
    iput-boolean v0, p0, Lcom/c/b/i$s;->h:Z

    .line 19307
    iput-boolean v0, p0, Lcom/c/b/i$s;->i:Z

    .line 19308
    iput-boolean v0, p0, Lcom/c/b/i$s;->j:Z

    .line 19309
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    .line 19310
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$c;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 19302
    invoke-direct {p0, p1}, Lcom/c/b/as$d;-><init>(Lcom/c/b/as$c;)V

    .line 19615
    iput-byte v0, p0, Lcom/c/b/i$s;->l:B

    .line 19659
    iput v0, p0, Lcom/c/b/i$s;->m:I

    .line 19303
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$c;B)V
    .locals 0

    .prologue
    .line 19295
    invoke-direct {p0, p1}, Lcom/c/b/i$s;-><init>(Lcom/c/b/as$c;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    const/16 v6, 0x10

    .line 19320
    invoke-direct {p0}, Lcom/c/b/i$s;-><init>()V

    .line 19322
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v3

    move v1, v0

    .line 19326
    :cond_0
    :goto_0
    if-nez v1, :cond_3

    .line 19327
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v4

    .line 19328
    sparse-switch v4, :sswitch_data_0

    .line 19333
    invoke-virtual {p0, p1, v3, p2, v4}, Lcom/c/b/i$s;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v4

    if-nez v4, :cond_0

    move v1, v2

    .line 19335
    goto :goto_0

    :sswitch_0
    move v1, v2

    .line 19331
    goto :goto_0

    .line 19340
    :sswitch_1
    iget v4, p0, Lcom/c/b/i$s;->f:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/c/b/i$s;->f:I

    .line 19341
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$s;->g:Z
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    .line 19369
    :catch_0
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 19370
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19376
    :catchall_0
    move-exception v0

    :goto_1
    and-int/lit8 v1, v1, 0x10

    if-ne v1, v6, :cond_1

    .line 19377
    iget-object v1, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    .line 19379
    :cond_1
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$s;->e:Lcom/c/b/by;

    .line 19380
    invoke-virtual {p0}, Lcom/c/b/i$s;->L()V

    .line 19376
    throw v0

    .line 19345
    :sswitch_2
    :try_start_2
    iget v4, p0, Lcom/c/b/i$s;->f:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lcom/c/b/i$s;->f:I

    .line 19346
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$s;->h:Z
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 19371
    :catch_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 19372
    :try_start_3
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 19350
    :sswitch_3
    :try_start_4
    iget v4, p0, Lcom/c/b/i$s;->f:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Lcom/c/b/i$s;->f:I

    .line 19351
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$s;->i:Z

    goto :goto_0

    .line 19376
    :catchall_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    goto :goto_1

    .line 19355
    :sswitch_4
    iget v4, p0, Lcom/c/b/i$s;->f:I

    or-int/lit8 v4, v4, 0x8

    iput v4, p0, Lcom/c/b/i$s;->f:I

    .line 19356
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$s;->j:Z

    goto/16 :goto_0

    .line 19360
    :sswitch_5
    and-int/lit8 v4, v0, 0x10

    if-eq v4, v6, :cond_2

    .line 19361
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    .line 19362
    or-int/lit8 v0, v0, 0x10

    .line 19364
    :cond_2
    iget-object v4, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    sget-object v5, Lcom/c/b/i$ag;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v5, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_0

    .line 19376
    :cond_3
    and-int/lit8 v0, v0, 0x10

    if-ne v0, v6, :cond_4

    .line 19377
    iget-object v0, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    .line 19379
    :cond_4
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$s;->e:Lcom/c/b/by;

    .line 19380
    invoke-virtual {p0}, Lcom/c/b/i$s;->L()V

    .line 19381
    return-void

    .line 19328
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x38 -> :sswitch_4
        0x1f3a -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 19295
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$s;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$s;I)I
    .locals 0

    .prologue
    .line 19295
    iput p1, p0, Lcom/c/b/i$s;->f:I

    return p1
.end method

.method public static a(Lcom/c/b/i$s;)Lcom/c/b/i$s$a;
    .locals 1

    .prologue
    .line 19750
    sget-object v0, Lcom/c/b/i$s;->n:Lcom/c/b/i$s;

    invoke-virtual {v0}, Lcom/c/b/i$s;->p()Lcom/c/b/i$s$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/i$s$a;->a(Lcom/c/b/i$s;)Lcom/c/b/i$s$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$s;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 19295
    iput-object p1, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$s;Z)Z
    .locals 0

    .prologue
    .line 19295
    iput-boolean p1, p0, Lcom/c/b/i$s;->g:Z

    return p1
.end method

.method static synthetic b(Lcom/c/b/i$s;)Ljava/util/List;
    .locals 1

    .prologue
    .line 19295
    iget-object v0, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/i$s;Z)Z
    .locals 0

    .prologue
    .line 19295
    iput-boolean p1, p0, Lcom/c/b/i$s;->h:Z

    return p1
.end method

.method static synthetic c(Lcom/c/b/i$s;Z)Z
    .locals 0

    .prologue
    .line 19295
    iput-boolean p1, p0, Lcom/c/b/i$s;->i:Z

    return p1
.end method

.method static synthetic d(Lcom/c/b/i$s;Z)Z
    .locals 0

    .prologue
    .line 19295
    iput-boolean p1, p0, Lcom/c/b/i$s;->j:Z

    return p1
.end method

.method public static q()Lcom/c/b/i$s;
    .locals 1

    .prologue
    .line 20612
    sget-object v0, Lcom/c/b/i$s;->n:Lcom/c/b/i$s;

    return-object v0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 19295
    new-instance v0, Lcom/c/b/i$s$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$s$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v1, 0x1

    .line 19639
    invoke-virtual {p0}, Lcom/c/b/i$s;->N()Lcom/c/b/as$d$a;

    move-result-object v2

    .line 19640
    iget v0, p0, Lcom/c/b/i$s;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 19641
    iget-boolean v0, p0, Lcom/c/b/i$s;->g:Z

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(IZ)V

    .line 19643
    :cond_0
    iget v0, p0, Lcom/c/b/i$s;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v3, :cond_1

    .line 19644
    iget-boolean v0, p0, Lcom/c/b/i$s;->h:Z

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->a(IZ)V

    .line 19646
    :cond_1
    iget v0, p0, Lcom/c/b/i$s;->f:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 19647
    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/c/b/i$s;->i:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 19649
    :cond_2
    iget v0, p0, Lcom/c/b/i$s;->f:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 19650
    const/4 v0, 0x7

    iget-boolean v1, p0, Lcom/c/b/i$s;->j:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 19652
    :cond_3
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 19653
    const/16 v3, 0x3e7

    iget-object v0, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 19652
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 19655
    :cond_4
    invoke-virtual {v2, p1}, Lcom/c/b/as$d$a;->a(Lcom/c/b/h;)V

    .line 19656
    iget-object v0, p0, Lcom/c/b/i$s;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 19657
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 19617
    iget-byte v0, p0, Lcom/c/b/i$s;->l:B

    .line 19618
    if-ne v0, v3, :cond_1

    move v2, v3

    .line 19632
    :cond_0
    :goto_0
    return v2

    .line 19619
    :cond_1
    if-eqz v0, :cond_0

    move v1, v2

    .line 19621
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 19622
    iget-object v0, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 19623
    iput-byte v2, p0, Lcom/c/b/i$s;->l:B

    goto :goto_0

    .line 19621
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 19627
    :cond_3
    invoke-virtual {p0}, Lcom/c/b/i$s;->M()Z

    move-result v0

    if-nez v0, :cond_4

    .line 19628
    iput-byte v2, p0, Lcom/c/b/i$s;->l:B

    goto :goto_0

    .line 19631
    :cond_4
    iput-byte v3, p0, Lcom/c/b/i$s;->l:B

    move v2, v3

    .line 19632
    goto :goto_0
.end method

.method public final b()I
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 19661
    iget v0, p0, Lcom/c/b/i$s;->m:I

    .line 19662
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 19688
    :goto_0
    return v0

    .line 19665
    :cond_0
    iget v0, p0, Lcom/c/b/i$s;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_5

    .line 19666
    invoke-static {v3}, Lcom/c/b/h;->j(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x0

    .line 19669
    :goto_1
    iget v2, p0, Lcom/c/b/i$s;->f:I

    and-int/lit8 v2, v2, 0x2

    if-ne v2, v4, :cond_1

    .line 19670
    invoke-static {v4}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 19673
    :cond_1
    iget v2, p0, Lcom/c/b/i$s;->f:I

    and-int/lit8 v2, v2, 0x4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_2

    .line 19674
    const/4 v2, 0x3

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 19677
    :cond_2
    iget v2, p0, Lcom/c/b/i$s;->f:I

    and-int/lit8 v2, v2, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_3

    .line 19678
    const/4 v2, 0x7

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    :cond_3
    move v2, v0

    .line 19681
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 19682
    const/16 v3, 0x3e7

    iget-object v0, p0, Lcom/c/b/i$s;->k:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v3, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v0, v2

    .line 19681
    add-int/lit8 v1, v1, 0x1

    move v2, v0

    goto :goto_2

    .line 19685
    :cond_4
    invoke-virtual {p0}, Lcom/c/b/i$s;->O()I

    move-result v0

    add-int/2addr v0, v2

    .line 19686
    iget-object v1, p0, Lcom/c/b/i$s;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 19687
    iput v0, p0, Lcom/c/b/i$s;->m:I

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_1
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 19390
    invoke-static {}, Lcom/c/b/i;->y()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$s;

    const-class v2, Lcom/c/b/i$s$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 19315
    iget-object v0, p0, Lcom/c/b/i$s;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 19420
    iget v1, p0, Lcom/c/b/i$s;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 19444
    iget-boolean v0, p0, Lcom/c/b/i$s;->g:Z

    return v0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 19459
    iget v0, p0, Lcom/c/b/i$s;->f:I

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

.method public final k()Z
    .locals 1

    .prologue
    .line 19471
    iget-boolean v0, p0, Lcom/c/b/i$s;->h:Z

    return v0
.end method

.method public final l()Z
    .locals 2

    .prologue
    .line 19487
    iget v0, p0, Lcom/c/b/i$s;->f:I

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

.method public final m()Z
    .locals 1

    .prologue
    .line 19500
    iget-boolean v0, p0, Lcom/c/b/i$s;->i:Z

    return v0
.end method

.method public final n()Z
    .locals 2

    .prologue
    .line 19530
    iget v0, p0, Lcom/c/b/i$s;->f:I

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

.method public final o()Z
    .locals 1

    .prologue
    .line 19557
    iget-boolean v0, p0, Lcom/c/b/i$s;->j:Z

    return v0
.end method

.method public final p()Lcom/c/b/i$s$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 19753
    sget-object v0, Lcom/c/b/i$s;->n:Lcom/c/b/i$s;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$s$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$s$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$s$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$s$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$s$a;->a(Lcom/c/b/i$s;)Lcom/c/b/i$s$a;

    move-result-object v0

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 20640
    sget-object v0, Lcom/c/b/i$s;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 19295
    sget-object v0, Lcom/c/b/i$s;->n:Lcom/c/b/i$s;

    invoke-virtual {v0}, Lcom/c/b/i$s;->p()Lcom/c/b/i$s$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 19295
    invoke-virtual {p0}, Lcom/c/b/i$s;->p()Lcom/c/b/i$s$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 19295
    sget-object v0, Lcom/c/b/i$s;->n:Lcom/c/b/i$s;

    return-object v0
.end method
