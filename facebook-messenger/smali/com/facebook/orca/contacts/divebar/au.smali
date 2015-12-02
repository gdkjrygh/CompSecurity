.class public Lcom/facebook/orca/contacts/divebar/au;
.super Lcom/facebook/contacts/picker/b;
.source "DivebarNearbyFriendsListAdapter.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/contacts/picker/b;-><init>()V

    .line 24
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/au;->b:Lcom/google/common/a/es;

    .line 27
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/au;->a:Landroid/content/Context;

    .line 28
    return-void
.end method


# virtual methods
.method public a(I)Lcom/facebook/contacts/picker/ag;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/au;->b:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ag;

    return-object v0
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/au;->b:Lcom/google/common/a/es;

    .line 33
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/au;->notifyDataSetChanged()V

    .line 34
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/au;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 20
    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/divebar/au;->a(I)Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 59
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 38
    check-cast p2, Lcom/facebook/orca/contacts/picker/ao;

    .line 39
    if-nez p2, :cond_0

    .line 40
    new-instance p2, Lcom/facebook/orca/contacts/picker/ao;

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/au;->a:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/picker/ao;-><init>(Landroid/content/Context;)V

    .line 41
    sget-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/ao;->setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 43
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/divebar/au;->a(I)Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/ao;->setContactRow(Lcom/facebook/contacts/picker/ag;)V

    .line 44
    return-object p2
.end method
