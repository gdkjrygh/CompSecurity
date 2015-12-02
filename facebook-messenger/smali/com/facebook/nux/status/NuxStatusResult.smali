.class public Lcom/facebook/nux/status/NuxStatusResult;
.super Ljava/lang/Object;
.source "NuxStatusResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/nux/status/NuxStatusResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/nux/status/NuxStep;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 72
    new-instance v0, Lcom/facebook/nux/status/i;

    invoke-direct {v0}, Lcom/facebook/nux/status/i;-><init>()V

    sput-object v0, Lcom/facebook/nux/status/NuxStatusResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/nux/status/NuxStatusResult;->a:Ljava/lang/String;

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->b:Z

    .line 43
    const-class v0, Lcom/facebook/nux/status/NuxStep;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->c:Lcom/google/common/a/es;

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/bundle/a;->a(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->d:Lcom/google/common/a/ev;

    .line 45
    return-void

    .line 42
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/nux/status/i;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/nux/status/NuxStatusResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLcom/google/common/a/es;Lcom/google/common/a/ev;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "nuxId"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "isEligible"
        .end annotation
    .end param
    .param p3    # Lcom/google/common/a/es;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "nuxSteps"
        .end annotation
    .end param
    .param p4    # Lcom/google/common/a/ev;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "extraData"
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/nux/status/NuxStep;",
            ">;",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/nux/status/NuxStatusResult;->a:Ljava/lang/String;

    .line 35
    iput-boolean p2, p0, Lcom/facebook/nux/status/NuxStatusResult;->b:Z

    .line 36
    iput-object p3, p0, Lcom/facebook/nux/status/NuxStatusResult;->c:Lcom/google/common/a/es;

    .line 37
    iput-object p4, p0, Lcom/facebook/nux/status/NuxStatusResult;->d:Lcom/google/common/a/ev;

    .line 38
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 87
    const/4 v0, 0x0

    return v0
.end method

.method public getExtraData()Lcom/google/common/a/ev;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->d:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public getIsEligible()Z
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "isEligible"
    .end annotation

    .prologue
    .line 54
    iget-boolean v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->b:Z

    return v0
.end method

.method public getNuxId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "nuxId"
    .end annotation

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getNuxSteps()Lcom/google/common/a/es;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "nuxSteps"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/nux/status/NuxStep;",
            ">;"
        }
    .end annotation

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->c:Lcom/google/common/a/es;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 93
    iget-boolean v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 94
    iget-object v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->c:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 95
    iget-object v0, p0, Lcom/facebook/nux/status/NuxStatusResult;->d:Lcom/google/common/a/ev;

    invoke-static {v0}, Lcom/facebook/common/bundle/a;->a(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 96
    return-void

    .line 93
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
