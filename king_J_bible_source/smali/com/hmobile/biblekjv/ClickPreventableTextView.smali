.class public Lcom/hmobile/biblekjv/ClickPreventableTextView;
.super Landroid/widget/TextView;
.source "ClickPreventableTextView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private clickListener:Landroid/view/View$OnClickListener;

.field private ignoreSpannableClick:Z

.field private preventClick:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 18
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    return-void
.end method


# virtual methods
.method public ignoreSpannableClick()Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/ClickPreventableTextView;->ignoreSpannableClick:Z

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 64
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/ClickPreventableTextView;->preventClick:Z

    if-eqz v0, :cond_1

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/biblekjv/ClickPreventableTextView;->preventClick:Z

    .line 68
    :cond_0
    :goto_0
    return-void

    .line 66
    :cond_1
    iget-object v0, p0, Lcom/hmobile/biblekjv/ClickPreventableTextView;->clickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/hmobile/biblekjv/ClickPreventableTextView;->clickListener:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 31
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 32
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object v2

    .line 33
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    check-cast v1, Landroid/text/Spannable;

    invoke-interface {v2, p0, v1, p1}, Landroid/text/method/MovementMethod;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    .line 34
    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/ClickPreventableTextView;->ignoreSpannableClick:Z

    .line 35
    invoke-super {p0, p1}, Landroid/widget/TextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 36
    .local v0, "ret":Z
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/ClickPreventableTextView;->ignoreSpannableClick:Z

    .line 37
    return v0
.end method

.method public preventNextClick()V
    .locals 1

    .prologue
    .line 53
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/biblekjv/ClickPreventableTextView;->preventClick:Z

    .line 54
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1, "listener"    # Landroid/view/View$OnClickListener;

    .prologue
    .line 58
    iput-object p1, p0, Lcom/hmobile/biblekjv/ClickPreventableTextView;->clickListener:Landroid/view/View$OnClickListener;

    .line 59
    invoke-super {p0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    return-void
.end method
