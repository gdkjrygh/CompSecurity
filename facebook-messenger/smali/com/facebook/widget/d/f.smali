.class Lcom/facebook/widget/d/f;
.super Landroid/widget/ArrayAdapter;
.source "QuickActionPopMenu.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/facebook/widget/d/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/widget/d/c;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/d/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/widget/d/c;Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/d/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 60
    iput-object p1, p0, Lcom/facebook/widget/d/f;->a:Lcom/facebook/widget/d/c;

    .line 61
    sget v0, Lcom/facebook/k;->orca_quick_action_menu_item:I

    invoke-direct {p0, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 62
    iput-object p2, p0, Lcom/facebook/widget/d/f;->b:Landroid/content/Context;

    .line 63
    iput-object p3, p0, Lcom/facebook/widget/d/f;->c:Ljava/util/List;

    .line 64
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 68
    iget-object v0, p0, Lcom/facebook/widget/d/f;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 69
    sget v1, Lcom/facebook/k;->orca_quick_action_menu_item:I

    invoke-virtual {v0, v1, p3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 70
    sget v0, Lcom/facebook/i;->menu_item_caption:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 71
    iget-object v1, p0, Lcom/facebook/widget/d/f;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/d/b;

    .line 73
    invoke-virtual {v1}, Lcom/facebook/widget/d/b;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 74
    invoke-virtual {v1}, Lcom/facebook/widget/d/b;->d()Z

    move-result v4

    .line 75
    sget v2, Lcom/facebook/i;->radio_button:I

    invoke-virtual {v3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioButton;

    .line 76
    invoke-virtual {v2, v5}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 77
    invoke-virtual {v2, v4}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 80
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/widget/d/b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    invoke-virtual {v3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 83
    return-object v3
.end method
