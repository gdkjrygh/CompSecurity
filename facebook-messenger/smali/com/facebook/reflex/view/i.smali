.class Lcom/facebook/reflex/view/i;
.super Lcom/facebook/reflex/view/b/m;
.source "ListView.java"


# instance fields
.field final synthetic b:Lcom/facebook/reflex/view/h;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/view/h;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lcom/facebook/reflex/view/i;->b:Lcom/facebook/reflex/view/h;

    invoke-direct {p0, p2}, Lcom/facebook/reflex/view/b/m;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 107
    invoke-virtual {p0}, Lcom/facebook/reflex/view/i;->i()V

    .line 108
    iget-object v0, p0, Lcom/facebook/reflex/view/i;->b:Lcom/facebook/reflex/view/h;

    invoke-static {v0, p1}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;Landroid/graphics/Canvas;)V

    .line 109
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/view/i;->b(Landroid/graphics/Canvas;)V

    .line 110
    return-void
.end method
