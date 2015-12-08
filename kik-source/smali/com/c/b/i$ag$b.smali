.class public final Lcom/c/b/i$ag$b;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$ag$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$ag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$ag$b$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final k:Lcom/c/b/i$ag$b;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private h:Z

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27396
    new-instance v0, Lcom/c/b/i$ag$b;

    invoke-direct {v0}, Lcom/c/b/i$ag$b;-><init>()V

    sput-object v0, Lcom/c/b/i$ag$b;->k:Lcom/c/b/i$ag$b;

    .line 27403
    new-instance v0, Lcom/c/b/aj;

    invoke-direct {v0}, Lcom/c/b/aj;-><init>()V

    sput-object v0, Lcom/c/b/i$ag$b;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 26899
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 27025
    iput-byte v0, p0, Lcom/c/b/i$ag$b;->i:B

    .line 27054
    iput v0, p0, Lcom/c/b/i$ag$b;->j:I

    .line 26900
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ag$b;->g:Ljava/lang/Object;

    .line 26901
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/i$ag$b;->h:Z

    .line 26902
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 26897
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 27025
    iput-byte v0, p0, Lcom/c/b/i$ag$b;->i:B

    .line 27054
    iput v0, p0, Lcom/c/b/i$ag$b;->j:I

    .line 26898
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 26891
    invoke-direct {p0, p1}, Lcom/c/b/i$ag$b;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 26912
    invoke-direct {p0}, Lcom/c/b/i$ag$b;-><init>()V

    .line 26913
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v2

    .line 26917
    const/4 v0, 0x0

    .line 26918
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 26919
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v3

    .line 26920
    sparse-switch v3, :sswitch_data_0

    .line 26925
    invoke-virtual {p0, p1, v2, p2, v3}, Lcom/c/b/i$ag$b;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v1

    .line 26927
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 26923
    goto :goto_0

    .line 26932
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v3

    .line 26933
    iget v4, p0, Lcom/c/b/i$ag$b;->f:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/c/b/i$ag$b;->f:I

    .line 26934
    iput-object v3, p0, Lcom/c/b/i$ag$b;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 26944
    :catch_0
    move-exception v0

    .line 26945
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26951
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ag$b;->e:Lcom/c/b/by;

    .line 26952
    invoke-virtual {p0}, Lcom/c/b/i$ag$b;->L()V

    .line 26951
    throw v0

    .line 26938
    :sswitch_2
    :try_start_2
    iget v3, p0, Lcom/c/b/i$ag$b;->f:I

    or-int/lit8 v3, v3, 0x2

    iput v3, p0, Lcom/c/b/i$ag$b;->f:I

    .line 26939
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v3

    iput-boolean v3, p0, Lcom/c/b/i$ag$b;->h:Z
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 26946
    :catch_1
    move-exception v0

    .line 26947
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

    .line 26951
    :cond_1
    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ag$b;->e:Lcom/c/b/by;

    .line 26952
    invoke-virtual {p0}, Lcom/c/b/i$ag$b;->L()V

    .line 26953
    return-void

    .line 26920
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x10 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 26891
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ag$b;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$ag$b;I)I
    .locals 0

    .prologue
    .line 26891
    iput p1, p0, Lcom/c/b/i$ag$b;->f:I

    return p1
.end method

.method static synthetic a(Lcom/c/b/i$ag$b;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26891
    iget-object v0, p0, Lcom/c/b/i$ag$b;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$ag$b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 26891
    iput-object p1, p0, Lcom/c/b/i$ag$b;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$ag$b;Z)Z
    .locals 0

    .prologue
    .line 26891
    iput-boolean p1, p0, Lcom/c/b/i$ag$b;->h:Z

    return p1
.end method

.method public static k()Lcom/c/b/i$ag$b;
    .locals 1

    .prologue
    .line 27400
    sget-object v0, Lcom/c/b/i$ag$b;->k:Lcom/c/b/i$ag$b;

    return-object v0
.end method

