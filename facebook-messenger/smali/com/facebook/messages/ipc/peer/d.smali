.class public Lcom/facebook/messages/ipc/peer/d;
.super Ljava/lang/Object;
.source "MessageNotificationPeerContract.java"


# static fields
.field public static final a:Landroid/net/Uri;

.field public static final b:Landroid/net/Uri;

.field public static final c:Landroid/net/Uri;

.field public static final d:Landroid/net/Uri;

.field public static final e:Landroid/net/Uri;

.field public static final f:Landroid/net/Uri;

.field public static final g:Landroid/net/Uri;

.field public static final h:Landroid/net/Uri;

.field public static final i:Landroid/net/Uri;

.field public static final j:Landroid/net/Uri;

.field public static final k:Landroid/net/Uri;

.field public static final l:Landroid/net/Uri;

.field public static final m:Landroid/net/Uri;

.field public static final n:Landroid/net/Uri;

.field public static final o:Landroid/net/Uri;

.field public static final p:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 24
    const-string v0, "peer://msg_notification_dash"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->a:Landroid/net/Uri;

    .line 29
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->a:Landroid/net/Uri;

    const-string v1, "clear"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->b:Landroid/net/Uri;

    .line 39
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->a:Landroid/net/Uri;

    const-string v1, "clear_active_threads"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->c:Landroid/net/Uri;

    .line 47
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->a:Landroid/net/Uri;

    const-string v1, "is_user_active"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->d:Landroid/net/Uri;

    .line 65
    const-string v0, "peer://msg_notification_chathead"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    .line 70
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    const-string v1, "clear"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->f:Landroid/net/Uri;

    .line 81
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    const-string v1, "clear_active_threads"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->g:Landroid/net/Uri;

    .line 87
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    const-string v1, "open"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->h:Landroid/net/Uri;

    .line 92
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    const-string v1, "close_bauble_up"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->i:Landroid/net/Uri;

    .line 98
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    const-string v1, "hidden"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->j:Landroid/net/Uri;

    .line 103
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    const-string v1, "enabled"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->k:Landroid/net/Uri;

    .line 108
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    const-string v1, "disconnected"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->l:Landroid/net/Uri;

    .line 124
    const-string v0, "peer://msg_notification_user_interaction"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->m:Landroid/net/Uri;

    .line 130
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->m:Landroid/net/Uri;

    const-string v1, "is_user_in_app"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->n:Landroid/net/Uri;

    .line 138
    const-string v0, "peer://msg_notification_unread_count"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->o:Landroid/net/Uri;

    .line 143
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->o:Landroid/net/Uri;

    const-string v1, "clear_all"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/messages/ipc/peer/d;->p:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .prologue
    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "peer://msg_notification_dash/active_threads/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .prologue
    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "peer://msg_notification_chathead/active_threads/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .prologue
    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "peer://msg_notification_unread_count/thread/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .prologue
    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "peer://msg_notification_unread_count/clear_thread/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
