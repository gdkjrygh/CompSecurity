.class public Lcom/facebook/location/GetDeviceLocationParams;
.super Ljava/lang/Object;
.source "GetDeviceLocationParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/location/GetDeviceLocationParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:J

.field public final b:J

.field public final c:F

.field public final d:J

.field public final e:F

.field public final f:J

.field public final g:F

.field public final h:J

.field public final i:F

.field public final j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 129
    new-instance v0, Lcom/facebook/location/n;

    invoke-direct {v0}, Lcom/facebook/location/n;-><init>()V

    sput-object v0, Lcom/facebook/location/GetDeviceLocationParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/location/GetDeviceLocationParams;->a:J

    .line 109
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/location/GetDeviceLocationParams;->b:J

    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    iput v1, p0, Lcom/facebook/location/GetDeviceLocationParams;->c:F

    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/location/GetDeviceLocationParams;->d:J

    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    iput v1, p0, Lcom/facebook/location/GetDeviceLocationParams;->e:F

    .line 113
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/location/GetDeviceLocationParams;->f:J

    .line 114
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    iput v1, p0, Lcom/facebook/location/GetDeviceLocationParams;->g:F

    .line 115
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/location/GetDeviceLocationParams;->h:J

    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    iput v1, p0, Lcom/facebook/location/GetDeviceLocationParams;->i:F

    .line 118
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 119
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 120
    invoke-static {v1}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/location/GetDeviceLocationParams;->j:Ljava/util/Set;

    .line 122
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->k:Z

    .line 123
    return-void

    .line 122
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/location/n;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/location/GetDeviceLocationParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/location/o;)V
    .locals 2

    .prologue
    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    invoke-virtual {p1}, Lcom/facebook/location/o;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->a:J

    .line 95
    invoke-virtual {p1}, Lcom/facebook/location/o;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->b:J

    .line 96
    invoke-virtual {p1}, Lcom/facebook/location/o;->c()F

    move-result v0

    iput v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->c:F

    .line 97
    invoke-virtual {p1}, Lcom/facebook/location/o;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->d:J

    .line 98
    invoke-virtual {p1}, Lcom/facebook/location/o;->e()F

    move-result v0

    iput v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->e:F

    .line 99
    invoke-virtual {p1}, Lcom/facebook/location/o;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->f:J

    .line 100
    invoke-virtual {p1}, Lcom/facebook/location/o;->g()F

    move-result v0

    iput v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->g:F

    .line 101
    invoke-virtual {p1}, Lcom/facebook/location/o;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->h:J

    .line 102
    invoke-virtual {p1}, Lcom/facebook/location/o;->i()F

    move-result v0

    iput v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->i:F

    .line 103
    invoke-virtual {p1}, Lcom/facebook/location/o;->j()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->j:Ljava/util/Set;

    .line 104
    invoke-virtual {p1}, Lcom/facebook/location/o;->k()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->k:Z

    .line 105
    return-void
.end method

.method public static newBuilder()Lcom/facebook/location/o;
    .locals 1

    .prologue
    .line 126
    new-instance v0, Lcom/facebook/location/o;

    invoke-direct {v0}, Lcom/facebook/location/o;-><init>()V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 147
    iget-wide v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 148
    iget-wide v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 149
    iget v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->c:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 150
    iget-wide v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 151
    iget v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->e:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 152
    iget-wide v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->f:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 153
    iget v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->g:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 154
    iget-wide v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->h:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 155
    iget v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->i:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 156
    iget-object v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->j:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 157
    iget-boolean v0, p0, Lcom/facebook/location/GetDeviceLocationParams;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 158
    return-void

    .line 157
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
