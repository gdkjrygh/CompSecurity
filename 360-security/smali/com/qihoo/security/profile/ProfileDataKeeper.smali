.class Lcom/qihoo/security/profile/ProfileDataKeeper;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;
    }
.end annotation


# instance fields
.field a:Landroid/os/Handler;

.field b:Ljava/io/File;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;",
            ">;"
        }
    .end annotation
.end field

.field final d:Lcom/qihoo/security/profile/f;


# direct methods
.method constructor <init>(Landroid/os/Looper;Ljava/io/File;Lcom/qihoo/security/profile/f;)V
    .locals 1

    .prologue
    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p3, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->d:Lcom/qihoo/security/profile/f;

    .line 97
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->a:Landroid/os/Handler;

    .line 98
    iput-object p2, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->b:Ljava/io/File;

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->b:Ljava/io/File;

    invoke-static {v0}, Lcom/qihoo/security/profile/ProfileDataKeeper;->a(Ljava/io/File;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->c:Ljava/util/List;

    .line 100
    return-void
.end method

.method static final a(Ljava/io/File;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;",
            ">;"
        }
    .end annotation

    .prologue
    .line 104
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    new-instance v0, Landroid/support/v4/c/b;

    invoke-direct {v0, p0}, Landroid/support/v4/c/b;-><init>(Ljava/io/File;)V

    .line 106
    invoke-virtual {v0}, Landroid/support/v4/c/b;->c()[B

    move-result-object v0

    .line 107
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 108
    const/4 v2, 0x0

    array-length v3, v0

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 109
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 110
    invoke-static {p0, v1}, Lcom/qihoo/security/profile/ProfileDataKeeper;->a(Ljava/io/File;Landroid/os/Parcel;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 117
    :goto_0
    return-object v0

    .line 112
    :catch_0
    move-exception v0

    .line 117
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    goto :goto_0
.end method

.method private static a(Ljava/io/File;Landroid/os/Parcel;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Landroid/os/Parcel;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;",
            ">;"
        }
    .end annotation

    .prologue
    .line 136
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 137
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 138
    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    .line 139
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 146
    :cond_0
    return-object v0

    .line 142
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 143
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 144
    sget-object v3, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method static a(Ljava/io/File;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 154
    .line 157
    :try_start_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 158
    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 159
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 160
    invoke-virtual {v3, v4}, Landroid/os/Parcel;->writeInt(I)V

    move v2, v0

    .line 161
    :goto_0
    if-ge v2, v4, :cond_0

    .line 162
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->writeToParcel(Landroid/os/Parcel;I)V

    .line 161
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 164
    :cond_0
    invoke-virtual {v3}, Landroid/os/Parcel;->marshall()[B

    move-result-object v4

    .line 166
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 172
    :cond_1
    new-instance v2, Landroid/support/v4/c/b;

    invoke-direct {v2, p0}, Landroid/support/v4/c/b;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    :try_start_1
    invoke-virtual {v2}, Landroid/support/v4/c/b;->a()Ljava/io/FileOutputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 174
    :try_start_2
    invoke-virtual {v0, v4}, Ljava/io/FileOutputStream;->write([B)V

    .line 175
    invoke-virtual {v2, v0}, Landroid/support/v4/c/b;->a(Ljava/io/FileOutputStream;)V

    .line 176
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 185
    :cond_2
    :goto_1
    return-void

    .line 177
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 181
    :goto_2
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 182
    invoke-virtual {v1, v0}, Landroid/support/v4/c/b;->b(Ljava/io/FileOutputStream;)V

    goto :goto_1

    .line 177
    :catch_1
    move-exception v0

    move-object v0, v1

    move-object v1, v2

    goto :goto_2

    :catch_2
    move-exception v1

    move-object v1, v2

    goto :goto_2
.end method

.method private c()V
    .locals 2

    .prologue
    .line 88
    iget-object v0, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v1}, Lcom/qihoo/security/profile/f;->d()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 89
    iget-object v0, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 91
    :cond_0
    return-void
.end method


# virtual methods
.method a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;",
            ">;"
        }
    .end annotation

    .prologue
    .line 121
    iget-object v0, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->c:Ljava/util/List;

    return-object v0
.end method

.method a(Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;)V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    invoke-direct {p0}, Lcom/qihoo/security/profile/ProfileDataKeeper;->c()V

    .line 85
    return-void
.end method

.method b()V
    .locals 3

    .prologue
    .line 125
    iget-object v0, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v0}, Lcom/qihoo/security/profile/f;->d()I

    move-result v0

    .line 129
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v0, :cond_0

    .line 130
    iget-object v1, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->c:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->b:Ljava/io/File;

    iget-object v1, p0, Lcom/qihoo/security/profile/ProfileDataKeeper;->c:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/qihoo/security/profile/ProfileDataKeeper;->a(Ljava/io/File;Ljava/util/List;)V

    .line 133
    return-void
.end method
