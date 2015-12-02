.class Lcom/qihoo/security/ui/main/BoosterFragment$b;
.super Lcom/nineoldandroids/a/b;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 906
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$b;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/qihoo/security/ui/main/BoosterFragment$1;)V
    .locals 0

    .prologue
    .line 906
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment$b;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 911
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 913
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/qihoo/security/ui/result/f;->a(I)V

    .line 915
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v2

    const v3, 0x7f03008a

    move-object v0, v1

    check-cast v0, [I

    invoke-virtual {v2, v3, v0, v4}, Lcom/qihoo/security/ui/b/a;->a(I[IZ)V

    .line 917
    invoke-static {v4}, Lcom/qihoo/security/ui/b/b;->a(I)V

    .line 918
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$b;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->i(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/ui/b/e;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/qihoo/security/ui/b/e;->a(I)Lcom/qihoo/security/ui/b/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/b/e$a;->a()V

    .line 920
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$b;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->f(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/app/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 921
    const/16 v0, 0x2c38

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 926
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$b;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->f(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "this_speed_of_boost"

    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment$b;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v3}, Lcom/qihoo/security/ui/main/BoosterFragment;->j(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v3

    invoke-static {v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 928
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$b;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->k(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b()V

    .line 929
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$b;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment;J)J

    .line 930
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/recommend/RecommendHelper;->d(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 931
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/recommend/RecommendHelper;->b(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 932
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$b;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    sget-object v1, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdBoost:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 936
    :cond_1
    return-void
.end method
