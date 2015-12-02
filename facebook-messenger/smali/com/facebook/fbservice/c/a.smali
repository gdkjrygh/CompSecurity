.class public Lcom/facebook/fbservice/c/a;
.super Ljava/lang/Object;
.source "BaseResult.java"


# instance fields
.field private final clientTimeMs:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "clientTimeMs"
    .end annotation
.end field

.field private final freshness:Lcom/facebook/fbservice/c/b;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "freshness"
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/c/b;

    iput-object v0, p0, Lcom/facebook/fbservice/c/a;->freshness:Lcom/facebook/fbservice/c/b;

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/fbservice/c/a;->clientTimeMs:J

    .line 28
    return-void
.end method

.method protected constructor <init>(Lcom/facebook/fbservice/c/b;J)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/fbservice/c/a;->freshness:Lcom/facebook/fbservice/c/b;

    .line 22
    iput-wide p2, p0, Lcom/facebook/fbservice/c/a;->clientTimeMs:J

    .line 23
    return-void
.end method


# virtual methods
.method public e()Lcom/facebook/fbservice/c/b;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/fbservice/c/a;->freshness:Lcom/facebook/fbservice/c/b;

    return-object v0
.end method

.method public f()J
    .locals 2

    .prologue
    .line 35
    iget-wide v0, p0, Lcom/facebook/fbservice/c/a;->clientTimeMs:J

    return-wide v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 39
    invoke-virtual {p0}, Lcom/facebook/fbservice/c/a;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 40
    iget-wide v0, p0, Lcom/facebook/fbservice/c/a;->clientTimeMs:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 41
    return-void
.end method
