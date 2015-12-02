.class Lcom/facebook/reflex/o;
.super Ljava/lang/Object;
.source "FragmentReflexActivity.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/j;

.field final synthetic b:Lcom/facebook/reflex/m;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/m;Lcom/facebook/reflex/j;)V
    .locals 0

    .prologue
    .line 326
    iput-object p1, p0, Lcom/facebook/reflex/o;->b:Lcom/facebook/reflex/m;

    iput-object p2, p0, Lcom/facebook/reflex/o;->a:Lcom/facebook/reflex/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 1

    .prologue
    .line 329
    iget-object v0, p0, Lcom/facebook/reflex/o;->b:Lcom/facebook/reflex/m;

    invoke-static {v0}, Lcom/facebook/reflex/m;->b(Lcom/facebook/reflex/m;)V

    .line 330
    const/4 v0, 0x1

    return v0
.end method
