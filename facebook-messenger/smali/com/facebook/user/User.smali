.class public Lcom/facebook/user/User;
.super Ljava/lang/Object;
.source "User.java"

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
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/user/n;

.field private final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserEmailAddress;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserPhoneNumber;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/user/Name;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Lcom/facebook/user/PicCropInfo;

.field private final i:Lcom/facebook/user/PicCropInfo;

.field private final j:Ljava/lang/String;

.field private final k:F

.field private final l:Lcom/facebook/common/w/q;

.field private final m:Z

.field private final n:Lcom/facebook/user/Birthday;

.field private final o:Ljava/lang/String;

.field private final p:Ljava/lang/String;

.field private final q:Lcom/facebook/user/LastActive;

.field private final r:Lcom/facebook/user/MobileAppData;

.field private final s:Ljava/lang/String;

.field private final t:Ljava/lang/String;

.field private final u:Lcom/facebook/user/UserKey;

.field private final v:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field private final w:Lcom/facebook/user/UserFbidIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 316
    new-instance v0, Lcom/facebook/user/m;

    invoke-direct {v0}, Lcom/facebook/user/m;-><init>()V

    sput-object v0, Lcom/facebook/user/User;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->a:Ljava/lang/String;

    .line 103
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/n;->valueOf(Ljava/lang/String;)Lcom/facebook/user/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->b:Lcom/facebook/user/n;

    .line 104
    new-instance v0, Lcom/facebook/user/UserKey;

    iget-object v1, p0, Lcom/facebook/user/User;->b:Lcom/facebook/user/n;

    iget-object v2, p0, Lcom/facebook/user/User;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/user/User;->u:Lcom/facebook/user/UserKey;

    .line 105
    const-class v0, Lcom/facebook/user/UserEmailAddress;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    .line 107
    const-class v0, Lcom/facebook/user/UserPhoneNumber;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    .line 109
    const-class v0, Lcom/facebook/user/Name;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/Name;

    iput-object v0, p0, Lcom/facebook/user/User;->e:Lcom/facebook/user/Name;

    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->f:Ljava/lang/String;

    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->g:Ljava/lang/String;

    .line 112
    const-class v0, Lcom/facebook/user/PicCropInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/PicCropInfo;

    iput-object v0, p0, Lcom/facebook/user/User;->h:Lcom/facebook/user/PicCropInfo;

    .line 113
    const-class v0, Lcom/facebook/user/PicCropInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/PicCropInfo;

    iput-object v0, p0, Lcom/facebook/user/User;->i:Lcom/facebook/user/PicCropInfo;

    .line 114
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->j:Ljava/lang/String;

    .line 115
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/facebook/user/User;->k:F

    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/q;->valueOf(Ljava/lang/String;)Lcom/facebook/common/w/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->l:Lcom/facebook/common/w/q;

    .line 117
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/user/User;->m:Z

    .line 118
    const-class v0, Lcom/facebook/user/Birthday;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/Birthday;

    iput-object v0, p0, Lcom/facebook/user/User;->n:Lcom/facebook/user/Birthday;

    .line 119
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->o:Ljava/lang/String;

    .line 120
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->p:Ljava/lang/String;

    .line 121
    const-class v0, Lcom/facebook/user/LastActive;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/LastActive;

    iput-object v0, p0, Lcom/facebook/user/User;->q:Lcom/facebook/user/LastActive;

    .line 122
    const-class v0, Lcom/facebook/user/MobileAppData;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/MobileAppData;

    iput-object v0, p0, Lcom/facebook/user/User;->r:Lcom/facebook/user/MobileAppData;

    .line 123
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->s:Ljava/lang/String;

    .line 124
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->t:Ljava/lang/String;

    .line 125
    invoke-direct {p0}, Lcom/facebook/user/User;->G()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->w:Lcom/facebook/user/UserFbidIdentifier;

    .line 126
    invoke-direct {p0}, Lcom/facebook/user/User;->H()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->v:Lcom/google/common/a/es;

    .line 127
    return-void

    .line 117
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/user/m;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/user/User;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/user/o;)V
    .locals 3

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-virtual {p1}, Lcom/facebook/user/o;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "id must not be null"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/user/User;->a:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Lcom/facebook/user/o;->a()Lcom/facebook/user/n;

    move-result-object v0

    const-string v1, "type must not be null"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/n;

    iput-object v0, p0, Lcom/facebook/user/User;->b:Lcom/facebook/user/n;

    .line 70
    new-instance v0, Lcom/facebook/user/UserKey;

    iget-object v1, p0, Lcom/facebook/user/User;->b:Lcom/facebook/user/n;

    iget-object v2, p0, Lcom/facebook/user/User;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/user/User;->u:Lcom/facebook/user/UserKey;

    .line 71
    invoke-virtual {p1}, Lcom/facebook/user/o;->c()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 72
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    .line 76
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/user/o;->d()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    .line 77
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    .line 81
    :goto_1
    invoke-static {p1}, Lcom/facebook/user/User;->a(Lcom/facebook/user/o;)Lcom/facebook/user/Name;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->e:Lcom/facebook/user/Name;

    .line 82
    invoke-virtual {p1}, Lcom/facebook/user/o;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->f:Ljava/lang/String;

    .line 83
    invoke-virtual {p1}, Lcom/facebook/user/o;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->g:Ljava/lang/String;

    .line 84
    invoke-virtual {p1}, Lcom/facebook/user/o;->k()Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->h:Lcom/facebook/user/PicCropInfo;

    .line 85
    invoke-virtual {p1}, Lcom/facebook/user/o;->l()Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->i:Lcom/facebook/user/PicCropInfo;

    .line 86
    invoke-virtual {p1}, Lcom/facebook/user/o;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->j:Ljava/lang/String;

    .line 87
    invoke-virtual {p1}, Lcom/facebook/user/o;->n()F

    move-result v0

    iput v0, p0, Lcom/facebook/user/User;->k:F

    .line 88
    invoke-virtual {p1}, Lcom/facebook/user/o;->o()Lcom/facebook/common/w/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->l:Lcom/facebook/common/w/q;

    .line 89
    invoke-virtual {p1}, Lcom/facebook/user/o;->p()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/user/User;->m:Z

    .line 90
    invoke-virtual {p1}, Lcom/facebook/user/o;->q()Lcom/facebook/user/Birthday;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->n:Lcom/facebook/user/Birthday;

    .line 91
    invoke-virtual {p1}, Lcom/facebook/user/o;->r()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->o:Ljava/lang/String;

    .line 92
    invoke-virtual {p1}, Lcom/facebook/user/o;->s()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->p:Ljava/lang/String;

    .line 93
    invoke-virtual {p1}, Lcom/facebook/user/o;->t()Lcom/facebook/user/LastActive;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->q:Lcom/facebook/user/LastActive;

    .line 94
    invoke-virtual {p1}, Lcom/facebook/user/o;->u()Lcom/facebook/user/MobileAppData;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->r:Lcom/facebook/user/MobileAppData;

    .line 95
    invoke-virtual {p1}, Lcom/facebook/user/o;->v()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->s:Ljava/lang/String;

    .line 96
    invoke-virtual {p1}, Lcom/facebook/user/o;->w()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->t:Ljava/lang/String;

    .line 97
    invoke-direct {p0}, Lcom/facebook/user/User;->G()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->w:Lcom/facebook/user/UserFbidIdentifier;

    .line 98
    invoke-direct {p0}, Lcom/facebook/user/User;->H()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->v:Lcom/google/common/a/es;

    .line 99
    return-void

    .line 74
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/user/o;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    goto/16 :goto_0

    .line 79
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/user/o;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    goto/16 :goto_1
.end method

