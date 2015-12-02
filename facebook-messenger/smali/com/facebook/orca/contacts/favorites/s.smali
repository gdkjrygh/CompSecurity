.class public Lcom/facebook/orca/contacts/favorites/s;
.super Lcom/facebook/orca/common/ui/widgets/e;
.source "FavoriteContactItemView.java"


# instance fields
.field private b:Lcom/facebook/orca/contacts/favorites/u;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/view/View;

.field private e:Lcom/facebook/user/tiles/UserTileView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/widgets/e;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/favorites/s;->a(Landroid/content/Context;)V

    .line 31
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/s;)Lcom/facebook/orca/contacts/favorites/u;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/s;->b:Lcom/facebook/orca/contacts/favorites/u;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 44
    sget v0, Lcom/facebook/k;->orca_favorites_list_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/s;->setContentView(I)V

    .line 45
    sget v0, Lcom/facebook/i;->contact_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/s;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/s;->c:Landroid/widget/TextView;

    .line 46
    sget v0, Lcom/facebook/i;->contact_user_tile_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/s;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/s;->e:Lcom/facebook/user/tiles/UserTileView;

    .line 47
    sget v0, Lcom/facebook/i;->delete_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/s;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/s;->d:Landroid/view/View;

    .line 48
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/s;->d:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 49
    return-void
.end method

.method private b()V
    .locals 3

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/s;->b:Lcom/facebook/orca/contacts/favorites/u;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/u;->a()Lcom/facebook/user/User;

    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/s;->e:Lcom/facebook/user/tiles/UserTileView;

    invoke-static {v0}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/User;)Lcom/facebook/user/tiles/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 63
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/s;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/facebook/user/User;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/s;->d:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/contacts/favorites/t;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/t;-><init>(Lcom/facebook/orca/contacts/favorites/s;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    return-void
.end method


# virtual methods
.method public getContactRow()Lcom/facebook/orca/contacts/favorites/u;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/s;->b:Lcom/facebook/orca/contacts/favorites/u;

    return-object v0
.end method

.method public getInnerRow()Landroid/view/View;
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/s;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public setContactRow(Lcom/facebook/orca/contacts/favorites/u;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/s;->b:Lcom/facebook/orca/contacts/favorites/u;

    .line 57
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/s;->b()V

    .line 58
    return-void
.end method
