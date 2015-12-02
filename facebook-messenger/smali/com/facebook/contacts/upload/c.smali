.class public Lcom/facebook/contacts/upload/c;
.super Ljava/lang/Object;
.source "ContactsUploadRunner.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/facebook/fbservice/ops/k;

.field private final c:Landroid/support/v4/a/e;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/analytics/av;

.field private f:Z

.field private g:Lcom/facebook/contacts/upload/ContactsUploadState;

.field private h:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

.field private i:Lcom/facebook/fbservice/ops/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/contacts/upload/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/upload/c;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/ops/k;Landroid/support/v4/a/e;Lcom/facebook/prefs/shared/d;Lcom/facebook/analytics/av;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/facebook/contacts/upload/c;->b:Lcom/facebook/fbservice/ops/k;

    .line 52
    iput-object p2, p0, Lcom/facebook/contacts/upload/c;->c:Landroid/support/v4/a/e;

    .line 53
    iput-object p3, p0, Lcom/facebook/contacts/upload/c;->d:Lcom/facebook/prefs/shared/d;

    .line 54
    iput-object p4, p0, Lcom/facebook/contacts/upload/c;->e:Lcom/facebook/analytics/av;

    .line 55
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/upload/c;Lcom/facebook/fbservice/ops/n;)Lcom/facebook/fbservice/ops/n;
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/facebook/contacts/upload/c;->i:Lcom/facebook/fbservice/ops/n;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/contacts/upload/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/contacts/upload/c;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V
    .locals 2

    .prologue
    .line 199
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 200
    const-string v1, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 201
    const-string v1, "state"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 204
    const-string v1, "progress_mode"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 206
    iget-object v1, p0, Lcom/facebook/contacts/upload/c;->c:Landroid/support/v4/a/e;

    invoke-virtual {v1, v0}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 207
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/upload/c;Lcom/facebook/contacts/upload/ContactsUploadState;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/facebook/contacts/upload/c;->b(Lcom/facebook/contacts/upload/ContactsUploadState;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/prefs/shared/ae;Z)V
    .locals 2

    .prologue
    .line 214
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/prefs/shared/ae;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 215
    if-ne p2, v0, :cond_0

    .line 226
    :goto_0
    monitor-exit p0

    return-void

    .line 219
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/contacts/upload/c;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 220
    if-eqz p2, :cond_1

    .line 221
    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 225
    :goto_1
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 214
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 223
    :cond_1
    :try_start_2
    invoke-interface {v0, p1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method private a(Lcom/facebook/contacts/upload/ContactsUploadState;)Z
    .locals 2

    .prologue
    .line 170
    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a()Lcom/facebook/contacts/upload/k;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/upload/k;->SUCCEEDED:Lcom/facebook/contacts/upload/k;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a()Lcom/facebook/contacts/upload/k;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/upload/k;->FAILED:Lcom/facebook/contacts/upload/k;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/facebook/prefs/shared/ae;)Z
    .locals 2

    .prologue
    .line 210
    iget-object v0, p0, Lcom/facebook/contacts/upload/c;->d:Lcom/facebook/prefs/shared/d;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/contacts/upload/c;)Lcom/facebook/analytics/av;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/contacts/upload/c;->e:Lcom/facebook/analytics/av;

    return-object v0
.end method

