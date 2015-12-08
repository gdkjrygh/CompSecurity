.class final Lcom/mopub/nativeads/l;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/MoPubAdAdapter;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/MoPubAdAdapter;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/mopub/nativeads/l;->a:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lcom/mopub/nativeads/l;->a:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-static {v0}, Lcom/mopub/nativeads/MoPubAdAdapter;->b(Lcom/mopub/nativeads/MoPubAdAdapter;)Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/nativeads/l;->a:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-static {v1}, Lcom/mopub/nativeads/MoPubAdAdapter;->a(Lcom/mopub/nativeads/MoPubAdAdapter;)Landroid/widget/Adapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->setItemCount(I)V

    .line 111
    iget-object v0, p0, Lcom/mopub/nativeads/l;->a:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-virtual {v0}, Lcom/mopub/nativeads/MoPubAdAdapter;->notifyDataSetChanged()V

    .line 112
    return-void
.end method

.method public final onInvalidated()V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/mopub/nativeads/l;->a:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-virtual {v0}, Lcom/mopub/nativeads/MoPubAdAdapter;->notifyDataSetInvalidated()V

    .line 117
    return-void
.end method
