.class public Lcom/facebook/orca/contacts/favorites/w;
.super Lcom/facebook/orca/common/ui/widgets/e;
.source "FavoriteGroupItemView.java"


# instance fields
.field private b:Lcom/facebook/orca/contacts/favorites/y;

.field private c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

.field private d:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

.field private e:Landroid/view/View;

.field private f:Lcom/facebook/widget/tiles/ThreadTileView;

.field private g:Lcom/facebook/orca/common/ui/widgets/text/a;

.field private h:Lcom/facebook/orca/photos/a/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/widgets/e;-><init>(Landroid/content/Context;)V

    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/favorites/w;->a(Landroid/content/Context;)V

    .line 37
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/w;)Lcom/facebook/orca/contacts/favorites/y;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->b:Lcom/facebook/orca/contacts/favorites/y;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 50
    sget v0, Lcom/facebook/k;->orca_favorites_list_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/w;->setContentView(I)V

    .line 51
    sget v0, Lcom/facebook/i;->group_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/w;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    .line 52
    sget v0, Lcom/facebook/i;->group_description:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/w;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->d:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    .line 53
    sget v0, Lcom/facebook/i;->contact_group_tile_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/w;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/tiles/ThreadTileView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->f:Lcom/facebook/widget/tiles/ThreadTileView;

    .line 54
    sget v0, Lcom/facebook/i;->delete_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/w;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->e:Landroid/view/View;

    .line 55
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->e:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 57
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 58
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->g:Lcom/facebook/orca/common/ui/widgets/text/a;

    .line 60
    const-class v0, Lcom/facebook/orca/photos/a/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/a/e;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->h:Lcom/facebook/orca/photos/a/e;

    .line 62
    return-void
.end method

.method private b()V
    .locals 3

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->b:Lcom/facebook/orca/contacts/favorites/y;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/y;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/w;->f:Lcom/facebook/widget/tiles/ThreadTileView;

    iget-object v2, p0, Lcom/facebook/orca/contacts/favorites/w;->h:Lcom/facebook/orca/photos/a/e;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/photos/a/e;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/widget/tiles/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/tiles/ThreadTileView;->setThreadTileViewData(Lcom/facebook/widget/tiles/j;)V

    .line 76
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/w;->g:Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/v;

    move-result-object v0

    .line 78
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/w;->c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v1, v0}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setData(Ljava/lang/Object;)V

    .line 79
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/w;->d:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v1, v0}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setData(Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->e:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/contacts/favorites/x;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/x;-><init>(Lcom/facebook/orca/contacts/favorites/w;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    return-void
.end method


# virtual methods
.method public getGroupRow()Lcom/facebook/orca/contacts/favorites/y;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/w;->b:Lcom/facebook/orca/contacts/favorites/y;

    return-object v0
.end method

.method public getInnerRow()Landroid/view/View;
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/w;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public setGroupRow(Lcom/facebook/orca/contacts/favorites/y;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/w;->b:Lcom/facebook/orca/contacts/favorites/y;

    .line 70
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/w;->b()V

    .line 71
    return-void
.end method
