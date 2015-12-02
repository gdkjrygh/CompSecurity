.class Lcom/facebook/contacts/contactcard/j;
.super Ljava/lang/Object;
.source "ContactCardFragment.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/ops/aa;

.field final synthetic b:Lcom/facebook/contacts/contactcard/ContactCardFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/facebook/fbservice/ops/aa;)V
    .locals 0

    .prologue
    .line 798
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/j;->b:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    iput-object p2, p0, Lcom/facebook/contacts/contactcard/j;->a:Lcom/facebook/fbservice/ops/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 3

    .prologue
    .line 801
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/j;->a:Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/aa;->b()V

    .line 802
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 803
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 804
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/j;->b:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Z)Z

    .line 805
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/j;->b:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-static {v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->l(Lcom/facebook/contacts/contactcard/ContactCardFragment;)Lcom/facebook/c/s;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/j;->b:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 806
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 798
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/contactcard/j;->a(Landroid/net/Uri;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 810
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/j;->a:Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/aa;->b()V

    .line 811
    invoke-static {}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->V()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "unable to lookup contact in addressbook"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 812
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/j;->b:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->m(Lcom/facebook/contacts/contactcard/ContactCardFragment;)Lcom/facebook/common/e/h;

    move-result-object v0

    invoke-static {}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->V()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "unable to lookup contact in addressbook"

    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 818
    return-void
.end method
