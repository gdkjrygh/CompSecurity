.class public final Lcom/c/b/i$e;
.super Lcom/c/b/as$d;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$e$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final l:Lcom/c/b/i$e;


# instance fields
.field private f:I

.field private g:Z

.field private h:Z

.field private i:Ljava/util/List;

.field private j:B

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23724
    new-instance v0, Lcom/c/b/i$e;

    invoke-direct {v0}, Lcom/c/b/i$e;-><init>()V

    sput-object v0, Lcom/c/b/i$e;->l:Lcom/c/b/i$e;

    .line 23731
    new-instance v0, Lcom/c/b/o;

    invoke-direct {v0}, Lcom/c/b/o;-><init>()V

    sput-object v0, Lcom/c/b/i$e;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 22798
    invoke-direct {p0}, Lcom/c/b/as$d;-><init>()V

    .line 22987
    iput-byte v0, p0, Lcom/c/b/i$e;->j:B

    .line 23025
    iput v0, p0, Lcom/c/b/i$e;->k:I

    .line 22799
    iput-boolean v1, p0, Lcom/c/b/i$e;->g:Z

    .line 22800
    iput-boolean v1, p0, Lcom/c/b/i$e;->h:Z

    .line 22801
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    .line 22802
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$c;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 22796
    invoke-direct {p0, p1}, Lcom/c/b/as$d;-><init>(Lcom/c/b/as$c;)V

    .line 22987
    iput-byte v0, p0, Lcom/c/b/i$e;->j:B

    .line 23025
    iput v0, p0, Lcom/c/b/i$e;->k:I

    .line 22797
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$c;B)V
    .locals 0

    .prologue
    .line 22789
    invoke-direct {p0, p1}, Lcom/c/b/i$e;-><init>(Lcom/c/b/as$c;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    const/4 v6, 0x4

    .line 22812
    invoke-direct {p0}, Lcom/c/b/i$e;-><init>()V

    .line 22814
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v3

    move v1, v0

    .line 22818
    :cond_0
    :goto_0
    if-nez v1, :cond_3

    .line 22819
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v4

    .line 22820
    sparse-switch v4, :sswitch_data_0

    .line 22825
    invoke-virtual {p0, p1, v3, p2, v4}, Lcom/c/b/i$e;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v4

    if-nez v4, :cond_0

    move v1, v2

    .line 22827
    goto :goto_0

    :sswitch_0
    move v1, v2

    .line 22823
    goto :goto_0

    .line 22832
    :sswitch_1
    iget v4, p0, Lcom/c/b/i$e;->f:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/c/b/i$e;->f:I

    .line 22833
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$e;->g:Z
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    .line 22851
    :catch_0
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 22852
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22858
    :catchall_0
    move-exception v0

    :goto_1
    and-int/lit8 v1, v1, 0x4

    if-ne v1, v6, :cond_1

    .line 22859
    iget-object v1, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    .line 22861
    :cond_1
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$e;->e:Lcom/c/b/by;

    .line 22862
    invoke-virtual {p0}, Lcom/c/b/i$e;->L()V

    .line 22858
    throw v0

    .line 22837
    :sswitch_2
    :try_start_2
    iget v4, p0, Lcom/c/b/i$e;->f:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lcom/c/b/i$e;->f:I

    .line 22838
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$e;->h:Z
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 22853
    :catch_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 22854
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

    .line 22842
    :sswitch_3
    and-int/lit8 v4, v0, 0x4

    if-eq v4, v6, :cond_2

    .line 22843
    :try_start_4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    .line 22844
    or-int/lit8 v0, v0, 0x4

    .line 22846
    :cond_2
    iget-object v4, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    sget-object v5, Lcom/c/b/i$ag;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v5, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_0

    .line 22858
    :catchall_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    goto :goto_1

    :cond_3
    and-int/lit8 v0, v0, 0x4

    if-ne v0, v6, :cond_4

    .line 22859
    iget-object v0, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    .line 22861
    :cond_4
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$e;->e:Lcom/c/b/by;

    .line 22862
    invoke-virtual {p0}, Lcom/c/b/i$e;->L()V

    .line 22863
    return-void

    .line 22820
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x10 -> :sswitch_1
        0x18 -> :sswitch_2
        0x1f3a -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 22789
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$e;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$e;I)I
    .locals 0

    .prologue
    .line 22789
    iput p1, p0, Lcom/c/b/i$e;->f:I

    return p1
.end method

.method public static a(Lcom/c/b/i$e;)Lcom/c/b/i$e$a;
    .locals 1

    .prologue
    .line 23108
    sget-object v0, Lcom/c/b/i$e;->l:Lcom/c/b/i$e;

    invoke-virtual {v0}, Lcom/c/b/i$e;->l()Lcom/c/b/i$e$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/i$e$a;->a(Lcom/c/b/i$e;)Lcom/c/b/i$e$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 22789
    iput-object p1, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$e;Z)Z
    .locals 0

    .prologue
    .line 22789
    iput-boolean p1, p0, Lcom/c/b/i$e;->g:Z

    return p1
.end method

