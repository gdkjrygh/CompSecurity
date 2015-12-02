.class public Lcom/facebook/orca/server/ReceiptResult;
.super Lcom/facebook/fbservice/c/a;
.source "ReceiptResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/ReceiptResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/facebook/orca/threads/ThreadSummary;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/facebook/orca/server/as;

    invoke-direct {v0}, Lcom/facebook/orca/server/as;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/ReceiptResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 29
    const-class v0, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    iput-object v0, p0, Lcom/facebook/orca/server/ReceiptResult;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 30
    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;J)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p3, p4}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 24
    iput-object p2, p0, Lcom/facebook/orca/server/ReceiptResult;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 25
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/server/ReceiptResult;->a:Lcom/facebook/orca/threads/ThreadSummary;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 54
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 55
    iget-object v0, p0, Lcom/facebook/orca/server/ReceiptResult;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 56
    return-void
.end method
