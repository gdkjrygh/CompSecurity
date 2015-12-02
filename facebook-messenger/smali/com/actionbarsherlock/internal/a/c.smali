.class Lcom/actionbarsherlock/internal/a/c;
.super Landroid/widget/ListView;
.source "IcsListPopupWindow.java"


# instance fields
.field private a:Z

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    .prologue
    .line 553
    const/4 v0, 0x0

    sget v1, Lcom/facebook/d;->dropDownListViewStyle:I

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 554
    iput-boolean p2, p0, Lcom/actionbarsherlock/internal/a/c;->b:Z

    .line 556
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/a/c;->setCacheColorHint(I)V

    .line 557
    return-void
.end method

.method static synthetic a(Lcom/actionbarsherlock/internal/a/c;Z)Z
    .locals 0

    .prologue
    .line 519
    iput-boolean p1, p0, Lcom/actionbarsherlock/internal/a/c;->a:Z

    return p1
.end method


# virtual methods
.method public hasFocus()Z
    .locals 1

    .prologue
    .line 588
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/a/c;->b:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasWindowFocus()Z
    .locals 1

    .prologue
    .line 578
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/a/c;->b:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isFocused()Z
    .locals 1

    .prologue
    .line 583
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/a/c;->b:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isInTouchMode()Z
    .locals 1

    .prologue
    .line 573
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/a/c;->b:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/a/c;->a:Z

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method
