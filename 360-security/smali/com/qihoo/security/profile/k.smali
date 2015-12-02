.class public final Lcom/qihoo/security/profile/k;
.super Lcom/qihoo/security/profile/e$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/profile/k$a;
    }
.end annotation


# static fields
.field private static a:Lcom/qihoo/security/profile/k;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/os/Handler;

.field private final d:Lcom/qihoo/security/profile/f;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/os/IBinder;",
            "Lcom/qihoo/security/profile/k$a;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/qihoo/security/profile/g;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/qihoo/security/profile/ProfileDataKeeper;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 165
    invoke-direct {p0}, Lcom/qihoo/security/profile/e$a;-><init>()V

    .line 46
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/profile/k;->e:Ljava/util/Map;

    .line 47
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/profile/k;->f:Landroid/util/SparseArray;

    .line 166
    iput-object p1, p0, Lcom/qihoo/security/profile/k;->b:Landroid/content/Context;

    .line 167
    new-instance v0, Lcom/qihoo/security/profile/c;

    iget-object v1, p0, Lcom/qihoo/security/profile/k;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/profile/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    .line 168
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "ProfileManager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 169
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 170
    new-instance v1, Lcom/qihoo/security/profile/k$1;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/profile/k$1;-><init>(Lcom/qihoo/security/profile/k;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    .line 183
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 184
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/qihoo/security/profile/k;
    .locals 2

    .prologue
    .line 32
    const-class v1, Lcom/qihoo/security/profile/k;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/profile/k;->a:Lcom/qihoo/security/profile/k;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lcom/qihoo/security/profile/k;

    invoke-direct {v0, p0}, Lcom/qihoo/security/profile/k;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/profile/k;->a:Lcom/qihoo/security/profile/k;

    .line 35
    :cond_0
    sget-object v0, Lcom/qihoo/security/profile/k;->a:Lcom/qihoo/security/profile/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 32
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/profile/k;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->e:Ljava/util/Map;

    return-object v0
.end method

.method private a()V
    .locals 4

    .prologue
    const/4 v1, 0x3

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 76
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 77
    return-void
.end method

.method private a(IILjava/lang/String;)V
    .locals 8

    .prologue
    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 56
    new-instance v4, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;

    invoke-direct {v4}, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;-><init>()V

    .line 57
    iput-wide v2, v4, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->a:J

    .line 58
    iput-object p3, v4, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->d:Ljava/lang/String;

    .line 59
    iput p2, v4, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->c:I

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v5

    .line 62
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v5, :cond_2

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/profile/g;

    .line 64
    const/4 v6, -0x1

    if-eq p1, v6, :cond_0

    invoke-interface {v0}, Lcom/qihoo/security/profile/g;->a()I

    move-result v6

    if-ne p1, v6, :cond_1

    .line 65
    :cond_0
    invoke-interface {v0, v2, v3}, Lcom/qihoo/security/profile/g;->a(J)Ljava/lang/String;

    move-result-object v6

    .line 66
    iget-object v7, v4, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->e:Landroid/util/SparseArray;

    invoke-interface {v0}, Lcom/qihoo/security/profile/g;->a()I

    move-result v0

    invoke-virtual {v7, v0, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 62
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 69
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v2

    iput-wide v0, v4, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->b:J

    .line 70
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->g:Lcom/qihoo/security/profile/ProfileDataKeeper;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/profile/ProfileDataKeeper;->a(Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;)V

    .line 71
    invoke-direct {p0}, Lcom/qihoo/security/profile/k;->a()V

    .line 72
    return-void
.end method

.method private final a(IILjava/lang/String;J)V
    .locals 4

    .prologue
    .line 187
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 188
    const-wide/16 v2, 0x0

    cmp-long v1, p4, v2

    if-lez v1, :cond_0

    .line 189
    iget-object v1, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    invoke-virtual {v1, v0, p4, p5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 193
    :goto_0
    return-void

    .line 191
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method private a(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 99
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 141
    :cond_0
    :goto_0
    return-void

    .line 101
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/profile/k;->b()V

    goto :goto_0

    .line 105
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v0}, Lcom/qihoo/security/profile/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v1, v2, v0}, Lcom/qihoo/security/profile/k;->a(IILjava/lang/String;)V

    goto :goto_0

    .line 111
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v0}, Lcom/qihoo/security/profile/f;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 113
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    iget-object v1, p0, Lcom/qihoo/security/profile/k;->g:Lcom/qihoo/security/profile/ProfileDataKeeper;

    invoke-virtual {v1}, Lcom/qihoo/security/profile/ProfileDataKeeper;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/profile/f;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    invoke-direct {p0}, Lcom/qihoo/security/profile/k;->a()V

    .line 125
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v2}, Lcom/qihoo/security/profile/f;->e()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 117
    :cond_2
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/qihoo/security/profile/k;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string/jumbo v2, "pf.bin"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 118
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 119
    invoke-static {v0}, Lcom/qihoo/security/profile/ProfileDataKeeper;->a(Ljava/io/File;)Ljava/util/List;

    move-result-object v1

    .line 120
    iget-object v2, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v2, v1}, Lcom/qihoo/security/profile/f;->a(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 121
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_1

    .line 129
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v0}, Lcom/qihoo/security/profile/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    const-string/jumbo v0, "peroidic"

    invoke-direct {p0, v1, v2, v0}, Lcom/qihoo/security/profile/k;->a(IILjava/lang/String;)V

    .line 131
    const-string/jumbo v3, "peroidic"

    iget-object v0, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v0}, Lcom/qihoo/security/profile/f;->c()J

    move-result-wide v4

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/profile/k;->a(IILjava/lang/String;J)V

    goto :goto_0

    .line 137
    :pswitch_4
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->g:Lcom/qihoo/security/profile/ProfileDataKeeper;

    invoke-virtual {v0}, Lcom/qihoo/security/profile/ProfileDataKeeper;->b()V

    goto/16 :goto_0

    .line 99
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic a(Lcom/qihoo/security/profile/k;IILjava/lang/String;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/profile/k;->b(IILjava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/profile/k;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/qihoo/security/profile/k;->a(Landroid/os/Message;)V

    return-void
.end method

.method private final b()V
    .locals 5

    .prologue
    const/4 v4, 0x4

    const/4 v3, 0x2

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v0}, Lcom/qihoo/security/profile/f;->b()V

    .line 145
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v0}, Lcom/qihoo/security/profile/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    new-instance v0, Lcom/qihoo/security/profile/a;

    iget-object v1, p0, Lcom/qihoo/security/profile/k;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/profile/a;-><init>(Landroid/content/Context;)V

    .line 148
    iget-object v1, p0, Lcom/qihoo/security/profile/k;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, v4, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 149
    new-instance v0, Lcom/qihoo/security/profile/b;

    iget-object v1, p0, Lcom/qihoo/security/profile/k;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/profile/b;-><init>(Landroid/content/Context;)V

    .line 150
    iget-object v1, p0, Lcom/qihoo/security/profile/k;->f:Landroid/util/SparseArray;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 151
    new-instance v0, Lcom/qihoo/security/profile/i;

    iget-object v1, p0, Lcom/qihoo/security/profile/k;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/profile/i;-><init>(Landroid/content/Context;)V

    .line 152
    iget-object v1, p0, Lcom/qihoo/security/profile/k;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 153
    new-instance v0, Lcom/qihoo/security/profile/h;

    invoke-direct {v0}, Lcom/qihoo/security/profile/h;-><init>()V

    .line 154
    iget-object v1, p0, Lcom/qihoo/security/profile/k;->f:Landroid/util/SparseArray;

    const/4 v2, 0x5

    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 159
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    invoke-interface {v1}, Lcom/qihoo/security/profile/f;->c()J

    move-result-wide v2

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 160
    new-instance v0, Lcom/qihoo/security/profile/ProfileDataKeeper;

    iget-object v1, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/qihoo/security/profile/k;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    const-string/jumbo v4, "pf.bin"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/qihoo/security/profile/k;->d:Lcom/qihoo/security/profile/f;

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/profile/ProfileDataKeeper;-><init>(Landroid/os/Looper;Ljava/io/File;Lcom/qihoo/security/profile/f;)V

    iput-object v0, p0, Lcom/qihoo/security/profile/k;->g:Lcom/qihoo/security/profile/ProfileDataKeeper;

    .line 163
    :cond_0
    return-void
