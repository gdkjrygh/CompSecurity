.class public Lcom/facebook/orca/sms/af;
.super Ljava/lang/Object;
.source "MmsSmsLogger.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/analytics/av;

.field private final b:Landroid/content/Context;

.field private final c:Landroid/content/pm/PackageManager;

.field private final d:Lcom/facebook/prefs/shared/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/analytics/av;Landroid/content/pm/PackageManager;Lcom/facebook/prefs/shared/d;)V
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/facebook/orca/sms/af;->b:Landroid/content/Context;

    .line 60
    iput-object p2, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    .line 61
    iput-object p3, p0, Lcom/facebook/orca/sms/af;->c:Landroid/content/pm/PackageManager;

    .line 62
    new-instance v0, Lcom/facebook/orca/sms/ag;

    invoke-direct {v0, p0}, Lcom/facebook/orca/sms/ag;-><init>(Lcom/facebook/orca/sms/af;)V

    iput-object v0, p0, Lcom/facebook/orca/sms/af;->d:Lcom/facebook/prefs/shared/f;

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->d:Lcom/facebook/prefs/shared/f;

    invoke-interface {p4, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 85
    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 5

    .prologue
    .line 228
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->c:Landroid/content/pm/PackageManager;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SENDTO"

    new-instance v3, Landroid/net/Uri$Builder;

    invoke-direct {v3}, Landroid/net/Uri$Builder;-><init>()V

    const-string v4, "smsto"

    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v2, 0x10000

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 234
    if-nez v0, :cond_0

    .line 235
    const/4 v0, 0x0

    .line 238
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "mms_received"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 164
    return-void
.end method

.method public a(I)V
    .locals 3

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_sent_not_in_app"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "num"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 178
    return-void
.end method

.method public a(IZ)V
    .locals 3

    .prologue
    .line 213
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_tcreate"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "num_users"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "success"

    invoke-virtual {v1, v2, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 217
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_send_timeout"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "thread_id"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 113
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_delivered"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "thread_id"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "resultCode"

    invoke-virtual {v1, v2, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 120
    return-void
.end method

.method public a(Ljava/lang/String;IILjava/lang/String;ZLjava/lang/String;)V
    .locals 3

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "mms_sent"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "thread_id"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "attachNum"

    invoke-virtual {v1, v2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "attachType"

    invoke-virtual {v1, v2, p4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "numUsers"

    invoke-virtual {v1, v2, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "success"

    invoke-virtual {v1, v2, p5}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "trigger"

    invoke-virtual {v1, v2, p6}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 146
    return-void
.end method

.method public a(Ljava/lang/String;IZLjava/lang/String;)V
    .locals 3

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "mms_sent"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "thread_id"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "numUsers"

    invoke-virtual {v1, v2, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "success"

    invoke-virtual {v1, v2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "trigger"

    invoke-virtual {v1, v2, p4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 129
    return-void
.end method

.method public a(Ljava/lang/String;JZ)V
    .locals 3

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "mms_received_downloaded"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "thread_id"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "message_id"

    invoke-virtual {v1, v2, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "success"

    invoke-virtual {v1, v2, p4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 172
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 149
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_received"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "thread_id"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "success"

    invoke-virtual {v1, v2, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 153
    return-void
.end method

.method public a(Ljava/lang/String;ZILjava/lang/String;)V
    .locals 3

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_sent"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "thread_id"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "success"

    invoke-virtual {v1, v2, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "resultCode"

    invoke-virtual {v1, v2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "trigger"

    invoke-virtual {v1, v2, p4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 107
    return-void
.end method

.method public a(Z)V
    .locals 3

    .prologue
    .line 256
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_enabled_during_nux"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "enabled"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 260
    return-void
.end method

.method public a(ZZZZ)V
    .locals 3

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_feature"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "beta_enabled"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "beta_enabled_set"

    invoke-virtual {v1, v2, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "alerts_enabled"

    invoke-virtual {v1, v2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "alerts_enabled_set"

    invoke-virtual {v1, v2, p4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 98
    return-void
.end method

.method public b()V
    .locals 5

    .prologue
    .line 220
    invoke-direct {p0}, Lcom/facebook/orca/sms/af;->e()Ljava/lang/String;

    move-result-object v0

    .line 221
    iget-object v1, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "sms_default_app"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "is_default"

    iget-object v4, p0, Lcom/facebook/orca/sms/af;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "has_default"

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 225
    return-void

    .line 221
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(I)V
    .locals 3

    .prologue
    .line 181
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "mms_sent_not_in_app"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "num"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 184
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_received_by_content_observer"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "thread_id"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 159
    return-void
.end method

.method public b(Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 199
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_tdelete"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "thread_id"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "success"

    invoke-virtual {v1, v2, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 203
    return-void
.end method

.method public b(ZZZZ)V
    .locals 3

    .prologue
    .line 246
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_nux_shown"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "is_upgrading_user"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "is_forced_on_user"

    invoke-virtual {v1, v2, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "is_ansible_user"

    invoke-virtual {v1, v2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "is_send_cliff_disabled"

    invoke-virtual {v1, v2, p4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 253
    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    .line 263
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_enabled_during_background_login"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 266
    return-void
.end method

.method public c(I)V
    .locals 3

    .prologue
    .line 187
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_received_not_in_app"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "num"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 190
    return-void
.end method

.method public c(Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 206
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_mdelete"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "message_id"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "success"

    invoke-virtual {v1, v2, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 210
    return-void
.end method

.method public d()V
    .locals 3

    .prologue
    .line 269
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "sms_learn_more_nux_shown"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 271
    return-void
.end method

.method public d(I)V
    .locals 3

    .prologue
    .line 193
    iget-object v0, p0, Lcom/facebook/orca/sms/af;->a:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "mms_received_not_in_app"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "num"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 196
    return-void
.end method
