.class final Lcom/mobvista/sdk/m/core/g;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V
    .locals 0

    .prologue
    .line 674
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/g;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 678
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/g;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->finish()V

    .line 680
    return-void
.end method
