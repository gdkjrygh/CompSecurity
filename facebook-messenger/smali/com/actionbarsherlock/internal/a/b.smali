.class Lcom/actionbarsherlock/internal/a/b;
.super Ljava/lang/Object;
.source "IcsListPopupWindow.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field final synthetic a:Lcom/actionbarsherlock/internal/a/a;


# direct methods
.method constructor <init>(Lcom/actionbarsherlock/internal/a/a;)V
    .locals 0

    .prologue
    .line 308
    iput-object p1, p0, Lcom/actionbarsherlock/internal/a/b;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 312
    const/4 v0, -0x1

    if-eq p3, v0, :cond_0

    .line 313
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/b;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/a/a;->a(Lcom/actionbarsherlock/internal/a/a;)Lcom/actionbarsherlock/internal/a/c;

    move-result-object v0

    .line 315
    if-eqz v0, :cond_0

    .line 316
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/a/c;->a(Lcom/actionbarsherlock/internal/a/c;Z)Z

    .line 319
    :cond_0
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 322
    return-void
.end method
