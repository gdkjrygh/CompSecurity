.class Lcom/facebook/reflex/view/f;
.super Lcom/facebook/reflex/view/b/m;
.source "ImageView.java"


# instance fields
.field final synthetic b:Lcom/facebook/reflex/view/e;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/view/e;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/reflex/view/f;->b:Lcom/facebook/reflex/view/e;

    invoke-direct {p0, p2}, Lcom/facebook/reflex/view/b/m;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 48
    invoke-virtual {p0}, Lcom/facebook/reflex/view/f;->i()V

    .line 49
    iget-object v0, p0, Lcom/facebook/reflex/view/f;->b:Lcom/facebook/reflex/view/e;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/e;->a(Landroid/graphics/Canvas;)V

    .line 50
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/view/f;->b(Landroid/graphics/Canvas;)V

    .line 51
    return-void
.end method
