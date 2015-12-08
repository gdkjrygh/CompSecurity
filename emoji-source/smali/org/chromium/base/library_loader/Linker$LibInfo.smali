.class public Lorg/chromium/base/library_loader/Linker$LibInfo;
.super Ljava/lang/Object;
.source "Linker.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/library_loader/Linker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LibInfo"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lorg/chromium/base/library_loader/Linker$LibInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public mLoadAddress:J
    .annotation build Lorg/chromium/base/AccessedByNative;
    .end annotation
.end field

.field public mLoadSize:J
    .annotation build Lorg/chromium/base/AccessedByNative;
    .end annotation
.end field

.field public mRelroFd:I
    .annotation build Lorg/chromium/base/AccessedByNative;
    .end annotation
.end field

.field public mRelroSize:J
    .annotation build Lorg/chromium/base/AccessedByNative;
    .end annotation
.end field

.field public mRelroStart:J
    .annotation build Lorg/chromium/base/AccessedByNative;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 999
    new-instance v0, Lorg/chromium/base/library_loader/Linker$LibInfo$1;

    invoke-direct {v0}, Lorg/chromium/base/library_loader/Linker$LibInfo$1;-><init>()V

    sput-object v0, Lorg/chromium/base/library_loader/Linker$LibInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    .line 944
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 945
    iput-wide v0, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadAddress:J

    .line 946
    iput-wide v0, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadSize:J

    .line 947
    iput-wide v0, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroStart:J

    .line 948
    iput-wide v0, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroSize:J

    .line 949
    const/4 v0, -0x1

    iput v0, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroFd:I

    .line 950
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 964
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 965
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadAddress:J

    .line 966
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadSize:J

    .line 967
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroStart:J

    .line 968
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroSize:J

    .line 969
    invoke-virtual {p1}, Landroid/os/Parcel;->readFileDescriptor()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    .line 971
    .local v0, "fd":Landroid/os/ParcelFileDescriptor;
    if-nez v0, :cond_0

    const/4 v1, -0x1

    :goto_0
    iput v1, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroFd:I

    .line 972
    return-void

    .line 971
    :cond_0
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    move-result v1

    goto :goto_0
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 953
    iget v0, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroFd:I

    if-ltz v0, :cond_0

    .line 955
    :try_start_0
    iget v0, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroFd:I

    invoke-static {v0}, Landroid/os/ParcelFileDescriptor;->adoptFd(I)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 959
    :goto_0
    const/4 v0, -0x1

    iput v0, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroFd:I

    .line 961
    :cond_0
    return-void

    .line 956
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 995
    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .prologue
    .line 1014
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "[load=0x%x-0x%x relro=0x%x-0x%x fd=%d]"

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-wide v4, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadAddress:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-wide v4, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadAddress:J

    iget-wide v6, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadSize:J

    add-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget-wide v4, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroStart:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    iget-wide v4, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroStart:J

    iget-wide v6, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroSize:J

    add-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x4

    iget v4, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroFd:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 977
    iget v2, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroFd:I

    if-ltz v2, :cond_0

    .line 978
    iget-wide v2, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadAddress:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 979
    iget-wide v2, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadSize:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 980
    iget-wide v2, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroStart:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 981
    iget-wide v2, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroSize:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 983
    :try_start_0
    iget v2, p0, Lorg/chromium/base/library_loader/Linker$LibInfo;->mRelroFd:I

    invoke-static {v2}, Landroid/os/ParcelFileDescriptor;->fromFd(I)Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    .line 984
    .local v1, "fd":Landroid/os/ParcelFileDescriptor;
    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/os/ParcelFileDescriptor;->writeToParcel(Landroid/os/Parcel;I)V

    .line 985
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 990
    .end local v1    # "fd":Landroid/os/ParcelFileDescriptor;
    :cond_0
    :goto_0
    return-void

    .line 986
    :catch_0
    move-exception v0

    .line 987
    .local v0, "e":Ljava/io/IOException;
    const-string v2, "chromium_android_linker"

    const-string v3, "Cant\' write LibInfo file descriptor to parcel"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
