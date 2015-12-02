.class public Lcom/facebook/messages/ipc/FrozenNewMessageNotification;
.super Ljava/lang/Object;
.source "FrozenNewMessageNotification.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/facebook/ipc/annotation/a;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lcom/facebook/ipc/annotation/a;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/facebook/messages/ipc/FrozenNewMessageNotification;",
        ">;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/messages/ipc/FrozenNewMessageNotification;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation
.end field

.field private final b:Ljava/lang/String;
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation
.end field

.field private final c:Ljava/lang/String;
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final d:Ljava/lang/String;
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final e:Ljava/lang/String;
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation
.end field

.field private final f:Ljava/lang/String;
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation
.end field

.field private final g:Landroid/app/PendingIntent;
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation
.end field

.field private final h:Ljava/lang/String;
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation
.end field

.field private final i:Ljava/lang/String;
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation
.end field

.field private final j:J
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation
.end field

.field private final k:J
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation
.end field

.field private final l:Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;
    .annotation runtime Lcom/facebook/ipc/annotation/FrozenField;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 220
    new-instance v0, Lcom/facebook/messages/ipc/b;

    invoke-direct {v0}, Lcom/facebook/messages/ipc/b;-><init>()V

    sput-object v0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;JJLcom/facebook/messages/ipc/FrozenGroupMessageInfo;)V
    .locals 1

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->a:Ljava/lang/String;

    .line 100
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->b:Ljava/lang/String;

    .line 101
    iput-object p3, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->c:Ljava/lang/String;

    .line 102
    iput-object p4, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->d:Ljava/lang/String;

    .line 103
    invoke-static {p5}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->e:Ljava/lang/String;

    .line 104
    invoke-static {p6}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->f:Ljava/lang/String;

    .line 105
    invoke-static {p7}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iput-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->g:Landroid/app/PendingIntent;

    .line 106
    invoke-static {p8}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->h:Ljava/lang/String;

    .line 107
    invoke-static {p9}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->i:Ljava/lang/String;

    .line 108
    iput-wide p10, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->j:J

    .line 109
    iput-wide p12, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->k:J

    .line 110
    iput-object p14, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->l:Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;

    .line 111
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/ipc/FrozenNewMessageNotification;)I
    .locals 4

    .prologue
    .line 262
    invoke-virtual {p0, p1}, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 263
    const/4 v0, 0x0

    .line 267
    :goto_0
    return v0

    :cond_0
    iget-wide v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->j:J

    iget-wide v2, p1, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->j:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    goto :goto_0
.end method

.method public a(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 142
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 143
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 145
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->g:Landroid/app/PendingIntent;

    invoke-static {v0, p1}, Landroid/app/PendingIntent;->writePendingIntentOrNullToParcel(Landroid/app/PendingIntent;Landroid/os/Parcel;)V

    .line 150
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 152
    iget-wide v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->j:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 153
    iget-wide v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->k:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 154
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->l:Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 155
    return-void
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 24
    check-cast p1, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;

    invoke-virtual {p0, p1}, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->a(Lcom/facebook/messages/ipc/FrozenNewMessageNotification;)I

    move-result v0

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 237
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 245
    instance-of v0, p1, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;

    if-nez v0, :cond_0

    .line 246
    const/4 v0, 0x0

    .line 250
    :goto_0
    return v0

    .line 249
    :cond_0
    check-cast p1, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;

    .line 250
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->a:Ljava/lang/String;

    iget-object v1, p1, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 255
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 137
    invoke-static {p1, p2, p0}, Lcom/facebook/ipc/annotation/b;->a(Landroid/os/Parcel;ILcom/facebook/ipc/annotation/a;)V

    .line 138
    return-void
.end method
