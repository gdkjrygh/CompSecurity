.class final enum Lcom/mopub/mraid/x;
.super Lcom/mopub/mraid/MraidJavascriptCommand;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 27
    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/mopub/mraid/MraidJavascriptCommand;-><init>(Ljava/lang/String;ILjava/lang/String;B)V

    return-void
.end method


# virtual methods
.method final a(Lcom/mopub/mraid/PlacementType;)Z
    .locals 1

    .prologue
    .line 30
    sget-object v0, Lcom/mopub/mraid/PlacementType;->INLINE:Lcom/mopub/mraid/PlacementType;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
