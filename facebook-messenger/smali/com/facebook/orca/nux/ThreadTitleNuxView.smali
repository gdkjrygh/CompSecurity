.class public Lcom/facebook/orca/nux/ThreadTitleNuxView;
.super Lcom/facebook/orca/nux/e;
.source "ThreadTitleNuxView.java"


# instance fields
.field private d:Landroid/widget/Button;

.field private e:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 33
    sget v0, Lcom/facebook/k;->orca_nux_thread_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/ThreadTitleNuxView;->setContentView(I)V

    .line 34
    sget v0, Lcom/facebook/i;->sms_nux_thread_more_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/ThreadTitleNuxView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/nux/ThreadTitleNuxView;->d:Landroid/widget/Button;

    .line 35
    sget v0, Lcom/facebook/i;->sms_nux_thread_okay_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/ThreadTitleNuxView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/nux/ThreadTitleNuxView;->e:Landroid/widget/Button;

    .line 36
    return-void
.end method

.method public setOnMoreClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/nux/ThreadTitleNuxView;->d:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    return-void
.end method

.method public setOnOkayClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/nux/ThreadTitleNuxView;->e:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    return-void
.end method
