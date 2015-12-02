.class public Lcom/facebook/orca/l/aj;
.super Ljava/lang/Object;
.source "MergingUtil.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/messages/model/threads/Message;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 799
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)J
    .locals 4

    .prologue
    .line 815
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 816
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    .line 818
    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)I
    .locals 5

    .prologue
    .line 803
    invoke-direct {p0, p1}, Lcom/facebook/orca/l/aj;->a(Lcom/facebook/messages/model/threads/Message;)J

    move-result-wide v0

    .line 804
    invoke-direct {p0, p2}, Lcom/facebook/orca/l/aj;->a(Lcom/facebook/messages/model/threads/Message;)J

    move-result-wide v2

    .line 805
    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 806
    const/4 v0, -0x1

    .line 810
    :goto_0
    return v0

    .line 807
    :cond_0
    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 808
    const/4 v0, 0x1

    goto :goto_0

    .line 810
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 799
    check-cast p1, Lcom/facebook/messages/model/threads/Message;

    check-cast p2, Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/l/aj;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)I

    move-result v0

    return v0
.end method
