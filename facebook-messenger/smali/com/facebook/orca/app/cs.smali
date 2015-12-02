.class Lcom/facebook/orca/app/cs;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/threads/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1506
    iput-object p1, p0, Lcom/facebook/orca/app/cs;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1506
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/cs;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/n;
    .locals 3

    .prologue
    .line 1510
    new-instance v1, Lcom/facebook/orca/threads/n;

    invoke-virtual {p0}, Lcom/facebook/orca/app/cs;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/orca/threads/n;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1506
    invoke-virtual {p0}, Lcom/facebook/orca/app/cs;->a()Lcom/facebook/orca/threads/n;

    move-result-object v0

    return-object v0
.end method
