.class Lcom/qihoo/security/recommend/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/recommend/a;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/recommend/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/recommend/a;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/qihoo/security/recommend/a$1;->a:Lcom/qihoo/security/recommend/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lcom/qihoo/security/recommend/a$1;->a:Lcom/qihoo/security/recommend/a;

    invoke-static {v0}, Lcom/qihoo/security/recommend/a;->a(Lcom/qihoo/security/recommend/a;)Lcom/qihoo/security/recommend/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/qihoo/security/recommend/a$1;->a:Lcom/qihoo/security/recommend/a;

    invoke-static {v0}, Lcom/qihoo/security/recommend/a;->a(Lcom/qihoo/security/recommend/a;)Lcom/qihoo/security/recommend/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/recommend/a$1;->a:Lcom/qihoo/security/recommend/a;

    invoke-static {v1}, Lcom/qihoo/security/recommend/a;->b(Lcom/qihoo/security/recommend/a;)Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/recommend/a$a;->b(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 57
    :cond_0
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/recommend/a$1;->a:Lcom/qihoo/security/recommend/a;

    invoke-static {v1}, Lcom/qihoo/security/recommend/a;->b(Lcom/qihoo/security/recommend/a;)Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/recommend/RecommendHelper;->b(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 58
    return-void
.end method
