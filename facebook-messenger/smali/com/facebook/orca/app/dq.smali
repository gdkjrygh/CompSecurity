.class Lcom/facebook/orca/app/dq;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/login/af;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1770
    iput-object p1, p0, Lcom/facebook/orca/app/dq;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1770
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/dq;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/login/af;
    .locals 9

    .prologue
    .line 1774
    new-instance v0, Lcom/facebook/orca/login/af;

    const-class v1, Lcom/facebook/auth/b/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/d;

    const-class v2, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/dq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/analytics/av;

    const-class v3, Lcom/facebook/auth/login/v;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/dq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/auth/login/v;

    const-class v4, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/dq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/prefs/shared/d;

    const-class v5, Lcom/facebook/orca/nux/h;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/dq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/nux/h;

    const-class v6, Lcom/facebook/orca/login/b;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/dq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/login/b;

    const-class v7, Lcom/facebook/auth/login/am;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/app/dq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/auth/login/am;

    const-class v8, Lcom/facebook/user/a/h;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/app/dq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/user/a/h;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/orca/login/af;-><init>(Lcom/facebook/auth/b/d;Lcom/facebook/analytics/av;Lcom/facebook/auth/login/v;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/nux/h;Lcom/facebook/orca/login/b;Lcom/facebook/auth/login/am;Lcom/facebook/user/a/h;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1770
    invoke-virtual {p0}, Lcom/facebook/orca/app/dq;->a()Lcom/facebook/orca/login/af;

    move-result-object v0

    return-object v0
.end method
