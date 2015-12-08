.class public final Lcom/c/b/i$g;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$g$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final l:Lcom/c/b/i$g;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private h:I

.field private i:Lcom/c/b/i$i;

.field private j:B

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13466
    new-instance v0, Lcom/c/b/i$g;

    invoke-direct {v0}, Lcom/c/b/i$g;-><init>()V

    sput-object v0, Lcom/c/b/i$g;->l:Lcom/c/b/i$g;

    .line 13473
    new-instance v0, Lcom/c/b/p;

    invoke-direct {v0}, Lcom/c/b/p;-><init>()V

    sput-object v0, Lcom/c/b/i$g;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 12799
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 12959
    iput-byte v0, p0, Lcom/c/b/i$g;->j:B

    .line 12989
    iput v0, p0, Lcom/c/b/i$g;->k:I

    .line 12800
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$g;->g:Ljava/lang/Object;

    .line 12801
    const/4 v0, 0x0

    iput v0, p0, Lcom/c/b/i$g;->h:I

    .line 12802
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 12797
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 12959
    iput-byte v0, p0, Lcom/c/b/i$g;->j:B

    .line 12989
    iput v0, p0, Lcom/c/b/i$g;->k:I

    .line 12798
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 12791
    invoke-direct {p0, p1}, Lcom/c/b/i$g;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    .line 12812
    invoke-direct {p0}, Lcom/c/b/i$g;-><init>()V

    .line 12813
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v4

    .line 12817
    const/4 v0, 0x0

    move v2, v0

    .line 12818
    :cond_0
    :goto_0
    if-nez v2, :cond_2

    .line 12819
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v0

    .line 12820
    sparse-switch v0, :sswitch_data_0

    .line 12825
    invoke-virtual {p0, p1, v4, p2, v0}, Lcom/c/b/i$g;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v0

    if-nez v0, :cond_0

    move v2, v3

    .line 12827
    goto :goto_0

    :sswitch_0
    move v2, v3

    .line 12823
    goto :goto_0

    .line 12832
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 12833
    iget v1, p0, Lcom/c/b/i$g;->f:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/c/b/i$g;->f:I

    .line 12834
    iput-object v0, p0, Lcom/c/b/i$g;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 12857
    :catch_0
    move-exception v0

    .line 12858
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12864
    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$g;->e:Lcom/c/b/by;

    .line 12865
    invoke-virtual {p0}, Lcom/c/b/i$g;->L()V

    .line 12864
    throw v0

    .line 12838
    :sswitch_2
    :try_start_2
    iget v0, p0, Lcom/c/b/i$g;->f:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$g;->f:I

    .line 12839
    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v0

    iput v0, p0, Lcom/c/b/i$g;->h:I
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 12859
    :catch_1
    move-exception v0

    .line 12860
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

    .line 12843
    :sswitch_3
    const/4 v0, 0x0

    .line 12844
    :try_start_4
    iget v1, p0, Lcom/c/b/i$g;->f:I

    and-int/lit8 v1, v1, 0x4

    const/4 v5, 0x4

    if-ne v1, v5, :cond_3

    .line 12845
    iget-object v0, p0, Lcom/c/b/i$g;->i:Lcom/c/b/i$i;

    invoke-virtual {v0}, Lcom/c/b/i$i;->j()Lcom/c/b/i$i$a;

    move-result-object v0

    move-object v1, v0

    .line 12847
    :goto_1
    sget-object v0, Lcom/c/b/i$i;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v0, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$i;

    iput-object v0, p0, Lcom/c/b/i$g;->i:Lcom/c/b/i$i;

    .line 12848
    if-eqz v1, :cond_1

    .line 12849
    iget-object v0, p0, Lcom/c/b/i$g;->i:Lcom/c/b/i$i;

    invoke-virtual {v1, v0}, Lcom/c/b/i$i$a;->a(Lcom/c/b/i$i;)Lcom/c/b/i$i$a;

    .line 12850
    invoke-virtual {v1}, Lcom/c/b/i$i$a;->g()Lcom/c/b/i$i;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$g;->i:Lcom/c/b/i$i;

    .line 12852
    :cond_1
    iget v0, p0, Lcom/c/b/i$g;->f:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/c/b/i$g;->f:I
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 12864
    :cond_2
    invoke-virtual {v4}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$g;->e:Lcom/c/b/by;

    .line 12865
    invoke-virtual {p0}, Lcom/c/b/i$g;->L()V

    .line 12866
    return-void

    :cond_3
    move-object v1, v0

    goto :goto_1

    .line 12820
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x10 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 12791
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$g;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$g;I)I
    .locals 0

    .prologue
    .line 12791
    iput p1, p0, Lcom/c/b/i$g;->h:I

    return p1
.end method

.method static synthetic a(Lcom/c/b/i$g;Lcom/c/b/i$i;)Lcom/c/b/i$i;
    .locals 0

    .prologue
    .line 12791
    iput-object p1, p0, Lcom/c/b/i$g;->i:Lcom/c/b/i$i;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$g;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 12791
    iget-object v0, p0, Lcom/c/b/i$g;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 12791
    iput-object p1, p0, Lcom/c/b/i$g;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$g;I)I
    .locals 0

    .prologue
    .line 12791
    iput p1, p0, Lcom/c/b/i$g;->f:I

    return p1
.end method

