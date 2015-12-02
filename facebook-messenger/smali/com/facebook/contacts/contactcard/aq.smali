.class Lcom/facebook/contacts/contactcard/aq;
.super Landroid/widget/ArrayAdapter;
.source "HiddenEntryPickerActivity.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/facebook/contacts/models/entry/Entry;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/entry/Entry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;Landroid/content/Context;Lcom/google/common/a/es;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/entry/Entry;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/aq;->a:Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;

    .line 48
    sget v0, Lcom/facebook/k;->orca_quick_action_menu_item:I

    invoke-direct {p0, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 49
    iput-object p2, p0, Lcom/facebook/contacts/contactcard/aq;->b:Landroid/content/Context;

    .line 50
    iput-object p3, p0, Lcom/facebook/contacts/contactcard/aq;->c:Lcom/google/common/a/es;

    .line 51
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 56
    if-nez p2, :cond_0

    .line 57
    new-instance p2, Lcom/facebook/contacts/contactcard/ao;

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/aq;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/contacts/contactcard/ao;-><init>(Landroid/content/Context;)V

    .line 61
    :goto_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/aq;->c:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/entry/Entry;

    invoke-virtual {p2, v0}, Lcom/facebook/contacts/contactcard/ao;->setEntry(Lcom/facebook/contacts/models/entry/Entry;)V

    .line 62
    return-object p2

    .line 59
    :cond_0
    check-cast p2, Lcom/facebook/contacts/contactcard/ao;

    goto :goto_0
.end method
