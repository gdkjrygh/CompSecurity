.class Lcom/thetransitapp/droid/RoutesScreen$1;
.super Ljava/lang/Object;
.source "RoutesScreen.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/RoutesScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private oldLastVisibleItem:I

.field final synthetic this$0:Lcom/thetransitapp/droid/RoutesScreen;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/RoutesScreen;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/RoutesScreen$1;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 2
    .param p1, "view"    # Landroid/widget/AbsListView;
    .param p2, "firstVisibleItem"    # I
    .param p3, "visibleItemCount"    # I
    .param p4, "totalItemCount"    # I

    .prologue
    .line 93
    iget v0, p0, Lcom/thetransitapp/droid/RoutesScreen$1;->oldLastVisibleItem:I

    if-eq p2, v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen$1;->this$0:Lcom/thetransitapp/droid/RoutesScreen;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/RoutesScreen;->hidePopover(Z)V

    .line 97
    :cond_0
    iput p2, p0, Lcom/thetransitapp/droid/RoutesScreen$1;->oldLastVisibleItem:I

    .line 98
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0
    .param p1, "view"    # Landroid/widget/AbsListView;
    .param p2, "scrollState"    # I

    .prologue
    .line 88
    return-void
.end method
