.class Lcom/facebook/orca/contacts/divebar/az;
.super Ljava/lang/Object;
.source "DivebarNearbyFriendsRowView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/ay;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/ay;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/az;->a:Lcom/facebook/orca/contacts/divebar/ay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/az;->a:Lcom/facebook/orca/contacts/divebar/ay;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/ay;->a(Lcom/facebook/orca/contacts/divebar/ay;)Lcom/facebook/orca/contacts/divebar/bb;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/az;->a:Lcom/facebook/orca/contacts/divebar/ay;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/ay;->a(Lcom/facebook/orca/contacts/divebar/ay;)Lcom/facebook/orca/contacts/divebar/bb;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/az;->a:Lcom/facebook/orca/contacts/divebar/ay;

    invoke-static {v1}, Lcom/facebook/orca/contacts/divebar/ay;->b(Lcom/facebook/orca/contacts/divebar/ay;)Lcom/facebook/orca/contacts/divebar/av;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/orca/contacts/divebar/bb;->a(Lcom/facebook/orca/contacts/divebar/av;)V

    .line 58
    :cond_0
    return-void
.end method
