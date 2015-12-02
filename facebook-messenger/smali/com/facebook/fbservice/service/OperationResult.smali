.class public Lcom/facebook/fbservice/service/OperationResult;
.super Ljava/lang/Object;
.source "OperationResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private static final a:Lcom/facebook/fbservice/service/OperationResult;


# instance fields
.field private final b:Z

.field private final c:Ljava/lang/String;

.field private final d:Landroid/os/Bundle;

.field private final e:Lcom/facebook/fbservice/service/t;

.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    new-instance v0, Lcom/facebook/fbservice/service/OperationResult;

    invoke-direct {v0}, Lcom/facebook/fbservice/service/OperationResult;-><init>()V

    sput-object v0, Lcom/facebook/fbservice/service/OperationResult;->a:Lcom/facebook/fbservice/service/OperationResult;

    .line 315
    new-instance v0, Lcom/facebook/fbservice/service/ae;

    invoke-direct {v0}, Lcom/facebook/fbservice/service/ae;-><init>()V

    sput-object v0, Lcom/facebook/fbservice/service/OperationResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/fbservice/service/OperationResult;->b:Z

    .line 37
    iput-object v1, p0, Lcom/facebook/fbservice/service/OperationResult;->c:Ljava/lang/String;

    .line 38
    iput-object v1, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    .line 39
    sget-object v0, Lcom/facebook/fbservice/service/t;->NO_ERROR:Lcom/facebook/fbservice/service/t;

    iput-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->e:Lcom/facebook/fbservice/service/t;

    .line 40
    iput-object v1, p0, Lcom/facebook/fbservice/service/OperationResult;->f:Ljava/lang/String;

    .line 41
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/fbservice/service/OperationResult;->b:Z

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->c:Ljava/lang/String;

    .line 67
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    iput-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/t;->valueOf(Ljava/lang/String;)Lcom/facebook/fbservice/service/t;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->e:Lcom/facebook/fbservice/service/t;

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->f:Ljava/lang/String;

    .line 70
    return-void

    .line 65
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/fbservice/service/ae;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/service/OperationResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/fbservice/service/t;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/fbservice/service/OperationResult;->b:Z

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->c:Ljava/lang/String;

    .line 59
    iput-object p3, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    .line 60
    iput-object p1, p0, Lcom/facebook/fbservice/service/OperationResult;->e:Lcom/facebook/fbservice/service/t;

    .line 61
    iput-object p2, p0, Lcom/facebook/fbservice/service/OperationResult;->f:Ljava/lang/String;

    .line 62
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/fbservice/service/OperationResult;->b:Z

    .line 47
    iput-object p1, p0, Lcom/facebook/fbservice/service/OperationResult;->c:Ljava/lang/String;

    .line 48
    iput-object p2, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    .line 49
    sget-object v0, Lcom/facebook/fbservice/service/t;->NO_ERROR:Lcom/facebook/fbservice/service/t;

    iput-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->e:Lcom/facebook/fbservice/service/t;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->f:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public static a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 98
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 99
    const-string v1, "result"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 100
    new-instance v1, Lcom/facebook/fbservice/service/OperationResult;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/facebook/fbservice/service/OperationResult;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v1
.end method

.method public static varargs a(Landroid/os/Parcelable;[Landroid/util/Pair;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcelable;",
            "[",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/String;",
            "Landroid/os/Parcelable;",
            ">;)",
            "Lcom/facebook/fbservice/service/OperationResult;"
        }
    .end annotation

    .prologue
    .line 127
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 128
    const-string v0, "result"

    invoke-virtual {v3, v0, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 129
    array-length v4, p1

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_0

    aget-object v1, p1, v2

    .line 130
    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 129
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 132
    :cond_0
    new-instance v0, Lcom/facebook/fbservice/service/OperationResult;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v3}, Lcom/facebook/fbservice/service/OperationResult;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static a(Lcom/facebook/fbservice/service/t;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 142
    new-instance v0, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0}, Lcom/facebook/fbservice/service/t;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/facebook/fbservice/service/OperationResult;-><init>(Lcom/facebook/fbservice/service/t;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static a(Lcom/facebook/fbservice/service/t;Landroid/os/Bundle;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 153
    new-instance v0, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0}, Lcom/facebook/fbservice/service/t;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/facebook/fbservice/service/OperationResult;-><init>(Lcom/facebook/fbservice/service/t;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 164
    new-instance v0, Lcom/facebook/fbservice/service/OperationResult;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/fbservice/service/OperationResult;-><init>(Lcom/facebook/fbservice/service/t;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 88
    new-instance v0, Lcom/facebook/fbservice/service/OperationResult;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/fbservice/service/OperationResult;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static b()Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 78
    sget-object v0, Lcom/facebook/fbservice/service/OperationResult;->a:Lcom/facebook/fbservice/service/OperationResult;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Landroid/os/Parcelable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 291
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 294
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 173
    iget-boolean v0, p0, Lcom/facebook/fbservice/service/OperationResult;->b:Z

    return v0
.end method

.method public d()Lcom/facebook/fbservice/service/t;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->e:Lcom/facebook/fbservice/service/t;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 328
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->c:Ljava/lang/String;

    return-object v0
.end method

.method public g()Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 204
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 207
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    return-object v0
.end method

.method public h()Landroid/os/Parcelable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">()TT;"
        }
    .end annotation

    .prologue
    .line 219
    invoke-virtual {p0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    .line 220
    if-nez v0, :cond_0

    .line 221
    new-instance v0, Lcom/facebook/fbservice/service/af;

    invoke-direct {v0}, Lcom/facebook/fbservice/service/af;-><init>()V

    throw v0

    .line 223
    :cond_0
    return-object v0
.end method

.method public i()Landroid/os/Parcelable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">()TT;"
        }
    .end annotation

    .prologue
    .line 265
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 268
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    const-string v1, "result"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 312
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 333
    iget-boolean v0, p0, Lcom/facebook/fbservice/service/OperationResult;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 334
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->d:Landroid/os/Bundle;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 336
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->e:Lcom/facebook/fbservice/service/t;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/t;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 337
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationResult;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 338
    return-void

    .line 333
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
