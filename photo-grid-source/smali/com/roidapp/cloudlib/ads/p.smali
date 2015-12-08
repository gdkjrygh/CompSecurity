.class final Lcom/roidapp/cloudlib/ads/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/ads/r;

.field final synthetic b:Lcom/roidapp/cloudlib/ads/PushAdActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/ads/PushAdActivity;Lcom/roidapp/cloudlib/ads/r;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/roidapp/cloudlib/ads/p;->b:Lcom/roidapp/cloudlib/ads/PushAdActivity;

    iput-object p2, p0, Lcom/roidapp/cloudlib/ads/p;->a:Lcom/roidapp/cloudlib/ads/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/p;->b:Lcom/roidapp/cloudlib/ads/PushAdActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/p;->b:Lcom/roidapp/cloudlib/ads/PushAdActivity;

    iget-object v1, p0, Lcom/roidapp/cloudlib/ads/p;->a:Lcom/roidapp/cloudlib/ads/r;

    .line 1140
    invoke-static {v1}, Lcom/roidapp/cloudlib/ads/r;->d(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lcom/roidapp/cloudlib/ads/r;->b(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Lcom/roidapp/cloudlib/ads/r;->e(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roidapp/cloudlib/ads/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 48
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/p;->b:Lcom/roidapp/cloudlib/ads/PushAdActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->a(Lcom/roidapp/cloudlib/ads/PushAdActivity;)V

    .line 50
    :cond_0
    return-void
.end method