.method public static n()Lcom/c/b/i$g$a;
    .locals 1

    .prologue
    .line 13068
    sget-object v0, Lcom/c/b/i$g;->l:Lcom/c/b/i$g;

    invoke-direct {v0}, Lcom/c/b/i$g;->q()Lcom/c/b/i$g$a;

    move-result-object v0

    return-object v0
.end method

.method public static o()Lcom/c/b/i$g;
    .locals 1

    .prologue
    .line 13470
    sget-object v0, Lcom/c/b/i$g;->l:Lcom/c/b/i$g;

    return-object v0
.end method

.method private p()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 12911
    iget-object v0, p0, Lcom/c/b/i$g;->g:Ljava/lang/Object;

    .line 12912
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 12913
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 12916
    iput-object v0, p0, Lcom/c/b/i$g;->g:Ljava/lang/Object;

    .line 12919
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private q()Lcom/c/b/i$g$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 13074
    sget-object v0, Lcom/c/b/i$g;->l:Lcom/c/b/i$g;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$g$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$g$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$g$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$g$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$g$a;->a(Lcom/c/b/i$g;)Lcom/c/b/i$g$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 12791
    new-instance v0, Lcom/c/b/i$g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$g$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 12977
    iget v0, p0, Lcom/c/b/i$g;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 12978
    invoke-direct {p0}, Lcom/c/b/i$g;->p()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 12980
    :cond_0
    iget v0, p0, Lcom/c/b/i$g;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 12981
    iget v0, p0, Lcom/c/b/i$g;->h:I

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->a(II)V

    .line 12983
    :cond_1
    iget v0, p0, Lcom/c/b/i$g;->f:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 12984
    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/c/b/i$g;->m()Lcom/c/b/i$i;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 12986
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$g;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 12987
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 12961
    iget-byte v2, p0, Lcom/c/b/i$g;->j:B

    .line 12962
    if-ne v2, v0, :cond_0

    .line 12972
    :goto_0
    return v0

    .line 12963
    :cond_0
    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 12965
    :cond_1
    invoke-virtual {p0}, Lcom/c/b/i$g;->l()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 12966
    invoke-virtual {p0}, Lcom/c/b/i$g;->m()Lcom/c/b/i$i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/i$i;->a()Z

    move-result v2

    if-nez v2, :cond_2

    .line 12967
    iput-byte v1, p0, Lcom/c/b/i$g;->j:B

    move v0, v1

    .line 12968
    goto :goto_0

    .line 12971
    :cond_2
    iput-byte v0, p0, Lcom/c/b/i$g;->j:B

    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 12991
    iget v0, p0, Lcom/c/b/i$g;->k:I

    .line 12992
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 13009
    :goto_0
    return v0

    .line 12994
    :cond_0
    const/4 v0, 0x0

    .line 12995
    iget v1, p0, Lcom/c/b/i$g;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 12996
    invoke-direct {p0}, Lcom/c/b/i$g;->p()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 12999
    :cond_1
    iget v1, p0, Lcom/c/b/i$g;->f:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_2

    .line 13000
    iget v1, p0, Lcom/c/b/i$g;->h:I

    invoke-static {v3, v1}, Lcom/c/b/h;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 13003
    :cond_2
    iget v1, p0, Lcom/c/b/i$g;->f:I

    and-int/lit8 v1, v1, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_3

    .line 13004
    const/4 v1, 0x3

    invoke-virtual {p0}, Lcom/c/b/i$g;->m()Lcom/c/b/i$i;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v1

    add-int/2addr v0, v1

    .line 13007
    :cond_3
    iget-object v1, p0, Lcom/c/b/i$g;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 13008
    iput v0, p0, Lcom/c/b/i$g;->k:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 12875
    invoke-static {}, Lcom/c/b/i;->q()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$g;

    const-class v2, Lcom/c/b/i$g$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 12807
    iget-object v0, p0, Lcom/c/b/i$g;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 12887
    iget v1, p0, Lcom/c/b/i$g;->f:I

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
    .line 12893
    iget-object v0, p0, Lcom/c/b/i$g;->g:Ljava/lang/Object;

    .line 12894
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 12895
    check-cast v0, Ljava/lang/String;

    .line 12903
    :goto_0
    return-object v0

    .line 12897
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 12899
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 12900
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12901
    iput-object v1, p0, Lcom/c/b/i$g;->g:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 12903
    goto :goto_0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 12929
    iget v0, p0, Lcom/c/b/i$g;->f:I

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

.method public final k()I
    .locals 1

    .prologue
    .line 12935
    iget v0, p0, Lcom/c/b/i$g;->h:I

    return v0
.end method

.method public final l()Z
    .locals 2

    .prologue
    .line 12944
    iget v0, p0, Lcom/c/b/i$g;->f:I

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

.method public final m()Lcom/c/b/i$i;
    .locals 1

    .prologue
    .line 12950
    iget-object v0, p0, Lcom/c/b/i$g;->i:Lcom/c/b/i$i;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$i;->k()Lcom/c/b/i$i;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/i$g;->i:Lcom/c/b/i$i;

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 13498
    sget-object v0, Lcom/c/b/i$g;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 12791
    sget-object v0, Lcom/c/b/i$g;->l:Lcom/c/b/i$g;

    invoke-direct {v0}, Lcom/c/b/i$g;->q()Lcom/c/b/i$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 12791
    invoke-direct {p0}, Lcom/c/b/i$g;->q()Lcom/c/b/i$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 12791
    sget-object v0, Lcom/c/b/i$g;->l:Lcom/c/b/i$g;

    return-object v0
.end method
