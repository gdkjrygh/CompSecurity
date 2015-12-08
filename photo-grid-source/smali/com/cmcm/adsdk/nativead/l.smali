.class final Lcom/cmcm/adsdk/nativead/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/ads/ImpressionListener;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/k;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/k;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/l;->a:Lcom/cmcm/adsdk/nativead/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLoggingImpression(Lcom/facebook/ads/Ad;)V
    .locals 2

    .prologue
    .line 122
    if-eqz p1, :cond_0

    .line 123
    const-string v0, "CMFBNativeAd"

    const-string v1, "Facebook onLoggingImpression! "

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/l;->a:Lcom/cmcm/adsdk/nativead/k;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/k;->k()V

    .line 126
    :cond_0
    return-void
.end method
