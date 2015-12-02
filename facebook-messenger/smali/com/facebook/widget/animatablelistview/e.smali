.class Lcom/facebook/widget/animatablelistview/e;
.super Lcom/a/a/c;
.source "AnimatingListAdapter.java"


# instance fields
.field final synthetic a:Lcom/facebook/widget/animatablelistview/a;

.field final synthetic b:Lcom/facebook/widget/animatablelistview/d;


# direct methods
.method constructor <init>(Lcom/facebook/widget/animatablelistview/d;Lcom/facebook/widget/animatablelistview/a;)V
    .locals 0

    .prologue
    .line 468
    iput-object p1, p0, Lcom/facebook/widget/animatablelistview/e;->b:Lcom/facebook/widget/animatablelistview/d;

    iput-object p2, p0, Lcom/facebook/widget/animatablelistview/e;->a:Lcom/facebook/widget/animatablelistview/a;

    invoke-direct {p0}, Lcom/a/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/a;)V
    .locals 2

    .prologue
    .line 476
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/e;->a:Lcom/facebook/widget/animatablelistview/a;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/a;->setVisibility(I)V

    .line 477
    return-void
.end method

.method public b(Lcom/a/a/a;)V
    .locals 2

    .prologue
    .line 471
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/e;->a:Lcom/facebook/widget/animatablelistview/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/a;->setVisibility(I)V

    .line 472
    return-void
.end method
