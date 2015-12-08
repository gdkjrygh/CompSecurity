.class public final Lcom/c/b/i$a$b;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$a$b$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final k:Lcom/c/b/i$a$b;


# instance fields
.field private f:I

.field private g:I

.field private h:I

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 5291
    new-instance v0, Lcom/c/b/i$a$b;

    invoke-direct {v0}, Lcom/c/b/i$a$b;-><init>()V

    sput-object v0, Lcom/c/b/i$a$b;->k:Lcom/c/b/i$a$b;

    .line 5298
    new-instance v0, Lcom/c/b/l;

    invoke-direct {v0}, Lcom/c/b/l;-><init>()V

    sput-object v0, Lcom/c/b/i$a$b;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 4890
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 4988
    iput-byte v0, p0, Lcom/c/b/i$a$b;->i:B

    .line 5009
    iput v0, p0, Lcom/c/b/i$a$b;->j:I

    .line 4891
    iput v1, p0, Lcom/c/b/i$a$b;->g:I

    .line 4892
    iput v1, p0, Lcom/c/b/i$a$b;->h:I

    .line 4893
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 4888
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 4988
    iput-byte v0, p0, Lcom/c/b/i$a$b;->i:B

    .line 5009
    iput v0, p0, Lcom/c/b/i$a$b;->j:I

    .line 4889
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 4882
    invoke-direct {p0, p1}, Lcom/c/b/i$a$b;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 4903
    invoke-direct {p0}, Lcom/c/b/i$a$b;-><init>()V

    .line 4904
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v2

    .line 4908
    const/4 v0, 0x0

    .line 4909
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 4910
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v3

    .line 4911
    sparse-switch v3, :sswitch_data_0

    .line 4916
    invoke-virtual {p0, p1, v2, p2, v3}, Lcom/c/b/i$a$b;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v1

    .line 4918
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 4914
    goto :goto_0

    .line 4923
    :sswitch_1
    iget v3, p0, Lcom/c/b/i$a$b;->f:I

    or-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/c/b/i$a$b;->f:I

    .line 4924
    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v3

    iput v3, p0, Lcom/c/b/i$a$b;->g:I
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 4934
    :catch_0
    move-exception v0

    .line 4935
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4941
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$a$b;->e:Lcom/c/b/by;

    .line 4942
    invoke-virtual {p0}, Lcom/c/b/i$a$b;->L()V

    .line 4941
    throw v0

    .line 4928
    :sswitch_2
    :try_start_2
    iget v3, p0, Lcom/c/b/i$a$b;->f:I

    or-int/lit8 v3, v3, 0x2

    iput v3, p0, Lcom/c/b/i$a$b;->f:I

    .line 4929
    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v3

    iput v3, p0, Lcom/c/b/i$a$b;->h:I
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 4936
    :catch_1
    move-exception v0

    .line 4937
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 4941
    :cond_1
    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$a$b;->e:Lcom/c/b/by;

    .line 4942
    invoke-virtual {p0}, Lcom/c/b/i$a$b;->L()V

    .line 4943
    return-void

    .line 4911
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 4882
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$a$b;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$a$b;I)I
    .locals 0

    .prologue
    .line 4882
    iput p1, p0, Lcom/c/b/i$a$b;->g:I

    return p1
.end method

.method static synthetic b(Lcom/c/b/i$a$b;I)I
    .locals 0

    .prologue
    .line 4882
    iput p1, p0, Lcom/c/b/i$a$b;->h:I

    return p1
.end method

.method static synthetic c(Lcom/c/b/i$a$b;I)I
    .locals 0

    .prologue
    .line 4882
    iput p1, p0, Lcom/c/b/i$a$b;->f:I

    return p1
.end method

.method public static l()Lcom/c/b/i$a$b$a;
    .locals 1

    .prologue
    .line 5084
    sget-object v0, Lcom/c/b/i$a$b;->k:Lcom/c/b/i$a$b;

    invoke-direct {v0}, Lcom/c/b/i$a$b;->n()Lcom/c/b/i$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method public static m()Lcom/c/b/i$a$b;
    .locals 1

    .prologue
    .line 5295
    sget-object v0, Lcom/c/b/i$a$b;->k:Lcom/c/b/i$a$b;

    return-object v0
.end method

.method private n()Lcom/c/b/i$a$b$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 5090
    sget-object v0, Lcom/c/b/i$a$b;->k:Lcom/c/b/i$a$b;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$a$b$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$a$b$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$a$b$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$a$b$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$a$b$a;->a(Lcom/c/b/i$a$b;)Lcom/c/b/i$a$b$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 4882
    new-instance v0, Lcom/c/b/i$a$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$a$b$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 5000
    iget v0, p0, Lcom/c/b/i$a$b;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 5001
    iget v0, p0, Lcom/c/b/i$a$b;->g:I

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(II)V

    .line 5003
    :cond_0
    iget v0, p0, Lcom/c/b/i$a$b;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 5004
    iget v0, p0, Lcom/c/b/i$a$b;->h:I

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->a(II)V

    .line 5006
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$a$b;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 5007
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 4990
    iget-byte v1, p0, Lcom/c/b/i$a$b;->i:B

    .line 4991
    if-ne v1, v0, :cond_0

    .line 4995
    :goto_0
    return v0

    .line 4992
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 4994
    :cond_1
    iput-byte v0, p0, Lcom/c/b/i$a$b;->i:B

    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 5011
    iget v0, p0, Lcom/c/b/i$a$b;->j:I

    .line 5012
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 5025
    :goto_0
    return v0

    .line 5014
    :cond_0
    const/4 v0, 0x0

    .line 5015
    iget v1, p0, Lcom/c/b/i$a$b;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 5016
    iget v0, p0, Lcom/c/b/i$a$b;->g:I

    invoke-static {v2, v0}, Lcom/c/b/h;->d(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 5019
    :cond_1
    iget v1, p0, Lcom/c/b/i$a$b;->f:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_2

    .line 5020
    iget v1, p0, Lcom/c/b/i$a$b;->h:I

    invoke-static {v3, v1}, Lcom/c/b/h;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 5023
    :cond_2
    iget-object v1, p0, Lcom/c/b/i$a$b;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 5024
    iput v0, p0, Lcom/c/b/i$a$b;->j:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 4952
    invoke-static {}, Lcom/c/b/i;->g()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$a$b;

    const-class v2, Lcom/c/b/i$a$b$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 4898
    iget-object v0, p0, Lcom/c/b/i$a$b;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 4964
    iget v1, p0, Lcom/c/b/i$a$b;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()I
    .locals 1

    .prologue
    .line 4970
    iget v0, p0, Lcom/c/b/i$a$b;->g:I

    return v0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 4979
    iget v0, p0, Lcom/c/b/i$a$b;->f:I

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
    .line 4985
    iget v0, p0, Lcom/c/b/i$a$b;->h:I

    return v0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 5323
    sget-object v0, Lcom/c/b/i$a$b;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 4882
    sget-object v0, Lcom/c/b/i$a$b;->k:Lcom/c/b/i$a$b;

    invoke-direct {v0}, Lcom/c/b/i$a$b;->n()Lcom/c/b/i$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 4882
    invoke-direct {p0}, Lcom/c/b/i$a$b;->n()Lcom/c/b/i$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 4882
    sget-object v0, Lcom/c/b/i$a$b;->k:Lcom/c/b/i$a$b;

    return-object v0
.end method
