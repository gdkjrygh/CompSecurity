.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "j"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

.field private b:Z


# direct methods
.method private constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 2670
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;)V
    .locals 0

    .prologue
    .line 2670
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .prologue
    .line 2688
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;->b:Z

    .line 2689
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 4

    .prologue
    .line 2675
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->j(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Z)V

    .line 2676
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;->b:Z

    if-eqz v0, :cond_1

    .line 2677
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2678
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;J)V

    .line 2685
    :goto_0
    return-void

    .line 2680
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ad(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    goto :goto_0

    .line 2683
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ad(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    goto :goto_0
.end method
