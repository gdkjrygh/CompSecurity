.class final Lcom/mopub/nativeads/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/ae;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/ae;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/mopub/nativeads/af;->a:Lcom/mopub/nativeads/ae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 77
    iget-object v0, p0, Lcom/mopub/nativeads/af;->a:Lcom/mopub/nativeads/ae;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/mopub/nativeads/ae;->b:Z

    .line 78
    iget-object v0, p0, Lcom/mopub/nativeads/af;->a:Lcom/mopub/nativeads/ae;

    invoke-virtual {v0}, Lcom/mopub/nativeads/ae;->c()V

    .line 79
    return-void
.end method
