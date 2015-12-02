.class Lcom/facebook/reflex/view/b;
.super Lcom/facebook/reflex/view/b/m;
.source "Button.java"


# instance fields
.field final synthetic b:Lcom/facebook/reflex/view/a;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/view/a;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/reflex/view/b;->b:Lcom/facebook/reflex/view/a;

    invoke-direct {p0, p2}, Lcom/facebook/reflex/view/b/m;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b;->i()V

    .line 52
    iget-object v0, p0, Lcom/facebook/reflex/view/b;->b:Lcom/facebook/reflex/view/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/a;->a(Landroid/graphics/Canvas;)V

    .line 53
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/view/b;->b(Landroid/graphics/Canvas;)V

    .line 54
    return-void
.end method
