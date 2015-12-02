.class Lcom/facebook/orca/server/module/k;
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
    .line 290
    iput-object p1, p0, Lcom/facebook/orca/server/module/k;->a:Lcom/facebook/orca/server/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V
    .locals 0

    .prologue
    .line 290
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/module/k;-><init>(Lcom/facebook/orca/server/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 3

    .prologue
    .line 295
    new-instance v1, Lcom/facebook/fbservice/service/v;

    const-class v0, Lcom/facebook/orca/protocol/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/f;

    new-instance v2, Lcom/facebook/fbservice/service/ai;

    invoke-direct {v2}, Lcom/facebook/fbservice/service/ai;-><init>()V

    invoke-direct {v1, v0, v2}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 290
    invoke-virtual {p0}, Lcom/facebook/orca/server/module/k;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method
