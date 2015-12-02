.class public Lcom/facebook/orca/nux/NuxIntroView;
.super Lcom/facebook/orca/nux/e;
.source "NuxIntroView.java"


# instance fields
.field private d:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 23
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 35
    sget v0, Lcom/facebook/k;->orca_nux_intro:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxIntroView;->setContentView(I)V

    .line 36
    sget v0, Lcom/facebook/i;->nux_intro_next_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxIntroView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxIntroView;->d:Landroid/widget/Button;

    .line 37
    return-void
.end method

.method public setOnNextClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxIntroView;->d()V

    .line 41
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxIntroView;->d:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    return-void
.end method
