.class public Lcom/qihoo/security/clearengine/service/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field protected a:I

.field protected b:[I

.field protected c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashScan;

.field e:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashClear;

.field private f:Ljava/lang/Object;

.field private g:Lcom/qihoo/security/clearengine/service/c;

.field private h:Lcom/qihoo/security/clearengine/service/b;

.field private i:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;

.field private j:Lcom/qihoo360/mobilesafe/opti/i/IClearModule;

.field private k:Lcom/qihoo/security/clearengine/a/a;

.field private l:Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;

.field private m:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lcom/qihoo/security/e/a;

.field private o:Landroid/os/Handler;

.field private final p:I

.field private final q:J

.field private r:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;Lcom/qihoo360/mobilesafe/opti/i/IClearModule;Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/16 v0, 0xb

    iput v0, p0, Lcom/qihoo/security/clearengine/service/a;->a:I

    .line 41
    iput-object v1, p0, Lcom/qihoo/security/clearengine/service/a;->b:[I

    .line 45
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->f:Ljava/lang/Object;

    .line 50
    iput-object v1, p0, Lcom/qihoo/security/clearengine/service/a;->i:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;

    .line 53
    iput-object v1, p0, Lcom/qihoo/security/clearengine/service/a;->j:Lcom/qihoo360/mobilesafe/opti/i/IClearModule;

    .line 107
    new-instance v0, Lcom/qihoo/security/clearengine/service/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/service/a$1;-><init>(Lcom/qihoo/security/clearengine/service/a;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashScan;

    .line 143
    new-instance v0, Lcom/qihoo/security/clearengine/service/a$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/service/a$2;-><init>(Lcom/qihoo/security/clearengine/service/a;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->k:Lcom/qihoo/security/clearengine/a/a;

    .line 240
    new-instance v0, Lcom/qihoo/security/clearengine/service/a$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/service/a$3;-><init>(Lcom/qihoo/security/clearengine/service/a;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->e:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashClear;

    .line 279
    iput-object v1, p0, Lcom/qihoo/security/clearengine/service/a;->l:Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;

    .line 282
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->m:Landroid/util/SparseArray;

    .line 298
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/clearengine/service/a;->p:I

    .line 299
    const-wide/32 v0, 0x927c0

    iput-wide v0, p0, Lcom/qihoo/security/clearengine/service/a;->q:J

    .line 300
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 56
    iput-object p1, p0, Lcom/qihoo/security/clearengine/service/a;->i:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;

    .line 57
    iput-object p2, p0, Lcom/qihoo/security/clearengine/service/a;->j:Lcom/qihoo360/mobilesafe/opti/i/IClearModule;

    .line 58
    iput-object p3, p0, Lcom/qihoo/security/clearengine/service/a;->l:Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;

    .line 60
    new-instance v0, Lcom/qihoo/security/clearengine/service/c;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/service/a;->f:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lcom/qihoo/security/clearengine/service/c;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->g:Lcom/qihoo/security/clearengine/service/c;

    .line 61
    new-instance v0, Lcom/qihoo/security/clearengine/service/b;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/service/a;->f:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lcom/qihoo/security/clearengine/service/b;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->h:Lcom/qihoo/security/clearengine/service/b;

    .line 62
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/c;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->g:Lcom/qihoo/security/clearengine/service/c;

    return-object v0
.end method

.method private final a(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 313
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 319
    :goto_0
    return-void

    .line 315
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->n:Lcom/qihoo/security/e/a;

    const-string/jumbo v1, "scan %d takes another 10m"

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/qihoo/security/clearengine/service/a;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Lcom/qihoo/security/e/a;->a(ILjava/lang/String;)Z

    .line 316
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->o:Landroid/os/Handler;

    const-wide/32 v2, 0x927c0

    invoke-virtual {v0, v5, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 313
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/service/a;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 312
    invoke-direct {p0, p1}, Lcom/qihoo/security/clearengine/service/a;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/clearengine/service/a;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/clearengine/service/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->o:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/b;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->h:Lcom/qihoo/security/clearengine/service/b;

    return-object v0
.end method


# virtual methods
.method protected a(I)Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;
    .locals 2

    .prologue
    .line 285
    .line 286
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->m:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;

    .line 287
    if-nez v0, :cond_0

    .line 288
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->l:Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;

    invoke-interface {v0, p1}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;->getUserBWList(I)Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;

    move-result-object v0

    .line 289
    iget-object v1, p0, Lcom/qihoo/security/clearengine/service/a;->m:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 291
    :cond_0
    return-object v0
.end method

.method public a()V
    .locals 5

    .prologue
    .line 79
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->i:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;

    iget v1, p0, Lcom/qihoo/security/clearengine/service/a;->a:I

    iget-object v2, p0, Lcom/qihoo/security/clearengine/service/a;->b:[I

    iget-object v3, p0, Lcom/qihoo/security/clearengine/service/a;->c:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/qihoo/security/clearengine/service/a;->d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashScan;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;->scan(I[ILjava/util/List;Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashScan;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    :goto_0
    return-void

    .line 80
    :catch_0
    move-exception v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public a(I[ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[I",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 68
    iput p1, p0, Lcom/qihoo/security/clearengine/service/a;->a:I

    .line 69
    iput-object p2, p0, Lcom/qihoo/security/clearengine/service/a;->b:[I

    .line 70
    iput-object p3, p0, Lcom/qihoo/security/clearengine/service/a;->c:Ljava/util/ArrayList;

    .line 71
    return-void
.end method

.method final a(Lcom/qihoo/security/e/a;)V
    .locals 2

    .prologue
    .line 303
    iput-object p1, p0, Lcom/qihoo/security/clearengine/service/a;->n:Lcom/qihoo/security/e/a;

    .line 304
    new-instance v0, Lcom/qihoo/security/clearengine/service/a$4;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/service/a;->n:Lcom/qihoo/security/e/a;

    invoke-virtual {v1}, Lcom/qihoo/security/e/a;->a()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/clearengine/service/a$4;-><init>(Lcom/qihoo/security/clearengine/service/a;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->o:Landroid/os/Handler;

    .line 310
    return-void
.end method

.method public a(Ljava/util/List;)V
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
    .line 96
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->i:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/service/a;->e:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashClear;

    invoke-interface {v0, p1, v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;->clearByTrashInfo(Ljava/util/List;Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashClear;)I

    .line 100
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->i:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/service/a;->d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashScan;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;->cancelScan(Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashScan;)V

    .line 90
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->i:Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;->cancelClear()V

    .line 105
    return-void
.end method

.method public d()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 275
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a;->k:Lcom/qihoo/security/clearengine/a/a;

    invoke-interface {v0}, Lcom/qihoo/security/clearengine/a/a;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method
