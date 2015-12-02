.class Lcom/facebook/abtest/qe/j;
.super Lcom/facebook/inject/d;
.source "QuickExperimentModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/b/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/g;


# direct methods
.method private constructor <init>(Lcom/facebook/abtest/qe/g;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/facebook/abtest/qe/j;->a:Lcom/facebook/abtest/qe/g;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/g;Lcom/facebook/abtest/qe/h;)V
    .locals 0

    .prologue
    .line 131
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/j;-><init>(Lcom/facebook/abtest/qe/g;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/b/e;
    .locals 1

    .prologue
    .line 136
    const-class v0, Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/b/a;->e()Lcom/facebook/abtest/qe/b/e;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 131
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/j;->a()Lcom/facebook/abtest/qe/b/e;

    move-result-object v0

    return-object v0
.end method
