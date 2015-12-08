.class final Lcom/mopub/nativeads/bb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/ba;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/ba;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/mopub/nativeads/bb;->a:Lcom/mopub/nativeads/ba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/mopub/nativeads/bb;->a:Lcom/mopub/nativeads/ba;

    invoke-virtual {v0}, Lcom/mopub/nativeads/ba;->c()V

    .line 103
    const/4 v0, 0x1

    return v0
.end method
