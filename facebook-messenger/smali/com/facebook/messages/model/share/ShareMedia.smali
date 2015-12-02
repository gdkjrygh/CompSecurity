.class public Lcom/facebook/messages/model/share/ShareMedia;
.super Ljava/lang/Object;
.source "ShareMedia.java"

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
            "Lcom/facebook/messages/model/share/ShareMedia;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/facebook/messages/model/share/ShareMediaPhoto;

.field private final f:Lcom/facebook/messages/model/share/ShareMediaVideo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    new-instance v0, Lcom/facebook/messages/model/share/c;

    invoke-direct {v0}, Lcom/facebook/messages/model/share/c;-><init>()V

    sput-object v0, Lcom/facebook/messages/model/share/ShareMedia;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->a:Ljava/lang/String;

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->b:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->c:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->d:Ljava/lang/String;

    .line 37
    const-class v0, Lcom/facebook/messages/model/share/ShareMediaPhoto;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/share/ShareMediaPhoto;

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->e:Lcom/facebook/messages/model/share/ShareMediaPhoto;

    .line 38
    const-class v0, Lcom/facebook/messages/model/share/ShareMediaVideo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/share/ShareMediaVideo;

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->f:Lcom/facebook/messages/model/share/ShareMediaVideo;

    .line 39
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/messages/model/share/c;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/messages/model/share/ShareMedia;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/messages/model/share/d;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/d;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->a:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->b:Ljava/lang/String;

    .line 26
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/d;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->c:Ljava/lang/String;

    .line 27
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/d;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->d:Ljava/lang/String;

    .line 28
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/d;->e()Lcom/facebook/messages/model/share/ShareMediaPhoto;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->e:Lcom/facebook/messages/model/share/ShareMediaPhoto;

    .line 29
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/d;->f()Lcom/facebook/messages/model/share/ShareMediaVideo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->f:Lcom/facebook/messages/model/share/ShareMediaVideo;

    .line 30
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->d:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 78
    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/facebook/messages/model/share/ShareMediaPhoto;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->e:Lcom/facebook/messages/model/share/ShareMediaPhoto;

    return-object v0
.end method

.method public f()Lcom/facebook/messages/model/share/ShareMediaVideo;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->f:Lcom/facebook/messages/model/share/ShareMediaVideo;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->e:Lcom/facebook/messages/model/share/ShareMediaPhoto;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 88
    iget-object v0, p0, Lcom/facebook/messages/model/share/ShareMedia;->f:Lcom/facebook/messages/model/share/ShareMediaVideo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 89
    return-void
.end method
