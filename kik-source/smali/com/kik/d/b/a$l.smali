.class public final Lcom/kik/d/b/a$l;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/d/b/a$l$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final k:Lcom/kik/d/b/a$l;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private volatile h:Ljava/lang/Object;

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 7255
    new-instance v0, Lcom/kik/d/b/a$l;

    invoke-direct {v0}, Lcom/kik/d/b/a$l;-><init>()V

    sput-object v0, Lcom/kik/d/b/a$l;->k:Lcom/kik/d/b/a$l;

    .line 7262
    new-instance v0, Lcom/kik/d/b/j;

    invoke-direct {v0}, Lcom/kik/d/b/j;-><init>()V

    sput-object v0, Lcom/kik/d/b/a$l;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 6688
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 6842
    iput-byte v0, p0, Lcom/kik/d/b/a$l;->i:B

    .line 6871
    iput v0, p0, Lcom/kik/d/b/a$l;->j:I

    .line 6689
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$l;->g:Ljava/lang/Object;

    .line 6690
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$l;->h:Ljava/lang/Object;

    .line 6691
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 6686
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 6842
    iput-byte v0, p0, Lcom/kik/d/b/a$l;->i:B

    .line 6871
    iput v0, p0, Lcom/kik/d/b/a$l;->j:I

    .line 6687
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 6680
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$l;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 6701
    invoke-direct {p0}, Lcom/kik/d/b/a$l;-><init>()V

    .line 6702
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v2

    .line 6706
    const/4 v0, 0x0

    .line 6707
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 6708
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v3

    .line 6709
    sparse-switch v3, :sswitch_data_0

    .line 6714
    invoke-virtual {p0, p1, v2, p2, v3}, Lcom/kik/d/b/a$l;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v1

    .line 6716
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 6712
    goto :goto_0

    .line 6721
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v3

    .line 6722
    iget v4, p0, Lcom/kik/d/b/a$l;->f:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/kik/d/b/a$l;->f:I

    .line 6723
    iput-object v3, p0, Lcom/kik/d/b/a$l;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 6734
    :catch_0
    move-exception v0

    .line 6735
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6741
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$l;->e:Lcom/c/b/by;

    .line 6742
    invoke-virtual {p0}, Lcom/kik/d/b/a$l;->L()V

    throw v0

    .line 6727
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v3

    .line 6728
    iget v4, p0, Lcom/kik/d/b/a$l;->f:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lcom/kik/d/b/a$l;->f:I

    .line 6729
    iput-object v3, p0, Lcom/kik/d/b/a$l;->h:Ljava/lang/Object;
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 6736
    :catch_1
    move-exception v0

    .line 6737
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lcom/c/b/av;

    .line 6739
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 6741
    :cond_1
    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$l;->e:Lcom/c/b/by;

    .line 6742
    invoke-virtual {p0}, Lcom/kik/d/b/a$l;->L()V

    .line 6743
    return-void

    .line 6709
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 6680
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$l;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/d/b/a$l;I)I
    .locals 0

    .prologue
    .line 6680
    iput p1, p0, Lcom/kik/d/b/a$l;->f:I

    return p1
.end method

