.class Lcom/facebook/contacts/contactcard/a;
.super Lcom/facebook/widget/text/f;
.source "BlockContactDialogFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/a;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-direct {p0}, Lcom/facebook/widget/text/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/a;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->a(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)Lcom/facebook/contacts/contactcard/f;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/a;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-interface {v0, v1}, Lcom/facebook/contacts/contactcard/f;->c(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)V

    .line 64
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/a;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->b(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/a;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->b(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 67
    :cond_0
    return-void
.end method
