.class public final Lcom/c/b/i$m;
.super Lcom/c/b/as$d;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "m"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$m$a;,
        Lcom/c/b/i$m$c;,
        Lcom/c/b/i$m$b;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final p:Lcom/c/b/i$m;


# instance fields
.field private f:I

.field private g:I

.field private h:Z

.field private i:I

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Ljava/util/List;

.field private n:B

.field private o:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22654
    new-instance v0, Lcom/c/b/i$m;

    invoke-direct {v0}, Lcom/c/b/i$m;-><init>()V

    sput-object v0, Lcom/c/b/i$m;->p:Lcom/c/b/i$m;

    .line 22661
    new-instance v0, Lcom/c/b/u;

    invoke-direct {v0}, Lcom/c/b/u;-><init>()V

    sput-object v0, Lcom/c/b/i$m;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    const/4 v0, 0x0

    .line 20894
    invoke-direct {p0}, Lcom/c/b/as$d;-><init>()V

    .line 21505
    iput-byte v1, p0, Lcom/c/b/i$m;->n:B

    .line 21555
    iput v1, p0, Lcom/c/b/i$m;->o:I

    .line 20895
    iput v0, p0, Lcom/c/b/i$m;->g:I

    .line 20896
    iput-boolean v0, p0, Lcom/c/b/i$m;->h:Z

    .line 20897
    iput v0, p0, Lcom/c/b/i$m;->i:I

    .line 20898
    iput-boolean v0, p0, Lcom/c/b/i$m;->j:Z

    .line 20899
    iput-boolean v0, p0, Lcom/c/b/i$m;->k:Z

    .line 20900
    iput-boolean v0, p0, Lcom/c/b/i$m;->l:Z

    .line 20901
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    .line 20902
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$c;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 20892
    invoke-direct {p0, p1}, Lcom/c/b/as$d;-><init>(Lcom/c/b/as$c;)V

    .line 21505
    iput-byte v0, p0, Lcom/c/b/i$m;->n:B

    .line 21555
    iput v0, p0, Lcom/c/b/i$m;->o:I

    .line 20893
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$c;B)V
    .locals 0

    .prologue
    .line 20885
    invoke-direct {p0, p1}, Lcom/c/b/i$m;-><init>(Lcom/c/b/as$c;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/16 v6, 0x40

    const/4 v2, 0x1

    .line 20912
    invoke-direct {p0}, Lcom/c/b/i$m;-><init>()V

    .line 20914
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v3

    move v1, v0

    .line 20918
    :cond_0
    :goto_0
    if-nez v1, :cond_5

    .line 20919
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v4

    .line 20920
    sparse-switch v4, :sswitch_data_0

    .line 20925
    invoke-virtual {p0, p1, v3, p2, v4}, Lcom/c/b/i$m;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v4

    if-nez v4, :cond_0

    move v1, v2

    .line 20927
    goto :goto_0

    :sswitch_0
    move v1, v2

    .line 20923
    goto :goto_0

    .line 20932
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->n()I

    move-result v4

    .line 20933
    invoke-static {v4}, Lcom/c/b/i$m$b;->a(I)Lcom/c/b/i$m$b;

    move-result-object v5

    .line 20934
    if-nez v5, :cond_2

    .line 20935
    const/4 v5, 0x1

    invoke-virtual {v3, v5, v4}, Lcom/c/b/by$a;->a(II)Lcom/c/b/by$a;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    .line 20983
    :catch_0
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 20984
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20990
    :catchall_0
    move-exception v0

    :goto_1
    and-int/lit8 v1, v1, 0x40

    if-ne v1, v6, :cond_1

    .line 20991
    iget-object v1, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    .line 20993
    :cond_1
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$m;->e:Lcom/c/b/by;

    .line 20994
    invoke-virtual {p0}, Lcom/c/b/i$m;->L()V

    .line 20990
    throw v0

    .line 20937
    :cond_2
    :try_start_2
    iget v5, p0, Lcom/c/b/i$m;->f:I

    or-int/lit8 v5, v5, 0x1

    iput v5, p0, Lcom/c/b/i$m;->f:I

    .line 20938
    iput v4, p0, Lcom/c/b/i$m;->g:I
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 20985
    :catch_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 20986
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

    .line 20943
    :sswitch_2
    :try_start_4
    iget v4, p0, Lcom/c/b/i$m;->f:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lcom/c/b/i$m;->f:I

    .line 20944
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$m;->h:Z

    goto :goto_0

    .line 20990
    :catchall_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    goto :goto_1

    .line 20948
    :sswitch_3
    iget v4, p0, Lcom/c/b/i$m;->f:I

    or-int/lit8 v4, v4, 0x10

    iput v4, p0, Lcom/c/b/i$m;->f:I

    .line 20949
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$m;->k:Z

    goto/16 :goto_0

    .line 20953
    :sswitch_4
    iget v4, p0, Lcom/c/b/i$m;->f:I

    or-int/lit8 v4, v4, 0x8

    iput v4, p0, Lcom/c/b/i$m;->f:I

    .line 20954
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$m;->j:Z

    goto/16 :goto_0

    .line 20958
    :sswitch_5
    invoke-virtual {p1}, Lcom/c/b/g;->n()I

    move-result v4

    .line 20959
    invoke-static {v4}, Lcom/c/b/i$m$c;->a(I)Lcom/c/b/i$m$c;

    move-result-object v5

    .line 20960
    if-nez v5, :cond_3

    .line 20961
    const/4 v5, 0x6

    invoke-virtual {v3, v5, v4}, Lcom/c/b/by$a;->a(II)Lcom/c/b/by$a;

    goto/16 :goto_0

    .line 20963
    :cond_3
    iget v5, p0, Lcom/c/b/i$m;->f:I

    or-int/lit8 v5, v5, 0x4

    iput v5, p0, Lcom/c/b/i$m;->f:I

    .line 20964
    iput v4, p0, Lcom/c/b/i$m;->i:I

    goto/16 :goto_0

    .line 20969
    :sswitch_6
    iget v4, p0, Lcom/c/b/i$m;->f:I

    or-int/lit8 v4, v4, 0x20

    iput v4, p0, Lcom/c/b/i$m;->f:I

    .line 20970
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$m;->l:Z

    goto/16 :goto_0

    .line 20974
    :sswitch_7
    and-int/lit8 v4, v0, 0x40

    if-eq v4, v6, :cond_4

    .line 20975
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    .line 20976
    or-int/lit8 v0, v0, 0x40

    .line 20978
    :cond_4
    iget-object v4, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    sget-object v5, Lcom/c/b/i$ag;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v5, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_0

    .line 20990
    :cond_5
    and-int/lit8 v0, v0, 0x40

    if-ne v0, v6, :cond_6

    .line 20991
    iget-object v0, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    .line 20993
    :cond_6
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$m;->e:Lcom/c/b/by;

    .line 20994
    invoke-virtual {p0}, Lcom/c/b/i$m;->L()V

    .line 20995
    return-void

    .line 20920
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x28 -> :sswitch_4
        0x30 -> :sswitch_5
        0x50 -> :sswitch_6
        0x1f3a -> :sswitch_7
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 20885
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$m;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$m;I)I
    .locals 0

    .prologue
    .line 20885
    iput p1, p0, Lcom/c/b/i$m;->g:I

    return p1
