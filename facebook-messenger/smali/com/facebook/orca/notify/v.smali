.class public Lcom/facebook/orca/notify/v;
.super Lcom/facebook/widget/f;
.source "InAppNotificationView.java"


# static fields
.field private static final a:Ljava/util/regex/Pattern;


# instance fields
.field private b:Lcom/facebook/user/tiles/UserTileView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageButton;

.field private f:Lcom/facebook/messages/model/threads/Message;

.field private final g:Landroid/content/Context;

.field private final h:Lcom/facebook/orca/emoji/z;

.field private final i:Lcom/facebook/orca/threads/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-string v0, "\\n+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/notify/v;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/emoji/z;Lcom/facebook/orca/threads/r;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 46
    iput-object p1, p0, Lcom/facebook/orca/notify/v;->g:Landroid/content/Context;

    .line 47
    iput-object p2, p0, Lcom/facebook/orca/notify/v;->h:Lcom/facebook/orca/emoji/z;

    .line 48
    iput-object p3, p0, Lcom/facebook/orca/notify/v;->i:Lcom/facebook/orca/threads/r;

    .line 49
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/v;->a(Landroid/content/Context;)V

    .line 50
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/orca/notify/v;->i:Lcom/facebook/orca/threads/r;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/r;->a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;

    move-result-object v0

    .line 84
    if-nez v0, :cond_1

    .line 85
    const-string v0, ""

    .line 92
    :cond_0
    :goto_0
    return-object v0

    .line 88
    :cond_1
    sget-object v1, Lcom/facebook/orca/notify/v;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 89
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 90
    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 53
    sget v0, Lcom/facebook/k;->orca_in_app_notification:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/notify/v;->setContentView(I)V

    .line 55
    sget v0, Lcom/facebook/i;->notification_user_tile:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/notify/v;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/orca/notify/v;->b:Lcom/facebook/user/tiles/UserTileView;

    .line 56
    sget v0, Lcom/facebook/i;->notification_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/notify/v;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/notify/v;->c:Landroid/widget/TextView;

    .line 57
    sget v0, Lcom/facebook/i;->notification_snippet:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/notify/v;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/notify/v;->d:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/facebook/i;->notification_dismiss_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/notify/v;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/notify/v;->e:Landroid/widget/ImageButton;

    .line 59
    return-void
.end method


# virtual methods
.method public getMessage()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/notify/v;->f:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public setMessage(Lcom/facebook/messages/model/threads/Message;)V
    .locals 3

    .prologue
    .line 62
    iput-object p1, p0, Lcom/facebook/orca/notify/v;->f:Lcom/facebook/messages/model/threads/Message;

    .line 63
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 64
    if-eqz v0, :cond_0

    .line 65
    iget-object v1, p0, Lcom/facebook/orca/notify/v;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    iget-object v1, p0, Lcom/facebook/orca/notify/v;->b:Lcom/facebook/user/tiles/UserTileView;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 71
    :goto_0
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/v;->a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 72
    iget-object v1, p0, Lcom/facebook/orca/notify/v;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/g;->in_app_notification_font_size_dp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 74
    iget-object v2, p0, Lcom/facebook/orca/notify/v;->h:Lcom/facebook/orca/emoji/z;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/emoji/z;->a(Landroid/text/Spannable;I)V

    .line 75
    iget-object v1, p0, Lcom/facebook/orca/notify/v;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    return-void

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/v;->c:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object v0, p0, Lcom/facebook/orca/notify/v;->b:Lcom/facebook/user/tiles/UserTileView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    goto :goto_0
.end method

.method public setOnDismissListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/orca/notify/v;->e:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    return-void
.end method
