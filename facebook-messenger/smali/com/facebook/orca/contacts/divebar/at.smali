.class Lcom/facebook/orca/contacts/divebar/at;
.super Ljava/lang/Object;
.source "DivebarNearbyFriendsFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/at;->a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/at;->a:Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->d()V

    .line 107
    return-void
.end method
