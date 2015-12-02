.class public Lcom/facebook/location/Coordinates;
.super Ljava/lang/Object;
.source "Coordinates.java"

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
            "Lcom/facebook/location/Coordinates;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:D

.field private final b:D

.field private final c:Ljava/lang/Double;

.field private final d:Ljava/lang/Float;

.field private final e:Ljava/lang/Float;

.field private final f:Ljava/lang/Float;

.field private final g:Ljava/lang/Float;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 123
    new-instance v0, Lcom/facebook/location/a;

    invoke-direct {v0}, Lcom/facebook/location/a;-><init>()V

    sput-object v0, Lcom/facebook/location/Coordinates;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/Coordinates;->a:D

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/Coordinates;->b:D

    .line 40
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    iput-object v0, p0, Lcom/facebook/location/Coordinates;->c:Ljava/lang/Double;

    .line 41
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    iput-object v0, p0, Lcom/facebook/location/Coordinates;->d:Ljava/lang/Float;

    .line 42
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    iput-object v0, p0, Lcom/facebook/location/Coordinates;->e:Ljava/lang/Float;

    .line 43
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    iput-object v0, p0, Lcom/facebook/location/Coordinates;->f:Ljava/lang/Float;

    .line 44
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    iput-object v0, p0, Lcom/facebook/location/Coordinates;->g:Ljava/lang/Float;

    .line 45
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/location/a;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/location/Coordinates;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/location/b;)V
    .locals 2

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-virtual {p1}, Lcom/facebook/location/b;->a()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/location/b;->b()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 28
    invoke-virtual {p1}, Lcom/facebook/location/b;->a()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/Coordinates;->a:D

    .line 29
    invoke-virtual {p1}, Lcom/facebook/location/b;->b()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/location/Coordinates;->b:D

    .line 30
    invoke-virtual {p1}, Lcom/facebook/location/b;->c()Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/Coordinates;->c:Ljava/lang/Double;

    .line 31
    invoke-virtual {p1}, Lcom/facebook/location/b;->d()Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/Coordinates;->d:Ljava/lang/Float;

    .line 32
    invoke-virtual {p1}, Lcom/facebook/location/b;->e()Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/Coordinates;->e:Ljava/lang/Float;

    .line 33
    invoke-virtual {p1}, Lcom/facebook/location/b;->f()Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/Coordinates;->f:Ljava/lang/Float;

    .line 34
    invoke-virtual {p1}, Lcom/facebook/location/b;->g()Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/Coordinates;->g:Ljava/lang/Float;

    .line 35
    return-void

    .line 27
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/location/Location;)Lcom/facebook/location/Coordinates;
    .locals 3

    .prologue
    .line 52
    if-nez p0, :cond_0

    .line 53
    const/4 v0, 0x0

    .line 55
    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/facebook/location/Coordinates;->newBuilder()Lcom/facebook/location/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/location/b;->a(Ljava/lang/Double;)Lcom/facebook/location/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/location/b;->b(Ljava/lang/Double;)Lcom/facebook/location/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/location/Location;->getAltitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/location/b;->c(Ljava/lang/Double;)Lcom/facebook/location/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/location/b;->a(Ljava/lang/Float;)Lcom/facebook/location/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/location/Location;->getBearing()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/location/b;->c(Ljava/lang/Float;)Lcom/facebook/location/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/location/Location;->getSpeed()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/location/b;->d(Ljava/lang/Float;)Lcom/facebook/location/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/location/b;->h()Lcom/facebook/location/Coordinates;

    move-result-object v0

    goto :goto_0
.end method

.method public static newBuilder()Lcom/facebook/location/b;
    .locals 1

    .prologue
    .line 48
    new-instance v0, Lcom/facebook/location/b;

    invoke-direct {v0}, Lcom/facebook/location/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/location/Location;
    .locals 3

    .prologue
    .line 66
    new-instance v0, Landroid/location/Location;

    const-string v1, ""

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 67
    iget-wide v1, p0, Lcom/facebook/location/Coordinates;->a:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLatitude(D)V

    .line 68
    iget-wide v1, p0, Lcom/facebook/location/Coordinates;->b:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    .line 69
    iget-object v1, p0, Lcom/facebook/location/Coordinates;->c:Ljava/lang/Double;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/location/Coordinates;->c:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setAltitude(D)V

    .line 70
    :cond_0
    iget-object v1, p0, Lcom/facebook/location/Coordinates;->d:Ljava/lang/Float;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/facebook/location/Coordinates;->d:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/location/Location;->setAccuracy(F)V

    .line 71
    :cond_1
    iget-object v1, p0, Lcom/facebook/location/Coordinates;->g:Ljava/lang/Float;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/location/Coordinates;->g:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/location/Location;->setSpeed(F)V

    .line 72
    :cond_2
    return-object v0
.end method

.method public b()D
    .locals 2

    .prologue
    .line 76
    iget-wide v0, p0, Lcom/facebook/location/Coordinates;->a:D

    return-wide v0
.end method

.method public c()D
    .locals 2

    .prologue
    .line 80
    iget-wide v0, p0, Lcom/facebook/location/Coordinates;->b:D

    return-wide v0
.end method

.method public d()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->c:Ljava/lang/Double;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 136
    const/4 v0, 0x0

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->c:Ljava/lang/Double;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Ljava/lang/Float;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->d:Ljava/lang/Float;

    return-object v0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->d:Ljava/lang/Float;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()Ljava/lang/Float;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->e:Ljava/lang/Float;

    return-object v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->e:Ljava/lang/Float;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Ljava/lang/Float;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->f:Ljava/lang/Float;

    return-object v0
.end method

.method public k()Z
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->f:Ljava/lang/Float;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public l()Ljava/lang/Float;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->g:Ljava/lang/Float;

    return-object v0
.end method

.method public m()Z
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->g:Ljava/lang/Float;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 141
    iget-wide v0, p0, Lcom/facebook/location/Coordinates;->a:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 142
    iget-wide v0, p0, Lcom/facebook/location/Coordinates;->b:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 143
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->c:Ljava/lang/Double;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->d:Ljava/lang/Float;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->e:Ljava/lang/Float;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->f:Ljava/lang/Float;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 147
    iget-object v0, p0, Lcom/facebook/location/Coordinates;->g:Ljava/lang/Float;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 148
    return-void
.end method
