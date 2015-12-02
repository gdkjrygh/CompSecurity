.class Lcom/facebook/orca/push/e;
.super Lcom/facebook/inject/d;
.source "MessagesPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/push/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/push/c;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/push/c;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/orca/push/e;->a:Lcom/facebook/orca/push/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/push/c;Lcom/facebook/orca/push/d;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lcom/facebook/orca/push/e;-><init>(Lcom/facebook/orca/push/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/push/b;
    .locals 6

    .prologue
    .line 59
    new-instance v0, Lcom/facebook/orca/push/b;

    const-class v1, Lcom/facebook/user/UserKey;

    const-class v2, Lcom/facebook/auth/annotations/LoggedInUserKey;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/push/e;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/notify/av;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/push/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/notify/av;

    const-class v3, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/push/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/fbservice/ops/k;

    const-class v4, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/push/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/base/a/d;

    const-class v5, Lcom/facebook/analytics/cn;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/push/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/analytics/cn;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/push/b;-><init>(Ljavax/inject/a;Lcom/facebook/orca/notify/av;Lcom/facebook/fbservice/ops/k;Lcom/facebook/base/a/d;Lcom/facebook/analytics/cn;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 55
    invoke-virtual {p0}, Lcom/facebook/orca/push/e;->a()Lcom/facebook/orca/push/b;

    move-result-object v0

    return-object v0
.end method
