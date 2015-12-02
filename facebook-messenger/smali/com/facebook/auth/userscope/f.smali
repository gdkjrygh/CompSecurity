.class Lcom/facebook/auth/userscope/f;
.super Ljava/lang/ThreadLocal;
.source "ViewerContextManagerForUserScope.java"


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
.field final synthetic a:Lcom/facebook/auth/userscope/e;


# direct methods
.method constructor <init>(Lcom/facebook/auth/userscope/e;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/auth/userscope/f;->a:Lcom/facebook/auth/userscope/e;

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
    .line 32
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/facebook/auth/userscope/f;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
