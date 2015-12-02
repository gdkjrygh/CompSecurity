.class Lcom/facebook/reflex/view/b/b;
.super Lcom/facebook/reflex/view/b/m;
.source "ContainerDelegate.java"


# instance fields
.field final synthetic b:Lcom/facebook/reflex/view/b/a;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/view/b/a;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/reflex/view/b/b;->b:Lcom/facebook/reflex/view/b/a;

    invoke-direct {p0, p2}, Lcom/facebook/reflex/view/b/m;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 90
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/b;->i()V

    .line 91
    iget-object v0, p0, Lcom/facebook/reflex/view/b/b;->b:Lcom/facebook/reflex/view/b/a;

    iget-object v0, v0, Lcom/facebook/reflex/view/b/a;->a:Lcom/facebook/reflex/view/b/i;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/view/b/i;->a(Landroid/graphics/Canvas;)V

    .line 92
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/view/b/b;->b(Landroid/graphics/Canvas;)V

    .line 93
    return-void
.end method
