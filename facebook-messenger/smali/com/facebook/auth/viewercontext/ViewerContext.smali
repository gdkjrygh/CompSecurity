.class public Lcom/facebook/auth/viewercontext/ViewerContext;
.super Ljava/lang/Object;
.source "ViewerContext.java"

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
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Z

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 128
    new-instance v0, Lcom/facebook/auth/viewercontext/b;

    invoke-direct {v0}, Lcom/facebook/auth/viewercontext/b;-><init>()V

    sput-object v0, Lcom/facebook/auth/viewercontext/ViewerContext;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->a:Ljava/lang/String;

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->b:Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->c:Ljava/lang/String;

    .line 48
    invoke-static {p1}, Lcom/facebook/common/parcels/a;->a(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->d:Z

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->e:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->f:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->g:Ljava/lang/String;

    .line 52
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/auth/viewercontext/b;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lcom/facebook/auth/viewercontext/ViewerContext;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/auth/viewercontext/c;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-virtual {p1}, Lcom/facebook/auth/viewercontext/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->a:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Lcom/facebook/auth/viewercontext/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->b:Ljava/lang/String;

    .line 37
    invoke-virtual {p1}, Lcom/facebook/auth/viewercontext/c;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->c:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Lcom/facebook/auth/viewercontext/c;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->d:Z

    .line 39
    invoke-virtual {p1}, Lcom/facebook/auth/viewercontext/c;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->e:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Lcom/facebook/auth/viewercontext/c;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->f:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Lcom/facebook/auth/viewercontext/c;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->g:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public static newBuilder()Lcom/facebook/auth/viewercontext/c;
    .locals 1

    .prologue
    .line 60
    new-instance v0, Lcom/facebook/auth/viewercontext/c;

    invoke-direct {v0}, Lcom/facebook/auth/viewercontext/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 96
    iget-boolean v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->d:Z

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 150
    iget-boolean v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->d:Z

    invoke-static {p1, v0}, Lcom/facebook/common/parcels/a;->a(Landroid/os/Parcel;Z)V

    .line 151
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/ViewerContext;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 154
    return-void
.end method
