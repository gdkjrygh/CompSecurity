.class Lcom/facebook/orca/app/bt;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/app/fj;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 908
    iput-object p1, p0, Lcom/facebook/orca/app/bt;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 908
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bt;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/app/fj;
    .locals 1

    .prologue
    .line 912
    const-class v0, Lcom/facebook/orca/app/fg;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/bt;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/app/fg;

    invoke-virtual {v0}, Lcom/facebook/orca/app/fg;->c()Lcom/facebook/orca/app/fj;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 908
    invoke-virtual {p0}, Lcom/facebook/orca/app/bt;->a()Lcom/facebook/orca/app/fj;

    move-result-object v0

    return-object v0
.end method
