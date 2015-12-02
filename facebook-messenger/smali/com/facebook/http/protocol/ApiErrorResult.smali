.class public Lcom/facebook/http/protocol/ApiErrorResult;
.super Ljava/lang/Object;
.source "ApiErrorResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/http/protocol/ApiErrorResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/facebook/http/protocol/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 99
    new-instance v0, Lcom/facebook/http/protocol/c;

    invoke-direct {v0}, Lcom/facebook/http/protocol/c;-><init>()V

    sput-object v0, Lcom/facebook/http/protocol/ApiErrorResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lcom/facebook/http/protocol/d;->API_EC_DOMAIN:Lcom/facebook/http/protocol/d;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/http/protocol/ApiErrorResult;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/facebook/http/protocol/d;)V

    .line 63
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/facebook/http/protocol/d;)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput p1, p0, Lcom/facebook/http/protocol/ApiErrorResult;->a:I

    .line 71
    iput-object p2, p0, Lcom/facebook/http/protocol/ApiErrorResult;->b:Ljava/lang/String;

    .line 72
    iput-object p3, p0, Lcom/facebook/http/protocol/ApiErrorResult;->c:Ljava/lang/String;

    .line 73
    iput-object p4, p0, Lcom/facebook/http/protocol/ApiErrorResult;->d:Lcom/facebook/http/protocol/d;

    .line 74
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->a:I

    .line 78
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->b:Ljava/lang/String;

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->c:Ljava/lang/String;

    .line 80
    const-class v0, Lcom/facebook/http/protocol/d;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/d;

    iput-object v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->d:Lcom/facebook/http/protocol/d;

    .line 81
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/http/protocol/c;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1}, Lcom/facebook/http/protocol/ApiErrorResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 84
    iget v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->a:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/facebook/http/protocol/d;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->d:Lcom/facebook/http/protocol/d;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 114
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 119
    iget v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    iget-object v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lcom/facebook/http/protocol/ApiErrorResult;->d:Lcom/facebook/http/protocol/d;

    invoke-virtual {v0}, Lcom/facebook/http/protocol/d;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 123
    return-void
.end method
