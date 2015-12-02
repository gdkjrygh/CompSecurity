.class Lcom/facebook/inject/v;
.super Ljava/lang/ThreadLocal;
.source "FbInjectorImpl.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/facebook/inject/t;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/inject/u;


# direct methods
.method constructor <init>(Lcom/facebook/inject/u;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/inject/v;->a:Lcom/facebook/inject/u;

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
            "Lcom/facebook/inject/t;",
            ">;"
        }
    .end annotation

    .prologue
    .line 49
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0}, Lcom/facebook/inject/v;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
