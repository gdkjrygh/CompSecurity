.class public final Lcom/c/b/i$i;
.super Lcom/c/b/as$d;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$i$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final k:Lcom/c/b/i$i;


# instance fields
.field private f:I

.field private g:Z

.field private h:Ljava/util/List;

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24676
    new-instance v0, Lcom/c/b/i$i;

    invoke-direct {v0}, Lcom/c/b/i$i;-><init>()V

    sput-object v0, Lcom/c/b/i$i;->k:Lcom/c/b/i$i;

    .line 24683
    new-instance v0, Lcom/c/b/q;

    invoke-direct {v0}, Lcom/c/b/q;-><init>()V

    sput-object v0, Lcom/c/b/i$i;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 23849
    invoke-direct {p0}, Lcom/c/b/as$d;-><init>()V

    .line 24007
    iput-byte v0, p0, Lcom/c/b/i$i;->i:B

    .line 24042
    iput v0, p0, Lcom/c/b/i$i;->j:I

    .line 23850
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/i$i;->g:Z

    .line 23851
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    .line 23852
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$c;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 23847
    invoke-direct {p0, p1}, Lcom/c/b/as$d;-><init>(Lcom/c/b/as$c;)V

    .line 24007
    iput-byte v0, p0, Lcom/c/b/i$i;->i:B

    .line 24042
    iput v0, p0, Lcom/c/b/i$i;->j:I

    .line 23848
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$c;B)V
    .locals 0

    .prologue
    .line 23840
    invoke-direct {p0, p1}, Lcom/c/b/i$i;-><init>(Lcom/c/b/as$c;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    const/4 v6, 0x2

    .line 23862
    invoke-direct {p0}, Lcom/c/b/i$i;-><init>()V

    .line 23864
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v3

    move v1, v0

    .line 23868
    :cond_0
    :goto_0
    if-nez v1, :cond_3

    .line 23869
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v4

    .line 23870
    sparse-switch v4, :sswitch_data_0

    .line 23875
    invoke-virtual {p0, p1, v3, p2, v4}, Lcom/c/b/i$i;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v4

    if-nez v4, :cond_0

    move v1, v2

    .line 23877
    goto :goto_0

    :sswitch_0
    move v1, v2

    .line 23873
    goto :goto_0

    .line 23882
    :sswitch_1
    iget v4, p0, Lcom/c/b/i$i;->f:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/c/b/i$i;->f:I

    .line 23883
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$i;->g:Z
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    .line 23896
    :catch_0
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 23897
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23903
    :catchall_0
    move-exception v0

    :goto_1
    and-int/lit8 v1, v1, 0x2

    if-ne v1, v6, :cond_1

    .line 23904
    iget-object v1, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    .line 23906
    :cond_1
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$i;->e:Lcom/c/b/by;

    .line 23907
    invoke-virtual {p0}, Lcom/c/b/i$i;->L()V

    .line 23903
    throw v0

    .line 23887
    :sswitch_2
    and-int/lit8 v4, v0, 0x2

    if-eq v4, v6, :cond_2

    .line 23888
    :try_start_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    .line 23889
    or-int/lit8 v0, v0, 0x2

    .line 23891
    :cond_2
    iget-object v4, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    sget-object v5, Lcom/c/b/i$ag;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v5, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 23898
    :catch_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 23899
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

    .line 23903
    :cond_3
    and-int/lit8 v0, v0, 0x2

    if-ne v0, v6, :cond_4

    .line 23904
    iget-object v0, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    .line 23906
    :cond_4
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$i;->e:Lcom/c/b/by;

    .line 23907
    invoke-virtual {p0}, Lcom/c/b/i$i;->L()V

    .line 23908
    return-void

    .line 23903
    :catchall_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    goto :goto_1

    .line 23870
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x1f3a -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 23840
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$i;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$i;I)I
    .locals 0

    .prologue
    .line 23840
    iput p1, p0, Lcom/c/b/i$i;->f:I

    return p1
.end method

.method public static a(Lcom/c/b/i$i;)Lcom/c/b/i$i$a;
    .locals 1

    .prologue
    .line 24121
    sget-object v0, Lcom/c/b/i$i;->k:Lcom/c/b/i$i;

    invoke-virtual {v0}, Lcom/c/b/i$i;->j()Lcom/c/b/i$i$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/i$i$a;->a(Lcom/c/b/i$i;)Lcom/c/b/i$i$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 23840
    iput-object p1, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$i;Z)Z
    .locals 0

    .prologue
    .line 23840
    iput-boolean p1, p0, Lcom/c/b/i$i;->g:Z

    return p1
