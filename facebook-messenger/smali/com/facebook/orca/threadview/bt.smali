.class Lcom/facebook/orca/threadview/bt;
.super Ljava/lang/Object;
.source "ThreadViewFragment.java"

# interfaces
.implements Lcom/facebook/zero/ui/k;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 389
    iput-object p1, p0, Lcom/facebook/orca/threadview/bt;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 392
    iget-object v0, p0, Lcom/facebook/orca/threadview/bt;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/ContactCardFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 393
    iget-object v0, p0, Lcom/facebook/orca/threadview/bt;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/ContactCardFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->O()V

    .line 395
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/bt;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->e(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 396
    iget-object v0, p0, Lcom/facebook/orca/threadview/bt;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->e(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a()V

    .line 398
    :cond_1
    return-void
.end method

.method public b(Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 402
    return-void
.end method
