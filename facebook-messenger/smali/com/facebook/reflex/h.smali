.class Lcom/facebook/reflex/h;
.super Ljava/lang/Object;
.source "FbFragmentReflexActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/common/d/e;

.field final synthetic b:Lcom/facebook/reflex/g;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/g;Lcom/facebook/common/d/e;)V
    .locals 0

    .prologue
    .line 347
    iput-object p1, p0, Lcom/facebook/reflex/h;->b:Lcom/facebook/reflex/g;

    iput-object p2, p0, Lcom/facebook/reflex/h;->a:Lcom/facebook/common/d/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 350
    iget-object v0, p0, Lcom/facebook/reflex/h;->a:Lcom/facebook/common/d/e;

    invoke-interface {v0}, Lcom/facebook/common/d/e;->a()V

    .line 351
    return-void
.end method
