.class public Lcom/facebook/orca/server/NewMessageResult;
.super Lcom/facebook/fbservice/c/a;
.source "NewMessageResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/NewMessageResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/messages/model/threads/Message;

.field private final c:Lcom/facebook/orca/threads/MessagesCollection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    new-instance v0, Lcom/facebook/orca/server/ap;

    invoke-direct {v0}, Lcom/facebook/orca/server/ap;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/NewMessageResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/NewMessageResult;->a:Ljava/lang/String;

    .line 37
    const-class v0, Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    iput-object v0, p0, Lcom/facebook/orca/server/NewMessageResult;->b:Lcom/facebook/messages/model/threads/Message;

    .line 38
    const-class v0, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/MessagesCollection;

    iput-object v0, p0, Lcom/facebook/orca/server/NewMessageResult;->c:Lcom/facebook/orca/threads/MessagesCollection;

    .line 39
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/ap;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/NewMessageResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;J)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p5, p6}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 29
    iput-object p2, p0, Lcom/facebook/orca/server/NewMessageResult;->a:Ljava/lang/String;

    .line 30
    iput-object p3, p0, Lcom/facebook/orca/server/NewMessageResult;->b:Lcom/facebook/messages/model/threads/Message;

    .line 31
    iput-object p4, p0, Lcom/facebook/orca/server/NewMessageResult;->c:Lcom/facebook/orca/threads/MessagesCollection;

    .line 32
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/server/NewMessageResult;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/server/NewMessageResult;->b:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public c()Lcom/facebook/orca/threads/MessagesCollection;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/server/NewMessageResult;->c:Lcom/facebook/orca/threads/MessagesCollection;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 71
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/server/NewMessageResult;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/facebook/orca/server/NewMessageResult;->b:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/server/NewMessageResult;->c:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 75
    return-void
.end method
