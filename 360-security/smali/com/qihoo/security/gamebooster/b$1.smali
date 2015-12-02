.class Lcom/qihoo/security/gamebooster/b$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/b;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 118
    if-nez p1, :cond_1

    .line 334
    :cond_0
    :goto_0
    return-void

    .line 121
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 123
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/gamebooster/b$b;

    .line 124
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b$b;)V

    goto :goto_0

    .line 127
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    if-nez v0, :cond_2

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->b(Lcom/qihoo/security/gamebooster/b;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->b(Lcom/qihoo/security/gamebooster/b;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x7

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 131
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->c(Lcom/qihoo/security/gamebooster/b;)V

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->e()Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    .line 133
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/gamebooster/h;

    .line 134
    if-eqz v0, :cond_0

    .line 135
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v2, v0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/h;Lcom/qihoo/security/gamebooster/g;)V

    goto :goto_0

    .line 139
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->d(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)Lcom/qihoo/security/gamebooster/g;

    .line 140
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    if-nez v0, :cond_3

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->e(Lcom/qihoo/security/gamebooster/b;)V

    .line 149
    :cond_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->e()Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    .line 153
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/gamebooster/h;

    .line 154
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v2, v0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/h;Lcom/qihoo/security/gamebooster/g;)V

    goto :goto_0

    .line 157
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->f(Lcom/qihoo/security/gamebooster/b;)V

    goto :goto_0

    .line 160
    :pswitch_4
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/gamebooster/g;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)Lcom/qihoo/security/gamebooster/g;

    .line 161
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/b;->b(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)V

    .line 162
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.gamebooster.LocalGamePackageUpdate"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 163
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->g(Lcom/qihoo/security/gamebooster/b;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 169
    :pswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 170
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v2}, Lcom/qihoo/security/gamebooster/b;->d(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v2

    .line 171
    if-eqz v2, :cond_0

    .line 174
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 175
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 176
    iget-object v4, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v4, v3}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;Ljava/util/Set;)Ljava/util/List;

    move-result-object v3

    .line 177
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 178
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 179
    invoke-virtual {v2}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v3

    .line 180
    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v4

    .line 181
    if-nez v4, :cond_4

    .line 182
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    :cond_4
    invoke-virtual {v2}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v1

    .line 185
    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v0

    .line 186
    if-eqz v0, :cond_5

    .line 187
    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 189
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0, v2}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)Lcom/qihoo/security/gamebooster/g;

    .line 190
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0, v2}, Lcom/qihoo/security/gamebooster/b;->b(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)V

    .line 191
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->g(Lcom/qihoo/security/gamebooster/b;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "com.qihoo.security.gamebooster.LocalGamePackageUpdate"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 199
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 200
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->d(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    .line 201
    if-eqz v1, :cond_0

    .line 204
    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v2

    .line 205
    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v3

    .line 206
    invoke-static {v2, v0}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v4

    .line 207
    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v0

    .line 208
    if-eqz v4, :cond_6

    .line 209
    invoke-interface {v2, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 217
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)Lcom/qihoo/security/gamebooster/g;

    .line 218
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/b;->b(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)V

    .line 219
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->g(Lcom/qihoo/security/gamebooster/b;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "com.qihoo.security.gamebooster.LocalGamePackageUpdate"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 211
    :cond_6
    if-eqz v0, :cond_0

    .line 212
    invoke-interface {v3, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 225
    :pswitch_7
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->h(Lcom/qihoo/security/gamebooster/b;)V

    goto/16 :goto_0

    .line 228
    :pswitch_8
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->i(Lcom/qihoo/security/gamebooster/b;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 229
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/gamebooster/b$1$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/gamebooster/b$1$1;-><init>(Lcom/qihoo/security/gamebooster/b$1;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 241
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->b(Lcom/qihoo/security/gamebooster/b;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    .line 249
    :pswitch_9
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 250
    iget-object v3, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v3}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v3

    if-nez v3, :cond_8

    .line 254
    iget-object v3, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v3}, Lcom/qihoo/security/gamebooster/b;->e(Lcom/qihoo/security/gamebooster/b;)V

    .line 256
    :cond_8
    new-instance v3, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    sget-object v4, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->UserAdd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct {v3, v0, v4, v6, v7}, Lcom/qihoo/security/gamebooster/LocalGamePkg;-><init>(Ljava/lang/String;Lcom/qihoo/security/gamebooster/LocalGamePkg$State;J)V

    .line 257
    iget-object v4, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v4}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v4

    invoke-virtual {v4}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v4

    .line 260
    if-nez v4, :cond_9

    .line 261
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v2

    .line 264
    :cond_9
    iget-object v3, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v3}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v0

    .line 265
    if-eqz v0, :cond_f

    .line 266
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 269
    :goto_2
    if-eqz v2, :cond_0

    .line 270
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/b;->b(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)V

    .line 271
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.gamebooster.LocalGamePackageUpdate"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 272
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->g(Lcom/qihoo/security/gamebooster/b;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 276
    :pswitch_a
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 277
    iget-object v3, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v3}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v3

    if-nez v3, :cond_a

    .line 281
    iget-object v3, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v3}, Lcom/qihoo/security/gamebooster/b;->e(Lcom/qihoo/security/gamebooster/b;)V

    .line 284
    :cond_a
    iget-object v3, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v3}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v3

    .line 286
    if-eqz v3, :cond_b

    .line 287
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move v1, v2

    .line 290
    :cond_b
    iget-object v4, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v4}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v4

    invoke-virtual {v4}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v4

    .line 292
    if-nez v4, :cond_e

    .line 293
    if-eqz v3, :cond_c

    .line 294
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 301
    :goto_3
    if-eqz v2, :cond_0

    .line 302
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/b;->b(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)V

    .line 303
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.gamebooster.LocalGamePackageUpdate"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 304
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->g(Lcom/qihoo/security/gamebooster/b;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 296
    :cond_c
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v1

    new-instance v3, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    sget-object v4, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->UserAdd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct {v3, v0, v4, v6, v7}, Lcom/qihoo/security/gamebooster/LocalGamePkg;-><init>(Ljava/lang/String;Lcom/qihoo/security/gamebooster/LocalGamePkg$State;J)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 310
    :pswitch_b
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->g(Lcom/qihoo/security/gamebooster/b;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "game_booster_first_exit_home_actvity"

    invoke-static {v0, v2, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    .line 312
    if-eqz v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->g(Lcom/qihoo/security/gamebooster/b;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_has_create_game_booster_shortcut"

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 320
    const-string/jumbo v1, "1.0.8.3742"

    .line 324
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_d

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 328
    :cond_d
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->h(Lcom/qihoo/security/gamebooster/b;)V

    goto/16 :goto_0

    :cond_e
    move v2, v1

    goto :goto_3

    :cond_f
    move v2, v1

    goto/16 :goto_2

    .line 121
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch
.end method
