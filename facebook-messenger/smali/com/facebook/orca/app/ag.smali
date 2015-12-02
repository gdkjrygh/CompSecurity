.class Lcom/facebook/orca/app/ag;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/i/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1727
    iput-object p1, p0, Lcom/facebook/orca/app/ag;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1727
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ag;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/i/a;
    .locals 7

    .prologue
    .line 1731
    new-instance v0, Lcom/facebook/orca/i/a;

    const-class v1, Lcom/facebook/orca/sms/bj;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/sms/bj;

    const-class v2, Lcom/facebook/orca/protocol/a;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/protocol/a;

    const-class v3, Lcom/facebook/orca/threads/g;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/threads/g;

    const-class v4, Ljava/lang/Boolean;

    const-class v5, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/app/ag;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Ljava/lang/Boolean;

    const-class v6, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/orca/app/ag;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/i/a;-><init>(Lcom/facebook/orca/sms/bj;Lcom/facebook/orca/protocol/a;Lcom/facebook/orca/threads/g;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1727
    invoke-virtual {p0}, Lcom/facebook/orca/app/ag;->a()Lcom/facebook/orca/i/a;

    move-result-object v0

    return-object v0
.end method
