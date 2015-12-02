.class Lcom/facebook/orca/app/dj;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/af;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 982
    iput-object p1, p0, Lcom/facebook/orca/app/dj;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 982
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/dj;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/af;
    .locals 4

    .prologue
    .line 987
    new-instance v3, Lcom/facebook/orca/f/af;

    const-class v0, Lcom/facebook/orca/f/ad;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/dj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/ad;

    const-class v1, Lcom/facebook/push/mqtt/v;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/push/mqtt/v;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/dj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/f/af;-><init>(Lcom/facebook/orca/f/ad;Lcom/facebook/push/mqtt/v;Lcom/facebook/common/time/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 982
    invoke-virtual {p0}, Lcom/facebook/orca/app/dj;->a()Lcom/facebook/orca/f/af;

    move-result-object v0

    return-object v0
.end method
