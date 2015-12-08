.class final Lcom/roidapp/baselib/hlistview/i;
.super Landroid/support/v4/view/AccessibilityDelegateCompat;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/AbsHListView;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 0

    .prologue
    .line 1988
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1992
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 1994
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/view/View;)I

    move-result v1

    .line 1995
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->p()Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Landroid/widget/ListAdapter;

    .line 1997
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    if-nez v0, :cond_1

    .line 2022
    :cond_0
    :goto_0
    return-void

    .line 2001
    :cond_1
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2005
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->q()I

    move-result v0

    if-ne v1, v0, :cond_3

    .line 2006
    invoke-virtual {p2, v3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setSelected(Z)V

    .line 2007
    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 2012
    :goto_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2013
    const/16 v0, 0x10

    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 2014
    invoke-virtual {p2, v3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClickable(Z)V

    .line 2017
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isLongClickable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2018
    const/16 v0, 0x20

    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 2019
    invoke-virtual {p2, v3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setLongClickable(Z)V

    goto :goto_0

    .line 2009
    :cond_3
    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    goto :goto_1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 7

    .prologue
    const/4 v6, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2026
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 2074
    :goto_0
    return v0

    .line 2030
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/view/View;)I

    move-result v3

    .line 2031
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->p()Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Landroid/widget/ListAdapter;

    .line 2033
    if-eq v3, v6, :cond_1

    if-nez v0, :cond_2

    :cond_1
    move v0, v2

    .line 2035
    goto :goto_0

    .line 2038
    :cond_2
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v4}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isEnabled()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    move v0, v2

    .line 2040
    goto :goto_0

    .line 2043
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->k(I)J

    move-result-wide v4

    .line 2045
    sparse-switch p2, :sswitch_data_0

    move v0, v2

    .line 2074
    goto :goto_0

    .line 2047
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->q()I

    move-result v0

    if-ne v0, v3, :cond_5

    .line 2048
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, v6}, Lcom/roidapp/baselib/hlistview/AbsHListView;->i(I)V

    move v0, v1

    .line 2049
    goto :goto_0

    :cond_5
    move v0, v2

    .line 2052
    goto :goto_0

    .line 2054
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->q()I

    move-result v0

    if-eq v0, v3, :cond_6

    .line 2055
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->i(I)V

    move v0, v1

    .line 2056
    goto :goto_0

    :cond_6
    move v0, v2

    .line 2059
    goto :goto_0

    .line 2061
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2062
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, p1, v3, v4, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/view/View;IJ)Z

    move-result v0

    goto :goto_0

    :cond_7
    move v0, v2

    .line 2065
    goto :goto_0

    .line 2067
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isLongClickable()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2068
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/i;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, p1, v3, v4, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(Landroid/view/View;IJ)Z

    move-result v0

    goto :goto_0

    :cond_8
    move v0, v2

    .line 2071
    goto :goto_0

    .line 2045
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x8 -> :sswitch_0
        0x10 -> :sswitch_2
        0x20 -> :sswitch_3
    .end sparse-switch
.end method
