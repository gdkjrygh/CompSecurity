.class public Lcom/facebook/contacts/contactslist/e;
.super Landroid/widget/BaseAdapter;
.source "ContactsListAdapter.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/contacts/contactslist/a;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/contacts/models/Contact;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 25
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/e;->c:Ljava/util/List;

    .line 28
    iput-object p1, p0, Lcom/facebook/contacts/contactslist/e;->a:Landroid/content/Context;

    .line 29
    new-instance v0, Lcom/facebook/contacts/contactslist/a;

    invoke-direct {v0}, Lcom/facebook/contacts/contactslist/a;-><init>()V

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/e;->b:Lcom/facebook/contacts/contactslist/a;

    .line 30
    return-void
.end method


# virtual methods
.method public a(Lcom/google/common/a/es;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/Contact;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/e;->b:Lcom/facebook/contacts/contactslist/a;

    invoke-static {v0}, Lcom/google/common/a/jq;->a(Ljava/util/Comparator;)Lcom/google/common/a/jq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/a/jq;->b(Ljava/lang/Iterable;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/e;->c:Ljava/util/List;

    .line 38
    invoke-virtual {p0}, Lcom/facebook/contacts/contactslist/e;->notifyDataSetChanged()V

    .line 39
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/e;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/e;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 53
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/e;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/Contact;

    .line 60
    if-nez p2, :cond_0

    .line 61
    new-instance p2, Lcom/facebook/contacts/contactslist/b;

    iget-object v1, p0, Lcom/facebook/contacts/contactslist/e;->a:Landroid/content/Context;

    invoke-direct {p2, v1}, Lcom/facebook/contacts/contactslist/b;-><init>(Landroid/content/Context;)V

    .line 65
    :goto_0
    invoke-virtual {p2, v0}, Lcom/facebook/contacts/contactslist/b;->setContact(Lcom/facebook/contacts/models/Contact;)V

    .line 66
    return-object p2

    .line 63
    :cond_0
    check-cast p2, Lcom/facebook/contacts/contactslist/b;

    goto :goto_0
.end method
