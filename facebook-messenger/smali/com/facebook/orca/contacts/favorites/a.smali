.class public Lcom/facebook/orca/contacts/favorites/a;
.super Lcom/facebook/widget/f;
.source "AddFavoriteContactItemView.java"


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Landroid/view/View;

.field private final c:Lcom/facebook/user/tiles/UserTileView;

.field private d:Lcom/facebook/orca/contacts/favorites/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 30
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/contacts/favorites/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    sget v0, Lcom/facebook/k;->orca_add_favorite_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/a;->setContentView(I)V

    .line 40
    sget v0, Lcom/facebook/i;->contact_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/a;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/a;->a:Landroid/widget/TextView;

    .line 41
    sget v0, Lcom/facebook/i;->contact_user_tile_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/a;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/a;->c:Lcom/facebook/user/tiles/UserTileView;

    .line 42
    sget v0, Lcom/facebook/i;->add_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/a;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/a;->b:Landroid/view/View;

    .line 43
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/a;)Lcom/facebook/orca/contacts/favorites/c;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/a;->d:Lcom/facebook/orca/contacts/favorites/c;

    return-object v0
.end method

.method private a()V
    .locals 3

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/a;->d:Lcom/facebook/orca/contacts/favorites/c;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/c;->a()Lcom/facebook/user/User;

    move-result-object v0

    .line 56
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/a;->c:Lcom/facebook/user/tiles/UserTileView;

    invoke-static {v0}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/User;)Lcom/facebook/user/tiles/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 57
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/a;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/facebook/user/User;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/a;->b:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/contacts/favorites/b;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/b;-><init>(Lcom/facebook/orca/contacts/favorites/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    return-void
.end method


# virtual methods
.method public getContactRow()Lcom/facebook/orca/contacts/favorites/c;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/a;->d:Lcom/facebook/orca/contacts/favorites/c;

    return-object v0
.end method

.method public setContactRow(Lcom/facebook/orca/contacts/favorites/c;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/a;->d:Lcom/facebook/orca/contacts/favorites/c;

    .line 51
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/a;->a()V

    .line 52
    return-void
.end method
