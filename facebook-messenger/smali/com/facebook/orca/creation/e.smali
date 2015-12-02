.class Lcom/facebook/orca/creation/e;
.super Ljava/lang/Object;
.source "CreateThreadActivity.java"

# interfaces
.implements Lcom/facebook/orca/contacts/picker/z;


# instance fields
.field final synthetic a:Lcom/facebook/orca/creation/CreateThreadActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V
    .locals 0

    .prologue
    .line 311
    iput-object p1, p0, Lcom/facebook/orca/creation/e;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .prologue
    .line 318
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/creation/e;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/creation/e;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-static {v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->b(Lcom/facebook/orca/creation/CreateThreadActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 319
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/creation/e;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-static {v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->c(Lcom/facebook/orca/creation/CreateThreadActivity;)Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->O()V

    .line 323
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/creation/e;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-static {v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->c(Lcom/facebook/orca/creation/CreateThreadActivity;)Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->P()V

    .line 324
    return-void

    .line 321
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/creation/e;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-static {v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->c(Lcom/facebook/orca/creation/CreateThreadActivity;)Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->d()V

    goto :goto_0
.end method
