.class public final Lcom/cmcm/adsdk/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/cmcm/adsdk/e;

.field b:Lcom/cmcm/adsdk/nativead/aa;

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cmcm/adsdk/f;->b:Lcom/cmcm/adsdk/nativead/aa;

    .line 22
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/cmcm/adsdk/f;->c:Landroid/content/Context;

    .line 27
    :goto_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "posid can\'t be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 25
    :cond_0
    iput-object p1, p0, Lcom/cmcm/adsdk/f;->c:Landroid/content/Context;

    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Lcom/cmcm/adsdk/nativead/aa;

    iget-object v1, p0, Lcom/cmcm/adsdk/f;->c:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Lcom/cmcm/adsdk/nativead/aa;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/cmcm/adsdk/f;->b:Lcom/cmcm/adsdk/nativead/aa;

    .line 32
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 49
    iget-object v0, p0, Lcom/cmcm/adsdk/f;->a:Lcom/cmcm/adsdk/e;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/cmcm/adsdk/f;->b:Lcom/cmcm/adsdk/nativead/aa;

    iget-object v1, p0, Lcom/cmcm/adsdk/f;->a:Lcom/cmcm/adsdk/e;

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/nativead/aa;->setRequestParams(Lcom/cmcm/adsdk/e;)V

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/f;->b:Lcom/cmcm/adsdk/nativead/aa;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/aa;->loadAd()V

    .line 53
    return-void
.end method

.method public final a(Lcom/cmcm/a/a/d;)V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/cmcm/adsdk/f;->b:Lcom/cmcm/adsdk/nativead/aa;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/cmcm/adsdk/f;->b:Lcom/cmcm/adsdk/nativead/aa;

    invoke-virtual {v0, p1}, Lcom/cmcm/adsdk/nativead/aa;->setAdListener(Lcom/cmcm/a/a/d;)V

    .line 45
    :cond_0
    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 66
    iget-object v0, p0, Lcom/cmcm/adsdk/f;->b:Lcom/cmcm/adsdk/nativead/aa;

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/cmcm/adsdk/f;->b:Lcom/cmcm/adsdk/nativead/aa;

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/nativead/aa;->getAdList(I)Ljava/util/List;

    move-result-object v0

    .line 69
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
