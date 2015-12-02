.class Lcom/facebook/orca/contacts/divebar/ba;
.super Ljava/lang/Object;
.source "DivebarNearbyFriendsRowView.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Lcom/facebook/user/User;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/ay;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/ay;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ba;->a:Lcom/facebook/orca/contacts/divebar/ay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/User;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 86
    invoke-virtual {p1}, Lcom/facebook/user/User;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 83
    check-cast p1, Lcom/facebook/user/User;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/divebar/ba;->a(Lcom/facebook/user/User;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
