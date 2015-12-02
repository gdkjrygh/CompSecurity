.class final Lcom/mobvista/sdk/m/core/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/a/c/d;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/mobvista/sdk/m/core/AdMobvistaAct;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 309
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/c;->b:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/c;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OnLoadCanceled(I)V
    .locals 0

    .prologue
    .line 334
    return-void
.end method

.method public final OnLoadError(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 327
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/c;->b:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/c;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Ljava/lang/String;)V

    .line 328
    return-void
.end method

.method public final OnLoadFinish(ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 321
    return-void
.end method

.method public final OnLoadStart(I)V
    .locals 0

    .prologue
    .line 315
    return-void
.end method
