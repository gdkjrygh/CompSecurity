.class Lcom/facebook/contacts/contactcard/aa;
.super Ljava/lang/Object;
.source "ConversationSettingsView.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/ConversationSettingsView$NotificationsSettingsDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/ConversationSettingsView$NotificationsSettingsDialogFragment;)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/aa;->a:Lcom/facebook/contacts/contactcard/ConversationSettingsView$NotificationsSettingsDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/aa;->a:Lcom/facebook/contacts/contactcard/ConversationSettingsView$NotificationsSettingsDialogFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/ConversationSettingsView$NotificationsSettingsDialogFragment;->a(Lcom/facebook/contacts/contactcard/ConversationSettingsView$NotificationsSettingsDialogFragment;)Lcom/facebook/contacts/contactcard/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/aa;->a:Lcom/facebook/contacts/contactcard/ConversationSettingsView$NotificationsSettingsDialogFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/ConversationSettingsView$NotificationsSettingsDialogFragment;->a(Lcom/facebook/contacts/contactcard/ConversationSettingsView$NotificationsSettingsDialogFragment;)Lcom/facebook/contacts/contactcard/ab;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/facebook/contacts/contactcard/ab;->a(I)V

    .line 120
    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 121
    return-void
.end method
