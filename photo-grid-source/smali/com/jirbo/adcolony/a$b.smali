.class Lcom/jirbo/adcolony/a$b;
.super Landroid/os/Handler;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 372
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLjava/lang/String;I)V
    .locals 1

    .prologue
    .line 391
    if-eqz p1, :cond_0

    :goto_0
    invoke-virtual {p0, p3, p2}, Lcom/jirbo/adcolony/a$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/a$b;->sendMessage(Landroid/os/Message;)Z

    .line 392
    return-void

    .line 391
    :cond_0
    const/4 p2, 0x0

    goto :goto_0
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 376
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 377
    iget v3, p1, Landroid/os/Message;->what:I

    .line 379
    if-eqz v0, :cond_1

    const/4 v2, 0x1

    .line 380
    :goto_0
    if-nez v2, :cond_0

    const-string v0, ""

    .line 382
    :cond_0
    new-instance v4, Lcom/jirbo/adcolony/AdColonyV4VCReward;

    invoke-direct {v4, v2, v0, v3}, Lcom/jirbo/adcolony/AdColonyV4VCReward;-><init>(ZLjava/lang/String;I)V

    .line 383
    :goto_1
    sget-object v0, Lcom/jirbo/adcolony/a;->ae:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 385
    sget-object v0, Lcom/jirbo/adcolony/a;->ae:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/AdColonyV4VCListener;

    invoke-interface {v0, v4}, Lcom/jirbo/adcolony/AdColonyV4VCListener;->onAdColonyV4VCReward(Lcom/jirbo/adcolony/AdColonyV4VCReward;)V

    .line 383
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_1
    move v2, v1

    .line 379
    goto :goto_0

    .line 387
    :cond_2
    return-void
.end method
