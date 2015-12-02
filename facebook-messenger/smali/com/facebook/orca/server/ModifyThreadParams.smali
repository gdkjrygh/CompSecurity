.class public Lcom/facebook/orca/server/ModifyThreadParams;
.super Ljava/lang/Object;
.source "ModifyThreadParams.java"

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
            "Lcom/facebook/orca/server/ModifyThreadParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Ljava/lang/String;

.field private final d:Lcom/facebook/ui/media/attachments/MediaResource;

.field private final e:Z

.field private final f:Z

.field private final g:Lcom/facebook/orca/notify/NotificationSetting;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 76
    new-instance v0, Lcom/facebook/orca/server/am;

    invoke-direct {v0}, Lcom/facebook/orca/server/am;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/ModifyThreadParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->a:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->b:Z

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->c:Ljava/lang/String;

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->e:Z

    .line 43
    const-class v0, Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    iput-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->d:Lcom/facebook/ui/media/attachments/MediaResource;

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    :goto_2
    iput-boolean v1, p0, Lcom/facebook/orca/server/ModifyThreadParams;->f:Z

    .line 45
    const-class v0, Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/NotificationSetting;

    iput-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->g:Lcom/facebook/orca/notify/NotificationSetting;

    .line 46
    return-void

    :cond_0
    move v0, v2

    .line 40
    goto :goto_0

    :cond_1
    move v0, v2

    .line 42
    goto :goto_1

    :cond_2
    move v1, v2

    .line 44
    goto :goto_2
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/am;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/ModifyThreadParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/server/an;)V
    .locals 2

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Lcom/facebook/orca/server/an;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "threadid must be specified"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    invoke-virtual {p1}, Lcom/facebook/orca/server/an;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->a:Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, Lcom/facebook/orca/server/an;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->b:Z

    .line 31
    invoke-virtual {p1}, Lcom/facebook/orca/server/an;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->c:Ljava/lang/String;

    .line 32
    invoke-virtual {p1}, Lcom/facebook/orca/server/an;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->e:Z

    .line 33
    invoke-virtual {p1}, Lcom/facebook/orca/server/an;->e()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->d:Lcom/facebook/ui/media/attachments/MediaResource;

    .line 34
    invoke-virtual {p1}, Lcom/facebook/orca/server/an;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->f:Z

    .line 35
    invoke-virtual {p1}, Lcom/facebook/orca/server/an;->g()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->g:Lcom/facebook/orca/notify/NotificationSetting;

    .line 36
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 53
    iget-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->b:Z

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->e:Z

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->d:Lcom/facebook/ui/media/attachments/MediaResource;

    return-object v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 69
    iget-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->f:Z

    return v0
.end method

.method public g()Lcom/facebook/orca/notify/NotificationSetting;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->g:Lcom/facebook/orca/notify/NotificationSetting;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 95
    iget-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->b:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 97
    iget-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->e:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->d:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 99
    iget-boolean v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->f:Z

    if-eqz v0, :cond_2

    :goto_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/server/ModifyThreadParams;->g:Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 101
    return-void

    :cond_0
    move v0, v2

    .line 95
    goto :goto_0

    :cond_1
    move v0, v2

    .line 97
    goto :goto_1

    :cond_2
    move v1, v2

    .line 99
    goto :goto_2
.end method
