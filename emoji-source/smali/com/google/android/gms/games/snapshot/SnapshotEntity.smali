.class public final Lcom/google/android/gms/games/snapshot/SnapshotEntity;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
.implements Lcom/google/android/gms/games/snapshot/Snapshot;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/games/snapshot/SnapshotEntityCreator;

.field private static final Ue:Ljava/lang/Object;


# instance fields
.field private HG:Lcom/google/android/gms/drive/Contents;

.field private final Uf:Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

.field private final xM:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->Ue:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotEntityCreator;

    invoke-direct {v0}, Lcom/google/android/gms/games/snapshot/SnapshotEntityCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->CREATOR:Lcom/google/android/gms/games/snapshot/SnapshotEntityCreator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/games/snapshot/SnapshotMetadata;Lcom/google/android/gms/drive/Contents;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "metadata"    # Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    .param p3, "contents"    # Lcom/google/android/gms/drive/Contents;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->xM:I

    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

    invoke-direct {v0, p2}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;-><init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->Uf:Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

    iput-object p3, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->HG:Lcom/google/android/gms/drive/Contents;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;Lcom/google/android/gms/drive/Contents;)V
    .locals 1
    .param p1, "metadata"    # Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    .param p2, "contents"    # Lcom/google/android/gms/drive/Contents;

    .prologue
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;-><init>(ILcom/google/android/gms/games/snapshot/SnapshotMetadata;Lcom/google/android/gms/drive/Contents;)V

    return-void
.end method

.method private a(I[BIIZ)Z
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->HG:Lcom/google/android/gms/drive/Contents;

    const-string v1, "Must provide a previously opened Snapshot"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->Ue:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->HG:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2

    int-to-long v4, p1

    invoke-virtual {v2, v4, v5}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {v0, p2, p3, p4}, Ljava/io/OutputStream;->write([BII)V

    if-eqz p5, :cond_0

    array-length v3, p2

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    :cond_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x1

    :try_start_2
    monitor-exit v1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v2, "Snapshot"

    const-string v3, "Failed to write snapshot data"

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/games/internal/GamesLog;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method static a(Lcom/google/android/gms/games/snapshot/Snapshot;Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    instance-of v2, p1, Lcom/google/android/gms/games/snapshot/Snapshot;

    if-nez v2, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eq p0, p1, :cond_0

    check-cast p1, Lcom/google/android/gms/games/snapshot/Snapshot;

    invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/hk;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/Snapshot;->getContents()Lcom/google/android/gms/drive/Contents;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getContents()Lcom/google/android/gms/drive/Contents;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/hk;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method static b(Lcom/google/android/gms/games/snapshot/Snapshot;)I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getContents()Lcom/google/android/gms/drive/Contents;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/hk;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static c(Lcom/google/android/gms/games/snapshot/Snapshot;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/hk;->e(Ljava/lang/Object;)Lcom/google/android/gms/internal/hk$a;

    move-result-object v0

    const-string v1, "Metadata"

    invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/hk$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/hk$a;

    move-result-object v1

    const-string v2, "HasContents"

    invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getContents()Lcom/google/android/gms/drive/Contents;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/hk$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/hk$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hk$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    invoke-static {p0, p1}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->a(Lcom/google/android/gms/games/snapshot/Snapshot;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public freeze()Lcom/google/android/gms/games/snapshot/Snapshot;
    .locals 0

    return-object p0
.end method

.method public bridge synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->freeze()Lcom/google/android/gms/games/snapshot/Snapshot;

    move-result-object v0

    return-object v0
.end method

.method public getContents()Lcom/google/android/gms/drive/Contents;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->HG:Lcom/google/android/gms/drive/Contents;

    return-object v0
.end method

.method public getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->Uf:Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->xM:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->b(Lcom/google/android/gms/games/snapshot/Snapshot;)I

    move-result v0

    return v0
.end method

.method public iM()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->HG:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->HG:Lcom/google/android/gms/drive/Contents;

    return-void
.end method

.method public isDataValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public modifyBytes(I[BII)Z
    .locals 6
    .param p1, "dstOffset"    # I
    .param p2, "content"    # [B
    .param p3, "srcOffset"    # I
    .param p4, "count"    # I

    .prologue
    array-length v4, p2

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->a(I[BIIZ)Z

    move-result v0

    return v0
.end method

.method public readFully()[B
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->HG:Lcom/google/android/gms/drive/Contents;

    const-string v1, "Must provide a previously opened Snapshot"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->Ue:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->HG:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    new-instance v2, Ljava/io/FileInputStream;

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-direct {v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v4, v5}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    const/4 v0, 0x0

    :try_start_2
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ik;->a(Ljava/io/InputStream;Z)[B

    move-result-object v0

    invoke-virtual {v2}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v4, v5}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit v1

    return-object v0

    :catch_0
    move-exception v0

    const-string v4, "Snapshot"

    const-string v5, "Failed to read snapshot data"

    invoke-static {v4, v5, v0}, Lcom/google/android/gms/games/internal/GamesLog;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :catch_1
    move-exception v0

    :try_start_4
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->c(Lcom/google/android/gms/games/snapshot/Snapshot;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeBytes([B)Z
    .locals 6
    .param p1, "content"    # [B

    .prologue
    const/4 v1, 0x0

    array-length v4, p1

    const/4 v5, 0x1

    move-object v0, p0

    move-object v2, p1

    move v3, v1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->a(I[BIIZ)Z

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/snapshot/SnapshotEntityCreator;->a(Lcom/google/android/gms/games/snapshot/SnapshotEntity;Landroid/os/Parcel;I)V

    return-void
.end method
