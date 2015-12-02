.class public Lcom/facebook/contacts/contactcard/ContactCardActivity;
.super Lcom/facebook/base/activity/i;
.source "ContactCardActivity.java"


# instance fields
.field private p:Lcom/facebook/contacts/contactcard/ContactCardFragment;

.field private q:Landroid/support/v4/app/q;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 22
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 23
    sget v0, Lcom/facebook/k;->contacts_card:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardActivity;->setContentView(I)V

    .line 25
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    .line 26
    const-class v1, Landroid/support/v4/app/q;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/q;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardActivity;->q:Landroid/support/v4/app/q;

    .line 28
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardActivity;->q:Landroid/support/v4/app/q;

    sget v1, Lcom/facebook/i;->contact_card_fragment:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/ContactCardFragment;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardActivity;->p:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    .line 32
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "userKey"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 33
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardActivity;->p:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/user/UserKey;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    :goto_0
    return-void

    .line 34
    :catch_0
    move-exception v0

    .line 35
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardActivity;->finish()V

    goto :goto_0
.end method
