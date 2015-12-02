.class Lcom/facebook/widget/listview/b;
.super Ljava/lang/Object;
.source "BetterListView.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field final synthetic a:Lcom/facebook/widget/listview/BetterListView;


# direct methods
.method constructor <init>(Lcom/facebook/widget/listview/BetterListView;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/facebook/widget/listview/b;->a:Lcom/facebook/widget/listview/BetterListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/widget/listview/b;->a:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/BetterListView;->a()V

    .line 107
    const/4 v0, 0x1

    return v0
.end method
