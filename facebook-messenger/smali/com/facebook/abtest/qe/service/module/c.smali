.class Lcom/facebook/abtest/qe/service/module/c;
.super Lcom/facebook/inject/d;
.source "QuickExperimentServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/service/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/service/module/a;


# direct methods
.method private constructor <init>(Lcom/facebook/abtest/qe/service/module/a;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/module/c;->a:Lcom/facebook/abtest/qe/service/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V
    .locals 0

    .prologue
    .line 97
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/service/module/c;-><init>(Lcom/facebook/abtest/qe/service/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 5

    .prologue
    .line 102
    new-instance v3, Lcom/facebook/fbservice/service/v;

    const-class v0, Lcom/facebook/abtest/qe/service/c;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/f;

    new-instance v4, Lcom/facebook/fbservice/service/v;

    const-class v1, Lcom/facebook/abtest/qe/service/b;

    invoke-virtual {p0, v1}, Lcom/facebook/abtest/qe/service/module/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/service/f;

    const-class v2, Lcom/facebook/abtest/qe/service/g;

    invoke-virtual {p0, v2}, Lcom/facebook/abtest/qe/service/module/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/service/e;

    invoke-direct {v4, v1, v2}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    invoke-direct {v3, v0, v4}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 97
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/service/module/c;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method
