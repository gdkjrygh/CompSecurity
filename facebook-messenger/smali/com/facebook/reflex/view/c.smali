.class Lcom/facebook/reflex/view/c;
.super Ljava/lang/Object;
.source "Button.java"

# interfaces
.implements Lcom/facebook/reflex/ak;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/view/a;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/view/a;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/facebook/reflex/view/c;->a:Lcom/facebook/reflex/view/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/reflex/r;)V
    .locals 2

    .prologue
    .line 60
    invoke-static {p1}, Lcom/facebook/reflex/view/b/k;->b(Lcom/facebook/reflex/r;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 61
    iget-object v1, p0, Lcom/facebook/reflex/view/c;->a:Lcom/facebook/reflex/view/a;

    invoke-static {v1, v0}, Lcom/facebook/reflex/view/a;->a(Lcom/facebook/reflex/view/a;Landroid/view/MotionEvent;)Z

    .line 62
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 63
    return-void
.end method
