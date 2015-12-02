.class Lcom/facebook/orca/contacts/picker/ai;
.super Ljava/lang/Object;
.source "ContactPickerInviteFriendsView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/ah;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/ah;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ai;->a:Lcom/facebook/orca/contacts/picker/ah;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ai;->a:Lcom/facebook/orca/contacts/picker/ah;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ah;->a(Lcom/facebook/orca/contacts/picker/ah;)Lcom/facebook/orca/contacts/picker/aj;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ai;->a:Lcom/facebook/orca/contacts/picker/ah;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ah;->a(Lcom/facebook/orca/contacts/picker/ah;)Lcom/facebook/orca/contacts/picker/aj;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/contacts/picker/aj;->a()V

    .line 47
    :cond_0
    return-void
.end method
