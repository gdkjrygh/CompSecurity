.class public Lcom/facebook/bugreporter/ConstBugReporterConfig;
.super Ljava/lang/Object;
.source "ConstBugReporterConfig.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/facebook/bugreporter/l;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/bugreporter/ConstBugReporterConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 63
    new-instance v0, Lcom/facebook/bugreporter/y;

    invoke-direct {v0}, Lcom/facebook/bugreporter/y;-><init>()V

    sput-object v0, Lcom/facebook/bugreporter/ConstBugReporterConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    sget-object v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/ConstBugReporterConfig;->a:Lcom/google/common/a/es;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->createLongArray()[J

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/c/b;->a([J)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/ConstBugReporterConfig;->b:Lcom/google/common/a/fi;

    .line 40
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/bugreporter/y;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/ConstBugReporterConfig;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/bugreporter/l;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-interface {p1}, Lcom/facebook/bugreporter/l;->a()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/ConstBugReporterConfig;->a:Lcom/google/common/a/es;

    .line 34
    invoke-interface {p1}, Lcom/facebook/bugreporter/l;->b()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/ConstBugReporterConfig;->b:Lcom/google/common/a/fi;

    .line 35
    return-void
.end method

.method public static a(Lcom/facebook/bugreporter/l;)Lcom/facebook/bugreporter/ConstBugReporterConfig;
    .locals 1

    .prologue
    .line 23
    instance-of v0, p0, Lcom/facebook/bugreporter/ConstBugReporterConfig;

    if-eqz v0, :cond_0

    .line 24
    check-cast p0, Lcom/facebook/bugreporter/ConstBugReporterConfig;

    .line 26
    :goto_0
    return-object p0

    :cond_0
    new-instance v0, Lcom/facebook/bugreporter/ConstBugReporterConfig;

    invoke-direct {v0, p0}, Lcom/facebook/bugreporter/ConstBugReporterConfig;-><init>(Lcom/facebook/bugreporter/l;)V

    move-object p0, v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/bugreporter/ConstBugReporterConfig;->a:Lcom/google/common/a/es;

    return-object v0
.end method

.method public b()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/bugreporter/ConstBugReporterConfig;->b:Lcom/google/common/a/fi;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/bugreporter/ConstBugReporterConfig;->a:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 60
    iget-object v0, p0, Lcom/facebook/bugreporter/ConstBugReporterConfig;->b:Lcom/google/common/a/fi;

    invoke-static {v0}, Lcom/google/common/c/b;->a(Ljava/util/Collection;)[J

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeLongArray([J)V

    .line 61
    return-void
.end method
