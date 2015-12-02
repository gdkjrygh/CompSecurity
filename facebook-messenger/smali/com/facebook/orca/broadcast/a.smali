.class Lcom/facebook/orca/broadcast/a;
.super Lcom/facebook/fbservice/ops/h;
.source "BroadcastActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/broadcast/BroadcastActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/broadcast/BroadcastActivity;)V
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 5

    .prologue
    .line 153
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/SendBroadcastResult;

    .line 154
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/orca/server/SendBroadcastResult;->a()Lcom/google/common/a/ev;

    move-result-object v1

    if-nez v1, :cond_1

    .line 155
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    const-string v1, "broadcast_success_null_result"

    const-string v2, "unknown"

    const/4 v3, -0x1

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/BroadcastActivity;Ljava/lang/String;Ljava/lang/String;I)V

    .line 156
    iget-object v0, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    .line 177
    :goto_0
    return-void

    .line 160
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendBroadcastResult;->c()Ljava/lang/String;

    move-result-object v1

    .line 161
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendBroadcastResult;->d()I

    move-result v2

    .line 163
    iget-object v3, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v3, v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/BroadcastActivity;Lcom/facebook/orca/server/SendBroadcastResult;)Ljava/util/List;

    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    const-string v3, "broadcast_success"

    invoke-static {v0, v3, v1, v2}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/BroadcastActivity;Ljava/lang/String;Ljava/lang/String;I)V

    .line 166
    iget-object v0, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    goto :goto_0

    .line 170
    :cond_2
    iget-object v3, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    const-string v4, "broadcast_success_partial"

    invoke-static {v3, v4, v1, v2}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/BroadcastActivity;Ljava/lang/String;Ljava/lang/String;I)V

    .line 172
    iget-object v1, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v1, v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/BroadcastActivity;Ljava/util/List;)V

    .line 173
    iget-object v0, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->broadcast_failed_for_some_recipients:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 7

    .prologue
    .line 181
    invoke-static {}, Lcom/facebook/orca/broadcast/BroadcastActivity;->j()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Error broadcasting: %s"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 183
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 184
    const/4 v1, 0x0

    .line 185
    if-eqz v0, :cond_1

    .line 186
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    .line 187
    instance-of v2, v0, Lcom/facebook/orca/server/SendBroadcastResult;

    if-eqz v2, :cond_0

    .line 188
    check-cast v0, Lcom/facebook/orca/server/SendBroadcastResult;

    .line 194
    :goto_0
    const-string v2, "unknown"

    .line 195
    const/4 v1, -0x1

    .line 196
    if-eqz v0, :cond_2

    .line 197
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendBroadcastResult;->c()Ljava/lang/String;

    move-result-object v1

    .line 198
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendBroadcastResult;->d()I

    move-result v0

    .line 200
    :goto_1
    iget-object v2, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    const-string v3, "broadcast_failure"

    invoke-static {v2, v3, v1, v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/BroadcastActivity;Ljava/lang/String;Ljava/lang/String;I)V

    .line 202
    iget-object v0, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->b(Lcom/facebook/orca/broadcast/BroadcastActivity;)Lcom/facebook/common/e/h;

    move-result-object v0

    const-string v1, "Broadcast"

    const-string v2, "ServiceException while sending a broadcast"

    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    iget-object v0, p0, Lcom/facebook/orca/broadcast/a;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->send_failed_error:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 208
    return-void

    .line 190
    :cond_0
    invoke-static {}, Lcom/facebook/orca/broadcast/BroadcastActivity;->j()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "wrong type: %s:%s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    move v0, v1

    move-object v1, v2

    goto :goto_1
.end method
