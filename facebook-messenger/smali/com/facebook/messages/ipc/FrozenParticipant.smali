.class public Lcom/facebook/messages/ipc/FrozenParticipant;
.super Ljava/lang/Object;
.source "FrozenParticipant.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/facebook/ipc/annotation/a;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/messages/ipc/FrozenParticipant;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 72
    new-instance v0, Lcom/facebook/messages/ipc/d;

    invoke-direct {v0}, Lcom/facebook/messages/ipc/d;-><init>()V

    sput-object v0, Lcom/facebook/messages/ipc/FrozenParticipant;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/messages/ipc/FrozenParticipant;->a:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lcom/facebook/messages/ipc/FrozenParticipant;->b:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 55
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenParticipant;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lcom/facebook/messages/ipc/FrozenParticipant;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 57
    return-void
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 69
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 49
    invoke-static {p1, p2, p0}, Lcom/facebook/ipc/annotation/b;->a(Landroid/os/Parcel;ILcom/facebook/ipc/annotation/a;)V

    .line 50
    return-void
.end method
