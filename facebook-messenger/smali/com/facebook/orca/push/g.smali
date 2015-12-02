.class Lcom/facebook/orca/push/g;
.super Lcom/facebook/inject/d;
.source "MessagesPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/push/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/push/c;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/push/c;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/facebook/orca/push/g;->a:Lcom/facebook/orca/push/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/push/c;Lcom/facebook/orca/push/d;)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0, p1}, Lcom/facebook/orca/push/g;-><init>(Lcom/facebook/orca/push/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/push/a/a;
    .locals 15

    .prologue
    .line 74
    new-instance v0, Lcom/facebook/orca/push/a/a;

    const-class v1, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/b;

    const-class v2, Landroid/content/res/Resources;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/res/Resources;

    const-class v3, Lcom/facebook/orca/push/b;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/push/b;

    const-class v4, Lcom/facebook/orca/push/a/b;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/push/a/b;

    const-class v5, Lcom/facebook/l/k;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/l/k;

    const-class v6, Lcom/facebook/analytics/cn;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/analytics/cn;

    const-class v7, Lcom/facebook/push/c2dm/y;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/push/c2dm/y;

    const-class v8, Lcom/facebook/orca/push/h;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/orca/push/h;

    const-class v9, Lcom/facebook/auth/login/bm;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/auth/login/bm;

    const-class v10, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v10}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v11, Lcom/facebook/config/a/d;

    invoke-virtual {p0, v11}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/config/a/d;

    const-class v12, Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {p0, v12}, Lcom/facebook/orca/push/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {p0}, Lcom/facebook/orca/push/g;->e()Lcom/facebook/inject/ab;

    move-result-object v13

    const-class v14, Lcom/facebook/fbservice/ops/c;

    invoke-interface {v13, v14}, Lcom/facebook/inject/ab;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v13

    invoke-direct/range {v0 .. v13}, Lcom/facebook/orca/push/a/a;-><init>(Lcom/facebook/auth/b/b;Landroid/content/res/Resources;Lcom/facebook/orca/push/b;Lcom/facebook/orca/push/a/b;Lcom/facebook/l/k;Lcom/facebook/analytics/cn;Lcom/facebook/push/c2dm/y;Lcom/facebook/orca/push/h;Lcom/facebook/auth/login/bm;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/config/a/d;Lcom/facebook/orca/fbwebrtc/ag;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 69
    invoke-virtual {p0}, Lcom/facebook/orca/push/g;->a()Lcom/facebook/orca/push/a/a;

    move-result-object v0

    return-object v0
.end method