.method private G()Lcom/facebook/user/UserFbidIdentifier;
    .locals 2

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/user/User;->b:Lcom/facebook/user/n;

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_0

    .line 139
    new-instance v0, Lcom/facebook/user/UserFbidIdentifier;

    iget-object v1, p0, Lcom/facebook/user/User;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/facebook/user/UserFbidIdentifier;-><init>(Ljava/lang/String;)V

    .line 141
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private H()Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserIdentifier;",
            ">;"
        }
    .end annotation

    .prologue
    .line 146
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    .line 147
    iget-object v1, p0, Lcom/facebook/user/User;->w:Lcom/facebook/user/UserFbidIdentifier;

    if-eqz v1, :cond_0

    .line 148
    iget-object v1, p0, Lcom/facebook/user/User;->w:Lcom/facebook/user/UserFbidIdentifier;

    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 150
    :cond_0
    iget-object v1, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Iterable;)Lcom/google/common/a/et;

    .line 151
    iget-object v1, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Iterable;)Lcom/google/common/a/et;

    .line 152
    invoke-virtual {v0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lcom/facebook/user/o;)Lcom/facebook/user/Name;
    .locals 4

    .prologue
    .line 130
    invoke-virtual {p0}, Lcom/facebook/user/o;->h()Lcom/facebook/user/Name;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 131
    invoke-virtual {p0}, Lcom/facebook/user/o;->h()Lcom/facebook/user/Name;

    move-result-object v0

    .line 133
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/facebook/user/Name;

    invoke-virtual {p0}, Lcom/facebook/user/o;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/user/o;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/facebook/user/o;->e()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/user/Name;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/user/User;->o:Ljava/lang/String;

    return-object v0
