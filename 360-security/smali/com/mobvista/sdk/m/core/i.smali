.class final Lcom/mobvista/sdk/m/core/i;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V
    .locals 0

    .prologue
    .line 898
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/i;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 902
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/i;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a()V

    .line 904
    return-void
.end method