.method private b(Lcom/facebook/contacts/upload/ContactsUploadState;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 175
    monitor-enter p0

    .line 176
    :try_start_0
    iput-object p1, p0, Lcom/facebook/contacts/upload/c;->g:Lcom/facebook/contacts/upload/ContactsUploadState;

    .line 177
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    invoke-direct {p0, p1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    sget-object v0, Lcom/facebook/contacts/upload/a;->b:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0, v2}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/prefs/shared/ae;Z)V

    .line 181
    sget-object v3, Lcom/facebook/contacts/upload/a;->c:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a()Lcom/facebook/contacts/upload/k;

    move-result-object v0

    sget-object v4, Lcom/facebook/contacts/upload/k;->SUCCEEDED:Lcom/facebook/contacts/upload/k;

    if-ne v0, v4, :cond_1

    move v0, v1

    :goto_0
    invoke-direct {p0, v3, v0}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/prefs/shared/ae;Z)V

    .line 184
    sget-object v0, Lcom/facebook/contacts/upload/a;->d:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a()Lcom/facebook/contacts/upload/k;

    move-result-object v3

    sget-object v4, Lcom/facebook/contacts/upload/k;->FAILED:Lcom/facebook/contacts/upload/k;

    if-ne v3, v4, :cond_2

    :goto_1
    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/prefs/shared/ae;Z)V

    .line 188
    monitor-enter p0

    .line 189
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/facebook/contacts/upload/c;->h:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    .line 190
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 193
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/contacts/upload/c;->c()Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V

    .line 194
    return-void

    .line 177
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_1
    move v0, v2

    .line 181
    goto :goto_0

    :cond_2
    move v1, v2

    .line 184
    goto :goto_1

    .line 190
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method static synthetic f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/facebook/contacts/upload/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method private declared-synchronized g()V
    .locals 1

    .prologue
    .line 58
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/contacts/upload/c;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 72
    :goto_0
    monitor-exit p0

    return-void

    .line 62
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/facebook/contacts/upload/c;->f:Z

    .line 64
    sget-object v0, Lcom/facebook/contacts/upload/a;->d:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/facebook/contacts/upload/a;->b:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 68
    :cond_1
    invoke-static {}, Lcom/facebook/contacts/upload/ContactsUploadState;->g()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/upload/c;->b(Lcom/facebook/contacts/upload/ContactsUploadState;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 70
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Lcom/facebook/contacts/upload/c;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method private h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 254
    const-string v0, "contacts_upload"

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 4

    .prologue
    .line 157
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/contacts/upload/c;->g()V

    .line 159
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/upload/c;->h:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    .line 161
    invoke-virtual {p0}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    .line 162
    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 163
    :cond_0
    invoke-static {}, Lcom/facebook/contacts/upload/ContactsUploadState;->e()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/upload/c;->b(Lcom/facebook/contacts/upload/ContactsUploadState;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    :goto_0
    monitor-exit p0

    return-void

    .line 165
    :cond_1
    :try_start_1
    sget-object v1, Lcom/facebook/contacts/upload/c;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Ignoring reset state request (current state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 157
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V
    .locals 3

    .prologue
    .line 75
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    invoke-direct {p0}, Lcom/facebook/contacts/upload/c;->g()V

    .line 79
    invoke-virtual {p0}, Lcom/facebook/contacts/upload/c;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    sget-object v0, Lcom/facebook/contacts/upload/c;->a:Ljava/lang/String;

    const-string v1, "Already uploading, not uploading again"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/facebook/contacts/upload/c;->h:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    sget-object v1, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_DIVE_BAR_ONLY:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_THREAD_LIST_AND_DIVE_BAR:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    if-ne p1, v0, :cond_0

    .line 85
    sget-object v0, Lcom/facebook/contacts/upload/c;->a:Ljava/lang/String;

    const-string v1, "Upgrading progress mode to show both in thread list and in dive bar."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    iput-object p1, p0, Lcom/facebook/contacts/upload/c;->h:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    .line 87
    invoke-virtual {p0}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/contacts/upload/c;->c()Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 93
    :cond_1
    :try_start_1
    iput-object p1, p0, Lcom/facebook/contacts/upload/c;->h:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    .line 98
    sget-object v0, Lcom/facebook/contacts/upload/a;->b:Lcom/facebook/prefs/shared/ae;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/prefs/shared/ae;Z)V

    .line 100
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 101
    iget-object v1, p0, Lcom/facebook/contacts/upload/c;->b:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->m:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/upload/c;->i:Lcom/facebook/fbservice/ops/n;

    .line 103
    iget-object v0, p0, Lcom/facebook/contacts/upload/c;->i:Lcom/facebook/fbservice/ops/n;

    new-instance v1, Lcom/facebook/contacts/upload/d;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/upload/d;-><init>(Lcom/facebook/contacts/upload/c;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/n;->a(Lcom/facebook/fbservice/ops/l;)V

    .line 123
    iget-object v0, p0, Lcom/facebook/contacts/upload/c;->i:Lcom/facebook/fbservice/ops/n;

    new-instance v1, Lcom/facebook/contacts/upload/e;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/upload/e;-><init>(Lcom/facebook/contacts/upload/c;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 150
    iget-object v0, p0, Lcom/facebook/contacts/upload/c;->e:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "contacts_upload_started"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/contacts/upload/c;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 153
    invoke-static {}, Lcom/facebook/contacts/upload/ContactsUploadState;->f()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/upload/c;->b(Lcom/facebook/contacts/upload/ContactsUploadState;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 75
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()Lcom/facebook/contacts/upload/ContactsUploadState;
    .locals 1

    .prologue
    .line 229
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/contacts/upload/c;->g()V

    .line 230
    iget-object v0, p0, Lcom/facebook/contacts/upload/c;->g:Lcom/facebook/contacts/upload/ContactsUploadState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 229
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()Lcom/facebook/contacts/upload/ContactsUploadProgressMode;
    .locals 1

    .prologue
    .line 234
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/contacts/upload/c;->h:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 246
    sget-object v0, Lcom/facebook/contacts/upload/c;->a:Ljava/lang/String;

    const-string v1, "Clearing cached user data."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    invoke-virtual {p0}, Lcom/facebook/contacts/upload/c;->a()V

    .line 248
    sget-object v0, Lcom/facebook/contacts/upload/a;->b:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0, v2}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/prefs/shared/ae;Z)V

    .line 249
    sget-object v0, Lcom/facebook/contacts/upload/a;->c:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0, v2}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/prefs/shared/ae;Z)V

    .line 250
    sget-object v0, Lcom/facebook/contacts/upload/a;->d:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0, v2}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/prefs/shared/ae;Z)V

    .line 251
    return-void
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lcom/facebook/contacts/upload/c;->i:Lcom/facebook/fbservice/ops/n;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
