.class Lcom/qihoo/utils/notice/b$3;
.super Lcom/qihoo/security/service/c$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/utils/notice/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/utils/notice/b;


# direct methods
.method constructor <init>(Lcom/qihoo/utils/notice/b;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-direct {p0}, Lcom/qihoo/security/service/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZZZLjava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 164
    const/16 v0, 0x8

    const/16 v1, 0x17

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/s;->a(II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 244
    :cond_0
    :goto_0
    return-void

    .line 169
    :cond_1
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->d(Lcom/qihoo/utils/notice/b;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 170
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->a(Lcom/qihoo/utils/notice/b;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 171
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->e(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/app/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/app/a;->a(Z)V

    .line 176
    :cond_2
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->f(Lcom/qihoo/utils/notice/b;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x1013

    invoke-static {v0, v1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 178
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->e(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/app/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/app/a;->c()J

    move-result-wide v2

    .line 179
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->g(Lcom/qihoo/utils/notice/b;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_enter_result_time"

    const-wide/16 v4, 0x0

    invoke-static {v0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 184
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_3

    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-lez v4, :cond_3

    .line 185
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v0, v4, v0

    const-wide/32 v4, 0xa4cb800

    cmp-long v0, v0, v4

    if-lez v0, :cond_7

    const/4 v0, 0x1

    .line 189
    :goto_1
    iget-object v1, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v1}, Lcom/qihoo/utils/notice/b;->h(Lcom/qihoo/utils/notice/b;)I

    move-result v1

    const/16 v4, 0x46

    if-le v1, v4, :cond_3

    invoke-static {v2, v3}, Landroid/text/format/DateUtils;->isToday(J)Z

    move-result v1

    if-nez v1, :cond_3

    if-eqz v0, :cond_3

    .line 190
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->j(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v1}, Lcom/qihoo/utils/notice/b;->i(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v1

    const/16 v2, 0x190

    invoke-virtual {v1, v2}, Lcom/qihoo/security/base/a$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/base/a$a;->sendMessage(Landroid/os/Message;)Z

    .line 196
    :cond_3
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->k(Lcom/qihoo/utils/notice/b;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x100f

    invoke-static {v0, v1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 201
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->l(Lcom/qihoo/utils/notice/b;)I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_4

    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->m(Lcom/qihoo/utils/notice/b;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 202
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v0

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 203
    iget-object v2, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v2}, Lcom/qihoo/utils/notice/b;->l(Lcom/qihoo/utils/notice/b;)I

    move-result v2

    iget-object v3, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v3}, Lcom/qihoo/utils/notice/b;->n(Lcom/qihoo/utils/notice/b;)J

    move-result-wide v4

    invoke-static {v2, v0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/b/s;->b(IJJ)I

    move-result v0

    .line 204
    const/16 v1, 0x1e

    if-le v0, v1, :cond_4

    .line 205
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->p(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v1}, Lcom/qihoo/utils/notice/b;->o(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v1

    const/16 v2, 0x64

    invoke-virtual {v1, v2}, Lcom/qihoo/security/base/a$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/base/a$a;->sendMessage(Landroid/os/Message;)Z

    .line 211
    :cond_4
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->q(Lcom/qihoo/utils/notice/b;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x1010

    invoke-static {v0, v1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_6

    .line 212
    if-nez p1, :cond_5

    if-eqz p3, :cond_8

    :cond_5
    const/4 v0, 0x1

    .line 218
    :goto_2
    iget-object v1, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v1}, Lcom/qihoo/utils/notice/b;->l(Lcom/qihoo/utils/notice/b;)I

    move-result v1

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_9

    iget-object v1, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v1}, Lcom/qihoo/utils/notice/b;->h(Lcom/qihoo/utils/notice/b;)I

    move-result v1

    const/16 v2, 0x4b

    if-le v1, v2, :cond_9

    if-eqz v0, :cond_9

    .line 219
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->r(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/base/a$a;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_6

    .line 220
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->t(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v1}, Lcom/qihoo/utils/notice/b;->s(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v1

    const/16 v2, 0xc8

    invoke-virtual {v1, v2}, Lcom/qihoo/security/base/a$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/32 v2, 0x2bf20

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/base/a$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 229
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->v(Lcom/qihoo/utils/notice/b;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x1011

    invoke-static {v0, v1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->w(Lcom/qihoo/utils/notice/b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->w(Lcom/qihoo/utils/notice/b;)Ljava/lang/String;

    move-result-object v0

    if-eq v0, p4, :cond_a

    .line 235
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->x(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v0

    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Lcom/qihoo/security/base/a$a;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->z(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v1}, Lcom/qihoo/utils/notice/b;->y(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v1

    const/16 v2, 0x12c

    invoke-virtual {v1, v2}, Lcom/qihoo/security/base/a$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/base/a$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_0

    .line 185
    :cond_7
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 212
    :cond_8
    const/4 v0, 0x0

    goto/16 :goto_2

    .line 224
    :cond_9
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->u(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/base/a$a;->removeMessages(I)V

    goto :goto_3

    .line 240
    :cond_a
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    const-string/jumbo v1, ""

    invoke-static {v0, v1}, Lcom/qihoo/utils/notice/b;->a(Lcom/qihoo/utils/notice/b;Ljava/lang/String;)Ljava/lang/String;

    .line 241
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$3;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->A(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;

    move-result-object v0

    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Lcom/qihoo/security/base/a$a;->removeMessages(I)V

    goto/16 :goto_0
.end method
