.class final Lcom/mopub/nativeads/ac;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/mopub/nativeads/MoPubAdRenderer;

.field private final c:Lcom/mopub/nativeads/NativeResponse;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/mopub/nativeads/MoPubAdRenderer;Lcom/mopub/nativeads/NativeResponse;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/mopub/nativeads/ac;->a:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/mopub/nativeads/ac;->b:Lcom/mopub/nativeads/MoPubAdRenderer;

    .line 18
    iput-object p3, p0, Lcom/mopub/nativeads/ac;->c:Lcom/mopub/nativeads/NativeResponse;

    .line 19
    return-void
.end method


# virtual methods
.method final a()Lcom/mopub/nativeads/MoPubAdRenderer;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/mopub/nativeads/ac;->b:Lcom/mopub/nativeads/MoPubAdRenderer;

    return-object v0
.end method

.method final b()Lcom/mopub/nativeads/NativeResponse;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/mopub/nativeads/ac;->c:Lcom/mopub/nativeads/NativeResponse;

    return-object v0
.end method
