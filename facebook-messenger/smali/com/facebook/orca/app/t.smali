.class Lcom/facebook/orca/app/t;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 943
    iput-object p1, p0, Lcom/facebook/orca/app/t;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 943
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/t;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/k;
    .locals 5

    .prologue
    .line 947
    new-instance v3, Lcom/facebook/orca/f/k;

    const-class v0, Lcom/facebook/user/User;

    const-class v1, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/app/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v0, Lcom/facebook/orca/f/ad;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/ad;

    const-class v1, Lcom/facebook/location/r;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/location/r;

    const-class v2, Lcom/facebook/orca/f/af;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/f/af;

    invoke-direct {v3, v4, v0, v1, v2}, Lcom/facebook/orca/f/k;-><init>(Ljavax/inject/a;Lcom/facebook/orca/f/ad;Lcom/facebook/location/r;Lcom/facebook/orca/f/af;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 943
    invoke-virtual {p0}, Lcom/facebook/orca/app/t;->a()Lcom/facebook/orca/f/k;

    move-result-object v0

    return-object v0
.end method
