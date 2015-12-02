.class public Lcom/facebook/n/k;
.super Lcom/facebook/ui/b/e;
.source "SpringSystemFrameCallbackWrapper.java"


# instance fields
.field private a:Lcom/facebook/n/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/facebook/ui/b/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/n/k;->a:Lcom/facebook/n/j;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    iget-object v0, p0, Lcom/facebook/n/k;->a:Lcom/facebook/n/j;

    invoke-virtual {v0}, Lcom/facebook/n/j;->c()V

    .line 34
    return-void
.end method

.method public a(Lcom/facebook/n/j;)V
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/facebook/n/k;->a:Lcom/facebook/n/j;

    .line 25
    return-void
.end method
