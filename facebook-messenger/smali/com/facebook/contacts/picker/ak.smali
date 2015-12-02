.class public Lcom/facebook/contacts/picker/ak;
.super Lcom/facebook/widget/f;
.source "ContactPickerView.java"


# static fields
.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field protected a:Landroid/widget/ListView;

.field private c:Lcom/facebook/contacts/picker/aq;

.field private d:Lcom/facebook/contacts/picker/ap;

.field private e:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private f:Lcom/facebook/contacts/picker/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/facebook/contacts/picker/ak;

    sput-object v0, Lcom/facebook/contacts/picker/ak;->b:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/contacts/picker/b;I)V
    .locals 2

    .prologue
    .line 70
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 71
    invoke-virtual {p0, p3}, Lcom/facebook/contacts/picker/ak;->setContentView(I)V

    .line 73
    iput-object p2, p0, Lcom/facebook/contacts/picker/ak;->f:Lcom/facebook/contacts/picker/b;

    .line 75
    sget v0, Lcom/facebook/i;->friends_list:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/ak;->getViewRequired(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/facebook/contacts/picker/ak;->a:Landroid/widget/ListView;

    .line 76
    sget v0, Lcom/facebook/i;->friends_list_empty_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/picker/ak;->getViewRequired(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/contacts/picker/ak;->e:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 78
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->a:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 79
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->a:Landroid/widget/ListView;

    instance-of v0, v0, Lcom/facebook/widget/listview/BetterListView;

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->a:Landroid/widget/ListView;

    check-cast v0, Lcom/facebook/widget/listview/BetterListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setBroadcastInteractionChanges(Z)V

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->a:Landroid/widget/ListView;

    new-instance v1, Lcom/facebook/contacts/picker/al;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/picker/al;-><init>(Lcom/facebook/contacts/picker/ak;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 97
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->a:Landroid/widget/ListView;

    new-instance v1, Lcom/facebook/contacts/picker/am;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/picker/am;-><init>(Lcom/facebook/contacts/picker/ak;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 105
    return-void
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->f:Lcom/facebook/contacts/picker/b;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/b;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ad;

    .line 152
    iget-object v1, p0, Lcom/facebook/contacts/picker/ak;->c:Lcom/facebook/contacts/picker/aq;

    if-eqz v1, :cond_0

    .line 153
    iget-object v1, p0, Lcom/facebook/contacts/picker/ak;->c:Lcom/facebook/contacts/picker/aq;

    invoke-interface {v1, v0, p1}, Lcom/facebook/contacts/picker/aq;->a(Lcom/facebook/contacts/picker/ad;I)V

    .line 155
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/picker/ak;I)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lcom/facebook/contacts/picker/ak;->b(I)V

    return-void
.end method

.method private b(I)V
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->d:Lcom/facebook/contacts/picker/ap;

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->d:Lcom/facebook/contacts/picker/ap;

    invoke-interface {v0, p1}, Lcom/facebook/contacts/picker/ap;->a(I)V

    .line 161
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/facebook/contacts/picker/ak;I)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lcom/facebook/contacts/picker/ak;->a(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->e:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 127
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->e:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 128
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->e:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v1, Lcom/facebook/o;->contact_picker_no_results:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(I)V

    .line 129
    return-void
.end method

.method public a(Lcom/facebook/contacts/picker/ao;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 132
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    sget-object v0, Lcom/facebook/contacts/picker/an;->a:[I

    invoke-virtual {p1}, Lcom/facebook/contacts/picker/ao;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 143
    :goto_0
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->e:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 144
    return-void

    .line 135
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->e:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v1, Lcom/facebook/o;->contacts_loading:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(I)V

    .line 136
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->e:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    goto :goto_0

    .line 139
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->e:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v1, Lcom/facebook/o;->contact_picker_no_results:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(I)V

    .line 140
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->e:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    goto :goto_0

    .line 133
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 1
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
    .line 121
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->f:Lcom/facebook/contacts/picker/b;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/b;->a(Lcom/google/common/a/es;)V

    .line 122
    invoke-virtual {p0}, Lcom/facebook/contacts/picker/ak;->a()V

    .line 123
    return-void
.end method

.method public getListView()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/contacts/picker/ak;->a:Landroid/widget/ListView;

    return-object v0
.end method

.method public setOnContactListScrollListener(Lcom/facebook/contacts/picker/ap;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/facebook/contacts/picker/ak;->d:Lcom/facebook/contacts/picker/ap;

    .line 113
    return-void
.end method

.method public setOnRowClickedListener(Lcom/facebook/contacts/picker/aq;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/contacts/picker/ak;->c:Lcom/facebook/contacts/picker/aq;

    .line 109
    return-void
.end method
