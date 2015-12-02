.class public Lcom/facebook/orca/contacts/favorites/e;
.super Lcom/facebook/widget/f;
.source "AddFavoriteGroupItemView.java"


# instance fields
.field private final a:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

.field private final b:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

.field private final c:Landroid/view/View;

.field private final d:Lcom/facebook/widget/tiles/ThreadTileView;

.field private final e:Lcom/facebook/orca/common/ui/widgets/text/a;

.field private final f:Lcom/facebook/orca/photos/a/e;

.field private g:Lcom/facebook/orca/contacts/favorites/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 36
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/contacts/favorites/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 44
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    sget v0, Lcom/facebook/k;->orca_add_favorite_group_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/e;->setContentView(I)V

    .line 46
    sget v0, Lcom/facebook/i;->group_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/e;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/e;->a:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    .line 47
    sget v0, Lcom/facebook/i;->group_description:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/e;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/e;->b:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    .line 48
    sget v0, Lcom/facebook/i;->contact_group_tile_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/e;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/tiles/ThreadTileView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/e;->d:Lcom/facebook/widget/tiles/ThreadTileView;

    .line 49
    sget v0, Lcom/facebook/i;->add_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/e;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/e;->c:Landroid/view/View;

    .line 51
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 52
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/e;->e:Lcom/facebook/orca/common/ui/widgets/text/a;

    .line 54
    const-class v0, Lcom/facebook/orca/photos/a/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/a/e;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/e;->f:Lcom/facebook/orca/photos/a/e;

    .line 56
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/e;)Lcom/facebook/orca/contacts/favorites/g;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/e;->g:Lcom/facebook/orca/contacts/favorites/g;

    return-object v0
.end method

.method private a()V
    .locals 3

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/e;->g:Lcom/facebook/orca/contacts/favorites/g;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/g;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 69
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/e;->d:Lcom/facebook/widget/tiles/ThreadTileView;

    iget-object v2, p0, Lcom/facebook/orca/contacts/favorites/e;->f:Lcom/facebook/orca/photos/a/e;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/photos/a/e;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/widget/tiles/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/tiles/ThreadTileView;->setThreadTileViewData(Lcom/facebook/widget/tiles/j;)V

    .line 70
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/e;->e:Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/v;

    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/e;->a:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v1, v0}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setData(Ljava/lang/Object;)V

    .line 73
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/e;->b:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v1, v0}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setData(Ljava/lang/Object;)V

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/e;->c:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/contacts/favorites/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/f;-><init>(Lcom/facebook/orca/contacts/favorites/e;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    return-void
.end method


# virtual methods
.method public getContactRow()Lcom/facebook/orca/contacts/favorites/g;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/e;->g:Lcom/facebook/orca/contacts/favorites/g;

    return-object v0
.end method

.method public setGroupRow(Lcom/facebook/orca/contacts/favorites/g;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/e;->g:Lcom/facebook/orca/contacts/favorites/g;

    .line 64
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/e;->a()V

    .line 65
    return-void
.end method
