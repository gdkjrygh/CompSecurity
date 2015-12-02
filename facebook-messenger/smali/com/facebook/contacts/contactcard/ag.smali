.class Lcom/facebook/contacts/contactcard/ag;
.super Ljava/lang/Object;
.source "GroupContactCardFragment.java"

# interfaces
.implements Lcom/facebook/contacts/contactcard/am;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/GroupContactCardFragment;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ag;->a:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ag;->a:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "add_person"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a(Lcom/facebook/contacts/contactcard/GroupContactCardFragment;Lcom/facebook/analytics/cb;)V

    .line 104
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ag;->a:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-virtual {v1}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->n()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/threadview/AddMembersActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 105
    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 106
    const-string v1, "thread_id"

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/ag;->a:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-static {v2}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->b(Lcom/facebook/contacts/contactcard/GroupContactCardFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 107
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ag;->a:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a(Landroid/content/Intent;)V

    .line 108
    return-void
.end method

.method public a(Lcom/facebook/user/UserKey;)V
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ag;->a:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a(Lcom/facebook/contacts/contactcard/GroupContactCardFragment;)Lcom/facebook/contacts/contactcard/ai;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ag;->a:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a(Lcom/facebook/contacts/contactcard/GroupContactCardFragment;)Lcom/facebook/contacts/contactcard/ai;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/contacts/contactcard/ai;->a(Lcom/facebook/user/UserKey;)V

    .line 97
    :cond_0
    return-void
.end method
