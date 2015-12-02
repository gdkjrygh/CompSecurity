.class public Lcom/facebook/auth/d/a;
.super Ljava/lang/Object;
.source "IsLoggedInUserAnEmployeeProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Lcom/facebook/common/w/q;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .param p1    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/auth/annotations/LoggedInUser;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/facebook/auth/d/a;->a:Ljavax/inject/a;

    .line 23
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/auth/d/a;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 28
    if-nez v0, :cond_0

    .line 29
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    .line 31
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/user/User;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16
    invoke-virtual {p0}, Lcom/facebook/auth/d/a;->a()Lcom/facebook/common/w/q;

    move-result-object v0

    return-object v0
.end method
