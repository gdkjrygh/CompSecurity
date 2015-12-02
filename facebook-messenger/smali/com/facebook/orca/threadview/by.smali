.class Lcom/facebook/orca/threadview/by;
.super Lcom/facebook/widget/titlebar/b;
.source "ThreadViewFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 617
    iput-object p1, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Lcom/facebook/widget/titlebar/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/widget/titlebar/d;)V
    .locals 2

    .prologue
    .line 620
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/d;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 621
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->j(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/orca/threadview/ca;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    if-ne v0, v1, :cond_0

    .line 623
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->h(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 624
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/ca;)V

    .line 652
    :cond_0
    :goto_0
    return-void

    .line 627
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->k(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 628
    if-eqz v0, :cond_0

    .line 632
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 633
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/ca;)V

    goto :goto_0

    .line 635
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->GROUP_CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/ca;)V

    goto :goto_0

    .line 638
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/d;->a()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 639
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->j(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/orca/threadview/ca;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/ContactCardFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 640
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/ContactCardFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->b()V

    goto :goto_0

    .line 642
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/d;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 643
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->j(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/orca/threadview/ca;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/ContactCardFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 644
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/ContactCardFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->c()V

    goto :goto_0

    .line 646
    :cond_5
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/d;->a()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 647
    iget-object v0, p0, Lcom/facebook/orca/threadview/by;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    .line 648
    instance-of v1, v0, Lcom/facebook/orca/activity/k;

    if-eqz v1, :cond_0

    .line 649
    check-cast v0, Lcom/facebook/orca/activity/k;

    invoke-interface {v0}, Lcom/facebook/orca/activity/k;->c()Lcom/facebook/orca/common/ui/titlebar/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->g()V

    goto :goto_0
.end method
