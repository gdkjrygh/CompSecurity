.class Lcom/facebook/orca/server/module/h;
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
    .line 189
    iput-object p1, p0, Lcom/facebook/orca/server/module/h;->a:Lcom/facebook/orca/server/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V
    .locals 0

    .prologue
    .line 189
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/module/h;-><init>(Lcom/facebook/orca/server/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 5

    .prologue
    .line 194
    new-instance v2, Lcom/facebook/fbservice/service/v;

    const-class v0, Lcom/facebook/orca/l/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/f;

    new-instance v3, Lcom/facebook/fbservice/service/v;

    const-class v1, Lcom/facebook/orca/f/j;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/server/module/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/service/f;

    iget-object v4, p0, Lcom/facebook/orca/server/module/h;->a:Lcom/facebook/orca/server/module/a;

    invoke-static {v4}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/orca/server/module/a;)Lcom/facebook/fbservice/a/a;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    invoke-direct {v2, v0, v3}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 189
    invoke-virtual {p0}, Lcom/facebook/orca/server/module/h;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method
