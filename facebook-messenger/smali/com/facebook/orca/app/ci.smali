.class Lcom/facebook/orca/app/ci;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1650
    iput-object p1, p0, Lcom/facebook/orca/app/ci;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1650
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ci;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/p;
    .locals 2

    .prologue
    .line 1654
    new-instance v1, Lcom/facebook/orca/f/p;

    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ci;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    invoke-direct {v1, v0}, Lcom/facebook/orca/f/p;-><init>(Lcom/facebook/fbservice/ops/k;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1650
    invoke-virtual {p0}, Lcom/facebook/orca/app/ci;->a()Lcom/facebook/orca/f/p;

    move-result-object v0

    return-object v0
.end method
