.class public Lcom/facebook/orca/photos/b/k;
.super Ljava/lang/Object;
.source "PhotoUploadManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/fbservice/ops/k;

.field private final b:Lcom/facebook/orca/j/c;

.field private final c:Lcom/facebook/common/time/a;

.field private final d:Lcom/facebook/orca/f/r;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/photos/b/m;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/fbservice/ops/k;Lcom/facebook/orca/j/c;Lcom/facebook/common/time/a;Lcom/facebook/orca/f/r;)V
    .locals 1

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/facebook/orca/photos/b/k;->a:Lcom/facebook/fbservice/ops/k;

    .line 72
    iput-object p2, p0, Lcom/facebook/orca/photos/b/k;->b:Lcom/facebook/orca/j/c;

    .line 73
    iput-object p3, p0, Lcom/facebook/orca/photos/b/k;->c:Lcom/facebook/common/time/a;

    .line 74
    iput-object p4, p0, Lcom/facebook/orca/photos/b/k;->d:Lcom/facebook/orca/f/r;

    .line 76
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/photos/b/k;->e:Ljava/util/Map;

    .line 77
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/photos/b/k;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/photos/b/k;->e:Ljava/util/Map;

    return-object v0
.end method

.method private a(Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 4

    .prologue
    .line 146
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/k;->a(Ljava/lang/String;)Lcom/facebook/orca/photos/b/m;

    move-result-object v0

    .line 147
    invoke-direct {p0, v0}, Lcom/facebook/orca/photos/b/k;->a(Lcom/facebook/orca/photos/b/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    :goto_0
    return-void

    .line 152
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 153
    const-string v1, "mediaResource"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 154
    iget-object v1, p0, Lcom/facebook/orca/photos/b/k;->a:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->L:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 157
    new-instance v1, Lcom/facebook/orca/photos/b/l;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/photos/b/l;-><init>(Lcom/facebook/orca/photos/b/k;Lcom/facebook/ui/media/attachments/MediaResource;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 178
    iget-object v0, p0, Lcom/facebook/orca/photos/b/k;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/photos/b/m;

    sget-object v3, Lcom/facebook/orca/photos/b/n;->IN_PROGRESS:Lcom/facebook/orca/photos/b/n;

    invoke-direct {v2, p0, v3}, Lcom/facebook/orca/photos/b/m;-><init>(Lcom/facebook/orca/photos/b/k;Lcom/facebook/orca/photos/b/n;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/photos/b/m;)Z
    .locals 2

    .prologue
    .line 185
    if-eqz p1, :cond_1

    iget-object v0, p1, Lcom/facebook/orca/photos/b/m;->a:Lcom/facebook/orca/photos/b/n;

    sget-object v1, Lcom/facebook/orca/photos/b/n;->SUCCESS:Lcom/facebook/orca/photos/b/n;

    if-eq v0, v1, :cond_0

    iget-object v0, p1, Lcom/facebook/orca/photos/b/m;->a:Lcom/facebook/orca/photos/b/n;

    sget-object v1, Lcom/facebook/orca/photos/b/n;->IN_PROGRESS:Lcom/facebook/orca/photos/b/n;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/photos/b/k;)Lcom/facebook/orca/f/r;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/photos/b/k;->d:Lcom/facebook/orca/f/r;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/orca/photos/b/m;
    .locals 2

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/orca/photos/b/k;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 133
    new-instance v0, Lcom/facebook/orca/photos/b/m;

    sget-object v1, Lcom/facebook/orca/photos/b/n;->NOT_ACTIVE:Lcom/facebook/orca/photos/b/n;

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/photos/b/m;-><init>(Lcom/facebook/orca/photos/b/k;Lcom/facebook/orca/photos/b/n;)V

    .line 135
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/photos/b/k;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/m;

    goto :goto_0
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/String;)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 87
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-ne v0, v2, :cond_1

    move v0, v1

    :goto_0
    const-string v2, "The MediaResource has to have a type of Photo"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 92
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v2, 0x28

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "_"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/orca/photos/b/k;->c:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".jpg"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 98
    iget-object v2, p0, Lcom/facebook/orca/photos/b/k;->b:Lcom/facebook/orca/j/c;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/j/c;->b(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    .line 99
    invoke-static {p1, v0}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/String;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object p1

    .line 101
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/photos/b/k;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V

    .line 102
    return-object p1

    .line 87
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 4

    .prologue
    .line 112
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->C()Z

    move-result v0

    if-nez v0, :cond_1

    .line 124
    :cond_0
    return-void

    .line 116
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 117
    iget-object v1, p0, Lcom/facebook/orca/photos/b/k;->e:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/photos/b/m;

    .line 119
    invoke-direct {p0, v1}, Lcom/facebook/orca/photos/b/k;->a(Lcom/facebook/orca/photos/b/m;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 122
    invoke-direct {p0, v0}, Lcom/facebook/orca/photos/b/k;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V

    goto :goto_0
.end method
