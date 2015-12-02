.class Lcom/facebook/orca/contacts/divebar/as;
.super Ljava/lang/Object;
.source "DivebarNearbyFriendsFragment.java"

# interfaces
.implements Lcom/facebook/contacts/picker/aq;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/as;->a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/picker/ad;I)V
    .locals 6

    .prologue
    .line 90
    move-object v3, p1

    check-cast v3, Lcom/facebook/contacts/picker/ag;

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/as;->a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->b(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)Lcom/facebook/orca/contacts/divebar/bl;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/as;->a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->b(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)Lcom/facebook/orca/contacts/divebar/bl;

    move-result-object v0

    invoke-virtual {v3}, Lcom/facebook/contacts/picker/ag;->a()Lcom/facebook/user/UserWithIdentifier;

    move-result-object v1

    const/4 v2, 0x1

    const-string v4, "divebar_nearby_friends"

    move v5, p2

    invoke-interface/range {v0 .. v5}, Lcom/facebook/orca/contacts/divebar/bl;->a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;I)Z

    .line 100
    :cond_0
    return-void
.end method
