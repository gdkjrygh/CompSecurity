.class Lcom/facebook/reflex/view/b/d;
.super Ljava/lang/Object;
.source "ContainerDelegate.java"

# interfaces
.implements Lcom/facebook/reflex/q;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/view/b/a;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/view/b/a;)V
    .locals 0

    .prologue
    .line 200
    iput-object p1, p0, Lcom/facebook/reflex/view/b/d;->a:Lcom/facebook/reflex/view/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)V
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Lcom/facebook/reflex/view/b/d;->a:Lcom/facebook/reflex/view/b/a;

    invoke-static {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Lcom/facebook/reflex/view/b/a;Landroid/view/MotionEvent;)V

    .line 204
    return-void
.end method