.end method

.method public static a(Lcom/c/b/i$m;)Lcom/c/b/i$m$a;
    .locals 1

    .prologue
    .line 21654
    sget-object v0, Lcom/c/b/i$m;->p:Lcom/c/b/i$m;

    invoke-virtual {v0}, Lcom/c/b/i$m;->x()Lcom/c/b/i$m$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/i$m$a;->a(Lcom/c/b/i$m;)Lcom/c/b/i$m$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$m;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 20885
    iput-object p1, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$m;Z)Z
    .locals 0

    .prologue
    .line 20885
    iput-boolean p1, p0, Lcom/c/b/i$m;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/c/b/i$m;I)I
    .locals 0

    .prologue
    .line 20885
    iput p1, p0, Lcom/c/b/i$m;->i:I

    return p1
.end method

.method static synthetic b(Lcom/c/b/i$m;)Ljava/util/List;
    .locals 1

    .prologue
    .line 20885
    iget-object v0, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/i$m;Z)Z
    .locals 0

    .prologue
    .line 20885
    iput-boolean p1, p0, Lcom/c/b/i$m;->j:Z

    return p1
.end method

.method static synthetic c(Lcom/c/b/i$m;I)I
    .locals 0

    .prologue
    .line 20885
    iput p1, p0, Lcom/c/b/i$m;->f:I

    return p1
