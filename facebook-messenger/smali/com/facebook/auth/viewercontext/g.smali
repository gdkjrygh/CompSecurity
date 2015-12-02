.class Lcom/facebook/auth/viewercontext/g;
.super Ljava/lang/ThreadLocal;
.source "ViewerContextManagerImpl.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/facebook/auth/viewercontext/ViewerContext;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/viewercontext/f;


# direct methods
.method constructor <init>(Lcom/facebook/auth/viewercontext/f;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/g;->a:Lcom/facebook/auth/viewercontext/f;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;"
        }
    .end annotation

    .prologue
    .line 33
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0}, Lcom/facebook/auth/viewercontext/g;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
