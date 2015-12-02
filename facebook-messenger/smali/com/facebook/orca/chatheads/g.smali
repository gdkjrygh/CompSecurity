.class Lcom/facebook/orca/chatheads/g;
.super Lcom/facebook/n/b;
.source "ChatHeadButtonView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/e;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/e;)V
    .locals 0

    .prologue
    .line 236
    iput-object p1, p0, Lcom/facebook/orca/chatheads/g;->a:Lcom/facebook/orca/chatheads/e;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/e;Lcom/facebook/orca/chatheads/f;)V
    .locals 0

    .prologue
    .line 236
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/g;-><init>(Lcom/facebook/orca/chatheads/e;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 240
    iget-object v0, p0, Lcom/facebook/orca/chatheads/g;->a:Lcom/facebook/orca/chatheads/e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/e;->setViewCachingEnabled(Z)V

    .line 241
    return-void
.end method

.method public b(Lcom/facebook/n/c;)V
    .locals 3

    .prologue
    .line 245
    iget-object v0, p0, Lcom/facebook/orca/chatheads/g;->a:Lcom/facebook/orca/chatheads/e;

    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Lcom/a/c/a;->a(Landroid/view/View;F)V

    .line 246
    return-void
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/orca/chatheads/g;->a:Lcom/facebook/orca/chatheads/e;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/e;->c(Lcom/facebook/orca/chatheads/e;)Lcom/google/common/d/a/ab;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 251
    iget-object v0, p0, Lcom/facebook/orca/chatheads/g;->a:Lcom/facebook/orca/chatheads/e;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/e;->b(Lcom/facebook/orca/chatheads/e;)V

    .line 252
    return-void
.end method
