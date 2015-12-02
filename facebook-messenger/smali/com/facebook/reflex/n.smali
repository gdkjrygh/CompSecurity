.class Lcom/facebook/reflex/n;
.super Ljava/lang/Object;
.source "FragmentReflexActivity.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback2;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/j;

.field final synthetic b:Lcom/facebook/reflex/m;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/m;Lcom/facebook/reflex/j;)V
    .locals 0

    .prologue
    .line 303
    iput-object p1, p0, Lcom/facebook/reflex/n;->b:Lcom/facebook/reflex/m;

    iput-object p2, p0, Lcom/facebook/reflex/n;->a:Lcom/facebook/reflex/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 1

    .prologue
    .line 311
    iget-object v0, p0, Lcom/facebook/reflex/n;->b:Lcom/facebook/reflex/m;

    iget-object v0, v0, Lcom/facebook/reflex/m;->a:Lcom/facebook/reflex/j;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/reflex/j;->surfaceChanged(Landroid/view/SurfaceHolder;III)V

    .line 312
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Lcom/facebook/reflex/n;->b:Lcom/facebook/reflex/m;

    iget-object v0, v0, Lcom/facebook/reflex/m;->a:Lcom/facebook/reflex/j;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/j;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    .line 307
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .prologue
    .line 316
    iget-object v0, p0, Lcom/facebook/reflex/n;->b:Lcom/facebook/reflex/m;

    iget-object v0, v0, Lcom/facebook/reflex/m;->a:Lcom/facebook/reflex/j;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/j;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V

    .line 317
    return-void
.end method

.method public surfaceRedrawNeeded(Landroid/view/SurfaceHolder;)V
    .locals 1

    .prologue
    .line 321
    iget-object v0, p0, Lcom/facebook/reflex/n;->b:Lcom/facebook/reflex/m;

    iget-object v0, v0, Lcom/facebook/reflex/m;->a:Lcom/facebook/reflex/j;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/j;->surfaceRedrawNeeded(Landroid/view/SurfaceHolder;)V

    .line 322
    return-void
.end method
