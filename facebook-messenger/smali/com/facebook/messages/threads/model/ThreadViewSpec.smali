.class public Lcom/facebook/messages/threads/model/ThreadViewSpec;
.super Ljava/lang/Object;
.source "ThreadViewSpec.java"

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
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lcom/facebook/messages/threads/model/ThreadViewSpec;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/user/RecipientInfo;

.field private volatile d:Lcom/facebook/messages/threads/model/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-direct {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;-><init>()V

    sput-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 267
    new-instance v0, Lcom/facebook/messages/threads/model/a;

    invoke-direct {v0}, Lcom/facebook/messages/threads/model/a;-><init>()V

    sput-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b:Ljava/lang/String;

    .line 104
    iput-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    .line 105
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b:Ljava/lang/String;

    .line 119
    const-class v0, Lcom/facebook/user/RecipientInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/RecipientInfo;

    iput-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    .line 120
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/messages/threads/model/a;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/user/RecipientInfo;)V
    .locals 1

    .prologue
    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b:Ljava/lang/String;

    .line 114
    iput-object p1, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    .line 115
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b:Ljava/lang/String;

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    .line 110
    return-void
.end method

.method public static a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 154
    invoke-static {p0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    new-instance v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-direct {v0, p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;-><init>(Lcom/facebook/user/RecipientInfo;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 129
    invoke-static {p0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    invoke-static {p0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 131
    new-instance v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-direct {v0, p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 130
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 169
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v1

    .line 170
    :goto_0
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v0

    .line 171
    :cond_0
    invoke-static {v1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0

    :cond_1
    move-object v1, v0

    .line 169
    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 141
    if-nez p0, :cond_0

    .line 142
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 144
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/cb;)V
    .locals 2

    .prologue
    .line 246
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 247
    const-string v0, "thread_id"

    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 251
    :cond_0
    :goto_0
    return-void

    .line 248
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    const-string v0, "user_key"

    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->f()Lcom/facebook/user/UserIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v1

    iget-object v1, v1, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 198
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 280
    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/facebook/user/RecipientInfo;
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    return-object v0
.end method

.method public f()Lcom/facebook/user/UserIdentifier;
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Lcom/facebook/user/UserIdentifierKey;
    .locals 1

    .prologue
    .line 236
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->f()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    .line 237
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()Lcom/facebook/messages/threads/model/b;
    .locals 3

    .prologue
    .line 261
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d:Lcom/facebook/messages/threads/model/b;

    if-nez v0, :cond_0

    .line 262
    new-instance v0, Lcom/facebook/messages/threads/model/b;

    iget-object v1, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->g()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/threads/model/b;-><init>(Ljava/lang/String;Lcom/facebook/user/UserIdentifierKey;)V

    iput-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d:Lcom/facebook/messages/threads/model/b;

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d:Lcom/facebook/messages/threads/model/b;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b:Ljava/lang/String;

    .line 296
    :goto_0
    return-object v0

    .line 293
    :cond_0
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    if-eqz v0, :cond_1

    .line 294
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 296
    :cond_1
    const-string v0, "<null>"

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 286
    iget-object v0, p0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c:Lcom/facebook/user/RecipientInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 287
    return-void
.end method
