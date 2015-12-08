.class final Lcom/mopub/mobileads/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/common/CloseableLayout$OnCloseListener;


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/l;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/l;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/mopub/mobileads/m;->a:Lcom/mopub/mobileads/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClose()V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/mopub/mobileads/m;->a:Lcom/mopub/mobileads/l;

    invoke-virtual {v0}, Lcom/mopub/mobileads/l;->finish()V

    .line 65
    return-void
.end method
