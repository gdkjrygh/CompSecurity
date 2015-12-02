.class Lcom/actionbarsherlock/internal/a/h;
.super Ljava/lang/Object;
.source "IcsListPopupWindow.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/actionbarsherlock/internal/a/a;


# direct methods
.method private constructor <init>(Lcom/actionbarsherlock/internal/a/a;)V
    .locals 0

    .prologue
    .line 613
    iput-object p1, p0, Lcom/actionbarsherlock/internal/a/h;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/actionbarsherlock/internal/a/a;Lcom/actionbarsherlock/internal/a/b;)V
    .locals 0

    .prologue
    .line 613
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/a/h;-><init>(Lcom/actionbarsherlock/internal/a/a;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 615
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/h;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/a/a;->a(Lcom/actionbarsherlock/internal/a/a;)Lcom/actionbarsherlock/internal/a/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/h;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/a/a;->a(Lcom/actionbarsherlock/internal/a/a;)Lcom/actionbarsherlock/internal/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/c;->getCount()I

    move-result v0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/h;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v1}, Lcom/actionbarsherlock/internal/a/a;->a(Lcom/actionbarsherlock/internal/a/a;)Lcom/actionbarsherlock/internal/a/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/a/c;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/h;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/a/a;->a(Lcom/actionbarsherlock/internal/a/a;)Lcom/actionbarsherlock/internal/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/c;->getChildCount()I

    move-result v0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/h;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v1}, Lcom/actionbarsherlock/internal/a/a;->b(Lcom/actionbarsherlock/internal/a/a;)I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 617
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/h;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/a/a;->c(Lcom/actionbarsherlock/internal/a/a;)Landroid/widget/PopupWindow;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 618
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/h;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/a;->a()V

    .line 620
    :cond_0
    return-void
.end method
