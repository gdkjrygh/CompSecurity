.class Lcom/qihoo/security/opti/trashclear/service/e$3;
.super Lcom/qihoo/security/opti/trashclear/service/d$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/service/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/service/e;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/service/e;)V
    .locals 0

    .prologue
    .line 535
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/service/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 547
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 548
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/service/e;->c(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "last_time_cancel_residual_file_dialog"

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 552
    sub-long v2, v0, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/16 v4, 0x4e20

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    .line 556
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/service/e;->c(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "start_time_silence_residual_file_dialog"

    invoke-static {v2, v3, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 558
    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/service/e;->c(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "last_time_cancel_residual_file_dialog"

    invoke-static {v2, v3, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 559
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 539
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->g(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 540
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->g(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/service/e;->g(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p1}, Lcom/qihoo/security/opti/trashclear/service/e$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/service/e$b;->sendMessage(Landroid/os/Message;)Z

    .line 543
    :cond_0
    return-void
.end method

.method public b()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 571
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 572
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/service/e;->c(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "last_time_cancel_add_file_dialog"

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 576
    sub-long v2, v0, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/16 v4, 0x4e20

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    .line 580
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/service/e;->c(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "start_time_silence_add_file_dialog"

    invoke-static {v2, v3, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 582
    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/service/e;->c(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "last_time_cancel_add_file_dialog"

    invoke-static {v2, v3, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 583
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 563
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->g(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 564
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->g(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$3;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/service/e;->g(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$b;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2, p1}, Lcom/qihoo/security/opti/trashclear/service/e$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/service/e$b;->sendMessage(Landroid/os/Message;)Z

    .line 567
    :cond_0
    return-void
.end method
