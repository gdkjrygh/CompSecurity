.class final Lcom/mopub/nativeads/at;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/as;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/as;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/mopub/nativeads/at;->a:Lcom/mopub/nativeads/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/mopub/nativeads/at;->a:Lcom/mopub/nativeads/as;

    invoke-static {v0}, Lcom/mopub/nativeads/as;->a(Lcom/mopub/nativeads/as;)V

    .line 76
    return-void
.end method
