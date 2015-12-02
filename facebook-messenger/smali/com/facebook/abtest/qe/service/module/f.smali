.class Lcom/facebook/abtest/qe/service/module/f;
.super Lcom/facebook/inject/d;
.source "QuickExperimentServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/service/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/service/module/a;


# direct methods
.method private constructor <init>(Lcom/facebook/abtest/qe/service/module/a;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/module/f;->a:Lcom/facebook/abtest/qe/service/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V
    .locals 0

    .prologue
    .line 124
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/service/module/f;-><init>(Lcom/facebook/abtest/qe/service/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/service/g;
    .locals 10

    .prologue
    .line 129
    new-instance v0, Lcom/facebook/abtest/qe/service/g;

    const-class v1, Lcom/facebook/http/protocol/am;

    invoke-virtual {p0, v1}, Lcom/facebook/abtest/qe/service/module/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/am;

    const-class v2, Ljava/lang/String;

    const-class v3, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/abtest/qe/service/module/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {p0, v3}, Lcom/facebook/abtest/qe/service/module/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/abtest/qe/g/a;

    const-class v4, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v4}, Lcom/facebook/abtest/qe/service/module/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/prefs/shared/d;

    const-class v5, Lcom/facebook/abtest/qe/protocol/sync/user/a;

    invoke-virtual {p0, v5}, Lcom/facebook/abtest/qe/service/module/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/abtest/qe/protocol/sync/user/a;

    const-class v6, Lcom/facebook/abtest/qe/protocol/sync/full/a;

    invoke-virtual {p0, v6}, Lcom/facebook/abtest/qe/service/module/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/abtest/qe/protocol/sync/full/a;

    const-class v7, Ljava/lang/Boolean;

    const-class v8, Lcom/facebook/abtest/qe/annotations/IsFullExperimentSyncEnabled;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/abtest/qe/service/module/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    const-class v8, Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {p0, v8}, Lcom/facebook/abtest/qe/service/module/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/abtest/qe/b/a;

    const-class v9, Lcom/facebook/abtest/qe/b;

    invoke-virtual {p0, v9}, Lcom/facebook/abtest/qe/service/module/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/abtest/qe/b;

    invoke-direct/range {v0 .. v9}, Lcom/facebook/abtest/qe/service/g;-><init>(Lcom/facebook/http/protocol/am;Ljavax/inject/a;Lcom/facebook/abtest/qe/g/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/abtest/qe/protocol/sync/user/a;Lcom/facebook/abtest/qe/protocol/sync/full/a;Ljavax/inject/a;Lcom/facebook/abtest/qe/b/a;Lcom/facebook/abtest/qe/b;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 124
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/service/module/f;->a()Lcom/facebook/abtest/qe/service/g;

    move-result-object v0

    return-object v0
.end method
