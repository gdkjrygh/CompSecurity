.class final Lcom/roidapp/cloudlib/upload/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/cloudlib/upload/c;

.field private static b:I

.field private static d:Ljava/lang/Object;


# instance fields
.field private c:Landroid/content/Context;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/upload/e;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/roidapp/cloudlib/upload/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    const/4 v0, 0x1

    sput v0, Lcom/roidapp/cloudlib/upload/c;->b:I

    .line 21
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/c;->c:Landroid/content/Context;

    .line 59
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    .line 60
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/roidapp/cloudlib/upload/c;
    .locals 3

    .prologue
    .line 63
    sget-object v1, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 64
    :try_start_0
    sget-object v0, Lcom/roidapp/cloudlib/upload/c;->a:Lcom/roidapp/cloudlib/upload/c;

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/roidapp/cloudlib/upload/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/roidapp/cloudlib/upload/c;->a:Lcom/roidapp/cloudlib/upload/c;

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "create UploadManager "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/roidapp/cloudlib/upload/c;->a:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    sget-object v0, Lcom/roidapp/cloudlib/upload/c;->a:Lcom/roidapp/cloudlib/upload/c;

    return-object v0

    .line 68
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 77
    sget-object v1, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 86
    :try_start_0
    new-instance v0, Lcom/roidapp/cloudlib/upload/e;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/upload/e;-><init>()V

    .line 87
    sget v2, Lcom/roidapp/cloudlib/upload/c;->b:I

    iput v2, v0, Lcom/roidapp/cloudlib/upload/e;->a:I

    .line 88
    sget-object v2, Lcom/roidapp/cloudlib/upload/f;->a:Lcom/roidapp/cloudlib/upload/f;

    iput-object v2, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    .line 89
    iput-object p4, v0, Lcom/roidapp/cloudlib/upload/e;->e:Ljava/lang/String;

    .line 90
    iput-object p1, v0, Lcom/roidapp/cloudlib/upload/e;->b:Ljava/lang/String;

    .line 91
    iput p2, v0, Lcom/roidapp/cloudlib/upload/e;->c:I

    .line 92
    iput-object p3, v0, Lcom/roidapp/cloudlib/upload/e;->d:Ljava/lang/String;

    .line 93
    iput-object p5, v0, Lcom/roidapp/cloudlib/upload/e;->g:Ljava/lang/String;

    .line 94
    iput-object p6, v0, Lcom/roidapp/cloudlib/upload/e;->h:Ljava/lang/String;

    .line 95
    iput-object p7, v0, Lcom/roidapp/cloudlib/upload/e;->i:Ljava/lang/String;

    .line 96
    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    sget v0, Lcom/roidapp/cloudlib/upload/c;->b:I

    add-int/lit8 v2, v0, 0x1

    sput v2, Lcom/roidapp/cloudlib/upload/c;->b:I

    monitor-exit v1

    return v0

    .line 98
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/upload/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 102
    sget-object v1, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 103
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "upload size="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 105
    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 106
    monitor-exit v1

    return-object v0

    .line 107
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(I)V
    .locals 5

    .prologue
    .line 111
    sget-object v2, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 112
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 114
    iget v3, v0, Lcom/roidapp/cloudlib/upload/e;->a:I

    if-ne v3, p1, :cond_2

    .line 115
    sget-object v1, Lcom/roidapp/cloudlib/upload/f;->a:Lcom/roidapp/cloudlib/upload/f;

    iput-object v1, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    .line 116
    new-instance v1, Landroid/content/Intent;

    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/c;->c:Landroid/content/Context;

    const-class v4, Lcom/roidapp/cloudlib/upload/UploadPhotoService;

    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 117
    const-string v3, "service_name"

    iget-object v4, v0, Lcom/roidapp/cloudlib/upload/e;->d:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    const-string v3, "image_path"

    iget-object v4, v0, Lcom/roidapp/cloudlib/upload/e;->b:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 119
    const-string v3, "message"

    iget-object v4, v0, Lcom/roidapp/cloudlib/upload/e;->g:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 120
    const-string v3, "image_format"

    iget-object v4, v0, Lcom/roidapp/cloudlib/upload/e;->e:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 121
    const-string v3, "current_index"

    iget v4, v0, Lcom/roidapp/cloudlib/upload/e;->a:I

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 122
    const-string v3, "ga_mode"

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/e;->i:Ljava/lang/String;

    invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->c:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v3, "com.roidapp.photogrid.UploadStatusChanged"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 130
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->f:Lcom/roidapp/cloudlib/upload/d;

    if-eqz v0, :cond_1

    .line 131
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->f:Lcom/roidapp/cloudlib/upload/d;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/upload/d;->a()V

    .line 133
    :cond_1
    monitor-exit v2

    return-void

    .line 112
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 133
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(ILcom/roidapp/cloudlib/upload/f;)V
    .locals 4

    .prologue
    .line 235
    sget-object v2, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 236
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 237
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 238
    iget v3, v0, Lcom/roidapp/cloudlib/upload/e;->a:I

    if-ne v3, p1, :cond_0

    .line 239
    iput-object p2, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    .line 236
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 243
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->c:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v3, "com.roidapp.photogrid.UploadStatusChanged"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 244
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Lcom/roidapp/cloudlib/upload/d;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/c;->f:Lcom/roidapp/cloudlib/upload/d;

    .line 38
    return-void
.end method

