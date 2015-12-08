.class final Lcom/mobeta/android/dslv/f;
.super Landroid/database/DataSetObserver;


# instance fields
.field final synthetic a:Lcom/mobeta/android/dslv/DragSortListView;


# direct methods
.method constructor <init>(Lcom/mobeta/android/dslv/DragSortListView;)V
    .locals 0

    iput-object p1, p0, Lcom/mobeta/android/dslv/f;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lcom/mobeta/android/dslv/f;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v0}, Lcom/mobeta/android/dslv/DragSortListView;->d(Lcom/mobeta/android/dslv/DragSortListView;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/mobeta/android/dslv/f;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v0}, Lcom/mobeta/android/dslv/DragSortListView;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 0

    invoke-direct {p0}, Lcom/mobeta/android/dslv/f;->a()V

    return-void
.end method

.method public final onInvalidated()V
    .locals 0

    invoke-direct {p0}, Lcom/mobeta/android/dslv/f;->a()V

    return-void
.end method
