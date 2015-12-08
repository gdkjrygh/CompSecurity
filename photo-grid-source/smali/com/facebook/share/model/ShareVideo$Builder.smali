.class public final Lcom/facebook/share/model/ShareVideo$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/share/model/ShareModelBuilder;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/share/model/ShareModelBuilder",
        "<",
        "Lcom/facebook/share/model/ShareVideo;",
        "Lcom/facebook/share/model/ShareVideo$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field private localUrl:Landroid/net/Uri;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/facebook/share/model/ShareVideo$Builder;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/share/model/ShareVideo$Builder;->localUrl:Landroid/net/Uri;

    return-object v0
.end method


# virtual methods
.method public final build()Lcom/facebook/share/model/ShareVideo;
    .locals 2

    .prologue
    .line 89
    new-instance v0, Lcom/facebook/share/model/ShareVideo;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/model/ShareVideo;-><init>(Lcom/facebook/share/model/ShareVideo$Builder;Lcom/facebook/share/model/ShareVideo$1;)V

    return-object v0
.end method

.method public final bridge synthetic build()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/facebook/share/model/ShareVideo$Builder;->build()Lcom/facebook/share/model/ShareVideo;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 74
    invoke-virtual {p0, p1}, Lcom/facebook/share/model/ShareVideo$Builder;->readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareVideo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic readFrom(Lcom/facebook/share/model/ShareModel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 74
    check-cast p1, Lcom/facebook/share/model/ShareVideo;

    invoke-virtual {p0, p1}, Lcom/facebook/share/model/ShareVideo$Builder;->readFrom(Lcom/facebook/share/model/ShareVideo;)Lcom/facebook/share/model/ShareVideo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareVideo$Builder;
    .locals 1

    .prologue
    .line 102
    const-class v0, Lcom/facebook/share/model/ShareVideo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/model/ShareVideo;

    invoke-virtual {p0, v0}, Lcom/facebook/share/model/ShareVideo$Builder;->readFrom(Lcom/facebook/share/model/ShareVideo;)Lcom/facebook/share/model/ShareVideo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final readFrom(Lcom/facebook/share/model/ShareVideo;)Lcom/facebook/share/model/ShareVideo$Builder;
    .locals 1

    .prologue
    .line 94
    if-nez p1, :cond_0

    .line 97
    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareVideo;->getLocalUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/model/ShareVideo$Builder;->setLocalUrl(Landroid/net/Uri;)Lcom/facebook/share/model/ShareVideo$Builder;

    move-result-object p0

    goto :goto_0
.end method

.method public final setLocalUrl(Landroid/net/Uri;)Lcom/facebook/share/model/ShareVideo$Builder;
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/share/model/ShareVideo$Builder;->localUrl:Landroid/net/Uri;

    .line 84
    return-object p0
.end method
