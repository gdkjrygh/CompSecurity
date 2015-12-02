.class Lcom/facebook/orca/app/dz;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/common/ui/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 782
    iput-object p1, p0, Lcom/facebook/orca/app/dz;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 782
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/dz;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/common/ui/a/a;
    .locals 1

    .prologue
    .line 786
    new-instance v0, Lcom/facebook/orca/reflex/a;

    invoke-direct {v0}, Lcom/facebook/orca/reflex/a;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 782
    invoke-virtual {p0}, Lcom/facebook/orca/app/dz;->a()Lcom/facebook/orca/common/ui/a/a;

    move-result-object v0

    return-object v0
.end method