.end method

.method private final b(IILjava/lang/String;)V
    .locals 6

    .prologue
    .line 196
    const-wide/16 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/profile/k;->a(IILjava/lang/String;J)V

    .line 197
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 255
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 256
    iget-object v1, p0, Lcom/qihoo/security/profile/k;->c:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->dispatchMessage(Landroid/os/Message;)V

    .line 257
    return-void
.end method

.method public a(Lcom/qihoo/security/profile/d;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 239
    iget-object v1, p0, Lcom/qihoo/security/profile/k;->e:Ljava/util/Map;

    monitor-enter v1

    .line 240
    :try_start_0
    invoke-interface {p1}, Lcom/qihoo/security/profile/d;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    .line 241
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->e:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/profile/k$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    const/4 v3, 0x0

    :try_start_1
    invoke-interface {v2, v0, v3}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 250
    :goto_0
    :try_start_2
    monitor-exit v1

    .line 251
    return-void

    .line 250
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 244
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/profile/d;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 202
    invoke-direct {p0, p2, p3, p4}, Lcom/qihoo/security/profile/k;->b(IILjava/lang/String;)V

    .line 203
    return-void
.end method

.method public a(Lcom/qihoo/security/profile/d;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 207
    if-nez p1, :cond_0

    .line 235
    :goto_0
    return-void

    .line 213
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/profile/k;->e:Ljava/util/Map;

    monitor-enter v1

    .line 214
    :try_start_0
    invoke-interface {p1}, Lcom/qihoo/security/profile/d;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    .line 215
    iget-object v0, p0, Lcom/qihoo/security/profile/k;->e:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/profile/k$a;

    .line 216
    if-eqz v0, :cond_1

    .line 220
    monitor-exit v1

    goto :goto_0

    .line 234
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 223
    :cond_1
    :try_start_1
    new-instance v0, Lcom/qihoo/security/profile/k$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo/security/profile/k$a;-><init>(Lcom/qihoo/security/profile/k;Lcom/qihoo/security/profile/d;Ljava/lang/String;)V

    .line 224
    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 225
    iget-object v3, p0, Lcom/qihoo/security/profile/k;->e:Ljava/util/Map;

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    const/4 v0, -0x1

    const/4 v2, 0x1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, " started"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v2, v3}, Lcom/qihoo/security/profile/k;->b(IILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 234
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 228
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method protected dump(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 262
    return-void
.end method
