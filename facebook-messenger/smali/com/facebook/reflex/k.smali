.class Lcom/facebook/reflex/k;
.super Landroid/view/View;
.source "FragmentReflexActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/reflex/j;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/j;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/facebook/reflex/k;->a:Lcom/facebook/reflex/j;

    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/facebook/reflex/k;->a:Lcom/facebook/reflex/j;

    invoke-static {v0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/j;)Lcom/facebook/reflex/view/b/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/p;->b()V

    .line 118
    return-void
.end method
