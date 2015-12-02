.class public Lcom/qihoo/security/enginehelper/clean/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/enginehelper/clean/a$6;,
        Lcom/qihoo/security/enginehelper/clean/a$a;,
        Lcom/qihoo/security/enginehelper/clean/a$b;
    }
.end annotation


# static fields
.field private static a:Z

.field private static b:Ljava/lang/String;

.field private static h:Lcom/qihoo/security/enginehelper/clean/a;


# instance fields
.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Lcom/qihoo/security/clearengine/b/a;

.field private i:Landroid/content/Context;

.field private j:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

.field private k:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

.field private l:[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

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

.field private n:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/enginehelper/clean/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/enginehelper/clean/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private p:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/enginehelper/clean/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation
.end field

.field private r:Lcom/qihoo/security/opti/trashclear/ui/e;

.field private s:Ljava/util/concurrent/ExecutorService;

.field private t:[B

.field private u:Lcom/qihoo/security/clearengine/surface/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/enginehelper/clean/a;->a:Z

    .line 26
    sget-boolean v0, Lcom/qihoo/security/enginehelper/clean/a;->a:Z

    if-eqz v0, :cond_0

    const-string/jumbo v0, "CleanEngineHelper"

    :goto_0
    sput-object v0, Lcom/qihoo/security/enginehelper/clean/a;->b:Ljava/lang/String;

    return-void

    :cond_0
    const-string/jumbo v0, ""

    goto :goto_0
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 550
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput v1, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    .line 76
    iput v1, p0, Lcom/qihoo/security/enginehelper/clean/a;->d:I

    .line 77
    iput v1, p0, Lcom/qihoo/security/enginehelper/clean/a;->e:I

    .line 79
    const/16 v0, 0x64

    iput v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->f:I

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    .line 105
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    .line 107
    new-array v0, v1, [B

    iput-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->t:[B

    .line 271
    new-instance v0, Lcom/qihoo/security/enginehelper/clean/a$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/enginehelper/clean/a$3;-><init>(Lcom/qihoo/security/enginehelper/clean/a;)V

    iput-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->u:Lcom/qihoo/security/clearengine/surface/a;

    .line 551
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->i:Landroid/content/Context;

    .line 552
    invoke-direct {p0}, Lcom/qihoo/security/enginehelper/clean/a;->j()V

    .line 553
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/enginehelper/clean/a;I)I
    .locals 0

    .prologue
    .line 24
    iput p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->d:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/enginehelper/clean/a;Lcom/qihoo/security/enginehelper/clean/CleanScanType;)Lcom/qihoo/security/enginehelper/clean/CleanScanType;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->j:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    return-object p1
.end method

.method public static final a(Landroid/content/Context;)Lcom/qihoo/security/enginehelper/clean/a;
    .locals 2

    .prologue
    .line 158
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/a;->h:Lcom/qihoo/security/enginehelper/clean/a;

    if-nez v0, :cond_1

    .line 159
    const-class v1, Lcom/qihoo/security/enginehelper/clean/a;

    monitor-enter v1

    .line 160
    :try_start_0
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/a;->h:Lcom/qihoo/security/enginehelper/clean/a;

    if-nez v0, :cond_0

    .line 161
    new-instance v0, Lcom/qihoo/security/enginehelper/clean/a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/enginehelper/clean/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/a;->h:Lcom/qihoo/security/enginehelper/clean/a;

    .line 163
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    :cond_1
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/a;->h:Lcom/qihoo/security/enginehelper/clean/a;

    return-object v0

    .line 163
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/enginehelper/clean/a;Lcom/qihoo/security/opti/trashclear/ui/e;)Lcom/qihoo/security/opti/trashclear/ui/e;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->r:Lcom/qihoo/security/opti/trashclear/ui/e;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/enginehelper/clean/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->n:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/enginehelper/clean/a;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->m:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/enginehelper/clean/a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->q:Ljava/util/List;

    return-object p1
.end method

.method private a(Ljava/lang/Exception;)V
    .locals 1

    .prologue
    .line 804
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;Z)V

    .line 805
    return-void
.end method

