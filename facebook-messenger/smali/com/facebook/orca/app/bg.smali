.class Lcom/facebook/orca/app/bg;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/app/dt;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 894
    iput-object p1, p0, Lcom/facebook/orca/app/bg;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 894
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bg;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/app/dt;
    .locals 5

    .prologue
    .line 899
    new-instance v4, Lcom/facebook/orca/app/dt;

    const-class v0, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/aa;

    const-class v1, Lcom/facebook/orca/g/p;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/g/p;

    const-class v2, Lcom/facebook/orca/f/ad;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/f/ad;

    const-class v3, Lcom/facebook/orca/f/z;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/f/z;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/app/dt;-><init>(Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/p;Lcom/facebook/orca/f/ad;Lcom/facebook/orca/f/z;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 894
    invoke-virtual {p0}, Lcom/facebook/orca/app/bg;->a()Lcom/facebook/orca/app/dt;

    move-result-object v0

    return-object v0
.end method
