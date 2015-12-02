.class final Lcom/mobvista/sdk/m/core/h;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/mobvista/sdk/m/core/AdMobvistaAct;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;I)V
    .locals 0

    .prologue
    .line 699
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/h;->b:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    iput p2, p0, Lcom/mobvista/sdk/m/core/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 703
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/h;->b:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->b(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Lcom/mobvista/sdk/m/b/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 704
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/h;->b:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->b(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Lcom/mobvista/sdk/m/b/d;

    move-result-object v0

    iget v1, p0, Lcom/mobvista/sdk/m/core/h;->a:I

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/b/d;->a(I)V

    .line 707
    :cond_0
    return-void
.end method
