.class final Lcom/google/android/gms/common/internal/ac;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/internal/aa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/aa;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/ac;->a:Lcom/google/android/gms/common/internal/aa;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method private static a(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/internal/ad;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ad;->c()V

    return-void
.end method

.method private static b(Landroid/os/Message;)Z
    .locals 3

    const/4 v0, 0x1

    iget v1, p0, Landroid/os/Message;->what:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    iget v1, p0, Landroid/os/Message;->what:I

    if-eq v1, v0, :cond_0

    iget v1, p0, Landroid/os/Message;->what:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    iget v1, p0, Landroid/os/Message;->what:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x4

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ac;->a:Lcom/google/android/gms/common/internal/aa;

    iget-object v0, v0, Lcom/google/android/gms/common/internal/aa;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    if-eq v0, v1, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/ac;->b(Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/ac;->a(Landroid/os/Message;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    if-eq v0, v3, :cond_2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/common/internal/ac;->a:Lcom/google/android/gms/common/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/aa;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/ac;->a(Landroid/os/Message;)V

    goto :goto_0

    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/ac;->a:Lcom/google/android/gms/common/internal/aa;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/aa;->a(Lcom/google/android/gms/common/internal/aa;)Lcom/google/android/gms/common/api/o;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/common/api/o;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-static {}, Lcom/google/android/gms/common/internal/aa;->g_()V

    goto :goto_0

    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v2, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ac;->a:Lcom/google/android/gms/common/internal/aa;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/aa;->a(Lcom/google/android/gms/common/internal/aa;I)V

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ac;->a:Lcom/google/android/gms/common/internal/aa;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/aa;->b(Lcom/google/android/gms/common/internal/aa;)Lcom/google/android/gms/common/api/k;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ac;->a:Lcom/google/android/gms/common/internal/aa;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/aa;->b(Lcom/google/android/gms/common/internal/aa;)Lcom/google/android/gms/common/api/k;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/k;->onConnectionSuspended(I)V

    :cond_5
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-static {}, Lcom/google/android/gms/common/internal/aa;->c()V

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ac;->a:Lcom/google/android/gms/common/internal/aa;

    invoke-static {v0, v2, v3, v4}, Lcom/google/android/gms/common/internal/aa;->a(Lcom/google/android/gms/common/internal/aa;IILandroid/os/IInterface;)Z

    goto :goto_0

    :cond_6
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ac;->a:Lcom/google/android/gms/common/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/aa;->isConnected()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {p1}, Lcom/google/android/gms/common/internal/ac;->a(Landroid/os/Message;)V

    goto :goto_0

    :cond_7
    invoke-static {p1}, Lcom/google/android/gms/common/internal/ac;->b(Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/internal/ad;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ad;->b()V

    goto :goto_0

    :cond_8
    const-string v0, "GmsClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Don\'t know how to handle message: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    invoke-static {v0, v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0
.end method