.method private a(Ljava/lang/Exception;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 808
    sget-boolean v0, Lcom/qihoo/security/enginehelper/clean/a;->a:Z

    if-eqz v0, :cond_0

    .line 809
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/a;->b:Ljava/lang/String;

    const-string/jumbo v1, "use a release engine"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 811
    :cond_0
    iput v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->e:I

    .line 812
    iput v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->d:I

    .line 813
    iput v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    .line 814
    if-eqz p2, :cond_3

    .line 815
    monitor-enter p0

    .line 816
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->n:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 817
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->n:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/a$b;

    .line 818
    if-eqz v0, :cond_1

    .line 819
    invoke-interface {v0}, Lcom/qihoo/security/enginehelper/clean/a$b;->c()V

    .line 822
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->p:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    .line 823
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/a$a;

    .line 824
    if-eqz v0, :cond_2

    .line 825
    invoke-interface {v0}, Lcom/qihoo/security/enginehelper/clean/a$a;->d()V

    .line 828
    :cond_2
    monitor-exit p0

    .line 830
    :cond_3
    return-void

    .line 828
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/enginehelper/clean/a;)Z
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/qihoo/security/enginehelper/clean/a;->o()Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/enginehelper/clean/a;[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;)[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->l:[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/enginehelper/clean/a;I)I
    .locals 0

    .prologue
    .line 24
    iput p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/enginehelper/clean/a;Lcom/qihoo/security/enginehelper/clean/CleanScanType;)Lcom/qihoo/security/enginehelper/clean/CleanScanType;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->k:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/enginehelper/clean/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->o:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/enginehelper/clean/a;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/qihoo/security/enginehelper/clean/a;->l()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/enginehelper/clean/a;I)I
    .locals 0

    .prologue
    .line 24
    iput p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->e:I

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/enginehelper/clean/a;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/qihoo/security/enginehelper/clean/a;->n()V

    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/enginehelper/clean/a;I)I
    .locals 0

    .prologue
    .line 24
    iput p1, p0, Lcom/qihoo/security/enginehelper/clean/a;->f:I

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/enginehelper/clean/a;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/qihoo/security/enginehelper/clean/a;->k()V

    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/enginehelper/clean/a;)[B
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->t:[B

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/enginehelper/clean/a;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/qihoo/security/enginehelper/clean/a;->p()V

    return-void
.end method

.method static synthetic g(Lcom/qihoo/security/enginehelper/clean/a;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/qihoo/security/enginehelper/clean/a;->q()V

    return-void
.end method

.method static synthetic h(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->n:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic h()Z
    .locals 1

    .prologue
    .line 24
    sget-boolean v0, Lcom/qihoo/security/enginehelper/clean/a;->a:Z

    return v0
.end method

.method static synthetic i(Lcom/qihoo/security/enginehelper/clean/a;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->d:I

    return v0
.end method

.method static synthetic i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/security/enginehelper/clean/a;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    return v0
.end method

.method private j()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 556
    new-instance v0, Lcom/qihoo/security/clearengine/b/a;

    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a;->i:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/clearengine/b/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    .line 557
    iput v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    .line 558
    iput v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->d:I

    .line 559
    iput v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->e:I

    .line 560
    return-void
.end method

.method static synthetic k(Lcom/qihoo/security/enginehelper/clean/a;)Lcom/qihoo/security/enginehelper/clean/CleanScanType;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->j:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    return-object v0
.end method

.method private k()V
    .locals 8

    .prologue
    const/16 v1, 0x24

    const/4 v3, 0x0

    const/16 v0, 0xb

    .line 563
    const/16 v2, 0xc

    iput v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    .line 565
    iget-object v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->k:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    iput-object v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->j:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    .line 566
    iget-object v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->j:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    if-eqz v2, :cond_0

    .line 567
    sget-object v2, Lcom/qihoo/security/enginehelper/clean/a$6;->a:[I

    iget-object v4, p0, Lcom/qihoo/security/enginehelper/clean/a;->j:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    invoke-virtual {v4}, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->ordinal()I

    move-result v4

    aget v2, v2, v4

    packed-switch v2, :pswitch_data_0

    .line 580
    :cond_0
    :goto_0
    :pswitch_0
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/clearengine/b/a;->b(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 586
    const/4 v0, 0x0

    .line 587
    iget-object v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->l:[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/qihoo/security/enginehelper/clean/a;->l:[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    array-length v2, v2

    if-lez v2, :cond_2

    .line 590
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->l:[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    array-length v0, v0

    new-array v2, v0, [I

    .line 591
    iget-object v5, p0, Lcom/qihoo/security/enginehelper/clean/a;->l:[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    array-length v6, v5

    move v4, v3

    :goto_1
    if-ge v3, v6, :cond_1

    aget-object v0, v5, v3

    .line 592
    sget-object v7, Lcom/qihoo/security/enginehelper/clean/a$6;->b:[I

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->ordinal()I

    move-result v0

    aget v0, v7, v0

    packed-switch v0, :pswitch_data_1

    move v0, v1

    .line 616
    :goto_2
    aput v0, v2, v4

    .line 618
    add-int/lit8 v4, v4, 0x1

    .line 591
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 575
    :pswitch_1
    const/16 v0, 0xe

    goto :goto_0

    .line 581
    :catch_0
    move-exception v0

    .line 582
    invoke-direct {p0, v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;)V

    .line 633
    :goto_3
    return-void

    .line 594
    :pswitch_2
    const/16 v0, 0x22

    .line 595
    goto :goto_2

    .line 597
    :pswitch_3
    const/16 v0, 0x23

    .line 598
    goto :goto_2

    .line 600
    :pswitch_4
    const/16 v0, 0x20

    .line 601
    goto :goto_2

    .line 603
    :pswitch_5
    const/16 v0, 0x1f

    .line 604
    goto :goto_2

    :pswitch_6
    move v0, v1

    .line 607
    goto :goto_2

    .line 609
    :pswitch_7
    const/16 v0, 0x21

    .line 610
    goto :goto_2

    :cond_1
    move-object v0, v2

    .line 624
    :cond_2
    :try_start_1
    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/clearengine/b/a;->a([I)V

    .line 625
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/b/a;->a(Ljava/util/ArrayList;)V

    .line 626
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/b/a;->b()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 632
    invoke-direct {p0}, Lcom/qihoo/security/enginehelper/clean/a;->m()V

    goto :goto_3

    .line 627
    :catch_1
    move-exception v0

    .line 628
    invoke-direct {p0, v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;)V

    goto :goto_3

    .line 567
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 592
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method static synthetic l(Lcom/qihoo/security/enginehelper/clean/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->i:Landroid/content/Context;

    return-object v0
.end method

.method private l()V
    .locals 10

    .prologue
    const-wide/16 v8, 0x32

    const/16 v6, 0x65

    .line 707
    sget-boolean v0, Lcom/qihoo/security/enginehelper/clean/a;->a:Z

    if-eqz v0, :cond_0

    .line 708
    sget-boolean v0, Lcom/qihoo/security/enginehelper/clean/a;->a:Z

    if-eqz v0, :cond_0

    .line 709
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/a;->b:Ljava/lang/String;

    const-string/jumbo v1, "check engine state"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 712
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/b/a;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 713
    const/16 v0, 0x64

    iput v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->f:I

    .line 715
    :cond_1
    iget v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->f:I

    if-eq v0, v6, :cond_4

    .line 716
    invoke-virtual {p0}, Lcom/qihoo/security/enginehelper/clean/a;->e()V

    .line 724
    const/4 v0, 0x0

    .line 726
    :cond_2
    iget v1, p0, Lcom/qihoo/security/enginehelper/clean/a;->f:I

    if-ne v1, v6, :cond_5

    .line 727
    sget-boolean v1, Lcom/qihoo/security/enginehelper/clean/a;->a:Z

    if-eqz v1, :cond_3

    .line 728
    sget-object v1, Lcom/qihoo/security/enginehelper/clean/a;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "check engine state success used time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    int-to-long v4, v0

    mul-long/2addr v4, v8

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 744
    :cond_3
    :goto_0
    return-void

    .line 718
    :cond_4
    sget-boolean v0, Lcom/qihoo/security/enginehelper/clean/a;->a:Z

    if-eqz v0, :cond_3

    .line 719
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/a;->b:Ljava/lang/String;

    const-string/jumbo v1, "check engine state success"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 733
    :cond_5
    const-wide/16 v2, 0x32

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 737
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 738
    int-to-long v2, v0

    const-wide/16 v4, 0x28

    cmp-long v1, v2, v4

    if-nez v1, :cond_2

    .line 739
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/a;->b:Ljava/lang/String;

    const-string/jumbo v1, "check engine state fail"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 734
    :catch_0
    move-exception v1

    .line 735
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_1
.end method

.method static synthetic m(Lcom/qihoo/security/enginehelper/clean/a;)Lcom/qihoo/security/opti/trashclear/ui/e;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->r:Lcom/qihoo/security/opti/trashclear/ui/e;

    return-object v0
.end method

.method private m()V
    .locals 2

    .prologue
    .line 747
    sget-boolean v0, Lcom/qihoo/security/enginehelper/clean/a;->a:Z

    if-eqz v0, :cond_0

    .line 748
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/a;->b:Ljava/lang/String;

    const-string/jumbo v1, "scantest cleanEngineHelper startScanTrash"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 750
    :cond_0
    const/16 v0, 0xd

    iput v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    .line 751
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->o:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->n:Ljava/lang/ref/WeakReference;

    .line 752
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->j:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->FULL:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    if-ne v0, v1, :cond_1

    .line 753
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->r:Lcom/qihoo/security/opti/trashclear/ui/e;

    .line 756
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/b/a;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 761
    :goto_0
    return-void

    .line 757
    :catch_0
    move-exception v0

    .line 758
    invoke-direct {p0, v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method static synthetic n(Lcom/qihoo/security/enginehelper/clean/a;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->e:I

    return v0
.end method

.method private n()V
    .locals 2

    .prologue
    .line 764
    const/16 v0, 0xf

    iput v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    .line 766
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/b/a;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 772
    :goto_0
    return-void

    .line 767
    :catch_0
    move-exception v0

    .line 768
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;Z)V

    goto :goto_0
.end method

.method static synthetic o(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private o()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 775
    iget v1, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    if-eq v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic p(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->p:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method private p()V
    .locals 2

    .prologue
    .line 780
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->ALL_TRASH_TYPES:[Lcom/qihoo/security/clearengine/TrashType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/b/a;->a([Lcom/qihoo/security/clearengine/TrashType;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 786
    :goto_0
    return-void

    .line 781
    :catch_0
    move-exception v0

    .line 782
    invoke-direct {p0, v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method static synthetic q(Lcom/qihoo/security/enginehelper/clean/a;)Lcom/qihoo/security/clearengine/surface/a;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->u:Lcom/qihoo/security/clearengine/surface/a;

    return-object v0
.end method

.method private q()V
    .locals 1

    .prologue
    .line 789
    const/16 v0, 0xc

    iput v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    .line 790
    invoke-direct {p0}, Lcom/qihoo/security/enginehelper/clean/a;->r()V

    .line 791
    return-void
.end method

.method static synthetic r(Lcom/qihoo/security/enginehelper/clean/a;)Lcom/qihoo/security/clearengine/b/a;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    return-object v0
.end method

.method private r()V
    .locals 2

    .prologue
    .line 794
    const/16 v0, 0x29

    iput v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->c:I

    .line 796
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a;->q:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/b/a;->a(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 801
    :goto_0
    return-void

    .line 797
    :catch_0
    move-exception v0

    .line 798
    invoke-direct {p0, v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;"
        }
    .end annotation

    .prologue
    .line 664
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/b/a;->a(I)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 667
    :goto_0
    return-object v0

    .line 665
    :catch_0
    move-exception v0

    .line 666
    invoke-direct {p0, v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;)V

    .line 667
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public declared-synchronized a()V
    .locals 2

    .prologue
    .line 124
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$7;

    invoke-direct {v1, p0}, Lcom/qihoo/security/enginehelper/clean/a$7;-><init>(Lcom/qihoo/security/enginehelper/clean/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    monitor-exit p0

    return-void

    .line 124
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(ILcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
    .locals 1

    .prologue
    .line 674
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v0, p1, p2}, Lcom/qihoo/security/clearengine/b/a;->a(ILcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 680
    :goto_0
    return-void

    .line 675
    :catch_0
    move-exception v0

    .line 676
    invoke-direct {p0, v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public declared-synchronized a(Lcom/qihoo/security/enginehelper/clean/CleanScanType;)V
    .locals 2

    .prologue
    .line 169
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$8;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/enginehelper/clean/a$8;-><init>(Lcom/qihoo/security/enginehelper/clean/a;Lcom/qihoo/security/enginehelper/clean/CleanScanType;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    monitor-exit p0

    return-void

    .line 169
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/qihoo/security/enginehelper/clean/a$b;)V
    .locals 2

    .prologue
    .line 110
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$1;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/enginehelper/clean/a$1;-><init>(Lcom/qihoo/security/enginehelper/clean/a;Lcom/qihoo/security/enginehelper/clean/a$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    monitor-exit p0

    return-void

    .line 110
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 194
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$10;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/enginehelper/clean/a$10;-><init>(Lcom/qihoo/security/enginehelper/clean/a;Ljava/util/ArrayList;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    monitor-exit p0

    return-void

    .line 194
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 251
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$2;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/enginehelper/clean/a$2;-><init>(Lcom/qihoo/security/enginehelper/clean/a;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 265
    monitor-exit p0

    return-void

    .line 251
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a([Lcom/qihoo/security/enginehelper/clean/CleanTrashType;)V
    .locals 2

    .prologue
    .line 183
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$9;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/enginehelper/clean/a$9;-><init>(Lcom/qihoo/security/enginehelper/clean/a;[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    monitor-exit p0

    return-void

    .line 183
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z
    .locals 1

    .prologue
    .line 684
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 687
    :goto_0
    return v0

    .line 685
    :catch_0
    move-exception v0

    .line 686
    invoke-direct {p0, v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;)V

    .line 687
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public declared-synchronized b()V
    .locals 2

    .prologue
    .line 205
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$11;

    invoke-direct {v1, p0}, Lcom/qihoo/security/enginehelper/clean/a$11;-><init>(Lcom/qihoo/security/enginehelper/clean/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    monitor-exit p0

    return-void

    .line 205
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 1

    .prologue
    .line 694
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->g:Lcom/qihoo/security/clearengine/b/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/b/a;->d(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 700
    :goto_0
    return-void

    .line 695
    :catch_0
    move-exception v0

    .line 696
    invoke-direct {p0, v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public declared-synchronized c()V
    .locals 2

    .prologue
    .line 226
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$12;

    invoke-direct {v1, p0}, Lcom/qihoo/security/enginehelper/clean/a$12;-><init>(Lcom/qihoo/security/enginehelper/clean/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    monitor-exit p0

    return-void

    .line 226
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()Lcom/qihoo/security/opti/trashclear/ui/e;
    .locals 1

    .prologue
    .line 268
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->r:Lcom/qihoo/security/opti/trashclear/ui/e;

    return-object v0
.end method

.method public declared-synchronized e()V
    .locals 1

    .prologue
    .line 636
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/qihoo/security/enginehelper/clean/a$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/enginehelper/clean/a$4;-><init>(Lcom/qihoo/security/enginehelper/clean/a;)V

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a$4;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 645
    monitor-exit p0

    return-void

    .line 636
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f()V
    .locals 2

    .prologue
    .line 648
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/qihoo/security/enginehelper/clean/a$5;

    invoke-direct {v1, p0}, Lcom/qihoo/security/enginehelper/clean/a$5;-><init>(Lcom/qihoo/security/enginehelper/clean/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 660
    monitor-exit p0

    return-void

    .line 648
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 703
    invoke-direct {p0}, Lcom/qihoo/security/enginehelper/clean/a;->o()Z

    move-result v0

    return v0
.end method