.method public final b()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 137
    sget-object v3, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v3

    move v1, v2

    .line 139
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 141
    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    sget-object v4, Lcom/roidapp/cloudlib/upload/f;->d:Lcom/roidapp/cloudlib/upload/f;

    if-ne v0, v4, :cond_2

    .line 142
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 143
    add-int/lit8 v0, v1, -0x1

    .line 139
    :goto_1
    add-int/lit8 v1, v0, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    .line 148
    :goto_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 149
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 150
    sget-object v2, Lcom/roidapp/cloudlib/upload/f;->a:Lcom/roidapp/cloudlib/upload/f;

    iput-object v2, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    .line 151
    new-instance v2, Landroid/content/Intent;

    iget-object v4, p0, Lcom/roidapp/cloudlib/upload/c;->c:Landroid/content/Context;

    const-class v5, Lcom/roidapp/cloudlib/upload/UploadPhotoService;

    invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 152
    const-string v4, "current_index"

    iget v5, v0, Lcom/roidapp/cloudlib/upload/e;->a:I

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 153
    const-string v4, "service_name"

    iget-object v5, v0, Lcom/roidapp/cloudlib/upload/e;->d:Ljava/lang/String;

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 154
    const-string v4, "image_path"

    iget-object v5, v0, Lcom/roidapp/cloudlib/upload/e;->b:Ljava/lang/String;

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 155
    const-string v4, "message"

    iget-object v5, v0, Lcom/roidapp/cloudlib/upload/e;->g:Ljava/lang/String;

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 156
    const-string v4, "image_format"

    iget-object v5, v0, Lcom/roidapp/cloudlib/upload/e;->e:Ljava/lang/String;

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 157
    const-string v4, "ga_mode"

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/e;->i:Ljava/lang/String;

    invoke-virtual {v2, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 159
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->c:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 148
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 162
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->c:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.roidapp.photogrid.UploadStatusChanged"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 163
    monitor-exit v3

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public final b(I)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 199
    sget-object v3, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v3

    move v2, v1

    .line 200
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 201
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 202
    iget v0, v0, Lcom/roidapp/cloudlib/upload/e;->a:I

    if-ne v0, p1, :cond_0

    .line 203
    const/4 v0, 0x1

    monitor-exit v3

    .line 207
    :goto_1
    return v0

    .line 200
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 206
    :cond_1
    monitor-exit v3

    move v0, v1

    .line 207
    goto :goto_1

    .line 206
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c()I
    .locals 2

    .prologue
    .line 167
    sget-object v1, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 168
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    monitor-exit v1

    return v0

    .line 169
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c(I)V
    .locals 4

    .prologue
    .line 265
    sget-object v2, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 266
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 267
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 268
    iget v3, v0, Lcom/roidapp/cloudlib/upload/e;->a:I

    if-ne v3, p1, :cond_2

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    sget-object v3, Lcom/roidapp/cloudlib/upload/f;->b:Lcom/roidapp/cloudlib/upload/f;

    if-eq v0, v3, :cond_2

    .line 269
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 274
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->c:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v3, "com.roidapp.photogrid.UploadStatusChanged"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 275
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->f:Lcom/roidapp/cloudlib/upload/d;

    if-eqz v0, :cond_1

    .line 276
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->f:Lcom/roidapp/cloudlib/upload/d;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/upload/d;->a()V

    .line 278
    :cond_1
    monitor-exit v2

    return-void

    .line 266
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 278
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final d()I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 173
    sget-object v3, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v3

    move v2, v0

    move v1, v0

    .line 175
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 177
    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    sget-object v4, Lcom/roidapp/cloudlib/upload/f;->d:Lcom/roidapp/cloudlib/upload/f;

    if-ne v0, v4, :cond_1

    .line 178
    add-int/lit8 v0, v1, 0x1

    .line 175
    :goto_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 181
    :cond_0
    monitor-exit v3

    return v1

    .line 182
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method public final e()I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 186
    sget-object v3, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v3

    move v2, v0

    move v1, v0

    .line 188
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 189
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 190
    iget-object v4, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    sget-object v5, Lcom/roidapp/cloudlib/upload/f;->d:Lcom/roidapp/cloudlib/upload/f;

    if-eq v4, v5, :cond_0

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    sget-object v4, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    if-ne v0, v4, :cond_2

    .line 191
    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 188
    :goto_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 194
    :cond_1
    monitor-exit v3

    return v1

    .line 195
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public final f()Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 223
    sget-object v3, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v3

    move v2, v1

    .line 224
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 226
    iget-object v4, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    sget-object v5, Lcom/roidapp/cloudlib/upload/f;->a:Lcom/roidapp/cloudlib/upload/f;

    if-eq v4, v5, :cond_0

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    sget-object v4, Lcom/roidapp/cloudlib/upload/f;->b:Lcom/roidapp/cloudlib/upload/f;

    if-ne v0, v4, :cond_1

    .line 227
    :cond_0
    const/4 v0, 0x1

    monitor-exit v3

    .line 231
    :goto_1
    return v0

    .line 224
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 230
    :cond_2
    monitor-exit v3

    move v0, v1

    .line 231
    goto :goto_1

    .line 230
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final g()V
    .locals 4

    .prologue
    .line 248
    sget-object v2, Lcom/roidapp/cloudlib/upload/c;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 249
    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 251
    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    sget-object v3, Lcom/roidapp/cloudlib/upload/f;->d:Lcom/roidapp/cloudlib/upload/f;

    if-ne v0, v3, :cond_2

    .line 252
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 253
    add-int/lit8 v0, v1, -0x1

    .line 249
    :goto_1
    add-int/lit8 v1, v0, 0x1

    goto :goto_0

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->c:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v3, "com.roidapp.photogrid.UploadStatusChanged"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 258
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->f:Lcom/roidapp/cloudlib/upload/d;

    if-eqz v0, :cond_1

    .line 259
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/c;->f:Lcom/roidapp/cloudlib/upload/d;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/upload/d;->a()V

    .line 261
    :cond_1
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    move v0, v1

    goto :goto_1
.end method
