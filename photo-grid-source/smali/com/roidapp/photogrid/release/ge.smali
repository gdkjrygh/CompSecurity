.class public final Lcom/roidapp/photogrid/release/ge;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# static fields
.field private static A:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static z:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Z

.field private e:I

.field private f:I

.field private g:[Ljava/lang/String;

.field private h:[Ljava/lang/String;

.field private i:[Ljava/lang/String;

.field private j:[J

.field private k:[J

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/io/File;

.field private o:Landroid/widget/ListView;

.field private p:Landroid/widget/ListView;

.field private q:Landroid/app/AlertDialog;

.field private r:Landroid/widget/ProgressBar;

.field private s:Landroid/widget/TextView;

.field private t:Lcom/roidapp/photogrid/cloud/aj;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/cloud/ak;",
            ">;"
        }
    .end annotation
.end field

.field private v:Landroid/os/Handler;

.field private w:Z

.field private x:Z

.field private y:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/release/gv;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const-wide/16 v4, 0x5

    const/4 v0, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 628
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    invoke-direct {v8}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/RejectedExecutionHandler;)V

    sput-object v1, Lcom/roidapp/photogrid/release/ge;->z:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 637
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    invoke-direct {v8}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/RejectedExecutionHandler;)V

    sput-object v1, Lcom/roidapp/photogrid/release/ge;->A:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 67
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 71
    iput v3, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    .line 75
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/ge;->d:Z

    .line 81
    const/16 v0, 0x1c

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "Default"

    aput-object v1, v0, v3

    const-string v1, "Bold"

    aput-object v1, v0, v4

    const/4 v1, 0x2

    const-string v2, "Monospace"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "Sans_serif"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "Serif"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "ahundredmiles"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "Blunt"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "Binz"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "desyrel"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "FreeUniversal-Bold"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "gtw"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "HandTest"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "Impact"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "Jester"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "Junction 02"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "Laine"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "NotCourierSans"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "OSP-DIN"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "otfpoc"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "Polsku"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "PressStart2P"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "Quicksand-Regular"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "Roboto Thin"

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "RomanAntique"

    aput-object v2, v0, v1

    const/16 v1, 0x18

    const-string v2, "SerreriaSobria"

    aput-object v2, v0, v1

    const/16 v1, 0x19

    const-string v2, "Strato-linked"

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    const-string v2, "Thonburi"

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    const-string v2, "waltographUI"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->g:[Ljava/lang/String;

    .line 88
    new-array v0, v3, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->h:[Ljava/lang/String;

    .line 89
    new-array v0, v3, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->i:[Ljava/lang/String;

    .line 90
    new-array v0, v3, [J

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->j:[J

    .line 91
    new-array v0, v3, [J

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->k:[J

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->m:Ljava/util/ArrayList;

    .line 117
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ge;->w:Z

    .line 872
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ge;I)I
    .locals 0

    .prologue
    .line 67
    iput p1, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    return p1
.end method

.method private static a(Ljava/io/File;)J
    .locals 6

    .prologue
    const-wide/16 v2, 0x0

    .line 1091
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 1093
    :try_start_0
    const-class v0, Ljava/io/File;

    const-string v1, "getUsableSpace"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 1094
    if-eqz v0, :cond_0

    .line 1095
    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 1108
    :goto_0
    return-wide v0

    .line 1098
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-wide v0, v2

    .line 1099
    goto :goto_0

    .line 1104
    :cond_0
    :try_start_1
    new-instance v0, Landroid/os/StatFs;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 1105
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v1

    int-to-long v4, v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    int-to-long v0, v0

    mul-long/2addr v0, v4

    goto :goto_0

    .line 1107
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    move-wide v0, v2

    .line 1108
    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ge;Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ge;->b:Ljava/util/HashMap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ge;Ljava/io/File;)V
    .locals 4

    .prologue
    .line 67
    .line 6352
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->p:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->p:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 6361
    :cond_0
    :goto_0
    return-void

    .line 6355
    :cond_1
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    .line 6357
    if-eqz v1, :cond_0

    .line 6358
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/rc;->a(Ljava/io/File;)Landroid/graphics/Typeface;

    move-result-object v2

    .line 6359
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 6360
    if-eqz v0, :cond_0

    instance-of v3, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v3, :cond_0

    .line 6363
    const/4 v3, 0x0

    iput v3, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    .line 6364
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 6365
    if-eqz v2, :cond_0

    .line 6366
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ra;->b(Landroid/graphics/Typeface;)V

    .line 6368
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/rc;->b(Landroid/content/Context;)V

    .line 6369
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->b:Ljava/util/HashMap;

    .line 6371
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->e()V

    .line 6372
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->p:Landroid/widget/ListView;

    if-eqz v0, :cond_2

    .line 6373
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->p:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ha;

    .line 6374
    if-eqz v0, :cond_2

    .line 6375
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ha;->notifyDataSetChanged()V

    .line 6379
    :cond_2
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .prologue
    const-wide/16 v8, -0x1

    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 67
    .line 3128
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 3131
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 3132
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v11

    .line 2649
    :goto_0
    if-nez v0, :cond_1

    .line 2650
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->h()V

    .line 2677
    :goto_1
    return-void

    :cond_0
    move v0, v10

    .line 3135
    goto :goto_0

    .line 2653
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->n:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2654
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->n:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2655
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07016f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_1

    .line 2659
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->f()V

    move v0, v10

    .line 2663
    :goto_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->h:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_a

    .line 2664
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->h:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2665
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->k:[J

    aget-wide v6, v1, v0

    .line 2666
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->j:[J

    aget-wide v8, v1, v0

    .line 2671
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->n:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2672
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->v:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 2663
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 2675
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->n:Ljava/io/File;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->a(Ljava/io/File;)J

    move-result-wide v0

    const-wide/32 v2, 0xf00000

    cmp-long v0, v0, v2

    if-gez v0, :cond_5

    .line 2676
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->v:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 2679
    :cond_5
    new-instance v5, Ljava/io/File;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->n:Ljava/io/File;

    invoke-direct {v5, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 2683
    new-instance v0, Lcom/roidapp/photogrid/release/gv;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->v:Landroid/os/Handler;

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v10}, Lcom/roidapp/photogrid/release/gv;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;JJB)V

    .line 2684
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ge;->y:Ljava/lang/ref/WeakReference;

    .line 3938
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 3939
    :cond_6
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 3940
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 2697
    :cond_7
    :goto_4
    sget-object v1, Lcom/roidapp/photogrid/release/ge;->z:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_1

    .line 3945
    :cond_8
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 3946
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    if-nez v2, :cond_9

    .line 3947
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    .line 3948
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    const v2, 0x1080055

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setIcon(I)V

    .line 3949
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 3950
    const v2, 0x7f030005

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 3952
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    .line 3953
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    invoke-virtual {v1, v11}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 3954
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    invoke-virtual {v1, v10}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 3956
    :cond_9
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    new-instance v2, Lcom/roidapp/photogrid/release/gr;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/gr;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 3966
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    new-instance v2, Lcom/roidapp/photogrid/release/gs;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/gs;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 3974
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 3975
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v11, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 3976
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    const v2, 0x7f0d0045

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ProgressBar;

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ge;->r:Landroid/widget/ProgressBar;

    .line 3978
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->r:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v10}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 3979
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->r:Landroid/widget/ProgressBar;

    const/16 v2, 0x64

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 3982
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    const v2, 0x7f0d0044

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ge;->s:Landroid/widget/TextView;

    .line 3984
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->s:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3987
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    const v2, 0x7f0d0048

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 3988
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ge;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c00bf

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3990
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->r:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v10}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 3993
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    const v2, 0x7f0d0043

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 3994
    const v2, 0x7f070039

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 3996
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    const v2, 0x7f0d0046

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 3997
    new-instance v2, Lcom/roidapp/photogrid/release/gt;

    invoke-direct {v2, p0, v5, p1, p2}, Lcom/roidapp/photogrid/release/gt;-><init>(Lcom/roidapp/photogrid/release/ge;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4016
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 4017
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    const v2, 0x7f0d0047

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 4018
    invoke-virtual {v1, v11}, Landroid/view/View;->setClickable(Z)V

    .line 4019
    new-instance v2, Lcom/roidapp/photogrid/release/gu;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/gu;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_4

    :cond_a
    move-wide v6, v8

    goto/16 :goto_3
.end method

.method public static a()Z
    .locals 2

    .prologue
    .line 1116
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1118
    const/4 v0, 0x1

    .line 1120
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ge;)Z
    .locals 1

    .prologue
    .line 67
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ge;->d:Z

    return v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 2576
    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 2577
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2578
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2579
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->b:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    .line 2580
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    .line 2581
    if-eqz v1, :cond_0

    instance-of v2, v1, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_0

    .line 2582
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    .line 2583
    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ra;->b(Landroid/graphics/Typeface;)V

    .line 2584
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 2589
    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1

    .line 2576
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->o:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic b()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 1

    .prologue
    .line 67
    sget-object v0, Lcom/roidapp/photogrid/release/ge;->A:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ge;I)V
    .locals 3

    .prologue
    .line 67
    .line 6049
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->r:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    .line 6050
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->r:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 6052
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->s:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 6053
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->s:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ge;Ljava/io/File;)V
    .locals 1

    .prologue
    .line 7070
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7071
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 7073
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7074
    :cond_1
    :goto_0
    return-void

    .line 7076
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->h()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 67
    .line 5179
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ge;->d:Z

    .line 5180
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 5181
    new-instance v1, Lcom/roidapp/photogrid/release/gg;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/gg;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 5192
    new-instance v1, Lcom/roidapp/photogrid/release/gh;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/gh;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 5200
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f070125

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f07016b

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/gj;

    invoke-direct {v2, p0, p1, p2}, Lcom/roidapp/photogrid/release/gj;-><init>(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f070049

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/gi;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/gi;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 67
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 4568
    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 4569
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4570
    const/4 v1, 0x1

    :cond_0
    return v1

    .line 4568
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->p:Landroid/widget/ListView;

    return-object v0
.end method

.method private c()V
    .locals 6

    .prologue
    .line 155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->h:[Ljava/lang/String;

    .line 156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->i:[Ljava/lang/String;

    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->j:[J

    .line 158
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->k:[J

    .line 159
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 160
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->u:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/ak;

    .line 161
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->h:[Ljava/lang/String;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ak;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    .line 162
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->i:[Ljava/lang/String;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ak;->c()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    .line 163
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->j:[J

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ak;->d()J

    move-result-wide v4

    aput-wide v4, v2, v1

    .line 164
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->k:[J

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ak;->e()J

    move-result-wide v4

    aput-wide v4, v2, v1

    .line 159
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 166
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 67
    .line 8062
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 8063
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    const v1, 0x7f0d0045

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8064
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    const v1, 0x7f0d0046

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8065
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    const v1, 0x7f0d0043

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 8066
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 8144
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8146
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 8147
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 8149
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8150
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 8151
    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/roidapp/photogrid/release/ra;

    if-nez v2, :cond_1

    .line 8152
    :cond_0
    :goto_0
    return-void

    .line 8154
    :cond_1
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 8155
    iget v2, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ra;->b(I)Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/Typeface;)I

    move-result v2

    .line 8156
    const-string v3, "."

    invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 8158
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    if-eqz v4, :cond_2

    if-ltz v2, :cond_2

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_2

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 8159
    const/4 v1, 0x1

    .line 8161
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->e()V

    .line 8162
    if-eqz v1, :cond_3

    .line 8163
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ra;->b(Landroid/graphics/Typeface;)V

    .line 8164
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/Typeface;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    .line 8166
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->p:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ha;

    .line 8167
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ha;->notifyDataSetChanged()V

    .line 8168
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0
.end method

.method private d()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 395
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    if-nez v0, :cond_0

    .line 396
    iput v2, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    .line 416
    :goto_0
    return-void

    .line 399
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 400
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->b:Ljava/util/HashMap;

    if-nez v1, :cond_2

    .line 401
    :cond_1
    iput v2, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    goto :goto_0

    .line 404
    :cond_2
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->o()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/ge;)V
    .locals 2

    .prologue
    .line 67
    .line 2275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->p:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2276
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->o:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/gx;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/gx;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2277
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->d()V

    .line 2278
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->o:Landroid/widget/ListView;

    iget v1, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 2279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->o:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/gp;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/gp;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 67
    return-void
.end method

.method private e()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 598
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 599
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    move v0, v1

    .line 600
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->g:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 601
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ge;->g:[Ljava/lang/String;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 602
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->m:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ge;->g:[Ljava/lang/String;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 600
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 604
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/rc;->c()Ljava/util/ArrayList;

    move-result-object v0

    .line 606
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/rc;->d()Ljava/util/ArrayList;

    move-result-object v2

    .line 608
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 609
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ge;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 611
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 612
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ge;->m:Ljava/util/ArrayList;

    invoke-virtual {v3, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 615
    :cond_2
    return-void
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/ge;)V
    .locals 2

    .prologue
    .line 67
    .line 2321
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->p:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/ha;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/ha;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2322
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->p:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/gq;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/gq;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 67
    return-void
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method private f()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 704
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->y:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->y:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/gv;

    .line 705
    :goto_0
    if-eqz v0, :cond_0

    .line 706
    invoke-static {v0}, Lcom/roidapp/photogrid/release/gv;->a(Lcom/roidapp/photogrid/release/gv;)V

    .line 707
    :cond_0
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ge;->y:Ljava/lang/ref/WeakReference;

    .line 708
    return-void

    :cond_1
    move-object v0, v1

    .line 704
    goto :goto_0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/ge;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->b:Ljava/util/HashMap;

    return-object v0
.end method

.method private g()V
    .locals 1

    .prologue
    .line 1035
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1037
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1043
    :cond_0
    :goto_0
    return-void

    .line 1039
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private h()V
    .locals 3

    .prologue
    .line 1227
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->g()V

    .line 1229
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1230
    new-instance v1, Lcom/roidapp/photogrid/release/gk;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/gk;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 1240
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f070110

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0701f8

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f070298

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/gm;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/gm;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f070049

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/gl;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/gl;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1267
    return-void
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/ge;)V
    .locals 1

    .prologue
    .line 67
    .line 2388
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->o:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/gx;

    .line 2389
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/gx;->notifyDataSetChanged()V

    .line 67
    return-void
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/ge;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->h:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/ge;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->q:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->e()V

    return-void
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/ge;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->m:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/ge;)I
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    return v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/release/ge;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->i:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/photogrid/release/ge;)[J
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->j:[J

    return-object v0
.end method

.method static synthetic p(Lcom/roidapp/photogrid/release/ge;)Z
    .locals 1

    .prologue
    .line 67
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ge;->x:Z

    return v0
.end method

.method static synthetic q(Lcom/roidapp/photogrid/release/ge;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->y:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic r(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->g()V

    return-void
.end method

.method static synthetic s(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->f()V

    return-void
.end method

.method static synthetic t(Lcom/roidapp/photogrid/release/ge;)Z
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ge;->d:Z

    return v0
.end method


# virtual methods
.method public final onAttach(Landroid/app/Activity;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 124
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 125
    new-instance v0, Lcom/roidapp/photogrid/release/gz;

    invoke-direct {v0, p0, v3}, Lcom/roidapp/photogrid/release/gz;-><init>(Lcom/roidapp/photogrid/release/ge;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->v:Landroid/os/Handler;

    .line 126
    invoke-static {p1}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->b:Ljava/util/HashMap;

    .line 128
    new-instance v0, Ljava/io/File;

    invoke-static {p1}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    invoke-static {}, Lcom/roidapp/photogrid/release/rc;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->n:Ljava/io/File;

    .line 129
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ge;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900c3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ge;->e:I

    .line 130
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ge;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x43160000    # 150.0f

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ge;->f:I

    .line 131
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->e()V

    .line 133
    new-instance v0, Lcom/roidapp/photogrid/cloud/aj;

    invoke-direct {v0}, Lcom/roidapp/photogrid/cloud/aj;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->t:Lcom/roidapp/photogrid/cloud/aj;

    .line 134
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->t:Lcom/roidapp/photogrid/cloud/aj;

    .line 2080
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ge;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 2081
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/aj;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->u:Ljava/util/List;

    .line 135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->u:Ljava/util/List;

    if-nez v0, :cond_0

    .line 136
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/ge;->w:Z

    .line 140
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 141
    return-void

    .line 138
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->c()V

    goto :goto_0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x0

    const v4, 0x7f020074

    .line 170
    const v0, 0x7f0300bf

    invoke-virtual {p1, v0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 171
    const v0, 0x7f0d0315

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->o:Landroid/widget/ListView;

    .line 172
    const v0, 0x7f0d0316

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ge;->p:Landroid/widget/ListView;

    .line 179
    const v0, 0x7f0d0310

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 180
    const v1, 0x7f0d0311

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 181
    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/ge;->w:Z

    if-eqz v3, :cond_0

    .line 182
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 183
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 188
    :goto_0
    new-instance v3, Lcom/roidapp/photogrid/release/gf;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/photogrid/release/gf;-><init>(Lcom/roidapp/photogrid/release/ge;Landroid/widget/TextView;Landroid/widget/RelativeLayout;)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 203
    new-instance v3, Lcom/roidapp/photogrid/release/gn;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/photogrid/release/gn;-><init>(Lcom/roidapp/photogrid/release/ge;Landroid/widget/TextView;Landroid/widget/RelativeLayout;)V

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 217
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->o:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/gx;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/gx;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 218
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->d()V

    .line 219
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->o:Landroid/widget/ListView;

    iget v1, p0, Lcom/roidapp/photogrid/release/ge;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 220
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ge;->o:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/go;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/go;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 269
    return-object v2

    .line 185
    :cond_0
    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 186
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public final onDetach()V
    .locals 1

    .prologue
    .line 145
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 146
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ge;->f()V

    .line 147
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ge;->x:Z

    .line 149
    return-void
.end method
