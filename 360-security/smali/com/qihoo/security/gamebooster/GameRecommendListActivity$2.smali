.class Lcom/qihoo/security/gamebooster/GameRecommendListActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/GameRecommendListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$2;->a:Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 2

    .prologue
    .line 140
    add-int v0, p2, p3

    .line 141
    if-ne v0, p4, :cond_0

    .line 142
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 143
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getBottom()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    if-ne v1, v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$2;->a:Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->a(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;Z)Z

    .line 147
    :cond_0
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .prologue
    .line 136
    return-void
.end method
