.class Lcom/facebook/orca/chatheads/ed;
.super Landroid/view/View;
.source "ScreenInsetsChangeDetector.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/eb;

.field private b:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/chatheads/eb;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 31
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ed;->a:Lcom/facebook/orca/chatheads/eb;

    .line 32
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 29
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ed;->b:Landroid/graphics/Rect;

    .line 33
    return-void
.end method


# virtual methods
.method protected fitSystemWindows(Landroid/graphics/Rect;)Z
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ed;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 38
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ed;->a:Lcom/facebook/orca/chatheads/eb;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/eb;->a(Lcom/facebook/orca/chatheads/eb;)Lcom/facebook/orca/chatheads/ec;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ed;->a:Lcom/facebook/orca/chatheads/eb;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/eb;->a(Lcom/facebook/orca/chatheads/eb;)Lcom/facebook/orca/chatheads/ec;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/orca/chatheads/ec;->a(Landroid/graphics/Rect;)V

    .line 41
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
