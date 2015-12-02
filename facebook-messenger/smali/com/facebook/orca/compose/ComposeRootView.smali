.class public Lcom/facebook/orca/compose/ComposeRootView;
.super Landroid/widget/RelativeLayout;
.source "ComposeRootView.java"


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/view/View;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Landroid/view/TouchDelegate;

.field private f:Landroid/view/TouchDelegate;

.field private g:Landroid/view/View$OnKeyListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    return-void
.end method

.method private a(II)V
    .locals 6

    .prologue
    const/4 v2, 0x5

    .line 61
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->b:Landroid/view/View;

    invoke-static {v0, p1, p2, v2}, Lcom/facebook/widget/f/d;->a(Landroid/view/View;III)Landroid/view/TouchDelegate;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->e:Landroid/view/TouchDelegate;

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->c:Landroid/view/View;

    const/16 v1, 0x23

    invoke-static {v0, p1, p2, v1}, Lcom/facebook/widget/f/d;->a(Landroid/view/View;III)Landroid/view/TouchDelegate;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->f:Landroid/view/TouchDelegate;

    .line 71
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->a:Landroid/view/View;

    invoke-static {v0, v2}, Lcom/facebook/widget/f/d;->a(Landroid/view/View;I)Landroid/view/TouchDelegate;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeRootView;->d:Landroid/view/View;

    invoke-static {v1, p1, p2}, Lcom/facebook/widget/f/d;->a(Landroid/view/View;II)Landroid/view/TouchDelegate;

    move-result-object v1

    .line 78
    new-instance v2, Lcom/facebook/common/t/a/a;

    const/4 v3, 0x4

    new-array v3, v3, [Landroid/view/TouchDelegate;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/orca/compose/ComposeRootView;->e:Landroid/view/TouchDelegate;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    iget-object v5, p0, Lcom/facebook/orca/compose/ComposeRootView;->f:Landroid/view/TouchDelegate;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    aput-object v0, v3, v4

    const/4 v0, 0x3

    aput-object v1, v3, v0

    invoke-direct {v2, p0, v3}, Lcom/facebook/common/t/a/a;-><init>(Landroid/view/View;[Landroid/view/TouchDelegate;)V

    .line 84
    invoke-virtual {p0, v2}, Lcom/facebook/orca/compose/ComposeRootView;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 85
    return-void
.end method


# virtual methods
.method public dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 106
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->g:Landroid/view/View$OnKeyListener;

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->g:Landroid/view/View$OnKeyListener;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    invoke-interface {v0, p0, v1, p1}, Landroid/view/View$OnKeyListener;->onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result v0

    .line 110
    if-eqz v0, :cond_0

    .line 111
    const/4 v0, 0x1

    .line 116
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public getEmojiAttachmentTouchDelegate()Landroid/view/TouchDelegate;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->e:Landroid/view/TouchDelegate;

    return-object v0
.end method

.method public getStickerTouchDelegate()Landroid/view/TouchDelegate;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->f:Landroid/view/TouchDelegate;

    return-object v0
.end method

.method protected onFinishInflate()V
    .locals 1

    .prologue
    .line 43
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 45
    sget v0, Lcom/facebook/i;->compose_emoji_attachments:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeRootView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->b:Landroid/view/View;

    .line 46
    sget v0, Lcom/facebook/i;->compose_button_stickers:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeRootView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->c:Landroid/view/View;

    .line 47
    sget v0, Lcom/facebook/i;->compose_button_send:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeRootView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->a:Landroid/view/View;

    .line 48
    sget v0, Lcom/facebook/i;->compose_edit_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeRootView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeRootView;->d:Landroid/view/View;

    .line 49
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .prologue
    .line 53
    invoke-super/range {p0 .. p5}, Landroid/widget/RelativeLayout;->onLayout(ZIIII)V

    .line 55
    if-eqz p1, :cond_0

    .line 56
    invoke-direct {p0, p3, p5}, Lcom/facebook/orca/compose/ComposeRootView;->a(II)V

    .line 58
    :cond_0
    return-void
.end method

.method public setPreImeKeyListener(Landroid/view/View$OnKeyListener;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeRootView;->g:Landroid/view/View$OnKeyListener;

    .line 102
    return-void
.end method
