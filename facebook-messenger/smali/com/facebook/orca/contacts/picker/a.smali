.class Lcom/facebook/orca/contacts/picker/a;
.super Ljava/lang/Object;
.source "ContactMultipickerFragment.java"

# interfaces
.implements Lcom/facebook/contacts/picker/v;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/a;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/facebook/contacts/picker/ad;
    .locals 3

    .prologue
    .line 115
    instance-of v0, p1, Lcom/facebook/user/UserWithIdentifier;

    if-nez v0, :cond_0

    .line 116
    invoke-static {}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->R()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected rowData of type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 117
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 119
    :cond_0
    check-cast p1, Lcom/facebook/user/UserWithIdentifier;

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/a;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/a;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)Lcom/facebook/orca/contacts/picker/az;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/picker/ah;->AUTO_COMPLETE:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/contacts/picker/az;->b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    .line 126
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/a;->a:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)Lcom/facebook/orca/contacts/picker/az;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/picker/ah;->AUTO_COMPLETE:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/contacts/picker/az;->a(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    goto :goto_0
.end method
