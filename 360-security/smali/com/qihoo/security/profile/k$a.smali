.class Lcom/qihoo/security/profile/k$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/profile/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Lcom/qihoo/security/profile/d;

.field final synthetic c:Lcom/qihoo/security/profile/k;


# direct methods
.method constructor <init>(Lcom/qihoo/security/profile/k;Lcom/qihoo/security/profile/d;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/qihoo/security/profile/k$a;->c:Lcom/qihoo/security/profile/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p2, p0, Lcom/qihoo/security/profile/k$a;->b:Lcom/qihoo/security/profile/d;

    .line 91
    iput-object p3, p0, Lcom/qihoo/security/profile/k$a;->a:Ljava/lang/String;

    .line 92
    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 6

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/profile/k$a;->c:Lcom/qihoo/security/profile/k;

    invoke-static {v0}, Lcom/qihoo/security/profile/k;->a(Lcom/qihoo/security/profile/k;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    .line 83
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/profile/k$a;->c:Lcom/qihoo/security/profile/k;

    invoke-static {v0}, Lcom/qihoo/security/profile/k;->a(Lcom/qihoo/security/profile/k;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/profile/k$a;->b:Lcom/qihoo/security/profile/d;

    invoke-interface {v2}, Lcom/qihoo/security/profile/d;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/profile/k$a;->c:Lcom/qihoo/security/profile/k;

    const/4 v2, -0x1

    const/4 v3, 0x2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/qihoo/security/profile/k$a;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string/jumbo v5, " died"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v2, v3, v4}, Lcom/qihoo/security/profile/k;->a(Lcom/qihoo/security/profile/k;IILjava/lang/String;)V

    .line 86
    monitor-exit v1

    .line 87
    return-void

    .line 86
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
