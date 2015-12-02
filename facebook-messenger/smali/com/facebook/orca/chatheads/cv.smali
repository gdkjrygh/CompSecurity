.class Lcom/facebook/orca/chatheads/cv;
.super Lcom/facebook/inject/d;
.source "ChatHeadsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/chatheads/bz;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/cn;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/cn;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lcom/facebook/orca/chatheads/cv;->a:Lcom/facebook/orca/chatheads/cn;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V
    .locals 0

    .prologue
    .line 239
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/cv;-><init>(Lcom/facebook/orca/chatheads/cn;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/chatheads/bz;
    .locals 2

    .prologue
    .line 244
    new-instance v1, Lcom/facebook/orca/chatheads/bz;

    const-class v0, Landroid/app/Service;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Service;

    invoke-direct {v1, v0}, Lcom/facebook/orca/chatheads/bz;-><init>(Landroid/app/Service;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 239
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cv;->a()Lcom/facebook/orca/chatheads/bz;

    move-result-object v0

    return-object v0
.end method
