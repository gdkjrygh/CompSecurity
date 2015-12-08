.class final Lcom/mopub/mobileads/d;
.super Lcom/mopub/mobileads/c;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/mopub/mobileads/AdViewController;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/mobileads/AdViewController;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/c;-><init>(Lcom/mopub/mobileads/AdViewController;)V

    .line 45
    iput-object p2, p0, Lcom/mopub/mobileads/d;->b:Ljava/lang/String;

    .line 46
    iput-object p3, p0, Lcom/mopub/mobileads/d;->c:Ljava/util/Map;

    .line 47
    return-void
.end method


# virtual methods
.method final a()V
    .locals 3

    .prologue
    .line 51
    iget-object v0, p0, Lcom/mopub/mobileads/d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/AdViewController;

    .line 52
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->d()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/mopub/mobileads/d;->b:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 65
    :cond_0
    :goto_0
    return-void

    .line 57
    :cond_1
    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->a()V

    .line 59
    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getMoPubView()Lcom/mopub/mobileads/MoPubView;

    move-result-object v0

    .line 60
    if-nez v0, :cond_2

    .line 61
    const-string v0, "Can\'t load an ad in this ad view because it was destroyed."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 64
    :cond_2
    iget-object v1, p0, Lcom/mopub/mobileads/d;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/mopub/mobileads/d;->c:Ljava/util/Map;

    invoke-virtual {v0, v1, v2}, Lcom/mopub/mobileads/MoPubView;->a(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0
.end method
