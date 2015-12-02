.class final Lcom/facebook/bugreporter/a;
.super Ljava/lang/Object;
.source "BugReport.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/bugreporter/BugReport;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/bugreporter/BugReport;
    .locals 2

    .prologue
    .line 249
    new-instance v0, Lcom/facebook/bugreporter/BugReport;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/bugreporter/BugReport;-><init>(Landroid/os/Parcel;Lcom/facebook/bugreporter/a;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/bugreporter/BugReport;
    .locals 1

    .prologue
    .line 253
    new-array v0, p1, [Lcom/facebook/bugreporter/BugReport;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 247
    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/a;->a(Landroid/os/Parcel;)Lcom/facebook/bugreporter/BugReport;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 247
    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/a;->a(I)[Lcom/facebook/bugreporter/BugReport;

    move-result-object v0

    return-object v0
.end method
