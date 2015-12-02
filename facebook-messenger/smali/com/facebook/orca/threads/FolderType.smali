.class public Lcom/facebook/orca/threads/FolderType;
.super Ljava/lang/Object;
.source "FolderType.java"

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
            "Lcom/facebook/orca/threads/FolderType;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lcom/facebook/orca/threads/FolderType;

.field public static final b:Lcom/facebook/orca/threads/FolderType;

.field public static final c:Lcom/facebook/orca/threads/FolderType;

.field public static final d:Lcom/facebook/orca/threads/FolderType;

.field public static final e:Lcom/facebook/orca/threads/FolderType;

.field public static final f:Lcom/facebook/orca/threads/FolderType;

.field private static final g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final h:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 34
    const-class v0, Lcom/facebook/orca/threads/FolderType;

    sput-object v0, Lcom/facebook/orca/threads/FolderType;->g:Ljava/lang/Class;

    .line 37
    new-instance v0, Lcom/facebook/orca/threads/FolderType;

    const-string v1, "none"

    invoke-direct {v0, v1}, Lcom/facebook/orca/threads/FolderType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/threads/FolderType;->a:Lcom/facebook/orca/threads/FolderType;

    .line 40
    new-instance v0, Lcom/facebook/orca/threads/FolderType;

    const-string v1, "inbox"

    invoke-direct {v0, v1}, Lcom/facebook/orca/threads/FolderType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/threads/FolderType;->b:Lcom/facebook/orca/threads/FolderType;

    .line 43
    new-instance v0, Lcom/facebook/orca/threads/FolderType;

    const-string v1, "other"

    invoke-direct {v0, v1}, Lcom/facebook/orca/threads/FolderType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/threads/FolderType;->c:Lcom/facebook/orca/threads/FolderType;

    .line 46
    new-instance v0, Lcom/facebook/orca/threads/FolderType;

    const-string v1, "mms-sms"

    invoke-direct {v0, v1}, Lcom/facebook/orca/threads/FolderType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/threads/FolderType;->d:Lcom/facebook/orca/threads/FolderType;

    .line 49
    new-instance v0, Lcom/facebook/orca/threads/FolderType;

    const-string v1, "merged_inbox"

    invoke-direct {v0, v1}, Lcom/facebook/orca/threads/FolderType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/threads/FolderType;->e:Lcom/facebook/orca/threads/FolderType;

    .line 52
    new-instance v0, Lcom/facebook/orca/threads/FolderType;

    const-string v1, "archived-mms-sms"

    invoke-direct {v0, v1}, Lcom/facebook/orca/threads/FolderType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/threads/FolderType;->f:Lcom/facebook/orca/threads/FolderType;

    .line 54
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->b:Lcom/facebook/orca/threads/FolderType;

    sget-object v1, Lcom/facebook/orca/threads/FolderType;->c:Lcom/facebook/orca/threads/FolderType;

    sget-object v2, Lcom/facebook/orca/threads/FolderType;->d:Lcom/facebook/orca/threads/FolderType;

    sget-object v3, Lcom/facebook/orca/threads/FolderType;->e:Lcom/facebook/orca/threads/FolderType;

    sget-object v4, Lcom/facebook/orca/threads/FolderType;->f:Lcom/facebook/orca/threads/FolderType;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/threads/FolderType;->h:Lcom/google/common/a/fi;

    .line 104
    new-instance v0, Lcom/facebook/orca/threads/f;

    invoke-direct {v0}, Lcom/facebook/orca/threads/f;-><init>()V

    sput-object v0, Lcom/facebook/orca/threads/FolderType;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    .line 82
    iget-object v0, p0, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    const-string v1, ":::::"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 83
    return-void

    .line 82
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/f;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/orca/threads/FolderType;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 72
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threads/FolderType;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    .line 73
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    const-string v0, ":::::"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 77
    iput-object p1, p0, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    .line 78
    return-void

    .line 76
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/orca/threads/FolderType;
    .locals 1

    .prologue
    .line 32
    invoke-static {p0}, Lcom/facebook/orca/threads/FolderType;->b(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderType;
    .locals 1

    .prologue
    .line 68
    new-instance v0, Lcom/facebook/orca/threads/FolderType;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threads/FolderType;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/facebook/orca/threads/FolderType;->b(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    return-object v0
.end method

.method private static b(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/orca/threads/FolderType;
    .locals 4

    .prologue
    .line 133
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->h:Lcom/google/common/a/fi;

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderType;

    .line 134
    invoke-static {v0, p0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 140
    :goto_0
    return-object v0

    .line 139
    :cond_1
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->g:Ljava/lang/Class;

    const-string v1, "Unexpected folder type %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v0, p0

    .line 140
    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 96
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 117
    if-ne p0, p1, :cond_1

    .line 124
    :cond_0
    :goto_0
    return v0

    .line 118
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 120
    :cond_3
    check-cast p1, Lcom/facebook/orca/threads/FolderType;

    .line 122
    iget-object v2, p0, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p1, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/orca/threads/FolderType;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 102
    return-void
.end method