.method private l()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 26998
    iget-object v0, p0, Lcom/c/b/i$ag$b;->g:Ljava/lang/Object;

    .line 26999
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 27000
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 27003
    iput-object v0, p0, Lcom/c/b/i$ag$b;->g:Ljava/lang/Object;

    .line 27006
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private m()Lcom/c/b/i$ag$b$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 27135
    sget-object v0, Lcom/c/b/i$ag$b;->k:Lcom/c/b/i$ag$b;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$ag$b$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$ag$b$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$ag$b$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$ag$b$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$ag$b$a;->a(Lcom/c/b/i$ag$b;)Lcom/c/b/i$ag$b$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 26891
    new-instance v0, Lcom/c/b/i$ag$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$ag$b$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 27045
    iget v0, p0, Lcom/c/b/i$ag$b;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 27046
    invoke-direct {p0}, Lcom/c/b/i$ag$b;->l()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 27048
    :cond_0
    iget v0, p0, Lcom/c/b/i$ag$b;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 27049
    iget-boolean v0, p0, Lcom/c/b/i$ag$b;->h:Z

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->a(IZ)V

    .line 27051
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$ag$b;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 27052
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 27027
    iget-byte v2, p0, Lcom/c/b/i$ag$b;->i:B

    .line 27028
    if-ne v2, v0, :cond_0

    .line 27040
    :goto_0
    return v0

    .line 27029
    :cond_0
    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 27031
    :cond_1
    invoke-virtual {p0}, Lcom/c/b/i$ag$b;->h()Z

    move-result v2

    if-nez v2, :cond_2

    .line 27032
    iput-byte v1, p0, Lcom/c/b/i$ag$b;->i:B

    move v0, v1

    .line 27033
    goto :goto_0

    .line 27035
    :cond_2
    invoke-virtual {p0}, Lcom/c/b/i$ag$b;->i()Z

    move-result v2

    if-nez v2, :cond_3

    .line 27036
    iput-byte v1, p0, Lcom/c/b/i$ag$b;->i:B

    move v0, v1

    .line 27037
    goto :goto_0

    .line 27039
    :cond_3
    iput-byte v0, p0, Lcom/c/b/i$ag$b;->i:B

    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 27056
    iget v0, p0, Lcom/c/b/i$ag$b;->j:I

    .line 27057
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 27070
    :goto_0
    return v0

    .line 27059
    :cond_0
    const/4 v0, 0x0

    .line 27060
    iget v1, p0, Lcom/c/b/i$ag$b;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 27061
    invoke-direct {p0}, Lcom/c/b/i$ag$b;->l()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 27064
    :cond_1
    iget v1, p0, Lcom/c/b/i$ag$b;->f:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_2

    .line 27065
    invoke-static {v3}, Lcom/c/b/h;->j(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    .line 27068
    :cond_2
    iget-object v1, p0, Lcom/c/b/i$ag$b;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 27069
    iput v0, p0, Lcom/c/b/i$ag$b;->j:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 26962
    invoke-static {}, Lcom/c/b/i;->M()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$ag$b;

    const-class v2, Lcom/c/b/i$ag$b$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 26907
    iget-object v0, p0, Lcom/c/b/i$ag$b;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 26974
    iget v1, p0, Lcom/c/b/i$ag$b;->f:I

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
    .line 27016
    iget v0, p0, Lcom/c/b/i$ag$b;->f:I

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

.method public final j()Z
    .locals 1

    .prologue
    .line 27022
    iget-boolean v0, p0, Lcom/c/b/i$ag$b;->h:Z

    return v0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 27428
    sget-object v0, Lcom/c/b/i$ag$b;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 26891
    sget-object v0, Lcom/c/b/i$ag$b;->k:Lcom/c/b/i$ag$b;

    invoke-direct {v0}, Lcom/c/b/i$ag$b;->m()Lcom/c/b/i$ag$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 26891
    invoke-direct {p0}, Lcom/c/b/i$ag$b;->m()Lcom/c/b/i$ag$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 26891
    sget-object v0, Lcom/c/b/i$ag$b;->k:Lcom/c/b/i$ag$b;

    return-object v0
.end method
