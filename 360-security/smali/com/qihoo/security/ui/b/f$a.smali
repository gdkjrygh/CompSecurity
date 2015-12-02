.class Lcom/qihoo/security/ui/b/f$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:Landroid/os/IBinder;

.field final synthetic c:Lcom/qihoo/security/ui/b/f;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/b/f;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/qihoo/security/ui/b/f$a;->c:Lcom/qihoo/security/ui/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/b/f;Lcom/qihoo/security/ui/b/f$1;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/b/f$a;-><init>(Lcom/qihoo/security/ui/b/f;)V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 3

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/ui/b/f$a;->b:Landroid/os/IBinder;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 32
    iget-object v0, p0, Lcom/qihoo/security/ui/b/f$a;->c:Lcom/qihoo/security/ui/b/f;

    invoke-static {v0}, Lcom/qihoo/security/ui/b/f;->a(Lcom/qihoo/security/ui/b/f;)Landroid/util/SparseArray;

    move-result-object v1

    monitor-enter v1

    .line 33
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/f$a;->c:Lcom/qihoo/security/ui/b/f;

    invoke-static {v0}, Lcom/qihoo/security/ui/b/f;->a(Lcom/qihoo/security/ui/b/f;)Landroid/util/SparseArray;

    move-result-object v0

    iget v2, p0, Lcom/qihoo/security/ui/b/f$a;->a:I

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 34
    monitor-exit v1

    .line 35
    return-void

    .line 34
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
