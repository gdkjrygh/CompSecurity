.class public final Lkik/android/chat/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field private a:Lkik/android/chat/al;

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>(Lkik/android/chat/al;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput v0, p0, Lkik/android/chat/am;->b:I

    .line 15
    iput v0, p0, Lkik/android/chat/am;->c:I

    .line 19
    iput-object p1, p0, Lkik/android/chat/am;->a:Lkik/android/chat/al;

    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 24
    iput v0, p0, Lkik/android/chat/am;->b:I

    .line 25
    iput v0, p0, Lkik/android/chat/am;->c:I

    .line 26
    return-void
.end method

.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 4

    .prologue
    .line 38
    if-nez p1, :cond_0

    .line 96
    :goto_0
    return-void

    .line 45
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 46
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    if-gez v0, :cond_8

    .line 47
    add-int/lit8 v0, p2, 0x1

    .line 50
    :goto_1
    add-int v1, p2, p3

    .line 51
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p1, v2}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 52
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {p1}, Landroid/widget/AbsListView;->getHeight()I

    move-result v3

    if-le v2, v3, :cond_1

    .line 53
    add-int/lit8 v1, v1, -0x1

    .line 56
    :cond_1
    iget v2, p0, Lkik/android/chat/am;->b:I

    if-ne v2, v0, :cond_2

    iget v2, p0, Lkik/android/chat/am;->c:I

    if-eq v2, v1, :cond_7

    .line 57
    :cond_2
    iget v2, p0, Lkik/android/chat/am;->b:I

    if-lez v2, :cond_6

    iget v2, p0, Lkik/android/chat/am;->c:I

    if-lez v2, :cond_6

    .line 59
    iget v2, p0, Lkik/android/chat/am;->b:I

    if-le v0, v2, :cond_3

    .line 61
    iget v2, p0, Lkik/android/chat/am;->b:I

    :goto_2
    if-ge v2, v0, :cond_4

    .line 62
    iget-object v3, p0, Lkik/android/chat/am;->a:Lkik/android/chat/al;

    invoke-interface {v3, v2}, Lkik/android/chat/al;->a(I)V

    .line 61
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 65
    :cond_3
    iget v2, p0, Lkik/android/chat/am;->b:I

    if-ge v0, v2, :cond_4

    move v2, v0

    .line 67
    :goto_3
    iget v3, p0, Lkik/android/chat/am;->b:I

    if-ge v2, v3, :cond_4

    .line 68
    iget-object v3, p0, Lkik/android/chat/am;->a:Lkik/android/chat/al;

    invoke-interface {v3, v2}, Lkik/android/chat/al;->b(I)V

    .line 67
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 72
    :cond_4
    iget v2, p0, Lkik/android/chat/am;->c:I

    if-le v1, v2, :cond_5

    .line 74
    iget v2, p0, Lkik/android/chat/am;->c:I

    :goto_4
    if-ge v2, v1, :cond_7

    .line 75
    iget-object v3, p0, Lkik/android/chat/am;->a:Lkik/android/chat/al;

    invoke-interface {v3, v2}, Lkik/android/chat/al;->b(I)V

    .line 74
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 78
    :cond_5
    iget v2, p0, Lkik/android/chat/am;->c:I

    if-ge v1, v2, :cond_7

    move v2, v1

    .line 80
    :goto_5
    iget v3, p0, Lkik/android/chat/am;->c:I

    if-ge v2, v3, :cond_7

    .line 81
    iget-object v3, p0, Lkik/android/chat/am;->a:Lkik/android/chat/al;

    invoke-interface {v3, v2}, Lkik/android/chat/al;->a(I)V

    .line 80
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_6
    move v2, v0

    .line 88
    :goto_6
    if-ge v2, v1, :cond_7

    .line 89
    iget-object v3, p0, Lkik/android/chat/am;->a:Lkik/android/chat/al;

    invoke-interface {v3, v2}, Lkik/android/chat/al;->b(I)V

    .line 88
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 94
    :cond_7
    iput v0, p0, Lkik/android/chat/am;->b:I

    .line 95
    iput v1, p0, Lkik/android/chat/am;->c:I

    goto/16 :goto_0

    :cond_8
    move v0, p2

    goto :goto_1
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .prologue
    .line 32
    return-void
.end method
