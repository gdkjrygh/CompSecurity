.class public Lcom/facebook/orca/threadview/dp;
.super Lcom/facebook/widget/d;
.source "TypingItemView.java"


# instance fields
.field private a:Lcom/facebook/user/tiles/UserTileView;

.field private b:Lcom/facebook/widget/text/BetterTextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;)V

    .line 26
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/dp;->a(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 40
    sget v0, Lcom/facebook/k;->orca_typing_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/dp;->setContentView(I)V

    .line 41
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/dp;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0, v2, v2, v2, v0}, Lcom/facebook/orca/threadview/dp;->setPadding(IIII)V

    .line 42
    sget v0, Lcom/facebook/i;->message_user_tile:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/dp;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/dp;->a:Lcom/facebook/user/tiles/UserTileView;

    .line 43
    sget v0, Lcom/facebook/i;->message_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/dp;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/text/BetterTextView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/dp;->b:Lcom/facebook/widget/text/BetterTextView;

    .line 44
    return-void
.end method


# virtual methods
.method public setTypingItem(Lcom/facebook/orca/threadview/ai;)V
    .locals 3

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/threadview/dp;->a:Lcom/facebook/user/tiles/UserTileView;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ai;->b()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 49
    iget-object v0, p0, Lcom/facebook/orca/threadview/dp;->b:Lcom/facebook/widget/text/BetterTextView;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/dp;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->presence_typing:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/text/BetterTextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    return-void
.end method
