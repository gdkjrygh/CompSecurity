.class Lcom/facebook/orca/threadview/b;
.super Ljava/lang/Object;
.source "AddMembersActivity.java"

# interfaces
.implements Lcom/facebook/contacts/picker/v;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/AddMembersActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/AddMembersActivity;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/facebook/orca/threadview/b;->a:Lcom/facebook/orca/threadview/AddMembersActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/facebook/contacts/picker/ad;
    .locals 3

    .prologue
    .line 120
    instance-of v0, p1, Lcom/facebook/user/UserWithIdentifier;

    if-nez v0, :cond_0

    .line 121
    invoke-static {}, Lcom/facebook/orca/threadview/AddMembersActivity;->j()Ljava/lang/Class;

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

    .line 122
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 124
    :cond_0
    check-cast p1, Lcom/facebook/user/UserWithIdentifier;

    .line 126
    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v0

    .line 127
    iget-object v1, p0, Lcom/facebook/orca/threadview/b;->a:Lcom/facebook/orca/threadview/AddMembersActivity;

    invoke-static {v1}, Lcom/facebook/orca/threadview/AddMembersActivity;->b(Lcom/facebook/orca/threadview/AddMembersActivity;)Lcom/facebook/l/k;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/l/k;->a(Lcom/facebook/user/UserKey;)Z

    move-result v0

    .line 129
    new-instance v1, Lcom/facebook/contacts/picker/aj;

    invoke-direct {v1}, Lcom/facebook/contacts/picker/aj;-><init>()V

    invoke-virtual {v1, p1}, Lcom/facebook/contacts/picker/aj;->a(Lcom/facebook/user/UserWithIdentifier;)Lcom/facebook/contacts/picker/aj;

    move-result-object v1

    sget-object v2, Lcom/facebook/contacts/picker/ai;->TWO_LINE:Lcom/facebook/contacts/picker/ai;

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/picker/aj;->a(Lcom/facebook/contacts/picker/ai;)Lcom/facebook/contacts/picker/aj;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/contacts/picker/aj;->a(Z)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/aj;->c(Z)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/aj;->a()Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    .line 136
    return-object v0
.end method
