.class Lcom/facebook/inject/o;
.super Ljava/lang/ThreadLocal;
.source "ContextScope.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal",
        "<",
        "Ljava/util/List",
        "<",
        "Landroid/content/Context;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/inject/n;


# direct methods
.method constructor <init>(Lcom/facebook/inject/n;)V
    .locals 0

    .prologue
    .line 21
    iput-object p1, p0, Lcom/facebook/inject/o;->a:Lcom/facebook/inject/n;

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
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation

    .prologue
    .line 24
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p0}, Lcom/facebook/inject/o;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
