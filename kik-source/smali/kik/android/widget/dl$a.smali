.class final Lkik/android/widget/dl$a;
.super Lkik/android/widget/cx;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/dl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field b:[I

.field final synthetic c:Lkik/android/widget/dl;

.field private d:Ljava/util/List;


# direct methods
.method public constructor <init>(Lkik/android/widget/dl;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 131
    iput-object p1, p0, Lkik/android/widget/dl$a;->c:Lkik/android/widget/dl;

    .line 132
    invoke-direct {p0, p2}, Lkik/android/widget/cx;-><init>(Landroid/view/View;)V

    .line 128
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lkik/android/widget/dl$a;->b:[I

    .line 133
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 154
    iget-object v0, p0, Lkik/android/widget/dl$a;->d:Ljava/util/List;

    if-nez v0, :cond_0

    move-object v0, v1

    .line 173
    :goto_0
    return-object v0

    .line 157
    :cond_0
    invoke-virtual {p0}, Lkik/android/widget/dl$a;->getContentView()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lkik/android/widget/dl$a;->b:[I

    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 158
    iget-object v0, p0, Lkik/android/widget/dl$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 159
    if-eqz v0, :cond_1

    .line 160
    :try_start_0
    iget-object v3, p0, Lkik/android/widget/dl$a;->b:[I

    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 164
    new-instance v3, Landroid/graphics/Rect;

    iget-object v4, p0, Lkik/android/widget/dl$a;->b:[I

    const/4 v5, 0x0

    aget v4, v4, v5

    iget-object v5, p0, Lkik/android/widget/dl$a;->b:[I

    const/4 v6, 0x1

    aget v5, v5, v6

    iget-object v6, p0, Lkik/android/widget/dl$a;->b:[I

    const/4 v7, 0x0

    aget v6, v6, v7

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v7

    add-int/2addr v6, v7

    iget-object v7, p0, Lkik/android/widget/dl$a;->b:[I

    const/4 v8, 0x1

    aget v7, v7, v8

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v8

    add-int/2addr v7, v8

    invoke-direct {v3, v4, v5, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 165
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Rect;->contains(II)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 173
    goto :goto_0

    .line 172
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public final a()V
    .locals 3

    .prologue
    .line 142
    iget-object v0, p0, Lkik/android/widget/dl$a;->d:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 143
    iget-object v0, p0, Lkik/android/widget/dl$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 144
    if-eqz v0, :cond_0

    .line 145
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    .line 150
    :cond_1
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lkik/android/widget/dl$a;->d:Ljava/util/List;

    .line 138
    return-void
.end method
