.class public Lcom/facebook/orca/server/SendMessageByRecipientsParams;
.super Ljava/lang/Object;
.source "SendMessageByRecipientsParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/SendMessageByRecipientsParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/messages/model/threads/Message;

.field private final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/RecipientInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 61
    new-instance v0, Lcom/facebook/orca/server/aw;

    invoke-direct {v0}, Lcom/facebook/orca/server/aw;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->a:Ljava/lang/String;

    .line 37
    const-class v0, Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    iput-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->b:Lcom/facebook/messages/model/threads/Message;

    .line 38
    const-class v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->c:Lcom/google/common/a/es;

    .line 39
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/messages/model/threads/Message;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/RecipientInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->a:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->b:Lcom/facebook/messages/model/threads/Message;

    .line 32
    invoke-static {p3}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->c:Lcom/google/common/a/es;

    .line 33
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->b:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/RecipientInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->c:Lcom/google/common/a/es;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 74
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->b:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->c:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 82
    return-void
.end method