.end method

.method static synthetic c(Lcom/c/b/i$m;Z)Z
    .locals 0

    .prologue
    .line 20885
    iput-boolean p1, p0, Lcom/c/b/i$m;->k:Z

    return p1
.end method

.method static synthetic d(Lcom/c/b/i$m;Z)Z
    .locals 0

    .prologue
    .line 20885
    iput-boolean p1, p0, Lcom/c/b/i$m;->l:Z

    return p1
.end method

.method public static y()Lcom/c/b/i$m;
    .locals 1

    .prologue
    .line 22658
    sget-object v0, Lcom/c/b/i$m;->p:Lcom/c/b/i$m;

    return-object v0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 20885
    new-instance v0, Lcom/c/b/i$m$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$m$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v1, 0x1

    .line 21529
    invoke-virtual {p0}, Lcom/c/b/i$m;->N()Lcom/c/b/as$d$a;

    move-result-object v2

    .line 21530
    iget v0, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 21531
    iget v0, p0, Lcom/c/b/i$m;->g:I

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->c(II)V

    .line 21533
    :cond_0
    iget v0, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v3, :cond_1

    .line 21534
    iget-boolean v0, p0, Lcom/c/b/i$m;->h:Z

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->a(IZ)V

    .line 21536
    :cond_1
    iget v0, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_2

    .line 21537
    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/c/b/i$m;->k:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 21539
    :cond_2
    iget v0, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 21540
    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/c/b/i$m;->j:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 21542
    :cond_3
    iget v0, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 21543
    const/4 v0, 0x6

    iget v1, p0, Lcom/c/b/i$m;->i:I

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->c(II)V

    .line 21545
    :cond_4
    iget v0, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 21546
    const/16 v0, 0xa

    iget-boolean v1, p0, Lcom/c/b/i$m;->l:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 21548
    :cond_5
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 21549
    const/16 v3, 0x3e7

    iget-object v0, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 21548
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 21551
    :cond_6
    invoke-virtual {v2, p1}, Lcom/c/b/as$d$a;->a(Lcom/c/b/h;)V

    .line 21552
    iget-object v0, p0, Lcom/c/b/i$m;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 21553
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 21507
    iget-byte v0, p0, Lcom/c/b/i$m;->n:B

    .line 21508
    if-ne v0, v3, :cond_1

    move v2, v3

    .line 21522
    :cond_0
    :goto_0
    return v2

    .line 21509
    :cond_1
    if-eqz v0, :cond_0

    move v1, v2

    .line 21511
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 21512
    iget-object v0, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 21513
    iput-byte v2, p0, Lcom/c/b/i$m;->n:B

    goto :goto_0

    .line 21511
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 21517
    :cond_3
    invoke-virtual {p0}, Lcom/c/b/i$m;->M()Z

    move-result v0

    if-nez v0, :cond_4

    .line 21518
    iput-byte v2, p0, Lcom/c/b/i$m;->n:B

    goto :goto_0

    .line 21521
    :cond_4
    iput-byte v3, p0, Lcom/c/b/i$m;->n:B

    move v2, v3

    .line 21522
    goto :goto_0
.end method

