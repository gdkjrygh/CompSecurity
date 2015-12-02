.class Lcom/facebook/orca/broadcast/p;
.super Ljava/lang/Object;
.source "ComposeBroadcastFragment.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Lcom/facebook/user/UserWithIdentifier;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lcom/facebook/orca/broadcast/p;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/UserWithIdentifier;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 242
    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 239
    check-cast p1, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/broadcast/p;->a(Lcom/facebook/user/UserWithIdentifier;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
