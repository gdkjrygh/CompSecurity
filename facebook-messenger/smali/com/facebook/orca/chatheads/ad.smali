.class Lcom/facebook/orca/chatheads/ad;
.super Lcom/facebook/n/b;
.source "ChatHeadTextBubbleView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/v;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/v;)V
    .locals 0

    .prologue
    .line 353
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ad;->a:Lcom/facebook/orca/chatheads/v;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/v;Lcom/facebook/orca/chatheads/w;)V
    .locals 0

    .prologue
    .line 353
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ad;-><init>(Lcom/facebook/orca/chatheads/v;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 357
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ad;->a:Lcom/facebook/orca/chatheads/v;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/v;->setVisibility(I)V

    .line 358
    return-void
.end method

.method public b(Lcom/facebook/n/c;)V
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ad;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/v;->d(Lcom/facebook/orca/chatheads/v;)V

    .line 363
    return-void
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 367
    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    .line 368
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ad;->a:Lcom/facebook/orca/chatheads/v;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/v;->setVisibility(I)V

    .line 371
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ad;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/v;->f(Lcom/facebook/orca/chatheads/v;)Lcom/google/common/d/a/ab;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 372
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ad;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/v;->f(Lcom/facebook/orca/chatheads/v;)Lcom/google/common/d/a/ab;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 373
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ad;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0, v4}, Lcom/facebook/orca/chatheads/v;->b(Lcom/facebook/orca/chatheads/v;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;

    .line 375
    :cond_1
    return-void
.end method
