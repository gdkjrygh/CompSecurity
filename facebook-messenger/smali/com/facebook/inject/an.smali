.class Lcom/facebook/inject/an;
.super Ljava/lang/Object;
.source "ProvisioningDebugStack.java"


# instance fields
.field final a:Lcom/facebook/inject/ao;

.field final b:Lcom/google/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/a",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/inject/ao;Lcom/google/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/inject/ao;",
            "Lcom/google/inject/a",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/inject/an;->a:Lcom/facebook/inject/ao;

    .line 28
    iput-object p2, p0, Lcom/facebook/inject/an;->b:Lcom/google/inject/a;

    .line 29
    return-void
.end method
