.class public Lcom/qihoo/security/gamebooster/draglist/DeleteZone;
.super Landroid/widget/LinearLayout;
.source "360Security"


# instance fields
.field private a:I

.field private b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a:I

    .line 16
    return-void
.end method

.method private a(F)I
    .locals 2

    .prologue
    .line 84
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->getChildCount()I

    move-result v0

    .line 85
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->getMeasuredWidth()I

    move-result v1

    div-int v0, v1, v0

    .line 86
    int-to-float v0, v0

    div-float v0, p1, v0

    float-to-int v0, v0

    .line 87
    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 88
    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 89
    return v0
.end method

.method private b(F)Z
    .locals 1

    .prologue
    .line 93
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 108
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 109
    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 110
    invoke-virtual {v2, v1}, Landroid/view/View;->setPressed(Z)V

    .line 108
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {p0, v1}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->setVisibility(I)V

    .line 114
    return-void
.end method

.method public a(Landroid/view/View;FF)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    const/4 v2, -0x1

    .line 20
    invoke-direct {p0, p3}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b(F)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 21
    invoke-direct {p0, p2}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a(F)I

    move-result v0

    .line 22
    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 73
    :cond_0
    :goto_0
    return-void

    .line 26
    :cond_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setPressed(Z)V

    .line 29
    :cond_2
    invoke-direct {p0, p3}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b(F)Z

    move-result v0

    .line 30
    iget v1, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a:I

    if-ne v1, v2, :cond_3

    .line 31
    if-eqz v0, :cond_0

    .line 32
    invoke-direct {p0, p2}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a(F)I

    move-result v0

    .line 33
    if-eq v0, v2, :cond_0

    .line 36
    iput v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a:I

    .line 37
    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {v0, v3}, Landroid/view/View;->setPressed(Z)V

    .line 42
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    sget-object v1, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->In:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    invoke-interface {v0, v1, p1}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;->a(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;Landroid/view/View;)V

    goto :goto_0

    .line 47
    :cond_3
    if-eqz v0, :cond_5

    .line 48
    invoke-direct {p0, p2}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a(F)I

    move-result v0

    .line 49
    iget v1, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a:I

    if-eq v0, v1, :cond_0

    .line 52
    iget v1, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a:I

    invoke-virtual {p0, v1}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 53
    invoke-virtual {v1, v4}, Landroid/view/View;->setPressed(Z)V

    .line 54
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    if-eqz v1, :cond_4

    .line 55
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    sget-object v2, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->Out:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    invoke-interface {v1, v2, p1}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;->a(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;Landroid/view/View;)V

    .line 57
    :cond_4
    iput v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a:I

    .line 58
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a:I

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 59
    invoke-virtual {v0, v3}, Landroid/view/View;->setPressed(Z)V

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    sget-object v1, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->In:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    invoke-interface {v0, v1, p1}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;->a(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;Landroid/view/View;)V

    goto :goto_0

    .line 65
    :cond_5
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a:I

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 66
    invoke-virtual {v0, v4}, Landroid/view/View;->setPressed(Z)V

    .line 67
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    if-eqz v0, :cond_6

    .line 68
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    sget-object v1, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->Out:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    invoke-interface {v0, v1, p1}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;->a(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;Landroid/view/View;)V

    .line 70
    :cond_6
    iput v2, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a:I

    goto :goto_0
.end method

.method public b(Landroid/view/View;FF)I
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 97
    invoke-direct {p0, p3}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b(F)Z

    move-result v1

    .line 98
    if-eqz v1, :cond_0

    .line 99
    invoke-direct {p0, p2}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a(F)I

    move-result v0

    .line 104
    :goto_0
    return v0

    .line 102
    :cond_0
    iput v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a:I

    .line 103
    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->setVisibility(I)V

    goto :goto_0
.end method

.method public getAdapter()Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    return-object v0
.end method

.method public setAdapter(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    .line 81
    return-void
.end method
