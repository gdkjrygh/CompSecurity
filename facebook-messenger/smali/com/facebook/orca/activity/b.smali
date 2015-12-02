.class Lcom/facebook/orca/activity/b;
.super Ljava/lang/Object;
.source "AddContactsActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/activity/AddContactsActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/activity/AddContactsActivity;)V
    .locals 0

    .prologue
    .line 169
    iput-object p1, p0, Lcom/facebook/orca/activity/b;->a:Lcom/facebook/orca/activity/AddContactsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/orca/activity/b;->a:Lcom/facebook/orca/activity/AddContactsActivity;

    invoke-static {v0}, Lcom/facebook/orca/activity/AddContactsActivity;->c(Lcom/facebook/orca/activity/AddContactsActivity;)Lcom/facebook/orca/sms/bo;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/activity/b;->a:Lcom/facebook/orca/activity/AddContactsActivity;

    invoke-static {v1}, Lcom/facebook/orca/activity/AddContactsActivity;->b(Lcom/facebook/orca/activity/AddContactsActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/activity/b;->a:Lcom/facebook/orca/activity/AddContactsActivity;

    sget v3, Lcom/facebook/o;->invite_text:I

    invoke-virtual {v2, v3}, Lcom/facebook/orca/activity/AddContactsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/sms/bo;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/orca/sms/bp;

    move-result-object v0

    .line 174
    iget-object v1, p0, Lcom/facebook/orca/activity/b;->a:Lcom/facebook/orca/activity/AddContactsActivity;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "click"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "button"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "send_invite_button"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "sms_method"

    invoke-virtual {v0}, Lcom/facebook/orca/sms/bp;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;Lcom/facebook/analytics/cb;)V

    .line 180
    iget-object v0, p0, Lcom/facebook/orca/activity/b;->a:Lcom/facebook/orca/activity/AddContactsActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/activity/AddContactsActivity;->finish()V

    .line 181
    return-void
.end method
