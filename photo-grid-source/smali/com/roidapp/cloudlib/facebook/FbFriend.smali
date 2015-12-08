.class public Lcom/roidapp/cloudlib/facebook/FbFriend;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/roidapp/cloudlib/facebook/FbFriend;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "id"
    .end annotation
.end field

.field private b:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "name"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    new-instance v0, Lcom/roidapp/cloudlib/facebook/n;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/facebook/n;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/facebook/FbFriend;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/facebook/FbFriend;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 8
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/FbFriend;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/facebook/FbFriend;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 8
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/FbFriend;->b:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public final a()Lcom/roidapp/cloudlib/facebook/FbFriend;
    .locals 2

    .prologue
    .line 17
    new-instance v0, Lcom/roidapp/cloudlib/facebook/FbFriend;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/facebook/FbFriend;-><init>()V

    .line 18
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbFriend;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/cloudlib/facebook/FbFriend;->a:Ljava/lang/String;

    .line 19
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbFriend;->b:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/cloudlib/facebook/FbFriend;->b:Ljava/lang/String;

    .line 20
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriend;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriend;->b:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriend;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriend;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 48
    return-void
.end method
