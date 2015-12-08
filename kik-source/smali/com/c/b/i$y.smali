.class public final Lcom/c/b/i$y;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "y"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$y$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final j:Lcom/c/b/i$y;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private h:B

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11647
    new-instance v0, Lcom/c/b/i$y;

    invoke-direct {v0}, Lcom/c/b/i$y;-><init>()V

    sput-object v0, Lcom/c/b/i$y;->j:Lcom/c/b/i$y;

    .line 11654
    new-instance v0, Lcom/c/b/ad;

    invoke-direct {v0}, Lcom/c/b/ad;-><init>()V

    sput-object v0, Lcom/c/b/i$y;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 11237
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 11342
    iput-byte v0, p0, Lcom/c/b/i$y;->h:B

    .line 11360
    iput v0, p0, Lcom/c/b/i$y;->i:I

    .line 11238
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$y;->g:Ljava/lang/Object;

    .line 11239
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 11235
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 11342
    iput-byte v0, p0, Lcom/c/b/i$y;->h:B

    .line 11360
    iput v0, p0, Lcom/c/b/i$y;->i:I

    .line 11236
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 11229
    invoke-direct {p0, p1}, Lcom/c/b/i$y;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 11249
    invoke-direct {p0}, Lcom/c/b/i$y;-><init>()V

    .line 11250
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v2

    .line 11254
    const/4 v0, 0x0

    .line 11255
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 11256
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v3

    .line 11257
    sparse-switch v3, :sswitch_data_0

    .line 11262
    invoke-virtual {p0, p1, v2, p2, v3}, Lcom/c/b/i$y;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v1

    .line 11264
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 11260
    goto :goto_0

    .line 11269
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v3

    .line 11270
    iget v4, p0, Lcom/c/b/i$y;->f:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/c/b/i$y;->f:I

    .line 11271
    iput-object v3, p0, Lcom/c/b/i$y;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 11276
    :catch_0
    move-exception v0

    .line 11277
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11283
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$y;->e:Lcom/c/b/by;

    .line 11284
    invoke-virtual {p0}, Lcom/c/b/i$y;->L()V

    .line 11283
    throw v0

    .line 11278
    :catch_1
    move-exception v0

    .line 11279
    :try_start_2
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 11283
    :cond_1
    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$y;->e:Lcom/c/b/by;

    .line 11284
    invoke-virtual {p0}, Lcom/c/b/i$y;->L()V

    .line 11285
    return-void

    .line 11257
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 11229
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$y;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$y;I)I
    .locals 0

    .prologue
    .line 11229
    iput p1, p0, Lcom/c/b/i$y;->f:I

    return p1
.end method

.method static synthetic a(Lcom/c/b/i$y;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 11229
    iget-object v0, p0, Lcom/c/b/i$y;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$y;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 11229
    iput-object p1, p0, Lcom/c/b/i$y;->g:Ljava/lang/Object;

    return-object p1
.end method

.method public static j()Lcom/c/b/i$y;
    .locals 1

    .prologue
    .line 11651
    sget-object v0, Lcom/c/b/i$y;->j:Lcom/c/b/i$y;

    return-object v0
.end method

.method private k()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 11330
    iget-object v0, p0, Lcom/c/b/i$y;->g:Ljava/lang/Object;

    .line 11331
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 11332
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 11335
    iput-object v0, p0, Lcom/c/b/i$y;->g:Ljava/lang/Object;

    .line 11338
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private l()Lcom/c/b/i$y$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 11437
    sget-object v0, Lcom/c/b/i$y;->j:Lcom/c/b/i$y;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$y$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$y$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$y$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$y$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$y$a;->a(Lcom/c/b/i$y;)Lcom/c/b/i$y$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 11229
    new-instance v0, Lcom/c/b/i$y$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$y$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 11354
    iget v0, p0, Lcom/c/b/i$y;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 11355
    invoke-direct {p0}, Lcom/c/b/i$y;->k()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 11357
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$y;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 11358
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 11344
    iget-byte v1, p0, Lcom/c/b/i$y;->h:B

    .line 11345
    if-ne v1, v0, :cond_0

    .line 11349
    :goto_0
    return v0

    .line 11346
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 11348
    :cond_1
    iput-byte v0, p0, Lcom/c/b/i$y;->h:B

    goto :goto_0
.end method

.method public final b()I
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 11362
    iget v0, p0, Lcom/c/b/i$y;->i:I

    .line 11363
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 11372
    :goto_0
    return v0

    .line 11365
    :cond_0
    const/4 v0, 0x0

    .line 11366
    iget v1, p0, Lcom/c/b/i$y;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 11367
    invoke-direct {p0}, Lcom/c/b/i$y;->k()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 11370
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$y;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 11371
    iput v0, p0, Lcom/c/b/i$y;->i:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 11294
    invoke-static {}, Lcom/c/b/i;->m()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$y;

    const-class v2, Lcom/c/b/i$y$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 11244
    iget-object v0, p0, Lcom/c/b/i$y;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 11306
    iget v1, p0, Lcom/c/b/i$y;->f:I

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
    .line 11312
    iget-object v0, p0, Lcom/c/b/i$y;->g:Ljava/lang/Object;

    .line 11313
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 11314
    check-cast v0, Ljava/lang/String;

    .line 11322
    :goto_0
    return-object v0

    .line 11316
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 11318
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 11319
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11320
    iput-object v1, p0, Lcom/c/b/i$y;->g:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 11322
    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 11679
    sget-object v0, Lcom/c/b/i$y;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 11229
    sget-object v0, Lcom/c/b/i$y;->j:Lcom/c/b/i$y;

    invoke-direct {v0}, Lcom/c/b/i$y;->l()Lcom/c/b/i$y$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 11229
    invoke-direct {p0}, Lcom/c/b/i$y;->l()Lcom/c/b/i$y$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 11229
    sget-object v0, Lcom/c/b/i$y;->j:Lcom/c/b/i$y;

    return-object v0
.end method
