.class public Lcom/facebook/reflex/animation/a;
.super Ljava/lang/Object;
.source "Change.java"


# instance fields
.field final synthetic a:Lcom/facebook/reflex/animation/Change;

.field private b:Lcom/facebook/reflex/animation/PropertyName;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/animation/Change;Lcom/facebook/reflex/animation/PropertyName;)V
    .locals 1

    .prologue
    .line 61
    iput-object p1, p0, Lcom/facebook/reflex/animation/a;->a:Lcom/facebook/reflex/animation/Change;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/animation/PropertyName;

    iput-object v0, p0, Lcom/facebook/reflex/animation/a;->b:Lcom/facebook/reflex/animation/PropertyName;

    .line 63
    return-void
.end method


# virtual methods
.method public a(F)Lcom/facebook/reflex/animation/a;
    .locals 2

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/reflex/animation/a;->a:Lcom/facebook/reflex/animation/Change;

    iget-object v1, p0, Lcom/facebook/reflex/animation/a;->b:Lcom/facebook/reflex/animation/PropertyName;

    invoke-static {v0, v1, p1}, Lcom/facebook/reflex/animation/Change;->a(Lcom/facebook/reflex/animation/Change;Lcom/facebook/reflex/animation/PropertyName;F)V

    .line 67
    return-object p0
.end method

.method public a(Lcom/facebook/reflex/animation/Transition;)Lcom/facebook/reflex/animation/a;
    .locals 2

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/reflex/animation/a;->a:Lcom/facebook/reflex/animation/Change;

    iget-object v1, p0, Lcom/facebook/reflex/animation/a;->b:Lcom/facebook/reflex/animation/PropertyName;

    invoke-static {v0, v1, p1}, Lcom/facebook/reflex/animation/Change;->a(Lcom/facebook/reflex/animation/Change;Lcom/facebook/reflex/animation/PropertyName;Lcom/facebook/reflex/animation/Transition;)V

    .line 72
    return-object p0
.end method
