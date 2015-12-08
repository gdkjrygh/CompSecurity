.class public final Lcom/kik/d/b/a$i;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/d/b/a$i$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final j:Lcom/kik/d/b/a$i;


# instance fields
.field private f:I

.field private g:I

.field private h:B

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1677
    new-instance v0, Lcom/kik/d/b/a$i;

    invoke-direct {v0}, Lcom/kik/d/b/a$i;-><init>()V

    sput-object v0, Lcom/kik/d/b/a$i;->j:Lcom/kik/d/b/a$i;

    .line 1684
    new-instance v0, Lcom/kik/d/b/h;

    invoke-direct {v0}, Lcom/kik/d/b/h;-><init>()V

    sput-object v0, Lcom/kik/d/b/a$i;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 1327
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 1411
    iput-byte v0, p0, Lcom/kik/d/b/a$i;->h:B

    .line 1433
    iput v0, p0, Lcom/kik/d/b/a$i;->i:I

    .line 1328
    const/16 v0, 0x12c

    iput v0, p0, Lcom/kik/d/b/a$i;->g:I

    .line 1329
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 1325
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 1411
    iput-byte v0, p0, Lcom/kik/d/b/a$i;->h:B

    .line 1433
    iput v0, p0, Lcom/kik/d/b/a$i;->i:I

    .line 1326
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 1319
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$i;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 1339
    invoke-direct {p0}, Lcom/kik/d/b/a$i;-><init>()V

    .line 1340
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v2

    .line 1344
    const/4 v0, 0x0

    .line 1345
    :cond_0
    :goto_0
    if-nez v0, :cond_2

    .line 1346
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v3

    .line 1347
    sparse-switch v3, :sswitch_data_0

    .line 1352
    invoke-virtual {p0, p1, v2, p2, v3}, Lcom/kik/d/b/a$i;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v1

    .line 1354
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 1350
    goto :goto_0

    .line 1359
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->n()I

    move-result v3

    .line 1360
    invoke-static {v3}, Lcom/kik/d/b/a$k;->a(I)Lcom/kik/d/b/a$k;

    move-result-object v4

    .line 1361
    if-nez v4, :cond_1

    .line 1362
    const/4 v4, 0x1

    invoke-virtual {v2, v4, v3}, Lcom/c/b/by$a;->a(II)Lcom/c/b/by$a;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1371
    :catch_0
    move-exception v0

    .line 1372
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1378
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$i;->e:Lcom/c/b/by;

    .line 1379
    invoke-virtual {p0}, Lcom/kik/d/b/a$i;->L()V

    throw v0

    .line 1364
    :cond_1
    :try_start_2
    iget v4, p0, Lcom/kik/d/b/a$i;->f:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/kik/d/b/a$i;->f:I

    .line 1365
    iput v3, p0, Lcom/kik/d/b/a$i;->g:I
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 1373
    :catch_1
    move-exception v0

    .line 1374
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lcom/c/b/av;

    .line 1376
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1378
    :cond_2
    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$i;->e:Lcom/c/b/by;

    .line 1379
    invoke-virtual {p0}, Lcom/kik/d/b/a$i;->L()V

    .line 1380
    return-void

    .line 1347
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 1319
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$i;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/d/b/a$i;I)I
    .locals 0

    .prologue
    .line 1319
    iput p1, p0, Lcom/kik/d/b/a$i;->g:I

    return p1
.end method

.method public static a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i$a;
    .locals 1

    .prologue
    .line 1507
    sget-object v0, Lcom/kik/d/b/a$i;->j:Lcom/kik/d/b/a$i;

    invoke-virtual {v0}, Lcom/kik/d/b/a$i;->k()Lcom/kik/d/b/a$i$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kik/d/b/a$i$a;->a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/kik/d/b/a$i;I)I
    .locals 0

    .prologue
    .line 1319
    iput p1, p0, Lcom/kik/d/b/a$i;->f:I

    return p1
.end method

.method static synthetic b(Lcom/kik/d/b/a$i;)Lcom/c/b/by;
    .locals 1

    .prologue
    .line 1319
    iget-object v0, p0, Lcom/kik/d/b/a$i;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public static j()Lcom/kik/d/b/a$i$a;
    .locals 1

    .prologue
    .line 1504
    sget-object v0, Lcom/kik/d/b/a$i;->j:Lcom/kik/d/b/a$i;

    invoke-virtual {v0}, Lcom/kik/d/b/a$i;->k()Lcom/kik/d/b/a$i$a;

    move-result-object v0

    return-object v0