.end method

.method public B()Ljava/lang/String;
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lcom/facebook/user/User;->p:Ljava/lang/String;

    return-object v0
.end method

.method public C()Lcom/facebook/user/LastActive;
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lcom/facebook/user/User;->q:Lcom/facebook/user/LastActive;

    return-object v0
.end method

.method public D()Lcom/facebook/user/MobileAppData;
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/facebook/user/User;->r:Lcom/facebook/user/MobileAppData;

    return-object v0
.end method

.method public E()Ljava/lang/String;
    .locals 1

    .prologue
    .line 309
    iget-object v0, p0, Lcom/facebook/user/User;->s:Ljava/lang/String;

    return-object v0
.end method

.method public F()Ljava/lang/String;
    .locals 1

    .prologue
    .line 313
    iget-object v0, p0, Lcom/facebook/user/User;->t:Ljava/lang/String;

    return-object v0
.end method

.method public a()Lcom/facebook/user/n;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/user/User;->b:Lcom/facebook/user/n;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/user/User;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/user/User;->u:Lcom/facebook/user/UserKey;

    return-object v0
.end method

.method public d()Lcom/facebook/user/Name;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/user/User;->e:Lcom/facebook/user/Name;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 329
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/user/User;->e:Lcom/facebook/user/Name;

    invoke-virtual {v0}, Lcom/facebook/user/Name;->getFirstName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/facebook/user/User;->e:Lcom/facebook/user/Name;

    invoke-virtual {v0}, Lcom/facebook/user/Name;->getLastName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/user/User;->e:Lcom/facebook/user/Name;

    invoke-virtual {v0}, Lcom/facebook/user/Name;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/user/User;->e:Lcom/facebook/user/Name;

    invoke-virtual {v0}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Lcom/facebook/user/UserFbidIdentifier;
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lcom/facebook/user/User;->w:Lcom/facebook/user/UserFbidIdentifier;

    return-object v0
.end method

.method public j()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserEmailAddress;",
            ">;"
        }
    .end annotation

    .prologue
    .line 200
    iget-object v0, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    return-object v0
.end method

.method public k()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserPhoneNumber;",
            ">;"
        }
    .end annotation

    .prologue
    .line 204
    iget-object v0, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    return-object v0
.end method

.method public l()Z
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public m()Ljava/lang/String;
    .locals 2

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserEmailAddress;

    invoke-virtual {v0}, Lcom/facebook/user/UserEmailAddress;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public n()Z
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public o()Lcom/facebook/user/UserPhoneNumber;
    .locals 2

    .prologue
    .line 224
    iget-object v0, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserPhoneNumber;

    goto :goto_0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lcom/facebook/user/User;->g:Ljava/lang/String;

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .prologue
    .line 241
    iget-object v0, p0, Lcom/facebook/user/User;->f:Ljava/lang/String;

    return-object v0
