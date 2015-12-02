.class Lcom/facebook/abtest/qe/service/module/h;
.super Lcom/facebook/inject/d;
.source "QuickExperimentServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/service/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/service/module/a;


# direct methods
.method private constructor <init>(Lcom/facebook/abtest/qe/service/module/a;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/module/h;->a:Lcom/facebook/abtest/qe/service/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V
    .locals 0

    .prologue
    .line 143
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/service/module/h;-><init>(Lcom/facebook/abtest/qe/service/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/service/a/a;
    .locals 8

    .prologue
    .line 148
    new-instance v0, Lcom/facebook/abtest/qe/service/a/a;

    const-class v1, Ljava/lang/String;

    const-class v2, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/abtest/qe/service/module/h;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/abtest/qe/service/module/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/service/module/h;->e()Lcom/facebook/inject/ab;

    move-result-object v3

    const-class v4, Lcom/facebook/fbservice/ops/k;

    invoke-interface {v3, v4}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/fbservice/ops/k;

    const-class v4, Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {p0, v4}, Lcom/facebook/abtest/qe/service/module/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/abtest/qe/g/a;

    const-class v5, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v5}, Lcom/facebook/abtest/qe/service/module/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/time/a;

    const-class v6, Ljava/lang/Boolean;

    const-class v7, Lcom/facebook/abtest/qe/annotations/ShouldAppFetchOnForeground;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/abtest/qe/service/module/h;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/facebook/abtest/qe/service/a/a;-><init>(Ljavax/inject/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/fbservice/ops/k;Lcom/facebook/abtest/qe/g/a;Lcom/facebook/common/time/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 143
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/service/module/h;->a()Lcom/facebook/abtest/qe/service/a/a;

    move-result-object v0

    return-object v0
.end method
