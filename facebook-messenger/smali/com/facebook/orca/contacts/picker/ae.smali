.class public Lcom/facebook/orca/contacts/picker/ae;
.super Ljava/lang/Object;
.source "ContactPickerHackListAdapter.java"

# interfaces
.implements Landroid/widget/Filterable;
.implements Landroid/widget/ListAdapter;
.implements Lcom/facebook/widget/a/k;


# instance fields
.field private final a:Lcom/facebook/contacts/picker/c;

.field private b:Z


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/picker/c;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    .line 30
    return-void
.end method

.method private a(Landroid/view/ViewParent;)V
    .locals 3

    .prologue
    .line 82
    const/4 v1, 0x0

    move-object v0, p1

    .line 83
    :goto_0
    if-eqz v0, :cond_2

    .line 84
    instance-of v2, v0, Landroid/widget/ListView;

    if-eqz v2, :cond_1

    .line 85
    check-cast v0, Landroid/widget/ListView;

    .line 90
    :goto_1
    if-eqz v0, :cond_0

    .line 91
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 92
    invoke-virtual {v0}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->transparent_drawable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 94
    :cond_0
    return-void

    .line 88
    :cond_1
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->areAllItemsEnabled()Z

    move-result v0

    return v0
.end method

.method public c()Lcom/facebook/widget/a/f;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->getCount()I

    move-result v0

    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    return-object v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/c;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/c;->getItemId(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/c;->getItemViewType(I)I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 74
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/picker/ae;->b:Z

    if-nez v0, :cond_0

    .line 75
    invoke-direct {p0, p3}, Lcom/facebook/orca/contacts/picker/ae;->a(Landroid/view/ViewParent;)V

    .line 76
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/picker/ae;->b:Z

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/contacts/picker/c;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->getViewTypeCount()I

    move-result v0

    return v0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->hasStableIds()Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public isEnabled(I)Z
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/c;->isEnabled(I)Z

    move-result v0

    return v0
.end method

.method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/c;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 45
    return-void
.end method

.method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ae;->a:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/c;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 50
    return-void
.end method
