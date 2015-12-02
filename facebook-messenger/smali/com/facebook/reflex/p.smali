.class Lcom/facebook/reflex/p;
.super Ljava/lang/Object;
.source "FragmentReflexActivity.java"

# interfaces
.implements Lcom/facebook/reflex/q;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/j;

.field final synthetic b:Lcom/facebook/reflex/m;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/m;Lcom/facebook/reflex/j;)V
    .locals 0

    .prologue
    .line 334
    iput-object p1, p0, Lcom/facebook/reflex/p;->b:Lcom/facebook/reflex/m;

    iput-object p2, p0, Lcom/facebook/reflex/p;->a:Lcom/facebook/reflex/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)V
    .locals 1

    .prologue
    .line 337
    iget-object v0, p0, Lcom/facebook/reflex/p;->b:Lcom/facebook/reflex/m;

    invoke-static {v0, p1}, Lcom/facebook/reflex/m;->a(Lcom/facebook/reflex/m;Landroid/view/MotionEvent;)V

    .line 338
    return-void
.end method
