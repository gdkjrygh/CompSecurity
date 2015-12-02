.class Lcom/facebook/widget/a/d;
.super Landroid/os/Handler;
.source "AbstractCustomFilter.java"


# instance fields
.field final synthetic a:Lcom/facebook/widget/a/a;


# direct methods
.method public constructor <init>(Lcom/facebook/widget/a/a;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    .line 159
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 160
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    .line 170
    iget v2, p1, Landroid/os/Message;->what:I

    .line 172
    sparse-switch v2, :sswitch_data_0

    .line 202
    :goto_0
    return-void

    .line 174
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/facebook/widget/a/c;

    .line 176
    :try_start_0
    iget-object v1, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    iget-object v3, v0, Lcom/facebook/widget/a/c;->a:Ljava/lang/CharSequence;

    invoke-virtual {v1, v3}, Lcom/facebook/widget/a/a;->b(Ljava/lang/CharSequence;)Lcom/facebook/widget/a/i;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/widget/a/c;->c:Lcom/facebook/widget/a/i;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 181
    iget-object v1, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    invoke-static {v1}, Lcom/facebook/widget/a/a;->a(Lcom/facebook/widget/a/a;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 182
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 183
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 186
    :goto_1
    iget-object v0, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    invoke-static {v0}, Lcom/facebook/widget/a/a;->b(Lcom/facebook/widget/a/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 187
    :try_start_1
    iget-object v0, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    invoke-static {v0}, Lcom/facebook/widget/a/a;->c(Lcom/facebook/widget/a/a;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    invoke-static {v0}, Lcom/facebook/widget/a/a;->c(Lcom/facebook/widget/a/a;)Landroid/os/Handler;

    move-result-object v0

    const v2, -0x21524111

    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 189
    iget-object v2, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    invoke-static {v2}, Lcom/facebook/widget/a/a;->c(Lcom/facebook/widget/a/a;)Landroid/os/Handler;

    move-result-object v2

    const-wide/16 v3, 0xbb8

    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 191
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 177
    :catch_0
    move-exception v1

    .line 178
    :try_start_2
    new-instance v3, Lcom/facebook/widget/a/i;

    invoke-direct {v3}, Lcom/facebook/widget/a/i;-><init>()V

    iput-object v3, v0, Lcom/facebook/widget/a/c;->c:Lcom/facebook/widget/a/i;

    .line 179
    const-string v3, "Filter"

    const-string v4, "An exception occured during performFiltering()!"

    invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 181
    iget-object v1, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    invoke-static {v1}, Lcom/facebook/widget/a/a;->a(Lcom/facebook/widget/a/a;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 182
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 183
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1

    .line 181
    :catchall_1
    move-exception v1

    iget-object v3, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    invoke-static {v3}, Lcom/facebook/widget/a/a;->a(Lcom/facebook/widget/a/a;)Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 182
    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 183
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    throw v1

    .line 194
    :sswitch_1
    iget-object v0, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    invoke-static {v0}, Lcom/facebook/widget/a/a;->b(Lcom/facebook/widget/a/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 195
    :try_start_3
    iget-object v0, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    invoke-static {v0}, Lcom/facebook/widget/a/a;->c(Lcom/facebook/widget/a/a;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 196
    iget-object v0, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    invoke-static {v0}, Lcom/facebook/widget/a/a;->c(Lcom/facebook/widget/a/a;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 197
    iget-object v0, p0, Lcom/facebook/widget/a/d;->a:Lcom/facebook/widget/a/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/facebook/widget/a/a;->a(Lcom/facebook/widget/a/a;Landroid/os/Handler;)Landroid/os/Handler;

    .line 199
    :cond_1
    monitor-exit v1

    goto/16 :goto_0

    :catchall_2
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    .line 172
    nop

    :sswitch_data_0
    .sparse-switch
        -0x2f2f0ff3 -> :sswitch_0
        -0x21524111 -> :sswitch_1
    .end sparse-switch
.end method
