.class public Lcom/facebook/bugreporter/activity/tasklist/Task;
.super Ljava/lang/Object;
.source "Task.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/facebook/common/json/jsonmirror/JMStaticKeysDictDestination;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/bugreporter/activity/tasklist/Task;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "task_id"
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "task_number"
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "task_title"
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "task_desc"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    new-instance v0, Lcom/facebook/bugreporter/activity/tasklist/a;

    invoke-direct {v0}, Lcom/facebook/bugreporter/activity/tasklist/a;-><init>()V

    sput-object v0, Lcom/facebook/bugreporter/activity/tasklist/Task;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-string v0, "-1"

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->a:Ljava/lang/String;

    .line 34
    const-string v0, "-1"

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->b:Ljava/lang/String;

    .line 35
    iput-object v1, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->c:Ljava/lang/String;

    .line 36
    iput-object v1, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->d:Ljava/lang/String;

    .line 37
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->a:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->b:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->c:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->d:Ljava/lang/String;

    .line 51
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/bugreporter/activity/tasklist/a;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/activity/tasklist/Task;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->a:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->b:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->c:Ljava/lang/String;

    .line 43
    iput-object p4, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->d:Ljava/lang/String;

    .line 44
    return-void
.end method


# virtual methods
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
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/Task;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 75
    return-void
.end method
