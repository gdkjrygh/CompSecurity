.class Lcom/facebook/reflex/view/b/e;
.super Ljava/lang/Object;
.source "ContainerDelegate.java"

# interfaces
.implements Lcom/facebook/reflex/x;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/view/b/a;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/view/b/a;)V
    .locals 0

    .prologue
    .line 212
    iput-object p1, p0, Lcom/facebook/reflex/view/b/e;->a:Lcom/facebook/reflex/view/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/reflex/r;)V
    .locals 2

    .prologue
    .line 215
    invoke-static {p1}, Lcom/facebook/reflex/view/b/k;->a(Lcom/facebook/reflex/r;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 216
    iget-object v1, p0, Lcom/facebook/reflex/view/b/e;->a:Lcom/facebook/reflex/view/b/a;

    invoke-static {v1, v0}, Lcom/facebook/reflex/view/b/a;->a(Lcom/facebook/reflex/view/b/a;Landroid/view/MotionEvent;)V

    .line 217
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 218
    return-void
.end method