.method public final b()I
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 21557
    iget v0, p0, Lcom/c/b/i$m;->o:I

    .line 21558
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 21592
    :goto_0
    return v0

    .line 21561
    :cond_0
    iget v0, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_7

    .line 21562
    iget v0, p0, Lcom/c/b/i$m;->g:I

    invoke-static {v3, v0}, Lcom/c/b/h;->f(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 21565
    :goto_1
    iget v2, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v2, v2, 0x2

    if-ne v2, v4, :cond_1

    .line 21566
    invoke-static {v4}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 21569
    :cond_1
    iget v2, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v2, v2, 0x10

    const/16 v3, 0x10

    if-ne v2, v3, :cond_2

    .line 21570
    const/4 v2, 0x3

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 21573
    :cond_2
    iget v2, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v2, v2, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_3

    .line 21574
    const/4 v2, 0x5

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 21577
    :cond_3
    iget v2, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v2, v2, 0x4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_4

    .line 21578
    const/4 v2, 0x6

    iget v3, p0, Lcom/c/b/i$m;->i:I

    invoke-static {v2, v3}, Lcom/c/b/h;->f(II)I

    move-result v2

    add-int/2addr v0, v2

    .line 21581
    :cond_4
    iget v2, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v2, v2, 0x20

    const/16 v3, 0x20

    if-ne v2, v3, :cond_5

    .line 21582
    const/16 v2, 0xa

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    :cond_5
    move v2, v0

    .line 21585
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 21586
    const/16 v3, 0x3e7

    iget-object v0, p0, Lcom/c/b/i$m;->m:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v3, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v0, v2

    .line 21585
    add-int/lit8 v1, v1, 0x1

    move v2, v0

    goto :goto_2

    .line 21589
    :cond_6
    invoke-virtual {p0}, Lcom/c/b/i$m;->O()I

    move-result v0

    add-int/2addr v0, v2

    .line 21590
    iget-object v1, p0, Lcom/c/b/i$m;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 21591
    iput v0, p0, Lcom/c/b/i$m;->o:I

    goto/16 :goto_0

    :cond_7
    move v0, v1

    goto :goto_1
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 21004
    invoke-static {}, Lcom/c/b/i;->A()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$m;

    const-class v2, Lcom/c/b/i$m$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 20907
    iget-object v0, p0, Lcom/c/b/i$m;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 21241
    iget v1, p0, Lcom/c/b/i$m;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Lcom/c/b/i$m$b;
    .locals 1

    .prologue
    .line 21254
    iget v0, p0, Lcom/c/b/i$m;->g:I

    invoke-static {v0}, Lcom/c/b/i$m$b;->a(I)Lcom/c/b/i$m$b;

    move-result-object v0

    .line 21255
    if-nez v0, :cond_0

    sget-object v0, Lcom/c/b/i$m$b;->a:Lcom/c/b/i$m$b;

    :cond_0
    return-object v0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 21272
    iget v0, p0, Lcom/c/b/i$m;->f:I

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
    .line 21286
    iget-boolean v0, p0, Lcom/c/b/i$m;->h:Z

    return v0
.end method

.method public final l()Z
    .locals 2

    .prologue
    .line 21307
    iget v0, p0, Lcom/c/b/i$m;->f:I

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

.method public final m()Lcom/c/b/i$m$c;
    .locals 1

    .prologue
    .line 21325
    iget v0, p0, Lcom/c/b/i$m;->i:I

    invoke-static {v0}, Lcom/c/b/i$m$c;->a(I)Lcom/c/b/i$m$c;

    move-result-object v0

    .line 21326
    if-nez v0, :cond_0

    sget-object v0, Lcom/c/b/i$m$c;->a:Lcom/c/b/i$m$c;

    :cond_0
    return-object v0
.end method

.method public final n()Z
    .locals 2

    .prologue
    .line 21362
    iget v0, p0, Lcom/c/b/i$m;->f:I

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
    .line 21395
    iget-boolean v0, p0, Lcom/c/b/i$m;->j:Z

    return v0
.end method

.method public final p()Z
    .locals 2

    .prologue
    .line 21411
    iget v0, p0, Lcom/c/b/i$m;->f:I

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
    .line 21424
    iget-boolean v0, p0, Lcom/c/b/i$m;->k:Z

    return v0
.end method

.method public final r()Z
    .locals 2

    .prologue
    .line 21437
    iget v0, p0, Lcom/c/b/i$m;->f:I

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
    .line 21447
    iget-boolean v0, p0, Lcom/c/b/i$m;->l:Z

    return v0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 22686
    sget-object v0, Lcom/c/b/i$m;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 20885
    sget-object v0, Lcom/c/b/i$m;->p:Lcom/c/b/i$m;

    invoke-virtual {v0}, Lcom/c/b/i$m;->x()Lcom/c/b/i$m$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 20885
    invoke-virtual {p0}, Lcom/c/b/i$m;->x()Lcom/c/b/i$m$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 20885
    sget-object v0, Lcom/c/b/i$m;->p:Lcom/c/b/i$m;

    return-object v0
.end method

.method public final x()Lcom/c/b/i$m$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 21657
    sget-object v0, Lcom/c/b/i$m;->p:Lcom/c/b/i$m;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$m$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$m$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$m$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$m$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$m$a;->a(Lcom/c/b/i$m;)Lcom/c/b/i$m$a;

    move-result-object v0

    goto :goto_0
.end method