.end method

.method static synthetic b(Lcom/c/b/i$i;)Ljava/util/List;
    .locals 1

    .prologue
    .line 23840
    iget-object v0, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    return-object v0
.end method

.method public static k()Lcom/c/b/i$i;
    .locals 1

    .prologue
    .line 24680
    sget-object v0, Lcom/c/b/i$i;->k:Lcom/c/b/i$i;

    return-object v0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 23840
    new-instance v0, Lcom/c/b/i$i$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$i$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 24031
    invoke-virtual {p0}, Lcom/c/b/i$i;->N()Lcom/c/b/as$d$a;

    move-result-object v2

    .line 24032
    iget v0, p0, Lcom/c/b/i$i;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 24033
    iget-boolean v0, p0, Lcom/c/b/i$i;->g:Z

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(IZ)V

    .line 24035
    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 24036
    const/16 v3, 0x3e7

    iget-object v0, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 24035
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 24038
    :cond_1
    invoke-virtual {v2, p1}, Lcom/c/b/as$d$a;->a(Lcom/c/b/h;)V

    .line 24039
    iget-object v0, p0, Lcom/c/b/i$i;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 24040
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 24009
    iget-byte v0, p0, Lcom/c/b/i$i;->i:B

    .line 24010
    if-ne v0, v3, :cond_1

    move v2, v3

    .line 24024
    :cond_0
    :goto_0
    return v2

    .line 24011
    :cond_1
    if-eqz v0, :cond_0

    move v1, v2

    .line 24013
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 24014
    iget-object v0, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 24015
    iput-byte v2, p0, Lcom/c/b/i$i;->i:B

    goto :goto_0

    .line 24013
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 24019
    :cond_3
    invoke-virtual {p0}, Lcom/c/b/i$i;->M()Z

    move-result v0

    if-nez v0, :cond_4

    .line 24020
    iput-byte v2, p0, Lcom/c/b/i$i;->i:B

    goto :goto_0

    .line 24023
    :cond_4
    iput-byte v3, p0, Lcom/c/b/i$i;->i:B

    move v2, v3

    .line 24024
    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 24044
    iget v0, p0, Lcom/c/b/i$i;->j:I

    .line 24045
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 24059
    :goto_0
    return v0

    .line 24048
    :cond_0
    iget v0, p0, Lcom/c/b/i$i;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_2

    .line 24049
    invoke-static {v3}, Lcom/c/b/h;->j(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x0

    :goto_1
    move v2, v0

    .line 24052
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 24053
    const/16 v3, 0x3e7

    iget-object v0, p0, Lcom/c/b/i$i;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v3, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v0, v2

    .line 24052
    add-int/lit8 v1, v1, 0x1

    move v2, v0

    goto :goto_2

    .line 24056
    :cond_1
    invoke-virtual {p0}, Lcom/c/b/i$i;->O()I

    move-result v0

    add-int/2addr v0, v2

    .line 24057
    iget-object v1, p0, Lcom/c/b/i$i;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 24058
    iput v0, p0, Lcom/c/b/i$i;->j:I

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 23917
    invoke-static {}, Lcom/c/b/i;->E()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$i;

    const-class v2, Lcom/c/b/i$i$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 23857
    iget-object v0, p0, Lcom/c/b/i$i;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 23936
    iget v1, p0, Lcom/c/b/i$i;->f:I

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
    .line 23949
    iget-boolean v0, p0, Lcom/c/b/i$i;->g:Z

    return v0
.end method

.method public final j()Lcom/c/b/i$i$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 24124
    sget-object v0, Lcom/c/b/i$i;->k:Lcom/c/b/i$i;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$i$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$i$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$i$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$i$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$i$a;->a(Lcom/c/b/i$i;)Lcom/c/b/i$i$a;

    move-result-object v0

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 24708
    sget-object v0, Lcom/c/b/i$i;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 23840
    sget-object v0, Lcom/c/b/i$i;->k:Lcom/c/b/i$i;

    invoke-virtual {v0}, Lcom/c/b/i$i;->j()Lcom/c/b/i$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 23840
    invoke-virtual {p0}, Lcom/c/b/i$i;->j()Lcom/c/b/i$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 23840
    sget-object v0, Lcom/c/b/i$i;->k:Lcom/c/b/i$i;

    return-object v0
.end method
