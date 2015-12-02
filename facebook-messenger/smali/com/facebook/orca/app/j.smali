.class Lcom/facebook/orca/app/j;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/threads/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 1942
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1942
    invoke-direct {p0}, Lcom/facebook/orca/app/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/a;
    .locals 1

    .prologue
    .line 1946
    new-instance v0, Lcom/facebook/orca/threads/a;

    invoke-direct {v0}, Lcom/facebook/orca/threads/a;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1942
    invoke-virtual {p0}, Lcom/facebook/orca/app/j;->a()Lcom/facebook/orca/threads/a;

    move-result-object v0

    return-object v0
.end method
