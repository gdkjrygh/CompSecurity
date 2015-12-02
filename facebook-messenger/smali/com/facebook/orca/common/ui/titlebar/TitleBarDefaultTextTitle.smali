.class public Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;
.super Lcom/facebook/widget/f;
.source "TitleBarDefaultTextTitle.java"


# instance fields
.field private a:Lcom/facebook/widget/text/SimpleVariableTextLayoutView;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/ProgressBar;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 26
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->a()V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->a()V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->a()V

    .line 37
    return-void
.end method

.method private a()V
    .locals 1

    .prologue
    .line 40
    sget v0, Lcom/facebook/k;->orca_titlebar_default_text_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setContentView(I)V

    .line 42
    sget v0, Lcom/facebook/i;->titlebar_progress_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->b:Landroid/view/View;

    .line 43
    sget v0, Lcom/facebook/i;->titlebar_progress:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->c:Landroid/widget/ProgressBar;

    .line 44
    sget v0, Lcom/facebook/i;->titlebar_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/text/SimpleVariableTextLayoutView;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->a:Lcom/facebook/widget/text/SimpleVariableTextLayoutView;

    .line 45
    return-void
.end method


# virtual methods
.method public setProgressBarVisibility(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x4

    .line 64
    if-nez p1, :cond_0

    .line 65
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->b:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->c:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 73
    :goto_0
    return-void

    .line 67
    :cond_0
    if-ne p1, v1, :cond_1

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 69
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->c:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->a:Lcom/facebook/widget/text/SimpleVariableTextLayoutView;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/text/SimpleVariableTextLayoutView;->setText(Ljava/lang/String;)V

    .line 55
    return-void
.end method
