.class Lcom/jirbo/adcolony/a$a;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field a:Lcom/jirbo/adcolony/AdColonyAd;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 307
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/jirbo/adcolony/AdColonyAd;)V
    .locals 1

    .prologue
    .line 312
    if-nez p1, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iput-object v0, p0, Lcom/jirbo/adcolony/a$a;->a:Lcom/jirbo/adcolony/AdColonyAd;

    .line 314
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/a$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/a$a;->sendMessage(Landroid/os/Message;)Z

    .line 315
    return-void

    .line 313
    :cond_0
    iput-object p1, p0, Lcom/jirbo/adcolony/a$a;->a:Lcom/jirbo/adcolony/AdColonyAd;

    goto :goto_0
.end method

.method public b(Lcom/jirbo/adcolony/AdColonyAd;)V
    .locals 1

    .prologue
    .line 319
    if-nez p1, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iput-object v0, p0, Lcom/jirbo/adcolony/a$a;->a:Lcom/jirbo/adcolony/AdColonyAd;

    .line 321
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/a$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/a$a;->sendMessage(Landroid/os/Message;)Z

    .line 322
    return-void

    .line 320
    :cond_0
    iput-object p1, p0, Lcom/jirbo/adcolony/a$a;->a:Lcom/jirbo/adcolony/AdColonyAd;

    goto :goto_0
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    .line 327
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 369
    :cond_0
    :goto_0
    return-void

    .line 330
    :pswitch_0
    const-string v0, "skip"

    iget-object v1, p0, Lcom/jirbo/adcolony/a$a;->a:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-static {v0, v1}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 331
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    if-eqz v0, :cond_0

    .line 333
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    const/4 v1, 0x1

    iput v1, v0, Lcom/jirbo/adcolony/AdColonyAd;->f:I

    .line 334
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyAd;->a()V

    goto :goto_0

    .line 340
    :pswitch_1
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 341
    sget-object v1, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v1, :cond_1

    const-string v1, "html5_endcard_loading_started"

    sget-object v2, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-boolean v2, v2, Lcom/jirbo/adcolony/ADCVideo;->k:Z

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 342
    :cond_1
    sget-object v1, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v1, :cond_2

    const-string v1, "html5_endcard_loading_finished"

    sget-object v2, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-boolean v2, v2, Lcom/jirbo/adcolony/ADCVideo;->l:Z

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 343
    :cond_2
    sget-object v1, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v1, :cond_3

    const-string v1, "html5_endcard_loading_time"

    sget-object v2, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-wide v2, v2, Lcom/jirbo/adcolony/ADCVideo;->p:D

    invoke-virtual {v0, v1, v2, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;D)V

    .line 344
    :cond_3
    sget-object v1, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v1, :cond_4

    const-string v1, "html5_endcard_loading_timeout"

    sget-object v2, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-boolean v2, v2, Lcom/jirbo/adcolony/ADCVideo;->m:Z

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 345
    :cond_4
    sget-object v1, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-wide v2, v1, Lcom/jirbo/adcolony/ADCVideo;->q:D

    const-wide v4, 0x40ed4c0000000000L    # 60000.0

    cmpg-double v1, v2, v4

    if-gez v1, :cond_5

    const-string v1, "endcard_time_spent"

    sget-object v2, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-wide v2, v2, Lcom/jirbo/adcolony/ADCVideo;->q:D

    invoke-virtual {v0, v1, v2, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;D)V

    .line 346
    :cond_5
    const-string v1, "endcard_dissolved"

    sget-object v2, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-boolean v2, v2, Lcom/jirbo/adcolony/ADCVideo;->n:Z

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 347
    const-string v1, "replay"

    sget-object v2, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    sget-boolean v2, Lcom/jirbo/adcolony/ADCVideo;->e:Z

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 348
    const-string v1, "reward"

    sget-object v2, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-boolean v2, v2, Lcom/jirbo/adcolony/ADCVideo;->o:Z

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 359
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v2, "continue"

    iget-object v3, p0, Lcom/jirbo/adcolony/a$a;->a:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v1, v2, v0, v3}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 360
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/b;->e()V

    .line 361
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    if-eqz v0, :cond_0

    .line 363
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    const/4 v1, 0x4

    iput v1, v0, Lcom/jirbo/adcolony/AdColonyAd;->f:I

    .line 364
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyAd;->a()V

    goto/16 :goto_0

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
