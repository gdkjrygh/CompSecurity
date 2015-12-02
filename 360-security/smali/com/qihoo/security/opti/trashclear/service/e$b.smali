.class Lcom/qihoo/security/opti/trashclear/service/e$b;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/service/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/service/e;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/service/e;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 309
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    .line 310
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 311
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 10

    .prologue
    const-wide/16 v6, 0x0

    const/4 v5, 0x0

    .line 315
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 316
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 482
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 366
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 367
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 417
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->b(Lcom/qihoo/security/opti/trashclear/service/e;)Z

    .line 420
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->d(Lcom/qihoo/security/opti/trashclear/service/e;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->d(Lcom/qihoo/security/opti/trashclear/service/e;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    move v4, v5

    move-wide v2, v6

    .line 421
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->d(Lcom/qihoo/security/opti/trashclear/service/e;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 422
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->d(Lcom/qihoo/security/opti/trashclear/service/e;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/service/c;

    .line 423
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/service/c;->b()Lcom/qihoo/security/opti/trashclear/service/b;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 424
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/service/c;->b()Lcom/qihoo/security/opti/trashclear/service/b;

    move-result-object v1

    iget-wide v8, v1, Lcom/qihoo/security/opti/trashclear/service/b;->b:J

    add-long/2addr v2, v8

    .line 425
    if-eqz v0, :cond_1

    .line 429
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/service/c;->c()V

    :cond_1
    move-wide v0, v2

    .line 421
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move-wide v2, v0

    goto :goto_1

    :cond_2
    move-wide v2, v6

    .line 434
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->d(Lcom/qihoo/security/opti/trashclear/service/e;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 435
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->d(Lcom/qihoo/security/opti/trashclear/service/e;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 445
    :cond_4
    cmp-long v0, v2, v6

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->f(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 446
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->f(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$b;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/service/e;->f(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$a;

    move-result-object v1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Lcom/qihoo/security/opti/trashclear/service/e$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/service/e$a;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 316
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
