.class Lcom/facebook/reflex/view/q;
.super Lcom/facebook/reflex/view/b/m;
.source "ScrollView.java"


# instance fields
.field final synthetic b:Lcom/facebook/reflex/view/p;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/view/p;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/facebook/reflex/view/q;->b:Lcom/facebook/reflex/view/p;

    invoke-direct {p0, p2}, Lcom/facebook/reflex/view/b/m;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0}, Lcom/facebook/reflex/view/q;->i()V

    .line 65
    iget-object v0, p0, Lcom/facebook/reflex/view/q;->b:Lcom/facebook/reflex/view/p;

    invoke-static {v0, p1}, Lcom/facebook/reflex/view/p;->a(Lcom/facebook/reflex/view/p;Landroid/graphics/Canvas;)V

    .line 66
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/view/q;->b(Landroid/graphics/Canvas;)V

    .line 67
    return-void
.end method
