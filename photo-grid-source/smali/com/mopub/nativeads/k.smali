.class final Lcom/mopub/nativeads/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/bf;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/MoPubAdAdapter;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/MoPubAdAdapter;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/mopub/nativeads/k;->a:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onVisibilityChanged(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 104
    iget-object v0, p0, Lcom/mopub/nativeads/k;->a:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-static {v0, p1}, Lcom/mopub/nativeads/MoPubAdAdapter;->a(Lcom/mopub/nativeads/MoPubAdAdapter;Ljava/util/List;)V

    .line 105
    return-void
.end method
