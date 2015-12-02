.class Lcom/qihoo/security/adv/AdvDataManager$7;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/adv/AdvDataManager;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/adv/AdvDataManager;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/AdvDataManager;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 378
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .prologue
    .line 381
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 382
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 383
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 428
    :cond_0
    :goto_0
    return-void

    .line 388
    :pswitch_0
    check-cast v0, Lcom/qihoo/security/adv/AdvDataManager$b;

    .line 389
    iget-object v1, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 390
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    iget-object v2, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v3, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->d:Lorg/json/JSONObject;

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$AdvType;Lorg/json/JSONObject;)V

    .line 392
    :cond_1
    iget-object v1, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->e:Lcom/qihoo/security/adv/a;

    if-eqz v1, :cond_0

    .line 393
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    iget-object v0, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->e:Lcom/qihoo/security/adv/a;

    invoke-static {v1, v0}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/a;)V

    goto :goto_0

    .line 400
    :pswitch_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v0}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/adv/f;->a(Landroid/content/Context;)Lcom/qihoo/security/adv/f$a;

    move-result-object v0

    .line 401
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/f$a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/adv/AdvDataManager;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 405
    :catch_0
    move-exception v0

    .line 406
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 410
    :pswitch_2
    check-cast v0, Lcom/qihoo/security/adv/AdvDataManager$b;

    .line 411
    iget-wide v4, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->b:J

    .line 412
    iget-object v3, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 413
    iget-object v1, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    .line 414
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v0, v3}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Lcom/qihoo/security/adv/a;

    move-result-object v6

    .line 415
    if-eqz v6, :cond_3

    .line 416
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v0}, Lcom/qihoo/security/adv/AdvDataManager;->b(Lcom/qihoo/security/adv/AdvDataManager;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v0, v6}, Lcom/qihoo/security/adv/AdvDataManager;->b(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/a;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 418
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    new-instance v2, Lcom/qihoo/security/adv/AdvDataManager$a;

    const/4 v7, 0x3

    invoke-direct {v2, v6, v7}, Lcom/qihoo/security/adv/AdvDataManager$a;-><init>(Lcom/qihoo/security/adv/a;I)V

    invoke-virtual/range {v0 .. v5}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$c;Lcom/qihoo/security/adv/AdvDataManager$a;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V

    goto :goto_0

    .line 420
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v0, v4, v5, v3, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager;JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V

    goto :goto_0

    .line 423
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$7;->a:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v0, v4, v5, v3, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager;JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V

    goto :goto_0

    .line 383
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