.method static synthetic a(Lcom/kik/d/b/a$l;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 6680
    iget-object v0, p0, Lcom/kik/d/b/a$l;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/d/b/a$l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 6680
    iput-object p1, p0, Lcom/kik/d/b/a$l;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/kik/d/b/a$l;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 6680
    iget-object v0, p0, Lcom/kik/d/b/a$l;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/kik/d/b/a$l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 6680
    iput-object p1, p0, Lcom/kik/d/b/a$l;->h:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic c(Lcom/kik/d/b/a$l;)Lcom/c/b/by;
    .locals 1

    .prologue
    .line 6680
    iget-object v0, p0, Lcom/kik/d/b/a$l;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public static j()Lcom/kik/d/b/a$l$a;
    .locals 1

    .prologue
    .line 6946
    sget-object v0, Lcom/kik/d/b/a$l;->k:Lcom/kik/d/b/a$l;

    invoke-direct {v0}, Lcom/kik/d/b/a$l;->o()Lcom/kik/d/b/a$l$a;

    move-result-object v0

    return-object v0
.end method

.method public static k()Lcom/kik/d/b/a$l;
    .locals 1

    .prologue
    .line 7259
    sget-object v0, Lcom/kik/d/b/a$l;->k:Lcom/kik/d/b/a$l;

    return-object v0
.end method

.method static synthetic l()Z
    .locals 1

    .prologue
    .line 6680
    sget-boolean v0, Lcom/kik/d/b/a$l;->d:Z

    return v0
.end method

.method private m()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 6788
    iget-object v0, p0, Lcom/kik/d/b/a$l;->g:Ljava/lang/Object;

    .line 6789
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 6790
    check-cast v0, Ljava/lang/String;

    .line 6791
    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 6793
    iput-object v0, p0, Lcom/kik/d/b/a$l;->g:Ljava/lang/Object;

    .line 6796
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private n()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 6830
    iget-object v0, p0, Lcom/kik/d/b/a$l;->h:Ljava/lang/Object;

    .line 6831
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 6832
    check-cast v0, Ljava/lang/String;

    .line 6833
    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 6835
    iput-object v0, p0, Lcom/kik/d/b/a$l;->h:Ljava/lang/Object;

    .line 6838
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private o()Lcom/kik/d/b/a$l$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 6952
    sget-object v0, Lcom/kik/d/b/a$l;->k:Lcom/kik/d/b/a$l;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/kik/d/b/a$l$a;

    invoke-direct {v0, v1}, Lcom/kik/d/b/a$l$a;-><init>(B)V

    .line 6953
    :goto_0
    return-object v0

    .line 6952
    :cond_0
    new-instance v0, Lcom/kik/d/b/a$l$a;

    invoke-direct {v0, v1}, Lcom/kik/d/b/a$l$a;-><init>(B)V

    .line 6953
    invoke-virtual {v0, p0}, Lcom/kik/d/b/a$l$a;->a(Lcom/kik/d/b/a$l;)Lcom/kik/d/b/a$l$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 6680
    new-instance v0, Lcom/kik/d/b/a$l$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/d/b/a$l$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 6862
    iget v0, p0, Lcom/kik/d/b/a$l;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 6863
    invoke-direct {p0}, Lcom/kik/d/b/a$l;->m()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 6865
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$l;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 6866
    invoke-direct {p0}, Lcom/kik/d/b/a$l;->n()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 6868
    :cond_1
    iget-object v0, p0, Lcom/kik/d/b/a$l;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 6869
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 6844
    iget-byte v2, p0, Lcom/kik/d/b/a$l;->i:B

    .line 6845
    if-ne v2, v0, :cond_0

    .line 6857
    :goto_0
    return v0

    .line 6846
    :cond_0
    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 6848
    :cond_1
    invoke-virtual {p0}, Lcom/kik/d/b/a$l;->h()Z

    move-result v2

    if-nez v2, :cond_2

    .line 6849
    iput-byte v1, p0, Lcom/kik/d/b/a$l;->i:B

    move v0, v1

    .line 6850
    goto :goto_0

    .line 6852
    :cond_2
    invoke-virtual {p0}, Lcom/kik/d/b/a$l;->i()Z

    move-result v2

    if-nez v2, :cond_3

    .line 6853
    iput-byte v1, p0, Lcom/kik/d/b/a$l;->i:B

    move v0, v1

    .line 6854
    goto :goto_0

    .line 6856
    :cond_3
    iput-byte v0, p0, Lcom/kik/d/b/a$l;->i:B

    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 6873
    iget v0, p0, Lcom/kik/d/b/a$l;->j:I

    .line 6874
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 6887
    :goto_0
    return v0

    .line 6876
    :cond_0
    const/4 v0, 0x0

    .line 6877
    iget v1, p0, Lcom/kik/d/b/a$l;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 6879
    invoke-direct {p0}, Lcom/kik/d/b/a$l;->m()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 6881
    :cond_1
    iget v1, p0, Lcom/kik/d/b/a$l;->f:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_2

    .line 6883
    invoke-direct {p0}, Lcom/kik/d/b/a$l;->n()Lcom/c/b/f;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 6885
    :cond_2
    iget-object v1, p0, Lcom/kik/d/b/a$l;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 6886
    iput v0, p0, Lcom/kik/d/b/a$l;->j:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 6752
    invoke-static {}, Lcom/kik/d/b/a;->j()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$l;

    const-class v2, Lcom/kik/d/b/a$l$a;

    .line 6753
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 6696
    iget-object v0, p0, Lcom/kik/d/b/a$l;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 6764
    iget v1, p0, Lcom/kik/d/b/a$l;->f:I

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
    .line 6806
    iget v0, p0, Lcom/kik/d/b/a$l;->f:I

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

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 7287
    sget-object v0, Lcom/kik/d/b/a$l;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 6680
    sget-object v0, Lcom/kik/d/b/a$l;->k:Lcom/kik/d/b/a$l;

    invoke-direct {v0}, Lcom/kik/d/b/a$l;->o()Lcom/kik/d/b/a$l$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 6680
    invoke-direct {p0}, Lcom/kik/d/b/a$l;->o()Lcom/kik/d/b/a$l$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 6680
    sget-object v0, Lcom/kik/d/b/a$l;->k:Lcom/kik/d/b/a$l;

    return-object v0
.end method
