.class public Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NO_REPEAT:I = 0x7fffffff


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->a:Ljava/util/ArrayList;

    .line 44
    const v0, 0x7fffffff

    iput v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->b:I

    .line 47
    return-void
.end method

.method static synthetic a(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;I)I
    .locals 0

    .prologue
    .line 37
    iput p1, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->b:I

    return p1
.end method

.method static synthetic a(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic b(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->b:I

    return v0
.end method


# virtual methods
.method final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 76
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public addFixedPosition(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
    .locals 3

    .prologue
    .line 57
    if-ltz p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkArgument(Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 66
    :cond_0
    :goto_1
    return-object p0

    .line 57
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 62
    :cond_2
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->a:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v0

    .line 63
    if-gez v0, :cond_0

    .line 64
    iget-object v1, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->a:Ljava/util/ArrayList;

    xor-int/lit8 v0, v0, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1
.end method

.method final b()I
    .locals 1

    .prologue
    .line 106
    iget v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->b:I

    return v0
.end method

.method public enableRepeatingPositions(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 88
    if-le p1, v0, :cond_0

    :goto_0
    const-string v1, "Repeating interval must be greater than 1"

    invoke-static {v0, v1}, Lcom/mopub/common/Preconditions$NoThrow;->checkArgument(ZLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 90
    const v0, 0x7fffffff

    iput v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->b:I

    .line 94
    :goto_1
    return-object p0

    .line 88
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 93
    :cond_1
    iput p1, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->b:I

    goto :goto_1
.end method
