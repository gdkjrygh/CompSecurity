.class Lcom/facebook/contacts/contactcard/d;
.super Ljava/lang/Object;
.source "BlockContactDialogFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/d;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/d;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->c(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 129
    :cond_0
    :goto_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 130
    return-void

    .line 118
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/d;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->a(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)Lcom/facebook/contacts/contactcard/f;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/d;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->a(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)Lcom/facebook/contacts/contactcard/f;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/d;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-interface {v0, v1}, Lcom/facebook/contacts/contactcard/f;->a(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)V

    goto :goto_0

    .line 123
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/d;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->a(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)Lcom/facebook/contacts/contactcard/f;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/d;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->a(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)Lcom/facebook/contacts/contactcard/f;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/d;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-interface {v0, v1}, Lcom/facebook/contacts/contactcard/f;->b(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)V

    goto :goto_0

    .line 116
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
