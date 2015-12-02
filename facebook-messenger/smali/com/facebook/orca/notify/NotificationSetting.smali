.class public Lcom/facebook/orca/notify/NotificationSetting;
.super Ljava/lang/Object;
.source "NotificationSetting.java"

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
            "Lcom/facebook/orca/notify/NotificationSetting;",
            ">;"
        }
    .end annotation
.end field

.field public static a:Lcom/facebook/orca/notify/NotificationSetting;

.field public static b:Lcom/facebook/orca/notify/NotificationSetting;


# instance fields
.field private final c:Z

.field private final d:J

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const-wide/16 v3, 0x0

    const/4 v2, 0x0

    .line 20
    new-instance v0, Lcom/facebook/orca/notify/NotificationSetting;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/facebook/orca/notify/NotificationSetting;-><init>(ZJZ)V

    sput-object v0, Lcom/facebook/orca/notify/NotificationSetting;->a:Lcom/facebook/orca/notify/NotificationSetting;

    .line 21
    new-instance v0, Lcom/facebook/orca/notify/NotificationSetting;

    invoke-direct {v0, v2, v3, v4, v2}, Lcom/facebook/orca/notify/NotificationSetting;-><init>(ZJZ)V

    sput-object v0, Lcom/facebook/orca/notify/NotificationSetting;->b:Lcom/facebook/orca/notify/NotificationSetting;

    .line 73
    new-instance v0, Lcom/facebook/orca/notify/ar;

    invoke-direct {v0}, Lcom/facebook/orca/notify/ar;-><init>()V

    sput-object v0, Lcom/facebook/orca/notify/NotificationSetting;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/notify/NotificationSetting;->c:Z

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/orca/notify/NotificationSetting;->d:J

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/facebook/orca/notify/NotificationSetting;->e:Z

    .line 51
    return-void

    :cond_0
    move v0, v2

    .line 48
    goto :goto_0

    :cond_1
    move v1, v2

    .line 50
    goto :goto_1
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/notify/ar;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/NotificationSetting;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(ZJZ)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-boolean p1, p0, Lcom/facebook/orca/notify/NotificationSetting;->c:Z

    .line 43
    iput-wide p2, p0, Lcom/facebook/orca/notify/NotificationSetting;->d:J

    .line 44
    iput-boolean p4, p0, Lcom/facebook/orca/notify/NotificationSetting;->e:Z

    .line 45
    return-void
.end method

.method public static a(J)Lcom/facebook/orca/notify/NotificationSetting;
    .locals 3

    .prologue
    .line 24
    new-instance v0, Lcom/facebook/orca/notify/NotificationSetting;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, p1, v2}, Lcom/facebook/orca/notify/NotificationSetting;-><init>(ZJZ)V

    return-object v0
.end method

.method public static b(J)Lcom/facebook/orca/notify/NotificationSetting;
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v3, 0x1

    .line 28
    const-wide/16 v0, -0x1

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    .line 29
    sget-object v0, Lcom/facebook/orca/notify/NotificationSetting;->b:Lcom/facebook/orca/notify/NotificationSetting;

    .line 36
    :goto_0
    return-object v0

    .line 30
    :cond_0
    cmp-long v0, p0, v4

    if-nez v0, :cond_1

    .line 31
    sget-object v0, Lcom/facebook/orca/notify/NotificationSetting;->a:Lcom/facebook/orca/notify/NotificationSetting;

    goto :goto_0

    .line 33
    :cond_1
    cmp-long v0, p0, v4

    if-gez v0, :cond_2

    .line 34
    new-instance v0, Lcom/facebook/orca/notify/NotificationSetting;

    neg-long v1, p0

    invoke-direct {v0, v3, v1, v2, v3}, Lcom/facebook/orca/notify/NotificationSetting;-><init>(ZJZ)V

    goto :goto_0

    .line 36
    :cond_2
    new-instance v0, Lcom/facebook/orca/notify/NotificationSetting;

    const/4 v1, 0x0

    invoke-direct {v0, v3, p0, p1, v1}, Lcom/facebook/orca/notify/NotificationSetting;-><init>(ZJZ)V

    goto :goto_0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Lcom/facebook/orca/notify/NotificationSetting;->c:Z

    return v0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 58
    iget-wide v0, p0, Lcom/facebook/orca/notify/NotificationSetting;->d:J

    return-wide v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/facebook/orca/notify/NotificationSetting;->e:Z

    return v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 66
    iget-boolean v0, p0, Lcom/facebook/orca/notify/NotificationSetting;->c:Z

    if-eqz v0, :cond_0

    .line 67
    iget-wide v0, p0, Lcom/facebook/orca/notify/NotificationSetting;->d:J

    .line 69
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 86
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 91
    iget-boolean v0, p0, Lcom/facebook/orca/notify/NotificationSetting;->c:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    iget-wide v3, p0, Lcom/facebook/orca/notify/NotificationSetting;->d:J

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 93
    iget-boolean v0, p0, Lcom/facebook/orca/notify/NotificationSetting;->e:Z

    if-eqz v0, :cond_1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 94
    return-void

    :cond_0
    move v0, v2

    .line 91
    goto :goto_0

    :cond_1
    move v1, v2

    .line 93
    goto :goto_1
.end method