.end method

.method public r()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 245
    iget-object v0, p0, Lcom/facebook/user/User;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/user/User;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public s()Lcom/facebook/user/PicCropInfo;
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/user/User;->h:Lcom/facebook/user/PicCropInfo;

    return-object v0
.end method

.method public t()Lcom/facebook/user/PicCropInfo;
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/facebook/user/User;->i:Lcom/facebook/user/PicCropInfo;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 358
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    iget-object v1, p0, Lcom/facebook/user/User;->e:Lcom/facebook/user/Name;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    iget-object v1, p0, Lcom/facebook/user/User;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/user/User;->b:Lcom/facebook/user/n;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    iget-object v1, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 362
    iget-object v1, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    invoke-virtual {v1, v3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    :cond_0
    iget-object v1, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 365
    iget-object v1, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    invoke-virtual {v1, v3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/facebook/user/User;->j:Ljava/lang/String;

    return-object v0
.end method

.method public v()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserIdentifier;",
            ">;"
        }
    .end annotation

    .prologue
    .line 265
    iget-object v0, p0, Lcom/facebook/user/User;->v:Lcom/google/common/a/es;

    return-object v0
.end method

.method public w()F
    .locals 1

    .prologue
    .line 277
    iget v0, p0, Lcom/facebook/user/User;->k:F

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Lcom/facebook/user/User;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/facebook/user/User;->b:Lcom/facebook/user/n;

    invoke-virtual {v0}, Lcom/facebook/user/n;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 336
    iget-object v0, p0, Lcom/facebook/user/User;->c:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 337
    iget-object v0, p0, Lcom/facebook/user/User;->d:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 338
    iget-object v0, p0, Lcom/facebook/user/User;->e:Lcom/facebook/user/Name;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 339
    iget-object v0, p0, Lcom/facebook/user/User;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 340
    iget-object v0, p0, Lcom/facebook/user/User;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 341
    iget-object v0, p0, Lcom/facebook/user/User;->h:Lcom/facebook/user/PicCropInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 342
    iget-object v0, p0, Lcom/facebook/user/User;->i:Lcom/facebook/user/PicCropInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 343
    iget-object v0, p0, Lcom/facebook/user/User;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 344
    iget v0, p0, Lcom/facebook/user/User;->k:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 345
    iget-object v0, p0, Lcom/facebook/user/User;->l:Lcom/facebook/common/w/q;

    invoke-virtual {v0}, Lcom/facebook/common/w/q;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 346
    iget-boolean v0, p0, Lcom/facebook/user/User;->m:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 347
    iget-object v0, p0, Lcom/facebook/user/User;->n:Lcom/facebook/user/Birthday;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 348
    iget-object v0, p0, Lcom/facebook/user/User;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 349
    iget-object v0, p0, Lcom/facebook/user/User;->p:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 350
    iget-object v0, p0, Lcom/facebook/user/User;->q:Lcom/facebook/user/LastActive;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 351
    iget-object v0, p0, Lcom/facebook/user/User;->r:Lcom/facebook/user/MobileAppData;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 352
    iget-object v0, p0, Lcom/facebook/user/User;->s:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 353
    iget-object v0, p0, Lcom/facebook/user/User;->t:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 354
    return-void

    .line 346
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public x()Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Lcom/facebook/user/User;->l:Lcom/facebook/common/w/q;

    return-object v0
.end method

.method public y()Z
    .locals 1

    .prologue
    .line 285
    iget-boolean v0, p0, Lcom/facebook/user/User;->m:Z

    return v0
.end method

.method public z()Lcom/facebook/user/Birthday;
    .locals 1

    .prologue
    .line 289
    iget-object v0, p0, Lcom/facebook/user/User;->n:Lcom/facebook/user/Birthday;

    return-object v0
.end method