.end method

.method public static l()Lcom/kik/d/b/a$i;
    .locals 1

    .prologue
    .line 1681
    sget-object v0, Lcom/kik/d/b/a$i;->j:Lcom/kik/d/b/a$i;

    return-object v0
.end method

.method static synthetic m()Z
    .locals 1

    .prologue
    .line 1319
    sget-boolean v0, Lcom/kik/d/b/a$i;->d:Z

    return v0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 1319
    new-instance v0, Lcom/kik/d/b/a$i$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/d/b/a$i$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 1427
    iget v0, p0, Lcom/kik/d/b/a$i;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 1428
    iget v0, p0, Lcom/kik/d/b/a$i;->g:I

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->c(II)V

    .line 1430
    :cond_0
    iget-object v0, p0, Lcom/kik/d/b/a$i;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 1431
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 1413
    iget-byte v2, p0, Lcom/kik/d/b/a$i;->h:B

    .line 1414
    if-ne v2, v0, :cond_0

    .line 1422
    :goto_0
    return v0

    .line 1415
    :cond_0
    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 1417
    :cond_1
    invoke-virtual {p0}, Lcom/kik/d/b/a$i;->h()Z

    move-result v2

    if-nez v2, :cond_2

    .line 1418
    iput-byte v1, p0, Lcom/kik/d/b/a$i;->h:B

    move v0, v1

    .line 1419
    goto :goto_0

    .line 1421
    :cond_2
    iput-byte v0, p0, Lcom/kik/d/b/a$i;->h:B

    goto :goto_0
.end method

.method public final b()I
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1435
    iget v0, p0, Lcom/kik/d/b/a$i;->i:I

    .line 1436
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1445
    :goto_0
    return v0

    .line 1438
    :cond_0
    const/4 v0, 0x0

    .line 1439
    iget v1, p0, Lcom/kik/d/b/a$i;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 1440
    iget v0, p0, Lcom/kik/d/b/a$i;->g:I

    .line 1441
    invoke-static {v2, v0}, Lcom/c/b/h;->f(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 1443
    :cond_1
    iget-object v1, p0, Lcom/kik/d/b/a$i;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 1444
    iput v0, p0, Lcom/kik/d/b/a$i;->i:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 1389
    invoke-static {}, Lcom/kik/d/b/a;->b()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$i;

    const-class v2, Lcom/kik/d/b/a$i$a;

    .line 1390
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 1334
    iget-object v0, p0, Lcom/kik/d/b/a$i;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1401
    iget v1, p0, Lcom/kik/d/b/a$i;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Lcom/kik/d/b/a$k;
    .locals 1

    .prologue
    .line 1407
    iget v0, p0, Lcom/kik/d/b/a$i;->g:I

    invoke-static {v0}, Lcom/kik/d/b/a$k;->a(I)Lcom/kik/d/b/a$k;

    move-result-object v0

    .line 1408
    if-nez v0, :cond_0

    sget-object v0, Lcom/kik/d/b/a$k;->a:Lcom/kik/d/b/a$k;

    :cond_0
    return-object v0
.end method

.method public final k()Lcom/kik/d/b/a$i$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1510
    sget-object v0, Lcom/kik/d/b/a$i;->j:Lcom/kik/d/b/a$i;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/kik/d/b/a$i$a;

    invoke-direct {v0, v1}, Lcom/kik/d/b/a$i$a;-><init>(B)V

    .line 1511
    :goto_0
    return-object v0

    .line 1510
    :cond_0
    new-instance v0, Lcom/kik/d/b/a$i$a;

    invoke-direct {v0, v1}, Lcom/kik/d/b/a$i$a;-><init>(B)V

    .line 1511
    invoke-virtual {v0, p0}, Lcom/kik/d/b/a$i$a;->a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$i$a;

    move-result-object v0

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 1709
    sget-object v0, Lcom/kik/d/b/a$i;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 1319
    sget-object v0, Lcom/kik/d/b/a$i;->j:Lcom/kik/d/b/a$i;

    invoke-virtual {v0}, Lcom/kik/d/b/a$i;->k()Lcom/kik/d/b/a$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 1319
    invoke-virtual {p0}, Lcom/kik/d/b/a$i;->k()Lcom/kik/d/b/a$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1319
    sget-object v0, Lcom/kik/d/b/a$i;->j:Lcom/kik/d/b/a$i;

    return-object v0
.end method
