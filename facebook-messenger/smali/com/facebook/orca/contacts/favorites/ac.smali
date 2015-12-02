.class public Lcom/facebook/orca/contacts/favorites/ac;
.super Lcom/facebook/contacts/picker/as;
.source "FavoritesEditPickerView.java"


# instance fields
.field private a:Landroid/widget/Button;

.field private b:Landroid/widget/Button;

.field private c:Lcom/facebook/orca/contacts/favorites/af;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/contacts/picker/c;)V
    .locals 1

    .prologue
    .line 36
    sget v0, Lcom/facebook/k;->orca_contact_picker_view_for_favorites:I

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/picker/as;-><init>(Landroid/content/Context;Lcom/facebook/contacts/picker/c;I)V

    .line 37
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/ac;->f()V

    .line 38
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/ac;)Lcom/facebook/orca/contacts/favorites/af;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ac;->c:Lcom/facebook/orca/contacts/favorites/af;

    return-object v0
.end method


# virtual methods
.method protected a(Lcom/facebook/contacts/picker/ar;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 67
    invoke-super {p0, p1}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/ar;)V

    .line 68
    sget-object v0, Lcom/facebook/contacts/picker/ar;->NONE:Lcom/facebook/contacts/picker/ar;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/facebook/contacts/picker/ar;->UNFILTERED:Lcom/facebook/contacts/picker/ar;

    if-ne p1, v0, :cond_1

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ac;->a:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ac;->b:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 76
    :goto_0
    return-void

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ac;->a:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ac;->b:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0
.end method

.method protected f()V
    .locals 2

    .prologue
    .line 41
    sget v0, Lcom/facebook/i;->edit_favorites_done_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/ac;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/ac;->a:Landroid/widget/Button;

    .line 42
    sget v0, Lcom/facebook/i;->edit_favorites_cancel_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/ac;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/ac;->b:Landroid/widget/Button;

    .line 44
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ac;->a:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/contacts/favorites/ad;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/ad;-><init>(Lcom/facebook/orca/contacts/favorites/ac;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ac;->b:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/contacts/favorites/ae;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/ae;-><init>(Lcom/facebook/orca/contacts/favorites/ac;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    return-void
.end method

.method public getDraggableList()Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;
    .locals 1

    .prologue
    .line 79
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/ac;->getListView()Landroid/widget/ListView;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;

    return-object v0
.end method

.method public setOnDoneClickedListener(Lcom/facebook/orca/contacts/favorites/af;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/ac;->c:Lcom/facebook/orca/contacts/favorites/af;

    .line 84
    return-void
.end method
