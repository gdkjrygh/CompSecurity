.class Lcom/facebook/orca/common/ui/titlebar/e;
.super Ljava/lang/Object;
.source "DivebarController.java"

# interfaces
.implements Lcom/facebook/orca/contacts/divebar/bl;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 710
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/e;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 749
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/e;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->i(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/common/ui/titlebar/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/p;->b()V

    .line 750
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 754
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 755
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/e;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->i(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/common/ui/titlebar/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/orca/common/ui/titlebar/p;->a(Ljava/lang/String;)V

    .line 757
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/ThreadSummary;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 737
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/e;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0, p4, p3}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;Ljava/lang/String;Lcom/facebook/contacts/picker/ad;)Ljava/lang/String;

    move-result-object v1

    .line 738
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/e;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->j(Lcom/facebook/orca/common/ui/titlebar/a;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/bl;

    .line 739
    invoke-interface {v0, p1, p2, p3, v1}, Lcom/facebook/orca/contacts/divebar/bl;->a(Lcom/facebook/orca/threads/ThreadSummary;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 744
    :goto_0
    return v3

    .line 743
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/e;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0, p1, p2, v1}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;Lcom/facebook/orca/threads/ThreadSummary;ZLjava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;I)Z
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 718
    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 719
    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->c()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    .line 720
    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->e()Lcom/facebook/user/s;

    move-result-object v0

    .line 721
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/e;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v1}, Lcom/facebook/orca/common/ui/titlebar/a;->i(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/common/ui/titlebar/p;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/user/s;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, p5}, Lcom/facebook/orca/common/ui/titlebar/p;->a(Ljava/lang/String;I)V

    .line 724
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/e;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0, p4, p3}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;Ljava/lang/String;Lcom/facebook/contacts/picker/ad;)Ljava/lang/String;

    move-result-object v4

    .line 725
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/e;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->j(Lcom/facebook/orca/common/ui/titlebar/a;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/bl;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v5, p5

    .line 726
    invoke-interface/range {v0 .. v5}, Lcom/facebook/orca/contacts/divebar/bl;->a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 731
    :goto_0
    return v7

    .line 730
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/e;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0, p1, p2, p3, v4}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;)V

    goto :goto_0
.end method
