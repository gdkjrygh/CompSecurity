.class Lcom/facebook/orca/server/module/g;
.super Lcom/facebook/inject/d;
.source "MessagesServiceModule.java"


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
.field final synthetic a:Lcom/facebook/orca/server/module/a;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/server/module/a;)V
    .locals 0

    .prologue
    .line 214
    iput-object p1, p0, Lcom/facebook/orca/server/module/g;->a:Lcom/facebook/orca/server/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V
    .locals 0

    .prologue
    .line 214
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/module/g;-><init>(Lcom/facebook/orca/server/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 9

    .prologue
    .line 219
    new-instance v4, Lcom/facebook/fbservice/service/v;

    const-class v0, Lcom/facebook/orca/l/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/f;

    new-instance v5, Lcom/facebook/fbservice/service/v;

    const-class v1, Lcom/facebook/orca/f/j;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/server/module/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/service/f;

    new-instance v6, Lcom/facebook/fbservice/service/v;

    const-class v2, Lcom/facebook/orca/g/u;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/server/module/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/service/f;

    new-instance v7, Lcom/facebook/fbservice/service/v;

    const-class v3, Lcom/facebook/orca/i/a;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/server/module/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/fbservice/service/f;

    new-instance v8, Lcom/facebook/fbservice/service/ai;

    invoke-direct {v8}, Lcom/facebook/fbservice/service/ai;-><init>()V

    invoke-direct {v7, v3, v8}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    invoke-direct {v6, v2, v7}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    invoke-direct {v5, v1, v6}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    invoke-direct {v4, v0, v5}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 214
    invoke-virtual {p0}, Lcom/facebook/orca/server/module/g;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method
