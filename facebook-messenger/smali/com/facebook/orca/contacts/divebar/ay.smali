.class public Lcom/facebook/orca/contacts/divebar/ay;
.super Lcom/facebook/widget/f;
.source "DivebarNearbyFriendsRowView.java"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

.field private c:Lcom/facebook/orca/contacts/divebar/bb;

.field private d:Lcom/facebook/orca/contacts/divebar/av;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/contacts/divebar/ay;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/contacts/divebar/ay;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    sget v0, Lcom/facebook/k;->orca_divebar_nearby_friends_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/ay;->setContentView(I)V

    .line 49
    sget v0, Lcom/facebook/i;->divebar_nearby_friends_row_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/ay;->getViewRequired(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ay;->a:Landroid/widget/TextView;

    .line 50
    sget v0, Lcom/facebook/i;->divebar_nearby_friends_row_subtitle:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/ay;->getViewRequired(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ay;->b:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    .line 52
    new-instance v0, Lcom/facebook/orca/contacts/divebar/az;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/divebar/az;-><init>(Lcom/facebook/orca/contacts/divebar/ay;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/ay;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/ay;)Lcom/facebook/orca/contacts/divebar/bb;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ay;->c:Lcom/facebook/orca/contacts/divebar/bb;

    return-object v0
.end method

.method private a()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ay;->d:Lcom/facebook/orca/contacts/divebar/av;

    iget v0, v0, Lcom/facebook/orca/contacts/divebar/av;->c:I

    .line 75
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ay;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 76
    sget v2, Lcom/facebook/m;->divebar_nearby_friends_row_title:I

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 77
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/ay;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ay;->d:Lcom/facebook/orca/contacts/divebar/av;

    iget-object v0, v0, Lcom/facebook/orca/contacts/divebar/av;->a:Lcom/facebook/orca/contacts/divebar/aw;

    sget-object v2, Lcom/facebook/orca/contacts/divebar/aw;->LIST:Lcom/facebook/orca/contacts/divebar/aw;

    if-ne v0, v2, :cond_0

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ay;->d:Lcom/facebook/orca/contacts/divebar/av;

    iget-object v0, v0, Lcom/facebook/orca/contacts/divebar/av;->b:Lcom/google/common/a/es;

    new-instance v1, Lcom/facebook/orca/contacts/divebar/ba;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/ba;-><init>(Lcom/facebook/orca/contacts/divebar/ay;)V

    invoke-static {v0, v1}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v1

    .line 89
    new-instance v0, Lcom/facebook/messages/threads/ui/name/g;

    invoke-direct {v0, v5, v7, v1}, Lcom/facebook/messages/threads/ui/name/g;-><init>(ZLjava/lang/String;Lcom/google/common/a/es;)V

    .line 94
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ay;->b:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v1, v0}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setData(Ljava/lang/Object;)V

    .line 95
    return-void

    .line 91
    :cond_0
    sget v0, Lcom/facebook/o;->divebar_nearby_friends_row_subtitle_upsell:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 92
    new-instance v0, Lcom/facebook/messages/threads/ui/name/g;

    invoke-direct {v0, v6, v1, v7}, Lcom/facebook/messages/threads/ui/name/g;-><init>(ZLjava/lang/String;Lcom/google/common/a/es;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/divebar/ay;)Lcom/facebook/orca/contacts/divebar/av;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ay;->d:Lcom/facebook/orca/contacts/divebar/av;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/contacts/divebar/av;)Lcom/facebook/orca/contacts/divebar/ay;
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ay;->d:Lcom/facebook/orca/contacts/divebar/av;

    .line 69
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ay;->a()V

    .line 70
    return-object p0
.end method

.method public a(Lcom/facebook/orca/contacts/divebar/bb;)Lcom/facebook/orca/contacts/divebar/ay;
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ay;->c:Lcom/facebook/orca/contacts/divebar/bb;

    .line 64
    return-object p0
.end method
