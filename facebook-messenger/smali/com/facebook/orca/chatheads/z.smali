.class Lcom/facebook/orca/chatheads/z;
.super Lcom/facebook/n/b;
.source "ChatHeadTextBubbleView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/v;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/v;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lcom/facebook/orca/chatheads/z;->a:Lcom/facebook/orca/chatheads/v;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/v;Lcom/facebook/orca/chatheads/w;)V
    .locals 0

    .prologue
    .line 337
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/z;-><init>(Lcom/facebook/orca/chatheads/v;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/n/c;)V
    .locals 1

    .prologue
    .line 341
    iget-object v0, p0, Lcom/facebook/orca/chatheads/z;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/v;->d(Lcom/facebook/orca/chatheads/v;)V

    .line 342
    return-void
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 346
    iget-object v0, p0, Lcom/facebook/orca/chatheads/z;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/v;->e(Lcom/facebook/orca/chatheads/v;)Lcom/google/common/d/a/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/facebook/orca/chatheads/z;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/v;->e(Lcom/facebook/orca/chatheads/v;)Lcom/google/common/d/a/ab;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 348
    iget-object v0, p0, Lcom/facebook/orca/chatheads/z;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/v;->a(Lcom/facebook/orca/chatheads/v;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;

    .line 350
    :cond_0
    return-void
.end method
