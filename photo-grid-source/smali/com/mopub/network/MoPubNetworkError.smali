.class public Lcom/mopub/network/MoPubNetworkError;
.super Lcom/mopub/volley/VolleyError;
.source "SourceFile"


# instance fields
.field private final a:Lcom/mopub/network/MoPubNetworkError$Reason;

.field private final b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/mopub/network/MoPubNetworkError$Reason;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/mopub/volley/VolleyError;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/mopub/network/MoPubNetworkError;->a:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/network/MoPubNetworkError;->b:Ljava/lang/Integer;

    .line 26
    return-void
.end method

.method public constructor <init>(Lcom/mopub/volley/NetworkResponse;Lcom/mopub/network/MoPubNetworkError$Reason;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/mopub/volley/VolleyError;-><init>(Lcom/mopub/volley/NetworkResponse;)V

    .line 30
    iput-object p2, p0, Lcom/mopub/network/MoPubNetworkError;->a:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/network/MoPubNetworkError;->b:Ljava/lang/Integer;

    .line 32
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/mopub/network/MoPubNetworkError$Reason;)V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/mopub/network/MoPubNetworkError;-><init>(Ljava/lang/String;Lcom/mopub/network/MoPubNetworkError$Reason;Ljava/lang/Integer;)V

    .line 42
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/mopub/network/MoPubNetworkError$Reason;Ljava/lang/Integer;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/mopub/volley/VolleyError;-><init>(Ljava/lang/String;)V

    .line 53
    iput-object p2, p0, Lcom/mopub/network/MoPubNetworkError;->a:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 54
    iput-object p3, p0, Lcom/mopub/network/MoPubNetworkError;->b:Ljava/lang/Integer;

    .line 55
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/mopub/network/MoPubNetworkError$Reason;)V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/mopub/volley/VolleyError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    iput-object p3, p0, Lcom/mopub/network/MoPubNetworkError;->a:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/network/MoPubNetworkError;->b:Ljava/lang/Integer;

    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Lcom/mopub/network/MoPubNetworkError$Reason;)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/mopub/volley/VolleyError;-><init>(Ljava/lang/Throwable;)V

    .line 36
    iput-object p2, p0, Lcom/mopub/network/MoPubNetworkError;->a:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/network/MoPubNetworkError;->b:Ljava/lang/Integer;

    .line 38
    return-void
.end method


# virtual methods
.method public getReason()Lcom/mopub/network/MoPubNetworkError$Reason;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/mopub/network/MoPubNetworkError;->a:Lcom/mopub/network/MoPubNetworkError$Reason;

    return-object v0
.end method

.method public getRefreshTimeMillis()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/mopub/network/MoPubNetworkError;->b:Ljava/lang/Integer;

    return-object v0
.end method
