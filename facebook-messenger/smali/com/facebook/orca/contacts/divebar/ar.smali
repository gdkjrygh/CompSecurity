.class Lcom/facebook/orca/contacts/divebar/ar;
.super Ljava/lang/Object;
.source "DivebarNearbyFriendsFragment.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/user/User;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ar;->a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/User;Lcom/facebook/user/User;)I
    .locals 3

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ar;->a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->a(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)Lcom/facebook/contacts/a/c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/a/c;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/user/ChatContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/ChatContext;->getDistanceMeters()F

    move-result v0

    .line 56
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ar;->a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    invoke-static {v1}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->a(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)Lcom/facebook/contacts/a/c;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/a/c;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/user/ChatContext;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/ChatContext;->getDistanceMeters()F

    move-result v1

    .line 58
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Float;->compareTo(Ljava/lang/Float;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 51
    check-cast p1, Lcom/facebook/user/User;

    check-cast p2, Lcom/facebook/user/User;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/contacts/divebar/ar;->a(Lcom/facebook/user/User;Lcom/facebook/user/User;)I

    move-result v0

    return v0
.end method
