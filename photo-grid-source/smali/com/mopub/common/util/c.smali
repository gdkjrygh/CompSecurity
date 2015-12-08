.class final Lcom/mopub/common/util/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 271
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasFlag(Ljava/lang/Class;II)Z
    .locals 1

    .prologue
    .line 277
    invoke-static {p2, p3}, Lcom/mopub/common/util/Utils;->bitMaskContainsFlag(II)Z

    move-result v0

    return v0
.end method
