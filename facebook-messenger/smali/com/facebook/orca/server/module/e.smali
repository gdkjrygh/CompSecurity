.class Lcom/facebook/orca/server/module/e;
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
    .line 201
    iput-object p1, p0, Lcom/facebook/orca/server/module/e;->a:Lcom/facebook/orca/server/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V
    .locals 0

    .prologue
    .line 201
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/module/e;-><init>(Lcom/facebook/orca/server/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 7

    .prologue
    .line 206
    new-instance v2, Lcom/facebook/fbservice/service/v;

    iget-object v0, p0, Lcom/facebook/orca/server/module/e;->a:Lcom/facebook/orca/server/module/a;

    invoke-static {v0}, Lcom/facebook/orca/server/module/a;->b(Lcom/facebook/orca/server/module/a;)Lcom/facebook/fbservice/a/b;

    move-result-object v3

    new-instance v4, Lcom/facebook/fbservice/service/v;

    const-class v0, Lcom/facebook/orca/g/u;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/f;

    new-instance v5, Lcom/facebook/fbservice/service/v;

    const-class v1, Lcom/facebook/orca/i/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/server/module/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/service/f;

    new-instance v6, Lcom/facebook/fbservice/service/ai;

    invoke-direct {v6}, Lcom/facebook/fbservice/service/ai;-><init>()V

    invoke-direct {v5, v1, v6}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    invoke-direct {v4, v0, v5}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    invoke-direct {v2, v3, v4}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 201
    invoke-virtual {p0}, Lcom/facebook/orca/server/module/e;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method
