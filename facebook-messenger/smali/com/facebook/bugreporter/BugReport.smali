.class public Lcom/facebook/bugreporter/BugReport;
.super Ljava/lang/Object;
.source "BugReport.java"

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
            "Lcom/facebook/bugreporter/BugReport;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/net/Uri;

.field private final d:Landroid/net/Uri;

.field private final e:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;

.field private final m:Ljava/lang/String;

.field private final n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 246
    new-instance v0, Lcom/facebook/bugreporter/a;

    invoke-direct {v0}, Lcom/facebook/bugreporter/a;-><init>()V

    sput-object v0, Lcom/facebook/bugreporter/BugReport;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->a:Landroid/net/Uri;

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->b:Ljava/lang/String;

    .line 83
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->c:Landroid/net/Uri;

    .line 84
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->d:Landroid/net/Uri;

    .line 85
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->g:Ljava/lang/String;

    .line 86
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->h:Ljava/lang/String;

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->i:Ljava/lang/String;

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->j:Ljava/lang/String;

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->k:Ljava/lang/String;

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->l:Ljava/lang/String;

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->m:Ljava/lang/String;

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->n:Ljava/lang/String;

    .line 93
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v2

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    move v0, v1

    .line 95
    :goto_0
    if-ge v0, v3, :cond_0

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 98
    invoke-virtual {v2, v4, v5}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 95
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->e:Lcom/google/common/a/ev;

    .line 102
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v2

    .line 103
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    move v0, v1

    .line 104
    :goto_1
    if-ge v0, v3, :cond_1

    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 106
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 107
    invoke-virtual {v2, v1, v4}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 104
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 109
    :cond_1
    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->f:Lcom/google/common/a/ev;

    .line 110
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/bugreporter/a;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/BugReport;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/bugreporter/b;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->a()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->a:Landroid/net/Uri;

    .line 49
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->b:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->c()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->c:Landroid/net/Uri;

    .line 51
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->d()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->d:Landroid/net/Uri;

    .line 52
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->e()Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->e:Lcom/google/common/a/ev;

    .line 53
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->f()Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->f:Lcom/google/common/a/ev;

    .line 54
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->g:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->h:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->i:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->j:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->k:Ljava/lang/String;

    .line 59
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->l:Ljava/lang/String;

    .line 60
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->m:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Lcom/facebook/bugreporter/b;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/BugReport;->n:Ljava/lang/String;

    .line 64
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->a:Landroid/net/Uri;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/bugreporter/BugReport;->a(Landroid/net/Uri;Z)V

    .line 65
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->d:Landroid/net/Uri;

    invoke-direct {p0, v0, v2}, Lcom/facebook/bugreporter/BugReport;->a(Landroid/net/Uri;Z)V

    .line 66
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->c:Landroid/net/Uri;

    invoke-direct {p0, v0, v2}, Lcom/facebook/bugreporter/BugReport;->a(Landroid/net/Uri;Z)V

    .line 67
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->g:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    return-void
.end method

.method private a(Landroid/net/Uri;Z)V
    .locals 2

    .prologue
    .line 71
    if-nez p2, :cond_0

    .line 72
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    :cond_0
    if-eqz p1, :cond_1

    .line 75
    const-string v0, "file"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 76
    invoke-virtual {p1}, Landroid/net/Uri;->isAbsolute()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 78
    :cond_1
    return-void
.end method

.method public static newBuilder()Lcom/facebook/bugreporter/b;
    .locals 1

    .prologue
    .line 118
    new-instance v0, Lcom/facebook/bugreporter/b;

    invoke-direct {v0}, Lcom/facebook/bugreporter/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->a:Landroid/net/Uri;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public d()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->d:Landroid/net/Uri;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 259
    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->e:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public f()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 165
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->f:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->g:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->i:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->j:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 211
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->k:Ljava/lang/String;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 221
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->l:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->m:Ljava/lang/String;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->n:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    .line 264
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->a:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 265
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 266
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->c:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 267
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->d:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 268
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 269
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 270
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 271
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 272
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 273
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 274
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->m:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 275
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 276
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->e:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 277
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->e:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 278
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 279
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 281
    :cond_0
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->f:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 282
    iget-object v0, p0, Lcom/facebook/bugreporter/BugReport;->f:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 283
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 284
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_1

    .line 286
    :cond_1
    return-void
.end method
