.class public Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;
.super Ljava/lang/Object;
.source "CategoryInfo.java"

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
            "Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    new-instance v0, Lcom/facebook/bugreporter/activity/categorylist/a;

    invoke-direct {v0}, Lcom/facebook/bugreporter/activity/categorylist/a;-><init>()V

    sput-object v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->a:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->b:J

    .line 37
    const/4 v0, 0x1

    new-array v0, v0, [Z

    .line 38
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBooleanArray([Z)V

    .line 39
    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    iput-boolean v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->c:Z

    .line 40
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/bugreporter/activity/categorylist/a;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->a:Ljava/lang/String;

    .line 30
    iput-wide p2, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->b:J

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->c:Z

    .line 32
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 64
    iget-wide v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 65
    const/4 v0, 0x1

    new-array v0, v0, [Z

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->c:Z

    aput-boolean v2, v0, v1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBooleanArray([Z)V

    .line 66
    return-void
.end method
