.class Lcom/facebook/contacts/contactcard/m;
.super Lcom/facebook/fbservice/ops/ac;
.source "ContactCardFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/ContactCardFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 949
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/m;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 952
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/m;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->c(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 953
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/m;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Z)Z

    .line 954
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/m;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->T()V

    .line 955
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 959
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/m;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->c(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 962
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/m;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->audio_message_error_name:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 966
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 949
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/contactcard/m;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
