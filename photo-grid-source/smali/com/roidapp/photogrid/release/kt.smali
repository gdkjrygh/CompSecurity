.class public final Lcom/roidapp/photogrid/release/kt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/os/Handler;

.field private c:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/roidapp/photogrid/release/kz;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/roidapp/photogrid/release/kz;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/roidapp/photogrid/release/kz;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/roidapp/photogrid/release/kz;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 787
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kt;->c:Ljava/util/LinkedHashMap;

    .line 788
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kt;->d:Ljava/util/LinkedHashMap;

    .line 789
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kt;->e:Ljava/util/LinkedHashMap;

    .line 790
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kt;->f:Ljava/util/LinkedHashMap;

    .line 48
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kt;->a:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lcom/roidapp/photogrid/release/kt;->b:Landroid/os/Handler;

    .line 53
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kt;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kt;Ljava/lang/String;)Lcom/roidapp/photogrid/release/kz;
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1712
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v3

    const-string v4, "mounted"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1713
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kt;->a:Landroid/content/Context;

    const v3, 0x7f07028d

    invoke-static {v1, v3, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1714
    :goto_0
    return-object v2

    .line 1717
    :cond_0
    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 1720
    :goto_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1721
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1722
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1723
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v5

    .line 1724
    if-eqz v5, :cond_4

    .line 1725
    array-length v6, v5

    move v3, v1

    :goto_2
    if-ge v3, v6, :cond_4

    aget-object v7, v5, v3

    .line 1726
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    .line 1727
    const-string v9, ".png"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, ".jpg"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, ".gif"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, ".bmp"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, ".jpeg"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, ".mpo"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    invoke-static {v8}, Lcom/roidapp/photogrid/common/bn;->a(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 1735
    :cond_1
    if-eqz v0, :cond_3

    .line 1736
    invoke-static {v7}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/io/File;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 1737
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1725
    :cond_2
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 1740
    :cond_3
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1747
    :cond_4
    new-instance v0, Lcom/roidapp/photogrid/release/ky;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/ky;-><init>(Lcom/roidapp/photogrid/release/kt;)V

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1763
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 1764
    new-instance v2, Lcom/roidapp/photogrid/release/kz;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/release/kz;-><init>(Lcom/roidapp/photogrid/release/kt;B)V

    .line 1765
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, v2, Lcom/roidapp/photogrid/release/kz;->b:I

    .line 1766
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/roidapp/photogrid/release/kz;->a:Ljava/lang/String;

    move-object v0, v2

    :goto_4
    move-object v2, v0

    .line 32
    goto/16 :goto_0

    :cond_5
    move-object v0, v2

    goto :goto_4

    :cond_6
    move v0, v1

    goto/16 :goto_1
.end method

.method static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    invoke-static {p0}, Lcom/roidapp/photogrid/release/kt;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kt;I)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/kt;->b(I)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->b:Landroid/os/Handler;

    return-object v0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 800
    const-string v0, ""

    .line 801
    const-string v1, "/"

    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 802
    if-gez v1, :cond_0

    .line 803
    const/4 v0, 0x0

    .line 810
    :goto_0
    return-object v0

    .line 806
    :cond_0
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 808
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 778
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 779
    const/16 v1, 0x13

    iput v1, v0, Landroid/os/Message;->what:I

    .line 780
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 781
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kt;->b:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 782
    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->d:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->e:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 773
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->b:Landroid/os/Handler;

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 775
    return-void
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->c:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method private declared-synchronized e()V
    .locals 1

    .prologue
    .line 793
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 794
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 795
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->e:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 796
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 797
    monitor-exit p0

    return-void

    .line 793
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/kt;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kt;->e()V

    return-void
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->f:Ljava/util/LinkedHashMap;

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 3

    .prologue
    .line 107
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kt;->d()V

    .line 108
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kt;->e()V

    .line 110
    const-string v0, "ImageSelector/initGallery"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 111
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->a:Landroid/content/Context;

    const v1, 0x7f07028d

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 342
    :goto_0
    monitor-exit p0

    return-void

    .line 115
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kt;->d()V

    .line 116
    const/16 v0, 0x1e

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/kt;->b(I)V

    .line 117
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/ku;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/ku;-><init>(Lcom/roidapp/photogrid/release/kt;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 107
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(I)V
    .locals 3

    .prologue
    .line 533
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kt;->d()V

    .line 535
    const-string v0, "ImageSelector/initRecent"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 536
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 537
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kt;->a:Landroid/content/Context;

    const v1, 0x7f07028d

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 706
    :goto_0
    return-void

    .line 540
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kt;->d()V

    .line 541
    const/16 v0, 0x1e

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/kt;->b(I)V

    .line 542
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/kx;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/release/kx;-><init>(Lcom/roidapp/photogrid/release/kt;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method public final declared-synchronized b()V
    .locals 2

    .prologue
    .line 351
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kt;->e()V

    .line 352
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kt;->d()V

    .line 353
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/kv;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/kv;-><init>(Lcom/roidapp/photogrid/release/kt;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 474
    monitor-exit p0

    return-void

    .line 351
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c()V
    .locals 2

    .prologue
    .line 481
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kt;->e()V

    .line 482
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kt;->d()V

    .line 483
    const/16 v0, 0x1e

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/kt;->b(I)V

    .line 484
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/kw;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/kw;-><init>(Lcom/roidapp/photogrid/release/kt;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 526
    monitor-exit p0

    return-void

    .line 481
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
