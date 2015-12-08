.class final Lcom/roidapp/photogrid/v;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 274
    iput-object p1, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 276
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    :cond_0
    :goto_0
    return-void

    .line 278
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 280
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->a(Lcom/roidapp/photogrid/MainPage;)V

    .line 281
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->b(Lcom/roidapp/photogrid/MainPage;)V

    .line 285
    const/4 v0, 0x3

    const-wide/16 v2, 0x258

    invoke-virtual {p0, v0, v2, v3}, Lcom/roidapp/photogrid/v;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 303
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/MainPage;->a(Z)V

    .line 304
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->c(Lcom/roidapp/photogrid/MainPage;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 306
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->w()V

    .line 307
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->d(Lcom/roidapp/photogrid/MainPage;)Z

    goto :goto_0

    .line 309
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->e(Lcom/roidapp/photogrid/MainPage;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 311
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    iget-object v1, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v1}, Lcom/roidapp/photogrid/MainPage;->e(Lcom/roidapp/photogrid/MainPage;)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/MainPage;->b(J)V

    .line 312
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->f(Lcom/roidapp/photogrid/MainPage;)J

    goto :goto_0

    .line 316
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/MainPage;->a(Z)V

    goto :goto_0

    .line 330
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->g(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 331
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->g(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->a()V

    goto :goto_0

    .line 336
    :sswitch_4
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/baselib/gl/c;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 338
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/gl/GPUTestView;

    .line 339
    if-eqz v0, :cond_0

    .line 340
    invoke-virtual {v0}, Lcom/roidapp/baselib/gl/GPUTestView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 341
    if-eqz v1, :cond_0

    .line 342
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 347
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/ClassCastException;->printStackTrace()V

    goto/16 :goto_0

    .line 363
    :sswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/v;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->h(Lcom/roidapp/photogrid/MainPage;)V

    goto/16 :goto_0

    .line 278
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
        0x4 -> :sswitch_2
        0xa -> :sswitch_5
        0x236 -> :sswitch_3
        0x1230 -> :sswitch_4
    .end sparse-switch
.end method
