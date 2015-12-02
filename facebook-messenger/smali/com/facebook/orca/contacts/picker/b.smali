.class Lcom/facebook/orca/contacts/picker/b;
.super Ljava/lang/Object;
.source "ContactMultipickerFragment.java"

# interfaces
.implements Lcom/facebook/orca/contacts/picker/z;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/b;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .prologue
    .line 136
    if-eqz p1, :cond_0

    .line 137
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/b;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->O()V

    .line 142
    :goto_0
    return-void

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/b;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->P()V

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/b;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->d()V

    goto :goto_0
.end method
