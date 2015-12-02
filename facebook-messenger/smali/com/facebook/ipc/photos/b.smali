.class Lcom/facebook/ipc/photos/b;
.super Ljava/lang/Object;
.source "MediaItem.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/ipc/photos/MediaItem;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ipc/photos/a;)V
    .locals 0

    .prologue
    .line 118
    invoke-direct {p0}, Lcom/facebook/ipc/photos/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ipc/photos/MediaItem;Lcom/facebook/ipc/photos/MediaItem;)I
    .locals 4

    .prologue
    .line 122
    invoke-virtual {p2}, Lcom/facebook/ipc/photos/MediaItem;->c()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/ipc/photos/MediaItem;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->signum(J)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 118
    check-cast p1, Lcom/facebook/ipc/photos/MediaItem;

    check-cast p2, Lcom/facebook/ipc/photos/MediaItem;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/ipc/photos/b;->a(Lcom/facebook/ipc/photos/MediaItem;Lcom/facebook/ipc/photos/MediaItem;)I

    move-result v0

    return v0
.end method
