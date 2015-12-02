.class Lcom/actionbarsherlock/internal/view/menu/f;
.super Landroid/database/DataSetObserver;
.source "MenuPopupHelper.java"


# instance fields
.field final synthetic a:Lcom/actionbarsherlock/internal/view/menu/d;


# direct methods
.method private constructor <init>(Lcom/actionbarsherlock/internal/view/menu/d;)V
    .locals 0

    .prologue
    .line 374
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/f;->a:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/actionbarsherlock/internal/view/menu/d;Lcom/actionbarsherlock/internal/view/menu/e;)V
    .locals 0

    .prologue
    .line 374
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/f;-><init>(Lcom/actionbarsherlock/internal/view/menu/d;)V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .prologue
    .line 377
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/f;->a:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-static {v0}, Lcom/actionbarsherlock/internal/view/menu/d;->d(Lcom/actionbarsherlock/internal/view/menu/d;)Lcom/actionbarsherlock/internal/view/menu/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/g;->a()V

    .line 378
    return-void
.end method
