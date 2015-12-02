.class Lcom/actionbarsherlock/internal/a/e;
.super Landroid/database/DataSetObserver;
.source "IcsListPopupWindow.java"


# instance fields
.field final synthetic a:Lcom/actionbarsherlock/internal/a/a;


# direct methods
.method private constructor <init>(Lcom/actionbarsherlock/internal/a/a;)V
    .locals 0

    .prologue
    .line 592
    iput-object p1, p0, Lcom/actionbarsherlock/internal/a/e;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/actionbarsherlock/internal/a/a;Lcom/actionbarsherlock/internal/a/b;)V
    .locals 0

    .prologue
    .line 592
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/a/e;-><init>(Lcom/actionbarsherlock/internal/a/a;)V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .prologue
    .line 595
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/e;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 597
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/e;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/a;->a()V

    .line 599
    :cond_0
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    .prologue
    .line 603
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/e;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/a;->b()V

    .line 604
    return-void
.end method
