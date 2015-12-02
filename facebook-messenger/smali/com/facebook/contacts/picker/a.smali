.class public abstract Lcom/facebook/contacts/picker/a;
.super Lcom/facebook/widget/a/a;
.source "AbstractContactPickerListFilter.java"

# interfaces
.implements Lcom/facebook/contacts/picker/u;


# instance fields
.field protected a:Lcom/facebook/contacts/picker/v;

.field private b:Lcom/facebook/contacts/picker/w;

.field private c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/user/UserIdentifierKey;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/widget/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/picker/v;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/contacts/picker/a;->a:Lcom/facebook/contacts/picker/v;

    .line 44
    return-void
.end method

.method public a(Lcom/facebook/contacts/picker/w;)V
    .locals 1

    .prologue
    .line 26
    iput-object p1, p0, Lcom/facebook/contacts/picker/a;->b:Lcom/facebook/contacts/picker/w;

    .line 27
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/a;->c:Ljava/util/Set;

    .line 28
    return-void
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserIdentifierKey;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/contacts/picker/a;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 34
    if-eqz p1, :cond_0

    .line 35
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserIdentifierKey;

    .line 36
    iget-object v2, p0, Lcom/facebook/contacts/picker/a;->c:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method protected a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/i;)V
    .locals 2

    .prologue
    .line 50
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p2, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    iget-object v0, p2, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    check-cast v0, Lcom/facebook/contacts/picker/l;

    .line 53
    iget-object v1, p0, Lcom/facebook/contacts/picker/a;->b:Lcom/facebook/contacts/picker/w;

    invoke-interface {v1, p1, v0}, Lcom/facebook/contacts/picker/w;->a(Ljava/lang/CharSequence;Lcom/facebook/contacts/picker/l;)V

    .line 54
    return-void
.end method

.method protected a(Lcom/facebook/user/UserIdentifierKey;)Z
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/contacts/picker/a;->c:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 58
    const/4 v0, 0x0

    .line 61
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/picker/a;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method
