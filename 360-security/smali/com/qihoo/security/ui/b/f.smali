.class public Lcom/qihoo/security/ui/b/f;
.super Lcom/qihoo/security/ui/b/d$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/b/f$1;,
        Lcom/qihoo/security/ui/b/f$a;
    }
.end annotation


# static fields
.field private static a:Lcom/qihoo/security/ui/b/f;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/qihoo/security/ui/b/f$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/qihoo/security/ui/b/d$a;-><init>()V

    .line 37
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/b/f;->b:Landroid/content/Context;

    .line 24
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/b/f;)Landroid/util/SparseArray;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    return-object v0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/qihoo/security/ui/b/f;
    .locals 2

    .prologue
    .line 13
    const-class v1, Lcom/qihoo/security/ui/b/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/b/f;->a:Lcom/qihoo/security/ui/b/f;

    if-nez v0, :cond_0

    .line 14
    new-instance v0, Lcom/qihoo/security/ui/b/f;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/b/f;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/ui/b/f;->a:Lcom/qihoo/security/ui/b/f;

    .line 16
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/b/f;->a:Lcom/qihoo/security/ui/b/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 13
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public a(Landroid/os/IBinder;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 43
    iget-object v1, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    monitor-enter v1

    .line 44
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/f$a;

    .line 45
    if-eqz v0, :cond_0

    .line 46
    const-string/jumbo v0, "UiBarrierManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " already acquired"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    :goto_0
    monitor-exit v1

    .line 55
    return-void

    .line 48
    :cond_0
    new-instance v0, Lcom/qihoo/security/ui/b/f$a;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/qihoo/security/ui/b/f$a;-><init>(Lcom/qihoo/security/ui/b/f;Lcom/qihoo/security/ui/b/f$1;)V

    .line 49
    iput p2, v0, Lcom/qihoo/security/ui/b/f$a;->a:I

    .line 50
    iput-object p1, v0, Lcom/qihoo/security/ui/b/f$a;->b:Landroid/os/IBinder;

    .line 51
    const/4 v2, 0x0

    invoke-interface {p1, v0, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 52
    iget-object v2, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    invoke-virtual {v2, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 77
    iget-object v2, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    monitor-enter v2

    .line 78
    if-gez p1, :cond_1

    .line 79
    :try_start_0
    iget-object v3, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-lez v3, :cond_0

    :goto_0
    monitor-exit v2

    .line 81
    :goto_1
    return v0

    :cond_0
    move v0, v1

    .line 79
    goto :goto_0

    .line 81
    :cond_1
    iget-object v3, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    :goto_2
    monitor-exit v2

    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    move v0, v1

    .line 81
    goto :goto_2
.end method

.method public b(Landroid/os/IBinder;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 62
    iget-object v1, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    monitor-enter v1

    .line 63
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/f$a;

    .line 64
    if-nez v0, :cond_0

    .line 72
    :goto_0
    monitor-exit v1

    .line 73
    return-void

    .line 69
    :cond_0
    iget-object v2, v0, Lcom/qihoo/security/ui/b/f$a;->b:Landroid/os/IBinder;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 70
    iget-object v0, p0, Lcom/qihoo/security/ui/b/f;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->remove(I)V

    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
