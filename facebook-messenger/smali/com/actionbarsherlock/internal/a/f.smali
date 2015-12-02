.class Lcom/actionbarsherlock/internal/a/f;
.super Ljava/lang/Object;
.source "IcsListPopupWindow.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/actionbarsherlock/internal/a/a;


# direct methods
.method private constructor <init>(Lcom/actionbarsherlock/internal/a/a;)V
    .locals 0

    .prologue
    .line 640
    iput-object p1, p0, Lcom/actionbarsherlock/internal/a/f;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/actionbarsherlock/internal/a/a;Lcom/actionbarsherlock/internal/a/b;)V
    .locals 0

    .prologue
    .line 640
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/a/f;-><init>(Lcom/actionbarsherlock/internal/a/a;)V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 644
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .prologue
    .line 647
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/f;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/a/a;->f(Lcom/actionbarsherlock/internal/a/a;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/f;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/a/a;->c(Lcom/actionbarsherlock/internal/a/a;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 649
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/f;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/a/a;->e(Lcom/actionbarsherlock/internal/a/a;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/f;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v1}, Lcom/actionbarsherlock/internal/a/a;->d(Lcom/actionbarsherlock/internal/a/a;)Lcom/actionbarsherlock/internal/a/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 650
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/f;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/a/a;->d(Lcom/actionbarsherlock/internal/a/a;)Lcom/actionbarsherlock/internal/a/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/h;->run()V

    .line 652
    :cond_0
    return-void
.end method
