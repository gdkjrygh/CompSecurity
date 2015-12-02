.class public Lcom/facebook/ipc/annotation/b;
.super Ljava/lang/Object;
.source "FrozenParcelableUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/os/Parcel;Ljava/lang/Class;)Landroid/os/Parcelable;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">(",
            "Landroid/os/Parcel;",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    .line 53
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    .line 54
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 58
    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Landroid/os/Parcel;

    aput-object v4, v0, v3

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 65
    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 69
    const/4 v3, 0x1

    :try_start_1
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3

    .line 78
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    .line 79
    add-int v4, v1, v2

    if-le v3, v4, :cond_0

    .line 80
    new-instance v0, Landroid/os/BadParcelableException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " constructor read too far in Parcel, Parcel corrupted."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :catch_0
    move-exception v0

    .line 60
    new-instance v1, Landroid/os/BadParcelableException;

    invoke-direct {v1, v0}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 70
    :catch_1
    move-exception v0

    .line 71
    new-instance v1, Landroid/os/BadParcelableException;

    invoke-direct {v1, v0}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 72
    :catch_2
    move-exception v0

    .line 73
    new-instance v1, Landroid/os/BadParcelableException;

    invoke-direct {v1, v0}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 74
    :catch_3
    move-exception v0

    .line 75
    new-instance v1, Landroid/os/BadParcelableException;

    invoke-direct {v1, v0}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 82
    :cond_0
    add-int v4, v1, v2

    if-ge v3, v4, :cond_1

    .line 83
    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 86
    :cond_1
    return-object v0
.end method

.method public static a(Landroid/os/Parcel;ILcom/facebook/ipc/annotation/a;)V
    .locals 2

    .prologue
    .line 30
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    .line 31
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    invoke-interface {p2, p0, p1}, Lcom/facebook/ipc/annotation/a;->a(Landroid/os/Parcel;I)V

    .line 33
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    .line 34
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 35
    sub-int v0, v1, v0

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 36
    invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 37
    return-void
.end method
