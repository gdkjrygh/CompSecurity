.class final Lcom/mobeta/android/dslv/b;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;


# instance fields
.field final synthetic a:Lcom/mobeta/android/dslv/a;


# direct methods
.method constructor <init>(Lcom/mobeta/android/dslv/a;)V
    .locals 0

    iput-object p1, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    iget-object v0, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-static {v0}, Lcom/mobeta/android/dslv/a;->a(Lcom/mobeta/android/dslv/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-static {v0}, Lcom/mobeta/android/dslv/a;->b(Lcom/mobeta/android/dslv/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-static {v0}, Lcom/mobeta/android/dslv/a;->c(Lcom/mobeta/android/dslv/a;)Lcom/mobeta/android/dslv/DragSortListView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobeta/android/dslv/DragSortListView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x5

    iget-object v1, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-static {v1}, Lcom/mobeta/android/dslv/a;->d(Lcom/mobeta/android/dslv/a;)F

    move-result v1

    cmpl-float v1, p3, v1

    if-lez v1, :cond_2

    iget-object v1, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-static {v1}, Lcom/mobeta/android/dslv/a;->e(Lcom/mobeta/android/dslv/a;)I

    move-result v1

    neg-int v0, v0

    if-le v1, v0, :cond_0

    iget-object v0, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-static {v0}, Lcom/mobeta/android/dslv/a;->c(Lcom/mobeta/android/dslv/a;)Lcom/mobeta/android/dslv/DragSortListView;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/mobeta/android/dslv/DragSortListView;->a(F)Z

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-static {v0}, Lcom/mobeta/android/dslv/a;->f(Lcom/mobeta/android/dslv/a;)V

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    iget-object v1, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-static {v1}, Lcom/mobeta/android/dslv/a;->d(Lcom/mobeta/android/dslv/a;)F

    move-result v1

    neg-float v1, v1

    cmpg-float v1, p3, v1

    if-gez v1, :cond_0

    iget-object v1, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-static {v1}, Lcom/mobeta/android/dslv/a;->e(Lcom/mobeta/android/dslv/a;)I

    move-result v1

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcom/mobeta/android/dslv/b;->a:Lcom/mobeta/android/dslv/a;

    invoke-static {v0}, Lcom/mobeta/android/dslv/a;->c(Lcom/mobeta/android/dslv/a;)Lcom/mobeta/android/dslv/DragSortListView;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/mobeta/android/dslv/DragSortListView;->a(F)Z

    goto :goto_0
.end method
