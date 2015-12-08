.class public final Lcom/google/android/gms/internal/ig;
.super Lcom/google/android/gms/common/data/b;

# interfaces
.implements Lcom/google/android/gms/plus/model/moments/Moment;


# instance fields
.field private VG:Lcom/google/android/gms/internal/ie;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/b;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-void
.end method

.method private ju()Lcom/google/android/gms/internal/ie;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ig;->VG:Lcom/google/android/gms/internal/ie;

    if-nez v0, :cond_0

    const-string v0, "momentImpl"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ig;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v0

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Parcel;->unmarshall([BII)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    sget-object v0, Lcom/google/android/gms/internal/ie;->CREATOR:Lcom/google/android/gms/internal/if;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/if;->aM(Landroid/os/Parcel;)Lcom/google/android/gms/internal/ie;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ig;->VG:Lcom/google/android/gms/internal/ie;

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ig;->VG:Lcom/google/android/gms/internal/ie;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ig;->jt()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResult()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->getResult()Lcom/google/android/gms/plus/model/moments/ItemScope;

    move-result-object v0

    return-object v0
.end method

.method public getStartDate()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->getStartDate()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTarget()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->getTarget()Lcom/google/android/gms/plus/model/moments/ItemScope;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hasId()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->hasId()Z

    move-result v0

    return v0
.end method

.method public hasResult()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->hasId()Z

    move-result v0

    return v0
.end method

.method public hasStartDate()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->hasStartDate()Z

    move-result v0

    return v0
.end method

.method public hasTarget()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->hasTarget()Z

    move-result v0

    return v0
.end method

.method public hasType()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->hasType()Z

    move-result v0

    return v0
.end method

.method public jt()Lcom/google/android/gms/internal/ie;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ig;->ju()Lcom/google/android/gms/internal/ie;

    move-result-object v0

    return-object v0
.end method
