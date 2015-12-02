.class public Lcom/facebook/orca/f/k;
.super Ljava/lang/Object;
.source "DataCache.java"

# interfaces
.implements Lcom/facebook/user/p;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/orca/f/ad;

.field private final d:Lcom/facebook/location/r;

.field private final e:Lcom/facebook/orca/f/af;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const-class v0, Lcom/facebook/orca/f/k;

    sput-object v0, Lcom/facebook/orca/f/k;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/orca/f/ad;Lcom/facebook/location/r;Lcom/facebook/orca/f/af;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/orca/f/ad;",
            "Lcom/facebook/location/r;",
            "Lcom/facebook/orca/f/af;",
            ")V"
        }
    .end annotation

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/facebook/orca/f/k;->b:Ljavax/inject/a;

    .line 52
    iput-object p2, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    .line 53
    iput-object p3, p0, Lcom/facebook/orca/f/k;->d:Lcom/facebook/location/r;

    .line 54
    iput-object p4, p0, Lcom/facebook/orca/f/k;->e:Lcom/facebook/orca/f/af;

    .line 55
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->b(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 260
    iget-object v0, p0, Lcom/facebook/orca/f/k;->e:Lcom/facebook/orca/f/af;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/f/af;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/service/s;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/service/s;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 296
    iget-object v0, p0, Lcom/facebook/orca/f/k;->e:Lcom/facebook/orca/f/af;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/f/af;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/service/s;

    move-result-object v0

    return-object v0
.end method

.method public a()Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/orca/f/k;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    return-object v0
.end method

.method public a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Landroid/location/Location;J)V
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;Landroid/location/Location;J)V

    .line 308
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;)Z
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    return v0
.end method

.method public b(Lcom/facebook/user/UserKey;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;

    move-result-object v0

    .line 173
    if-eqz v0, :cond_0

    .line 174
    invoke-virtual {v0}, Lcom/facebook/user/User;->r()Landroid/net/Uri;

    move-result-object v0

    .line 176
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 2

    .prologue
    .line 207
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    sget-object v1, Lcom/facebook/orca/f/ae;->PREFER_MERGED_FOLDERS:Lcom/facebook/orca/f/ae;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;Lcom/facebook/orca/f/ae;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->c(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/orca/f/k;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 122
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    sget-object v1, Lcom/facebook/orca/f/ae;->PREFER_MERGED_FOLDERS:Lcom/facebook/orca/f/ae;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/f/ad;->b(Ljava/lang/String;Lcom/facebook/orca/f/ae;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 2

    .prologue
    .line 217
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    sget-object v1, Lcom/facebook/orca/f/ae;->PREFER_MERGED_FOLDERS:Lcom/facebook/orca/f/ae;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/user/UserKey;Lcom/facebook/orca/f/ae;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/f/k;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 131
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Lcom/facebook/orca/threads/FolderName;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/FolderName;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 197
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->d(Lcom/facebook/orca/threads/FolderName;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/location/Location;
    .locals 1

    .prologue
    .line 311
    iget-object v0, p0, Lcom/facebook/orca/f/k;->d:Lcom/facebook/location/r;

    invoke-virtual {v0}, Lcom/facebook/location/r;->a()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/facebook/orca/threads/FolderName;)Z
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lcom/facebook/orca/f/k;->e:Lcom/facebook/orca/f/af;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/af;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 273
    iget-object v0, p0, Lcom/facebook/orca/f/k;->e:Lcom/facebook/orca/f/af;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/af;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(Lcom/facebook/orca/threads/FolderName;)Z
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/orca/f/k;->e:Lcom/facebook/orca/f/af;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/af;->b(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 283
    iget-object v0, p0, Lcom/facebook/orca/f/k;->e:Lcom/facebook/orca/f/af;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/af;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public f(Lcom/facebook/orca/threads/FolderName;)J
    .locals 2

    .prologue
    .line 303
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->f(Lcom/facebook/orca/threads/FolderName;)J

    move-result-wide v0

    return-wide v0
.end method

.method public g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/FolderCounts;
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/facebook/orca/f/k;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->e(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v0

    return-object v0
.end method
