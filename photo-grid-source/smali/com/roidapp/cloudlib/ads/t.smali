.class final Lcom/roidapp/cloudlib/ads/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/ads/o;


# instance fields
.field private a:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/ads/t;->a:Z

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/roidapp/cloudlib/ads/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/ads/t;->a:Z

    .line 73
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->pause()V

    .line 74
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 5

    .prologue
    .line 52
    const-string v0, "version:1.0,store:google"

    const-string v1, "appbf321bdd873649d89f"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "vzc2e33f3d820e46e194"

    aput-object v4, v2, v3

    invoke-static {p1, v0, v1, v2}, Lcom/jirbo/adcolony/AdColony;->configure(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 53
    invoke-static {}, Lcom/roidapp/cloudlib/ads/a;->a()Lcom/roidapp/cloudlib/ads/a;

    move-result-object v0

    invoke-static {v0}, Lcom/jirbo/adcolony/AdColony;->addAdAvailabilityListener(Lcom/jirbo/adcolony/AdColonyAdAvailabilityListener;)V

    .line 54
    return-void
.end method

.method public final b(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 66
    invoke-static {p1}, Lcom/jirbo/adcolony/AdColony;->resume(Landroid/app/Activity;)V

    .line 67
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/ads/t;->a:Z

    .line 68
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 78
    invoke-static {}, Lcom/roidapp/cloudlib/ads/a;->b()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 2

    .prologue
    .line 83
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/ads/t;->a:Z

    if-eqz v0, :cond_0

    .line 1078
    invoke-static {}, Lcom/roidapp/cloudlib/ads/a;->b()Z

    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    new-instance v0, Lcom/jirbo/adcolony/AdColonyVideoAd;

    const-string v1, "vzc2e33f3d820e46e194"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/AdColonyVideoAd;-><init>(Ljava/lang/String;)V

    .line 85
    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyVideoAd;->show()V

    .line 86
    const/4 v0, 0x1

    .line 88
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
