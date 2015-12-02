.class public Lcom/facebook/orca/server/SendBroadcastResult;
.super Lcom/facebook/fbservice/c/a;
.source "SendBroadcastResult.java"

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
            "Lcom/facebook/orca/server/SendBroadcastResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/server/FetchThreadResult;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 69
    new-instance v0, Lcom/facebook/orca/server/av;

    invoke-direct {v0}, Lcom/facebook/orca/server/av;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/SendBroadcastResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 45
    const-class v0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->a:Lcom/google/common/a/ev;

    .line 47
    const-class v0, Lcom/facebook/user/User;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->b:Lcom/google/common/a/es;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->c:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->d:I

    .line 51
    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;JLcom/google/common/a/ev;Lcom/google/common/a/es;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/c/b;",
            "J",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/server/FetchThreadResult;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 36
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 37
    iput-object p4, p0, Lcom/facebook/orca/server/SendBroadcastResult;->a:Lcom/google/common/a/ev;

    .line 38
    iput-object p5, p0, Lcom/facebook/orca/server/SendBroadcastResult;->b:Lcom/google/common/a/es;

    .line 39
    iput-object p6, p0, Lcom/facebook/orca/server/SendBroadcastResult;->c:Ljava/lang/String;

    .line 40
    iput p7, p0, Lcom/facebook/orca/server/SendBroadcastResult;->d:I

    .line 41
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->a:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public b()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/server/FetchThreadResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->b:Lcom/google/common/a/es;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->d:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 87
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 88
    iget-object v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->a:Lcom/google/common/a/ev;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 89
    iget-object v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->b:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 91
    iget v0, p0, Lcom/facebook/orca/server/SendBroadcastResult;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    return-void
.end method
