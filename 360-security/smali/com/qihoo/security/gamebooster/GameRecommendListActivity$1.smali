.class Lcom/qihoo/security/gamebooster/GameRecommendListActivity$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    .line 113
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$1;->a:Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$1;->a:Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->a(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 128
    :goto_0
    return-void

    .line 120
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$1;->a:Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 121
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 122
    const-string/jumbo v1, "packages"

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$1;->a:Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    invoke-static {v2}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->b(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 123
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$1;->a:Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->c(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 124
    const-string/jumbo v1, "from_gameboost"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 126
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$1;->a:Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->startActivity(Landroid/content/Intent;)V

    .line 127
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$1;->a:Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    const v1, 0x7f040013

    const v2, 0x7f040023

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->overridePendingTransition(II)V

    goto :goto_0
.end method
