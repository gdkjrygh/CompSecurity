.class Lcom/facebook/orca/app/av;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/h/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1678
    iput-object p1, p0, Lcom/facebook/orca/app/av;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1678
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/av;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/h/a;
    .locals 4

    .prologue
    .line 1682
    new-instance v1, Lcom/facebook/orca/h/a;

    const-class v0, Lcom/facebook/common/c/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/c/a;

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/common/annotations/IsDebugLogsEnabled;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/app/av;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/facebook/orca/h/a;-><init>(Lcom/facebook/common/c/a;Ljavax/inject/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1678
    invoke-virtual {p0}, Lcom/facebook/orca/app/av;->a()Lcom/facebook/orca/h/a;

    move-result-object v0

    return-object v0
.end method