.method static synthetic b(Lcom/c/b/i$e;)Ljava/util/List;
    .locals 1

    .prologue
    .line 22789
    iget-object v0, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/i$e;Z)Z
    .locals 0

    .prologue
    .line 22789
    iput-boolean p1, p0, Lcom/c/b/i$e;->h:Z

    return p1
.end method

.method public static m()Lcom/c/b/i$e;
    .locals 1

    .prologue
    .line 23728
    sget-object v0, Lcom/c/b/i$e;->l:Lcom/c/b/i$e;

    return-object v0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 22789
    new-instance v0, Lcom/c/b/i$e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$e$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    .line 23011
    invoke-virtual {p0}, Lcom/c/b/i$e;->N()Lcom/c/b/as$d$a;

    move-result-object v2

    .line 23012
    iget v0, p0, Lcom/c/b/i$e;->f:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 23013
    iget-boolean v0, p0, Lcom/c/b/i$e;->g:Z

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->a(IZ)V

    .line 23015
    :cond_0
    iget v0, p0, Lcom/c/b/i$e;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v3, :cond_1

    .line 23016
    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/c/b/i$e;->h:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 23018
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 23019
    const/16 v3, 0x3e7

    iget-object v0, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 23018
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 23021
    :cond_2
    invoke-virtual {v2, p1}, Lcom/c/b/as$d$a;->a(Lcom/c/b/h;)V

    .line 23022
    iget-object v0, p0, Lcom/c/b/i$e;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 23023
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 22989
    iget-byte v0, p0, Lcom/c/b/i$e;->j:B

    .line 22990
    if-ne v0, v3, :cond_1

    move v2, v3

    .line 23004
    :cond_0
    :goto_0
    return v2

    .line 22991
    :cond_1
    if-eqz v0, :cond_0

    move v1, v2

    .line 22993
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 22994
    iget-object v0, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 22995
    iput-byte v2, p0, Lcom/c/b/i$e;->j:B

    goto :goto_0

    .line 22993
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 22999
    :cond_3
    invoke-virtual {p0}, Lcom/c/b/i$e;->M()Z

    move-result v0

    if-nez v0, :cond_4

    .line 23000
    iput-byte v2, p0, Lcom/c/b/i$e;->j:B

    goto :goto_0

    .line 23003
    :cond_4
    iput-byte v3, p0, Lcom/c/b/i$e;->j:B

    move v2, v3

    .line 23004
    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v1, 0x0

    .line 23027
    iget v0, p0, Lcom/c/b/i$e;->k:I

    .line 23028
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 23046
    :goto_0
    return v0

    .line 23031
    :cond_0
    iget v0, p0, Lcom/c/b/i$e;->f:I

    and-int/lit8 v0, v0, 0x1

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    .line 23032
    invoke-static {v3}, Lcom/c/b/h;->j(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x0

    .line 23035
    :goto_1
    iget v2, p0, Lcom/c/b/i$e;->f:I

    and-int/lit8 v2, v2, 0x2

    if-ne v2, v3, :cond_1

    .line 23036
    const/4 v2, 0x3

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    :cond_1
    move v2, v0

    .line 23039
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 23040
    const/16 v3, 0x3e7

    iget-object v0, p0, Lcom/c/b/i$e;->i:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v3, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v0, v2

    .line 23039
    add-int/lit8 v1, v1, 0x1

    move v2, v0

    goto :goto_2

    .line 23043
    :cond_2
    invoke-virtual {p0}, Lcom/c/b/i$e;->O()I

    move-result v0

    add-int/2addr v0, v2

    .line 23044
    iget-object v1, p0, Lcom/c/b/i$e;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 23045
    iput v0, p0, Lcom/c/b/i$e;->k:I

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 22872
    invoke-static {}, Lcom/c/b/i;->C()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$e;

    const-class v2, Lcom/c/b/i$e$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 22807
    iget-object v0, p0, Lcom/c/b/i$e;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 22889
    iget v1, p0, Lcom/c/b/i$e;->f:I

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
    .line 22900
    iget-boolean v0, p0, Lcom/c/b/i$e;->g:Z

    return v0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 22916
    iget v0, p0, Lcom/c/b/i$e;->f:I

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
    .line 22929
    iget-boolean v0, p0, Lcom/c/b/i$e;->h:Z

    return v0
.end method

.method public final l()Lcom/c/b/i$e$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 23111
    sget-object v0, Lcom/c/b/i$e;->l:Lcom/c/b/i$e;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$e$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$e$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$e$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$e$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$e$a;->a(Lcom/c/b/i$e;)Lcom/c/b/i$e$a;

    move-result-object v0

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 23756
    sget-object v0, Lcom/c/b/i$e;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 22789
    sget-object v0, Lcom/c/b/i$e;->l:Lcom/c/b/i$e;

    invoke-virtual {v0}, Lcom/c/b/i$e;->l()Lcom/c/b/i$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 22789
    invoke-virtual {p0}, Lcom/c/b/i$e;->l()Lcom/c/b/i$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 22789
    sget-object v0, Lcom/c/b/i$e;->l:Lcom/c/b/i$e;

    return-object v0
.end method
