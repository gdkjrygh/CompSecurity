.class public Lcom/facebook/messages/model/threads/SendError;
.super Ljava/lang/Object;
.source "SendError.java"

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
            "Lcom/facebook/messages/model/threads/SendError;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lcom/facebook/messages/model/threads/SendError;

.field public static final b:Lcom/facebook/messages/model/threads/SendError;

.field public static final c:Lcom/facebook/messages/model/threads/SendError;

.field public static final d:Lcom/facebook/messages/model/threads/SendError;

.field public static final e:Lcom/facebook/messages/model/threads/SendError;

.field public static final f:Lcom/facebook/messages/model/threads/SendError;

.field public static final g:Lcom/facebook/messages/model/threads/SendError;

.field private static final h:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/messages/model/threads/SendError;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final i:Ljava/lang/String;

.field private final j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v2, 0x1

    .line 20
    new-instance v0, Lcom/facebook/messages/model/threads/SendError;

    const-string v1, "none"

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/model/threads/SendError;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/facebook/messages/model/threads/SendError;->a:Lcom/facebook/messages/model/threads/SendError;

    .line 21
    new-instance v0, Lcom/facebook/messages/model/threads/SendError;

    const-string v1, "create_thread_failed"

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/model/threads/SendError;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/facebook/messages/model/threads/SendError;->b:Lcom/facebook/messages/model/threads/SendError;

    .line 22
    new-instance v0, Lcom/facebook/messages/model/threads/SendError;

    const-string v1, "broadcast_message_failed"

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/model/threads/SendError;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/facebook/messages/model/threads/SendError;->c:Lcom/facebook/messages/model/threads/SendError;

    .line 24
    new-instance v0, Lcom/facebook/messages/model/threads/SendError;

    const-string v1, "other_message_from_thread_failed"

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/model/threads/SendError;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/facebook/messages/model/threads/SendError;->d:Lcom/facebook/messages/model/threads/SendError;

    .line 26
    new-instance v0, Lcom/facebook/messages/model/threads/SendError;

    const-string v1, "pending_send_on_startup"

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/model/threads/SendError;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/facebook/messages/model/threads/SendError;->e:Lcom/facebook/messages/model/threads/SendError;

    .line 28
    new-instance v0, Lcom/facebook/messages/model/threads/SendError;

    const-string v1, "photo_upload_failed"

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/model/threads/SendError;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/facebook/messages/model/threads/SendError;->f:Lcom/facebook/messages/model/threads/SendError;

    .line 30
    new-instance v0, Lcom/facebook/messages/model/threads/SendError;

    const-string v1, "unknown"

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/model/threads/SendError;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/facebook/messages/model/threads/SendError;->g:Lcom/facebook/messages/model/threads/SendError;

    .line 32
    sget-object v0, Lcom/facebook/messages/model/threads/SendError;->a:Lcom/facebook/messages/model/threads/SendError;

    sget-object v1, Lcom/facebook/messages/model/threads/SendError;->d:Lcom/facebook/messages/model/threads/SendError;

    sget-object v2, Lcom/facebook/messages/model/threads/SendError;->e:Lcom/facebook/messages/model/threads/SendError;

    sget-object v3, Lcom/facebook/messages/model/threads/SendError;->f:Lcom/facebook/messages/model/threads/SendError;

    sget-object v4, Lcom/facebook/messages/model/threads/SendError;->g:Lcom/facebook/messages/model/threads/SendError;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/model/threads/SendError;->h:Lcom/google/common/a/fi;

    .line 77
    new-instance v0, Lcom/facebook/messages/model/threads/h;

    invoke-direct {v0}, Lcom/facebook/messages/model/threads/h;-><init>()V

    sput-object v0, Lcom/facebook/messages/model/threads/SendError;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/SendError;->i:Ljava/lang/String;

    .line 66
    invoke-static {p1}, Lcom/facebook/common/parcels/a;->a(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/messages/model/threads/SendError;->j:Z

    .line 67
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/messages/model/threads/h;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/messages/model/threads/SendError;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/facebook/messages/model/threads/SendError;->i:Ljava/lang/String;

    .line 61
    iput-boolean p2, p0, Lcom/facebook/messages/model/threads/SendError;->j:Z

    .line 62
    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/SendError;
    .locals 3

    .prologue
    .line 51
    sget-object v0, Lcom/facebook/messages/model/threads/SendError;->h:Lcom/google/common/a/fi;

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/SendError;

    .line 52
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/SendError;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 56
    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lcom/facebook/messages/model/threads/SendError;->g:Lcom/facebook/messages/model/threads/SendError;

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/messages/model/threads/SendError;->i:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/messages/model/threads/SendError;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 98
    iget-boolean v0, p0, Lcom/facebook/messages/model/threads/SendError;->j:Z

    invoke-static {p1, v0}, Lcom/facebook/common/parcels/a;->a(Landroid/os/Parcel;Z)V

    .line 99
    return-void
.end method
